package androidx.compose.p018ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p112g0.MutableVector;

/* renamed from: androidx.compose.ui.platform.u1 */
/* loaded from: classes.dex */
public final class C0810u1<T> {

    /* renamed from: a */
    private final MutableVector<Reference<T>> f2425a = new MutableVector<>(new Reference[16], 0);

    /* renamed from: b */
    private final ReferenceQueue<T> f2426b = new ReferenceQueue<>();

    /* renamed from: a */
    private final void m39502a() {
        Reference<? extends T> poll;
        do {
            poll = this.f2426b.poll();
            if (poll != null) {
                this.f2425a.m23644u(poll);
                continue;
            }
        } while (poll != null);
    }

    /* renamed from: b */
    public final int m39501b() {
        m39502a();
        return this.f2425a.m23649p();
    }

    /* renamed from: c */
    public final T m39500c() {
        m39502a();
        while (this.f2425a.m23646s()) {
            MutableVector<Reference<T>> mutableVector = this.f2425a;
            T t = (T) ((Reference) mutableVector.m23642w(mutableVector.m23649p() - 1)).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m39499d(T t) {
        m39502a();
        this.f2425a.m23659c(new WeakReference(t, this.f2426b));
    }
}
