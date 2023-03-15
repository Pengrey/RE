package pt.pingodoce.app.presentation.takeaway.pickupstore;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1469p;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.LatLng;
import id.InterfaceC6097a;
import java.util.List;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p186jj.StoreActivity;
import p314qd.InterfaceC9717b;
import p431wl.TakeAwayStorePageAdapter;
import p431wl.TakeAwayStoreViewModel;
import p489zc.C13780s;
import pe.C8617d;

/* compiled from: TakeAwayStoreActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayStoreActivity extends StoreActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f25041j0;

    /* compiled from: TakeAwayStoreActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.pickupstore.TakeAwayStoreActivity$a */
    /* loaded from: classes2.dex */
    static final class C9521a extends AbstractC6438m implements InterfaceC6097a {
        C9521a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(TakeAwayStoreActivity.this.m10794t1(), TakeAwayStoreActivity.this, null, 2, null);
        }
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_arrow_back;
    }

    /* renamed from: G0 */
    protected int m10800G0() {
        return C2336R.string.lbl_takeaway_store;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10799J0() {
        return C6450z.m20906b(TakeAwayStoreViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10798K0() {
        return new C9521a();
    }

    /* renamed from: n1 */
    public void m10797n1(String str, LatLng latLng) {
        Intrinsics.isThisObjectNull(str, "query");
        ((TakeAwayStoreViewModel) m22758I0()).m3400k0(str, latLng);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m10794t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25041j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: u1 */
    public TakeAwayStorePageAdapter m10796p1() {
        List m194j;
        FragmentManager m37323P = m37323P();
        Intrinsics.checkIfNull(m37323P, "supportFragmentManager");
        AbstractC1469p mo137b = mo137b();
        Intrinsics.checkIfNull(mo137b, "lifecycle");
        String string = getString(C2336R.string.lbl_store_list);
        Intrinsics.checkIfNull(string, "getString(R.string.lbl_store_list)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkIfNull(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkIfNull(upperCase, "this as java.lang.String).toUpperCase(locale)");
        String string2 = getString(C2336R.string.lbl_store_map);
        Intrinsics.checkIfNull(string2, "getString(R.string.lbl_store_map)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkIfNull(locale2, "getDefault()");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkIfNull(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        m194j = C13780s.m194j(upperCase, upperCase2);
        return new TakeAwayStorePageAdapter(m37323P, mo137b, m194j);
    }
}
