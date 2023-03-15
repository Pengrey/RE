package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.internal.C3937f;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.z2 */
/* loaded from: classes.dex */
public final class C3927z2 implements InterfaceC1867x<Context> {

    /* renamed from: a */
    private final C3911v2 f11229a;

    public C3927z2(C3911v2 c3911v2) {
        this.f11229a = c3911v2;
    }

    /* renamed from: a */
    public static Context m28574a(C3911v2 c3911v2) {
        Context m28616a = c3911v2.m28616a();
        C3937f.m28564g(m28616a);
        return m28616a;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: b */
    public final Context mo1547c() {
        return m28574a(this.f11229a);
    }
}
