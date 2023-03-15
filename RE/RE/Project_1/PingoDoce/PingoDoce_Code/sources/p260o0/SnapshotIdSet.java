package p260o0;

import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6763k;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p337rd.AbstractC9872g;
import p337rd.InterfaceC9870e;
import p337rd.SequenceBuilder;
import p468yc.C13195u;
import p489zc.Iterables;
import p489zc._ArraysJvm;
import p489zc._Collections;

/* renamed from: o0.j */
/* loaded from: classes.dex */
public final class SnapshotIdSet implements Iterable, InterfaceC6650a {

    /* renamed from: A */
    public static final C7968a f20653A = new C7968a(null);

    /* renamed from: B */
    private static final SnapshotIdSet f20654B = new SnapshotIdSet(0, 0, 0, null);

    /* renamed from: w */
    private final long f20655w;

    /* renamed from: x */
    private final long f20656x;

    /* renamed from: y */
    private final int f20657y;

    /* renamed from: z */
    private final int[] f20658z;

    /* compiled from: SnapshotIdSet.kt */
    /* renamed from: o0.j$a */
    /* loaded from: classes.dex */
    public static final class C7968a {
        private C7968a() {
        }

        public /* synthetic */ C7968a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SnapshotIdSet m17347a() {
            return SnapshotIdSet.m17357f();
        }
    }

    /* compiled from: SnapshotIdSet.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", m20196f = "SnapshotIdSet.kt", m20195l = {268, 273, 280}, m20194m = "invokeSuspend")
    /* renamed from: o0.j$b */
    /* loaded from: classes.dex */
    static final class C7969b extends AbstractC6763k implements InterfaceC6112p {

        /* renamed from: A */
        int f20659A;

        /* renamed from: B */
        private /* synthetic */ Object f20660B;

        /* renamed from: x */
        Object f20662x;

        /* renamed from: y */
        int f20663y;

        /* renamed from: z */
        int f20664z;

        C7969b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C7969b c7969b = new C7969b(interfaceC1886d);
            c7969b.f20660B = obj;
            return c7969b;
        }

