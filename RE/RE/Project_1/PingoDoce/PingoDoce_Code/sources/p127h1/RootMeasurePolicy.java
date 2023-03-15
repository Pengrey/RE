package p127h1;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import p127h1.MeasureScope;
import p127h1.Placeable;
import p169j1.LayoutNode;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p479z1.C13599b;
import p479z1.C13601c;

/* renamed from: h1.g0 */
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.AbstractC6273f {

    /* renamed from: a */
    public static final RootMeasurePolicy f16077a = new RootMeasurePolicy();

    /* compiled from: RootMeasurePolicy.kt */
    /* renamed from: h1.g0$a */
    /* loaded from: classes.dex */
    static final class C5768a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C5768a f16078w = new C5768a();

        C5768a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23123a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23123a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    /* renamed from: h1.g0$b */
    /* loaded from: classes.dex */
    static final class C5769b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ Placeable f16079w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5769b(Placeable placeable) {
            super(1);
            this.f16079w = placeable;
        }

        /* renamed from: a */
        public final void m23122a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            Placeable.AbstractC5751a.m23155r(abstractC5751a, this.f16079w, 0, 0, 0.0f, null, 12, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23122a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    /* renamed from: h1.g0$c */
    /* loaded from: classes.dex */
    static final class C5770c extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ List f16080w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5770c(List list) {
            super(1);
            this.f16080w = list;
        }

        /* renamed from: a */
        public final void m23121a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$layout");
            List list = this.f16080w;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Placeable.AbstractC5751a.m23155r(abstractC5751a, (Placeable) list.get(i), 0, 0, 0.0f, null, 12, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23121a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    /* renamed from: a */
    public InterfaceC5805t mo23006a(MeasureScope measureScope, List list, long j) {
        Intrinsics.isThisObjectNull(measureScope, "$receiver");
        Intrinsics.isThisObjectNull(list, "measurables");
        if (list.isEmpty()) {
            return MeasureScope.C5806a.m22999b(measureScope, C13599b.m914p(j), C13599b.m915o(j), null, C5768a.f16078w, 4, null);
        }
        int i = 0;
        if (list.size() == 1) {
            Placeable mo23007n = ((InterfaceC5803r) list.get(0)).mo23007n(j);
            return MeasureScope.C5806a.m22999b(measureScope, C13601c.m901g(j, mo23007n.m23177q0()), C13601c.m902f(j, mo23007n.m23182l0()), null, new C5769b(mo23007n), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((InterfaceC5803r) list.get(i2)).mo23007n(j));
        }
        int size2 = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i < size2) {
            int i5 = i + 1;
            Placeable placeable = (Placeable) arrayList.get(i);
            i3 = Math.max(placeable.m23177q0(), i3);
            i4 = Math.max(placeable.m23182l0(), i4);
            i = i5;
        }
        return MeasureScope.C5806a.m22999b(measureScope, C13601c.m901g(j, i3), C13601c.m902f(j, i4), null, new C5770c(arrayList), 4, null);
    }
}
