package pt.pingodoce.app.presentation.onboarding.userdata.update;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1423a;
import ci.C2143g;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p069dl.UserDataActivity;
import p110fl.UserDataUpdateViewModel;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11867l4;
import p468yc.C13182l;
import p489zc.C13780s;

/* compiled from: UserDataUpdateActivity.kt */
/* loaded from: classes2.dex */
public final class UserDataUpdateActivity extends UserDataActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24588g0;

    /* compiled from: UserDataUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.userdata.update.UserDataUpdateActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9355a {
        private C9355a() {
        }

        public /* synthetic */ C9355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UserDataUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.onboarding.userdata.update.UserDataUpdateActivity$b */
    /* loaded from: classes2.dex */
    static final class C9356b extends AbstractC6438m implements InterfaceC6097a {
        C9356b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m11523t1 = UserDataUpdateActivity.this.m11523t1();
            UserDataUpdateActivity userDataUpdateActivity = UserDataUpdateActivity.this;
            return m11523t1.m20377b(userDataUpdateActivity, userDataUpdateActivity.getIntent().getExtras());
        }
    }

    static {
        new C9355a(null);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11530J0() {
        return C6450z.m20906b(UserDataUpdateViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11529K0() {
        return new C9356b();
    }

    /* renamed from: k1 */
    protected List m11527k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: m1 */
    public void m11526m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m11523t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24588g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public void m11524s1(AbstractC11867l4 abstractC11867l4, UserDataUpdateViewModel userDataUpdateViewModel) {
        Intrinsics.isThisObjectNull(abstractC11867l4, "binding");
        Intrinsics.isThisObjectNull(userDataUpdateViewModel, "viewModel");
        super.m26349s1(abstractC11867l4, userDataUpdateViewModel);
        Bundle extras = getIntent().getExtras();
        abstractC11867l4.mo4023Q(extras != null ? Boolean.valueOf(extras.getBoolean("EXTRA_FOR_TOOLBAR", false)) : Boolean.FALSE);
    }
}
