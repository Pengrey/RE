package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.backends.e */
/* loaded from: classes.dex */
public abstract class AbstractC2397e {

    /* compiled from: BackendResponse.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.e$a */
    /* loaded from: classes.dex */
    public enum EnumC2398a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static AbstractC2397e m33690a() {
        return new C2393b(EnumC2398a.FATAL_ERROR, -1L);
    }

    /* renamed from: d */
    public static AbstractC2397e m33687d() {
        return new C2393b(EnumC2398a.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: e */
    public static AbstractC2397e m33686e(long j) {
        return new C2393b(EnumC2398a.OK, j);
    }

    /* renamed from: f */
    public static AbstractC2397e m33685f() {
        return new C2393b(EnumC2398a.TRANSIENT_ERROR, -1L);
    }

    /* renamed from: b */
    public abstract long mo33689b();

    /* renamed from: c */
    public abstract EnumC2398a mo33688c();
}
