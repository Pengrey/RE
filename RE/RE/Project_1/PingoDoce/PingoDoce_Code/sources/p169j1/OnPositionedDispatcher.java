package p169j1;

import java.util.Comparator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p112g0.MutableVector;
import p181jd.Intrinsics;

/* renamed from: j1.c0 */
/* loaded from: classes.dex */
public final class OnPositionedDispatcher {

    /* renamed from: a */
    private final MutableVector f17097a = new MutableVector(new LayoutNode[16], 0);

    /* compiled from: OnPositionedDispatcher.kt */
    /* renamed from: j1.c0$a */
    /* loaded from: classes.dex */
    public static final class C6240a {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: OnPositionedDispatcher.kt */
        /* renamed from: j1.c0$a$a */
        /* loaded from: classes.dex */
        public static final class C6241a implements Comparator {

            /* renamed from: w */
            public static final C6241a f17098w = new C6241a();

            private C6241a() {
            }

            /* renamed from: a */
            public int mo20444a(LayoutNode layoutNode, LayoutNode layoutNode2) {
                Intrinsics.isThisObjectNull(layoutNode, "a");
                Intrinsics.isThisObjectNull(layoutNode2, "b");
                int isLessOrEqual = Intrinsics.isLessOrEqual(layoutNode2.m21571L(), layoutNode.m21571L());
                return isLessOrEqual != 0 ? isLessOrEqual : Intrinsics.isLessOrEqual(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private C6240a() {
        }

        public /* synthetic */ C6240a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6240a(null);
    }

    /* renamed from: b */
    private final void m21716b(LayoutNode layoutNode) {
        layoutNode.m21583F();
        int i = 0;
        layoutNode.m21560Q0(false);
        MutableVector m21537f0 = layoutNode.m21537f0();
        int m23649p = m21537f0.m23649p();
        if (m23649p > 0) {
            Object[] m23650o = m21537f0.m23650o();
            do {
                m21716b((LayoutNode) m23650o[i]);
                i++;
            } while (i < m23649p);
        }
    }

    /* renamed from: a */
    public final void m21717a() {
        this.f17097a.m23639z(C6240a.C6241a.f17098w);
        MutableVector mutableVector = this.f17097a;
        int m23649p = mutableVector.m23649p();
        if (m23649p > 0) {
            int i = m23649p - 1;
            Object[] m23650o = mutableVector.m23650o();
            do {
                LayoutNode layoutNode = (LayoutNode) m23650o[i];
                if (layoutNode.m21552W()) {
                    m21716b(layoutNode);
                }
                i--;
            } while (i >= 0);
            this.f17097a.m23654i();
        }
        this.f17097a.m23654i();
    }

    /* renamed from: c */
    public final void m21715c(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        this.f17097a.m23659c(layoutNode);
        layoutNode.m21560Q0(true);
    }

    /* renamed from: d */
    public final void m21714d(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "rootNode");
        this.f17097a.m23654i();
        this.f17097a.m23659c(layoutNode);
        layoutNode.m21560Q0(true);
    }
}
