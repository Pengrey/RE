package pt.pingodoce.app.presentation.common.loyalty.removed;

import android.view.View;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import be.OperatorExtensions;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13914w;
import pt.pingodoce.app.presentation.common.loyalty.removed.LoyaltyRemovedViewModel;

/* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.a */
/* loaded from: classes2.dex */
public final class LoyaltyRemovedViewModel extends BaseViewModel {

    /* renamed from: m */
    private final InterfaceC6108l f23879m;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoyaltyRemovedViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC9060a {
        DISMISS,
        ADD_NEW_CARD
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyRemovedViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.a$b */
    /* loaded from: classes2.dex */
    public static final class C9061b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: LoyaltyRemovedViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.common.loyalty.removed.a$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9062a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23881a;

            static {
                int[] iArr = new int[EnumC9060a.values().length];
                iArr[EnumC9060a.DISMISS.ordinal()] = 1;
                iArr[EnumC9060a.ADD_NEW_CARD.ordinal()] = 2;
                f23881a = iArr;
            }
        }

        C9061b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12699a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "type");
            int i = C9062a.f23881a[((EnumC9060a) c13182l.m1460c()).ordinal()];
            if (i == 1) {
                LoyaltyRemovedViewModel.this.m105u();
            } else if (i != 2) {
            } else {
                BaseViewModel.m119C(LoyaltyRemovedViewModel.this, C13914w.f35035a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12699a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyRemovedViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f23879m = OperatorExtensions.m35177d(700L, C1473p0.m36987a(this), new C9061b());
    }

    /* renamed from: L */
    public static /* synthetic */ void m12705L(LoyaltyRemovedViewModel loyaltyRemovedViewModel, View view) {
        m12702O(loyaltyRemovedViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m12704M(LoyaltyRemovedViewModel loyaltyRemovedViewModel, View view) {
        m12700Q(loyaltyRemovedViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m12702O(LoyaltyRemovedViewModel loyaltyRemovedViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyRemovedViewModel, "this$0");
        loyaltyRemovedViewModel.f23879m.mo9587d(new C13182l(EnumC9060a.ADD_NEW_CARD, C13195u.f34156a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m12700Q(LoyaltyRemovedViewModel loyaltyRemovedViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyRemovedViewModel, "this$0");
        loyaltyRemovedViewModel.f23879m.mo9587d(new C13182l(EnumC9060a.DISMISS, C13195u.f34156a));
    }

    /* renamed from: N */
    public final View.OnClickListener m12703N() {
        return new View.OnClickListener() { // from class: ti.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyRemovedViewModel.m12702O(LoyaltyRemovedViewModel.this, view);
            }
        };
    }

    /* renamed from: P */
    public final View.OnClickListener m12701P() {
        return new View.OnClickListener() { // from class: ti.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyRemovedViewModel.m12700Q(LoyaltyRemovedViewModel.this, view);
            }
        };
    }
}
