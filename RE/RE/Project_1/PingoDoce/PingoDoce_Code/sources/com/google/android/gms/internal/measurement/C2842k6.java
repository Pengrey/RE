package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.aachartmodel.aainfographics.BuildConfig;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k6 */
/* loaded from: classes.dex */
public final class C2842k6 {

    /* renamed from: a */
    final String f7813a;

    /* renamed from: b */
    final Uri f7814b;

    /* renamed from: c */
    final String f7815c;

    /* renamed from: d */
    final String f7816d;

    /* renamed from: e */
    final boolean f7817e;

    /* renamed from: f */
    final boolean f7818f;

    /* renamed from: g */
    final boolean f7819g;

    /* renamed from: h */
    final boolean f7820h;
    @Nullable

    /* renamed from: i */
    final InterfaceC2954r6 f7821i;

    public C2842k6(Uri uri) {
        this(null, uri, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, false, false, false, false, null);
    }

    private C2842k6(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable InterfaceC2954r6 interfaceC2954r6) {
        this.f7813a = null;
        this.f7814b = uri;
        this.f7815c = BuildConfig.VERSION_NAME;
        this.f7816d = BuildConfig.VERSION_NAME;
        this.f7817e = z;
        this.f7818f = false;
        this.f7819g = false;
        this.f7820h = false;
        this.f7821i = null;
    }

    /* renamed from: a */
    public final C2842k6 m32514a() {
        if (this.f7815c.isEmpty()) {
            return new C2842k6(null, this.f7814b, this.f7815c, this.f7816d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    /* renamed from: b */
    public final AbstractC2890n6 m32513b(String str, double d) {
        return new C2810i6(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    /* renamed from: c */
    public final AbstractC2890n6 m32512c(String str, long j) {
        return new C2778g6(this, str, Long.valueOf(j), true);
    }

    /* renamed from: d */
    public final AbstractC2890n6 m32511d(String str, String str2) {
        return new C2826j6(this, str, str2, true);
    }

    /* renamed from: e */
    public final AbstractC2890n6 m32510e(String str, boolean z) {
        return new C2794h6(this, str, Boolean.valueOf(z), true);
    }
}
