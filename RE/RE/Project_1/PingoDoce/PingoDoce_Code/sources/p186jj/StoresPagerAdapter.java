package p186jj;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import p181jd.Intrinsics;

/* renamed from: jj.e */
/* loaded from: classes2.dex */
public abstract class StoresPagerAdapter extends FragmentStateAdapter {

    /* renamed from: k */
    private final List f17645k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoresPagerAdapter(List list, FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(list, "tabs");
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        this.f17645k = list;
    }

    /* renamed from: X */
    public final List m20760X() {
        return this.f17645k;
    }
}
