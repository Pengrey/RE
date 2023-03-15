package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.v5 */
/* loaded from: classes.dex */
public final /* synthetic */ class C3015v5 {
    /* renamed from: a */
    public static Object m31960a(InterfaceC3030w5 interfaceC3030w5) {
        try {
            return interfaceC3030w5.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC3030w5.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
