package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.internal.C3937f;
import p031b9.InterfaceC1867x;

/* renamed from: com.google.android.play.core.assetpacks.x2 */
/* loaded from: classes.dex */
public final class C3919x2 implements InterfaceC1867x<Object> {

    /* renamed from: a */
    private final InterfaceC1867x<C3903t2> f11213a;

    /* renamed from: b */
    private final InterfaceC1867x<Context> f11214b;

    public C3919x2(InterfaceC1867x<C3903t2> interfaceC1867x, InterfaceC1867x<Context> interfaceC1867x2) {
        this.f11213a = interfaceC1867x;
        this.f11214b = interfaceC1867x2;
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo1547c() {
        C3903t2 mo1547c = this.f11213a.mo1547c();
        Context mo1547c2 = ((C3927z2) this.f11214b).mo1547c();
        C3903t2 c3903t2 = mo1547c;
        C3937f.m28570a(mo1547c2.getPackageManager(), new ComponentName(mo1547c2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.m28572a(mo1547c2);
        C3937f.m28564g(c3903t2);
        return c3903t2;
    }
}
