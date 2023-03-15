package p299pj;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import p181jd.Intrinsics;

/* renamed from: pj.d */
/* loaded from: classes2.dex */
public abstract class WalkThroughStepsAdapter extends FragmentStateAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkThroughStepsAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
    }
}
