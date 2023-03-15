package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p251n7.HandlerC7687f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.g */
/* loaded from: classes.dex */
public final class HandlerC2571g extends HandlerC7687f {

    /* renamed from: a */
    private final Context f7399a;

    /* renamed from: b */
    final /* synthetic */ C2566b f7400b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2571g(C2566b c2566b, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f7400b = c2566b;
        this.f7399a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int mo33223g = this.f7400b.mo33223g(this.f7399a);
        if (this.f7400b.mo33220j(mo33223g)) {
            this.f7400b.m33238o(this.f7399a, mo33223g);
        }
    }
}
