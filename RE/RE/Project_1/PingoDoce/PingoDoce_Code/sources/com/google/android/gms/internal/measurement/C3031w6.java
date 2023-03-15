package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* loaded from: classes.dex */
final class C3031w6 implements Serializable, InterfaceC3016v6 {

    /* renamed from: w */
    final InterfaceC3016v6 f8068w;

    /* renamed from: x */
    volatile transient boolean f8069x;
    @CheckForNull

    /* renamed from: y */
    transient Object f8070y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3031w6(InterfaceC3016v6 interfaceC3016v6) {
        Objects.requireNonNull(interfaceC3016v6);
        this.f8068w = interfaceC3016v6;
    }

    public final String toString() {
        Object obj;
        if (this.f8069x) {
            String valueOf = String.valueOf(this.f8070y);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f8068w;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3016v6
    public final Object zza() {
        if (!this.f8069x) {
            synchronized (this) {
                if (!this.f8069x) {
                    Object zza = this.f8068w.zza();
                    this.f8070y = zza;
                    this.f8069x = true;
                    return zza;
                }
            }
        }
        return this.f8070y;
    }
}
