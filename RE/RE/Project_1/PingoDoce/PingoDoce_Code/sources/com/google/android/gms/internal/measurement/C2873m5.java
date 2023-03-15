package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.m5 */
/* loaded from: classes.dex */
public final class C2873m5 extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2873m5(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = C2889n5.f7871e;
        atomicBoolean.set(true);
    }
}
