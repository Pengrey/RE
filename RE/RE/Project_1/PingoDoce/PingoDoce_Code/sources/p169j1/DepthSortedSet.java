package p169j1;

import id.InterfaceC6097a;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: j1.c */
/* loaded from: classes.dex */
public final class DepthSortedSet {

    /* renamed from: a */
    private final boolean f17092a;

    /* renamed from: b */
    private final InterfaceC13178g f17093b;

    /* renamed from: c */
    private final Comparator f17094c;

    /* renamed from: d */
    private final C6283m0 f17095d;

    /* compiled from: DepthSortedSet.kt */
    /* renamed from: j1.c$a */
    /* loaded from: classes.dex */
    public static final class C6238a implements Comparator {
        C6238a() {
        }

        /* renamed from: a */
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            Intrinsics.isThisObjectNull(layoutNode, "l1");
            Intrinsics.isThisObjectNull(layoutNode2, "l2");
            int isLessOrEqual = Intrinsics.isLessOrEqual(layoutNode.m21571L(), layoutNode2.m21571L());
            return isLessOrEqual != 0 ? isLessOrEqual : Intrinsics.isLessOrEqual(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DepthSortedSet.kt */
    /* renamed from: j1.c$b */
    /* loaded from: classes.dex */
    public static final class C6239b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C6239b f17096w = new C6239b();

        C6239b() {
            super(0);
        }

        /* renamed from: a */
        public final Map mo42214q() {
            return new LinkedHashMap();
        }
    }

    public DepthSortedSet(boolean z) {
        InterfaceC13178g m1463b;
        this.f17092a = z;
        m1463b = LazyJVM.m1463b(EnumC6754a.NONE, C6239b.f17096w);
        this.f17093b = m1463b;
        C6238a c6238a = new C6238a();
        this.f17094c = c6238a;
        this.f17095d = new C6283m0(c6238a);
    }

    /* renamed from: c */
    private final Map m21723c() {
        return (Map) this.f17093b.getValue();
    }

    /* renamed from: a */
    public final void m21725a(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        if (layoutNode.m21515q0()) {
            if (this.f17092a) {
                Integer num = (Integer) m21723c().get(layoutNode);
                if (num == null) {
                    m21723c().put(layoutNode, Integer.valueOf(layoutNode.m21571L()));
                } else {
                    if (!(num.intValue() == layoutNode.m21571L())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f17095d.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean m21724b(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        boolean contains = this.f17095d.contains(layoutNode);
        if (this.f17092a) {
            if (!(contains == m21723c().containsKey(layoutNode))) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    /* renamed from: d */
    public final boolean m21722d() {
        return this.f17095d.isEmpty();
    }

    /* renamed from: e */
    public final LayoutNode m21721e() {
        LayoutNode layoutNode = (LayoutNode) this.f17095d.first();
        Intrinsics.checkIfNull(layoutNode, "node");
        m21720f(layoutNode);
        return layoutNode;
    }

    /* renamed from: f */
    public final boolean m21720f(LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "node");
        if (layoutNode.m21515q0()) {
            boolean remove = this.f17095d.remove(layoutNode);
            if (this.f17092a) {
                Integer num = (Integer) m21723c().remove(layoutNode);
                if (remove) {
                    int m21571L = layoutNode.m21571L();
                    if (num == null || num.intValue() != m21571L) {
                        r3 = false;
                    }
                    if (!r3) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (!(num == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String treeSet = this.f17095d.toString();
        Intrinsics.checkIfNull(treeSet, "set.toString()");
        return treeSet;
    }
}
