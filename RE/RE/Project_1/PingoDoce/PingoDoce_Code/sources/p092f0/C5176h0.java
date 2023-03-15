package p092f0;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.AbstractC6438m;
import p468yc.C13183m;
import p468yc.C13195u;
import td.C10534k;
import td.InterfaceC10529j;

/* renamed from: f0.h0 */
/* loaded from: classes.dex */
public final class C5176h0 {

    /* renamed from: a */
    private final Object f14319a = new Object();

    /* renamed from: b */
    private List<InterfaceC1886d<C13195u>> f14320b = new ArrayList();

    /* renamed from: c */
    private List<InterfaceC1886d<C13195u>> f14321c = new ArrayList();

    /* renamed from: d */
    private boolean f14322d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Latch.kt */
    /* renamed from: f0.h0$a */
    /* loaded from: classes.dex */
    public static final class C5177a extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

        /* renamed from: x */
        final /* synthetic */ InterfaceC10529j<C13195u> f14324x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C5177a(InterfaceC10529j<? super C13195u> interfaceC10529j) {
            super(1);
            this.f14324x = interfaceC10529j;
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            invoke2(th2);
            return C13195u.f34156a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            Object obj = C5176h0.this.f14319a;
            C5176h0 c5176h0 = C5176h0.this;
            InterfaceC10529j<C13195u> interfaceC10529j = this.f14324x;
            synchronized (obj) {
                c5176h0.f14320b.remove(interfaceC10529j);
                C13195u c13195u = C13195u.f34156a;
            }
        }
    }

    /* renamed from: c */
    public final Object m25293c(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        if (m25291e()) {
            return C13195u.f34156a;
        }
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        synchronized (this.f14319a) {
            this.f14320b.add(c10534k);
        }
        c10534k.mo7778n(new C5177a(c10534k));
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d2 = C2116d.m34636d();
        return m7728t == m34636d2 ? m7728t : C13195u.f34156a;
    }

    /* renamed from: d */
    public final void m25292d() {
        synchronized (this.f14319a) {
            this.f14322d = false;
            C13195u c13195u = C13195u.f34156a;
        }
    }

    /* renamed from: e */
    public final boolean m25291e() {
        boolean z;
        synchronized (this.f14319a) {
            z = this.f14322d;
        }
        return z;
    }

    /* renamed from: f */
    public final void m25290f() {
        synchronized (this.f14319a) {
            if (m25291e()) {
                return;
            }
            List<InterfaceC1886d<C13195u>> list = this.f14320b;
            this.f14320b = this.f14321c;
            this.f14321c = list;
            this.f14322d = true;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                list.get(i).resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
            list.clear();
            C13195u c13195u = C13195u.f34156a;
        }
    }
}
