package p177j9;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p081ea.C5023a;
import p081ea.InterfaceC5024b;
import p081ea.InterfaceC5025c;
import p081ea.InterfaceC5026d;

/* renamed from: j9.s */
/* loaded from: classes.dex */
class C6403s implements InterfaceC5026d, InterfaceC5025c {

    /* renamed from: a */
    private final Map<Class<?>, ConcurrentHashMap<InterfaceC5024b<Object>, Executor>> f17464a = new HashMap();

    /* renamed from: b */
    private Queue<C5023a<?>> f17465b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f17466c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6403s(Executor executor) {
        this.f17466c = executor;
    }

    /* renamed from: e */
    private synchronized Set<Map.Entry<InterfaceC5024b<Object>, Executor>> m21036e(C5023a<?> c5023a) {
        ConcurrentHashMap<InterfaceC5024b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f17464a.get(c5023a.m25878b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m21035f(Map.Entry entry, C5023a c5023a) {
        ((InterfaceC5024b) entry.getKey()).mo22291a(c5023a);
    }

    @Override // p081ea.InterfaceC5026d
    /* renamed from: a */
    public synchronized <T> void mo21040a(Class<T> cls, Executor executor, InterfaceC5024b<? super T> interfaceC5024b) {
        C6410z.m21018b(cls);
        C6410z.m21018b(interfaceC5024b);
        C6410z.m21018b(executor);
        if (!this.f17464a.containsKey(cls)) {
            this.f17464a.put(cls, new ConcurrentHashMap<>());
        }
        this.f17464a.get(cls).put(interfaceC5024b, executor);
    }

    @Override // p081ea.InterfaceC5026d
    /* renamed from: b */
    public <T> void mo21039b(Class<T> cls, InterfaceC5024b<? super T> interfaceC5024b) {
        mo21040a(cls, this.f17466c, interfaceC5024b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21037d() {
        Queue<C5023a<?>> queue;
        synchronized (this) {
            queue = this.f17465b;
            if (queue != null) {
                this.f17465b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (C5023a<?> c5023a : queue) {
                m21034g(c5023a);
            }
        }
    }

    /* renamed from: g */
    public void m21034g(final C5023a<?> c5023a) {
        C6410z.m21018b(c5023a);
        synchronized (this) {
            Queue<C5023a<?>> queue = this.f17465b;
            if (queue != null) {
                queue.add(c5023a);
                return;
            }
            for (final Map.Entry<InterfaceC5024b<Object>, Executor> entry : m21036e(c5023a)) {
                entry.getValue().execute(new Runnable() { // from class: j9.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6403s.m21035f(entry, c5023a);
                    }
                });
            }
        }
    }
}
