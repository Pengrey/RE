package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p072e1.C4955g;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p357t.EnumC10314o;
import p373u0.C10774f;
import p468yc.C13186n;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.a0 */
/* loaded from: classes.dex */
public final class Scrollable implements InterfaceC10766x, InterfaceC10765w {

    /* renamed from: a */
    private final InterfaceC5242r1 f27432a;

    /* renamed from: b */
    private InterfaceC10653c0 f27433b;

    /* compiled from: Scrollable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", m20196f = "Scrollable.kt", m20195l = {350}, m20194m = "invokeSuspend")
    /* renamed from: u.a0$a */
    /* loaded from: classes.dex */
    static final class C10644a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6112p f27434A;

        /* renamed from: x */
        int f27435x;

        /* renamed from: y */
        private /* synthetic */ Object f27436y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10644a(InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27434A = interfaceC6112p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10644a c10644a = new C10644a(this.f27434A, interfaceC1886d);
            c10644a.f27436y = obj;
            return c10644a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10653c0 interfaceC10653c0, InterfaceC1886d interfaceC1886d) {
            return ((C10644a) create(interfaceC10653c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27435x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Scrollable.this.m7405e((InterfaceC10653c0) this.f27436y);
                InterfaceC6112p interfaceC6112p = this.f27434A;
                Scrollable scrollable = Scrollable.this;
                this.f27435x = 1;
                if (interfaceC6112p.mo39856d(scrollable, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    public Scrollable(InterfaceC5242r1 interfaceC5242r1) {
        Intrinsics.isThisObjectNull(interfaceC5242r1, "scrollLogic");
        this.f27432a = interfaceC5242r1;
        this.f27433b = C10660e0.m7377a();
    }

    /* renamed from: a */
    public Object mo7190a(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo7347b = ((C10684h0) m7406d().getValue()).m7327f().mo7347b(enumC10314o, new C10644a(interfaceC6112p, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo7347b == m34636d ? mo7347b : C13195u.f34156a;
    }

    /* renamed from: b */
    public void mo7191b(float f, long j) {
        ((C10684h0) this.f27432a.getValue()).m7332a(m7407c(), f, C10774f.m7152d(j), C4955g.f13756a.m26183a());
    }

    /* renamed from: c */
    public final InterfaceC10653c0 m7407c() {
        return this.f27433b;
    }

    /* renamed from: d */
    public final InterfaceC5242r1 m7406d() {
        return this.f27432a;
    }

    /* renamed from: e */
    public final void m7405e(InterfaceC10653c0 interfaceC10653c0) {
        Intrinsics.isThisObjectNull(interfaceC10653c0, "<set-?>");
        this.f27433b = interfaceC10653c0;
    }
}
