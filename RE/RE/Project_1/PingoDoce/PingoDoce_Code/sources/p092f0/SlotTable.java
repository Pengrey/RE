package p092f0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p285p0.InterfaceC8334b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f0.c0 */
/* loaded from: classes.dex */
public final class SlotTable implements Iterator, InterfaceC6650a {

    /* renamed from: w */
    private final C5164e1 f14243w;

    /* renamed from: x */
    private final int f14244x;

    /* renamed from: y */
    private int f14245y;

    /* renamed from: z */
    private final int f14246z;

    /* compiled from: SlotTable.kt */
    /* renamed from: f0.c0$a */
    /* loaded from: classes.dex */
    public static final class C5158a implements InterfaceC8334b, Iterable, InterfaceC6650a {

        /* renamed from: x */
        final /* synthetic */ int f14248x;

        C5158a(int i) {
            this.f14248x = i;
        }

        public Iterator iterator() {
            SlotTable.m25521a(SlotTable.this);
            C5164e1 m25520b = SlotTable.this.m25520b();
            int i = this.f14248x;
            return new SlotTable(m25520b, i + 1, i + C5168f1.m25397e(SlotTable.this.m25520b().m25437o(), this.f14248x));
        }
    }

    public SlotTable(C5164e1 c5164e1, int i, int i2) {
        Intrinsics.isThisObjectNull(c5164e1, "table");
        this.f14243w = c5164e1;
        this.f14244x = i2;
        this.f14245y = i;
        this.f14246z = c5164e1.m25433u();
        if (c5164e1.m25432v()) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m25521a(SlotTable slotTable) {
        slotTable.m25518d();
    }

    /* renamed from: d */
    private final void m25518d() {
        if (this.f14243w.m25433u() != this.f14246z) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: b */
    public final C5164e1 m25520b() {
        return this.f14243w;
    }

    /* renamed from: c */
    public InterfaceC8334b next() {
        m25518d();
        int i = this.f14245y;
        this.f14245y = C5168f1.m25397e(this.f14243w.m25437o(), i) + i;
        return new C5158a(i);
    }

    public boolean hasNext() {
        return this.f14245y < this.f14244x;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
