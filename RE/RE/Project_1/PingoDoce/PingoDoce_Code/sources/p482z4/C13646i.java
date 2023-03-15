package p482z4;

import sd.StringsJVM;

/* renamed from: z4.i */
/* loaded from: classes.dex */
public final class C13646i {

    /* renamed from: a */
    private static volatile String f34688a;

    static {
        new C13646i();
    }

    private C13646i() {
    }

    /* renamed from: a */
    public static final String m717a() {
        return f34688a;
    }

    /* renamed from: b */
    public static final boolean m716b() {
        boolean m8948C;
        String str = f34688a;
        if (str != null) {
            m8948C = StringsJVM.m8948C(str, "Unity.", false, 2, null);
            if (m8948C) {
                return true;
            }
        }
        return false;
    }
}
