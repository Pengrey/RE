package wf;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wf.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11661a {

    /* renamed from: a */
    private static final AtomicBoolean f29803a;

    /* renamed from: b */
    private static final AtomicReference<AbstractC11661a> f29804b;

    /* compiled from: ZoneRulesInitializer.java */
    /* renamed from: wf.a$a */
    /* loaded from: classes2.dex */
    static class C11662a extends AbstractC11661a {
        C11662a() {
        }

        @Override // wf.AbstractC11661a
        /* renamed from: b */
        protected void mo4526b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoneRulesInitializer.java */
    /* renamed from: wf.a$b */
    /* loaded from: classes2.dex */
    public static class C11663b extends AbstractC11661a {
        C11663b() {
        }

        @Override // wf.AbstractC11661a
        /* renamed from: b */
        protected void mo4526b() {
            Iterator m4525a = C11664b.m4525a();
            while (m4525a.hasNext()) {
                try {
                    AbstractC11665c.m4520e((AbstractC11665c) m4525a.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    static {
        new C11662a();
        f29803a = new AtomicBoolean(false);
        f29804b = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m4527a() {
        if (!f29803a.getAndSet(true)) {
            AtomicReference<AbstractC11661a> atomicReference = f29804b;
            atomicReference.compareAndSet(null, new C11663b());
            atomicReference.get().mo4526b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    /* renamed from: b */
    protected abstract void mo4526b();
}
