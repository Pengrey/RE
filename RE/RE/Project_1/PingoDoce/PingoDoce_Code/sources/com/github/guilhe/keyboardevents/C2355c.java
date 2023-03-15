package com.github.guilhe.keyboardevents;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import p181jd.Intrinsics;

/* renamed from: com.github.guilhe.keyboardevents.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2355c {

    /* renamed from: a */
    private static final C1436e0<EnumC2353a> f6853a;

    /* renamed from: b */
    private static final LiveData<EnumC2353a> f6854b;

    /* renamed from: c */
    public static final C2355c f6855c = new C2355c();

    static {
        C1436e0<EnumC2353a> c1436e0 = new C1436e0<>();
        f6853a = c1436e0;
        f6854b = c1436e0;
    }

    private C2355c() {
    }

    /* renamed from: a */
    public final LiveData<EnumC2353a> m33838a() {
        return f6854b;
    }

    /* renamed from: b */
    public final void m33837b(EnumC2353a enumC2353a) {
        Intrinsics.m20926i(enumC2353a, "state");
        f6853a.mo169m(enumC2353a);
    }
}
