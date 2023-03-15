package androidx.fragment.app;

import androidx.lifecycle.C1479r0;
import androidx.lifecycle.ViewModelProvider;
import id.InterfaceC6097a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p468yc.InterfaceC13178g;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public final class FragmentViewModelLazy {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: androidx.fragment.app.w$a */
    /* loaded from: classes.dex */
    public static final class C1404a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ Fragment f4191w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1404a(Fragment fragment) {
            super(0);
            this.f4191w = fragment;
        }

        /* renamed from: a */
        public final C1479r0.InterfaceC1481b mo42214q() {
            return this.f4191w.mo36992p();
        }
    }

    /* renamed from: a */
    public static final InterfaceC13178g m37123a(Fragment fragment, InterfaceC9717b interfaceC9717b, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2) {
        Intrinsics.isThisObjectNull(fragment, "$this$createViewModelLazy");
        Intrinsics.isThisObjectNull(interfaceC9717b, "viewModelClass");
        Intrinsics.isThisObjectNull(interfaceC6097a, "storeProducer");
        if (interfaceC6097a2 == null) {
            interfaceC6097a2 = new C1404a(fragment);
        }
        return new ViewModelProvider(interfaceC9717b, interfaceC6097a, interfaceC6097a2);
    }
}
