package p087ej;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import dj.ProductListFragment;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.products.Category;

/* renamed from: ej.i */
/* loaded from: classes2.dex */
public final class ProductPageAdapter extends FragmentStateAdapter {

    /* renamed from: k */
    private final List f14166k;

    /* renamed from: l */
    private final boolean f14167l;

    /* renamed from: m */
    private final Integer f14168m;

    /* renamed from: n */
    private final boolean f14169n;

    public /* synthetic */ ProductPageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, List list, boolean z, Integer num, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, abstractC1469p, list, z, (i & 16) != 0 ? null : num, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (((Category) this.f14166k.get(i)).m14486h()) {
            return ProductListFragment.f13290H0.m26408b(this.f14169n);
        }
        return ProductListFragment.f13290H0.m26409a(Integer.valueOf(((Category) this.f14166k.get(i)).m14491b()), this.f14167l, this.f14168m, this.f14169n);
    }

    /* renamed from: f */
    public int mo29834f() {
        return this.f14166k.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductPageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, List list, boolean z, Integer num, boolean z2) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(list, "categories");
        this.f14166k = list;
        this.f14167l = z;
        this.f14168m = num;
        this.f14169n = z2;
    }
}
