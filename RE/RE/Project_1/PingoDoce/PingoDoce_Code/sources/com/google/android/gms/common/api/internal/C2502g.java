package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.ActivityC1354d;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public class C2502g {

    /* renamed from: a */
    private final Object f7255a;

    public C2502g(Activity activity) {
        C2597i.m33075k(activity, "Activity must not be null");
        this.f7255a = activity;
    }

    /* renamed from: a */
    public final Activity m33401a() {
        return (Activity) this.f7255a;
    }

    /* renamed from: b */
    public final ActivityC1354d m33400b() {
        return (ActivityC1354d) this.f7255a;
    }

    /* renamed from: c */
    public final boolean m33399c() {
        return this.f7255a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean m33398d() {
        return this.f7255a instanceof ActivityC1354d;
    }
}
