package p319qi;

import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import p181jd.Intrinsics;
import p315qe.AbstractC9725a;
import p319qi.ManageAssociationsViewModel;
import p426wg.AbstractC11827j1;
import p494zh.BaseActivity;
import pe.C8617d;

/* renamed from: qi.b */
/* loaded from: classes2.dex */
public abstract class ManageAssociationsActivity<ViewModel extends ManageAssociationsViewModel> extends BaseActivity {
    /* renamed from: i1 */
    public static /* synthetic */ void m10068i1(ManageAssociationsPagerAdapter manageAssociationsPagerAdapter, TabLayout.C3728f c3728f, int i) {
        m10065l1(manageAssociationsPagerAdapter, c3728f, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static final void m10065l1(ManageAssociationsPagerAdapter manageAssociationsPagerAdapter, TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(manageAssociationsPagerAdapter, "$pagerAdapter");
        Intrinsics.isThisObjectNull(c3728f, "tab");
        c3728f.m29139r((CharSequence) manageAssociationsPagerAdapter.m10061X().get(i));
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_arrow_back;
    }

    /* renamed from: E0 */
    protected Integer m10070E0() {
        return Integer.valueOf((int) C2336R.string.lbl_profile_data_manage_associations_title_alt);
    }

    /* renamed from: j1 */
    public abstract ManageAssociationsPagerAdapter m10067j1();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public void m10069P0(AbstractC11827j1 abstractC11827j1, ManageAssociationsViewModel manageAssociationsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11827j1, "binding");
        Intrinsics.isThisObjectNull(manageAssociationsViewModel, "viewModel");
        final ManageAssociationsPagerAdapter m10067j1 = m10067j1();
        ViewPager2 viewPager2 = abstractC11827j1.f30623y;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setAdapter(m10067j1);
        viewPager2.setOffscreenPageLimit(1);
        new C3737e(abstractC11827j1.f30622x, abstractC11827j1.f30623y, new C3737e.InterfaceC3739b() { // from class: qi.a
            @Override // com.google.android.material.tabs.C3737e.InterfaceC3739b
            /* renamed from: a */
            public final void mo8459a(TabLayout.C3728f c3831f, int i) {
                ManageAssociationsActivity.m10065l1(ManageAssociationsPagerAdapter.this, c3831f, i);
            }
        }).m29104a();
    }

    /* renamed from: n */
    public boolean m10064n() {
        return true;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_manage_associations;
    }
}
