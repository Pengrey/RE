package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.j */
/* loaded from: classes.dex */
public class C2513j {
    /* renamed from: a */
    public static <L> C2508i<L> m33352a(L l, Looper looper, String str) {
        C2597i.m33075k(l, "Listener must not be null");
        C2597i.m33075k(looper, "Looper must not be null");
        C2597i.m33075k(str, "Listener type must not be null");
        return new C2508i<>(looper, l, str);
    }

    /* renamed from: b */
    public static <L> C2508i.C2509a<L> m33351b(L l, String str) {
        C2597i.m33075k(l, "Listener must not be null");
        C2597i.m33075k(str, "Listener type must not be null");
        C2597i.m33079g(str, "Listener type must not be empty");
        return new C2508i.C2509a<>(l, str);
    }
}
