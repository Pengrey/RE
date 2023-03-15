package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;
import p267o7.HandlerC8032f;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.c */
/* loaded from: classes.dex */
public final class HandlerC2443c extends HandlerC8032f {

    /* renamed from: a */
    final /* synthetic */ C2442b f7107a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2443c(C2442b c2442b, Looper looper) {
        super(looper);
        this.f7107a = c2442b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2442b.m33554d(this.f7107a, message);
    }
}
