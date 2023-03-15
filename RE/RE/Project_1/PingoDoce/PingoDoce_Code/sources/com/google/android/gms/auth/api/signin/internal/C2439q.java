package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.AbstractC1497a;
import com.google.android.gms.common.api.AbstractC2475c;
import p379u6.C10844c;
import p413w2.C11551b;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: com.google.android.gms.auth.api.signin.internal.q */
/* loaded from: classes.dex */
final class C2439q implements AbstractC1497a.InterfaceC1498a<Void> {

    /* renamed from: a */
    final /* synthetic */ SignInHubActivity f7093a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2439q(SignInHubActivity signInHubActivity, C2438p c2438p) {
        this.f7093a = signInHubActivity;
    }

    @Override // androidx.loader.app.AbstractC1497a.InterfaceC1498a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo33562a(C11551b<Void> c11551b, Void r3) {
        SignInHubActivity signInHubActivity = this.f7093a;
        signInHubActivity.setResult(SignInHubActivity.m33585Y(signInHubActivity), SignInHubActivity.m33584Z(this.f7093a));
        this.f7093a.finish();
    }

    @Override // androidx.loader.app.AbstractC1497a.InterfaceC1498a
    /* renamed from: b */
    public final void mo33561b(C11551b<Void> c11551b) {
    }

    @Override // androidx.loader.app.AbstractC1497a.InterfaceC1498a
    /* renamed from: c */
    public final C11551b<Void> mo33560c(int i, Bundle bundle) {
        return new C10844c(this.f7093a, AbstractC2475c.m33478b());
    }
}
