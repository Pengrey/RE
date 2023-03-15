package p345s;

import androidx.compose.p018ui.platform.InterfaceC0803t0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p092f0.C5217l0;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: s.f0 */
/* loaded from: classes.dex */
public final class C9947f0 {

    /* compiled from: InfiniteAnimationPolicy.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", m20196f = "InfiniteAnimationPolicy.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: s.f0$a */
    /* loaded from: classes.dex */
    static final class C9948a extends AbstractC6764l implements InterfaceC6108l<InterfaceC1886d<? super R>, Object> {

        /* renamed from: x */
        int f26044x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6108l<Long, R> f26045y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9948a(InterfaceC6108l<? super Long, ? extends R> interfaceC6108l, InterfaceC1886d<? super C9948a> interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f26045y = interfaceC6108l;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(InterfaceC1886d<?> interfaceC1886d) {
            return new C9948a(this.f26045y, interfaceC1886d);
        }

        @Override // id.InterfaceC6108l
        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d<? super R> interfaceC1886d) {
            return ((C9948a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f26044x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6108l<Long, R> interfaceC6108l = this.f26045y;
                this.f26044x = 1;
                obj = C5217l0.m25004b(interfaceC6108l, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* renamed from: a */
    public static final <R> Object m9588a(InterfaceC6108l<? super Long, ? extends R> interfaceC6108l, InterfaceC1886d<? super R> interfaceC1886d) {
        InterfaceC0803t0 interfaceC0803t0 = (InterfaceC0803t0) interfaceC1886d.getContext().mo4546c(InterfaceC0803t0.f2418a);
        if (interfaceC0803t0 == null) {
            return C5217l0.m25004b(interfaceC6108l, interfaceC1886d);
        }
        return interfaceC0803t0.m39506d0(new C9948a(interfaceC6108l, null), interfaceC1886d);
    }
}
