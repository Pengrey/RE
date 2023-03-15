package dm;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p299pj.WalkThroughStepsAdapter;

/* renamed from: dm.c */
/* loaded from: classes2.dex */
public final class TakeAwayWalkThroughAdapter extends WalkThroughStepsAdapter {

    /* compiled from: TakeAwayWalkThroughAdapter.kt */
    /* renamed from: dm.c$a */
    /* loaded from: classes2.dex */
    public static final class C4893a {
        private C4893a() {
        }

        public /* synthetic */ C4893a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4893a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayWalkThroughAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new TakeAwayWalkThroughStep4Fragment();
                }
                return new TakeAwayWalkThroughStep3Fragment();
            }
            return new TakeAwayWalkThroughStep2Fragment();
        }
        return new TakeAwayWalkThroughStep1Fragment();
    }

    /* renamed from: f */
    public int mo29834f() {
        return 4;
    }
}
