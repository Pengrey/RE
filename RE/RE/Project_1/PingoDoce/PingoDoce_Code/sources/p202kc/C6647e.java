package p202kc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc.C7028a;
import lc.C7033c;
import p181jd.Intrinsics;
import p202kc.C6642c;

/* renamed from: kc.e */
/* loaded from: classes2.dex */
public final class C6647e extends C6642c {

    /* renamed from: f */
    public static final C6648a f17933f = new C6648a(null);

    /* renamed from: e */
    private static final Map<String, C6647e> f17932e = new HashMap();

    /* compiled from: RTLMask.kt */
    /* renamed from: kc.e$a */
    /* loaded from: classes2.dex */
    public static final class C6648a {
        private C6648a() {
        }

        /* renamed from: a */
        public final C6647e m20393a(String str, List<C7033c> list) {
            String m20391b;
            String m20391b2;
            Intrinsics.m20926i(str, "format");
            Intrinsics.m20926i(list, "customNotations");
            Map map = C6647e.f17932e;
            m20391b = C6649f.m20391b(str);
            C6647e c6647e = (C6647e) map.get(m20391b);
            if (c6647e == null) {
                C6647e c6647e2 = new C6647e(str, list);
                Map map2 = C6647e.f17932e;
                m20391b2 = C6649f.m20391b(str);
                map2.put(m20391b2, c6647e2);
                return c6647e2;
            }
            return c6647e;
        }

        public /* synthetic */ C6648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6647e(java.lang.String r2, java.util.List<lc.C7033c> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "format"
            p181jd.Intrinsics.m20926i(r2, r0)
            java.lang.String r0 = "customNotations"
            p181jd.Intrinsics.m20926i(r3, r0)
            java.lang.String r2 = p202kc.C6649f.m20392a(r2)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kc.C6647e.<init>(java.lang.String, java.util.List):void");
    }

    @Override // p202kc.C6642c
    /* renamed from: b */
    public C6642c.C6645c mo20395b(C7028a c7028a) {
        Intrinsics.m20926i(c7028a, "text");
        return super.mo20395b(c7028a.m19548d()).m20398e();
    }

    @Override // p202kc.C6642c
    /* renamed from: c */
    public C6641b mo20394c(C7028a c7028a) {
        Intrinsics.m20926i(c7028a, "text");
        return new C6646d(c7028a);
    }
}
