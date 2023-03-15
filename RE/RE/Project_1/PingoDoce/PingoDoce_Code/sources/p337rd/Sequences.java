package p337rd;

import java.util.Iterator;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: rd.b */
/* loaded from: classes2.dex */
public final class Sequences<T> implements InterfaceC9870e, InterfaceC9867c {

    /* renamed from: a */
    private final InterfaceC9870e f25852a;

    /* renamed from: b */
    private final int f25853b;

    /* compiled from: Sequences.kt */
    /* renamed from: rd.b$a */
    /* loaded from: classes2.dex */
    public static final class C9866a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private final Iterator f25854w;

        /* renamed from: x */
        private int f25855x;

        C9866a(Sequences sequences) {
            this.f25854w = Sequences.m9781c(sequences).iterator();
            this.f25855x = Sequences.m9782b(sequences);
        }

        /* renamed from: a */
        private final void m9780a() {
            while (this.f25855x > 0 && this.f25854w.hasNext()) {
                this.f25854w.next();
                this.f25855x--;
            }
        }

        public boolean hasNext() {
            m9780a();
            return this.f25854w.hasNext();
        }

        public Object next() {
            m9780a();
            return this.f25854w.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public Sequences(InterfaceC9870e interfaceC9870e, int i) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "sequence");
        this.f25852a = interfaceC9870e;
        this.f25853b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    /* renamed from: b */
    public static final /* synthetic */ int m9782b(Sequences sequences) {
        return sequences.f25853b;
    }

    /* renamed from: c */
    public static final /* synthetic */ InterfaceC9870e m9781c(Sequences sequences) {
        return sequences.f25852a;
    }

    /* renamed from: a */
    public InterfaceC9870e mo9779a(int i) {
        int i2 = this.f25853b + i;
        return i2 < 0 ? new Sequences(this, i) : new Sequences(this.f25852a, i2);
    }

    public Iterator iterator() {
        return new C9866a(this);
    }
}
