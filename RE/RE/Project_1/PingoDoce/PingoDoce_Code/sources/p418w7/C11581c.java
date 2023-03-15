package p418w7;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import p353s7.InterfaceC10082i;
import p440x7.InterfaceC12293b;
import p463y7.C13130c;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: w7.c */
/* loaded from: classes.dex */
public class C11581c {

    /* renamed from: a */
    private final InterfaceC12293b f29633a;

    /* renamed from: b */
    private C11593g f29634b;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC11582a {
        /* renamed from: a */
        View mo4660a(C13130c c13130c);

        /* renamed from: g */
        View mo4659g(C13130c c13130c);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11583b {
        /* renamed from: a */
        void mo1543a();
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC11584c {
        /* renamed from: a */
        void mo4658a(int i);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$d */
    /* loaded from: classes.dex */
    public interface InterfaceC11585d {
        /* renamed from: d */
        void mo1540d(C13130c c13130c);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$e */
    /* loaded from: classes.dex */
    public interface InterfaceC11586e {
        /* renamed from: e */
        void mo4657e(C13130c c13130c);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$f */
    /* loaded from: classes.dex */
    public interface InterfaceC11587f {
        /* renamed from: a */
        void mo4656a(LatLng latLng);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$g */
    /* loaded from: classes.dex */
    public interface InterfaceC11588g {
        /* renamed from: f */
        boolean mo1538f(C13130c c13130c);
    }

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    /* renamed from: w7.c$h */
    /* loaded from: classes.dex */
    public interface InterfaceC11589h {
        /* renamed from: b */
        void mo4655b(C13130c c13130c);

        /* renamed from: c */
        void mo4654c(C13130c c13130c);

        /* renamed from: h */
        void mo4653h(C13130c c13130c);
    }

    public C11581c(InterfaceC12293b interfaceC12293b) {
        this.f29633a = (InterfaceC12293b) C2597i.m33076j(interfaceC12293b);
    }

    /* renamed from: a */
    public final C13130c m4676a(MarkerOptions markerOptions) {
        try {
            C2597i.m33075k(markerOptions, "MarkerOptions must not be null.");
            InterfaceC10082i mo3076H1 = this.f29633a.mo3076H1(markerOptions);
            if (mo3076H1 != null) {
                return new C13130c(mo3076H1);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: b */
    public final void m4675b(C11579a c11579a) {
        try {
            C2597i.m33075k(c11579a, "CameraUpdate must not be null.");
            this.f29633a.mo3074R0(c11579a.m4682a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: c */
    public final CameraPosition m4674c() {
        try {
            return this.f29633a.mo3072V0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: d */
    public final C11591e m4673d() {
        try {
            return new C11591e(this.f29633a.mo3077G0());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: e */
    public final C11593g m4672e() {
        try {
            if (this.f29634b == null) {
                this.f29634b = new C11593g(this.f29633a.mo3069f0());
            }
            return this.f29634b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: f */
    public final void m4671f(C11579a c11579a) {
        try {
            C2597i.m33075k(c11579a, "CameraUpdate must not be null.");
            this.f29633a.mo3063y1(c11579a.m4682a());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: g */
    public final void m4670g(InterfaceC11582a interfaceC11582a) {
        try {
            if (interfaceC11582a == null) {
                this.f29633a.mo3075Q0(null);
            } else {
                this.f29633a.mo3075Q0(new BinderC11598l(this, interfaceC11582a));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: h */
    public boolean m4669h(MapStyleOptions mapStyleOptions) {
        try {
            return this.f29633a.mo3071a1(mapStyleOptions);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: i */
    public final void m4668i(boolean z) {
        try {
            this.f29633a.mo3068l1(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: j */
    public final void m4667j(InterfaceC11583b interfaceC11583b) {
        try {
            if (interfaceC11583b == null) {
                this.f29633a.mo3073T0(null);
            } else {
                this.f29633a.mo3073T0(new BinderC11600n(this, interfaceC11583b));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: k */
    public final void m4666k(InterfaceC11584c interfaceC11584c) {
        try {
            if (interfaceC11584c == null) {
                this.f29633a.mo3078B0(null);
            } else {
                this.f29633a.mo3078B0(new BinderC11599m(this, interfaceC11584c));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: l */
    public final void m4665l(InterfaceC11585d interfaceC11585d) {
        try {
            if (interfaceC11585d == null) {
                this.f29633a.mo3064v1(null);
            } else {
                this.f29633a.mo3064v1(new BinderC11596j(this, interfaceC11585d));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: m */
    public final void m4664m(InterfaceC11586e interfaceC11586e) {
        try {
            if (interfaceC11586e == null) {
                this.f29633a.mo3065t0(null);
            } else {
                this.f29633a.mo3065t0(new BinderC11597k(this, interfaceC11586e));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: n */
    public final void m4663n(InterfaceC11587f interfaceC11587f) {
        try {
            if (interfaceC11587f == null) {
                this.f29633a.mo3070c1(null);
            } else {
                this.f29633a.mo3070c1(new BinderC11601o(this, interfaceC11587f));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: o */
    public final void m4662o(InterfaceC11588g interfaceC11588g) {
        try {
            if (interfaceC11588g == null) {
                this.f29633a.mo3067m0(null);
            } else {
                this.f29633a.mo3067m0(new BinderC11594h(this, interfaceC11588g));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: p */
    public final void m4661p(InterfaceC11589h interfaceC11589h) {
        try {
            if (interfaceC11589h == null) {
                this.f29633a.mo3066r0(null);
            } else {
                this.f29633a.mo3066r0(new BinderC11595i(this, interfaceC11589h));
            }
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
