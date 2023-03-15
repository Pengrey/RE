package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p357t.EnumC10314o;
import p468yc.C13186n;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Draggable.kt */
/* renamed from: u.r */
/* loaded from: classes.dex */
public final class C10758r implements InterfaceC10766x, InterfaceC10765w {

    /* renamed from: a */
    private final InterfaceC10751n f27838a;

    /* renamed from: b */
    private InterfaceC10729l f27839b;

    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", m20196f = "Draggable.kt", m20195l = {472}, m20194m = "invokeSuspend")
    /* renamed from: u.r$a */
    /* loaded from: classes.dex */
    static final class C10759a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6112p f27840A;

        /* renamed from: x */
        int f27841x;

        /* renamed from: y */
        private /* synthetic */ Object f27842y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10759a(InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27840A = interfaceC6112p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10759a c10759a = new C10759a(this.f27840A, interfaceC1886d);
            c10759a.f27842y = obj;
            return c10759a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10729l interfaceC10729l, InterfaceC1886d interfaceC1886d) {
            return ((C10759a) create(interfaceC10729l, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27841x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C10758r.this.m7211d((InterfaceC10729l) this.f27842y);
                InterfaceC6112p interfaceC6112p = this.f27840A;
                C10758r c10758r = C10758r.this;
                this.f27841x = 1;
                if (interfaceC6112p.mo39856d(c10758r, this) == m34636d) {
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

    public C10758r(InterfaceC10751n interfaceC10751n) {
        Intrinsics.isThisObjectNull(interfaceC10751n, "origin");
        this.f27838a = interfaceC10751n;
    }

    /* renamed from: a */
    public Object mo7190a(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo7224a = m7212c().mo7224a(enumC10314o, new C10759a(interfaceC6112p, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo7224a == m34636d ? mo7224a : C13195u.f34156a;
    }

    /* renamed from: b */
    public void mo7191b(float f, long j) {
        InterfaceC10729l interfaceC10729l = this.f27839b;
        if (interfaceC10729l == null) {
            return;
        }
        interfaceC10729l.mo7260a(f);
    }

    /* renamed from: c */
    public final InterfaceC10751n m7212c() {
        return this.f27838a;
    }

    /* renamed from: d */
    public final void m7211d(InterfaceC10729l interfaceC10729l) {
        this.f27839b = interfaceC10729l;
    }
}
