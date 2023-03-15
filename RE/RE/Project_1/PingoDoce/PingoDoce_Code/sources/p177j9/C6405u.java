package p177j9;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p136ha.InterfaceC5882b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j9.u */
/* loaded from: classes.dex */
public class C6405u<T> implements InterfaceC5882b<Set<T>> {

    /* renamed from: b */
    private volatile Set<T> f17471b = null;

    /* renamed from: a */
    private volatile Set<InterfaceC5882b<T>> f17470a = Collections.newSetFromMap(new ConcurrentHashMap());

    C6405u(Collection<InterfaceC5882b<T>> collection) {
        this.f17470a.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6405u<?> m21032b(Collection<InterfaceC5882b<?>> collection) {
        return new C6405u<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m21030d() {
        for (InterfaceC5882b<T> interfaceC5882b : this.f17470a) {
            this.f17471b.add(interfaceC5882b.get());
        }
        this.f17470a = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m21033a(InterfaceC5882b<T> interfaceC5882b) {
        if (this.f17471b == null) {
            this.f17470a.add(interfaceC5882b);
        } else {
            this.f17471b.add(interfaceC5882b.get());
        }
    }

    @Override // p136ha.InterfaceC5882b
    /* renamed from: c */
    public Set<T> get() {
        if (this.f17471b == null) {
            synchronized (this) {
                if (this.f17471b == null) {
                    this.f17471b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m21030d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f17471b);
    }
}
