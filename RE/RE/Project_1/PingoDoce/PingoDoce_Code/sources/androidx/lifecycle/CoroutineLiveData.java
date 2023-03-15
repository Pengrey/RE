package androidx.lifecycle;

import androidx.constraintlayout.widget.C0868i;
import bd.CoroutineContext;
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

/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public final class CoroutineLiveData<T> implements InterfaceC1424a0 {

    /* renamed from: a */
    private final CoroutineContext f4263a;

    /* renamed from: b */
    private C1437f f4264b;

    /* compiled from: CoroutineLiveData.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", m20196f = "CoroutineLiveData.kt", m20195l = {C0868i.f2993y0}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.b0$a */
    /* loaded from: classes.dex */
    static final class C1426a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f4265x;

        /* renamed from: z */
        final /* synthetic */ Object f4267z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1426a(Object obj, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f4267z = obj;
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1426a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            return new C1426a(this.f4267z, interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4265x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C1437f m37064b = CoroutineLiveData.this.m37064b();
                this.f4265x = 1;
                if (m37064b.m37043s(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            CoroutineLiveData.this.m37064b().mo166p(this.f4267z);
            return C13195u.f34156a;
        }
    }

    public CoroutineLiveData(C1437f c1437f, CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(c1437f, "target");
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        this.f4264b = c1437f;
        this.f4263a = coroutineContext.mo4545f0(C10587w0.m7619c().mo7830H0());
    }

    /* renamed from: a */
    public Object mo37066a(Object obj, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m20164g = C6769b.m20164g(this.f4263a, new C1426a(obj, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m20164g == m34636d ? m20164g : C13195u.f34156a;
    }

    /* renamed from: b */
    public final C1437f m37064b() {
        return this.f4264b;
    }
}
