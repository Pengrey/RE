package p463y7;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p353s7.InterfaceC10082i;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: y7.c */
/* loaded from: classes.dex */
public final class C13130c {

    /* renamed from: a */
    private final InterfaceC10082i f34091a;

    public C13130c(InterfaceC10082i interfaceC10082i) {
        this.f34091a = (InterfaceC10082i) C2597i.m33076j(interfaceC10082i);
    }

    /* renamed from: a */
    public LatLng m1560a() {
        try {
            return this.f34091a.mo9244g();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public String m1559b() {
        try {
            return this.f34091a.mo9242m();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public String m1558c() {
        try {
            return this.f34091a.mo9243h();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public boolean m1557d() {
        try {
            return this.f34091a.mo9241p();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public void m1556e() {
        try {
            this.f34091a.mo9238x();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C13130c) {
            try {
                return this.f34091a.mo9249Q1(((C13130c) obj).f34091a);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m1555f(C13128a c13128a) {
        try {
            if (c13128a == null) {
                this.f34091a.mo9248c0(null);
                return;
            }
            this.f34091a.mo9248c0(c13128a.m1565a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public void m1554g(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f34091a.mo9239w1(latLng);
                return;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    /* renamed from: h */
    public void m1553h(String str) {
        try {
            this.f34091a.mo9246d1(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public int hashCode() {
        try {
            return this.f34091a.mo9245f();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public void m1552i(String str) {
        try {
            this.f34091a.mo9247d0(str);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public void m1551j() {
        try {
            this.f34091a.mo9240q();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
