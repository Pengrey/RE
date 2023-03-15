package pl;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import ci.C2147i;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import je.RecyclerViewItemTouchHelper;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import ne.EventObserver;
import p050d.C4519c;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p241mi.C7485d;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC11760f6;
import p426wg.AbstractC12031te;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import pl.TakeAwayCheckoutViewModel;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;
import pt.pingodoce.app.presentation.takeaway.orders.checkout.EnumC9515a;
import sl.TakeAwayCheckoutAdapter;
import sl.TakeAwayCheckoutSuccessActivity;
import td.InterfaceC10524i0;
import tl.TakeAwayEditEmailActivity;

/* renamed from: pl.i */
/* loaded from: classes2.dex */
public abstract class TakeAwayCheckoutActivity<ViewBinding extends ViewDataBinding, ViewModel extends TakeAwayCheckoutViewModel> extends FlowActivity {

    /* renamed from: g0 */
    private boolean f22319g0;

    /* renamed from: h0 */
    private boolean f22320h0;

    /* renamed from: i0 */
    private boolean f22321i0;

    /* renamed from: j0 */
    private final AbstractC0304b f22322j0;

    /* compiled from: TakeAwayCheckoutActivity.kt */
    /* renamed from: pl.i$a */
    /* loaded from: classes2.dex */
    public static final class C8656a {
        private C8656a() {
        }

        public /* synthetic */ C8656a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TakeAwayCheckoutActivity.kt */
    /* renamed from: pl.i$b */
    /* loaded from: classes2.dex */
    public static final class C8657b extends BottomSheetBehavior.AbstractC3499f {

        /* renamed from: b */
        final /* synthetic */ TakeAwayCheckoutViewModel f22324b;

        C8657b(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel) {
            this.f22324b = takeAwayCheckoutViewModel;
        }

        /* renamed from: b */
        public void mo30311b(View view, float f) {
            Intrinsics.isThisObjectNull(view, "bottomSheet");
            ConstraintLayout constraintLayout = TakeAwayCheckoutActivity.this.m14897G1().f30310y;
            TakeAwayCheckoutActivity takeAwayCheckoutActivity = TakeAwayCheckoutActivity.this;
            constraintLayout.setAlpha(1 - f);
            Intrinsics.checkIfNull(constraintLayout, BuildConfig.VERSION_NAME);
            constraintLayout.setVisibility((constraintLayout.getAlpha() > 0.0f ? 1 : (constraintLayout.getAlpha() == 0.0f ? 0 : -1)) > 0 ? 0 : 8);
            TakeAwayCheckoutActivity.m14901C1(takeAwayCheckoutActivity, !(constraintLayout.getVisibility() == 0));
        }

