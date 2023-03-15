package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10587w0;
import td.C10596y1;
import td.InterfaceC10524i0;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m20207d2 = {"Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/p;", "lifecycle", "Lbd/g;", "coroutineContext", "<init>", "(Landroidx/lifecycle/p;Lbd/g;)V", "lifecycle-runtime-ktx_release"}, m20206k = 1, m20205mv = {1, 4, 1})
/* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl */
/* loaded from: classes.dex */
public final class Lifecycle extends AbstractC1474q implements InterfaceC1485s {

    /* renamed from: w */
    private final AbstractC1469p f4224w;

    /* renamed from: x */
    private final CoroutineContext f4225x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycle.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m20196f = "Lifecycle.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$a */
    /* loaded from: classes.dex */
    public static final class C1417a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        private /* synthetic */ Object f4226x;

        /* renamed from: y */
        int f4227y;

        C1417a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1417a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            C1417a c1417a = new C1417a(interfaceC1886d);
            c1417a.f4226x = obj;
            return c1417a;
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f4227y == 0) {
                C13186n.m1453b(obj);
                InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) this.f4226x;
                if (Lifecycle.this.m37085b().mo10401b().compareTo(AbstractC1469p.EnumC1472c.INITIALIZED) < 0) {
                    C10596y1.m7595e(interfaceC10524i0.mo7716y(), null, 1, null);
                } else {
                    Lifecycle.this.m37085b().mo10402a(Lifecycle.this);
                }
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public Lifecycle(AbstractC1469p abstractC1469p, CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(coroutineContext, "coroutineContext");
        this.f4224w = abstractC1469p;
        this.f4225x = coroutineContext;
        if (m37085b().mo10401b() == AbstractC1469p.EnumC1472c.DESTROYED) {
            C10596y1.m7595e(mo7716y(), null, 1, null);
        }
    }

    /* renamed from: b */
    public AbstractC1469p m37085b() {
        return this.f4224w;
    }

    /* renamed from: j */
    public final void m37084j() {
        C6772d.m20158d(this, C10587w0.m7619c().mo7830H0(), null, new C1417a(null), 2, null);
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (m37085b().mo10401b().compareTo(AbstractC1469p.EnumC1472c.DESTROYED) <= 0) {
            m37085b().mo10400c(this);
            C10596y1.m7595e(mo7716y(), null, 1, null);
        }
    }

    /* renamed from: y */
    public CoroutineContext mo7716y() {
        return this.f4225x;
    }
}
