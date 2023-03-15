package p431wl;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p186jj.StoresPagerAdapter;
import p476yl.TakeAwayStoreListFragment;
import p498zl.TakeAwayStoreMapFragment;

/* renamed from: wl.c */
/* loaded from: classes2.dex */
public final class TakeAwayStorePageAdapter extends StoresPagerAdapter {

    /* compiled from: TakeAwayStorePageAdapter.kt */
    /* renamed from: wl.c$a */
    /* loaded from: classes2.dex */
    public static final class C12203a {
        private C12203a() {
        }

        public /* synthetic */ C12203a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C12203a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayStorePageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, List list) {
        super(list, fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(list, "tabs");
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (i == 0) {
            return TakeAwayStoreListFragment.f34275E0.m1298a();
        }
        return TakeAwayStoreMapFragment.f35111H0.m4a();
    }

    /* renamed from: f */
    public int mo29834f() {
        return m20760X().size();
    }
}
