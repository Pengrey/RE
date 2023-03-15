package p222lf;

import gf.Util;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: lf.c */
/* loaded from: classes2.dex */
public final class dates {

    /* renamed from: a */
    private static final C7050a f18711a = new C7050a();

    /* renamed from: b */
    private static final String[] f18712b;

    /* renamed from: c */
    private static final DateFormat[] f18713c;

    /* compiled from: dates.kt */
    /* renamed from: lf.c$a */
    /* loaded from: classes2.dex */
    public static final class C7050a extends ThreadLocal {
        C7050a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util.f15903e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f18712b = strArr;
        f18713c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m19474a(String str) {
        Intrinsics.isThisObjectNull(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f18711a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f18712b;
        synchronized (strArr) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                DateFormat[] dateFormatArr = f18713c;
                DateFormat dateFormat = dateFormatArr[i];
                SimpleDateFormat simpleDateFormat = dateFormat;
                if (dateFormat == null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(f18712b[i], Locale.US);
                    simpleDateFormat2.setTimeZone(Util.f15903e);
                    dateFormatArr[i] = simpleDateFormat2;
                    simpleDateFormat = simpleDateFormat2;
                }
                parsePosition.setIndex(0);
                Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
                i = i2;
            }
            C13195u c13195u = C13195u.f34156a;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m19473b(Date date) {
        Intrinsics.isThisObjectNull(date, "<this>");
        String format = ((DateFormat) f18711a.get()).format(date);
        Intrinsics.checkIfNull(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
