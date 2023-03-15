package p468yc;

import id.InterfaceC6097a;
import kotlin.EnumC6754a;
import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yc.i */
/* loaded from: classes2.dex */
public class LazyJVM {

    /* compiled from: LazyJVM.kt */
    /* renamed from: yc.i$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C13180a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34140a;

        static {
            int[] iArr = new int[EnumC6754a.values().length];
            iArr[EnumC6754a.SYNCHRONIZED.ordinal()] = 1;
            iArr[EnumC6754a.PUBLICATION.ordinal()] = 2;
            iArr[EnumC6754a.NONE.ordinal()] = 3;
            f34140a = iArr;
        }
    }

    /* renamed from: a */
    public static InterfaceC13178g m1464a(InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "initializer");
        return new C13189p(interfaceC6097a, null, 2, null);
    }

    /* renamed from: b */
    public static InterfaceC13178g m1463b(EnumC6754a enumC6754a, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(enumC6754a, "mode");
        Intrinsics.isThisObjectNull(interfaceC6097a, "initializer");
        int i = C13180a.f34140a[enumC6754a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new Lazy(interfaceC6097a);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C13187o(interfaceC6097a);
        }
        return new C13189p(interfaceC6097a, null, 2, null);
    }
}
