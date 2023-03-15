package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import p031b9.C1844a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.d2 */
/* loaded from: classes.dex */
public final class C3837d2 {

    /* renamed from: c */
    private static final C1844a f10917c = new C1844a("PackageStateCache");

    /* renamed from: a */
    private final Context f10918a;

    /* renamed from: b */
    private int f10919b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3837d2(Context context) {
        this.f10918a = context;
    }

    /* renamed from: a */
    public final synchronized int m28755a() {
        if (this.f10919b == -1) {
            try {
                this.f10919b = this.f10918a.getPackageManager().getPackageInfo(this.f10918a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f10917c.m35278e("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f10919b;
    }
}
