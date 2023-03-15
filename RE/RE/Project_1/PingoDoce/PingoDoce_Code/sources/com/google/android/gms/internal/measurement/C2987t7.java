package com.google.android.gms.internal.measurement;

import com.google.crypto.tink.shaded.protobuf.Reader;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t7 */
/* loaded from: classes.dex */
final class C2987t7 extends C3017v7 {

    /* renamed from: b */
    private int f8011b;

    /* renamed from: c */
    private int f8012c;

    /* renamed from: d */
    private int f8013d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2987t7(byte[] bArr, int i, int i2, boolean z, C2971s7 c2971s7) {
        super(null);
        this.f8013d = Reader.READ_DONE;
        this.f8011b = 0;
    }

    /* renamed from: c */
    public final int m32063c(int i) throws zzkh {
        int i2 = this.f8013d;
        this.f8013d = 0;
        int i3 = this.f8011b + this.f8012c;
        this.f8011b = i3;
        if (i3 > 0) {
            this.f8012c = i3;
            this.f8011b = 0;
        } else {
            this.f8012c = 0;
        }
        return i2;
    }
}
