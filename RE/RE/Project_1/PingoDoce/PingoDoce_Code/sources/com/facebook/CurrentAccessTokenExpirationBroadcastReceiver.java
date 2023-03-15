package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import p181jd.Intrinsics;
import p233m4.AccessTokenManager;

/* compiled from: CurrentAccessTokenExpirationBroadcastReceiver.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m20207d2 = {"Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(intent, "intent");
        if (Intrinsics.equals("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && C2290b.m34095t()) {
            AccessTokenManager.f18884g.m19161e().m19177e();
        }
    }
}