        /* renamed from: c */
        public void mo30310c(View view, int i) {
            Intrinsics.isThisObjectNull(view, "bottomSheet");
            if (i == 4 && TakeAwayCheckoutActivity.m14903A1(TakeAwayCheckoutActivity.this)) {
                Object mo172f = this.f22324b.m14858B0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f);
                if (((List) mo172f).isEmpty()) {
                    TakeAwayCheckoutActivity.m14900D1(TakeAwayCheckoutActivity.this, false, true);
                }
            }
            TakeAwayCheckoutActivity.m14902B1(TakeAwayCheckoutActivity.this, i == 3);
            TakeAwayCheckoutActivity takeAwayCheckoutActivity = TakeAwayCheckoutActivity.this;
            String str = (String) this.f22324b.m14857C0().mo172f();
            TakeAwayCheckoutActivity.m14898F1(takeAwayCheckoutActivity, str != null ? Integer.parseInt(str) : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutActivity.kt */
    /* renamed from: pl.i$c */
    /* loaded from: classes2.dex */
    public static final class C8658c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ TakeAwayCheckoutViewModel f22325w;

        /* renamed from: x */
        final /* synthetic */ TakeAwayCheckoutActivity f22326x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8658c(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel, TakeAwayCheckoutActivity takeAwayCheckoutActivity) {
            super(3);
            this.f22325w = takeAwayCheckoutViewModel;
            this.f22326x = takeAwayCheckoutActivity;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m14864a((RecyclerView.AbstractC1531c0) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m14864a(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2) {
            Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
            TakeAwayCheckoutViewModel.m14841y0(this.f22325w, abstractC1531c0.m36568j(), false, 2, null);
            this.f22326x.m14885R1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.checkout.TakeAwayCheckoutActivity$initViews$2$1", m20196f = "TakeAwayCheckoutActivity.kt", m20195l = {144}, m20194m = "invokeSuspend")
    /* renamed from: pl.i$d */
    /* loaded from: classes2.dex */
    public static final class C8659d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ TakeAwayCheckoutActivity f22327A;

        /* renamed from: x */
        int f22328x;

        /* renamed from: y */
        final /* synthetic */ TakeAwayCheckoutAdapter f22329y;

        /* renamed from: z */
        final /* synthetic */ List f22330z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8659d(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, List list, TakeAwayCheckoutActivity takeAwayCheckoutActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f22329y = takeAwayCheckoutAdapter;
            this.f22330z = list;
            this.f22327A = takeAwayCheckoutActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8659d(this.f22329y, this.f22330z, this.f22327A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8659d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f22328x;
            if (i == 0) {
                C13186n.m1453b(obj);
                TakeAwayCheckoutAdapter takeAwayCheckoutAdapter = this.f22329y;
                List list = this.f22330z;
                Intrinsics.checkIfNull(list, "it");
                this.f22328x = 1;
                if (takeAwayCheckoutAdapter.m22148H(list, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f22327A.m14897G1().f30307C.m36643l1(0);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.checkout.TakeAwayCheckoutActivity$initViews$3$1", m20196f = "TakeAwayCheckoutActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pl.i$e */
    /* loaded from: classes2.dex */
    public static final class C8660e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f22331x;

        /* renamed from: y */
        final /* synthetic */ TakeAwayCheckoutAdapter f22332y;

        /* renamed from: z */
        final /* synthetic */ TakeAwayCheckout f22333z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8660e(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, TakeAwayCheckout takeAwayCheckout, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f22332y = takeAwayCheckoutAdapter;
            this.f22333z = takeAwayCheckout;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8660e(this.f22332y, this.f22333z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8660e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f22331x == 0) {
                C13186n.m1453b(obj);
                TakeAwayCheckoutAdapter takeAwayCheckoutAdapter = this.f22332y;
                TakeAwayCheckout takeAwayCheckout = this.f22333z;
                Intrinsics.checkIfNull(takeAwayCheckout, "it");
                takeAwayCheckoutAdapter.m8413Z(takeAwayCheckout);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutActivity.kt */
    /* renamed from: pl.i$f */
    /* loaded from: classes2.dex */
    public static final class C8661f extends AbstractC6438m implements InterfaceC6108l {
        C8661f() {
            super(1);
        }

        /* renamed from: a */
        public final void m14861a(int i) {
            TakeAwayCheckoutActivity.this.m14886Q1();
            TakeAwayCheckoutActivity.m14899E1(TakeAwayCheckoutActivity.this);
            if (!TakeAwayCheckoutActivity.m14903A1(TakeAwayCheckoutActivity.this)) {
                TakeAwayCheckoutActivity.m14882U1(TakeAwayCheckoutActivity.this, true, false, 2, null);
            } else if (i == 0) {
                TakeAwayCheckoutActivity.m14882U1(TakeAwayCheckoutActivity.this, false, false, 2, null);
            }
            TakeAwayCheckoutActivity.m14898F1(TakeAwayCheckoutActivity.this, i);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m14861a(((Number) obj).intValue());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutActivity.kt */
    /* renamed from: pl.i$g */
    /* loaded from: classes2.dex */
    public static final class C8662g extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ TakeAwayCheckoutViewModel f22335w;

        /* renamed from: x */
        final /* synthetic */ TakeAwayCheckoutActivity f22336x;

        /* compiled from: TakeAwayCheckoutActivity.kt */
        /* renamed from: pl.i$g$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8663a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f22337a;

            static {
                int[] iArr = new int[EnumC9515a.values().length];
                iArr[EnumC9515a.QUANTITY_UPDATE.ordinal()] = 1;
                iArr[EnumC9515a.EDIT_EMAIL.ordinal()] = 2;
                f22337a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8662g(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel, TakeAwayCheckoutActivity takeAwayCheckoutActivity) {
            super(3);
            this.f22335w = takeAwayCheckoutViewModel;
            this.f22336x = takeAwayCheckoutActivity;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m14860a((EnumC9515a) obj, (TakeAwayProduct) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m14860a(EnumC9515a enumC9515a, TakeAwayProduct takeAwayProduct, int i) {
            Intrinsics.isThisObjectNull(enumC9515a, "action");
            Intrinsics.isThisObjectNull(takeAwayProduct, "product");
            int i2 = C8663a.f22337a[enumC9515a.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                TakeAwayEditEmailActivity.m7432a(TakeAwayCheckoutActivity.m14867z1(this.f22336x), this.f22336x, ((TakeAwayFlowData) this.f22335w.m34578S()).m14690a().m10863h());
                return;
            }
            this.f22335w.m14849K0(takeAwayProduct);
            this.f22336x.m14885R1();
            TakeAwayCheckoutActivity takeAwayCheckoutActivity = this.f22336x;
            String str = (String) this.f22335w.m14857C0().mo172f();
            TakeAwayCheckoutActivity.m14898F1(takeAwayCheckoutActivity, str != null ? Integer.parseInt(str) : 0);
        }
    }

    static {
        new C8656a(null);
    }

    public TakeAwayCheckoutActivity() {
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: pl.d
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                TakeAwayCheckoutActivity.m14884S1(TakeAwayCheckoutActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…ge = true\n        }\n    }");
        this.f22322j0 = m41364M;
    }

    /* renamed from: A1 */
    public static final /* synthetic */ boolean m14903A1(TakeAwayCheckoutActivity takeAwayCheckoutActivity) {
        return takeAwayCheckoutActivity.m14887P1();
    }

    /* renamed from: B1 */
    public static final /* synthetic */ void m14902B1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, boolean z) {
        takeAwayCheckoutActivity.f22320h0 = z;
    }

    /* renamed from: C1 */
    public static final /* synthetic */ void m14901C1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, boolean z) {
        takeAwayCheckoutActivity.f22319g0 = z;
    }

    /* renamed from: D1 */
    public static final /* synthetic */ void m14900D1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, boolean z, boolean z2) {
        takeAwayCheckoutActivity.m14883T1(z, z2);
    }

    /* renamed from: E1 */
    public static final /* synthetic */ void m14899E1(TakeAwayCheckoutActivity takeAwayCheckoutActivity) {
        takeAwayCheckoutActivity.m14880W1();
    }

    /* renamed from: F1 */
    public static final /* synthetic */ void m14898F1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, int i) {
        takeAwayCheckoutActivity.m14879X1(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m14894J1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, List list) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        Intrinsics.isThisObjectNull(takeAwayCheckoutAdapter, "$takeAwayAdapter");
        C6772d.m20158d(LifecycleOwner.m36965a(takeAwayCheckoutActivity), null, null, new C8659d(takeAwayCheckoutAdapter, list, takeAwayCheckoutActivity, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m14893K1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, TakeAwayCheckout takeAwayCheckout) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        Intrinsics.isThisObjectNull(takeAwayCheckoutAdapter, "$takeAwayAdapter");
        C6772d.m20158d(LifecycleOwner.m36965a(takeAwayCheckoutActivity), null, null, new C8660e(takeAwayCheckoutAdapter, takeAwayCheckout, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m14892L1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, TakeAwayCheckout takeAwayCheckout) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        Intrinsics.isThisObjectNull(takeAwayCheckoutAdapter, "$takeAwayAdapter");
        Intrinsics.checkIfNull(takeAwayCheckout, "it");
        AbstractC12031te m8422Q = takeAwayCheckoutAdapter.m8422Q();
        MaterialButton materialButton = takeAwayCheckoutActivity.m14897G1().f30306B;
        Intrinsics.checkIfNull(materialButton, "getCheckoutBottomSheetBinding().okMaterialButton");
        TakeAwayCheckoutSuccessActivity.m8398a(takeAwayCheckoutActivity, takeAwayCheckout, m8422Q, materialButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m14891M1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        if (takeAwayCheckoutActivity.f22319g0) {
            ConstraintLayout constraintLayout = takeAwayCheckoutActivity.m14897G1().f30310y;
            Intrinsics.checkIfNull(constraintLayout, "getCheckoutBottomSheetBi…psedPanelConstraintLayout");
            Intrinsics.checkIfNull(bool, "it");
            constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N1 */
    public static final void m14890N1(AbstractC11760f6 abstractC11760f6, View view) {
        Intrinsics.isThisObjectNull(abstractC11760f6, "$this_with");
        BottomSheetBehavior.m30367f0(abstractC11760f6.m37802s()).m30402I0(3);
        abstractC11760f6.f30307C.m36643l1(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m14889O1(AbstractC11760f6 abstractC11760f6, View view) {
        Intrinsics.isThisObjectNull(abstractC11760f6, "$this_with");
        BottomSheetBehavior.m30367f0(abstractC11760f6.m37802s()).m30402I0(4);
        abstractC11760f6.f30307C.m36643l1(0);
    }

    /* renamed from: P1 */
    private final boolean m14887P1() {
        return BottomSheetBehavior.m30367f0(m14897G1().m37802s()).m30362j0() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m14884S1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, ActivityResult activityResult) {
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_EMAIL")) == null) {
            return;
        }
        ((TakeAwayCheckoutViewModel) takeAwayCheckoutActivity.m22758I0()).m14851I0(string);
        takeAwayCheckoutActivity.f22321i0 = true;
    }

    /* renamed from: T1 */
    private final void m14883T1(boolean z, boolean z2) {
        ResourcesProvider m6898a = C10841b.m6898a(this);
        TypedValue typedValue = new TypedValue();
        m6898a.m6899a().getTheme().resolveAttribute(16843499, typedValue, true);
        float dimension = m6898a.m6899a().getResources().getDimension(typedValue.resourceId);
        CommonUtils commonUtils = CommonUtils.f15361a;
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator m24300b = commonUtils.m24300b(f, dimension, z2 ? 250L : 0L, new DecelerateInterpolator());
        m24300b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pl.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                TakeAwayCheckoutActivity.m14881V1(TakeAwayCheckoutActivity.this, valueAnimator);
            }
        });
        m24300b.start();
    }

    /* renamed from: U1 */
    static /* synthetic */ void m14882U1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleBottomSheet");
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        takeAwayCheckoutActivity.m14883T1(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m14881V1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutActivity, "this$0");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        BottomSheetBehavior m30367f0 = BottomSheetBehavior.m30367f0(takeAwayCheckoutActivity.m14897G1().m37802s());
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        m30367f0.m30410E0((int) ((Float) animatedValue).floatValue());
    }

    /* renamed from: W1 */
    private final void m14880W1() {
        ((TakeAwayCheckoutViewModel) m22758I0()).m14852H0();
    }

    /* renamed from: X1 */
    private final void m14879X1(int i) {
        String string;
        Toolbar toolbar = m14897G1().f30309x;
        if (this.f22320h0) {
            C6429c0 c6429c0 = C6429c0.f17515a;
            String string2 = getString(C2336R.string.lbl_take_away_checkout_alt);
            Intrinsics.checkIfNull(string2, "getString(R.string.lbl_take_away_checkout_alt)");
            string = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkIfNull(string, "format(format, *args)");
        } else {
            string = getString(C2336R.string.lbl_take_away_checkout);
        }
        toolbar.setTitle(string);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m14875r1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, TakeAwayCheckout takeAwayCheckout) {
        m14893K1(takeAwayCheckoutActivity, takeAwayCheckoutAdapter, takeAwayCheckout);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m14874s1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, TakeAwayCheckout takeAwayCheckout) {
        m14892L1(takeAwayCheckoutActivity, takeAwayCheckoutAdapter, takeAwayCheckout);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m14873t1(AbstractC11760f6 abstractC11760f6, View view) {
        m14890N1(abstractC11760f6, view);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m14872u1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, ActivityResult activityResult) {
        m14884S1(takeAwayCheckoutActivity, activityResult);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m14871v1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, ValueAnimator valueAnimator) {
        m14881V1(takeAwayCheckoutActivity, valueAnimator);
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m14870w1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, List list) {
        m14894J1(takeAwayCheckoutActivity, takeAwayCheckoutAdapter, list);
    }

    /* renamed from: x1 */
    public static /* synthetic */ void m14869x1(AbstractC11760f6 abstractC11760f6, View view) {
        m14889O1(abstractC11760f6, view);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m14868y1(TakeAwayCheckoutActivity takeAwayCheckoutActivity, Boolean bool) {
        m14891M1(takeAwayCheckoutActivity, bool);
    }

    /* renamed from: z1 */
    public static final /* synthetic */ AbstractC0304b m14867z1(TakeAwayCheckoutActivity takeAwayCheckoutActivity) {
        return takeAwayCheckoutActivity.f22322j0;
    }

    /* renamed from: G1 */
    public abstract AbstractC11760f6 m14897G1();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H1 */
    public final boolean m14896H1() {
        return this.f22319g0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I1 */
    public void m14876n1(ViewDataBinding viewDataBinding, TakeAwayCheckoutViewModel takeAwayCheckoutViewModel) {
        Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        Intrinsics.isThisObjectNull(takeAwayCheckoutViewModel, "viewModel");
        super.m34589n1(viewDataBinding, takeAwayCheckoutViewModel);
        final TakeAwayCheckoutAdapter takeAwayCheckoutAdapter = new TakeAwayCheckoutAdapter(LifecycleOwner.m36965a(this), new C8662g(takeAwayCheckoutViewModel, this));
        final AbstractC11760f6 m14897G1 = m14897G1();
        ViewGroup.LayoutParams layoutParams = m14897G1.m37802s().getLayoutParams();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = getDisplay();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
        } else {
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        layoutParams.height = displayMetrics.heightPixels;
        BottomSheetBehavior m30367f0 = BottomSheetBehavior.m30367f0(m14897G1.m37802s());
        m30367f0.m30410E0(0);
        m30367f0.m30376W(new C8657b(takeAwayCheckoutViewModel));
        m14897G1.f30310y.setOnClickListener(new View.OnClickListener() { // from class: pl.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayCheckoutActivity.m14890N1(AbstractC11760f6.this, view);
            }
        });
        Toolbar toolbar = m14897G1.f30309x;
        toolbar.setContentInsetStartWithNavigation(0);
        toolbar.setNavigationIcon(C2336R.C2337drawable.ic_close);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: pl.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayCheckoutActivity.m14889O1(AbstractC11760f6.this, view);
            }
        });
        RecyclerView recyclerView = m14897G1.f30307C;
        new C1618k(new RecyclerViewItemTouchHelper(0, 0, new C8658c(takeAwayCheckoutViewModel, this), null, 11, null)).m35981m(recyclerView);
        recyclerView.setAdapter(takeAwayCheckoutAdapter);
        ViewGroup.LayoutParams layoutParams2 = m14897G1.f30306B.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, 0, UtilsExtensions.m35167e(80));
        takeAwayCheckoutViewModel.m14858B0().mo171i(this, new InterfaceC1440f0() { // from class: pl.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayCheckoutActivity.m14894J1(TakeAwayCheckoutActivity.this, takeAwayCheckoutAdapter, (List) obj);
            }
        });
        takeAwayCheckoutViewModel.m14854F0().mo171i(this, new InterfaceC1440f0() { // from class: pl.g
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayCheckoutActivity.m14893K1(TakeAwayCheckoutActivity.this, takeAwayCheckoutAdapter, (TakeAwayCheckout) obj);
            }
        });
        takeAwayCheckoutViewModel.m14856D0().mo171i(this, new InterfaceC1440f0() { // from class: pl.h
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayCheckoutActivity.m14892L1(TakeAwayCheckoutActivity.this, takeAwayCheckoutAdapter, (TakeAwayCheckout) obj);
            }
        });
        takeAwayCheckoutViewModel.m20387j().mo171i(this, new InterfaceC1440f0() { // from class: pl.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                TakeAwayCheckoutActivity.m14891M1(TakeAwayCheckoutActivity.this, (Boolean) obj);
            }
        });
        C7485d.f19794a.m18383a().mo171i(this, new EventObserver(new C8661f()));
    }

    /* renamed from: Q1 */
    protected void m14886Q1() {
    }

    /* renamed from: R1 */
    protected void m14885R1() {
    }

    /* renamed from: k1 */
    protected List m14878k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2147i.f6182a);
        return m202b;
    }

    /* renamed from: n */
    public boolean m14877n() {
        return true;
    }

    public void onBackPressed() {
        if (this.f22319g0) {
            return;
        }
        if (this.f22321i0) {
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FOR_EMAIL", ((TakeAwayFlowData) ((TakeAwayCheckoutViewModel) m22758I0()).m34578S()).m14690a().m10863h());
            C13195u c13195u = C13195u.f34156a;
            setResult(-1, intent);
        }
        super.onBackPressed();
    }

    protected void onDestroy() {
        C7485d.f19794a.m18383a().mo167o(this);
        super.onDestroy();
    }

    protected void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        this.f22319g0 = bundle.getBoolean("STATE_FOR_VISIBILITY", false);
        this.f22321i0 = bundle.getBoolean("STATE_FOR_CHANGED_DATA", false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onResume() {
        if (!this.f22319g0) {
            Object mo172f = ((TakeAwayCheckoutViewModel) m22758I0()).m14858B0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            if (((List) mo172f).size() > 0) {
                m14883T1(true, false);
                super.onResume();
            }
        }
        if (m14887P1()) {
            Object mo172f2 = ((TakeAwayCheckoutViewModel) m22758I0()).m14858B0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f2);
            if (((List) mo172f2).size() == 0) {
                m14883T1(false, true);
            }
        }
        super.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "outState");
        bundle.putBoolean("STATE_FOR_VISIBILITY", this.f22319g0);
        bundle.putBoolean("STATE_FOR_CHANGED_DATA", this.f22321i0);
        super.onSaveInstanceState(bundle);
    }
}
