package p067dh;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p085eh.C5076a;
import p109fh.C5518a;
import p181jd.Intrinsics;
import p319qi.ManageAssociationsPagerAdapter;

/* renamed from: dh.f */
/* loaded from: classes2.dex */
public final class LoyaltyAssociationsPageAdapter extends ManageAssociationsPagerAdapter {

    /* compiled from: LoyaltyAssociationsPageAdapter.kt */
    /* renamed from: dh.f$a */
    /* loaded from: classes2.dex */
    public static final class C4857a {
        private C4857a() {
        }

        public /* synthetic */ C4857a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4857a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyAssociationsPageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, List list) {
        super(list, fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(list, "tabs");
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (i == 0) {
            return C5518a.f15669B0.m23795a();
        }
        return C5076a.f14094B0.m25729a();
    }

    /* renamed from: f */
    public int mo29834f() {
        return m10061X().size();
    }
}
