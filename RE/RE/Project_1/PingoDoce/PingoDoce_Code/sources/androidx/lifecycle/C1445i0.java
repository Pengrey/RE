package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6769b;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* compiled from: PausingDispatcher.kt */
/* renamed from: androidx.lifecycle.i0 */
/* loaded from: classes.dex */
public final class C1445i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PausingDispatcher.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m20196f = "PausingDispatcher.kt", m20195l = {162}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.i0$a */
    /* loaded from: classes.dex */
    public static final class C1446a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC1469p.EnumC1472c f4307A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6112p f4308B;

        /* renamed from: x */
        private /* synthetic */ Object f4309x;

        /* renamed from: y */
        int f4310y;

        /* renamed from: z */
        final /* synthetic */ AbstractC1469p f4311z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1446a(AbstractC1469p abstractC1469p, AbstractC1469p.EnumC1472c enumC1472c, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f4311z = abstractC1469p;
            this.f4307A = enumC1472c;
            this.f4308B = interfaceC6112p;
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1446a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            C1446a c1446a = new C1446a(this.f4311z, this.f4307A, this.f4308B, interfaceC1886d);
            c1446a.f4309x = obj;
            return c1446a;
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            LifecycleController lifecycleController;
            m34636d = C2116d.m34636d();
            int i = this.f4310y;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC10574t1 interfaceC10574t1 = (InterfaceC10574t1) ((InterfaceC10524i0) this.f4309x).mo7716y().mo4546c(InterfaceC10574t1.f27288s);
                if (interfaceC10574t1 != null) {
                    PausingDispatcher pausingDispatcher = new PausingDispatcher();
                    LifecycleController lifecycleController2 = new LifecycleController(this.f4311z, this.f4307A, pausingDispatcher.f4299y, interfaceC10574t1);
                    try {
                        InterfaceC6112p interfaceC6112p = this.f4308B;
                        this.f4309x = lifecycleController2;
                        this.f4310y = 1;
                        obj = C6769b.m20164g(pausingDispatcher, interfaceC6112p, this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                        lifecycleController = lifecycleController2;
                    } catch (Throwable th2) {
                        th = th2;
                        lifecycleController = lifecycleController2;
                        lifecycleController.m37086c();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("when[State] methods should have a parent job".toString());
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                lifecycleController = (LifecycleController) this.f4309x;
                try {
                    C13186n.m1453b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    lifecycleController.m37086c();
                    throw th;
                }
            }
            lifecycleController.m37086c();
            return obj;
        }
    }

    /* renamed from: a */
    public static final Object m37032a(AbstractC1469p abstractC1469p, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        return m37030c(abstractC1469p, AbstractC1469p.EnumC1472c.CREATED, interfaceC6112p, interfaceC1886d);
    }

    /* renamed from: b */
    public static final Object m37031b(AbstractC1469p abstractC1469p, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        return m37030c(abstractC1469p, AbstractC1469p.EnumC1472c.RESUMED, interfaceC6112p, interfaceC1886d);
    }

    /* renamed from: c */
    public static final Object m37030c(AbstractC1469p abstractC1469p, AbstractC1469p.EnumC1472c enumC1472c, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        return C6769b.m20164g(C10587w0.m7619c().mo7830H0(), new C1446a(abstractC1469p, enumC1472c, interfaceC6112p, null), interfaceC1886d);
    }
}
