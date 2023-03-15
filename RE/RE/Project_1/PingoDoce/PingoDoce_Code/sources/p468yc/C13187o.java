package p468yc;

import id.InterfaceC6097a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* renamed from: yc.o */
/* loaded from: classes2.dex */
public final class C13187o<T> implements InterfaceC13178g, Serializable {

    /* renamed from: y */
    private static final AtomicReferenceFieldUpdater f34145y;

    /* renamed from: w */
    private volatile InterfaceC6097a f34146w;

    /* renamed from: x */
    private volatile Object f34147x;

    /* compiled from: LazyJVM.kt */
    /* renamed from: yc.o$a */
    /* loaded from: classes2.dex */
    public static final class C13188a {
        private C13188a() {
        }

        public /* synthetic */ C13188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C13188a(null);
        f34145y = AtomicReferenceFieldUpdater.newUpdater(C13187o.class, Object.class, "x");
    }

    public C13187o(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "initializer");
        this.f34146w = interfaceC6097a;
        this.f34147x = C13194t.f34155a;
    }

    private final Object writeReplace() {
        return new C13175d(getValue());
    }

    /* renamed from: a */
    public boolean m1452a() {
        return this.f34147x != C13194t.f34155a;
    }

    public Object getValue() {
        Object obj = this.f34147x;
        C13194t c13194t = C13194t.f34155a;
        if (obj != c13194t) {
            return obj;
        }
        InterfaceC6097a interfaceC6097a = this.f34146w;
        if (interfaceC6097a != null) {
            Object mo42214q = interfaceC6097a.mo42214q();
            if (f34145y.compareAndSet(this, c13194t, mo42214q)) {
                this.f34146w = null;
                return mo42214q;
            }
        }
        return this.f34147x;
    }

    public String toString() {
        return m1452a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
