package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C2597i;
import java.util.Map;
import p009a8.C0071d;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* loaded from: classes.dex */
final class RunnableC3230j3 implements Runnable {

    /* renamed from: A */
    private final String f8554A;

    /* renamed from: B */
    private final Map f8555B;

    /* renamed from: w */
    private final InterfaceC3219i3 f8556w;

    /* renamed from: x */
    private final int f8557x;

    /* renamed from: y */
    private final Throwable f8558y;

    /* renamed from: z */
    private final byte[] f8559z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ RunnableC3230j3(String str, InterfaceC3219i3 interfaceC3219i3, int i, Throwable th2, byte[] bArr, Map map, C0071d c0071d) {
        C2597i.m33076j(interfaceC3219i3);
        this.f8556w = interfaceC3219i3;
        this.f8557x = i;
        this.f8558y = th2;
        this.f8559z = bArr;
        this.f8554A = str;
        this.f8555B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8556w.mo30927a(this.f8554A, this.f8557x, this.f8558y, this.f8559z, this.f8555B);
    }
}
