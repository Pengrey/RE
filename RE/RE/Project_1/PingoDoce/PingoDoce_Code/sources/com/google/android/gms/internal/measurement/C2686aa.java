package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.aa */
/* loaded from: classes.dex */
public final class C2686aa {

    /* renamed from: c */
    private static final C2686aa f7644c = new C2686aa();

    /* renamed from: b */
    private final ConcurrentMap f7646b = new ConcurrentHashMap();

    /* renamed from: a */
    private final InterfaceC2750ea f7645a = new C2829j9();

    private C2686aa() {
    }

    /* renamed from: a */
    public static C2686aa m32915a() {
        return f7644c;
    }

    /* renamed from: b */
    public final InterfaceC2734da m32914b(Class cls) {
        C3048x8.m31824f(cls, "messageType");
        InterfaceC2734da interfaceC2734da = (InterfaceC2734da) this.f7646b.get(cls);
        if (interfaceC2734da == null) {
            interfaceC2734da = this.f7645a.mo32532a(cls);
            C3048x8.m31824f(cls, "messageType");
            C3048x8.m31824f(interfaceC2734da, "schema");
            InterfaceC2734da interfaceC2734da2 = (InterfaceC2734da) this.f7646b.putIfAbsent(cls, interfaceC2734da);
            if (interfaceC2734da2 != null) {
                return interfaceC2734da2;
            }
        }
        return interfaceC2734da;
    }
}
