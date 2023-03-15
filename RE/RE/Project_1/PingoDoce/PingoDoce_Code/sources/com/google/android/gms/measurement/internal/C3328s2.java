package com.google.android.gms.measurement.internal;

import p009a8.C0069b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.s2 */
/* loaded from: classes.dex */
public final class C3328s2 {

    /* renamed from: h */
    private static final Object f8856h = new Object();

    /* renamed from: a */
    private final String f8857a;

    /* renamed from: b */
    private final InterfaceC3306q2 f8858b;

    /* renamed from: c */
    private final Object f8859c;

    /* renamed from: d */
    private final Object f8860d;

    /* renamed from: e */
    private final Object f8861e = new Object();

    /* renamed from: f */
    private volatile Object f8862f = null;

    /* renamed from: g */
    private volatile Object f8863g = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3328s2(String str, Object obj, Object obj2, InterfaceC3306q2 interfaceC3306q2, C0069b c0069b) {
        this.f8857a = str;
        this.f8859c = obj;
        this.f8860d = obj2;
        this.f8858b = interfaceC3306q2;
    }

    /* renamed from: a */
    public final Object m31018a(Object obj) {
        synchronized (this.f8861e) {
        }
        if (obj != null) {
            return obj;
        }
        if (C3317r2.f8829a == null) {
            return this.f8859c;
        }
        synchronized (f8856h) {
            if (C3138b.m31458a()) {
                return this.f8863g == null ? this.f8859c : this.f8863g;
            }
            try {
                for (C3328s2 c3328s2 : C3339t2.m31010b()) {
                    if (!C3138b.m31458a()) {
                        Object obj2 = null;
                        try {
                            InterfaceC3306q2 interfaceC3306q2 = c3328s2.f8858b;
                            if (interfaceC3306q2 != null) {
                                obj2 = interfaceC3306q2.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f8856h) {
                            c3328s2.f8863g = obj2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC3306q2 interfaceC3306q22 = this.f8858b;
            if (interfaceC3306q22 == null) {
                return this.f8859c;
            }
            try {
                return interfaceC3306q22.zza();
            } catch (IllegalStateException unused3) {
                return this.f8859c;
            } catch (SecurityException unused4) {
                return this.f8859c;
            }
        }
    }

    /* renamed from: b */
    public final String m31017b() {
        return this.f8857a;
    }
}
