package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p219l9.C7011f;

/* renamed from: com.google.firebase.crashlytics.internal.common.d */
/* loaded from: classes.dex */
class C4190d {

    /* renamed from: a */
    private final Float f11436a;

    /* renamed from: b */
    private final boolean f11437b;

    private C4190d(Float f, boolean z) {
        this.f11437b = z;
        this.f11436a = f;
    }

    /* renamed from: a */
    public static C4190d m28390a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m28386e(registerReceiver);
                f = m28387d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C7011f.m19611f().m19612e("An error occurred getting battery state.", e);
        }
        return new C4190d(f, z);
    }

    /* renamed from: d */
    private static Float m28387d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    private static boolean m28386e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m28389b() {
        return this.f11436a;
    }

    /* renamed from: c */
    public int m28388c() {
        Float f;
        if (!this.f11437b || (f = this.f11436a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
