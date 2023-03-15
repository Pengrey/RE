package p299pj;

import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.tabs.C3737e;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p299pj.WalkThroughViewModel;
import p426wg.AbstractC12021t4;
import p494zh.BaseActivity;
import pe.C8618e;

/* renamed from: pj.b */
/* loaded from: classes2.dex */
public abstract class WalkThroughActivity<ViewModel extends WalkThroughViewModel> extends BaseActivity {

    /* compiled from: WalkThroughActivity.kt */
    /* renamed from: pj.b$a */
    /* loaded from: classes2.dex */
    public static final class C8633a {
        private C8633a() {
        }

        public /* synthetic */ C8633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WalkThroughActivity.kt */
    /* renamed from: pj.b$b */
    /* loaded from: classes2.dex */
    public static final class C8634b implements TabLayout.InterfaceC3724d {

        /* renamed from: a */
        final /* synthetic */ WalkThroughViewModel f22260a;

        C8634b(WalkThroughViewModel walkThroughViewModel) {
            this.f22260a = walkThroughViewModel;
        }

        /* renamed from: a */
        public void mo29092a(TabLayout.C3728f c3728f) {
            Intrinsics.isThisObjectNull(c3728f, "tab");
        }

        /* renamed from: b */
        public void mo29091b(TabLayout.C3728f c3728f) {
            Intrinsics.isThisObjectNull(c3728f, "tab");
        }

        /* renamed from: c */
        public void mo29090c(TabLayout.C3728f c3728f) {
            Intrinsics.isThisObjectNull(c3728f, "tab");
            this.f22260a.m14941T(c3728f.m29150g() != 4);
        }
    }

    static {
        new C8633a(null);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m14961i1(TabLayout.C3728f c3728f, int i) {
        m14957m1(c3728f, i);
    }

    /* renamed from: m1 */
    private static final void m14957m1(TabLayout.C3728f c3728f, int i) {
        Intrinsics.isThisObjectNull(c3728f, "<anonymous parameter 0>");
    }

    /* renamed from: S0 */
    protected boolean m14962S0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: k1 */
    protected abstract WalkThroughStepsAdapter m14959k1();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m14963P0(AbstractC12021t4 abstractC12021t4, WalkThroughViewModel walkThroughViewModel) {
        Intrinsics.isThisObjectNull(abstractC12021t4, "binding");
        Intrinsics.isThisObjectNull(walkThroughViewModel, "viewModel");
        ViewPager2 viewPager2 = abstractC12021t4.f31518z;
        viewPager2.setAdapter(m14959k1());
        new C3737e(abstractC12021t4.f31517y, viewPager2, C8632a.f22259a).m29104a();
        abstractC12021t4.f31517y.m29190d(new C8634b(walkThroughViewModel));
    }

    /* renamed from: n */
    public boolean m14956n() {
        return false;
    }

    public void onBackPressed() {
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_walkthrough;
    }
}
