package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.internal.c */
/* loaded from: classes2.dex */
public abstract class AbstractC6855c<T> extends AbstractC6852a0 {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18302a = AtomicReferenceFieldUpdater.newUpdater(AbstractC6855c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C6853b.f18300a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC6852a0
    /* renamed from: a */
    public AbstractC6855c<?> mo20009a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC6852a0
    /* renamed from: c */
    public final Object mo20008c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == C6853b.f18300a) {
            obj2 = m20007e(mo5729i(obj));
        }
        mo19763d(obj, obj2);
        return obj2;
    }

    /* renamed from: d */
    public abstract void mo19763d(T t, Object obj);

    /* renamed from: e */
    public final Object m20007e(Object obj) {
        if (C10539l0.m7720a()) {
            if (!(obj != C6853b.f18300a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C6853b.f18300a;
        return obj2 != obj3 ? obj2 : f18302a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m20006f() {
        return 0L;
    }

    /* renamed from: g */
    public abstract Object mo5729i(T t);
}
