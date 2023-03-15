package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C2597i;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.t1 */
/* loaded from: classes.dex */
public final class RunnableC2547t1 implements Runnable {

    /* renamed from: w */
    private final C2540r1 f7349w;

    /* renamed from: x */
    final /* synthetic */ AbstractDialogInterface$OnCancelListenerC2550u1 f7350x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2547t1(AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u1, C2540r1 c2540r1) {
        this.f7350x = abstractDialogInterface$OnCancelListenerC2550u1;
        this.f7349w = c2540r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7350x.f7355x) {
            ConnectionResult m33294b = this.f7349w.m33294b();
            if (m33294b.m33519y()) {
                AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u1 = this.f7350x;
                abstractDialogInterface$OnCancelListenerC2550u1.f7200w.startActivityForResult(GoogleApiActivity.m33514a(abstractDialogInterface$OnCancelListenerC2550u1.m33465b(), (PendingIntent) C2597i.m33076j(m33294b.m33520v()), this.f7349w.m33295a(), false), 1);
                return;
            }
            AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u12 = this.f7350x;
            if (abstractDialogInterface$OnCancelListenerC2550u12.f7354A.mo33228b(abstractDialogInterface$OnCancelListenerC2550u12.m33465b(), m33294b.m33522h(), null) != null) {
                AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u13 = this.f7350x;
                abstractDialogInterface$OnCancelListenerC2550u13.f7354A.m33231v(abstractDialogInterface$OnCancelListenerC2550u13.m33465b(), this.f7350x.f7200w, m33294b.m33522h(), 2, this.f7350x);
            } else if (m33294b.m33522h() == 18) {
                AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u14 = this.f7350x;
                Dialog m33236q = abstractDialogInterface$OnCancelListenerC2550u14.f7354A.m33236q(abstractDialogInterface$OnCancelListenerC2550u14.m33465b(), this.f7350x);
                AbstractDialogInterface$OnCancelListenerC2550u1 abstractDialogInterface$OnCancelListenerC2550u15 = this.f7350x;
                abstractDialogInterface$OnCancelListenerC2550u15.f7354A.m33235r(abstractDialogInterface$OnCancelListenerC2550u15.m33465b().getApplicationContext(), new C2544s1(this, m33236q));
            } else {
                this.f7350x.m33274l(m33294b, this.f7349w.m33295a());
            }
        }
    }
}
