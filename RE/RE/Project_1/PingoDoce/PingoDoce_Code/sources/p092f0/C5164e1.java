package p092f0;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ExceptionsH;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p285p0.InterfaceC8333a;

/* compiled from: SlotTable.kt */
/* renamed from: f0.e1 */
/* loaded from: classes.dex */
public final class C5164e1 implements InterfaceC8333a, Iterable, InterfaceC6650a {

    /* renamed from: A */
    private int f14267A;

    /* renamed from: B */
    private boolean f14268B;

    /* renamed from: C */
    private int f14269C;

    /* renamed from: x */
    private int f14272x;

    /* renamed from: z */
    private int f14274z;

    /* renamed from: w */
    private int[] f14271w = new int[0];

    /* renamed from: y */
    private Object[] f14273y = new Object[0];

    /* renamed from: D */
    private ArrayList f14270D = new ArrayList();

    /* renamed from: B */
    public final boolean m25443B(C5159d c5159d) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        if (c5159d.m25510b()) {
            int m25386p = C5168f1.m25386p(this.f14270D, c5159d.m25511a(), this.f14272x);
            if (m25386p >= 0 && Intrinsics.equals(m25438l().get(m25386p), c5159d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m25442C(int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(iArr, "groups");
        Intrinsics.isThisObjectNull(objArr, "slots");
        Intrinsics.isThisObjectNull(arrayList, "anchors");
        this.f14271w = iArr;
        this.f14272x = i;
        this.f14273y = objArr;
        this.f14274z = i2;
        this.f14270D = arrayList;
    }

    /* renamed from: b */
    public final int m25441b(C5159d c5159d) {
        Intrinsics.isThisObjectNull(c5159d, "anchor");
        if (!this.f14268B) {
            if (c5159d.m25510b()) {
                return c5159d.m25511a();
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        C5210k.m25030r("Use active SlotWriter to determine anchor location instead".toString());
        throw new ExceptionsH();
    }

    /* renamed from: f */
    public final void m25440f(C5161d1 c5161d1) {
        Intrinsics.isThisObjectNull(c5161d1, "reader");
        if (c5161d1.m25467s() == this && this.f14267A > 0) {
            this.f14267A--;
            return;
        }
        throw new IllegalArgumentException("Unexpected reader close()".toString());
    }

    /* renamed from: h */
    public final void m25439h(C5173g1 c5173g1, int[] iArr, int i, Object[] objArr, int i2, ArrayList arrayList) {
        Intrinsics.isThisObjectNull(c5173g1, "writer");
        Intrinsics.isThisObjectNull(iArr, "groups");
        Intrinsics.isThisObjectNull(objArr, "slots");
        Intrinsics.isThisObjectNull(arrayList, "anchors");
        if (c5173g1.m25302x() == this && this.f14268B) {
            this.f14268B = false;
            m25442C(iArr, i, objArr, i2, arrayList);
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public boolean isEmpty() {
        return this.f14272x == 0;
    }

    public Iterator iterator() {
        return new SlotTable(this, 0, this.f14272x);
    }

    /* renamed from: l */
    public final ArrayList m25438l() {
        return this.f14270D;
    }

    /* renamed from: o */
    public final int[] m25437o() {
        return this.f14271w;
    }

    /* renamed from: p */
    public final int m25436p() {
        return this.f14272x;
    }

    /* renamed from: q */
    public final Object[] m25435q() {
        return this.f14273y;
    }

    /* renamed from: t */
    public final int m25434t() {
        return this.f14274z;
    }

    /* renamed from: u */
    public final int m25433u() {
        return this.f14269C;
    }

    /* renamed from: v */
    public final boolean m25432v() {
        return this.f14268B;
    }

    /* renamed from: x */
    public final C5161d1 m25431x() {
        if (!this.f14268B) {
            this.f14267A++;
            return new C5161d1(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending".toString());
    }

    /* renamed from: y */
    public final C5173g1 m25430y() {
        if (!this.f14268B) {
            if (this.f14267A <= 0) {
                this.f14268B = true;
                this.f14269C++;
                return new C5173g1(this);
            }
            C5210k.m25030r("Cannot start a writer when a reader is pending".toString());
            throw new ExceptionsH();
        }
        C5210k.m25030r("Cannot start a writer when another writer is pending".toString());
        throw new ExceptionsH();
    }
}
