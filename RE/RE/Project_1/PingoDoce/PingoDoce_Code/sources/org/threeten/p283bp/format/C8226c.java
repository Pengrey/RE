package org.threeten.p283bp.format;

import androidx.constraintlayout.widget.C0868i;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.joda.time.DateTimeConstants;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8213d;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8282o;
import org.threeten.p283bp.DateTimeException;
import org.threeten.p283bp.chrono.AbstractC8176b;
import org.threeten.p283bp.chrono.AbstractC8188h;
import org.threeten.p283bp.format.C8256j;
import org.threeten.p283bp.temporal.C8290c;
import org.threeten.p283bp.temporal.C8305i;
import org.threeten.p283bp.temporal.C8315l;
import org.threeten.p283bp.temporal.C8316m;
import org.threeten.p283bp.temporal.EnumC8288a;
import org.threeten.p283bp.temporal.InterfaceC8299e;
import org.threeten.p283bp.temporal.InterfaceC8304h;
import org.threeten.p283bp.temporal.InterfaceC8313j;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.format.c */
/* loaded from: classes2.dex */
public final class C8226c {

    /* renamed from: h */
    private static final InterfaceC8313j<AbstractC8280n> f21401h = new C8227a();

    /* renamed from: i */
    private static final Map<Character, InterfaceC8304h> f21402i;

    /* renamed from: a */
    private C8226c f21403a;

    /* renamed from: b */
    private final C8226c f21404b;

    /* renamed from: c */
    private final List<InterfaceC8233g> f21405c;

    /* renamed from: d */
    private final boolean f21406d;

    /* renamed from: e */
    private int f21407e;

    /* renamed from: f */
    private char f21408f;

    /* renamed from: g */
    private int f21409g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$a */
    /* loaded from: classes2.dex */
    public class C8227a implements InterfaceC8313j<AbstractC8280n> {
        C8227a() {
        }

