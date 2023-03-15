package pt.pingodoce.app.presentation.common.versioncontrol;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.C2336R;
import fk.LockActivity;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p279oj.VersionControlViewModel;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11906n4;
import p494zh.BaseActivity;
import pe.C8619f;
import pt.pingodoce.app.presentation.common.versioncontrol.VersionControlActivity;

/* compiled from: VersionControlActivity.kt */
/* loaded from: classes2.dex */
public final class VersionControlActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f24095f0;

    /* compiled from: VersionControlActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.common.versioncontrol.VersionControlActivity$a */
    /* loaded from: classes2.dex */
    static final class C9144a extends AbstractC6438m implements InterfaceC6097a {
        C9144a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(VersionControlActivity.this.m12319l1(), VersionControlActivity.this, null, 2, null);
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12322i1(VersionControlActivity versionControlActivity, View view) {
        m12315o1(versionControlActivity, view);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12321j1(VersionControlActivity versionControlActivity, View view) {
        m12316n1(versionControlActivity, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m12316n1(VersionControlActivity versionControlActivity, View view) {
        Intrinsics.isThisObjectNull(versionControlActivity, "this$0");
        try {
            versionControlActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=pt.pingodoce")));
        } catch (ActivityNotFoundException unused) {
            versionControlActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=pt.pingodoce")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m12315o1(VersionControlActivity versionControlActivity, View view) {
        Intrinsics.isThisObjectNull(versionControlActivity, "this$0");
        LockActivity.m23737c(versionControlActivity);
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_arrow_back;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12326J0() {
        return C6450z.m20906b(VersionControlViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12325K0() {
        return new C9144a();
    }

    /* renamed from: S0 */
    protected boolean m12323S0() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k1 */
    public C8619f mo42216v0() {
        return new C8619f();
    }

    /* renamed from: l1 */
    public final ViewModelFactoryByInjection m12319l1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24095f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m1 */
    public void m12324P0(AbstractC11906n4 abstractC11906n4, VersionControlViewModel versionControlViewModel) {
        Intrinsics.isThisObjectNull(abstractC11906n4, "binding");
        Intrinsics.isThisObjectNull(versionControlViewModel, "viewModel");
        abstractC11906n4.f31026y.setOnClickListener(new View.OnClickListener() { // from class: oj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VersionControlActivity.m12316n1(VersionControlActivity.this, view);
            }
        });
        abstractC11906n4.f31025x.setOnClickListener(new View.OnClickListener() { // from class: oj.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VersionControlActivity.m12315o1(VersionControlActivity.this, view);
            }
        });
    }

    /* renamed from: n */
    public boolean m12317n() {
        return true;
    }

    public void onBackPressed() {
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_version_control;
    }
}
