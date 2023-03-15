package p372u;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p357t.EnumC10314o;
import p357t.MutatorMutex;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.f */
/* loaded from: classes.dex */
public final class Draggable implements InterfaceC10751n {

    /* renamed from: a */
    private final InterfaceC6108l f27507a;

    /* renamed from: b */
    private final InterfaceC10729l f27508b;

    /* renamed from: c */
    private final MutatorMutex f27509c;

    /* compiled from: Draggable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", m20196f = "Draggable.kt", m20195l = {421}, m20194m = "invokeSuspend")
    /* renamed from: u.f$a */
    /* loaded from: classes.dex */
    static final class C10673a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC6112p f27510A;

        /* renamed from: x */
        int f27511x;

        /* renamed from: z */
        final /* synthetic */ EnumC10314o f27513z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10673a(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f27513z = enumC10314o;
            this.f27510A = interfaceC6112p;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10673a(this.f27513z, this.f27510A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10673a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f27511x;
            if (i == 0) {
                C13186n.m1453b(obj);
                MutatorMutex m7351c = Draggable.m7351c(Draggable.this);
                InterfaceC10729l m7352b = Draggable.m7352b(Draggable.this);
                EnumC10314o enumC10314o = this.f27513z;
                InterfaceC6112p interfaceC6112p = this.f27510A;
                this.f27511x = 1;
                if (m7351c.m8293d(m7352b, enumC10314o, interfaceC6112p, this) == m34636d) {
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

    /* compiled from: Draggable.kt */
    /* renamed from: u.f$b */
    /* loaded from: classes.dex */
    public static final class C10674b implements InterfaceC10729l {
        C10674b() {
        }

        /* renamed from: a */
        public void mo7260a(float f) {
            Draggable.this.m7350d().mo9587d(Float.valueOf(f));
        }
    }

    public Draggable(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onDelta");
        this.f27507a = interfaceC6108l;
        this.f27508b = new C10674b();
        this.f27509c = new MutatorMutex();
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC10729l m7352b(Draggable draggable) {
        return draggable.f27508b;
    }

    /* renamed from: c */
    public static final /* synthetic */ MutatorMutex m7351c(Draggable draggable) {
        return draggable.f27509c;
    }

    /* renamed from: a */
    public Object mo7224a(EnumC10314o enumC10314o, InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C10673a(enumC10314o, interfaceC6112p, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: d */
    public final InterfaceC6108l m7350d() {
        return this.f27507a;
    }
}
