package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b1 */
/* loaded from: classes.dex */
public final class BinderC2693b1 extends AbstractBinderC2789h1 {

    /* renamed from: a */
    private final AtomicReference f7655a = new AtomicReference();

    /* renamed from: b */
    private boolean f7656b;

    /* renamed from: S1 */
    public static final Object m32893S1(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2805i1
    /* renamed from: A */
    public final void mo32591A(Bundle bundle) {
        synchronized (this.f7655a) {
            this.f7655a.set(bundle);
            this.f7656b = true;
            this.f7655a.notify();
        }
    }

    /* renamed from: H */
    public final String m32894H(long j) {
        return (String) m32893S1(m32892y(j), String.class);
    }

    /* renamed from: y */
    public final Bundle m32892y(long j) {
        Bundle bundle;
        synchronized (this.f7655a) {
            if (!this.f7656b) {
                try {
                    this.f7655a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f7655a.get();
        }
        return bundle;
    }
}
