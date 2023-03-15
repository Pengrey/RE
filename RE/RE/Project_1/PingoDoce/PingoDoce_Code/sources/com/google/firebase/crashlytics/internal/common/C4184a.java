package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p219l9.C7008e;

/* renamed from: com.google.firebase.crashlytics.internal.common.a */
/* loaded from: classes.dex */
public class C4184a {

    /* renamed from: a */
    public final String f11419a;

    /* renamed from: b */
    public final String f11420b;

    /* renamed from: c */
    public final String f11421c;

    /* renamed from: d */
    public final String f11422d;

    /* renamed from: e */
    public final String f11423e;

    /* renamed from: f */
    public final String f11424f;

    /* renamed from: g */
    public final C7008e f11425g;

    public C4184a(String str, String str2, String str3, String str4, String str5, String str6, C7008e c7008e) {
        this.f11419a = str;
        this.f11420b = str2;
        this.f11421c = str3;
        this.f11422d = str4;
        this.f11423e = str5;
        this.f11424f = str6;
        this.f11425g = c7008e;
    }

    /* renamed from: a */
    public static C4184a m28413a(Context context, C4239v c4239v, String str, String str2, C7008e c7008e) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String m28202g = c4239v.m28202g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C4184a(str, str2, m28202g, packageName, num, str3, c7008e);
    }
}
