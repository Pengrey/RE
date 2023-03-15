package p169j1;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p149i1.AbstractC5988a;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: j1.y */
/* loaded from: classes.dex */
public final class ModifierLocalConsumerNode extends DelegatingLayoutNodeWrapper implements InterfaceC5991e {

    /* renamed from: Z */
    private static final InterfaceC6108l f17265Z;

    /* compiled from: ModifierLocalConsumerNode.kt */
    /* renamed from: j1.y$a */
    /* loaded from: classes.dex */
    static final class C6295a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C6295a f17266w = new C6295a();

        C6295a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21281a(ModifierLocalConsumerNode modifierLocalConsumerNode) {
            Intrinsics.isThisObjectNull(modifierLocalConsumerNode, "node");
            ModifierLocalConsumerNode.m21285Y1(modifierLocalConsumerNode);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21281a((ModifierLocalConsumerNode) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: ModifierLocalConsumerNode.kt */
    /* renamed from: j1.y$b */
    /* loaded from: classes.dex */
    public static final class C6296b {
        private C6296b() {
        }

        public /* synthetic */ C6296b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ModifierLocalConsumerNode.kt */
    /* renamed from: j1.y$c */
    /* loaded from: classes.dex */
    public static final class C6297c extends AbstractC6438m implements InterfaceC6097a {
        C6297c() {
            super(0);
        }

        /* renamed from: a */
        public final void m21280a() {
            ((ModifierLocalConsumer) ModifierLocalConsumerNode.this.m21755P1()).m22453K(ModifierLocalConsumerNode.this);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m21280a();
            return C13195u.f34156a;
        }
    }

    static {
        new C6296b(null);
        f17265Z = C6295a.f17266w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalConsumerNode(LayoutNodeWrapper layoutNodeWrapper, ModifierLocalConsumer modifierLocalConsumer) {
        super(layoutNodeWrapper, modifierLocalConsumer);
        Intrinsics.isThisObjectNull(layoutNodeWrapper, "wrapped");
        Intrinsics.isThisObjectNull(modifierLocalConsumer, "modifier");
    }

    /* renamed from: Y1 */
    public static final /* synthetic */ void m21285Y1(ModifierLocalConsumerNode modifierLocalConsumerNode) {
        modifierLocalConsumerNode.m21284Z1();
    }

    /* renamed from: Z1 */
    private final void m21284Z1() {
        if (mo23109S()) {
            C6284n.m21433a(m21378c1()).getSnapshotObserver().m21610e(this, f17265Z, new C6297c());
        }
    }

    /* renamed from: C0 */
    public void m21286C0() {
        super.m21420C0();
        m21284Z1();
    }

    /* renamed from: t */
    public Object mo22443t(AbstractC5988a abstractC5988a) {
        Intrinsics.isThisObjectNull(abstractC5988a, "<this>");
        return m21344z1(abstractC5988a);
    }

    /* renamed from: y1 */
    public void m21282y1() {
        super.m21346y1();
        m21284Z1();
    }
}
