package p095f3;

import android.content.Context;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public final class C5348a {

    /* renamed from: a */
    public static final C5348a f14756a = new C5348a();

    /* renamed from: b */
    private static InterfaceC5359e f14757b;

    /* renamed from: c */
    private static InterfaceC5364f f14758c;

    private C5348a() {
    }

    /* renamed from: a */
    public static final InterfaceC5359e m24549a(Context context) {
        InterfaceC5359e interfaceC5359e = f14757b;
        return interfaceC5359e == null ? f14756a.m24548b(context) : interfaceC5359e;
    }

    /* renamed from: b */
    private final synchronized InterfaceC5359e m24548b(Context context) {
        InterfaceC5359e m24483a;
        InterfaceC5359e interfaceC5359e = f14757b;
        if (interfaceC5359e != null) {
            return interfaceC5359e;
        }
        InterfaceC5364f interfaceC5364f = f14758c;
        if (interfaceC5364f == null || (m24483a = interfaceC5364f.m24483a()) == null) {
            Context applicationContext = context.getApplicationContext();
            InterfaceC5364f interfaceC5364f2 = applicationContext instanceof InterfaceC5364f ? (InterfaceC5364f) applicationContext : null;
            m24483a = interfaceC5364f2 != null ? interfaceC5364f2.m24483a() : C5365g.m24482a(context);
        }
        f14758c = null;
        f14757b = m24483a;
        return m24483a;
    }

    /* renamed from: c */
    public static final synchronized void m24547c(InterfaceC5359e interfaceC5359e) {
        synchronized (C5348a.class) {
            f14758c = null;
            f14757b = interfaceC5359e;
        }
    }
}