        /* renamed from: d */
        public final Object mo39856d(AbstractC9872g abstractC9872g, InterfaceC1886d interfaceC1886d) {
            return ((C7969b) create(abstractC9872g, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007c). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p260o0.SnapshotIdSet.C7969b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private SnapshotIdSet(long j, long j2, int i, int[] iArr) {
        this.f20655w = j;
        this.f20656x = j2;
        this.f20657y = i;
        this.f20658z = iArr;
    }

    /* renamed from: b */
    public static final /* synthetic */ int[] m17358b(SnapshotIdSet snapshotIdSet) {
        return snapshotIdSet.f20658z;
    }

    /* renamed from: f */
    public static final /* synthetic */ SnapshotIdSet m17357f() {
        return f20654B;
    }

    /* renamed from: h */
    public static final /* synthetic */ int m17356h(SnapshotIdSet snapshotIdSet) {
        return snapshotIdSet.f20657y;
    }

    /* renamed from: l */
    public static final /* synthetic */ long m17355l(SnapshotIdSet snapshotIdSet) {
        return snapshotIdSet.f20656x;
    }

    /* renamed from: o */
    public static final /* synthetic */ long m17354o(SnapshotIdSet snapshotIdSet) {
        return snapshotIdSet.f20655w;
    }

    public Iterator iterator() {
        InterfaceC9870e m9762b;
        m9762b = SequenceBuilder.m9762b(new C7969b(null));
        return m9762b.iterator();
    }

    /* renamed from: p */
    public final SnapshotIdSet m17353p(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f20654B;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet2;
        }
        int i = snapshotIdSet.f20657y;
        int i2 = this.f20657y;
        if (i == i2) {
            int[] iArr = snapshotIdSet.f20658z;
            int[] iArr2 = this.f20658z;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.f20655w & (~snapshotIdSet.f20655w), this.f20656x & (~snapshotIdSet.f20656x), i2, iArr2);
            }
        }
        Iterator it = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.m17352q(((Number) it.next()).intValue());
        }
        return snapshotIdSet3;
    }

    /* renamed from: q */
    public final SnapshotIdSet m17352q(int i) {
        int[] iArr;
        int m17344b;
        int i2 = this.f20657y;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f20656x;
            if ((j2 & j) != 0) {
                return new SnapshotIdSet(this.f20655w, j2 & (~j), i2, this.f20658z);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f20655w;
            if ((j4 & j3) != 0) {
                return new SnapshotIdSet(j4 & (~j3), this.f20656x, i2, this.f20658z);
            }
        } else if (i3 < 0 && (iArr = this.f20658z) != null && (m17344b = C7970k.m17344b(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new SnapshotIdSet(this.f20655w, this.f20656x, this.f20657y, null);
            }
            int[] iArr2 = new int[length];
            if (m17344b > 0) {
                _ArraysJvm.m317g(iArr, iArr2, 0, 0, m17344b);
            }
            if (m17344b < length) {
                _ArraysJvm.m317g(iArr, iArr2, m17344b, m17344b + 1, length + 1);
            }
            return new SnapshotIdSet(this.f20655w, this.f20656x, this.f20657y, iArr2);
        }
        return this;
    }

    /* renamed from: t */
    public final boolean m17351t(int i) {
        int[] iArr;
        int i2 = i - this.f20657y;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f20656x) != 0;
        } else if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f20655w) != 0;
        } else if (i2 <= 0 && (iArr = this.f20658z) != null) {
            return C7970k.m17344b(iArr, i) >= 0;
        } else {
            return false;
        }
    }

    public String toString() {
        int m186r;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        m186r = Iterables.m186r(this, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb2.append(ListUtils.m17477d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    /* renamed from: u */
    public final int m17350u(int i) {
        int[] iArr = this.f20658z;
        if (iArr != null) {
            return iArr[0];
        }
        long j = this.f20656x;
        if (j != 0) {
            return this.f20657y + C7970k.m17345a(j);
        }
        long j2 = this.f20655w;
        return j2 != 0 ? this.f20657y + 64 + C7970k.m17345a(j2) : i;
    }

    /* renamed from: v */
    public final SnapshotIdSet m17349v(SnapshotIdSet snapshotIdSet) {
        Intrinsics.isThisObjectNull(snapshotIdSet, "bits");
        SnapshotIdSet snapshotIdSet2 = f20654B;
        if (snapshotIdSet == snapshotIdSet2) {
            return this;
        }
        if (this == snapshotIdSet2) {
            return snapshotIdSet;
        }
        int i = snapshotIdSet.f20657y;
        int i2 = this.f20657y;
        if (i == i2) {
            int[] iArr = snapshotIdSet.f20658z;
            int[] iArr2 = this.f20658z;
            if (iArr == iArr2) {
                return new SnapshotIdSet(this.f20655w | snapshotIdSet.f20655w, this.f20656x | snapshotIdSet.f20656x, i2, iArr2);
            }
        }
        if (this.f20658z == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                snapshotIdSet = snapshotIdSet.m17348x(((Number) it.next()).intValue());
            }
            return snapshotIdSet;
        }
        Iterator it2 = snapshotIdSet.iterator();
        SnapshotIdSet snapshotIdSet3 = this;
        while (it2.hasNext()) {
            snapshotIdSet3 = snapshotIdSet3.m17348x(((Number) it2.next()).intValue());
        }
        return snapshotIdSet3;
    }

    /* renamed from: x */
    public final SnapshotIdSet m17348x(int i) {
        long j;
        int i2 = this.f20657y;
        int i3 = i - i2;
        long j2 = 0;
        if (i3 >= 0 && i3 < 64) {
            long j3 = 1 << i3;
            long j4 = this.f20656x;
            if ((j4 & j3) == 0) {
                return new SnapshotIdSet(this.f20655w, j4 | j3, i2, this.f20658z);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j5 = 1 << (i3 - 64);
            long j6 = this.f20655w;
            if ((j6 & j5) == 0) {
                return new SnapshotIdSet(j6 | j5, this.f20656x, i2, this.f20658z);
            }
        } else if (i3 >= 128) {
            if (!m17351t(i)) {
                long j7 = this.f20655w;
                long j8 = this.f20656x;
                int i4 = this.f20657y;
                int i5 = ((i + 1) / 64) * 64;
                long j9 = j8;
                long j10 = j7;
                ArrayList arrayList = null;
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    if (j9 != j2) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr = this.f20658z;
                            if (iArr != null) {
                                int length = iArr.length;
                                int i6 = 0;
                                while (i6 < length) {
                                    int i7 = iArr[i6];
                                    i6++;
                                    arrayList.add(Integer.valueOf(i7));
                                }
                            }
                        }
                        int i8 = 0;
                        while (i8 < 64) {
                            int i9 = i8 + 1;
                            if (((1 << i8) & j9) != 0) {
                                arrayList.add(Integer.valueOf(i8 + i4));
                            }
                            i8 = i9;
                        }
                        j = 0;
                    } else {
                        j = j2;
                    }
                    if (j10 == j) {
                        i4 = i5;
                        j9 = j;
                        break;
                    }
                    i4 += 64;
                    j9 = j10;
                    j2 = j;
                    j10 = j2;
                }
                int[] m456m0 = arrayList == null ? null : _Collections.m456m0(arrayList);
                return new SnapshotIdSet(j10, j9, i4, m456m0 == null ? this.f20658z : m456m0).m17348x(i);
            }
        } else {
            int[] iArr2 = this.f20658z;
            if (iArr2 == null) {
                return new SnapshotIdSet(this.f20655w, this.f20656x, i2, new int[]{i});
            }
            int m17344b = C7970k.m17344b(iArr2, i);
            if (m17344b < 0) {
                int i10 = -(m17344b + 1);
                int length2 = iArr2.length + 1;
                int[] iArr3 = new int[length2];
                _ArraysJvm.m317g(iArr2, iArr3, 0, 0, i10);
                _ArraysJvm.m317g(iArr2, iArr3, i10 + 1, i10, length2 - 1);
                iArr3[i10] = i;
                return new SnapshotIdSet(this.f20655w, this.f20656x, this.f20657y, iArr3);
            }
        }
        return this;
    }
}
