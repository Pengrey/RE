package androidx.lifecycle;

import bd.CoroutineContext;
import id.InterfaceC6112p;
import p181jd.Intrinsics;

/* compiled from: CoroutineLiveData.kt */
/* renamed from: androidx.lifecycle.g */
/* loaded from: classes.dex */
public final class C1441g {
    /* renamed from: a */
    public static final LiveData m37041a(CoroutineContext coroutineContext, long j, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(coroutineContext, "context");
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        return new C1437f(coroutineContext, j, interfaceC6112p);
    }
}
