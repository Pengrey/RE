package kotlinx.coroutines;

import bd.CoroutineContext;
import p468yc.C13195u;
import td.AbstractC10476a;
import td.C10515g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* renamed from: kotlinx.coroutines.j */
/* loaded from: classes2.dex */
public class C6909j extends AbstractC10476a<C13195u> {
    public C6909j(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // td.C10479a2
    /* renamed from: k0 */
    protected boolean mo19832k0(Throwable th2) {
        C10515g0.m7790a(getContext(), th2);
        return true;
    }
}
