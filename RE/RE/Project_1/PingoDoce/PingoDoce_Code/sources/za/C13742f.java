package za;

import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.Set;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;

/* renamed from: za.f */
/* loaded from: classes2.dex */
public class C13742f<T extends InterfaceC13143b> extends AbstractC13734a<T> implements InterfaceC13741e<T> {

    /* renamed from: b */
    private InterfaceC13735b<T> f34858b;

    public C13742f(InterfaceC13735b<T> interfaceC13735b) {
        this.f34858b = interfaceC13735b;
    }

    @Override // za.InterfaceC13741e
    /* renamed from: a */
    public void mo530a(CameraPosition cameraPosition) {
    }

    @Override // za.InterfaceC13735b
    /* renamed from: b */
    public Set<? extends InterfaceC13142a<T>> mo529b(float f) {
        return this.f34858b.mo529b(f);
    }

    @Override // za.InterfaceC13735b
    /* renamed from: e */
    public boolean mo528e(Collection<T> collection) {
        return this.f34858b.mo528e(collection);
    }

    @Override // za.InterfaceC13735b
    /* renamed from: f */
    public int mo527f() {
        return this.f34858b.mo527f();
    }

    @Override // za.InterfaceC13741e
    /* renamed from: g */
    public boolean mo526g() {
        return false;
    }

    @Override // za.InterfaceC13735b
    /* renamed from: h */
    public void mo525h() {
        this.f34858b.mo525h();
    }
}
