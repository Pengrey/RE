package androidx.lifecycle;

import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1479r0;
import id.InterfaceC6097a;
import p139hd.JvmClassMapping;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.InterfaceC13178g;

/* renamed from: androidx.lifecycle.q0 */
/* loaded from: classes.dex */
public final class ViewModelProvider<VM extends AbstractC1468o0> implements InterfaceC13178g {

    /* renamed from: w */
    private AbstractC1468o0 f4356w;

    /* renamed from: x */
    private final InterfaceC9717b f4357x;

    /* renamed from: y */
    private final InterfaceC6097a f4358y;

    /* renamed from: z */
    private final InterfaceC6097a f4359z;

    public ViewModelProvider(InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2) {
        Intrinsics.isThisObjectNull(interfaceC9717b, "viewModelClass");
        Intrinsics.isThisObjectNull(interfaceC6097a, "storeProducer");
        Intrinsics.isThisObjectNull(interfaceC6097a2, "factoryProducer");
        this.f4357x = interfaceC9717b;
        this.f4358y = interfaceC6097a;
        this.f4359z = interfaceC6097a2;
    }

    /* renamed from: a */
    public AbstractC1468o0 getValue() {
        AbstractC1468o0 abstractC1468o0 = this.f4356w;
        if (abstractC1468o0 == null) {
            AbstractC1468o0 m36981a = new C1479r0((C1486s0) this.f4358y.mo42214q(), (C1479r0.InterfaceC1481b) this.f4359z.mo42214q()).m36981a(JvmClassMapping.m22767a(this.f4357x));
            this.f4356w = m36981a;
            Intrinsics.checkIfNull(m36981a, "ViewModelProvider(store,…ed = it\n                }");
            return m36981a;
        }
        return abstractC1468o0;
    }
}
