package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.play.core.tasks.C3973l;

/* renamed from: com.google.android.play.core.review.b */
/* loaded from: classes.dex */
final class ResultReceiverC3953b extends ResultReceiver {

    /* renamed from: w */
    final /* synthetic */ C3973l f11237w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC3953b(Handler handler, C3973l c3973l) {
        super(handler);
        this.f11237w = c3973l;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f11237w.m28498e(null);
    }
}
