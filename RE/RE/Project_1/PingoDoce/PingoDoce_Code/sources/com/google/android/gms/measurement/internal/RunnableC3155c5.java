package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3008ud;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c5 */
/* loaded from: classes.dex */
final class RunnableC3155c5 implements Runnable {

    /* renamed from: A */
    final /* synthetic */ BinderC3166d5 f8364A;

    /* renamed from: w */
    final /* synthetic */ String f8365w;

    /* renamed from: x */
    final /* synthetic */ String f8366x;

    /* renamed from: y */
    final /* synthetic */ String f8367y;

    /* renamed from: z */
    final /* synthetic */ long f8368z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC3155c5(BinderC3166d5 binderC3166d5, String str, String str2, String str3, long j) {
        this.f8364A = binderC3166d5;
        this.f8365w = str;
        this.f8366x = str2;
        this.f8367y = str3;
        this.f8368z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3137a9 c3137a9;
        C3137a9 c3137a92;
        C3137a9 c3137a93;
        C3137a9 c3137a94;
        C3137a9 c3137a95;
        C3008ud.m31995b();
        c3137a9 = this.f8364A.f8386a;
        if (c3137a9.m31497T().m31373B(null, C3339t2.f8946s0)) {
            String str = this.f8365w;
            if (str == null) {
                c3137a95 = this.f8364A.f8386a;
                c3137a95.m31463v(this.f8366x, null);
                return;
            }
            C3299p6 c3299p6 = new C3299p6(this.f8367y, str, this.f8368z);
            c3137a94 = this.f8364A.f8386a;
            c3137a94.m31463v(this.f8366x, c3299p6);
            return;
        }
        String str2 = this.f8365w;
        if (str2 == null) {
            c3137a93 = this.f8364A.f8386a;
            c3137a93.m31488b0().m31127K().m30901G(this.f8366x, null);
            return;
        }
        C3299p6 c3299p62 = new C3299p6(this.f8367y, str2, this.f8368z);
        c3137a92 = this.f8364A.f8386a;
        c3137a92.m31488b0().m31127K().m30901G(this.f8366x, c3299p62);
    }
}