        @Override // org.threeten.p283bp.temporal.InterfaceC8313j
        /* renamed from: b */
        public AbstractC8280n mo16124b(InterfaceC8299e interfaceC8299e) {
            AbstractC8280n abstractC8280n = (AbstractC8280n) interfaceC8299e.query(C8305i.m15863g());
            if (abstractC8280n == null || (abstractC8280n instanceof C8282o)) {
                return null;
            }
            return abstractC8280n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$b */
    /* loaded from: classes2.dex */
    public class C8228b extends AbstractC8251f {

        /* renamed from: b */
        final /* synthetic */ C8256j.C8258b f21410b;

        C8228b(C8226c c8226c, C8256j.C8258b c8258b) {
            this.f21410b = c8258b;
        }

        @Override // org.threeten.p283bp.format.AbstractC8251f
        /* renamed from: c */
        public String mo16019c(InterfaceC8304h interfaceC8304h, long j, EnumC8259k enumC8259k, Locale locale) {
            return this.f21410b.m16009a(j, enumC8259k);
        }
    }

    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$c */
    /* loaded from: classes2.dex */
    class C8229c implements Comparator<String> {
        C8229c() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(String str, String str2) {
            return str.length() == str2.length() ? str.compareTo(str2) : str.length() - str2.length();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$d */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C8230d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21411a;

        static {
            int[] iArr = new int[EnumC8255i.values().length];
            f21411a = iArr;
            try {
                iArr[EnumC8255i.EXCEEDS_PAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21411a[EnumC8255i.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21411a[EnumC8255i.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21411a[EnumC8255i.NOT_NEGATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$e */
    /* loaded from: classes2.dex */
    public static final class C8231e implements InterfaceC8233g {

        /* renamed from: w */
        private final char f21412w;

        C8231e(char c) {
            this.f21412w = c;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            sb2.append(this.f21412w);
            return true;
        }

        public String toString() {
            if (this.f21412w == '\'') {
                return "''";
            }
            return "'" + this.f21412w + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$f */
    /* loaded from: classes2.dex */
    public static final class C8232f implements InterfaceC8233g {

        /* renamed from: w */
        private final InterfaceC8233g[] f21413w;

        /* renamed from: x */
        private final boolean f21414x;

        C8232f(List<InterfaceC8233g> list, boolean z) {
            this((InterfaceC8233g[]) list.toArray(new InterfaceC8233g[list.size()]), z);
        }

        /* renamed from: a */
        public C8232f m16045a(boolean z) {
            return z == this.f21414x ? this : new C8232f(this.f21413w, z);
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f21414x) {
                c8249e.m16028h();
            }
            try {
                for (InterfaceC8233g interfaceC8233g : this.f21413w) {
                    if (!interfaceC8233g.print(c8249e, sb2)) {
                        sb2.setLength(length);
                        return true;
                    }
                }
                if (this.f21414x) {
                    c8249e.m16034b();
                }
                return true;
            } finally {
                if (this.f21414x) {
                    c8249e.m16034b();
                }
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f21413w != null) {
                sb2.append(this.f21414x ? "[" : "(");
                for (InterfaceC8233g interfaceC8233g : this.f21413w) {
                    sb2.append(interfaceC8233g);
                }
                sb2.append(this.f21414x ? "]" : ")");
            }
            return sb2.toString();
        }

        C8232f(InterfaceC8233g[] interfaceC8233gArr, boolean z) {
            this.f21413w = interfaceC8233gArr;
            this.f21414x = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$g */
    /* loaded from: classes2.dex */
    public interface InterfaceC8233g {
        boolean print(C8249e c8249e, StringBuilder sb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$h */
    /* loaded from: classes2.dex */
    public static final class C8234h implements InterfaceC8233g {

        /* renamed from: w */
        private final InterfaceC8304h f21415w;

        /* renamed from: x */
        private final int f21416x;

        /* renamed from: y */
        private final int f21417y;

        /* renamed from: z */
        private final boolean f21418z;

        C8234h(InterfaceC8304h interfaceC8304h, int i, int i2, boolean z) {
            C11251d.m5623i(interfaceC8304h, "field");
            if (!interfaceC8304h.range().m15850e()) {
                throw new IllegalArgumentException("Field must have a fixed set of values: " + interfaceC8304h);
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
            } else if (i2 >= i) {
                this.f21415w = interfaceC8304h;
                this.f21416x = i;
                this.f21417y = i2;
                this.f21418z = z;
            } else {
                throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
            }
        }

        /* renamed from: a */
        private BigDecimal m16044a(long j) {
            C8315l range = this.f21415w.range();
            range.m15853b(j, this.f21415w);
            BigDecimal valueOf = BigDecimal.valueOf(range.m15851d());
            BigDecimal divide = BigDecimal.valueOf(j).subtract(valueOf).divide(BigDecimal.valueOf(range.m15852c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            return divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(this.f21415w);
            if (m16030f == null) {
                return false;
            }
            C8253g m16032d = c8249e.m16032d();
            BigDecimal m16044a = m16044a(m16030f.longValue());
            if (m16044a.scale() == 0) {
                if (this.f21416x > 0) {
                    if (this.f21418z) {
                        sb2.append(m16032d.m16023b());
                    }
                    for (int i = 0; i < this.f21416x; i++) {
                        sb2.append(m16032d.m16020e());
                    }
                    return true;
                }
                return true;
            }
            String m16024a = m16032d.m16024a(m16044a.setScale(Math.min(Math.max(m16044a.scale(), this.f21416x), this.f21417y), RoundingMode.FLOOR).toPlainString().substring(2));
            if (this.f21418z) {
                sb2.append(m16032d.m16023b());
            }
            sb2.append(m16024a);
            return true;
        }

        public String toString() {
            String str = this.f21418z ? ",DecimalPoint" : BuildConfig.VERSION_NAME;
            return "Fraction(" + this.f21415w + "," + this.f21416x + "," + this.f21417y + str + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$i */
    /* loaded from: classes2.dex */
    public static final class C8235i implements InterfaceC8233g {

        /* renamed from: w */
        private final int f21419w;

        C8235i(int i) {
            this.f21419w = i;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(EnumC8288a.INSTANT_SECONDS);
            Long l = 0L;
            InterfaceC8299e m16031e = c8249e.m16031e();
            EnumC8288a enumC8288a = EnumC8288a.NANO_OF_SECOND;
            if (m16031e.isSupported(enumC8288a)) {
                l = Long.valueOf(c8249e.m16031e().getLong(enumC8288a));
            }
            int i = 0;
            if (m16030f == null) {
                return false;
            }
            long longValue = m16030f.longValue();
            int checkValidIntValue = enumC8288a.checkValidIntValue(l.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long m5627e = 1 + C11251d.m5627e(j, 315569520000L);
                C8216e m16150J = C8216e.m16150J(C11251d.m5624h(j, 315569520000L) - 62167219200L, 0, C8282o.f21486B);
                if (m5627e > 0) {
                    sb2.append('+');
                    sb2.append(m5627e);
                }
                sb2.append(m16150J);
                if (m16150J.m16156C() == 0) {
                    sb2.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                C8216e m16150J2 = C8216e.m16150J(j4 - 62167219200L, 0, C8282o.f21486B);
                int length = sb2.length();
                sb2.append(m16150J2);
                if (m16150J2.m16156C() == 0) {
                    sb2.append(":00");
                }
                if (j3 < 0) {
                    if (m16150J2.getYear() == -10000) {
                        sb2.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb2.insert(length, j3);
                    } else {
                        sb2.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            int i2 = this.f21419w;
            if (i2 == -2) {
                if (checkValidIntValue != 0) {
                    sb2.append('.');
                    if (checkValidIntValue % 1000000 == 0) {
                        sb2.append(Integer.toString((checkValidIntValue / 1000000) + DateTimeConstants.MILLIS_PER_SECOND).substring(1));
                    } else if (checkValidIntValue % DateTimeConstants.MILLIS_PER_SECOND == 0) {
                        sb2.append(Integer.toString((checkValidIntValue / DateTimeConstants.MILLIS_PER_SECOND) + 1000000).substring(1));
                    } else {
                        sb2.append(Integer.toString(checkValidIntValue + 1000000000).substring(1));
                    }
                }
            } else if (i2 > 0 || (i2 == -1 && checkValidIntValue > 0)) {
                sb2.append('.');
                int i3 = 100000000;
                while (true) {
                    int i4 = this.f21419w;
                    if ((i4 != -1 || checkValidIntValue <= 0) && i >= i4) {
                        break;
                    }
                    int i5 = checkValidIntValue / i3;
                    sb2.append((char) (i5 + 48));
                    checkValidIntValue -= i5 * i3;
                    i3 /= 10;
                    i++;
                }
            }
            sb2.append('Z');
            return true;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$j */
    /* loaded from: classes2.dex */
    public static final class C8236j implements InterfaceC8233g {

        /* renamed from: w */
        private final EnumC8259k f21420w;

        public C8236j(EnumC8259k enumC8259k) {
            this.f21420w = enumC8259k;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(EnumC8288a.OFFSET_SECONDS);
            if (m16030f == null) {
                return false;
            }
            sb2.append("GMT");
            if (this.f21420w == EnumC8259k.FULL) {
                return new C8238l(BuildConfig.VERSION_NAME, "+HH:MM:ss").print(c8249e, sb2);
            }
            int m5616p = C11251d.m5616p(m16030f.longValue());
            if (m5616p != 0) {
                int abs = Math.abs((m5616p / DateTimeConstants.SECONDS_PER_HOUR) % 100);
                int abs2 = Math.abs((m5616p / 60) % 60);
                int abs3 = Math.abs(m5616p % 60);
                sb2.append(m5616p < 0 ? "-" : "+");
                sb2.append(abs);
                if (abs2 > 0 || abs3 > 0) {
                    sb2.append(":");
                    sb2.append((char) ((abs2 / 10) + 48));
                    sb2.append((char) ((abs2 % 10) + 48));
                    if (abs3 > 0) {
                        sb2.append(":");
                        sb2.append((char) ((abs3 / 10) + 48));
                        sb2.append((char) ((abs3 % 10) + 48));
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$k */
    /* loaded from: classes2.dex */
    public static class C8237k implements InterfaceC8233g {

        /* renamed from: B */
        static final int[] f21421B = {0, 10, 100, DateTimeConstants.MILLIS_PER_SECOND, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        /* renamed from: A */
        final int f21422A;

        /* renamed from: w */
        final InterfaceC8304h f21423w;

        /* renamed from: x */
        final int f21424x;

        /* renamed from: y */
        final int f21425y;

        /* renamed from: z */
        final EnumC8255i f21426z;

        /* synthetic */ C8237k(InterfaceC8304h interfaceC8304h, int i, int i2, EnumC8255i enumC8255i, int i3, C8227a c8227a) {
            this(interfaceC8304h, i, i2, enumC8255i, i3);
        }

        /* renamed from: a */
        long mo16042a(C8249e c8249e, long j) {
            return j;
        }

        /* renamed from: b */
        C8237k mo16041b() {
            return this.f21422A == -1 ? this : new C8237k(this.f21423w, this.f21424x, this.f21425y, this.f21426z, -1);
        }

        /* renamed from: c */
        C8237k mo16040c(int i) {
            return new C8237k(this.f21423w, this.f21424x, this.f21425y, this.f21426z, this.f21422A + i);
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(this.f21423w);
            if (m16030f == null) {
                return false;
            }
            long mo16042a = mo16042a(c8249e, m16030f.longValue());
            C8253g m16032d = c8249e.m16032d();
            String l = mo16042a == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(mo16042a));
            if (l.length() <= this.f21425y) {
                String m16024a = m16032d.m16024a(l);
                if (mo16042a >= 0) {
                    int i = C8230d.f21411a[this.f21426z.ordinal()];
                    if (i == 1) {
                        int i2 = this.f21424x;
                        if (i2 < 19 && mo16042a >= f21421B[i2]) {
                            sb2.append(m16032d.m16021d());
                        }
                    } else if (i == 2) {
                        sb2.append(m16032d.m16021d());
                    }
                } else {
                    int i3 = C8230d.f21411a[this.f21426z.ordinal()];
                    if (i3 == 1 || i3 == 2 || i3 == 3) {
                        sb2.append(m16032d.m16022c());
                    } else if (i3 == 4) {
                        throw new DateTimeException("Field " + this.f21423w + " cannot be printed as the value " + mo16042a + " cannot be negative according to the SignStyle");
                    }
                }
                for (int i4 = 0; i4 < this.f21424x - m16024a.length(); i4++) {
                    sb2.append(m16032d.m16020e());
                }
                sb2.append(m16024a);
                return true;
            }
            throw new DateTimeException("Field " + this.f21423w + " cannot be printed as the value " + mo16042a + " exceeds the maximum print width of " + this.f21425y);
        }

        public String toString() {
            int i = this.f21424x;
            if (i == 1 && this.f21425y == 19 && this.f21426z == EnumC8255i.NORMAL) {
                return "Value(" + this.f21423w + ")";
            } else if (i == this.f21425y && this.f21426z == EnumC8255i.NOT_NEGATIVE) {
                return "Value(" + this.f21423w + "," + this.f21424x + ")";
            } else {
                return "Value(" + this.f21423w + "," + this.f21424x + "," + this.f21425y + "," + this.f21426z + ")";
            }
        }

        C8237k(InterfaceC8304h interfaceC8304h, int i, int i2, EnumC8255i enumC8255i) {
            this.f21423w = interfaceC8304h;
            this.f21424x = i;
            this.f21425y = i2;
            this.f21426z = enumC8255i;
            this.f21422A = 0;
        }

        private C8237k(InterfaceC8304h interfaceC8304h, int i, int i2, EnumC8255i enumC8255i, int i3) {
            this.f21423w = interfaceC8304h;
            this.f21424x = i;
            this.f21425y = i2;
            this.f21426z = enumC8255i;
            this.f21422A = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$l */
    /* loaded from: classes2.dex */
    public static final class C8238l implements InterfaceC8233g {

        /* renamed from: y */
        static final String[] f21427y = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

        /* renamed from: z */
        static final C8238l f21428z = new C8238l("Z", "+HH:MM:ss");

        /* renamed from: w */
        private final String f21429w;

        /* renamed from: x */
        private final int f21430x;

        static {
            new C8238l("0", "+HH:MM:ss");
        }

        C8238l(String str, String str2) {
            C11251d.m5623i(str, "noOffsetText");
            C11251d.m5623i(str2, "pattern");
            this.f21429w = str;
            this.f21430x = m16043a(str2);
        }

        /* renamed from: a */
        private int m16043a(String str) {
            int i = 0;
            while (true) {
                String[] strArr = f21427y;
                if (i < strArr.length) {
                    if (strArr[i].equals(str)) {
                        return i;
                    }
                    i++;
                } else {
                    throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
                }
            }
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(EnumC8288a.OFFSET_SECONDS);
            if (m16030f == null) {
                return false;
            }
            int m5616p = C11251d.m5616p(m16030f.longValue());
            if (m5616p == 0) {
                sb2.append(this.f21429w);
            } else {
                int abs = Math.abs((m5616p / DateTimeConstants.SECONDS_PER_HOUR) % 100);
                int abs2 = Math.abs((m5616p / 60) % 60);
                int abs3 = Math.abs(m5616p % 60);
                int length = sb2.length();
                sb2.append(m5616p < 0 ? "-" : "+");
                sb2.append((char) ((abs / 10) + 48));
                sb2.append((char) ((abs % 10) + 48));
                int i = this.f21430x;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    sb2.append(i % 2 == 0 ? ":" : BuildConfig.VERSION_NAME);
                    sb2.append((char) ((abs2 / 10) + 48));
                    sb2.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.f21430x;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        sb2.append(i2 % 2 != 0 ? BuildConfig.VERSION_NAME : ":");
                        sb2.append((char) ((abs3 / 10) + 48));
                        sb2.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb2.setLength(length);
                    sb2.append(this.f21429w);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.f21429w.replace("'", "''");
            return "Offset(" + f21427y[this.f21430x] + ",'" + replace + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$m */
    /* loaded from: classes2.dex */
    public static final class C8239m implements InterfaceC8233g {

        /* renamed from: w */
        private final InterfaceC8233g f21431w;

        /* renamed from: x */
        private final int f21432x;

        /* renamed from: y */
        private final char f21433y;

        C8239m(InterfaceC8233g interfaceC8233g, int i, char c) {
            this.f21431w = interfaceC8233g;
            this.f21432x = i;
            this.f21433y = c;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            int length = sb2.length();
            if (this.f21431w.print(c8249e, sb2)) {
                int length2 = sb2.length() - length;
                if (length2 <= this.f21432x) {
                    for (int i = 0; i < this.f21432x - length2; i++) {
                        sb2.insert(length, this.f21433y);
                    }
                    return true;
                }
                throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f21432x);
            }
            return false;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pad(");
            sb2.append(this.f21431w);
            sb2.append(",");
            sb2.append(this.f21432x);
            if (this.f21433y == ' ') {
                str = ")";
            } else {
                str = ",'" + this.f21433y + "')";
            }
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$o */
    /* loaded from: classes2.dex */
    public enum EnumC8241o implements InterfaceC8233g {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        public int parse(C8248d c8248d, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            return i;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            int ordinal = ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            return "ParseStrict(false)";
                        }
                        throw new IllegalStateException("Unreachable");
                    }
                    return "ParseStrict(true)";
                }
                return "ParseCaseSensitive(false)";
            }
            return "ParseCaseSensitive(true)";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$p */
    /* loaded from: classes2.dex */
    public static final class C8242p implements InterfaceC8233g {

        /* renamed from: w */
        private final String f21437w;

        C8242p(String str) {
            this.f21437w = str;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            sb2.append(this.f21437w);
            return true;
        }

        public String toString() {
            String replace = this.f21437w.replace("'", "''");
            return "'" + replace + "'";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$q */
    /* loaded from: classes2.dex */
    public static final class C8243q implements InterfaceC8233g {

        /* renamed from: w */
        private final InterfaceC8304h f21438w;

        /* renamed from: x */
        private final EnumC8259k f21439x;

        /* renamed from: y */
        private final AbstractC8251f f21440y;

        /* renamed from: z */
        private volatile C8237k f21441z;

        C8243q(InterfaceC8304h interfaceC8304h, EnumC8259k enumC8259k, AbstractC8251f abstractC8251f) {
            this.f21438w = interfaceC8304h;
            this.f21439x = enumC8259k;
            this.f21440y = abstractC8251f;
        }

        /* renamed from: a */
        private C8237k m16038a() {
            if (this.f21441z == null) {
                this.f21441z = new C8237k(this.f21438w, 1, 19, EnumC8255i.NORMAL);
            }
            return this.f21441z;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            Long m16030f = c8249e.m16030f(this.f21438w);
            if (m16030f == null) {
                return false;
            }
            String mo16019c = this.f21440y.mo16019c(this.f21438w, m16030f.longValue(), this.f21439x, c8249e.m16033c());
            if (mo16019c == null) {
                return m16038a().print(c8249e, sb2);
            }
            sb2.append(mo16019c);
            return true;
        }

        public String toString() {
            if (this.f21439x == EnumC8259k.FULL) {
                return "Text(" + this.f21438w + ")";
            }
            return "Text(" + this.f21438w + "," + this.f21439x + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$r */
    /* loaded from: classes2.dex */
    public static final class C8244r implements InterfaceC8233g {

        /* renamed from: w */
        private final char f21442w;

        /* renamed from: x */
        private final int f21443x;

        public C8244r(char c, int i) {
            this.f21442w = c;
            this.f21443x = i;
        }

        /* renamed from: a */
        private InterfaceC8233g m16037a(C8316m c8316m) {
            char c = this.f21442w;
            if (c != 'W') {
                if (c == 'Y') {
                    if (this.f21443x == 2) {
                        return new C8240n(c8316m.m15837g(), 2, 2, 0, C8240n.f21434E);
                    }
                    InterfaceC8304h m15837g = c8316m.m15837g();
                    int i = this.f21443x;
                    return new C8237k(m15837g, i, 19, i < 4 ? EnumC8255i.NORMAL : EnumC8255i.EXCEEDS_PAD, -1, null);
                } else if (c != 'c') {
                    if (c != 'e') {
                        if (c != 'w') {
                            return null;
                        }
                        return new C8237k(c8316m.m15835i(), this.f21443x, 2, EnumC8255i.NOT_NEGATIVE);
                    }
                    return new C8237k(c8316m.m15842b(), this.f21443x, 2, EnumC8255i.NOT_NEGATIVE);
                } else {
                    return new C8237k(c8316m.m15842b(), this.f21443x, 2, EnumC8255i.NOT_NEGATIVE);
                }
            }
            return new C8237k(c8316m.m15836h(), 1, 2, EnumC8255i.NOT_NEGATIVE);
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            return m16037a(C8316m.m15839e(c8249e.m16033c())).print(c8249e, sb2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Localized(");
            char c = this.f21442w;
            if (c == 'Y') {
                int i = this.f21443x;
                if (i == 1) {
                    sb2.append("WeekBasedYear");
                } else if (i == 2) {
                    sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    sb2.append("WeekBasedYear,");
                    sb2.append(this.f21443x);
                    sb2.append(",");
                    sb2.append(19);
                    sb2.append(",");
                    sb2.append(this.f21443x < 4 ? EnumC8255i.NORMAL : EnumC8255i.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    sb2.append("DayOfWeek");
                } else if (c == 'w') {
                    sb2.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    sb2.append("WeekOfMonth");
                }
                sb2.append(",");
                sb2.append(this.f21443x);
            }
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$s */
    /* loaded from: classes2.dex */
    public static final class C8245s implements InterfaceC8233g {

        /* renamed from: w */
        private final InterfaceC8313j<AbstractC8280n> f21444w;

        /* renamed from: x */
        private final String f21445x;

        C8245s(InterfaceC8313j<AbstractC8280n> interfaceC8313j, String str) {
            this.f21444w = interfaceC8313j;
            this.f21445x = str;
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            AbstractC8280n abstractC8280n = (AbstractC8280n) c8249e.m16029g(this.f21444w);
            if (abstractC8280n == null) {
                return false;
            }
            sb2.append(abstractC8280n.mo15915h());
            return true;
        }

        public String toString() {
            return this.f21445x;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$t */
    /* loaded from: classes2.dex */
    public static final class C8246t implements InterfaceC8233g {

        /* renamed from: w */
        private final EnumC8259k f21446w;

        /* compiled from: DateTimeFormatterBuilder.java */
        /* renamed from: org.threeten.bp.format.c$t$a */
        /* loaded from: classes2.dex */
        class C8247a implements Comparator<String> {
            C8247a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(String str, String str2) {
                int length = str2.length() - str.length();
                return length == 0 ? str.compareTo(str2) : length;
            }
        }

        static {
            new C8247a();
        }

        C8246t(EnumC8259k enumC8259k) {
            this.f21446w = (EnumC8259k) C11251d.m5623i(enumC8259k, "textStyle");
        }

        @Override // org.threeten.p283bp.format.C8226c.InterfaceC8233g
        public boolean print(C8249e c8249e, StringBuilder sb2) {
            AbstractC8280n abstractC8280n = (AbstractC8280n) c8249e.m16029g(C8305i.m15863g());
            if (abstractC8280n == null) {
                return false;
            }
            if (abstractC8280n.m15933j() instanceof C8282o) {
                sb2.append(abstractC8280n.mo15915h());
                return true;
            }
            InterfaceC8299e m16031e = c8249e.m16031e();
            EnumC8288a enumC8288a = EnumC8288a.INSTANT_SECONDS;
            sb2.append(TimeZone.getTimeZone(abstractC8280n.mo15915h()).getDisplayName(m16031e.isSupported(enumC8288a) ? abstractC8280n.mo15914i().mo15781d(C8171c.m16386p(m16031e.getLong(enumC8288a))) : false, this.f21446w.asNormal() == EnumC8259k.FULL ? 1 : 0, c8249e.m16033c()));
            return true;
        }

        public String toString() {
            return "ZoneText(" + this.f21446w + ")";
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f21402i = hashMap;
        hashMap.put('G', EnumC8288a.ERA);
        hashMap.put('y', EnumC8288a.YEAR_OF_ERA);
        hashMap.put('u', EnumC8288a.YEAR);
        InterfaceC8304h interfaceC8304h = C8290c.f21499a;
        hashMap.put('Q', interfaceC8304h);
        hashMap.put('q', interfaceC8304h);
        EnumC8288a enumC8288a = EnumC8288a.MONTH_OF_YEAR;
        hashMap.put('M', enumC8288a);
        hashMap.put('L', enumC8288a);
        hashMap.put('D', EnumC8288a.DAY_OF_YEAR);
        hashMap.put('d', EnumC8288a.DAY_OF_MONTH);
        hashMap.put('F', EnumC8288a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC8288a enumC8288a2 = EnumC8288a.DAY_OF_WEEK;
        hashMap.put('E', enumC8288a2);
        hashMap.put('c', enumC8288a2);
        hashMap.put('e', enumC8288a2);
        hashMap.put('a', EnumC8288a.AMPM_OF_DAY);
        hashMap.put('H', EnumC8288a.HOUR_OF_DAY);
        hashMap.put('k', EnumC8288a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', EnumC8288a.HOUR_OF_AMPM);
        hashMap.put('h', EnumC8288a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', EnumC8288a.MINUTE_OF_HOUR);
        hashMap.put('s', EnumC8288a.SECOND_OF_MINUTE);
        EnumC8288a enumC8288a3 = EnumC8288a.NANO_OF_SECOND;
        hashMap.put('S', enumC8288a3);
        hashMap.put('A', EnumC8288a.MILLI_OF_DAY);
        hashMap.put('n', enumC8288a3);
        hashMap.put('N', EnumC8288a.NANO_OF_DAY);
        new C8229c();
    }

    public C8226c() {
        this.f21403a = this;
        this.f21405c = new ArrayList();
        this.f21409g = -1;
        this.f21404b = null;
        this.f21406d = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: A */
    private void m16079A(char c, int i, InterfaceC8304h interfaceC8304h) {
        if (c != 'Q') {
            if (c == 'S') {
                m16072b(EnumC8288a.NANO_OF_SECOND, i, i, false);
                return;
            } else if (c == 'a') {
                if (i == 1) {
                    m16062l(interfaceC8304h, EnumC8259k.SHORT);
                    return;
                }
                throw new IllegalArgumentException("Too many pattern letters: " + c);
            } else {
                if (c != 'h' && c != 'k' && c != 'm') {
                    if (c != 'q') {
                        if (c != 's') {
                            if (c == 'u' || c == 'y') {
                                if (i == 2) {
                                    m16057q(interfaceC8304h, 2, 2, C8240n.f21434E);
                                    return;
                                } else if (i < 4) {
                                    m16058p(interfaceC8304h, i, 19, EnumC8255i.NORMAL);
                                    return;
                                } else {
                                    m16058p(interfaceC8304h, i, 19, EnumC8255i.EXCEEDS_PAD);
                                    return;
                                }
                            }
                            switch (c) {
                                case 'D':
                                    if (i == 1) {
                                        m16060n(interfaceC8304h);
                                        return;
                                    } else if (i <= 3) {
                                        m16059o(interfaceC8304h, i);
                                        return;
                                    } else {
                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                    }
                                case 'E':
                                case 'G':
                                    if (i == 1 || i == 2 || i == 3) {
                                        m16062l(interfaceC8304h, EnumC8259k.SHORT);
                                        return;
                                    } else if (i == 4) {
                                        m16062l(interfaceC8304h, EnumC8259k.FULL);
                                        return;
                                    } else if (i == 5) {
                                        m16062l(interfaceC8304h, EnumC8259k.NARROW);
                                        return;
                                    } else {
                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                    }
                                case 'F':
                                    if (i == 1) {
                                        m16060n(interfaceC8304h);
                                        return;
                                    }
                                    throw new IllegalArgumentException("Too many pattern letters: " + c);
                                case 'H':
                                    break;
                                default:
                                    switch (c) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            break;
                                        case 'M':
                                            break;
                                        default:
                                            switch (c) {
                                                case C0868i.f2998z0 /* 99 */:
                                                    if (i == 1) {
                                                        m16070d(new C8244r('c', i));
                                                        return;
                                                    } else if (i == 2) {
                                                        throw new IllegalArgumentException("Invalid number of pattern letters: " + c);
                                                    } else if (i == 3) {
                                                        m16062l(interfaceC8304h, EnumC8259k.SHORT_STANDALONE);
                                                        return;
                                                    } else if (i == 4) {
                                                        m16062l(interfaceC8304h, EnumC8259k.FULL_STANDALONE);
                                                        return;
                                                    } else if (i == 5) {
                                                        m16062l(interfaceC8304h, EnumC8259k.NARROW_STANDALONE);
                                                        return;
                                                    } else {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                                    }
                                                case C0868i.f2738A0 /* 100 */:
                                                    break;
                                                case C0868i.f2743B0 /* 101 */:
                                                    if (i == 1 || i == 2) {
                                                        m16070d(new C8244r('e', i));
                                                        return;
                                                    } else if (i == 3) {
                                                        m16062l(interfaceC8304h, EnumC8259k.SHORT);
                                                        return;
                                                    } else if (i == 4) {
                                                        m16062l(interfaceC8304h, EnumC8259k.FULL);
                                                        return;
                                                    } else if (i == 5) {
                                                        m16062l(interfaceC8304h, EnumC8259k.NARROW);
                                                        return;
                                                    } else {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                                                    }
                                                default:
                                                    if (i == 1) {
                                                        m16060n(interfaceC8304h);
                                                        return;
                                                    } else {
                                                        m16059o(interfaceC8304h, i);
                                                        return;
                                                    }
                                            }
                                    }
                            }
                        }
                    }
                    if (i == 1) {
                        m16060n(interfaceC8304h);
                        return;
                    } else if (i == 2) {
                        m16059o(interfaceC8304h, 2);
                        return;
                    } else if (i == 3) {
                        m16062l(interfaceC8304h, EnumC8259k.SHORT_STANDALONE);
                        return;
                    } else if (i == 4) {
                        m16062l(interfaceC8304h, EnumC8259k.FULL_STANDALONE);
                        return;
                    } else if (i == 5) {
                        m16062l(interfaceC8304h, EnumC8259k.NARROW_STANDALONE);
                        return;
                    } else {
                        throw new IllegalArgumentException("Too many pattern letters: " + c);
                    }
                }
                if (i == 1) {
                    m16060n(interfaceC8304h);
                    return;
                } else if (i == 2) {
                    m16059o(interfaceC8304h, i);
                    return;
                } else {
                    throw new IllegalArgumentException("Too many pattern letters: " + c);
                }
            }
        }
        if (i == 1) {
            m16060n(interfaceC8304h);
        } else if (i == 2) {
            m16059o(interfaceC8304h, 2);
        } else if (i == 3) {
            m16062l(interfaceC8304h, EnumC8259k.SHORT);
        } else if (i == 4) {
            m16062l(interfaceC8304h, EnumC8259k.FULL);
        } else if (i == 5) {
            m16062l(interfaceC8304h, EnumC8259k.NARROW);
        } else {
            throw new IllegalArgumentException("Too many pattern letters: " + c);
        }
    }

    /* renamed from: C */
    private void m16077C(String str) {
        int i;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i3 = i2 + 1;
                while (i3 < str.length() && str.charAt(i3) == charAt) {
                    i3++;
                }
                int i4 = i3 - i2;
                if (charAt == 'p') {
                    if (i3 >= str.length() || (((charAt = str.charAt(i3)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i = i4;
                        i4 = 0;
                    } else {
                        int i5 = i3 + 1;
                        while (i5 < str.length() && str.charAt(i5) == charAt) {
                            i5++;
                        }
                        i = i5 - i3;
                        i3 = i5;
                    }
                    if (i4 != 0) {
                        m16051w(i4);
                        i4 = i;
                    } else {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: " + str);
                    }
                }
                InterfaceC8304h interfaceC8304h = f21402i.get(Character.valueOf(charAt));
                if (interfaceC8304h != null) {
                    m16079A(charAt, i4, interfaceC8304h);
                } else if (charAt == 'z') {
                    if (i4 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    } else if (i4 == 4) {
                        m16054t(EnumC8259k.FULL);
                    } else {
                        m16054t(EnumC8259k.SHORT);
                    }
                } else if (charAt != 'V') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i4 < 4) {
                            m16066h("+HHMM", "+0000");
                        } else if (i4 == 4) {
                            m16067g(EnumC8259k.FULL);
                        } else if (i4 == 5) {
                            m16066h("+HH:MM:ss", "Z");
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'O') {
                        if (i4 == 1) {
                            m16067g(EnumC8259k.SHORT);
                        } else if (i4 == 4) {
                            m16067g(EnumC8259k.FULL);
                        } else {
                            throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                        }
                    } else if (charAt == 'X') {
                        if (i4 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        m16066h(C8238l.f21427y[i4 + (i4 == 1 ? 0 : 1)], "Z");
                    } else if (charAt == 'x') {
                        if (i4 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        if (i4 == 1) {
                            str2 = "+00";
                        } else if (i4 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        m16066h(C8238l.f21427y[i4 + (i4 == 1 ? 0 : 1)], str2);
                    } else if (charAt == 'W') {
                        if (i4 <= 1) {
                            m16070d(new C8244r('W', i4));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'w') {
                        if (i4 <= 2) {
                            m16070d(new C8244r('w', i4));
                        } else {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                    } else if (charAt == 'Y') {
                        m16070d(new C8244r('Y', i4));
                    } else {
                        throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                    }
                } else if (i4 == 2) {
                    m16056r();
                } else {
                    throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                }
                i2 = i3 - 1;
            } else if (charAt == '\'') {
                int i6 = i2 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 >= str.length() || str.charAt(i8) != '\'') {
                            break;
                        }
                        i7 = i8;
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    String substring = str.substring(i6, i7);
                    if (substring.length() == 0) {
                        m16069e('\'');
                    } else {
                        m16068f(substring.replace("''", "'"));
                    }
                    i2 = i7;
                } else {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: " + str);
                }
            } else if (charAt == '[') {
                m16052v();
            } else if (charAt == ']') {
                if (this.f21403a.f21404b != null) {
                    m16053u();
                } else {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
            } else if (charAt != '{' && charAt != '}' && charAt != '#') {
                m16069e(charAt);
            } else {
                throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
            }
            i2++;
        }
    }

    /* renamed from: d */
    private int m16070d(InterfaceC8233g interfaceC8233g) {
        C11251d.m5623i(interfaceC8233g, "pp");
        C8226c c8226c = this.f21403a;
        int i = c8226c.f21407e;
        if (i > 0) {
            if (interfaceC8233g != null) {
                interfaceC8233g = new C8239m(interfaceC8233g, i, c8226c.f21408f);
            }
            C8226c c8226c2 = this.f21403a;
            c8226c2.f21407e = 0;
            c8226c2.f21408f = (char) 0;
        }
        this.f21403a.f21405c.add(interfaceC8233g);
        C8226c c8226c3 = this.f21403a;
        c8226c3.f21409g = -1;
        return c8226c3.f21405c.size() - 1;
    }

    /* renamed from: m */
    private C8226c m16061m(C8237k c8237k) {
        C8237k mo16041b;
        C8226c c8226c = this.f21403a;
        int i = c8226c.f21409g;
        if (i >= 0 && (c8226c.f21405c.get(i) instanceof C8237k)) {
            C8226c c8226c2 = this.f21403a;
            int i2 = c8226c2.f21409g;
            C8237k c8237k2 = (C8237k) c8226c2.f21405c.get(i2);
            int i3 = c8237k.f21424x;
            int i4 = c8237k.f21425y;
            if (i3 == i4 && c8237k.f21426z == EnumC8255i.NOT_NEGATIVE) {
                mo16041b = c8237k2.mo16040c(i4);
                m16070d(c8237k.mo16041b());
                this.f21403a.f21409g = i2;
            } else {
                mo16041b = c8237k2.mo16041b();
                this.f21403a.f21409g = m16070d(c8237k);
            }
            this.f21403a.f21405c.set(i2, mo16041b);
        } else {
            this.f21403a.f21409g = m16070d(c8237k);
        }
        return this;
    }

    /* renamed from: B */
    public C8226c m16078B() {
        m16070d(EnumC8241o.LENIENT);
        return this;
    }

    /* renamed from: D */
    public C8223b m16076D() {
        return m16075E(Locale.getDefault());
    }

    /* renamed from: E */
    public C8223b m16075E(Locale locale) {
        C11251d.m5623i(locale, "locale");
        while (this.f21403a.f21404b != null) {
            m16053u();
        }
        return new C8223b(new C8232f(this.f21405c, false), locale, C8253g.f21457e, EnumC8254h.SMART, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public C8223b m16074F(EnumC8254h enumC8254h) {
        return m16076D().m16082j(enumC8254h);
    }

    /* renamed from: a */
    public C8226c m16073a(C8223b c8223b) {
        C11251d.m5623i(c8223b, "formatter");
        m16070d(c8223b.m16084h(false));
        return this;
    }

    /* renamed from: b */
    public C8226c m16072b(InterfaceC8304h interfaceC8304h, int i, int i2, boolean z) {
        m16070d(new C8234h(interfaceC8304h, i, i2, z));
        return this;
    }

    /* renamed from: c */
    public C8226c m16071c() {
        m16070d(new C8235i(-2));
        return this;
    }

    /* renamed from: e */
    public C8226c m16069e(char c) {
        m16070d(new C8231e(c));
        return this;
    }

    /* renamed from: f */
    public C8226c m16068f(String str) {
        C11251d.m5623i(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                m16070d(new C8231e(str.charAt(0)));
            } else {
                m16070d(new C8242p(str));
            }
        }
        return this;
    }

    /* renamed from: g */
    public C8226c m16067g(EnumC8259k enumC8259k) {
        C11251d.m5623i(enumC8259k, "style");
        if (enumC8259k != EnumC8259k.FULL && enumC8259k != EnumC8259k.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        m16070d(new C8236j(enumC8259k));
        return this;
    }

    /* renamed from: h */
    public C8226c m16066h(String str, String str2) {
        m16070d(new C8238l(str2, str));
        return this;
    }

    /* renamed from: i */
    public C8226c m16065i() {
        m16070d(C8238l.f21428z);
        return this;
    }

    /* renamed from: j */
    public C8226c m16064j(String str) {
        C11251d.m5623i(str, "pattern");
        m16077C(str);
        return this;
    }

    /* renamed from: k */
    public C8226c m16063k(InterfaceC8304h interfaceC8304h, Map<Long, String> map) {
        C11251d.m5623i(interfaceC8304h, "field");
        C11251d.m5623i(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC8259k enumC8259k = EnumC8259k.FULL;
        m16070d(new C8243q(interfaceC8304h, enumC8259k, new C8228b(this, new C8256j.C8258b(Collections.singletonMap(enumC8259k, linkedHashMap)))));
        return this;
    }

    /* renamed from: l */
    public C8226c m16062l(InterfaceC8304h interfaceC8304h, EnumC8259k enumC8259k) {
        C11251d.m5623i(interfaceC8304h, "field");
        C11251d.m5623i(enumC8259k, "textStyle");
        m16070d(new C8243q(interfaceC8304h, enumC8259k, AbstractC8251f.m16026b()));
        return this;
    }

    /* renamed from: n */
    public C8226c m16060n(InterfaceC8304h interfaceC8304h) {
        C11251d.m5623i(interfaceC8304h, "field");
        m16061m(new C8237k(interfaceC8304h, 1, 19, EnumC8255i.NORMAL));
        return this;
    }

    /* renamed from: o */
    public C8226c m16059o(InterfaceC8304h interfaceC8304h, int i) {
        C11251d.m5623i(interfaceC8304h, "field");
        if (i >= 1 && i <= 19) {
            m16061m(new C8237k(interfaceC8304h, i, i, EnumC8255i.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
    }

    /* renamed from: p */
    public C8226c m16058p(InterfaceC8304h interfaceC8304h, int i, int i2, EnumC8255i enumC8255i) {
        if (i == i2 && enumC8255i == EnumC8255i.NOT_NEGATIVE) {
            return m16059o(interfaceC8304h, i2);
        }
        C11251d.m5623i(interfaceC8304h, "field");
        C11251d.m5623i(enumC8255i, "signStyle");
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        } else if (i2 >= i) {
            m16061m(new C8237k(interfaceC8304h, i, i2, enumC8255i));
            return this;
        } else {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    /* renamed from: q */
    public C8226c m16057q(InterfaceC8304h interfaceC8304h, int i, int i2, AbstractC8176b abstractC8176b) {
        C11251d.m5623i(interfaceC8304h, "field");
        C11251d.m5623i(abstractC8176b, "baseDate");
        m16061m(new C8240n(interfaceC8304h, i, i2, 0, abstractC8176b));
        return this;
    }

    /* renamed from: r */
    public C8226c m16056r() {
        m16070d(new C8245s(C8305i.m15863g(), "ZoneId()"));
        return this;
    }

    /* renamed from: s */
    public C8226c m16055s() {
        m16070d(new C8245s(f21401h, "ZoneRegionId()"));
        return this;
    }

    /* renamed from: t */
    public C8226c m16054t(EnumC8259k enumC8259k) {
        m16070d(new C8246t(enumC8259k));
        return this;
    }

    /* renamed from: u */
    public C8226c m16053u() {
        C8226c c8226c = this.f21403a;
        if (c8226c.f21404b != null) {
            if (c8226c.f21405c.size() > 0) {
                C8226c c8226c2 = this.f21403a;
                C8232f c8232f = new C8232f(c8226c2.f21405c, c8226c2.f21406d);
                this.f21403a = this.f21403a.f21404b;
                m16070d(c8232f);
            } else {
                this.f21403a = this.f21403a.f21404b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    /* renamed from: v */
    public C8226c m16052v() {
        C8226c c8226c = this.f21403a;
        c8226c.f21409g = -1;
        this.f21403a = new C8226c(c8226c, true);
        return this;
    }

    /* renamed from: w */
    public C8226c m16051w(int i) {
        return m16050x(i, ' ');
    }

    /* renamed from: x */
    public C8226c m16050x(int i, char c) {
        if (i >= 1) {
            C8226c c8226c = this.f21403a;
            c8226c.f21407e = i;
            c8226c.f21408f = c;
            c8226c.f21409g = -1;
            return this;
        }
        throw new IllegalArgumentException("The pad width must be at least one but was " + i);
    }

    /* renamed from: y */
    public C8226c m16049y() {
        m16070d(EnumC8241o.INSENSITIVE);
        return this;
    }

    /* renamed from: z */
    public C8226c m16048z() {
        m16070d(EnumC8241o.SENSITIVE);
        return this;
    }

    private C8226c(C8226c c8226c, boolean z) {
        this.f21403a = this;
        this.f21405c = new ArrayList();
        this.f21409g = -1;
        this.f21404b = c8226c;
        this.f21406d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeFormatterBuilder.java */
    /* renamed from: org.threeten.bp.format.c$n */
    /* loaded from: classes2.dex */
    public static final class C8240n extends C8237k {

        /* renamed from: E */
        static final C8213d f21434E = C8213d.m16193O(2000, 1, 1);

        /* renamed from: C */
        private final int f21435C;

        /* renamed from: D */
        private final AbstractC8176b f21436D;

        C8240n(InterfaceC8304h interfaceC8304h, int i, int i2, int i3, AbstractC8176b abstractC8176b) {
            super(interfaceC8304h, i, i2, EnumC8255i.NOT_NEGATIVE);
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException("The width must be from 1 to 10 inclusive but was " + i);
            } else if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException("The maxWidth must be from 1 to 10 inclusive but was " + i2);
            } else if (i2 >= i) {
                if (abstractC8176b == null) {
                    long j = i3;
                    if (interfaceC8304h.range().m15847h(j)) {
                        if (j + C8237k.f21421B[i] > 2147483647L) {
                            throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                        }
                    } else {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    }
                }
                this.f21435C = i3;
                this.f21436D = abstractC8176b;
            } else {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
        }

        @Override // org.threeten.p283bp.format.C8226c.C8237k
        /* renamed from: a */
        long mo16042a(C8249e c8249e, long j) {
            long abs = Math.abs(j);
            int i = this.f21435C;
            if (this.f21436D != null) {
                i = AbstractC8188h.m16348h(c8249e.m16031e()).mo16236c(this.f21436D).get(this.f21423w);
            }
            if (j >= i) {
                int[] iArr = C8237k.f21421B;
                int i2 = this.f21424x;
                if (j < i + iArr[i2]) {
                    return abs % iArr[i2];
                }
            }
            return abs % C8237k.f21421B[this.f21425y];
        }

        @Override // org.threeten.p283bp.format.C8226c.C8237k
        /* renamed from: b */
        C8237k mo16041b() {
            return this.f21422A == -1 ? this : new C8240n(this.f21423w, this.f21424x, this.f21425y, this.f21435C, this.f21436D, -1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.threeten.p283bp.format.C8226c.C8237k
        /* renamed from: d */
        public C8240n mo16040c(int i) {
            return new C8240n(this.f21423w, this.f21424x, this.f21425y, this.f21435C, this.f21436D, this.f21422A + i);
        }

        @Override // org.threeten.p283bp.format.C8226c.C8237k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ReducedValue(");
            sb2.append(this.f21423w);
            sb2.append(",");
            sb2.append(this.f21424x);
            sb2.append(",");
            sb2.append(this.f21425y);
            sb2.append(",");
            Object obj = this.f21436D;
            if (obj == null) {
                obj = Integer.valueOf(this.f21435C);
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }

        private C8240n(InterfaceC8304h interfaceC8304h, int i, int i2, int i3, AbstractC8176b abstractC8176b, int i4) {
            super(interfaceC8304h, i, i2, EnumC8255i.NOT_NEGATIVE, i4, null);
            this.f21435C = i3;
            this.f21436D = abstractC8176b;
        }
    }
}
