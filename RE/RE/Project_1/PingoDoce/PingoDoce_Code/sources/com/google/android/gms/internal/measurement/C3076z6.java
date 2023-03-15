package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* loaded from: classes.dex */
public final class C3076z6 {
    /* renamed from: a */
    public static InterfaceC3016v6 m31691a(InterfaceC3016v6 interfaceC3016v6) {
        if ((interfaceC3016v6 instanceof C3046x6) || (interfaceC3016v6 instanceof C3031w6)) {
            return interfaceC3016v6;
        }
        if (interfaceC3016v6 instanceof Serializable) {
            return new C3031w6(interfaceC3016v6);
        }
        return new C3046x6(interfaceC3016v6);
    }

    /* renamed from: b */
    public static InterfaceC3016v6 m31690b(Object obj) {
        return new C3061y6(obj);
    }
}
