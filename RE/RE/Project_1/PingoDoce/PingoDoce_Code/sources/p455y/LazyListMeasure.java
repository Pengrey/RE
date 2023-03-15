package p455y;

import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import p127h1.Placeable;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p410w.Arrangement;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: y.o */
/* loaded from: classes.dex */
public final class LazyListMeasure {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListMeasure.kt */
    /* renamed from: y.o$a */
    /* loaded from: classes.dex */
    public static final class C13034a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C13034a f33859w = new C13034a();

        C13034a() {
            super(1);
        }

        /* renamed from: a */
        public final void m1857a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$invoke");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1857a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyListMeasure.kt */
    /* renamed from: y.o$b */
    /* loaded from: classes.dex */
    public static final class C13035b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ List f33860w;

        /* renamed from: x */
        final /* synthetic */ LazyMeasuredItem f33861x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13035b(List list, LazyMeasuredItem lazyMeasuredItem) {
            super(1);
            this.f33860w = list;
            this.f33861x = lazyMeasuredItem;
        }

        /* renamed from: a */
        public final void m1856a(Placeable.AbstractC5751a abstractC5751a) {
            Intrinsics.isThisObjectNull(abstractC5751a, "$this$invoke");
            List list = this.f33860w;
            LazyMeasuredItem lazyMeasuredItem = this.f33861x;
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem) list.get(i);
                if (lazyMeasuredItem2 != lazyMeasuredItem) {
                    lazyMeasuredItem2.m1824l(abstractC5751a);
                }
                i = i2;
            }
            LazyMeasuredItem lazyMeasuredItem3 = this.f33861x;
            if (lazyMeasuredItem3 == null) {
                return;
            }
            lazyMeasuredItem3.m1824l(abstractC5751a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1856a((Placeable.AbstractC5751a) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    private static final List m1859a(List list, int i, int i2, int i3, int i4, int i5, boolean z, Arrangement.InterfaceC11424k interfaceC11424k, Arrangement.InterfaceC11416d interfaceC11416d, boolean z2, Density density, EnumC13618o enumC13618o) {
        int i6 = z ? i2 : i;
        boolean z3 = i3 < Math.min(i6, i4);
        if (z3) {
            if (!(i5 == 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        if (z3) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = ((C13043u) list.get(!z2 ? i7 : (size - i7) - 1)).m1803d();
            }
            int[] iArr2 = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr2[i8] = 0;
            }
            if (z) {
                if (interfaceC11424k != null) {
                    interfaceC11424k.m5144b(density, i6, iArr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (interfaceC11416d != null) {
                interfaceC11416d.m5160c(density, i6, iArr, enumC13618o, iArr2);
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            int i9 = 0;
            int i10 = 0;
            while (i9 < size) {
                int i11 = iArr2[i9];
                i9++;
                int i12 = i10 + 1;
                if (z2) {
                    i10 = (size - i10) - 1;
                }
                C13043u c13043u = (C13043u) list.get(i10);
                if (z2) {
                    i11 = (i6 - i11) - c13043u.m1803d();
                }
                arrayList.add(z2 ? 0 : arrayList.size(), c13043u.m1801f(i11, i, i2));
                i10 = i12;
            }
        } else {
            int size2 = list.size();
            int i13 = i5;
            for (int i14 = 0; i14 < size2; i14++) {
                C13043u c13043u2 = (C13043u) list.get(i14);
                arrayList.add(c13043u2.m1801f(i13, i, i2));
                i13 += c13043u2.m1802e();
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0279  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p455y.LazyListMeasureResult m1858b(int r23, p455y.C13044v r24, int r25, int r26, int r27, int r28, int r29, float r30, long r31, boolean r33, java.util.List r34, p410w.Arrangement.InterfaceC11424k r35, p410w.Arrangement.InterfaceC11416d r36, boolean r37, p479z1.Density r38, p479z1.EnumC13618o r39, p455y.LazyListItemPlacementAnimator r40, id.InterfaceC6113q r41) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p455y.LazyListMeasure.m1858b(int, y.v, int, int, int, int, int, float, long, boolean, java.util.List, w.c$k, w.c$d, boolean, z1.d, z1.o, y.i, id.q):y.p");
    }
}
