package ke;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1459l0;
import androidx.savedstate.InterfaceC1663c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ke.c */
/* loaded from: classes2.dex */
public final class ViewModelFactory<V extends AbstractC1468o0> extends AbstractC1423a {

    /* renamed from: d */
    private final InterfaceC6657b f17945d;

    public /* synthetic */ ViewModelFactory(InterfaceC6657b interfaceC6657b, InterfaceC1663c interfaceC1663c, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6657b, interfaceC1663c, (i & 4) != 0 ? null : bundle);
    }

    /* renamed from: d */
    protected AbstractC1468o0 mo37067d(String str, Class cls, C1459l0 c1459l0) {
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(cls, "modelClass");
        Intrinsics.isThisObjectNull(c1459l0, "handle");
        return this.f17945d.mo14a(c1459l0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelFactory(InterfaceC6657b interfaceC6657b, InterfaceC1663c interfaceC1663c, Bundle bundle) {
        super(interfaceC1663c, bundle);
        Intrinsics.isThisObjectNull(interfaceC6657b, "viewModelFactory");
        Intrinsics.isThisObjectNull(interfaceC1663c, "owner");
        this.f17945d = interfaceC6657b;
    }
}
