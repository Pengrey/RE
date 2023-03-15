package p319qi;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import p181jd.Intrinsics;

/* renamed from: qi.c */
/* loaded from: classes2.dex */
public abstract class ManageAssociationsPagerAdapter extends FragmentStateAdapter {

    /* renamed from: k */
    private final List f25619k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageAssociationsPagerAdapter(List list, FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(list, "tabs");
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        this.f25619k = list;
    }

    /* renamed from: X */
    public final List m10061X() {
        return this.f25619k;
    }
}
