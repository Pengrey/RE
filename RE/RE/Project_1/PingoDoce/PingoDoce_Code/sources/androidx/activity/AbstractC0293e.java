package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.e */
/* loaded from: classes.dex */
public abstract class AbstractC0293e {

    /* renamed from: a */
    private boolean f649a;

    /* renamed from: b */
    private CopyOnWriteArrayList<InterfaceC0289a> f650b = new CopyOnWriteArrayList<>();

    public AbstractC0293e(boolean z) {
        this.f649a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m41357a(InterfaceC0289a interfaceC0289a) {
        this.f650b.add(interfaceC0289a);
    }

    /* renamed from: b */
    public abstract void mo37404b();

    /* renamed from: c */
    public final boolean m41356c() {
        return this.f649a;
    }

    /* renamed from: d */
    public final void m41355d() {
        Iterator<InterfaceC0289a> it = this.f650b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m41354e(InterfaceC0289a interfaceC0289a) {
        this.f650b.remove(interfaceC0289a);
    }

    /* renamed from: f */
    public final void m41353f(boolean z) {
        this.f649a = z;
    }
}
