package p234m5;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p265o5.InterfaceC8020b;
import p468yc.C13183m;
import p468yc.C13195u;
import td.C10534k;
import td.InterfaceC10529j;

/* renamed from: m5.a */
/* loaded from: classes.dex */
public final class SuspendExtensions {

    /* compiled from: SuspendExtensions.kt */
    /* renamed from: m5.a$a */
    /* loaded from: classes.dex */
    public static final class C7131a implements InterfaceC8020b.InterfaceC8021a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC10529j f18940a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC8020b f18941b;

        C7131a(InterfaceC10529j interfaceC10529j, InterfaceC8020b interfaceC8020b) {
            this.f18940a = interfaceC10529j;
            this.f18941b = interfaceC8020b;
        }

        /* renamed from: a */
        public void mo17139a(List list) {
            Intrinsics.isThisObjectNull(list, "result");
            this.f18941b.mo17142b(this);
            InterfaceC10529j interfaceC10529j = this.f18940a;
            C13183m.C13184a c13184a = C13183m.f34143w;
            interfaceC10529j.resumeWith(C13183m.m1458a(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendExtensions.kt */
    /* renamed from: m5.a$b */
    /* loaded from: classes.dex */
    public static final class C7132b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C7131a f18942w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC8020b f18943x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7132b(C7131a c7131a, InterfaceC8020b interfaceC8020b) {
            super(1);
            this.f18942w = c7131a;
            this.f18943x = interfaceC8020b;
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            invoke2((Throwable) obj);
            return C13195u.f34156a;
        }

        /* renamed from: invoke */
        public final void invoke2(Throwable th2) {
            this.f18943x.mo17142b(this.f18942w);
        }
    }

    /* renamed from: a */
    public static final Object m19106a(InterfaceC8020b interfaceC8020b, InterfaceC1886d interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        C7131a c7131a = new C7131a(c10534k, interfaceC8020b);
        interfaceC8020b.mo17140d(c7131a);
        c10534k.mo7778n(new C7132b(c7131a, interfaceC8020b));
        interfaceC8020b.mo17141c();
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }
}
