package p007a6;

import java.util.concurrent.Executor;
import p057d6.C4746d;
import p057d6.InterfaceC4744b;

/* renamed from: a6.k */
/* loaded from: classes.dex */
public final class C0049k implements InterfaceC4744b<Executor> {

    /* compiled from: ExecutionModule_ExecutorFactory.java */
    /* renamed from: a6.k$a */
    /* loaded from: classes.dex */
    private static final class C0050a {

        /* renamed from: a */
        private static final C0049k f155a = new C0049k();
    }

    /* renamed from: a */
    public static C0049k m42064a() {
        return C0050a.f155a;
    }

    /* renamed from: b */
    public static Executor m42063b() {
        return (Executor) C4746d.m26713c(AbstractC0048j.m42065a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: c */
    public Executor mo42226get() {
        return m42063b();
    }
}
