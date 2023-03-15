package pt.pingodoce.app.presentation.account.loggedAccount.settings.pin;

import androidx.lifecycle.AbstractC1423a;
import ci.C2137b;
import id.InterfaceC6097a;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014aj.PinActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p406vh.ReplacePinViewModel;
import p468yc.C13182l;
import p489zc.CollectionsJVM;
import pe.C8617d;

/* compiled from: ReplacePinActivity.kt */
/* loaded from: classes2.dex */
public final class ReplacePinActivity extends PinActivity {

    /* renamed from: j0 */
    public ViewModelFactoryByInjection f23619j0;

    /* compiled from: ReplacePinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinActivity$a */
    /* loaded from: classes2.dex */
    public static final class C8934a {
        private C8934a() {
        }

        public /* synthetic */ C8934a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ReplacePinActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinActivity$b */
    /* loaded from: classes2.dex */
    static final class C8935b extends AbstractC6438m implements InterfaceC6097a {
        C8935b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13085K1 = ReplacePinActivity.this.m13085K1();
            ReplacePinActivity replacePinActivity = ReplacePinActivity.this;
            return m13085K1.m20377b(replacePinActivity, replacePinActivity.getIntent().getExtras());
        }
    }

    static {
        new C8934a(null);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13088J0() {
        return C6450z.m20906b(ReplacePinViewModel.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13086K0() {
        return new C8935b();
    }

    /* renamed from: K1 */
    public final ViewModelFactoryByInjection m13085K1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23619j0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k1 */
    protected List m13084k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2137b.f6172a);
        return m202b;
    }

    /* renamed from: m1 */
    public void m13083m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }
}
