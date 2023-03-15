package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.o6 */
/* loaded from: classes.dex */
public final class C2906o6 implements InterfaceC3045x5 {

    /* renamed from: b */
    private static final Map f7909b = new C9545a();

    /* renamed from: a */
    private final SharedPreferences f7910a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2906o6 m32336b(Context context, String str) {
        C2906o6 c2906o6;
        if (!C2905o5.m32337a()) {
            synchronized (C2906o6.class) {
                c2906o6 = (C2906o6) f7909b.get(null);
                if (c2906o6 == null) {
                    StrictMode.allowThreadDiskReads();
                    throw null;
                }
            }
            return c2906o6;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static synchronized void m32335c() {
        synchronized (C2906o6.class) {
            Map map = f7909b;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((C2906o6) it.next()).f7910a;
                throw null;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3045x5
    /* renamed from: a */
    public final Object mo31832a(String str) {
        throw null;
    }
}
