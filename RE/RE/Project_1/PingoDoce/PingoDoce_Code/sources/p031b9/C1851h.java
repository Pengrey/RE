package p031b9;

import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* renamed from: b9.h */
/* loaded from: classes.dex */
final class C1851h extends AbstractRunnableC1845b {

    /* renamed from: x */
    final /* synthetic */ IBinder f5563x;

    /* renamed from: y */
    final /* synthetic */ ServiceConnectionC1853j f5564y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1851h(ServiceConnectionC1853j serviceConnectionC1853j, IBinder iBinder) {
        this.f5564y = serviceConnectionC1853j;
        this.f5563x = iBinder;
    }

    @Override // p031b9.AbstractRunnableC1845b
    /* renamed from: a */
    public final void mo28521a() {
        InterfaceC1850g interfaceC1850g;
        List<Runnable> list;
        List list2;
        C1854k c1854k = this.f5564y.f5566a;
        interfaceC1850g = c1854k.f5574g;
        c1854k.f5578k = (IInterface) interfaceC1850g.mo28522a(this.f5563x);
        C1854k.m35260n(this.f5564y.f5566a);
        this.f5564y.f5566a.f5572e = false;
        list = this.f5564y.f5566a.f5571d;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.f5564y.f5566a.f5571d;
        list2.clear();
    }
}
