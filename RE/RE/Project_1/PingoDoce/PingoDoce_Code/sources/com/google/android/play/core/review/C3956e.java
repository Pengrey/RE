package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.tasks.C3973l;
import p101f9.AbstractC5433d;

/* renamed from: com.google.android.play.core.review.e */
/* loaded from: classes.dex */
public final class C3956e implements InterfaceC3954c {

    /* renamed from: a */
    private final C3961j f11238a;

    /* renamed from: b */
    private final Handler f11239b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3956e(C3961j c3961j) {
        this.f11238a = c3961j;
    }

    @Override // com.google.android.play.core.review.InterfaceC3954c
    /* renamed from: a */
    public final AbstractC5433d<Void> mo28524a(Activity activity, ReviewInfo reviewInfo) {
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo28526a());
        C3973l c3973l = new C3973l();
        intent.putExtra("result_receiver", new ResultReceiverC3953b(this.f11239b, c3973l));
        activity.startActivity(intent);
        return c3973l.m28502a();
    }

    @Override // com.google.android.play.core.review.InterfaceC3954c
    /* renamed from: b */
    public final AbstractC5433d<ReviewInfo> mo28523b() {
        return this.f11238a.m28519a();
    }
}
