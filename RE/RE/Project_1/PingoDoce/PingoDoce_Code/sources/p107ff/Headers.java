package p107ff;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gf.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p064dd.C4785c;
import p181jd.C6426b;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p222lf.dates;
import p468yc.C13182l;
import p468yc.C13191r;
import p489zc.C13780s;
import p489zc.MutableCollections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: ff.u */
/* loaded from: classes2.dex */
public final class Headers implements Iterable, InterfaceC6650a {

    /* renamed from: x */
    public static final C5499b f15540x = new C5499b(null);

    /* renamed from: w */
    private final String[] f15541w;

    /* compiled from: Headers.kt */
    /* renamed from: ff.u$a */
    /* loaded from: classes2.dex */
    public static final class C5498a {

        /* renamed from: a */
        private final List f15542a = new ArrayList(20);

        /* renamed from: a */
        public final C5498a m24007a(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            C5499b c5499b = Headers.f15540x;
            C5499b.m23998a(c5499b, str);
            C5499b.m23997b(c5499b, str2, str);
            m24004d(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C5498a m24006b(Headers headers) {
            Intrinsics.isThisObjectNull(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                m24004d(headers.m24012h(i), headers.m24009p(i));
            }
            return this;
        }

        /* renamed from: c */
        public final C5498a m24005c(String str) {
            int m8906T;
            Intrinsics.isThisObjectNull(str, "line");
            m8906T = C10171u.m8906T(str, ':', 1, false, 4, null);
            if (m8906T != -1) {
                String substring = str.substring(0, m8906T);
                Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = str.substring(m8906T + 1);
                Intrinsics.checkIfNull(substring2, "this as java.lang.String).substring(startIndex)");
                m24004d(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                Intrinsics.checkIfNull(substring3, "this as java.lang.String).substring(startIndex)");
                m24004d(BuildConfig.VERSION_NAME, substring3);
            } else {
                m24004d(BuildConfig.VERSION_NAME, str);
            }
            return this;
        }

        /* renamed from: d */
        public final C5498a m24004d(String str, String str2) {
            CharSequence m8915K0;
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            m24001g().add(str);
            List m24001g = m24001g();
            m8915K0 = C10171u.m8915K0(str2);
            m24001g.add(m8915K0.toString());
            return this;
        }

        /* renamed from: e */
        public final C5498a m24003e(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            C5499b.m23998a(Headers.f15540x, str);
            m24004d(str, str2);
            return this;
        }

        /* renamed from: f */
        public final Headers m24002f() {
            Object[] array = this.f15542a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new Headers((String[]) array, null);
        }

        /* renamed from: g */
        public final List m24001g() {
            return this.f15542a;
        }

        /* renamed from: h */
        public final C5498a m24000h(String str) {
            boolean m8943q;
            Intrinsics.isThisObjectNull(str, "name");
            int i = 0;
            while (i < m24001g().size()) {
                m8943q = StringsJVM.m8943q(str, (String) m24001g().get(i), true);
                if (m8943q) {
                    m24001g().remove(i);
                    m24001g().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: i */
        public final C5498a m23999i(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "name");
            Intrinsics.isThisObjectNull(str2, "value");
            C5499b c5499b = Headers.f15540x;
            C5499b.m23998a(c5499b, str);
            C5499b.m23997b(c5499b, str2, str);
            m24000h(str);
            m24004d(str, str2);
            return this;
        }
    }

    /* compiled from: Headers.kt */
    /* renamed from: ff.u$b */
    /* loaded from: classes2.dex */
    public static final class C5499b {
        private C5499b() {
        }

        public /* synthetic */ C5499b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ void m23998a(C5499b c5499b, String str) {
            c5499b.m23995d(str);
        }

        /* renamed from: b */
        public static final /* synthetic */ void m23997b(C5499b c5499b, String str, String str2) {
            c5499b.m23994e(str, str2);
        }

        /* renamed from: c */
        public static final /* synthetic */ String m23996c(C5499b c5499b, String[] strArr, String str) {
            return c5499b.m23993f(strArr, str);
        }

        /* renamed from: d */
        private final void m23995d(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (!('!' <= charAt && charAt < 127)) {
                        throw new IllegalArgumentException(Util.m23397t("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                    i = i2;
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[LOOP:0: B:3:0x0006->B:23:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[SYNTHETIC] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m23994e(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = r6
                goto L1e
            L1d:
                r5 = r1
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = r1
                goto L24
            L23:
                r5 = r6
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = gf.Util.m23397t(r1, r0)
                boolean r9 = gf.Util.m23436G(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = p181jd.Intrinsics.addStrAndObj(r9, r8)
            L4d:
                java.lang.String r8 = p181jd.Intrinsics.addStrAndObj(r0, r8)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p107ff.Headers.C5499b.m23994e(java.lang.String, java.lang.String):void");
        }

        /* renamed from: f */
        private final String m23993f(String[] strArr, String str) {
            boolean m8943q;
            int length = strArr.length - 2;
            int m26610b = C4785c.m26610b(length, 0, -2);
            if (m26610b > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                m8943q = StringsJVM.m8943q(str, strArr[length], true);
                if (m8943q) {
                    return strArr[length + 1];
                }
                if (length == m26610b) {
                    return null;
                }
                length = i;
            }
        }

        /* renamed from: g */
        public final Headers m23992g(String... strArr) {
            CharSequence m8915K0;
            Intrinsics.isThisObjectNull(strArr, "namesAndValues");
            int i = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    if (strArr2[i2] != null) {
                        m8915K0 = C10171u.m8915K0(strArr2[i2]);
                        strArr2[i2] = m8915K0.toString();
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int m26610b = C4785c.m26610b(0, strArr2.length - 1, 2);
                if (m26610b >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str = strArr2[i];
                        String str2 = strArr2[i + 1];
                        m23995d(str);
                        m23994e(str2, str);
                        if (i == m26610b) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.f15541w = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(strArr);
    }

    /* renamed from: o */
    public static final Headers m24010o(String... strArr) {
        return f15540x.m23992g(strArr);
    }

    /* renamed from: b */
    public final String m24014b(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        return C5499b.m23996c(f15540x, this.f15541w, str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.f15541w, ((Headers) obj).f15541w);
    }

    /* renamed from: f */
    public final Date m24013f(String str) {
        Intrinsics.isThisObjectNull(str, "name");
        String m24014b = m24014b(str);
        if (m24014b == null) {
            return null;
        }
        return dates.m19474a(m24014b);
    }

    /* renamed from: h */
    public final String m24012h(int i) {
        return this.f15541w[i * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15541w);
    }

    public Iterator iterator() {
        int size = size();
        C13182l[] c13182lArr = new C13182l[size];
        for (int i = 0; i < size; i++) {
            c13182lArr[i] = C13191r.m1447a(m24012h(i), m24009p(i));
        }
        return C6426b.m20963a(c13182lArr);
    }

    /* renamed from: l */
    public final C5498a m24011l() {
        C5498a c5498a = new C5498a();
        MutableCollections.m180v(c5498a.m24001g(), this.f15541w);
        return c5498a;
    }

    /* renamed from: p */
    public final String m24009p(int i) {
        return this.f15541w[(i * 2) + 1];
    }

    /* renamed from: q */
    public final List m24008q(String str) {
        List m197g;
        boolean m8943q;
        Intrinsics.isThisObjectNull(str, "name");
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            m8943q = StringsJVM.m8943q(str, m24012h(i), true);
            if (m8943q) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m24009p(i));
            }
            i = i2;
        }
        if (arrayList != null) {
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.checkIfNull(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        m197g = C13780s.m197g();
        return m197g;
    }

    public final int size() {
        return this.f15541w.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String m24012h = m24012h(i);
            String m24009p = m24009p(i);
            sb2.append(m24012h);
            sb2.append(": ");
            if (Util.m23436G(m24012h)) {
                m24009p = "██";
            }
            sb2.append(m24009p);
            sb2.append("\n");
            i = i2;
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
