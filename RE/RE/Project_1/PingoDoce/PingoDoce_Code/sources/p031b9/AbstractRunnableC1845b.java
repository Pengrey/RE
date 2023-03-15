package p031b9;

import com.google.android.play.core.tasks.C3973l;

/* renamed from: b9.b */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1845b implements Runnable {

    /* renamed from: w */
    private final C3973l<?> f5558w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractRunnableC1845b() {
        this.f5558w = null;
    }

    public AbstractRunnableC1845b(C3973l<?> c3973l) {
        this.f5558w = c3973l;
    }

    /* renamed from: a */
    protected abstract void mo28521a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3973l<?> m35275b() {
        return this.f5558w;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo28521a();
        } catch (Exception e) {
            C3973l<?> c3973l = this.f5558w;
            if (c3973l != null) {
                c3973l.m28499d(e);
            }
        }
    }
}
