package org.joda.time.p282tz;

import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* renamed from: org.joda.time.tz.ZoneInfoCompiler */
/* loaded from: classes2.dex */
public class ZoneInfoCompiler {
    static Chronology cLenientISO;
    static DateTimeOfYear cStartOfYear;
    private Map<String, RuleSet> iRuleSets = new HashMap();
    private List<Zone> iZones = new ArrayList();
    private List<String> iGoodLinks = new ArrayList();
    private List<String> iBackLinks = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$RuleSet */
    /* loaded from: classes2.dex */
    public static class RuleSet {
        private List<Rule> iRules;

        RuleSet(Rule rule) {
            ArrayList arrayList = new ArrayList();
            this.iRules = arrayList;
            arrayList.add(rule);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i, String str) {
            int indexOf;
            int i2 = 0;
            for (int i3 = 0; i3 < this.iRules.size(); i3++) {
                int i4 = this.iRules.get(i3).iSaveMillis;
                if (i4 < 0) {
                    i2 = Math.min(i2, i4);
                }
            }
            if (i2 < 0) {
                System.out.println("Fixed negative save values for rule '" + this.iRules.get(0).iName + "'");
                i += i2;
                if (str.indexOf("/") > 0) {
                    str = str.substring(indexOf + 1) + "/" + str.substring(0, indexOf);
                }
            }
            dateTimeZoneBuilder.setStandardOffset(i);
            if (i2 < 0) {
                new Rule(this.iRules.get(0)).addRecurring(dateTimeZoneBuilder, i2, str);
            }
            for (int i5 = 0; i5 < this.iRules.size(); i5++) {
                this.iRules.get(i5).addRecurring(dateTimeZoneBuilder, i2, str);
            }
        }

