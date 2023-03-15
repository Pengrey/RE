package p432x;

import android.view.View;
import androidx.compose.p018ui.platform.C0824y;
import id.InterfaceC6112p;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p127h1.C5784k0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: LazyLayoutPrefetcher.android.kt */
/* renamed from: x.o */
/* loaded from: classes.dex */
public final class C12227o {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyLayoutPrefetcher.android.kt */
    /* renamed from: x.o$a */
    /* loaded from: classes.dex */
    public static final class C12228a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ int f32258A;

        /* renamed from: w */
        final /* synthetic */ C12222l f32259w;

        /* renamed from: x */
        final /* synthetic */ LazyLayoutState f32260x;

        /* renamed from: y */
        final /* synthetic */ LazyLayoutItemContentFactory f32261y;

        /* renamed from: z */
        final /* synthetic */ C5784k0 f32262z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12228a(C12222l c12222l, LazyLayoutState lazyLayoutState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C5784k0 c5784k0, int i) {
            super(2);
            this.f32259w = c12222l;
            this.f32260x = lazyLayoutState;
            this.f32261y = lazyLayoutItemContentFactory;
            this.f32262z = c5784k0;
            this.f32258A = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m3341a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m3341a(InterfaceC5179i interfaceC5179i, int i) {
            C12227o.m3343a(this.f32259w, this.f32260x, this.f32261y, this.f32262z, interfaceC5179i, this.f32258A | 1);
        }
    }

    /* renamed from: a */
    public static final void m3343a(C12222l c12222l, LazyLayoutState lazyLayoutState, LazyLayoutItemContentFactory lazyLayoutItemContentFactory, C5784k0 c5784k0, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(c12222l, "prefetchPolicy");
        Intrinsics.isThisObjectNull(lazyLayoutState, "state");
        Intrinsics.isThisObjectNull(lazyLayoutItemContentFactory, "itemContentFactory");
        Intrinsics.isThisObjectNull(c5784k0, "subcomposeLayoutState");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(-649386156);
        View view = (View) mo25249u.mo25256n(C0824y.m39469i());
        int i2 = C5784k0.f16095n;
        mo25249u.mo25263g(-3686095);
        boolean mo25276I = mo25249u.mo25276I(c5784k0) | mo25249u.mo25276I(c12222l) | mo25249u.mo25276I(view);
        Object mo25262h = mo25249u.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25249u.mo25247w(new RunnableC12225n(c12222l, lazyLayoutState, c5784k0, lazyLayoutItemContentFactory, view));
        }
        mo25249u.mo25282C();
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C12228a(c12222l, lazyLayoutState, lazyLayoutItemContentFactory, c5784k0, i));
    }
}
