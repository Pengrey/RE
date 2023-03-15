package p305q3;

import android.view.View;
import bd.InterfaceC1886d;
import cd.C2116d;
import coil.request.ViewTargetRequestDelegate;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p396v3.C11098i;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10540l1;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10555p0;
import td.InterfaceC10574t1;

/* renamed from: q3.q */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC9645q implements View.OnAttachStateChangeListener {

    /* renamed from: A */
    private boolean f25452A;

    /* renamed from: w */
    private final View f25453w;

    /* renamed from: x */
    private C9644p f25454x;

    /* renamed from: y */
    private InterfaceC10574t1 f25455y;

    /* renamed from: z */
    private ViewTargetRequestDelegate f25456z;

    /* compiled from: ViewTargetRequestManager.kt */
    @InterfaceC6759f(m20197c = "coil.request.ViewTargetRequestManager$dispose$1", m20196f = "ViewTargetRequestManager.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: q3.q$a */
    /* loaded from: classes.dex */
    static final class C9646a extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C13195u>, Object> {

        /* renamed from: x */
        int f25457x;

        C9646a(InterfaceC1886d<? super C9646a> interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            return new C9646a(interfaceC1886d);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C13195u> interfaceC1886d) {
            return ((C9646a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f25457x == 0) {
                C13186n.m1453b(obj);
                View$OnAttachStateChangeListenerC9645q.this.m10294c(null);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public View$OnAttachStateChangeListenerC9645q(View view) {
        this.f25453w = view;
    }

    /* renamed from: a */
    public final synchronized void m10296a() {
        InterfaceC10574t1 m20158d;
        InterfaceC10574t1 interfaceC10574t1 = this.f25455y;
        if (interfaceC10574t1 != null) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        }
        m20158d = C6772d.m20158d(C10540l1.f27258w, C10587w0.m7619c().mo7830H0(), null, new C9646a(null), 2, null);
        this.f25455y = m20158d;
        this.f25454x = null;
    }

    /* renamed from: b */
    public final synchronized C9644p m10295b(InterfaceC10555p0<? extends AbstractC9632h> interfaceC10555p0) {
        C9644p c9644p = this.f25454x;
        if (c9644p != null && C11098i.m6137s() && this.f25452A) {
            this.f25452A = false;
            c9644p.m10297a(interfaceC10555p0);
            return c9644p;
        }
        InterfaceC10574t1 interfaceC10574t1 = this.f25455y;
        if (interfaceC10574t1 != null) {
            InterfaceC10574t1.C10575a.m7654a(interfaceC10574t1, null, 1, null);
        }
        this.f25455y = null;
        C9644p c9644p2 = new C9644p(this.f25453w, interfaceC10555p0);
        this.f25454x = c9644p2;
        return c9644p2;
    }

    /* renamed from: c */
    public final void m10294c(ViewTargetRequestDelegate viewTargetRequestDelegate) {
        ViewTargetRequestDelegate viewTargetRequestDelegate2 = this.f25456z;
        if (viewTargetRequestDelegate2 != null) {
            viewTargetRequestDelegate2.m34474j();
        }
        this.f25456z = viewTargetRequestDelegate;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f25456z;
        if (viewTargetRequestDelegate == null) {
            return;
        }
        this.f25452A = true;
        viewTargetRequestDelegate.m34473k();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        ViewTargetRequestDelegate viewTargetRequestDelegate = this.f25456z;
        if (viewTargetRequestDelegate != null) {
            viewTargetRequestDelegate.m34474j();
        }
    }
}
