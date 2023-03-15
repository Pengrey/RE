package md;

import p181jd.Intrinsics;
import p314qd.InterfaceC9724h;

/* renamed from: md.b */
/* loaded from: classes2.dex */
public abstract class ObservableProperty<V> implements InterfaceC7183c {

    /* renamed from: a */
    private Object f19009a;

    public ObservableProperty(Object obj) {
        this.f19009a = obj;
    }

    /* renamed from: a */
    public void mo18995a(Object obj, InterfaceC9724h interfaceC9724h, Object obj2) {
        Intrinsics.isThisObjectNull(interfaceC9724h, "property");
        Object obj3 = this.f19009a;
        if (m18996d(interfaceC9724h, obj3, obj2)) {
            this.f19009a = obj2;
            m18997c(interfaceC9724h, obj3, obj2);
        }
    }

    /* renamed from: b */
    public Object mo18994b(Object obj, InterfaceC9724h interfaceC9724h) {
        Intrinsics.isThisObjectNull(interfaceC9724h, "property");
        return this.f19009a;
    }

    /* renamed from: c */
    protected abstract void m18997c(InterfaceC9724h interfaceC9724h, Object obj, Object obj2);

    /* renamed from: d */
    protected boolean m18996d(InterfaceC9724h interfaceC9724h, Object obj, Object obj2) {
        Intrinsics.isThisObjectNull(interfaceC9724h, "property");
        return true;
    }
}
