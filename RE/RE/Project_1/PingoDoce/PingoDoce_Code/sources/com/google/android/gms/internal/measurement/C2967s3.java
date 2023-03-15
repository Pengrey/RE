package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.s3 */
/* loaded from: classes.dex */
public final class C2967s3 extends C2892n8 implements InterfaceC2989t9 {
    private C2967s3() {
        super(C2983t3.m32084F());
    }

    /* renamed from: r */
    public final int m32132r() {
        return ((C2983t3) this.f7891x).m32088B();
    }

    /* renamed from: s */
    public final C2951r3 m32131s(int i) {
        return ((C2983t3) this.f7891x).m32086D(i);
    }

    /* renamed from: u */
    public final C2967s3 m32130u() {
        if (this.f7892y) {
            m32430l();
            this.f7892y = false;
        }
        C2983t3.m32077M((C2983t3) this.f7891x);
        return this;
    }

    /* renamed from: w */
    public final C2967s3 m32129w(int i, C2919p3 c2919p3) {
        if (this.f7892y) {
            m32430l();
            this.f7892y = false;
        }
        C2983t3.m32078L((C2983t3) this.f7891x, i, (C2951r3) c2919p3.m32426p());
        return this;
    }

    /* renamed from: x */
    public final List m32128x() {
        return Collections.unmodifiableList(((C2983t3) this.f7891x).m32081I());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2967s3(C2903o3 c2903o3) {
        super(C2983t3.m32084F());
    }
}
