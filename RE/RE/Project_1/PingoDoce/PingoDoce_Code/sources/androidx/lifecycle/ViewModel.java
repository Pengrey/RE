package androidx.lifecycle;

import bd.CoroutineContext;
import java.io.Closeable;
import p181jd.Intrinsics;
import td.C10596y1;
import td.InterfaceC10524i0;

/* renamed from: androidx.lifecycle.e */
/* loaded from: classes.dex */
public final class ViewModel implements Closeable, InterfaceC10524i0 {

    /* renamed from: w */
    private final CoroutineContext f4291w;

    public ViewModel(CoroutineContext coroutineContext) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        this.f4291w = coroutineContext;
    }

    public void close() {
        C10596y1.m7595e(mo7716y(), null, 1, null);
    }

    /* renamed from: y */
    public CoroutineContext mo7716y() {
        return this.f4291w;
    }
}
