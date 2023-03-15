package androidx.lifecycle;

import p181jd.Intrinsics;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10524i0;

/* compiled from: ViewModel.kt */
/* renamed from: androidx.lifecycle.p0 */
/* loaded from: classes.dex */
public final class C1473p0 {
    /* renamed from: a */
    public static final InterfaceC10524i0 m36987a(AbstractC1468o0 abstractC1468o0) {
        Intrinsics.isThisObjectNull(abstractC1468o0, "$this$viewModelScope");
        InterfaceC10524i0 interfaceC10524i0 = (InterfaceC10524i0) abstractC1468o0.m36989d("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (interfaceC10524i0 != null) {
            return interfaceC10524i0;
        }
        Object m36988f = abstractC1468o0.m36988f("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new ViewModel(C10549n2.m7695b(null, 1, null).mo4545f0(C10587w0.m7619c().mo7830H0())));
        Intrinsics.checkIfNull(m36988f, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (InterfaceC10524i0) m36988f;
    }
}
