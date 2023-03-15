package androidx.lifecycle;

import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* compiled from: Lifecycle.kt */
/* renamed from: androidx.lifecycle.q */
/* loaded from: classes.dex */
public abstract class AbstractC1474q implements InterfaceC10524i0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycle.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m20196f = "Lifecycle.kt", m20195l = {74}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.q$a */
    /* loaded from: classes.dex */
    public static final class C1475a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f4350x;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6112p f4352z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1475a(InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f4352z = interfaceC6112p;
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1475a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            return new C1475a(this.f4352z, interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4350x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AbstractC1469p m36986b = AbstractC1474q.this.m36986b();
                InterfaceC6112p interfaceC6112p = this.f4352z;
                this.f4350x = 1;
                if (C1445i0.m37032a(m36986b, interfaceC6112p, this) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Lifecycle.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m20196f = "Lifecycle.kt", m20195l = {C0868i.f2998z0}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.q$b */
    /* loaded from: classes.dex */
    public static final class C1476b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f4353x;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6112p f4355z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1476b(InterfaceC6112p interfaceC6112p, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f4355z = interfaceC6112p;
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1476b) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            return new C1476b(this.f4355z, interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4353x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AbstractC1469p m36986b = AbstractC1474q.this.m36986b();
                InterfaceC6112p interfaceC6112p = this.f4355z;
                this.f4353x = 1;
                if (C1445i0.m37031b(m36986b, interfaceC6112p, this) == m34636d) {
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

    /* renamed from: b */
    public abstract AbstractC1469p m36986b();

    /* renamed from: h */
    public final InterfaceC10574t1 m36985h(InterfaceC6112p interfaceC6112p) {
        InterfaceC10574t1 m20158d;
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        m20158d = C6772d.m20158d(this, null, null, new C1475a(interfaceC6112p, null), 3, null);
        return m20158d;
    }

    /* renamed from: i */
    public final InterfaceC10574t1 m36984i(InterfaceC6112p interfaceC6112p) {
        InterfaceC10574t1 m20158d;
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        m20158d = C6772d.m20158d(this, null, null, new C1476b(interfaceC6112p, null), 3, null);
        return m20158d;
    }
}
