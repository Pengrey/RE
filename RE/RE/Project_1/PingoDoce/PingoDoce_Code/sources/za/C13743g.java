package za;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;
import p466ya.InterfaceC13142a;
import p466ya.InterfaceC13143b;

/* renamed from: za.g */
/* loaded from: classes2.dex */
public class C13743g<T extends InterfaceC13143b> implements InterfaceC13142a<T> {

    /* renamed from: a */
    private final LatLng f34859a;

    /* renamed from: b */
    private final Collection<T> f34860b = new LinkedHashSet();

    public C13743g(LatLng latLng) {
        this.f34859a = latLng;
    }

    @Override // p466ya.InterfaceC13142a
    /* renamed from: a */
    public int mo524a() {
        return this.f34860b.size();
    }

    @Override // p466ya.InterfaceC13142a
    /* renamed from: b */
    public LatLng mo523b() {
        return this.f34859a;
    }

    /* renamed from: c */
    public boolean m522c(T t) {
        return this.f34860b.add(t);
    }

    @Override // p466ya.InterfaceC13142a
    /* renamed from: d */
    public Collection<T> mo521d() {
        return this.f34860b;
    }

    /* renamed from: e */
    public boolean m520e(T t) {
        return this.f34860b.remove(t);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13743g) {
            C13743g c13743g = (C13743g) obj;
            return c13743g.f34859a.equals(this.f34859a) && c13743g.f34860b.equals(this.f34860b);
        }
        return false;
    }

    public int hashCode() {
        return this.f34859a.hashCode() + this.f34860b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f34859a + ", mItems.size=" + this.f34860b.size() + '}';
    }
}
