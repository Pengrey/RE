package androidx.lifecycle;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class FlowLiveData {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowLiveData.kt */
    @InterfaceC6759f(m20197c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", m20196f = "FlowLiveData.kt", m20195l = {149}, m20194m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.l$a */
    /* loaded from: classes.dex */
    public static final class C1457a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        private /* synthetic */ Object f4324x;

        /* renamed from: y */
        int f4325y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6785c f4326z;

        /* compiled from: Collect.kt */
        /* renamed from: androidx.lifecycle.l$a$a */
        /* loaded from: classes.dex */
        public static final class C1458a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC1424a0 f4327w;

            public C1458a(InterfaceC1424a0 interfaceC1424a0) {
                this.f4327w = interfaceC1424a0;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                Object m34636d;
                Object mo37066a = this.f4327w.mo37066a(obj, interfaceC1886d);
                m34636d = C2116d.m34636d();
                return mo37066a == m34636d ? mo37066a : C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1457a(InterfaceC6785c interfaceC6785c, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f4326z = interfaceC6785c;
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return ((C1457a) create(obj, (InterfaceC1886d) obj2)).invokeSuspend(C13195u.f34156a);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            Intrinsics.isThisObjectNull(interfaceC1886d, "completion");
            C1457a c1457a = new C1457a(this.f4326z, interfaceC1886d);
            c1457a.f4324x = obj;
            return c1457a;
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f4325y;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6785c interfaceC6785c = this.f4326z;
                C1458a c1458a = new C1458a((InterfaceC1424a0) this.f4324x);
                this.f4325y = 1;
                if (interfaceC6785c.mo20086d(c1458a, this) == m34636d) {
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

    /* renamed from: a */
    public static final LiveData m37008a(InterfaceC6785c interfaceC6785c, CoroutineContext coroutineContext, long j) {
        Intrinsics.isThisObjectNull(interfaceC6785c, "$this$asLiveData");
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        return C1441g.m37041a(coroutineContext, j, new C1457a(interfaceC6785c, null));
    }

    /* renamed from: b */
    public static /* synthetic */ LiveData m37007b(InterfaceC6785c interfaceC6785c, CoroutineContext coroutineContext, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C1894h.f5621w;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return m37008a(interfaceC6785c, coroutineContext, j);
    }
}
