package sd;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6435i;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p337rd.C9876k;
import p337rd.InterfaceC9870e;
import p489zc.CollectionsJVM;

/* compiled from: Regex.kt */
/* renamed from: sd.i */
/* loaded from: classes2.dex */
public final class C10156i implements Serializable {

    /* renamed from: w */
    private final Pattern f26491w;

    /* compiled from: Regex.kt */
    /* renamed from: sd.i$a */
    /* loaded from: classes2.dex */
    public static final class C10157a {
        private C10157a() {
        }

        public /* synthetic */ C10157a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Regex.kt */
    /* renamed from: sd.i$b */
    /* loaded from: classes2.dex */
    private static final class C10158b implements Serializable {

        /* renamed from: w */
        private final String f26492w;

        /* renamed from: x */
        private final int f26493x;

        /* compiled from: Regex.kt */
        /* renamed from: sd.i$b$a */
        /* loaded from: classes2.dex */
        public static final class C10159a {
            private C10159a() {
            }

            public /* synthetic */ C10159a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C10159a(null);
        }

        public C10158b(String str, int i) {
            Intrinsics.isThisObjectNull(str, "pattern");
            this.f26492w = str;
            this.f26493x = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f26492w, this.f26493x);
            Intrinsics.checkIfNull(compile, "compile(pattern, flags)");
            return new C10156i(compile);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    /* renamed from: sd.i$c */
    /* loaded from: classes2.dex */
    public static final class C10160c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: x */
        final /* synthetic */ CharSequence f26495x;

        /* renamed from: y */
        final /* synthetic */ int f26496y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10160c(CharSequence charSequence, int i) {
            super(0);
            this.f26495x = charSequence;
            this.f26496y = i;
        }

        /* renamed from: a */
        public final InterfaceC10152g mo42214q() {
            return C10156i.this.m9024a(this.f26495x, this.f26496y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Regex.kt */
    /* renamed from: sd.i$d */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10161d extends C6435i implements InterfaceC6108l {

        /* renamed from: F */
        public static final C10161d f26497F = new C10161d();

        C10161d() {
            super(1, InterfaceC10152g.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: i */
        public final InterfaceC10152g mo9587d(InterfaceC10152g interfaceC10152g) {
            Intrinsics.isThisObjectNull(interfaceC10152g, "p0");
            return interfaceC10152g.next();
        }
    }

    static {
        new C10157a(null);
    }

    public C10156i(Pattern pattern) {
        Intrinsics.isThisObjectNull(pattern, "nativePattern");
        this.f26491w = pattern;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9870e m9022c(C10156i c10156i, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c10156i.m9023b(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.f26491w.pattern();
        Intrinsics.checkIfNull(pattern, "nativePattern.pattern()");
        return new C10158b(pattern, this.f26491w.flags());
    }

    /* renamed from: a */
    public final InterfaceC10152g m9024a(CharSequence charSequence, int i) {
        InterfaceC10152g m9014c;
        Intrinsics.isThisObjectNull(charSequence, "input");
        Matcher matcher = this.f26491w.matcher(charSequence);
        Intrinsics.checkIfNull(matcher, "nativePattern.matcher(input)");
        m9014c = C10162j.m9014c(matcher, i, charSequence);
        return m9014c;
    }

    /* renamed from: b */
    public final InterfaceC9870e m9023b(CharSequence charSequence, int i) {
        InterfaceC9870e m9759e;
        Intrinsics.isThisObjectNull(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            m9759e = C9876k.m9759e(new C10160c(charSequence, i), C10161d.f26497F);
            return m9759e;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    /* renamed from: d */
    public final boolean m9021d(CharSequence charSequence) {
        Intrinsics.isThisObjectNull(charSequence, "input");
        return this.f26491w.matcher(charSequence).matches();
    }

    /* renamed from: e */
    public final String m9020e(CharSequence charSequence, String str) {
        Intrinsics.isThisObjectNull(charSequence, "input");
        Intrinsics.isThisObjectNull(str, "replacement");
        String replaceAll = this.f26491w.matcher(charSequence).replaceAll(str);
        Intrinsics.checkIfNull(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: f */
    public final List m9019f(CharSequence charSequence, int i) {
        List m202b;
        Intrinsics.isThisObjectNull(charSequence, "input");
        C10171u.m8888l0(i);
        Matcher matcher = this.f26491w.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i > 0 ? _Ranges.m15000i(i, 10) : 10);
            int i2 = 0;
            int i3 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        m202b = CollectionsJVM.m202b(charSequence.toString());
        return m202b;
    }

    public String toString() {
        String pattern = this.f26491w.toString();
        Intrinsics.checkIfNull(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10156i(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p181jd.Intrinsics.checkIfNull(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.C10156i.<init>(java.lang.String):void");
    }
}
