package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.p */
/* loaded from: classes.dex */
abstract class AbstractBinderC2624p extends AbstractBinderC2622n {

    /* renamed from: c */
    private static final WeakReference<byte[]> f7544c = new WeakReference<>(null);

    /* renamed from: b */
    private WeakReference<byte[]> f7545b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC2624p(byte[] bArr) {
        super(bArr);
        this.f7545b = f7544c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.common.AbstractBinderC2622n
    /* renamed from: S1 */
    public final byte[] mo33009S1() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f7545b.get();
            if (bArr == null) {
                bArr = mo33008T1();
                this.f7545b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: T1 */
    protected abstract byte[] mo33008T1();
}
