package pt.pingodoce.app.presentation.takeaway.products.detail;

import androidx.lifecycle.AbstractC1423a;
import cm.TakeAwayProductDetailViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import id.InterfaceC6097a;
import ke.ViewModelFactoryByInjection;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11724d4;
import p426wg.AbstractC11760f6;
import p468yc.C13182l;
import pe.C8617d;
import pl.TakeAwayCheckoutActivity;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;

/* compiled from: TakeAwayMenuDetailActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayMenuDetailActivity extends TakeAwayCheckoutActivity {

    /* renamed from: k0 */
    public ViewModelFactoryByInjection f25067k0;

    /* compiled from: TakeAwayMenuDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMenuDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9534a extends AbstractC6438m implements InterfaceC6097a {
        C9534a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10716Z1 = TakeAwayMenuDetailActivity.this.m10716Z1();
            TakeAwayMenuDetailActivity takeAwayMenuDetailActivity = TakeAwayMenuDetailActivity.this;
            return m10716Z1.m20377b(takeAwayMenuDetailActivity, takeAwayMenuDetailActivity.getIntent().getExtras());
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMenuDetailActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9535b implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ TakeAwayProductDetailViewModel f25069a;

        /* renamed from: b */
        final /* synthetic */ QuantityPickerView f25070b;

        public C9535b(TakeAwayProductDetailViewModel takeAwayProductDetailViewModel, QuantityPickerView quantityPickerView) {
            this.f25069a = takeAwayProductDetailViewModel;
            this.f25070b = quantityPickerView;
        }

        /* renamed from: a */
        public void m10708a(boolean z) {
        }

        /* renamed from: b */
        public void m10707b(boolean z) {
        }

        /* renamed from: c */
        public void m10706c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            Object mo172f = this.f25069a.m34494R0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) mo172f;
            TakeAwayProductDetailViewModel takeAwayProductDetailViewModel = this.f25069a;
            Intrinsics.checkIfNull(takeAwayProduct, "it");
            if (takeAwayProductDetailViewModel.m41577M0(takeAwayProduct, i, true)) {
                this.f25069a.m41578L0(takeAwayProduct, i);
            } else {
                this.f25070b.setValue(i - 1);
            }
        }
    }

    /* renamed from: G1 */
    public AbstractC11760f6 m10723G1() {
        AbstractC11760f6 abstractC11760f6 = ((AbstractC11724d4) m22738w0()).f30085x;
        Intrinsics.checkIfNull(abstractC11760f6, "binding.bottomsheetIncluded");
        return abstractC11760f6;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10721J0() {
        return C6450z.m20906b(TakeAwayProductDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10720K0() {
        return new C9534a();
    }

    /* renamed from: R1 */
    protected void m10718R1() {
        ((TakeAwayProductDetailViewModel) m22758I0()).m34493S0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: Z1 */
    public final ViewModelFactoryByInjection m10716Z1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25067k0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a2 */
    public void m10712n1(AbstractC11724d4 abstractC11724d4, TakeAwayProductDetailViewModel takeAwayProductDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC11724d4, "binding");
        Intrinsics.isThisObjectNull(takeAwayProductDetailViewModel, "viewModel");
        super.m14895I1(abstractC11724d4, takeAwayProductDetailViewModel);
        QuantityPickerView quantityPickerView = abstractC11724d4.f30083D;
        Intrinsics.checkIfNull(quantityPickerView, BuildConfig.VERSION_NAME);
        quantityPickerView.setActionListener(new C9535b(takeAwayProductDetailViewModel, quantityPickerView));
    }

    /* renamed from: m1 */
    public void m10714m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m10713n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_menu_detail;
    }
}
