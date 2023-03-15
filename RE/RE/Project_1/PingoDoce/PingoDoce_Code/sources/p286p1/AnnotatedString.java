package p286p1;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: p1.a */
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {

    /* renamed from: w */
    private final String f21582w;

    /* renamed from: x */
    private final List f21583x;

    /* renamed from: y */
    private final List f21584y;

    /* renamed from: z */
    private final List f21585z;

    public AnnotatedString(String str, List list, List list2, List list3) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(list2, "paragraphStyles");
        Intrinsics.isThisObjectNull(list3, "annotations");
        this.f21582w = str;
        this.f21583x = list;
        this.f21584y = list2;
        this.f21585z = list3;
        int size = list2.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            C8337a c8337a = (C8337a) list2.get(i2);
            if (c8337a.m15762f() >= i) {
                if (c8337a.m15764d() <= m15771f().length()) {
                    i = c8337a.m15764d();
                    i2 = i3;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c8337a.m15762f() + ", " + c8337a.m15764d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* renamed from: a */
    public char m15776a(int i) {
        return this.f21582w.charAt(i);
    }

    /* renamed from: b */
    public final List m15775b() {
        return this.f21585z;
    }

    /* renamed from: c */
    public int m15774c() {
        return this.f21582w.length();
    }

    public final /* bridge */ char charAt(int i) {
        return m15776a(i);
    }

    /* renamed from: d */
    public final List m15773d() {
        return this.f21584y;
    }

    /* renamed from: e */
    public final List m15772e() {
        return this.f21583x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnnotatedString) {
            AnnotatedString annotatedString = (AnnotatedString) obj;
            return Intrinsics.equals(this.f21582w, annotatedString.f21582w) && Intrinsics.equals(this.f21583x, annotatedString.f21583x) && Intrinsics.equals(this.f21584y, annotatedString.f21584y) && Intrinsics.equals(this.f21585z, annotatedString.f21585z);
        }
        return false;
    }

    /* renamed from: f */
    public final String m15771f() {
        return this.f21582w;
    }

    /* renamed from: g */
    public final List m15770g(int i, int i2) {
        List list = this.f21585z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            Object obj = list.get(i3);
            C8337a c8337a = (C8337a) obj;
            if ((c8337a.m15763e() instanceof AbstractC8338a0) && C8339b.m15755f(i, i2, c8337a.m15762f(), c8337a.m15764d())) {
                arrayList.add(obj);
            }
            i3 = i4;
        }
        return arrayList;
    }

    /* renamed from: h */
    public AnnotatedString subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.f21582w.length()) {
                return this;
            }
            String substring = this.f21582w.substring(i, i2);
            Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(substring, C8339b.m15760a(this.f21583x, i, i2), C8339b.m15760a(this.f21584y, i, i2), C8339b.m15760a(this.f21585z, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    public int hashCode() {
        return (((((this.f21582w.hashCode() * 31) + this.f21583x.hashCode()) * 31) + this.f21584y.hashCode()) * 31) + this.f21585z.hashCode();
    }

    /* renamed from: i */
    public final AnnotatedString m15768i(long j) {
        return m15769h(C8393w.m15536i(j), C8393w.m15537h(j));
    }

    public final /* bridge */ int length() {
        return m15774c();
    }

    public String toString() {
        return this.f21582w;
    }

    /* compiled from: AnnotatedString.kt */
    /* renamed from: p1.a$a */
    /* loaded from: classes.dex */
    public static final class C8337a<T> {

        /* renamed from: a */
        private final Object f21586a;

        /* renamed from: b */
        private final int f21587b;

        /* renamed from: c */
        private final int f21588c;

        /* renamed from: d */
        private final String f21589d;

        public C8337a(Object obj, int i, int i2, String str) {
            Intrinsics.isThisObjectNull(str, "tag");
            this.f21586a = obj;
            this.f21587b = i;
            this.f21588c = i2;
            this.f21589d = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* renamed from: a */
        public final Object m15767a() {
            return this.f21586a;
        }

        /* renamed from: b */
        public final int m15766b() {
            return this.f21587b;
        }

        /* renamed from: c */
        public final int m15765c() {
            return this.f21588c;
        }

        /* renamed from: d */
        public final int m15764d() {
            return this.f21588c;
        }

        /* renamed from: e */
        public final Object m15763e() {
            return this.f21586a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8337a) {
                C8337a c8337a = (C8337a) obj;
                return Intrinsics.equals(this.f21586a, c8337a.f21586a) && this.f21587b == c8337a.f21587b && this.f21588c == c8337a.f21588c && Intrinsics.equals(this.f21589d, c8337a.f21589d);
            }
            return false;
        }

        /* renamed from: f */
        public final int m15762f() {
            return this.f21587b;
        }

        /* renamed from: g */
        public final String m15761g() {
            return this.f21589d;
        }

        public int hashCode() {
            Object obj = this.f21586a;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.f21587b)) * 31) + Integer.hashCode(this.f21588c)) * 31) + this.f21589d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f21586a + ", start=" + this.f21587b + ", end=" + this.f21588c + ", tag=" + this.f21589d + ')';
        }

        public C8337a(Object obj, int i, int i2) {
            this(obj, i, i2, BuildConfig.VERSION_NAME);
        }
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C13780s.m197g() : list, (i & 4) != 0 ? C13780s.m197g() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(java.lang.String r2, java.util.List r3, java.util.List r4) {
        /*
            r1 = this;
            java.lang.String r0 = "text"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.lang.String r0 = "spanStyles"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            java.lang.String r0 = "paragraphStyles"
            p181jd.Intrinsics.isThisObjectNull(r4, r0)
            java.util.List r0 = p489zc.C13777q.m237g()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p286p1.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
