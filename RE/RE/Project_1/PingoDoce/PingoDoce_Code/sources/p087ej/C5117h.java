package p087ej;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import be.OperatorExtensions;
import be.UtilsExtensions;
import com.github.guilhe.views.QuantityPickerView;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import p106fe.CommonUtils;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11733dd;
import p426wg.AbstractC11767fd;
import p426wg.AbstractC11804hd;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import td.InterfaceC10524i0;

/* compiled from: ProductListAdapter.kt */
/* renamed from: ej.h */
/* loaded from: classes2.dex */
public final class C5117h extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC10524i0 f14147e;

    /* renamed from: f */
    private final EnumC5125l f14148f;

    /* renamed from: g */
    private final InterfaceC6113q f14149g;

    /* renamed from: h */
    private final InterfaceC6112p f14150h;

    /* renamed from: i */
    private final Map f14151i;

    /* renamed from: j */
    private InterfaceC6097a f14152j;

    /* renamed from: k */
    private boolean f14153k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductListAdapter.kt */
    /* renamed from: ej.h$a */
    /* loaded from: classes2.dex */
    public static final class C5118a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C5118a f14154w = new C5118a();

        C5118a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(CatalogProduct catalogProduct, CatalogProduct catalogProduct2) {
            Intrinsics.isThisObjectNull(catalogProduct, "old");
            Intrinsics.isThisObjectNull(catalogProduct2, "new");
            return Boolean.valueOf(Intrinsics.equals(catalogProduct.m14499y(), catalogProduct2.m14499y()));
        }
    }

    /* compiled from: ProductListAdapter.kt */
    /* renamed from: ej.h$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C5119b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14155a;

        static {
            int[] iArr = new int[EnumC5125l.values().length];
            iArr[EnumC5125l.SMALL.ordinal()] = 1;
            iArr[EnumC5125l.BIG.ordinal()] = 2;
            iArr[EnumC5125l.FIXED.ordinal()] = 3;
            f14155a = iArr;
        }
    }

    /* compiled from: ProductListAdapter.kt */
    /* renamed from: ej.h$c */
    /* loaded from: classes2.dex */
    static final class C5120c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BindableViewHolder f14156a;

        /* renamed from: b */
        final /* synthetic */ int f14157b;

        /* renamed from: c */
        final /* synthetic */ int f14158c;

        /* renamed from: d */
        final /* synthetic */ float f14159d;

        /* renamed from: e */
        final /* synthetic */ float f14160e;

        C5120c(BindableViewHolder bindableViewHolder, int i, int i2, float f, float f2) {
            this.f14156a = bindableViewHolder;
            this.f14157b = i;
            this.f14158c = i2;
            this.f14159d = f;
            this.f14160e = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Intrinsics.isThisObjectNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ((AbstractC5124k) this.f14156a).m25616P().setElevation(floatValue);
            View m25615Q = ((AbstractC5124k) this.f14156a).m25615Q();
            if (m25615Q == null) {
                return;
            }
            m25615Q.setAlpha(CommonUtils.f15361a.m24296f(floatValue, this.f14157b, this.f14158c, this.f14159d, this.f14160e));
        }
    }

    /* compiled from: ProductListAdapter.kt */
    /* renamed from: ej.h$d */
    /* loaded from: classes2.dex */
    static final class C5121d extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ BindableViewHolder f14161w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5121d(BindableViewHolder bindableViewHolder) {
            super(1);
            this.f14161w = bindableViewHolder;
        }

        /* renamed from: a */
        public final void m25631a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView.m33790w(((AbstractC5124k) this.f14161w).m25614R(), 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m25631a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: ej.h$e */
    /* loaded from: classes2.dex */
    public static final class C5122e implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: b */
        final /* synthetic */ CatalogProduct f14163b;

        /* renamed from: c */
        final /* synthetic */ BindableViewHolder f14164c;

        /* renamed from: d */
        final /* synthetic */ BindableViewHolder f14165d;

        public C5122e(CatalogProduct catalogProduct, BindableViewHolder bindableViewHolder, C5117h c5117h, BindableViewHolder bindableViewHolder2) {
            this.f14163b = catalogProduct;
            this.f14164c = bindableViewHolder;
            this.f14165d = bindableViewHolder2;
        }

        /* renamed from: a */
        public void m25630a(boolean z) {
            if (z) {
                C5117h.m25647K(C5117h.this).put(Integer.valueOf(((AbstractC5124k) this.f14165d).m36568j()), OperatorExtensions.m35180a(2000L, C5117h.m25645M(C5117h.this), new C5121d(this.f14165d)));
                InterfaceC6108l interfaceC6108l = (InterfaceC6108l) C5117h.m25647K(C5117h.this).get(Integer.valueOf(((AbstractC5124k) this.f14165d).m36568j()));
                if (interfaceC6108l != null) {
                    interfaceC6108l.mo9587d(C13195u.f34156a);
                }
                InterfaceC6097a m25644N = C5117h.this.m25644N();
                if (m25644N != null) {
                    m25644N.mo42214q();
                    return;
                }
                return;
            }
            C5117h.m25647K(C5117h.this).remove(Integer.valueOf(((AbstractC5124k) this.f14165d).m36568j()));
        }

        /* renamed from: b */
        public void m25629b(boolean z) {
            int m35167e = z ? UtilsExtensions.m35167e(1) : UtilsExtensions.m35167e(10);
            int m35167e2 = z ? UtilsExtensions.m35167e(10) : UtilsExtensions.m35167e(1);
            float f = z ? 1.0f : 0.5f;
            float f2 = z ? 0.2f : 1.0f;
            ValueAnimator m24301a = CommonUtils.f15361a.m24301a(m35167e, m35167e2, 500L);
            m24301a.addUpdateListener(new C5120c(this.f14164c, m35167e, m35167e2, f, f2));
            m24301a.start();
        }

        /* renamed from: c */
        public void m25628c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            InterfaceC6112p m25646L = C5117h.m25646L(C5117h.this);
            if (m25646L != null) {
                m25646L.mo39856d(this.f14163b, Integer.valueOf(i));
            }
        }
    }

    public /* synthetic */ C5117h(InterfaceC10524i0 interfaceC10524i0, EnumC5125l enumC5125l, InterfaceC6113q interfaceC6113q, InterfaceC6112p interfaceC6112p, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10524i0, (i & 2) != 0 ? EnumC5125l.BIG : enumC5125l, (i & 4) != 0 ? null : interfaceC6113q, (i & 8) != 0 ? null : interfaceC6112p);
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m25649I(C5117h c5117h, BindableViewHolder bindableViewHolder, View view, MotionEvent motionEvent) {
        return m25641Q(c5117h, bindableViewHolder, view, motionEvent);
    }

    /* renamed from: J */
    public static /* synthetic */ void m25648J(BindableViewHolder bindableViewHolder, C5117h c5117h, View view) {
        m25640R(bindableViewHolder, c5117h, view);
    }

    /* renamed from: K */
    public static final /* synthetic */ Map m25647K(C5117h c5117h) {
        return c5117h.f14151i;
    }

    /* renamed from: L */
    public static final /* synthetic */ InterfaceC6112p m25646L(C5117h c5117h) {
        return c5117h.f14150h;
    }

    /* renamed from: M */
    public static final /* synthetic */ InterfaceC10524i0 m25645M(C5117h c5117h) {
        return c5117h.f14147e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final boolean m25641Q(C5117h c5117h, BindableViewHolder bindableViewHolder, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(c5117h, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        InterfaceC6108l interfaceC6108l = (InterfaceC6108l) c5117h.f14151i.get(Integer.valueOf(((AbstractC5124k) bindableViewHolder).m36568j()));
        if (interfaceC6108l != null) {
            interfaceC6108l.mo9587d(C13195u.f34156a);
        }
        return view.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m25640R(BindableViewHolder bindableViewHolder, C5117h c5117h, View view) {
        InterfaceC6113q interfaceC6113q;
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        Intrinsics.isThisObjectNull(c5117h, "this$0");
        AbstractC5124k abstractC5124k = (AbstractC5124k) bindableViewHolder;
        if (abstractC5124k.m25615Q() != null) {
            View m25615Q = abstractC5124k.m25615Q();
            if (!Intrinsics.m20934a(m25615Q != null ? Float.valueOf(m25615Q.getAlpha()) : null, 1.0f)) {
                return;
            }
        }
        if (c5117h.m22155D(abstractC5124k.m36568j()) == null || (interfaceC6113q = c5117h.f14149g) == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(abstractC5124k.m36568j());
        Object m22155D = c5117h.m22155D(abstractC5124k.m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.products.CatalogProduct");
        interfaceC6113q.mo4533i(valueOf, (CatalogProduct) m22155D, abstractC5124k.m25613S());
    }

    /* renamed from: N */
    public final InterfaceC6097a m25644N() {
        return this.f14152j;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: O */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        AbstractC5124k abstractC5124k = (AbstractC5124k) bindableViewHolder;
        CatalogProduct catalogProduct = (CatalogProduct) m22155D(abstractC5124k.m36568j());
        if (catalogProduct != null) {
            abstractC5124k.m25617O(catalogProduct);
            QuantityPickerView m25614R = abstractC5124k.m25614R();
            String m14541D = catalogProduct.m14541D();
            m25614R.setTextLabelFormatter("%s " + m14541D);
            m25614R.setActionListener(new C5122e(catalogProduct, bindableViewHolder, this, bindableViewHolder));
            m25614R.setOnTouchListener(new View.OnTouchListener() { // from class: ej.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean m25641Q;
                    m25641Q = C5117h.m25641Q(C5117h.this, bindableViewHolder, view, motionEvent);
                    return m25641Q;
                }
            });
            abstractC5124k.m25616P().setOnClickListener(new View.OnClickListener() { // from class: ej.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C5117h.m25640R(BindableViewHolder.this, this, view);
                }
            });
        }
    }

    /* renamed from: P */
    public void mo36535t(BindableViewHolder bindableViewHolder, int i, List list) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Intrinsics.isThisObjectNull(list, "payloads");
        if (list.isEmpty()) {
            super.mo36535t(bindableViewHolder, i, list);
            return;
        }
        CatalogProduct catalogProduct = (CatalogProduct) m22155D(i);
        if (catalogProduct != null) {
            ((AbstractC5124k) bindableViewHolder).m25614R().setValue(catalogProduct.m14538G());
        }
    }

    /* renamed from: S */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        int i2 = C5119b.f14155a[this.f14148f.ordinal()];
        if (i2 == 1) {
            AbstractC11804hd m4227Q = AbstractC11804hd.m4227Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4227Q, "inflate(\n               …  false\n                )");
            C5123j c5123j = new C5123j(m4227Q);
            c5123j.m25619U(this.f14153k);
            return c5123j;
        } else if (i2 == 2) {
            AbstractC11733dd m4402Q = AbstractC11733dd.m4402Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4402Q, "inflate(\n               …  false\n                )");
            return new ProductListAdapter(m4402Q);
        } else if (i2 == 3) {
            AbstractC11767fd m4306Q = AbstractC11767fd.m4306Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4306Q, "inflate(\n               …  false\n                )");
            return new C5114e(m4306Q);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: T */
    public final void m25638T(boolean z) {
        this.f14153k = z;
    }

    /* renamed from: U */
    public final void m25637U(InterfaceC6097a interfaceC6097a) {
        this.f14152j = interfaceC6097a;
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5117h(InterfaceC10524i0 interfaceC10524i0, EnumC5125l enumC5125l, InterfaceC6113q interfaceC6113q, InterfaceC6112p interfaceC6112p) {
        super(C5118a.f14154w);
        Intrinsics.isThisObjectNull(interfaceC10524i0, "lifecycleScope");
        Intrinsics.isThisObjectNull(enumC5125l, "type");
        this.f14147e = interfaceC10524i0;
        this.f14148f = enumC5125l;
        this.f14149g = interfaceC6113q;
        this.f14150h = interfaceC6112p;
        this.f14151i = new LinkedHashMap();
    }
}
