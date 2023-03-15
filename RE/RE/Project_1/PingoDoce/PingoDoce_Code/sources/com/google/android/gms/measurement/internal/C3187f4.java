package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* loaded from: classes.dex */
public final class C3187f4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final String f8434a;

    /* renamed from: b */
    final /* synthetic */ C3220i4 f8435b;

    public C3187f4(C3220i4 c3220i4, String str) {
        this.f8435b = c3220i4;
        C2597i.m33076j(str);
        this.f8434a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th2) {
        this.f8435b.f8410a.mo31116d().m31332r().m31397b(this.f8434a, th2);
    }
}
