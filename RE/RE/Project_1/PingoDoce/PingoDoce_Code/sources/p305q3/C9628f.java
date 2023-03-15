package p305q3;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1443h;
import androidx.lifecycle.InterfaceC1489u;
import androidx.lifecycle.InterfaceC1491v;

/* renamed from: q3.f */
/* loaded from: classes.dex */
public final class C9628f extends AbstractC1469p {

    /* renamed from: b */
    public static final C9628f f25334b = new C9628f();

    /* renamed from: c */
    private static final InterfaceC1491v f25335c = C9627e.f25333w;

    private C9628f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final AbstractC1469p m10398e() {
        return f25334b;
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: a */
    public void mo10402a(InterfaceC1489u interfaceC1489u) {
        if (interfaceC1489u instanceof InterfaceC1443h) {
            InterfaceC1443h interfaceC1443h = (InterfaceC1443h) interfaceC1489u;
            InterfaceC1491v interfaceC1491v = f25335c;
            interfaceC1443h.mo36997d(interfaceC1491v);
            interfaceC1443h.mo34464f(interfaceC1491v);
            interfaceC1443h.mo36998a(interfaceC1491v);
            return;
        }
        throw new IllegalArgumentException((interfaceC1489u + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: b */
    public AbstractC1469p.EnumC1472c mo10401b() {
        return AbstractC1469p.EnumC1472c.RESUMED;
    }

    @Override // androidx.lifecycle.AbstractC1469p
    /* renamed from: c */
    public void mo10400c(InterfaceC1489u interfaceC1489u) {
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
