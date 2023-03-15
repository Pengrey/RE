package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import p102fa.C5437d;
import p177j9.C6378d;
import p177j9.InterfaceC6388i;
import pa.C8585c;
import pa.C8587e;
import pa.C8590h;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements InterfaceC6388i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m28479e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : BuildConfig.VERSION_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m28478f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? BuildConfig.VERSION_NAME : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m28477g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? BuildConfig.VERSION_NAME : "embedded" : "auto" : "watch" : "tv";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m28476h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m28475i(installerPackageName) : BuildConfig.VERSION_NAME;
    }

    /* renamed from: i */
    private static String m28475i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // p177j9.InterfaceC6388i
    public List<C6378d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8585c.m15091c());
        arrayList.add(C5437d.m24363e());
        arrayList.add(C8590h.m15081b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C8590h.m15081b("fire-core", "20.0.0"));
        arrayList.add(C8590h.m15081b("device-name", m28475i(Build.PRODUCT)));
        arrayList.add(C8590h.m15081b("device-model", m28475i(Build.DEVICE)));
        arrayList.add(C8590h.m15081b("device-brand", m28475i(Build.BRAND)));
        arrayList.add(C8590h.m15080c("android-target-sdk", C4245e.f11562a));
        arrayList.add(C8590h.m15080c("android-min-sdk", C4251f.f11563a));
        arrayList.add(C8590h.m15080c("android-platform", C4252g.f11564a));
        arrayList.add(C8590h.m15080c("android-installer", C4244d.f11561a));
        String m15086a = C8587e.m15086a();
        if (m15086a != null) {
            arrayList.add(C8590h.m15081b("kotlin", m15086a));
        }
        return arrayList;
    }
}
