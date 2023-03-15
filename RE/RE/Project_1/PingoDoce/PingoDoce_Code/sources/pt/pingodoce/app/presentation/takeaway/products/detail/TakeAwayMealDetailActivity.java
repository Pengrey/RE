package pt.pingodoce.app.presentation.takeaway.products.detail;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import be.OperatorExtensions;
import cm.TakeAwayProductDetailViewModel;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Objects;
import ke.ViewModelFactoryByInjection;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11689b4;
import p426wg.AbstractC11760f6;
import p468yc.C13182l;
import p468yc.C13195u;
import pe.C8617d;
import pl.TakeAwayCheckoutActivity;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity;

/* compiled from: TakeAwayMealDetailActivity.kt */
/* loaded from: classes2.dex */
public final class TakeAwayMealDetailActivity extends TakeAwayCheckoutActivity {

    /* renamed from: k0 */
    public ViewModelFactoryByInjection f25056k0;

    /* renamed from: l0 */
    private InterfaceC6108l f25057l0 = OperatorExtensions.m35180a(2000, LifecycleOwner.m36965a(this), new C9530a());

    /* compiled from: TakeAwayMealDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity$a */
    /* loaded from: classes2.dex */
    static final class C9530a extends AbstractC6438m implements InterfaceC6108l {
        C9530a() {
            super(1);
        }

        /* renamed from: a */
        public final void m10728a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView quantityPickerView = TakeAwayMealDetailActivity.m10739Z1(TakeAwayMealDetailActivity.this).f29917E;
            Intrinsics.checkIfNull(quantityPickerView, "binding.productQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10728a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: TakeAwayMealDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity$b */
    /* loaded from: classes2.dex */
    static final class C9531b extends AbstractC6438m implements InterfaceC6097a {
        C9531b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m10736c2 = TakeAwayMealDetailActivity.this.m10736c2();
            TakeAwayMealDetailActivity takeAwayMealDetailActivity = TakeAwayMealDetailActivity.this;
            return m10736c2.m20377b(takeAwayMealDetailActivity, takeAwayMealDetailActivity.getIntent().getExtras());
        }
    }

    /* compiled from: TakeAwayMealDetailActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity$c */
    /* loaded from: classes2.dex */
    static final class C9532c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC11689b4 f25060a;

