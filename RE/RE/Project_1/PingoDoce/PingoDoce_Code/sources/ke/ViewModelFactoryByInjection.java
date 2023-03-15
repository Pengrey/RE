package ke;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1459l0;
import androidx.savedstate.InterfaceC1663c;
import java.util.Map;
import p181jd.Intrinsics;

/* renamed from: ke.d */
/* loaded from: classes2.dex */
public final class ViewModelFactoryByInjection {

    /* renamed from: a */
    private final Map f17946a;

    /* compiled from: ViewModelFactoryByInjection.kt */
    /* renamed from: ke.d$a */
    /* loaded from: classes2.dex */
    public static final class C6658a extends AbstractC1423a {

        /* renamed from: d */
        final /* synthetic */ ViewModelFactoryByInjection f17947d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6658a(InterfaceC1663c interfaceC1663c, Bundle bundle, ViewModelFactoryByInjection viewModelFactoryByInjection) {
            super(interfaceC1663c, bundle);
            this.f17947d = viewModelFactoryByInjection;
        }

        /* renamed from: d */
        protected AbstractC1468o0 mo37067d(String str, Class cls, C1459l0 c1459l0) {
            Intrinsics.isThisObjectNull(str, "key");
            Intrinsics.isThisObjectNull(cls, "modelClass");
            Intrinsics.isThisObjectNull(c1459l0, "handle");
            InterfaceC6657b interfaceC6657b = (InterfaceC6657b) ViewModelFactoryByInjection.m20378a(this.f17947d).get(cls);
            AbstractC1468o0 mo14a = interfaceC6657b != null ? interfaceC6657b.mo14a(c1459l0) : null;
            if (mo14a != null) {
                return mo14a;
            }
            throw new IllegalStateException("Unknown ViewModel class");
        }
    }

    public ViewModelFactoryByInjection(Map map) {
        Intrinsics.isThisObjectNull(map, "viewModelMap");
        this.f17946a = map;
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m20378a(ViewModelFactoryByInjection viewModelFactoryByInjection) {
        return viewModelFactoryByInjection.f17946a;
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC1423a m20376c(ViewModelFactoryByInjection viewModelFactoryByInjection, InterfaceC1663c interfaceC1663c, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return viewModelFactoryByInjection.m20377b(interfaceC1663c, bundle);
    }

    /* renamed from: b */
    public final AbstractC1423a m20377b(InterfaceC1663c interfaceC1663c, Bundle bundle) {
        Intrinsics.isThisObjectNull(interfaceC1663c, "owner");
        return new C6658a(interfaceC1663c, bundle, this);
    }
}
