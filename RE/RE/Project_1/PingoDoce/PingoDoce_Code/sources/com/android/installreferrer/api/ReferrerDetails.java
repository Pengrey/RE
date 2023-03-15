package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class ReferrerDetails {

    /* renamed from: a */
    private final Bundle f6554a;

    public ReferrerDetails(Bundle bundle) {
        this.f6554a = bundle;
    }

    /* renamed from: a */
    public String m34276a() {
        return this.f6554a.getString("install_referrer");
    }
}
