package p174j6;

import p057d6.C4746d;
import p057d6.InterfaceC4744b;

/* renamed from: j6.j */
/* loaded from: classes.dex */
public final class C6328j implements InterfaceC4744b<AbstractC6315e> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    /* renamed from: j6.j$a */
    /* loaded from: classes.dex */
    private static final class C6329a {

        /* renamed from: a */
        private static final C6328j f17341a = new C6328j();
    }

    /* renamed from: a */
    public static C6328j m21246a() {
        return C6329a.f17341a;
    }

    /* renamed from: c */
    public static AbstractC6315e m21244c() {
        return (AbstractC6315e) C4746d.m26713c(AbstractC6318f.m21258d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public AbstractC6315e mo42226get() {
        return m21244c();
    }
}
