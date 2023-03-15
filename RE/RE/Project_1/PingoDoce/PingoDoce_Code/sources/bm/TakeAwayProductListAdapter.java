package bm;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import be.OperatorExtensions;
import be.UtilsExtensions;
import bm.TakeAwayProductListAdapter;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p223lg.InterfaceC7054a;
import p361t3.C10378b;
import p361t3.InterfaceC10379c;
import p426wg.AbstractC11877le;
import p426wg.AbstractC11916ne;
import p426wg.AbstractC11955pe;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayCategory;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import td.InterfaceC10524i0;

/* renamed from: bm.d */
/* loaded from: classes2.dex */
public final class TakeAwayProductListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC10524i0 f5742e;

    /* renamed from: f */
    private final InterfaceC6113q f5743f;

    /* renamed from: g */
    private final InterfaceC6112p f5744g;

    /* renamed from: h */
    private final C10378b f5745h;

    /* renamed from: i */
    private final Map f5746i;

    /* renamed from: j */
    private InterfaceC6097a f5747j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$a */
    /* loaded from: classes2.dex */
    public static final class C1949a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C1949a f5748w = new C1949a();

        C1949a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(InterfaceC7054a interfaceC7054a, InterfaceC7054a interfaceC7054a2) {
            Intrinsics.isThisObjectNull(interfaceC7054a, "old");
            Intrinsics.isThisObjectNull(interfaceC7054a2, "new");
            return Boolean.valueOf(((interfaceC7054a instanceof TakeAwayProduct) && (interfaceC7054a2 instanceof TakeAwayProduct)) ? ((TakeAwayProduct) interfaceC7054a).m14244i() == ((TakeAwayProduct) interfaceC7054a2).m14244i() : Intrinsics.equals(interfaceC7054a, interfaceC7054a2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$b */
    /* loaded from: classes2.dex */
    public static final class C1950b extends AbstractC1953e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1950b(AbstractC11877le abstractC11877le) {
            super(abstractC11877le);
            Intrinsics.isThisObjectNull(abstractC11877le, "binding");
        }

        /* renamed from: O */
        public void m35061O(InterfaceC7054a interfaceC7054a, InterfaceC10379c interfaceC10379c) {
            Intrinsics.isThisObjectNull(interfaceC7054a, "value");
            ((AbstractC11877le) m22151M()).mo3993S((TakeAwayCategory) interfaceC7054a);
        }

        /* renamed from: Q */
        public MaterialCardView m35060Q() {
            MaterialCardView materialCardView = ((AbstractC11877le) m22151M()).f30888x;
            Intrinsics.checkIfNull(materialCardView, "binding.categoryMaterialCardView");
            return materialCardView;
        }

        /* renamed from: R */
        public View m35059R() {
            return null;
        }

        /* renamed from: S */
        public QuantityPickerView m35058S() {
            return null;
        }

        /* renamed from: T */
        public View m35057T() {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$c */
    /* loaded from: classes2.dex */
    public static final class C1951c extends AbstractC1953e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1951c(AbstractC11916ne abstractC11916ne) {
            super(abstractC11916ne);
            Intrinsics.isThisObjectNull(abstractC11916ne, "binding");
        }

        /* renamed from: O */
        public void m35056O(InterfaceC7054a interfaceC7054a, InterfaceC10379c interfaceC10379c) {
            Intrinsics.isThisObjectNull(interfaceC7054a, "value");
            ((AbstractC11916ne) m22151M()).mo3916T((TakeAwayProduct) interfaceC7054a);
            if (interfaceC10379c != null) {
                ((AbstractC11916ne) m22151M()).mo3917S(interfaceC10379c);
            }
        }

        /* renamed from: Q */
        public MaterialCardView m35055Q() {
            MaterialCardView materialCardView = ((AbstractC11916ne) m22151M()).f31066A;
            Intrinsics.checkIfNull(materialCardView, "binding.mealMaterialCardView");
            return materialCardView;
        }

        /* renamed from: S */
        public QuantityPickerView m35053S() {
            QuantityPickerView quantityPickerView = ((AbstractC11916ne) m22151M()).f31068C;
            Intrinsics.checkIfNull(quantityPickerView, "binding.mealQuantityPickerView");
            return quantityPickerView;
        }

        /* renamed from: U */
        public ConstraintLayout m35054R() {
            ConstraintLayout constraintLayout = ((AbstractC11916ne) m22151M()).f31073y;
            Intrinsics.checkIfNull(constraintLayout, "binding.contentConstraintLayout");
            return constraintLayout;
        }

        /* renamed from: V */
        public ImageView m35052T() {
            ImageView imageView = ((AbstractC11916ne) m22151M()).f31074z;
            Intrinsics.checkIfNull(imageView, "binding.mealImage");
            return imageView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$d */
    /* loaded from: classes2.dex */
    public static final class C1952d extends AbstractC1953e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1952d(AbstractC11955pe abstractC11955pe) {
            super(abstractC11955pe);
            Intrinsics.isThisObjectNull(abstractC11955pe, "binding");
        }

        /* renamed from: O */
        public void m35049O(InterfaceC7054a interfaceC7054a, InterfaceC10379c interfaceC10379c) {
            Intrinsics.isThisObjectNull(interfaceC7054a, "value");
            ((AbstractC11955pe) m22151M()).mo3835S((TakeAwayProduct) interfaceC7054a);
        }

        /* renamed from: Q */
        public MaterialCardView m35048Q() {
            MaterialCardView materialCardView = ((AbstractC11955pe) m22151M()).f31228A;
            Intrinsics.checkIfNull(materialCardView, "binding.menuMaterialCardView");
            return materialCardView;
        }

        /* renamed from: S */
        public QuantityPickerView m35046S() {
            QuantityPickerView quantityPickerView = ((AbstractC11955pe) m22151M()).f31230C;
            Intrinsics.checkIfNull(quantityPickerView, "binding.menuQuantityPickerView");
            return quantityPickerView;
        }

        /* renamed from: T */
        public View m35045T() {
            return null;
        }

        /* renamed from: U */
        public ConstraintLayout m35047R() {
            ConstraintLayout constraintLayout = ((AbstractC11955pe) m22151M()).f31234y;
            Intrinsics.checkIfNull(constraintLayout, "binding.contentConstraintLayout");
            return constraintLayout;
        }
    }

    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1953e<ViewBinding extends ViewDataBinding> extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC1953e(ViewDataBinding viewDataBinding) {
            super(viewDataBinding);
            Intrinsics.isThisObjectNull(viewDataBinding, "binding");
        }

        /* renamed from: P */
        public static /* synthetic */ void m35042P(AbstractC1953e abstractC1953e, InterfaceC7054a interfaceC7054a, InterfaceC10379c interfaceC10379c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindItem");
            }
            if ((i & 2) != 0) {
                interfaceC10379c = null;
            }
            abstractC1953e.m35043O(interfaceC7054a, interfaceC10379c);
        }

        /* renamed from: O */
        public abstract void m35043O(InterfaceC7054a interfaceC7054a, InterfaceC10379c interfaceC10379c);

        /* renamed from: Q */
        public abstract MaterialCardView m35041Q();

        /* renamed from: R */
        public abstract View m35040R();

        /* renamed from: S */
        public abstract QuantityPickerView m35039S();

        /* renamed from: T */
        public abstract View m35038T();
    }

    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$f */
    /* loaded from: classes2.dex */
    public enum EnumC1954f {
        MEAL,
        MENU,
        CATEGORY
    }

    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C1955g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5749a;

        static {
            int[] iArr = new int[EnumC1954f.values().length];
            iArr[EnumC1954f.MEAL.ordinal()] = 1;
            iArr[EnumC1954f.MENU.ordinal()] = 2;
            iArr[EnumC1954f.CATEGORY.ordinal()] = 3;
            f5749a = iArr;
        }
    }

    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$h */
    /* loaded from: classes2.dex */
    static final class C1956h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MaterialCardView f5750a;

        /* renamed from: b */
        final /* synthetic */ View f5751b;

        /* renamed from: c */
        final /* synthetic */ int f5752c;

        /* renamed from: d */
        final /* synthetic */ int f5753d;

        /* renamed from: e */
        final /* synthetic */ float f5754e;

        /* renamed from: f */
        final /* synthetic */ float f5755f;

        C1956h(MaterialCardView materialCardView, View view, int i, int i2, float f, float f2) {
            this.f5750a = materialCardView;
            this.f5751b = view;
            this.f5752c = i;
            this.f5753d = i2;
            this.f5754e = f;
            this.f5755f = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.isThisObjectNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f5750a.setElevation(floatValue);
            this.f5751b.setAlpha(CommonUtils.f15361a.m24296f(floatValue, this.f5752c, this.f5753d, this.f5754e, this.f5755f));
        }
    }

    /* compiled from: TakeAwayProductListAdapter.kt */
    /* renamed from: bm.d$i */
    /* loaded from: classes2.dex */
    static final class C1957i extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ QuantityPickerView f5756w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1957i(QuantityPickerView quantityPickerView) {
            super(1);
            this.f5756w = quantityPickerView;
        }

        /* renamed from: a */
        public final void m35037a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView.m33790w(this.f5756w, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35037a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: bm.d$j */
    /* loaded from: classes2.dex */
    public static final class C1958j implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ QuantityPickerView f5757a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC7054a f5758b;

        /* renamed from: c */
        final /* synthetic */ TakeAwayProductListAdapter f5759c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1953e f5760d;

        /* renamed from: e */
        final /* synthetic */ AbstractC1953e f5761e;

        /* renamed from: f */
        final /* synthetic */ QuantityPickerView f5762f;

        public C1958j(QuantityPickerView quantityPickerView, InterfaceC7054a interfaceC7054a, TakeAwayProductListAdapter takeAwayProductListAdapter, AbstractC1953e abstractC1953e, TakeAwayProductListAdapter takeAwayProductListAdapter2, AbstractC1953e abstractC1953e2, QuantityPickerView quantityPickerView2) {
            this.f5757a = quantityPickerView;
            this.f5758b = interfaceC7054a;
            this.f5759c = takeAwayProductListAdapter;
            this.f5760d = abstractC1953e;
            this.f5761e = abstractC1953e2;
            this.f5762f = quantityPickerView2;
        }

        /* renamed from: a */
        public void m35036a(boolean z) {
            if (z) {
                TakeAwayProductListAdapter.m35074L(this.f5759c).put(Integer.valueOf(this.f5761e.m36568j()), OperatorExtensions.m35180a(2000L, TakeAwayProductListAdapter.m35072N(this.f5759c), new C1957i(this.f5762f)));
                InterfaceC6108l interfaceC6108l = (InterfaceC6108l) TakeAwayProductListAdapter.m35074L(this.f5759c).get(Integer.valueOf(this.f5761e.m36568j()));
                if (interfaceC6108l != null) {
                    interfaceC6108l.mo9587d(C13195u.f34156a);
                }
                InterfaceC6097a m35071O = this.f5759c.m35071O();
                if (m35071O != null) {
                    m35071O.mo42214q();
                    return;
                }
                return;
            }
            TakeAwayProductListAdapter.m35074L(this.f5759c).remove(Integer.valueOf(this.f5761e.m36568j()));
        }

        /* renamed from: b */
        public void m35035b(boolean z) {
            MaterialCardView m35041Q = this.f5760d.m35041Q();
            View m35040R = this.f5760d.m35040R();
            if (m35041Q == null || m35040R == null) {
                return;
            }
            int m35167e = z ? UtilsExtensions.m35167e(1) : UtilsExtensions.m35167e(10);
            int m35167e2 = z ? UtilsExtensions.m35167e(10) : UtilsExtensions.m35167e(1);
            float f = z ? 1.0f : 0.5f;
            float f2 = z ? 0.2f : 1.0f;
            ValueAnimator m24301a = CommonUtils.f15361a.m24301a(m35167e, m35167e2, 500L);
            m24301a.addUpdateListener(new C1956h(m35041Q, m35040R, m35167e, m35167e2, f, f2));
            m24301a.start();
        }

        /* renamed from: c */
        public void m35034c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            this.f5757a.setMax(((TakeAwayProduct) this.f5758b).m14237t() + i);
            InterfaceC6112p m35073M = TakeAwayProductListAdapter.m35073M(this.f5759c);
            if (m35073M != null) {
                m35073M.mo39856d(this.f5758b, Integer.valueOf(i));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayProductListAdapter(InterfaceC10524i0 interfaceC10524i0, InterfaceC6113q interfaceC6113q, InterfaceC6112p interfaceC6112p) {
        super(C1949a.f5748w);
        Intrinsics.isThisObjectNull(interfaceC10524i0, "lifecycleScope");
        this.f5742e = interfaceC10524i0;
        this.f5743f = interfaceC6113q;
        this.f5744g = interfaceC6112p;
        this.f5745h = new C10378b(UtilsExtensions.m35167e(5), UtilsExtensions.m35167e(5), UtilsExtensions.m35167e(5), UtilsExtensions.m35167e(5));
        this.f5746i = new LinkedHashMap();
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m35077I(TakeAwayProductListAdapter takeAwayProductListAdapter, AbstractC1953e abstractC1953e, View view, MotionEvent motionEvent) {
        return m35068R(takeAwayProductListAdapter, abstractC1953e, view, motionEvent);
    }

    /* renamed from: J */
    public static /* synthetic */ void m35076J(AbstractC1953e abstractC1953e, TakeAwayProductListAdapter takeAwayProductListAdapter, View view) {
        m35067S(abstractC1953e, takeAwayProductListAdapter, view);
    }

    /* renamed from: K */
    public static /* synthetic */ void m35075K(TakeAwayProductListAdapter takeAwayProductListAdapter, C1950b c1950b, View view) {
        m35066T(takeAwayProductListAdapter, c1950b, view);
    }

    /* renamed from: L */
    public static final /* synthetic */ Map m35074L(TakeAwayProductListAdapter takeAwayProductListAdapter) {
        return takeAwayProductListAdapter.f5746i;
    }

    /* renamed from: M */
    public static final /* synthetic */ InterfaceC6112p m35073M(TakeAwayProductListAdapter takeAwayProductListAdapter) {
        return takeAwayProductListAdapter.f5744g;
    }

    /* renamed from: N */
    public static final /* synthetic */ InterfaceC10524i0 m35072N(TakeAwayProductListAdapter takeAwayProductListAdapter) {
        return takeAwayProductListAdapter.f5742e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final boolean m35068R(TakeAwayProductListAdapter takeAwayProductListAdapter, AbstractC1953e abstractC1953e, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(takeAwayProductListAdapter, "this$0");
        Intrinsics.isThisObjectNull(abstractC1953e, "$holder");
        InterfaceC6108l interfaceC6108l = (InterfaceC6108l) takeAwayProductListAdapter.f5746i.get(Integer.valueOf(abstractC1953e.m36568j()));
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(C13195u.f34156a);
        }
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public static final void m35067S(AbstractC1953e abstractC1953e, TakeAwayProductListAdapter takeAwayProductListAdapter, View view) {
        Intrinsics.isThisObjectNull(abstractC1953e, "$holder");
        Intrinsics.isThisObjectNull(takeAwayProductListAdapter, "this$0");
        if (abstractC1953e.m35040R() != null) {
            View m35040R = abstractC1953e.m35040R();
            if (!Intrinsics.m20934a(m35040R != null ? Float.valueOf(m35040R.getAlpha()) : null, 1.0f)) {
                return;
            }
        }
        InterfaceC6113q interfaceC6113q = takeAwayProductListAdapter.f5743f;
        if (interfaceC6113q != null) {
            Integer valueOf = Integer.valueOf(abstractC1953e.m36568j());
            Object m22155D = takeAwayProductListAdapter.m22155D(abstractC1953e.m36568j());
            Intrinsics.ifNullDoSomething(m22155D);
            interfaceC6113q.mo4533i(valueOf, m22155D, abstractC1953e.m35038T());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m35066T(TakeAwayProductListAdapter takeAwayProductListAdapter, C1950b c1950b, View view) {
        Intrinsics.isThisObjectNull(takeAwayProductListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c1950b, "$holder");
        InterfaceC6113q interfaceC6113q = takeAwayProductListAdapter.f5743f;
        if (interfaceC6113q != null) {
            Integer valueOf = Integer.valueOf(c1950b.m36568j());
            Object m22155D = takeAwayProductListAdapter.m22155D(c1950b.m36568j());
            Intrinsics.ifNullDoSomething(m22155D);
            interfaceC6113q.mo4533i(valueOf, m22155D, c1950b.m35057T());
        }
    }

    /* renamed from: O */
    public final InterfaceC6097a m35071O() {
        return this.f5747j;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: P */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        InterfaceC7054a interfaceC7054a = (InterfaceC7054a) m22155D(bindableViewHolder.m36568j());
        if (interfaceC7054a != null) {
            if (interfaceC7054a instanceof TakeAwayProduct) {
                final AbstractC1953e abstractC1953e = (AbstractC1953e) bindableViewHolder;
                abstractC1953e.m35043O(interfaceC7054a, this.f5745h);
                QuantityPickerView m35039S = abstractC1953e.m35039S();
                if (m35039S != null) {
                    String m14242k = ((TakeAwayProduct) interfaceC7054a).m14242k();
                    m35039S.setTextLabelFormatter("%s " + m14242k);
                    m35039S.setActionListener(new C1958j(m35039S, interfaceC7054a, this, abstractC1953e, this, abstractC1953e, m35039S));
                    m35039S.setOnTouchListener(new View.OnTouchListener() { // from class: bm.c
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            boolean m33193R;
                            m33193R = TakeAwayProductListAdapter.m35068R(TakeAwayProductListAdapter.this, abstractC1953e, view, motionEvent);
                            return m33193R;
                        }
                    });
                    MaterialCardView m35041Q = abstractC1953e.m35041Q();
                    if (m35041Q != null) {
                        m35041Q.setOnClickListener(new View.OnClickListener() { // from class: bm.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                TakeAwayProductListAdapter.m35067S(TakeAwayProductListAdapter.AbstractC1953e.this, this, view);
                            }
                        });
                    }
                }
            } else if (interfaceC7054a instanceof TakeAwayCategory) {
                final C1950b c1950b = (C1950b) bindableViewHolder;
                AbstractC1953e.m35042P(c1950b, interfaceC7054a, null, 2, null);
                c1950b.m35060Q().setOnClickListener(new View.OnClickListener() { // from class: bm.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TakeAwayProductListAdapter.m35066T(TakeAwayProductListAdapter.this, c1950b, view);
                    }
                });
            }
        }
    }

    /* renamed from: Q */
    public void mo36535t(BindableViewHolder bindableViewHolder, int i, List list) {
        QuantityPickerView m35039S;
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Intrinsics.isThisObjectNull(list, "payloads");
        if (list.isEmpty()) {
            super.mo36535t(bindableViewHolder, i, list);
            return;
        }
        InterfaceC7054a interfaceC7054a = (InterfaceC7054a) m22155D(i);
        if (interfaceC7054a == null || !(interfaceC7054a instanceof TakeAwayProduct) || (m35039S = ((AbstractC1953e) bindableViewHolder).m35039S()) == null) {
            return;
        }
        TakeAwayProduct takeAwayProduct = (TakeAwayProduct) interfaceC7054a;
        m35039S.setValue(takeAwayProduct.m14235w());
        m35039S.setMax(takeAwayProduct.m14237t());
    }

    /* renamed from: U */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        EnumC1954f enumC1954f;
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (m22155D(i) instanceof TakeAwayCategory) {
            enumC1954f = EnumC1954f.CATEGORY;
        } else {
            Object m22155D = m22155D(i);
            Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct");
            enumC1954f = ((TakeAwayProduct) m22155D).m14262E() ? EnumC1954f.MEAL : EnumC1954f.MENU;
        }
        int i2 = C1955g.f5749a[enumC1954f.ordinal()];
        if (i2 == 1) {
            AbstractC11916ne m3971Q = AbstractC11916ne.m3971Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3971Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C1951c(m3971Q);
        } else if (i2 == 2) {
            AbstractC11955pe m3896Q = AbstractC11955pe.m3896Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3896Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C1952d(m3896Q);
        } else if (i2 == 3) {
            AbstractC11877le m4043Q = AbstractC11877le.m4043Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4043Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C1950b(m4043Q);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return i;
    }
}
