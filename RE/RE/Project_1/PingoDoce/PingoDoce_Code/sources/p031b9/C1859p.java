package p031b9;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: b9.p */
/* loaded from: classes.dex */
final class C1859p {

    /* renamed from: a */
    private final ConcurrentHashMap<C1858o, List<Throwable>> f5581a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue<Throwable> f5582b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> m35251a(Throwable th2) {
        while (true) {
            Reference<? extends Throwable> poll = this.f5582b.poll();
            if (poll == null) {
                break;
            }
            this.f5581a.remove(poll);
        }
        List<Throwable> list = this.f5581a.get(new C1858o(th2, null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f5581a.putIfAbsent(new C1858o(th2, this.f5582b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
