package com.google.android.gms.internal.measurement;

import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x6 */
/* loaded from: classes.dex */
final class C3046x6 implements InterfaceC3016v6 {
    @CheckForNull

    /* renamed from: w */
    volatile InterfaceC3016v6 f8083w;

    /* renamed from: x */
    volatile boolean f8084x;
    @CheckForNull

    /* renamed from: y */
    Object f8085y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3046x6(InterfaceC3016v6 interfaceC3016v6) {
        Objects.requireNonNull(interfaceC3016v6);
        this.f8083w = interfaceC3016v6;
    }

    public final String toString() {
        Object obj = this.f8083w;
        if (obj == null) {
            String valueOf = String.valueOf(this.f8085y);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb3 = new StringBuilder(obj2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(obj2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3016v6
    public final Object zza() {
        if (!this.f8084x) {
            synchronized (this) {
                if (!this.f8084x) {
                    InterfaceC3016v6 interfaceC3016v6 = this.f8083w;
                    interfaceC3016v6.getClass();
                    Object zza = interfaceC3016v6.zza();
                    this.f8085y = zza;
                    this.f8084x = true;
                    this.f8083w = null;
                    return zza;
                }
            }
        }
        return this.f8085y;
    }
}
