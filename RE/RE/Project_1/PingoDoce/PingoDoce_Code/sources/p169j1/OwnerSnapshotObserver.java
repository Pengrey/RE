package p169j1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.SnapshotStateObserver;
import p468yc.C13195u;

/* renamed from: j1.h0 */
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {

    /* renamed from: a */
    private final SnapshotStateObserver f17144a;

    /* renamed from: b */
    private final InterfaceC6108l f17145b;

    /* renamed from: c */
    private final InterfaceC6108l f17146c;

    /* renamed from: d */
    private final InterfaceC6108l f17147d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OwnerSnapshotObserver.kt */
    /* renamed from: j1.h0$a */
    /* loaded from: classes.dex */
    public static final class C6260a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6260a f17148w = new C6260a();

        C6260a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean mo9587d(Object obj) {
            Intrinsics.isThisObjectNull(obj, "it");
            return Boolean.valueOf(!((InterfaceC6257g0) obj).mo21638k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OwnerSnapshotObserver.kt */
    /* renamed from: j1.h0$b */
    /* loaded from: classes.dex */
    public static final class C6261b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6261b f17149w = new C6261b();

        C6261b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21605a(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
            if (layoutNode.mo21638k()) {
                layoutNode.m21576I0();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21605a((LayoutNode) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OwnerSnapshotObserver.kt */
    /* renamed from: j1.h0$c */
    /* loaded from: classes.dex */
    public static final class C6262c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6262c f17150w = new C6262c();

        C6262c() {
            super(1);
        }

        /* renamed from: a */
        public final void m21604a(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
            if (layoutNode.mo21638k()) {
                layoutNode.m21576I0();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21604a((LayoutNode) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OwnerSnapshotObserver.kt */
    /* renamed from: j1.h0$d */
    /* loaded from: classes.dex */
    public static final class C6263d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6263d f17151w = new C6263d();

        C6263d() {
            super(1);
        }

        /* renamed from: a */
        public final void m21603a(LayoutNode layoutNode) {
            Intrinsics.isThisObjectNull(layoutNode, "layoutNode");
            if (layoutNode.mo21638k()) {
                layoutNode.m21574J0();
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21603a((LayoutNode) obj);
            return C13195u.f34156a;
        }
    }

    public OwnerSnapshotObserver(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "onChangedExecutor");
        this.f17144a = new SnapshotStateObserver(interfaceC6108l);
        this.f17145b = C6263d.f17151w;
        this.f17146c = C6261b.f17149w;
        this.f17147d = C6262c.f17150w;
    }

    /* renamed from: a */
    public final void m21614a() {
        this.f17144a.m17230h(C6260a.f17148w);
    }

    /* renamed from: b */
    public final void m21613b(LayoutNode layoutNode, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        m21610e(layoutNode, this.f17147d, interfaceC6097a);
    }

    /* renamed from: c */
    public final void m21612c(LayoutNode layoutNode, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        m21610e(layoutNode, this.f17146c, interfaceC6097a);
    }

    /* renamed from: d */
    public final void m21611d(LayoutNode layoutNode, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        m21610e(layoutNode, this.f17145b, interfaceC6097a);
    }

    /* renamed from: e */
    public final void m21610e(InterfaceC6257g0 interfaceC6257g0, InterfaceC6108l interfaceC6108l, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6257g0, "target");
        Intrinsics.isThisObjectNull(interfaceC6108l, "onChanged");
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        this.f17144a.m17228j(interfaceC6257g0, interfaceC6108l, interfaceC6097a);
    }

    /* renamed from: f */
    public final void m21609f() {
        this.f17144a.m17227k();
    }

    /* renamed from: g */
    public final void m21608g() {
        this.f17144a.m17226l();
        this.f17144a.m17231g();
    }

    /* renamed from: h */
    public final void m21607h(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "block");
        this.f17144a.m17225m(interfaceC6097a);
    }
}
