package p407vj;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p186jj.StoresPagerAdapter;
import p452xj.DefaultStoreListFragment;
import p474yj.DefaultStoreMapFragment;

/* renamed from: vj.c */
/* loaded from: classes2.dex */
public final class DefaultStorePageAdapter extends StoresPagerAdapter {

    /* compiled from: DefaultStorePageAdapter.kt */
    /* renamed from: vj.c$a */
    /* loaded from: classes2.dex */
    public static final class C11370a {
        private C11370a() {
        }

        public /* synthetic */ C11370a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11370a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultStorePageAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p, List list) {
        super(list, fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
        Intrinsics.isThisObjectNull(list, "tabs");
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (i == 0) {
            return DefaultStoreListFragment.f33748E0.m1943a();
        }
        return DefaultStoreMapFragment.f34240H0.m1330a();
    }

    /* renamed from: f */
    public int mo29834f() {
        return m20760X().size();
    }
}
