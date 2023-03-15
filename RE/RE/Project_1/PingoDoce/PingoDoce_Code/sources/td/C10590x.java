package td;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: td.x */
/* loaded from: classes2.dex */
public class C10590x {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27302b = AtomicIntegerFieldUpdater.newUpdater(C10590x.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f27303a;

    public C10590x(Throwable th2, boolean z) {
        this.f27303a = th2;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean m7602a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m7601b() {
        return f27302b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C10543m0.m7712a(this) + '[' + this.f27303a + ']';
    }

    public /* synthetic */ C10590x(Throwable th2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i & 2) != 0 ? false : z);
    }
}
