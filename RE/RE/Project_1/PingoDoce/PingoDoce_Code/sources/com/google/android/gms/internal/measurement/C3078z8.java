package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z8 */
/* loaded from: classes.dex */
public class C3078z8 {

    /* renamed from: a */
    protected volatile InterfaceC2973s9 f8148a;

    /* renamed from: b */
    private volatile AbstractC2955r7 f8149b;

    static {
        C2732d8.m32783a();
    }

    /* renamed from: a */
    public final int m31652a() {
        if (this.f8149b != null) {
            return ((C2923p7) this.f8149b).f7923y.length;
        }
        if (this.f8148a != null) {
            return this.f8148a.mo32109f();
        }
        return 0;
    }

    /* renamed from: b */
    public final AbstractC2955r7 m31651b() {
        if (this.f8149b != null) {
            return this.f8149b;
        }
        synchronized (this) {
            if (this.f8149b != null) {
                return this.f8149b;
            }
            if (this.f8148a == null) {
                this.f8149b = AbstractC2955r7.f7969x;
            } else {
                this.f8149b = this.f8148a.mo32111d();
            }
            return this.f8149b;
        }
    }

    /* renamed from: c */
    protected final void m31650c(InterfaceC2973s9 interfaceC2973s9) {
        if (this.f8148a != null) {
            return;
        }
        synchronized (this) {
            if (this.f8148a == null) {
                try {
                    this.f8148a = interfaceC2973s9;
                    this.f8149b = AbstractC2955r7.f7969x;
                } catch (zzkh unused) {
                    this.f8148a = interfaceC2973s9;
                    this.f8149b = AbstractC2955r7.f7969x;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3078z8) {
            C3078z8 c3078z8 = (C3078z8) obj;
            InterfaceC2973s9 interfaceC2973s9 = this.f8148a;
            InterfaceC2973s9 interfaceC2973s92 = c3078z8.f8148a;
            if (interfaceC2973s9 == null && interfaceC2973s92 == null) {
                return m31651b().equals(c3078z8.m31651b());
            }
            if (interfaceC2973s9 == null || interfaceC2973s92 == null) {
                if (interfaceC2973s9 != null) {
                    c3078z8.m31650c(interfaceC2973s9.mo32062c());
                    return interfaceC2973s9.equals(c3078z8.f8148a);
                }
                m31650c(interfaceC2973s92.mo32062c());
                return this.f8148a.equals(interfaceC2973s92);
            }
            return interfaceC2973s9.equals(interfaceC2973s92);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