        void addRule(Rule rule) {
            if (rule.iName.equals(this.iRules.get(0).iName)) {
                this.iRules.add(rule);
                return;
            }
            throw new IllegalArgumentException("Rule name mismatch");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$Zone */
    /* loaded from: classes2.dex */
    public static class Zone {
        public final String iFormat;
        public final String iName;
        private Zone iNext;
        public final int iOffsetMillis;
        public final String iRules;
        public final DateTimeOfYear iUntilDateTimeOfYear;
        public final int iUntilYear;

        Zone(StringTokenizer stringTokenizer) {
            this(stringTokenizer.nextToken(), stringTokenizer);
        }

        public void addToBuilder(DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            addToBuilder(this, dateTimeZoneBuilder, map);
        }

        void chain(StringTokenizer stringTokenizer) {
            Zone zone = this.iNext;
            if (zone != null) {
                zone.chain(stringTokenizer);
            } else {
                this.iNext = new Zone(this.iName, stringTokenizer);
            }
        }

        public String toString() {
            String str = "[Zone]\nName: " + this.iName + "\nOffsetMillis: " + this.iOffsetMillis + "\nRules: " + this.iRules + "\nFormat: " + this.iFormat + "\nUntilYear: " + this.iUntilYear + "\n" + this.iUntilDateTimeOfYear;
            if (this.iNext == null) {
                return str;
            }
            return str + "...\n" + this.iNext.toString();
        }

        private Zone(String str, StringTokenizer stringTokenizer) {
            int i;
            this.iName = str.intern();
            this.iOffsetMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
            this.iRules = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
            this.iFormat = stringTokenizer.nextToken().intern();
            DateTimeOfYear startOfYear = ZoneInfoCompiler.getStartOfYear();
            if (stringTokenizer.hasMoreTokens()) {
                i = Integer.parseInt(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    startOfYear = new DateTimeOfYear(stringTokenizer);
                }
            } else {
                i = Reader.READ_DONE;
            }
            this.iUntilYear = i;
            this.iUntilDateTimeOfYear = startOfYear;
        }

        private static void addToBuilder(Zone zone, DateTimeZoneBuilder dateTimeZoneBuilder, Map<String, RuleSet> map) {
            while (zone != null) {
                String str = zone.iRules;
                if (str == null) {
                    dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                    dateTimeZoneBuilder.setFixedSavings(zone.iFormat, 0);
                } else {
                    try {
                        int parseTime = ZoneInfoCompiler.parseTime(str);
                        dateTimeZoneBuilder.setStandardOffset(zone.iOffsetMillis);
                        dateTimeZoneBuilder.setFixedSavings(zone.iFormat, parseTime);
                    } catch (Exception unused) {
                        RuleSet ruleSet = map.get(zone.iRules);
                        if (ruleSet != null) {
                            ruleSet.addRecurring(dateTimeZoneBuilder, zone.iOffsetMillis, zone.iFormat);
                        } else {
                            throw new IllegalArgumentException("Rules not found: " + zone.iRules);
                        }
                    }
                }
                int i = zone.iUntilYear;
                if (i == Integer.MAX_VALUE) {
                    return;
                }
                zone.iUntilDateTimeOfYear.addCutover(dateTimeZoneBuilder, i);
                zone = zone.iNext;
            }
        }
    }

    static Chronology getLenientISOChronology() {
        if (cLenientISO == null) {
            cLenientISO = LenientChronology.getInstance(ISOChronology.getInstanceUTC());
        }
        return cLenientISO;
    }

    static DateTimeOfYear getStartOfYear() {
        if (cStartOfYear == null) {
            cStartOfYear = new DateTimeOfYear();
        }
        return cStartOfYear;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
        if ("-?".equals(r9[r3]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
        printUsage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void main(java.lang.String[] r9) throws java.lang.Exception {
        /*
            int r0 = r9.length
            if (r0 != 0) goto L7
            printUsage()
            return
        L7:
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
            r4 = r3
        Lc:
            int r5 = r9.length
            r6 = 1
            if (r3 >= r5) goto L57
            java.lang.String r5 = "-src"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L24
            java.io.File r0 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r0.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L24:
            java.lang.String r5 = "-dst"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L38
            java.io.File r2 = new java.io.File     // Catch: java.lang.IndexOutOfBoundsException -> L53
            int r3 = r3 + 1
            r5 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            r2.<init>(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            goto L43
        L38:
            java.lang.String r5 = "-verbose"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L45
            r4 = r6
        L43:
            int r3 = r3 + r6
            goto Lc
        L45:
            java.lang.String r5 = "-?"
            r7 = r9[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L53
            boolean r5 = r5.equals(r7)     // Catch: java.lang.IndexOutOfBoundsException -> L53
            if (r5 == 0) goto L57
            printUsage()     // Catch: java.lang.IndexOutOfBoundsException -> L53
            return
        L53:
            printUsage()
            return
        L57:
            int r5 = r9.length
            if (r3 < r5) goto L5e
            printUsage()
            return
        L5e:
            int r5 = r9.length
            int r5 = r5 - r3
            java.io.File[] r5 = new java.io.File[r5]
        L62:
            int r7 = r9.length
            if (r3 >= r7) goto L7a
            java.io.File r7 = new java.io.File
            if (r0 != 0) goto L6f
            r8 = r9[r3]
            r7.<init>(r8)
            goto L74
        L6f:
            r8 = r9[r3]
            r7.<init>(r0, r8)
        L74:
            r5[r1] = r7
            int r3 = r3 + 1
            int r1 = r1 + r6
            goto L62
        L7a:
            org.joda.time.p282tz.ZoneInfoLogger.set(r4)
            org.joda.time.tz.ZoneInfoCompiler r9 = new org.joda.time.tz.ZoneInfoCompiler
            r9.<init>()
            r9.compile(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p282tz.ZoneInfoCompiler.main(java.lang.String[]):void");
    }

    static int parseDayOfWeek(String str) {
        DateTimeField dayOfWeek = ISOChronology.getInstanceUTC().dayOfWeek();
        return dayOfWeek.get(dayOfWeek.set(0L, str, Locale.ENGLISH));
    }

    static int parseMonth(String str) {
        DateTimeField monthOfYear = ISOChronology.getInstanceUTC().monthOfYear();
        return monthOfYear.get(monthOfYear.set(0L, str, Locale.ENGLISH));
    }

    static String parseOptional(String str) {
        if (str.equals("-")) {
            return null;
        }
        return str;
    }

    static int parseTime(String str) {
        DateTimeFormatter hourMinuteSecondFraction = ISODateTimeFormat.hourMinuteSecondFraction();
        MutableDateTime mutableDateTime = new MutableDateTime(0L, getLenientISOChronology());
        boolean startsWith = str.startsWith("-");
        if (hourMinuteSecondFraction.parseInto(mutableDateTime, str, startsWith ? 1 : 0) != (~(startsWith ? 1 : 0))) {
            int millis = (int) mutableDateTime.getMillis();
            return startsWith ? -millis : millis;
        }
        throw new IllegalArgumentException(str);
    }

    static int parseYear(String str, int i) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.equals("minimum") || lowerCase.equals("min")) {
            return Integer.MIN_VALUE;
        }
        return (lowerCase.equals("maximum") || lowerCase.equals("max")) ? Reader.READ_DONE : lowerCase.equals("only") ? i : Integer.parseInt(lowerCase);
    }

    static char parseZoneChar(char c) {
        if (c != 'G') {
            if (c != 'S') {
                if (c != 'U' && c != 'Z' && c != 'g') {
                    if (c != 's') {
                        if (c != 'u' && c != 'z') {
                            return 'w';
                        }
                    }
                }
            }
            return 's';
        }
        return 'u';
    }

    private static void printUsage() {
        System.out.println("Usage: java org.joda.time.tz.ZoneInfoCompiler <options> <source files>");
        System.out.println("where possible options include:");
        System.out.println("  -src <directory>    Specify where to read source files");
        System.out.println("  -dst <directory>    Specify where to write generated files");
        System.out.println("  -verbose            Output verbosely (default false)");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e4, code lost:
        r5 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 2050);
        r3 = org.joda.time.chrono.ISOChronology.getInstanceUTC().year().set(0, 1850);
        r1 = r13.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0106, code lost:
        if (r1 < 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
        r8 = r17.previousTransition(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010e, code lost:
        if (r8 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0112, code lost:
        if (r8 >= r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0124, code lost:
        if ((((java.lang.Long) r13.get(r1)).longValue() - 1) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0126, code lost:
        java.lang.System.out.println("*r* Error in " + r17.getID() + " " + new org.joda.time.DateTime(r8, org.joda.time.chrono.ISOChronology.getInstanceUTC()) + " != " + new org.joda.time.DateTime(r5, org.joda.time.chrono.ISOChronology.getInstanceUTC()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0160, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0163, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static boolean test(java.lang.String r16, org.joda.time.DateTimeZone r17) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p282tz.ZoneInfoCompiler.test(java.lang.String, org.joda.time.DateTimeZone):boolean");
    }

    private void writeZone(File file, DateTimeZoneBuilder dateTimeZoneBuilder, DateTimeZone dateTimeZone) throws IOException {
        if (ZoneInfoLogger.verbose()) {
            PrintStream printStream = System.out;
            printStream.println("Writing " + dateTimeZone.getID());
        }
        File file2 = new File(file, dateTimeZone.getID());
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            dateTimeZoneBuilder.writeTo(dateTimeZone.getID(), fileOutputStream);
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream(file2);
            DateTimeZone readFrom = DateTimeZoneBuilder.readFrom(fileInputStream, dateTimeZone.getID());
            fileInputStream.close();
            if (dateTimeZone.equals(readFrom)) {
                return;
            }
            PrintStream printStream2 = System.out;
            printStream2.println("*e* Error in " + dateTimeZone.getID() + ": Didn't read properly from file");
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    static void writeZoneInfoMap(DataOutputStream dataOutputStream, Map<String, DateTimeZone> map) throws IOException {
        if (dataOutputStream != null) {
            HashMap hashMap = new HashMap(map.size());
            TreeMap treeMap = new TreeMap();
            short s = 0;
            for (Map.Entry<String, DateTimeZone> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!hashMap.containsKey(key)) {
                    Short valueOf = Short.valueOf(s);
                    hashMap.put(key, valueOf);
                    treeMap.put(valueOf, key);
                    s = (short) (s + 1);
                    if (s == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                }
                String id2 = entry.getValue().getID();
                if (!hashMap.containsKey(id2)) {
                    Short valueOf2 = Short.valueOf(s);
                    hashMap.put(id2, valueOf2);
                    treeMap.put(valueOf2, id2);
                    s = (short) (s + 1);
                    if (s == 0) {
                        throw new InternalError("Too many time zone ids");
                    }
                }
            }
            dataOutputStream.writeShort(treeMap.size());
            for (String str : treeMap.values()) {
                dataOutputStream.writeUTF(str);
            }
            dataOutputStream.writeShort(map.size());
            for (Map.Entry<String, DateTimeZone> entry2 : map.entrySet()) {
                dataOutputStream.writeShort(((Short) hashMap.get(entry2.getKey())).shortValue());
                dataOutputStream.writeShort(((Short) hashMap.get(entry2.getValue().getID())).shortValue());
            }
            return;
        }
        throw new IllegalArgumentException("DataOutputStream must not be null.");
    }

    public Map<String, DateTimeZone> compile(File file, File[] fileArr) throws IOException {
        BufferedReader bufferedReader;
        if (fileArr != null) {
            for (int i = 0; i < fileArr.length; i++) {
                BufferedReader bufferedReader2 = null;
                try {
                    bufferedReader = new BufferedReader(new FileReader(fileArr[i]));
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    parseDataFile(bufferedReader, "backward".equals(fileArr[i].getName()));
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    throw th;
                }
            }
        }
        if (file != null) {
            if (!file.exists() && !file.mkdirs()) {
                throw new IOException("Destination directory doesn't exist and cannot be created: " + file);
            } else if (!file.isDirectory()) {
                throw new IOException("Destination is not a directory: " + file);
            }
        }
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        System.out.println("Writing zoneinfo files");
        for (int i2 = 0; i2 < this.iZones.size(); i2++) {
            Zone zone = this.iZones.get(i2);
            DateTimeZoneBuilder dateTimeZoneBuilder = new DateTimeZoneBuilder();
            zone.addToBuilder(dateTimeZoneBuilder, this.iRuleSets);
            DateTimeZone dateTimeZone = dateTimeZoneBuilder.toDateTimeZone(zone.iName, true);
            if (test(dateTimeZone.getID(), dateTimeZone)) {
                treeMap.put(dateTimeZone.getID(), dateTimeZone);
                treeMap2.put(dateTimeZone.getID(), zone);
                if (file != null) {
                    writeZone(file, dateTimeZoneBuilder, dateTimeZone);
                }
            }
        }
        for (int i3 = 0; i3 < this.iGoodLinks.size(); i3 += 2) {
            String str = this.iGoodLinks.get(i3);
            String str2 = this.iGoodLinks.get(i3 + 1);
            Zone zone2 = (Zone) treeMap2.get(str);
            if (zone2 == null) {
                System.out.println("Cannot find source zone '" + str + "' to link alias '" + str2 + "' to");
            } else {
                DateTimeZoneBuilder dateTimeZoneBuilder2 = new DateTimeZoneBuilder();
                zone2.addToBuilder(dateTimeZoneBuilder2, this.iRuleSets);
                DateTimeZone dateTimeZone2 = dateTimeZoneBuilder2.toDateTimeZone(str2, true);
                if (test(dateTimeZone2.getID(), dateTimeZone2)) {
                    treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                    if (file != null) {
                        writeZone(file, dateTimeZoneBuilder2, dateTimeZone2);
                    }
                }
                treeMap.put(dateTimeZone2.getID(), dateTimeZone2);
                if (ZoneInfoLogger.verbose()) {
                    System.out.println("Good link: " + str2 + " -> " + str + " revived");
                }
            }
        }
        for (int i4 = 0; i4 < 2; i4++) {
            for (int i5 = 0; i5 < this.iBackLinks.size(); i5 += 2) {
                String str3 = this.iBackLinks.get(i5);
                String str4 = this.iBackLinks.get(i5 + 1);
                DateTimeZone dateTimeZone3 = (DateTimeZone) treeMap.get(str3);
                if (dateTimeZone3 != null) {
                    treeMap.put(str4, dateTimeZone3);
                    if (ZoneInfoLogger.verbose()) {
                        System.out.println("Back link: " + str4 + " -> " + dateTimeZone3.getID());
                    }
                } else if (i4 > 0) {
                    System.out.println("Cannot find time zone '" + str3 + "' to link alias '" + str4 + "' to");
                }
            }
        }
        if (file != null) {
            System.out.println("Writing ZoneInfoMap");
            File file2 = new File(file, "ZoneInfoMap");
            if (!file2.getParentFile().exists()) {
                file2.getParentFile().mkdirs();
            }
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file2));
            try {
                TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                treeMap3.putAll(treeMap);
                writeZoneInfoMap(dataOutputStream, treeMap3);
            } finally {
                dataOutputStream.close();
            }
        }
        return treeMap;
    }

    public void parseDataFile(BufferedReader bufferedReader, boolean z) throws IOException {
        while (true) {
            Zone zone = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    if (zone != null) {
                        this.iZones.add(zone);
                        return;
                    }
                    return;
                }
                String trim = readLine.trim();
                if (trim.length() != 0 && trim.charAt(0) != '#') {
                    int indexOf = readLine.indexOf(35);
                    if (indexOf >= 0) {
                        readLine = readLine.substring(0, indexOf);
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine, " \t");
                    if (!Character.isWhitespace(readLine.charAt(0)) || !stringTokenizer.hasMoreTokens()) {
                        if (zone != null) {
                            this.iZones.add(zone);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String nextToken = stringTokenizer.nextToken();
                            if (nextToken.equalsIgnoreCase("Rule")) {
                                Rule rule = new Rule(stringTokenizer);
                                RuleSet ruleSet = this.iRuleSets.get(rule.iName);
                                if (ruleSet == null) {
                                    this.iRuleSets.put(rule.iName, new RuleSet(rule));
                                } else {
                                    ruleSet.addRule(rule);
                                }
                            } else if (nextToken.equalsIgnoreCase("Zone")) {
                                if (stringTokenizer.countTokens() >= 4) {
                                    zone = new Zone(stringTokenizer);
                                } else {
                                    throw new IllegalArgumentException("Attempting to create a Zone from an incomplete tokenizer");
                                }
                            } else if (nextToken.equalsIgnoreCase("Link")) {
                                String nextToken2 = stringTokenizer.nextToken();
                                String nextToken3 = stringTokenizer.nextToken();
                                if (!z && !nextToken3.equals("US/Pacific-New") && !nextToken3.startsWith("Etc/") && !nextToken3.equals("GMT")) {
                                    this.iGoodLinks.add(nextToken2);
                                    this.iGoodLinks.add(nextToken3);
                                } else {
                                    this.iBackLinks.add(nextToken2);
                                    this.iBackLinks.add(nextToken3);
                                }
                            } else {
                                System.out.println("Unknown line: " + readLine);
                            }
                        }
                    } else if (zone != null) {
                        zone.chain(stringTokenizer);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$DateTimeOfYear */
    /* loaded from: classes2.dex */
    public static class DateTimeOfYear {
        public final boolean iAdvanceDayOfWeek;
        public final int iDayOfMonth;
        public final int iDayOfWeek;
        public final int iMillisOfDay;
        public final int iMonthOfYear;
        public final char iZoneChar;

        DateTimeOfYear() {
            this.iMonthOfYear = 1;
            this.iDayOfMonth = 1;
            this.iDayOfWeek = 0;
            this.iAdvanceDayOfWeek = false;
            this.iMillisOfDay = 0;
            this.iZoneChar = 'w';
        }

        public void addCutover(DateTimeZoneBuilder dateTimeZoneBuilder, int i) {
            dateTimeZoneBuilder.addCutover(i, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, String str, int i, int i2, int i3) {
            dateTimeZoneBuilder.addRecurringSavings(str, i, i2, i3, this.iZoneChar, this.iMonthOfYear, this.iDayOfMonth, this.iDayOfWeek, this.iAdvanceDayOfWeek, this.iMillisOfDay);
        }

        public String toString() {
            return "MonthOfYear: " + this.iMonthOfYear + "\nDayOfMonth: " + this.iDayOfMonth + "\nDayOfWeek: " + this.iDayOfWeek + "\nAdvanceDayOfWeek: " + this.iAdvanceDayOfWeek + "\nMillisOfDay: " + this.iMillisOfDay + "\nZoneChar: " + this.iZoneChar + "\n";
        }

        DateTimeOfYear(StringTokenizer stringTokenizer) {
            int i;
            boolean z;
            int i2;
            int parseDayOfWeek;
            LocalDate plusDays;
            int i3 = 0;
            int i4 = 1;
            char c = 'w';
            if (stringTokenizer.hasMoreTokens()) {
                int parseMonth = ZoneInfoCompiler.parseMonth(stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String nextToken = stringTokenizer.nextToken();
                    if (nextToken.startsWith("last")) {
                        z = false;
                        parseDayOfWeek = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(4));
                        i2 = -1;
                    } else {
                        try {
                            i2 = Integer.parseInt(nextToken);
                            parseDayOfWeek = 0;
                            z = false;
                        } catch (NumberFormatException unused) {
                            int indexOf = nextToken.indexOf(">=");
                            if (indexOf > 0) {
                                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 2));
                                parseDayOfWeek = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf));
                                i2 = parseInt;
                                z = true;
                            } else {
                                int indexOf2 = nextToken.indexOf("<=");
                                if (indexOf2 > 0) {
                                    int parseInt2 = Integer.parseInt(nextToken.substring(indexOf2 + 2));
                                    parseDayOfWeek = ZoneInfoCompiler.parseDayOfWeek(nextToken.substring(0, indexOf2));
                                    i2 = parseInt2;
                                    z = false;
                                } else {
                                    throw new IllegalArgumentException(nextToken);
                                }
                            }
                        }
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken2 = stringTokenizer.nextToken();
                        c = ZoneInfoCompiler.parseZoneChar(nextToken2.charAt(nextToken2.length() - 1));
                        if (!nextToken2.equals("24:00")) {
                            i3 = ZoneInfoCompiler.parseTime(nextToken2);
                        } else if (parseMonth == 12 && i2 == 31) {
                            i3 = ZoneInfoCompiler.parseTime("23:59:59.999");
                        } else {
                            if (i2 == -1) {
                                plusDays = new LocalDate(2001, parseMonth, 1).plusMonths(1);
                            } else {
                                plusDays = new LocalDate(2001, parseMonth, i2).plusDays(1);
                            }
                            boolean z2 = (i2 == -1 || parseDayOfWeek == 0) ? false : true;
                            int monthOfYear = plusDays.getMonthOfYear();
                            int dayOfMonth = plusDays.getDayOfMonth();
                            parseDayOfWeek = parseDayOfWeek != 0 ? (((parseDayOfWeek - 1) + 1) % 7) + 1 : parseDayOfWeek;
                            z = z2;
                            i4 = monthOfYear;
                            i2 = dayOfMonth;
                            i = i3;
                            i3 = parseDayOfWeek;
                        }
                    }
                    i4 = parseMonth;
                    i = i3;
                    i3 = parseDayOfWeek;
                } else {
                    i = 0;
                    z = false;
                    i2 = 1;
                    i4 = parseMonth;
                }
            } else {
                i = 0;
                z = false;
                i2 = 1;
            }
            this.iMonthOfYear = i4;
            this.iDayOfMonth = i2;
            this.iDayOfWeek = i3;
            this.iAdvanceDayOfWeek = z;
            this.iMillisOfDay = i;
            this.iZoneChar = c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.joda.time.tz.ZoneInfoCompiler$Rule */
    /* loaded from: classes2.dex */
    public static class Rule {
        public final DateTimeOfYear iDateTimeOfYear;
        public final int iFromYear;
        public final String iLetterS;
        public final String iName;
        public final int iSaveMillis;
        public final int iToYear;
        public final String iType;

        Rule(StringTokenizer stringTokenizer) {
            if (stringTokenizer.countTokens() >= 6) {
                this.iName = stringTokenizer.nextToken().intern();
                int parseYear = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), 0);
                this.iFromYear = parseYear;
                int parseYear2 = ZoneInfoCompiler.parseYear(stringTokenizer.nextToken(), parseYear);
                this.iToYear = parseYear2;
                if (parseYear2 >= parseYear) {
                    this.iType = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
                    this.iDateTimeOfYear = new DateTimeOfYear(stringTokenizer);
                    this.iSaveMillis = ZoneInfoCompiler.parseTime(stringTokenizer.nextToken());
                    this.iLetterS = ZoneInfoCompiler.parseOptional(stringTokenizer.nextToken());
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Attempting to create a Rule from an incomplete tokenizer");
        }

        private static String formatName(String str, int i, String str2) {
            String str3;
            int indexOf = str.indexOf(47);
            if (indexOf > 0) {
                if (i == 0) {
                    return str.substring(0, indexOf).intern();
                }
                return str.substring(indexOf + 1).intern();
            }
            int indexOf2 = str.indexOf("%s");
            if (indexOf2 < 0) {
                return str;
            }
            String substring = str.substring(0, indexOf2);
            String substring2 = str.substring(indexOf2 + 2);
            if (str2 == null) {
                str3 = substring.concat(substring2);
            } else {
                str3 = substring + str2 + substring2;
            }
            return str3.intern();
        }

        public void addRecurring(DateTimeZoneBuilder dateTimeZoneBuilder, int i, String str) {
            int i2 = this.iSaveMillis + (-i);
            this.iDateTimeOfYear.addRecurring(dateTimeZoneBuilder, formatName(str, i2, this.iLetterS), i2, this.iFromYear, this.iToYear);
        }

        public String toString() {
            return "[Rule]\nName: " + this.iName + "\nFromYear: " + this.iFromYear + "\nToYear: " + this.iToYear + "\nType: " + this.iType + "\n" + this.iDateTimeOfYear + "SaveMillis: " + this.iSaveMillis + "\nLetterS: " + this.iLetterS + "\n";
        }

        Rule(Rule rule) {
            this.iName = rule.iName;
            this.iFromYear = 1800;
            this.iToYear = rule.iFromYear;
            this.iType = null;
            this.iDateTimeOfYear = rule.iDateTimeOfYear;
            this.iSaveMillis = 0;
            this.iLetterS = rule.iLetterS;
        }
    }
}
