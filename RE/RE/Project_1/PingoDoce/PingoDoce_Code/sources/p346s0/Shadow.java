package p346s0;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p393v0.C11015f0;
import p393v0.GraphicsLayerScope;
import p393v0.InterfaceC11001b1;
import p468yc.C13195u;
import p479z1.C13605g;

/* renamed from: s0.j */
/* loaded from: classes.dex */
public final class Shadow {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Shadow.kt */
    /* renamed from: s0.j$a */
    /* loaded from: classes.dex */
    public static final class C10033a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f26227w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11001b1 f26228x;

        /* renamed from: y */
        final /* synthetic */ boolean f26229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10033a(float f, InterfaceC11001b1 interfaceC11001b1, boolean z) {
            super(1);
            this.f26227w = f;
            this.f26228x = interfaceC11001b1;
            this.f26229y = z;
        }

        /* renamed from: a */
        public final void m9352a(GraphicsLayerScope graphicsLayerScope) {
            Intrinsics.isThisObjectNull(graphicsLayerScope, "$this$graphicsLayer");
            graphicsLayerScope.m6497v(graphicsLayerScope.m899A(this.f26227w));
            graphicsLayerScope.m6496z(this.f26228x);
            graphicsLayerScope.m6509L(this.f26229y);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9352a((GraphicsLayerScope) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: s0.j$b */
    /* loaded from: classes.dex */
    public static final class C10034b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ float f26230w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC11001b1 f26231x;

        /* renamed from: y */
        final /* synthetic */ boolean f26232y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10034b(float f, InterfaceC11001b1 interfaceC11001b1, boolean z) {
            super(1);
            this.f26230w = f;
            this.f26231x = interfaceC11001b1;
            this.f26232y = z;
        }

        /* renamed from: a */
        public final void m9351a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("shadow");
            c0816w0.m39492a().m39649b("elevation", C13605g.m878d(this.f26230w));
            c0816w0.m39492a().m39649b("shape", this.f26231x);
            c0816w0.m39492a().m39649b("clip", Boolean.valueOf(this.f26232y));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m9351a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m9353a(InterfaceC9570f interfaceC9570f, float f, InterfaceC11001b1 interfaceC11001b1, boolean z) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$shadow");
        Intrinsics.isThisObjectNull(interfaceC11001b1, "shape");
        if (C13605g.m876f(f, C13605g.m875g(0)) > 0 || z) {
            return C0812v0.m39496b(interfaceC9570f, C0812v0.m39495c() ? new C10034b(f, interfaceC11001b1, z) : C0812v0.m39497a(), C11015f0.m6530a(InterfaceC9570f.f25164r, new C10033a(f, interfaceC11001b1, z)));
        }
        return interfaceC9570f;
    }
}
