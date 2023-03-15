package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.r5 */
/* loaded from: classes.dex */
final class C2953r5 extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C2985t5 f7968a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2953r5(C2985t5 c2985t5, Handler handler) {
        super(null);
        this.f7968a = c2985t5;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f7968a.m32066f();
    }
}
