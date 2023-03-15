package p478z0;

import java.util.List;
import p393v0.C11012e1;
import p393v0.C11018f1;
import p393v0.C11047p;
import p393v0.C11059s0;
import p393v0.Color;
import p489zc.C13780s;

/* renamed from: z0.o */
/* loaded from: classes.dex */
public final class C13565o {

    /* renamed from: a */
    private static final List<AbstractC13505e> f34529a;

    /* renamed from: b */
    private static final int f34530b;

    /* renamed from: c */
    private static final int f34531c;

    /* renamed from: d */
    private static final int f34532d;

    static {
        List<AbstractC13505e> m197g;
        m197g = C13780s.m197g();
        f34529a = m197g;
        f34530b = C11012e1.f28346b.m6537a();
        f34531c = C11018f1.f28366b.m6513b();
        C11047p.f28401a.m6324z();
        Color.f28297b.m6633e();
        f34532d = C11059s0.f28438b.m6282b();
    }

    /* renamed from: a */
    public static final List<AbstractC13505e> m981a(String str) {
        if (str == null) {
            return f34529a;
        }
        return new PathParser().m1103p(str).m1122C();
    }

    /* renamed from: b */
    public static final int m980b() {
        return f34532d;
    }

    /* renamed from: c */
    public static final int m979c() {
        return f34530b;
    }

    /* renamed from: d */
    public static final int m978d() {
        return f34531c;
    }

    /* renamed from: e */
    public static final List<AbstractC13505e> m977e() {
        return f34529a;
    }
}
