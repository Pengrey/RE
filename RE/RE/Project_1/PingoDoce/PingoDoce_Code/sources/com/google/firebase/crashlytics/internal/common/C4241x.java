package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import com.github.aachartmodel.aainfographics.BuildConfig;

/* renamed from: com.google.firebase.crashlytics.internal.common.x */
/* loaded from: classes.dex */
class C4241x {

    /* renamed from: a */
    private String f11560a;

    /* renamed from: b */
    private static String m28193b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? BuildConfig.VERSION_NAME : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m28194a(Context context) {
        if (this.f11560a == null) {
            this.f11560a = m28193b(context);
        }
        return BuildConfig.VERSION_NAME.equals(this.f11560a) ? null : this.f11560a;
    }
}
