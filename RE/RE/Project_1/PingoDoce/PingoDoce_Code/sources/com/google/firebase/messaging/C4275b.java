package com.google.firebase.messaging;

import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import p301q.C9545a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.b */
/* loaded from: classes.dex */
public final class C4275b {

    /* renamed from: a */
    public static final long f11646a = TimeUnit.MINUTES.toMillis(3);

    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: classes.dex */
    public static final class C4276a {
        /* renamed from: a */
        public static C9545a<String, String> m28053a(Bundle bundle) {
            C9545a<String, String> c9545a = new C9545a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c9545a.put(str, str2);
                    }
                }
            }
            return c9545a;
        }
    }
}
