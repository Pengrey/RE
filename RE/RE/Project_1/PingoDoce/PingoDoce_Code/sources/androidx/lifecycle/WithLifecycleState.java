package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import id.InterfaceC6097a;
import kotlin.Metadata;
import p181jd.Intrinsics;
import p468yc.C13183m;
import p468yc.C13186n;
import td.InterfaceC10529j;

@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, m20207d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/s;", "lifecycle-runtime-ktx_release"}, m20206k = 1, m20205mv = {1, 4, 1})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class WithLifecycleState implements InterfaceC1485s {

    /* renamed from: w */
    final /* synthetic */ InterfaceC10529j f4256w;

    /* renamed from: x */
    final /* synthetic */ AbstractC1469p f4257x;

    /* renamed from: y */
    final /* synthetic */ AbstractC1469p.EnumC1472c f4258y;

    /* renamed from: z */
    final /* synthetic */ InterfaceC6097a f4259z;

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Object m1458a;
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.upTo(this.f4258y)) {
            this.f4257x.mo10400c(this);
            InterfaceC10529j interfaceC10529j = this.f4256w;
            InterfaceC6097a interfaceC6097a = this.f4259z;
            try {
                C13183m.C13184a c13184a = C13183m.f34143w;
                m1458a = C13183m.m1458a(interfaceC6097a.mo42214q());
            } catch (Throwable th2) {
                C13183m.C13184a c13184a2 = C13183m.f34143w;
                m1458a = C13183m.m1458a(C13186n.m1454a(th2));
            }
            interfaceC10529j.resumeWith(m1458a);
        } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
            this.f4257x.mo10400c(this);
            InterfaceC10529j interfaceC10529j2 = this.f4256w;
            androidx.lifecycle.WithLifecycleState withLifecycleState = new androidx.lifecycle.WithLifecycleState();
            C13183m.C13184a c13184a3 = C13183m.f34143w;
            interfaceC10529j2.resumeWith(C13183m.m1458a(C13186n.m1454a(withLifecycleState)));
        }
    }
}