        C9532c(AbstractC11689b4 abstractC11689b4) {
            this.f25060a = abstractC11689b4;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.isThisObjectNull(valueAnimator, "animation");
            TextView textView = this.f25060a.f29916D;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            textView.setAlpha(((Float) animatedValue).floatValue());
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: pt.pingodoce.app.presentation.takeaway.products.detail.TakeAwayMealDetailActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9533d implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ TakeAwayProductDetailViewModel f25061a;

        /* renamed from: b */
        final /* synthetic */ QuantityPickerView f25062b;

        /* renamed from: c */
        final /* synthetic */ QuantityPickerView f25063c;

        /* renamed from: d */
        final /* synthetic */ TakeAwayProductDetailViewModel f25064d;

        /* renamed from: e */
        final /* synthetic */ AbstractC11689b4 f25065e;

        /* renamed from: f */
        final /* synthetic */ TakeAwayMealDetailActivity f25066f;

        public C9533d(TakeAwayProductDetailViewModel takeAwayProductDetailViewModel, QuantityPickerView quantityPickerView, QuantityPickerView quantityPickerView2, TakeAwayProductDetailViewModel takeAwayProductDetailViewModel2, AbstractC11689b4 abstractC11689b4, TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
            this.f25061a = takeAwayProductDetailViewModel;
            this.f25062b = quantityPickerView;
            this.f25063c = quantityPickerView2;
            this.f25064d = takeAwayProductDetailViewModel2;
            this.f25065e = abstractC11689b4;
            this.f25066f = takeAwayMealDetailActivity;
        }

        /* renamed from: a */
        public void m10726a(boolean z) {
            if (z) {
                TakeAwayMealDetailActivity.m10738a2(this.f25066f).mo9587d(C13195u.f34156a);
            }
        }

        /* renamed from: b */
        public void m10725b(boolean z) {
            QuantityPickerView quantityPickerView = this.f25063c;
            Object mo172f = this.f25064d.m14855E0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            quantityPickerView.setMax(((Number) mo172f).intValue());
            ValueAnimator m24301a = CommonUtils.f15361a.m24301a(z ? 1.0f : 0.5f, z ? 0.2f : 1.0f, 500L);
            m24301a.addUpdateListener(new C9532c(this.f25065e));
            m24301a.start();
        }

        /* renamed from: c */
        public void m10724c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) this.f25061a.m34494R0().mo172f();
            if (takeAwayProduct != null) {
                TakeAwayProductDetailViewModel takeAwayProductDetailViewModel = this.f25061a;
                Intrinsics.checkIfNull(takeAwayProduct, "it");
                if (takeAwayProductDetailViewModel.m41577M0(takeAwayProduct, i, true)) {
                    this.f25061a.m41578L0(takeAwayProduct, i);
                } else {
                    this.f25062b.setValue(i - 1);
                }
            }
        }
    }

    /* renamed from: Y1 */
    public static /* synthetic */ boolean m10740Y1(TakeAwayMealDetailActivity takeAwayMealDetailActivity, View view, MotionEvent motionEvent) {
        return m10734e2(takeAwayMealDetailActivity, view, motionEvent);
    }

    /* renamed from: Z1 */
    public static final /* synthetic */ AbstractC11689b4 m10739Z1(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
        return (AbstractC11689b4) takeAwayMealDetailActivity.m22738w0();
    }

    /* renamed from: a2 */
    public static final /* synthetic */ InterfaceC6108l m10738a2(TakeAwayMealDetailActivity takeAwayMealDetailActivity) {
        return takeAwayMealDetailActivity.f25057l0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e2 */
    public static final boolean m10734e2(TakeAwayMealDetailActivity takeAwayMealDetailActivity, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(takeAwayMealDetailActivity, "this$0");
        takeAwayMealDetailActivity.f25057l0.mo9587d(C13195u.f34156a);
        return view.onTouchEvent(motionEvent);
    }

    /* renamed from: G1 */
    public AbstractC11760f6 m10746G1() {
        AbstractC11760f6 abstractC11760f6 = ((AbstractC11689b4) m22738w0()).f29919x;
        Intrinsics.checkIfNull(abstractC11760f6, "binding.bottomsheetIncluded");
        return abstractC11760f6;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m10744J0() {
        return C6450z.m20906b(TakeAwayProductDetailViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m10743K0() {
        return new C9531b();
    }

    /* renamed from: R1 */
    protected void m10741R1() {
        ((TakeAwayProductDetailViewModel) m22758I0()).m34493S0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b2 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: c2 */
    public final ViewModelFactoryByInjection m10736c2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f25056k0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d2 */
    public void m10731n1(AbstractC11689b4 abstractC11689b4, TakeAwayProductDetailViewModel takeAwayProductDetailViewModel) {
        Intrinsics.isThisObjectNull(abstractC11689b4, "binding");
        Intrinsics.isThisObjectNull(takeAwayProductDetailViewModel, "viewModel");
        super.m14895I1(abstractC11689b4, takeAwayProductDetailViewModel);
        QuantityPickerView quantityPickerView = abstractC11689b4.f29917E;
        quantityPickerView.setOnTouchListener(new View.OnTouchListener() { // from class: cm.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m10038e2;
                m10038e2 = TakeAwayMealDetailActivity.m10734e2(TakeAwayMealDetailActivity.this, view, motionEvent);
                return m10038e2;
            }
        });
        Intrinsics.checkIfNull(quantityPickerView, BuildConfig.VERSION_NAME);
        quantityPickerView.setActionListener(new C9533d(takeAwayProductDetailViewModel, quantityPickerView, quantityPickerView, takeAwayProductDetailViewModel, abstractC11689b4, this));
        C1112b0.m38465J0(abstractC11689b4.f29915C, "TRANSITION_IMAGE");
    }

    /* renamed from: m1 */
    public void m10733m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m10732n() {
        return true;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_take_away_meal_detail;
    }
}
