package sl;

import android.annotation.SuppressLint;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import be.OperatorExtensions;
import com.github.guilhe.views.QuantityPickerView;
import fm.C5579c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import je.TouchableViewHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p426wg.AbstractC12031te;
import p426wg.AbstractC12106xe;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;
import pt.pingodoce.app.presentation.takeaway.orders.checkout.EnumC9515a;
import sl.TakeAwayCheckoutAdapter;
import td.InterfaceC10524i0;

/* renamed from: sl.e */
/* loaded from: classes2.dex */
public class TakeAwayCheckoutAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC10524i0 f26686e;

    /* renamed from: f */
    private final InterfaceC6113q f26687f;

    /* renamed from: g */
    private final long f26688g;

    /* renamed from: h */
    private final AlphaAnimation f26689h;

    /* renamed from: i */
    private final AlphaAnimation f26690i;

    /* renamed from: j */
    private final Map f26691j;

    /* renamed from: k */
    private AbstractC12031te f26692k;

    /* renamed from: l */
    private TakeAwayCheckout f26693l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutAdapter.kt */
    /* renamed from: sl.e$a */
    /* loaded from: classes2.dex */
    public static final class C10244a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C10244a f26694w = new C10244a();

        C10244a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(TakeAwayProduct takeAwayProduct, TakeAwayProduct takeAwayProduct2) {
            Intrinsics.isThisObjectNull(takeAwayProduct, "old");
            Intrinsics.isThisObjectNull(takeAwayProduct2, "new");
            return Boolean.valueOf(takeAwayProduct.m14244i() == takeAwayProduct2.m14244i());
        }
    }

    /* compiled from: TakeAwayCheckoutAdapter.kt */
    /* renamed from: sl.e$b */
    /* loaded from: classes2.dex */
    public static final class C10245b {
        private C10245b() {
        }

        public /* synthetic */ C10245b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TakeAwayCheckoutAdapter.kt */
    /* renamed from: sl.e$c */
    /* loaded from: classes2.dex */
    public static final class C10246c extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10246c(AbstractC12031te abstractC12031te) {
            super(abstractC12031te);
            Intrinsics.isThisObjectNull(abstractC12031te, "binding");
        }
    }

    /* compiled from: TakeAwayCheckoutAdapter.kt */
    /* renamed from: sl.e$d */
    /* loaded from: classes2.dex */
    public static final class C10247d extends TouchableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10247d(AbstractC12106xe abstractC12106xe) {
            super(abstractC12106xe);
            Intrinsics.isThisObjectNull(abstractC12106xe, "binding");
        }

        /* renamed from: S */
        public ImageView m8406O() {
            ImageView imageView = ((AbstractC12106xe) m22151M()).f31910x;
            Intrinsics.checkIfNull(imageView, "binding.backgroundIconImageView");
            return imageView;
        }

        /* renamed from: T */
        public ConstraintLayout m8405P() {
            ConstraintLayout constraintLayout = ((AbstractC12106xe) m22151M()).f31911y;
            Intrinsics.checkIfNull(constraintLayout, "binding.foregroundConstraintLayout");
            return constraintLayout;
        }
    }

    /* compiled from: TakeAwayCheckoutAdapter.kt */
    /* renamed from: sl.e$e */
    /* loaded from: classes2.dex */
    static final class C10248e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C10247d f26695w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10248e(C10247d c10247d) {
            super(1);
            this.f26695w = c10247d;
        }

        /* renamed from: a */
        public final void m8402a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView quantityPickerView = ((AbstractC12106xe) this.f26695w.m22151M()).f31906C;
            Intrinsics.checkIfNull(quantityPickerView, "holder.binding.quantityQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8402a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: sl.e$f */
    /* loaded from: classes2.dex */
    public static final class C10249f implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: b */
        final /* synthetic */ C10247d f26697b;

        /* renamed from: c */
        final /* synthetic */ C10247d f26698c;

        /* renamed from: d */
        final /* synthetic */ C10247d f26699d;

        /* renamed from: e */
        final /* synthetic */ TakeAwayProduct f26700e;

        public C10249f(C10247d c10247d, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, C10247d c10247d2, TakeAwayCheckoutAdapter takeAwayCheckoutAdapter2, C10247d c10247d3, TakeAwayProduct takeAwayProduct) {
            this.f26697b = c10247d;
            this.f26698c = c10247d2;
            this.f26699d = c10247d3;
            this.f26700e = takeAwayProduct;
        }

        /* renamed from: a */
        public void m8401a(boolean z) {
            if (z) {
                TakeAwayCheckoutAdapter.m8425N(TakeAwayCheckoutAdapter.this).put(Integer.valueOf(this.f26699d.m36568j()), OperatorExtensions.m35180a(2000L, TakeAwayCheckoutAdapter.m8423P(TakeAwayCheckoutAdapter.this), new C10248e(this.f26699d)));
                InterfaceC6108l interfaceC6108l = (InterfaceC6108l) TakeAwayCheckoutAdapter.m8425N(TakeAwayCheckoutAdapter.this).get(Integer.valueOf(this.f26699d.m36568j()));
                if (interfaceC6108l != null) {
                    interfaceC6108l.mo9587d(C13195u.f34156a);
                    return;
                }
                return;
            }
            TakeAwayCheckoutAdapter.m8425N(TakeAwayCheckoutAdapter.this).remove(Integer.valueOf(this.f26699d.m36568j()));
            TransitionManager.beginDelayedTransition(((AbstractC12106xe) this.f26699d.m22151M()).f31911y);
            ((AbstractC12106xe) this.f26699d.m22151M()).f31906C.setVisibility(4);
            ((AbstractC12106xe) this.f26699d.m22151M()).f31907D.setVisibility(0);
            ((AbstractC12106xe) this.f26699d.m22151M()).f31905B.setVisibility(0);
            ((AbstractC12106xe) this.f26699d.m22151M()).f31908E.setVisibility(this.f26700e.m14242k().length() > 0 ? 0 : 4);
            this.f26699d.m20891R(true);
            ((AbstractC12106xe) this.f26699d.m22151M()).f31911y.setAddStatesFromChildren(true);
        }

        /* renamed from: b */
        public void m8400b(boolean z) {
            TakeAwayProduct m8424O = TakeAwayCheckoutAdapter.m8424O(TakeAwayCheckoutAdapter.this, this.f26698c.m36568j());
            Objects.requireNonNull(m8424O, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct");
            InterfaceC6113q m8426M = TakeAwayCheckoutAdapter.m8426M(TakeAwayCheckoutAdapter.this);
            EnumC9515a enumC9515a = EnumC9515a.QUANTITY_UPDATE;
            TakeAwayProduct m14249c = TakeAwayProduct.m14249c(m8424O, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null);
            m14249c.m14253N(m8424O.m14235w());
            C13195u c13195u = C13195u.f34156a;
            m8426M.mo4533i(enumC9515a, m14249c, Integer.valueOf(this.f26698c.m36568j()));
            ((AbstractC12106xe) this.f26698c.m22151M()).f31906C.setValue(m8424O.m14235w());
            ((AbstractC12106xe) this.f26698c.m22151M()).f31906C.setMax(m8424O.m14237t() + 1);
        }

        /* renamed from: c */
        public void m8399c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            TakeAwayProduct m8424O = TakeAwayCheckoutAdapter.m8424O(TakeAwayCheckoutAdapter.this, this.f26697b.m36568j());
            Objects.requireNonNull(m8424O, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct");
            InterfaceC6113q m8426M = TakeAwayCheckoutAdapter.m8426M(TakeAwayCheckoutAdapter.this);
            EnumC9515a enumC9515a = EnumC9515a.QUANTITY_UPDATE;
            TakeAwayProduct m14249c = TakeAwayProduct.m14249c(m8424O, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null);
            m14249c.m14252O(i);
            C13195u c13195u = C13195u.f34156a;
            m8426M.mo4533i(enumC9515a, m14249c, Integer.valueOf(this.f26697b.m36568j()));
            ((AbstractC12106xe) this.f26697b.m22151M()).f31906C.setMax(m8424O.m14237t());
            ((AbstractC12106xe) this.f26697b.m22151M()).f31906C.setValue(m8424O.m14235w());
        }
    }

    static {
        new C10245b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayCheckoutAdapter(InterfaceC10524i0 interfaceC10524i0, InterfaceC6113q interfaceC6113q) {
        super(C10244a.f26694w);
        Intrinsics.isThisObjectNull(interfaceC10524i0, "lifecycleScope");
        this.f26686e = interfaceC10524i0;
        this.f26687f = interfaceC6113q;
        this.f26688g = 250L;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        this.f26689h = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new DecelerateInterpolator());
        alphaAnimation2.setFillAfter(true);
        this.f26690i = alphaAnimation2;
        this.f26691j = new LinkedHashMap();
        this.f26693l = new TakeAwayCheckout(null, null, null, null, 0, null, null, null, null, null, null, false, 4095, null);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m8430I(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, C10247d c10247d, View view, MotionEvent motionEvent) {
        return m8416W(takeAwayCheckoutAdapter, c10247d, view, motionEvent);
    }

    /* renamed from: J */
    public static /* synthetic */ void m8429J(C10247d c10247d, TakeAwayProduct takeAwayProduct, View view) {
        m8417V(c10247d, takeAwayProduct, view);
    }

    /* renamed from: K */
    public static /* synthetic */ void m8428K(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, View view) {
        m8415X(takeAwayCheckoutAdapter, view);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m8427L(C10247d c10247d, View view, MotionEvent motionEvent) {
        return m8418U(c10247d, view, motionEvent);
    }

    /* renamed from: M */
    public static final /* synthetic */ InterfaceC6113q m8426M(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter) {
        return takeAwayCheckoutAdapter.f26687f;
    }

    /* renamed from: N */
    public static final /* synthetic */ Map m8425N(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter) {
        return takeAwayCheckoutAdapter.f26691j;
    }

    /* renamed from: O */
    public static final /* synthetic */ TakeAwayProduct m8424O(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, int i) {
        return (TakeAwayProduct) takeAwayCheckoutAdapter.m22155D(i);
    }

    /* renamed from: P */
    public static final /* synthetic */ InterfaceC10524i0 m8423P(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter) {
        return takeAwayCheckoutAdapter.f26686e;
    }

    /* renamed from: R */
    private final int m8421R() {
        return mo29834f() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static final boolean m8418U(C10247d c10247d, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(c10247d, "$holder");
        int action = motionEvent.getAction();
        if (action == 0) {
            ((AbstractC12106xe) c10247d.m22151M()).f31911y.setAddStatesFromChildren(false);
        } else if (action == 1) {
            ((AbstractC12106xe) c10247d.m22151M()).f31907D.performClick();
        } else if (action == 3) {
            ((AbstractC12106xe) c10247d.m22151M()).f31911y.setAddStatesFromChildren(true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m8417V(C10247d c10247d, TakeAwayProduct takeAwayProduct, View view) {
        Intrinsics.isThisObjectNull(c10247d, "$holder");
        Intrinsics.isThisObjectNull(takeAwayProduct, "$item");
        if (((AbstractC12106xe) c10247d.m22151M()).f31906C.m33796q()) {
            return;
        }
        ((AbstractC12106xe) c10247d.m22151M()).f31908E.setVisibility(takeAwayProduct.m14242k().length() > 0 ? 4 : 0);
        ((AbstractC12106xe) c10247d.m22151M()).f31905B.setVisibility(4);
        ((AbstractC12106xe) c10247d.m22151M()).f31906C.setVisibility(0);
        c10247d.m20891R(false);
        QuantityPickerView quantityPickerView = ((AbstractC12106xe) c10247d.m22151M()).f31906C;
        Intrinsics.checkIfNull(quantityPickerView, "holder.binding.quantityQuantityPickerView");
        QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final boolean m8416W(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, C10247d c10247d, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutAdapter, "this$0");
        Intrinsics.isThisObjectNull(c10247d, "$holder");
        InterfaceC6108l interfaceC6108l = (InterfaceC6108l) takeAwayCheckoutAdapter.f26691j.get(Integer.valueOf(c10247d.m36568j()));
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(C13195u.f34156a);
        }
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static final void m8415X(TakeAwayCheckoutAdapter takeAwayCheckoutAdapter, View view) {
        Intrinsics.isThisObjectNull(takeAwayCheckoutAdapter, "this$0");
        InterfaceC6113q interfaceC6113q = takeAwayCheckoutAdapter.f26687f;
        if (interfaceC6113q != null) {
            interfaceC6113q.mo4533i(EnumC9515a.EDIT_EMAIL, new TakeAwayProduct(0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, 0, 0, 0, 262143, null), -1);
        }
    }

    /* renamed from: Q */
    public final AbstractC12031te m8422Q() {
        return this.f26692k;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: S */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        if (i == m8421R()) {
            C10246c c10246c = (C10246c) bindableViewHolder;
            this.f26692k = (AbstractC12031te) c10246c.m22151M();
            ((AbstractC12031te) c10246c.m22151M()).mo3705S(this.f26693l);
            ((AbstractC12031te) c10246c.m22151M()).f31567y.setOnClickListener(new View.OnClickListener() { // from class: sl.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TakeAwayCheckoutAdapter.m8415X(TakeAwayCheckoutAdapter.this, view);
                }
            });
            return;
        }
        final TakeAwayProduct takeAwayProduct = (TakeAwayProduct) m22155D(i);
        if (takeAwayProduct != null) {
            final C10247d c10247d = (C10247d) bindableViewHolder;
            this.f26689h.setDuration(this.f26688g);
            this.f26690i.setDuration(this.f26688g);
            ((AbstractC12106xe) c10247d.m22151M()).mo3596S(takeAwayProduct);
            ((AbstractC12106xe) c10247d.m22151M()).f31905B.startAnimation(this.f26689h);
            ((AbstractC12106xe) c10247d.m22151M()).f31905B.setVisibility(0);
            if (this.f26687f != null) {
                ((AbstractC12106xe) c10247d.m22151M()).f31905B.setOnTouchListener(new View.OnTouchListener() { // from class: sl.c
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m8081U;
                        m8081U = TakeAwayCheckoutAdapter.m8418U(TakeAwayCheckoutAdapter.C10247d.this, view, motionEvent);
                        return m8081U;
                    }
                });
                ((AbstractC12106xe) c10247d.m22151M()).f31907D.setOnClickListener(new View.OnClickListener() { // from class: sl.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TakeAwayCheckoutAdapter.m8417V(TakeAwayCheckoutAdapter.C10247d.this, takeAwayProduct, view);
                    }
                });
                QuantityPickerView quantityPickerView = ((AbstractC12106xe) c10247d.m22151M()).f31906C;
                if (takeAwayProduct.m14242k().length() > 0) {
                    String m14242k = takeAwayProduct.m14242k();
                    quantityPickerView.setTextLabelFormatter("%s " + m14242k);
                }
                quantityPickerView.setOnTouchListener(new View.OnTouchListener() { // from class: sl.d
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        boolean m8079W;
                        m8079W = TakeAwayCheckoutAdapter.m8416W(TakeAwayCheckoutAdapter.this, c10247d, view, motionEvent);
                        return m8079W;
                    }
                });
                QuantityPickerView quantityPickerView2 = ((AbstractC12106xe) c10247d.m22151M()).f31906C;
                Intrinsics.checkIfNull(quantityPickerView2, "holder.binding.quantityQuantityPickerView");
                quantityPickerView2.setActionListener(new C10249f(c10247d, this, c10247d, this, c10247d, takeAwayProduct));
            }
        }
    }

    /* renamed from: T */
    public void mo36535t(BindableViewHolder bindableViewHolder, int i, List list) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Intrinsics.isThisObjectNull(list, "payloads");
        if (i != m8421R() && !list.isEmpty()) {
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) m22155D(i);
            if (takeAwayProduct != null) {
                C10247d c10247d = (C10247d) bindableViewHolder;
                ((AbstractC12106xe) c10247d.m22151M()).f31907D.setText(String.valueOf(takeAwayProduct.m14235w()));
                ((AbstractC12106xe) c10247d.m22151M()).f31906C.setValue(takeAwayProduct.m14235w());
                TextView textView = ((AbstractC12106xe) c10247d.m22151M()).f31904A;
                C6429c0 c6429c0 = C6429c0.f17515a;
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(takeAwayProduct.m14235w() * takeAwayProduct.m14238s())}, 1));
                Intrinsics.checkIfNull(format, "format(format, *args)");
                textView.setText(C5579c.m23715d(format, null, 1, null));
                return;
            }
            return;
        }
        super.mo36535t(bindableViewHolder, i, list);
    }

    /* renamed from: Y */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == -1) {
            AbstractC12031te m3765Q = AbstractC12031te.m3765Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3765Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C10246c(m3765Q);
        }
        AbstractC12106xe m3651Q = AbstractC12106xe.m3651Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3651Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C10247d(m3651Q);
    }

    /* renamed from: Z */
    public final void m8413Z(TakeAwayCheckout takeAwayCheckout) {
        Intrinsics.isThisObjectNull(takeAwayCheckout, "value");
        this.f26693l = takeAwayCheckout;
        m36541l(m8421R());
    }

    /* renamed from: f */
    public int mo29834f() {
        return super.mo29834f() + 1;
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        if (i == m8421R()) {
            return -1;
        }
        return i;
    }
}
