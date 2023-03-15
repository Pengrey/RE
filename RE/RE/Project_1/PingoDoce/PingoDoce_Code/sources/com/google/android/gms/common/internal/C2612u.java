package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.u */
/* loaded from: classes.dex */
public final class C2612u {

    /* renamed from: a */
    private static final Object f7516a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f7517b;

    /* renamed from: c */
    private static int f7518c;

    /* renamed from: a */
    public static int m33028a(Context context) {
        m33027b(context);
        return f7518c;
    }

    /* renamed from: b */
    private static void m33027b(Context context) {
        Bundle bundle;
        synchronized (f7516a) {
            if (f7517b) {
                return;
            }
            f7517b = true;
            try {
                bundle = C5615c.m23567a(context).m23572c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
            if (bundle == null) {
                return;
            }
            bundle.getString("com.google.app.id");
            f7518c = bundle.getInt("com.google.android.gms.version");
        }
    }
}
