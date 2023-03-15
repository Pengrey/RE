package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* loaded from: classes.dex */
final class C2544s1 extends AbstractC2527n0 {

    /* renamed from: a */
    final /* synthetic */ Dialog f7346a;

    /* renamed from: b */
    final /* synthetic */ RunnableC2547t1 f7347b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2544s1(RunnableC2547t1 runnableC2547t1, Dialog dialog) {
        this.f7347b = runnableC2547t1;
        this.f7346a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2527n0
    /* renamed from: a */
    public final void mo33282a() {
        this.f7347b.f7350x.m33273o();
        if (this.f7346a.isShowing()) {
            this.f7346a.dismiss();
        }
    }
}
