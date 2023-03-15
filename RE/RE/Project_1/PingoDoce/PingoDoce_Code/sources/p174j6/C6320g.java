package p174j6;

import p057d6.C4746d;
import p057d6.InterfaceC4744b;

/* renamed from: j6.g */
/* loaded from: classes.dex */
public final class C6320g implements InterfaceC4744b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    /* renamed from: j6.g$a */
    /* loaded from: classes.dex */
    private static final class C6321a {

        /* renamed from: a */
        private static final C6320g f17334a = new C6320g();
    }

    /* renamed from: a */
    public static C6320g m21257a() {
        return C6321a.f17334a;
    }

    /* renamed from: b */
    public static String m21256b() {
        return (String) C4746d.m26713c(AbstractC6318f.m21261a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: c */
    public String mo42226get() {
        return m21256b();
    }
}
