package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import p031b9.C1868y;

/* loaded from: classes.dex */
public abstract class AssetPackState {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AssetPackState m28769a(Bundle bundle, String str, C3909v0 c3909v0, InterfaceC3912w interfaceC3912w) {
        return m28768b(str, interfaceC3912w.mo28609a(bundle.getInt(C1868y.m35244a("status", str)), str), bundle.getInt(C1868y.m35244a("error_code", str)), bundle.getLong(C1868y.m35244a("bytes_downloaded", str)), bundle.getLong(C1868y.m35244a("total_bytes_to_download", str)), c3909v0.m28622c(str));
    }

    /* renamed from: b */
    public static AssetPackState m28768b(String str, int i, int i2, long j, long j2, double d) {
        return new C3840e0(str, i, i2, j, j2, (int) Math.rint(100.0d * d));
    }

    /* renamed from: c */
    public abstract long mo28754c();

    /* renamed from: d */
    public abstract int mo28753d();

    /* renamed from: e */
    public abstract String mo28752e();

    /* renamed from: f */
    public abstract int mo28751f();

    /* renamed from: g */
    public abstract long mo28750g();

    /* renamed from: h */
    public abstract int mo28749h();
}
