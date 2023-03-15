package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.f */
/* loaded from: classes.dex */
public class C4350f {

    /* renamed from: a */
    private final SharedPreferences f11812a;

    static {
        new Date(-1L);
        new Date(-1L);
    }

    public C4350f(SharedPreferences sharedPreferences) {
        this.f11812a = sharedPreferences;
    }

    /* renamed from: a */
    public long m27815a() {
        return this.f11812a.getLong("fetch_timeout_in_seconds", 60L);
    }
}
