package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d8 */
/* loaded from: classes.dex */
public final class C2732d8 {

    /* renamed from: b */
    private static volatile C2732d8 f7706b;

    /* renamed from: c */
    private static volatile C2732d8 f7707c;

    /* renamed from: d */
    static final C2732d8 f7708d = new C2732d8(true);

    /* renamed from: a */
    private final Map f7709a;

    C2732d8() {
        this.f7709a = new HashMap();
    }

    /* renamed from: a */
    public static C2732d8 m32783a() {
        C2732d8 c2732d8 = f7706b;
        if (c2732d8 == null) {
            synchronized (C2732d8.class) {
                c2732d8 = f7706b;
                if (c2732d8 == null) {
                    c2732d8 = f7708d;
                    f7706b = c2732d8;
                }
            }
        }
        return c2732d8;
    }

    /* renamed from: b */
    public static C2732d8 m32782b() {
        C2732d8 c2732d8 = f7707c;
        if (c2732d8 != null) {
            return c2732d8;
        }
        synchronized (C2732d8.class) {
            C2732d8 c2732d82 = f7707c;
            if (c2732d82 != null) {
                return c2732d82;
            }
            C2732d8 m32487b = AbstractC2860l8.m32487b(C2732d8.class);
            f7707c = m32487b;
            return m32487b;
        }
    }

    /* renamed from: c */
    public final C2924p8 m32781c(InterfaceC2973s9 interfaceC2973s9, int i) {
        return (C2924p8) this.f7709a.get(new C2716c8(interfaceC2973s9, i));
    }

    C2732d8(boolean z) {
        this.f7709a = Collections.emptyMap();
    }
}
