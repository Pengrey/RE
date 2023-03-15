package p207kl;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.guilhe.views.QuantityPickerView;
import fm.C5579c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import je.TouchableViewHolder;
import kg.InterfaceC6661b;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import lib.mozidev.p225me.extextview.ExTextView;
import p181jd.AbstractC6438m;
import p181jd.C6445u;
import p181jd.Intrinsics;
import p207kl.ShoppingListAdapter;
import p426wg.AbstractC11734de;
import p426wg.AbstractC11768fe;
import p426wg.AbstractC12140zd;
import p468yc.C13186n;
import p468yc.C13195u;
import p469yd.C13198b;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.presentation.shoppinglist.EnumC9444a;
import td.C10565r0;
import td.InterfaceC10524i0;

/* renamed from: kl.m0 */
/* loaded from: classes2.dex */
public class ShoppingListAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC10524i0 f18055e;

    /* renamed from: f */
    private final InterfaceC6113q f18056f;

    /* renamed from: g */
    private final long f18057g;

    /* renamed from: h */
    private final AlphaAnimation f18058h;

    /* renamed from: i */
    private final AlphaAnimation f18059i;

    /* renamed from: j */
    private final Map f18060j;

    /* renamed from: k */
    private final Map f18061k;

    /* renamed from: l */
    private int f18062l;

    /* renamed from: m */
    private boolean f18063m;

    /* renamed from: n */
    private boolean f18064n;

    /* renamed from: o */
    private String f18065o;

    /* renamed from: p */
    private List f18066p;

    /* renamed from: q */
    private boolean f18067q;

    /* renamed from: r */
    private boolean f18068r;

    /* renamed from: s */
    private int f18069s;

    /* renamed from: t */
    private boolean f18070t;

    /* renamed from: u */
    private Drawable f18071u;

    /* renamed from: v */
    private boolean f18072v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$a */
    /* loaded from: classes2.dex */
    public static final class C6720a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6720a f18073w = new C6720a();

        C6720a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(InterfaceC6661b interfaceC6661b, InterfaceC6661b interfaceC6661b2) {
            Intrinsics.isThisObjectNull(interfaceC6661b, "old");
            Intrinsics.isThisObjectNull(interfaceC6661b2, "new");
            boolean z = interfaceC6661b instanceof ShoppingListProduct;
            String str = interfaceC6661b;
            String str2 = interfaceC6661b2;
            if (z) {
                boolean z2 = interfaceC6661b2 instanceof ShoppingListProduct;
                str = interfaceC6661b;
                str2 = interfaceC6661b2;
                if (z2) {
                    str = ((ShoppingListProduct) interfaceC6661b).m14331k();
                    str2 = ((ShoppingListProduct) interfaceC6661b2).m14331k();
                }
            }
            return Boolean.valueOf(Intrinsics.equals(str, str2));
        }
    }

    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$b */
    /* loaded from: classes2.dex */
    public static final class C6721b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6721b(AbstractC11768fe abstractC11768fe) {
            super(abstractC11768fe);
            Intrinsics.isThisObjectNull(abstractC11768fe, "binding");
        }
    }

    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$c */
    /* loaded from: classes2.dex */
    public static final class C6722c {
        private C6722c() {
        }

        public /* synthetic */ C6722c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$d */
    /* loaded from: classes2.dex */
    public static final class C6723d extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6723d(AbstractC12140zd abstractC12140zd) {
            super(abstractC12140zd);
            Intrinsics.isThisObjectNull(abstractC12140zd, "binding");
        }
    }

    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$e */
    /* loaded from: classes2.dex */
    public static final class C6724e extends TouchableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6724e(AbstractC11734de abstractC11734de) {
            super(abstractC11734de);
            Intrinsics.isThisObjectNull(abstractC11734de, "binding");
        }

        /* renamed from: S */
        public ImageView m20223O() {
            ImageView imageView = ((AbstractC11734de) m22151M()).f30154x;
            Intrinsics.checkIfNull(imageView, "binding.backgroundIconImageView");
            return imageView;
        }

        /* renamed from: T */
        public ConstraintLayout m20222P() {
            ConstraintLayout constraintLayout = ((AbstractC11734de) m22151M()).f30140D;
            Intrinsics.checkIfNull(constraintLayout, "binding.foregroundConstraintLayout");
            return constraintLayout;
        }
    }

    /* compiled from: ShoppingListAdapter.kt */
    /* renamed from: kl.m0$f */
    /* loaded from: classes2.dex */
    static final class C6725f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C6724e f18074w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6725f(C6724e c6724e) {
            super(1);
            this.f18074w = c6724e;
        }

        /* renamed from: a */
        public final void m20219a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            QuantityPickerView quantityPickerView = ((AbstractC11734de) this.f18074w.m22151M()).f30145I;
            Intrinsics.checkIfNull(quantityPickerView, "holder.binding.quantityQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20219a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListAdapter.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListAdapter$onBindViewHolder$2$1$3", m20196f = "ShoppingListAdapter.kt", m20195l = {273}, m20194m = "invokeSuspend")
    /* renamed from: kl.m0$g */
    /* loaded from: classes2.dex */
    public static final class C6726g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f18075x;

        /* renamed from: z */
        final /* synthetic */ C6724e f18077z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6726g(C6724e c6724e, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18077z = c6724e;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C6726g(this.f18077z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C6726g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            C13198b m1416s;
            m34636d = C2116d.m34636d();
            int i = this.f18075x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f18075x = 1;
                if (C10565r0.m7677a(350L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            C13198b c13198b = (C13198b) ShoppingListAdapter.m20256T(ShoppingListAdapter.this).get(C6755b.m20199c(this.f18077z.m36568j()));
            if (c13198b != null && (m1416s = c13198b.m1416s(0L)) != null) {
                m1416s.m1418q();
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: kl.m0$h */
    /* loaded from: classes2.dex */
    public static final class C6727h implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ C6445u f18078a;

        /* renamed from: b */
        final /* synthetic */ ShoppingListAdapter f18079b;

        /* renamed from: c */
        final /* synthetic */ C6724e f18080c;

        /* renamed from: d */
        final /* synthetic */ C6445u f18081d;

        /* renamed from: e */
        final /* synthetic */ C6724e f18082e;

        /* renamed from: f */
        final /* synthetic */ InterfaceC6661b f18083f;

        public C6727h(C6445u c6445u, ShoppingListAdapter shoppingListAdapter, C6724e c6724e, C6445u c6445u2, ShoppingListAdapter shoppingListAdapter2, C6724e c6724e2, InterfaceC6661b interfaceC6661b) {
            this.f18078a = c6445u;
            this.f18079b = shoppingListAdapter;
            this.f18080c = c6724e;
            this.f18081d = c6445u2;
            this.f18082e = c6724e2;
            this.f18083f = interfaceC6661b;
        }

        /* renamed from: a */
        public void m20217a(boolean z) {
            InterfaceC6661b m20258R;
            if (z) {
                this.f18081d.f17529w = false;
                ShoppingListAdapter.m20259Q(this.f18079b).put(Integer.valueOf(this.f18082e.m36568j()), OperatorExtensions.m35180a(2000L, ShoppingListAdapter.m20257S(this.f18079b), new C6725f(this.f18082e)));
                InterfaceC6108l interfaceC6108l = (InterfaceC6108l) ShoppingListAdapter.m20259Q(this.f18079b).get(Integer.valueOf(this.f18082e.m36568j()));
                if (interfaceC6108l != null) {
                    interfaceC6108l.mo9587d(C13195u.f34156a);
                    return;
                }
                return;
            }
            ShoppingListAdapter.m20259Q(this.f18079b).remove(Integer.valueOf(this.f18082e.m36568j()));
            TransitionManager.beginDelayedTransition(((AbstractC11734de) this.f18082e.m22151M()).f30140D);
            ((AbstractC11734de) this.f18082e.m22151M()).f30145I.setVisibility(4);
            ((AbstractC11734de) this.f18082e.m22151M()).f30146J.setVisibility(0);
            if (((ShoppingListProduct) this.f18083f).m14323y().length() > 0) {
                ((AbstractC11734de) this.f18082e.m22151M()).f30147K.setVisibility(0);
            }
            if (this.f18079b.m20253W()) {
                ((AbstractC11734de) this.f18082e.m22151M()).f30144H.setVisibility(0);
            }
            this.f18082e.m20891R(true);
            ((AbstractC11734de) this.f18082e.m22151M()).f30140D.setAddStatesFromChildren(true);
            if (!this.f18081d.f17529w || (m20258R = ShoppingListAdapter.m20258R(this.f18079b, this.f18082e.m36568j())) == null) {
                return;
            }
            ShoppingListAdapter.m20260P(this.f18079b).mo4533i(EnumC9444a.QUANTITY_VALUE_UPDATE_REQUEST, (ShoppingListProduct) m20258R, Integer.valueOf(this.f18082e.m36568j()));
        }

        /* renamed from: b */
        public void m20216b(boolean z) {
        }

        /* renamed from: c */
        public void m20215c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
            this.f18078a.f17529w = true;
            InterfaceC6661b m20258R = ShoppingListAdapter.m20258R(this.f18079b, this.f18080c.m36568j());
            if (m20258R != null) {
                InterfaceC6113q m20260P = ShoppingListAdapter.m20260P(this.f18079b);
                EnumC9444a enumC9444a = EnumC9444a.QUANTITY_UPDATE;
                ShoppingListProduct m14340a = ((ShoppingListProduct) m20258R).m14340a();
                m14340a.m14341M(i);
                C13195u c13195u = C13195u.f34156a;
                m20260P.mo4533i(enumC9444a, m14340a, Integer.valueOf(this.f18080c.m36568j()));
            }
        }
    }

    static {
        new C6722c(null);
    }

    public /* synthetic */ ShoppingListAdapter(InterfaceC10524i0 interfaceC10524i0, boolean z, List list, int i, InterfaceC6113q interfaceC6113q, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10524i0, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? new ArrayList() : list, i, interfaceC6113q);
    }

    /* renamed from: I */
    public static /* synthetic */ void m20267I(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, InterfaceC6661b interfaceC6661b, View view) {
        m20246d0(shoppingListAdapter, c6724e, interfaceC6661b, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m20266J(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        m20240h0(shoppingListAdapter, c6724e, view);
    }

    /* renamed from: K */
    public static /* synthetic */ void m20265K(InterfaceC6661b interfaceC6661b, ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        m20239i0(interfaceC6661b, shoppingListAdapter, c6724e, view);
    }

    /* renamed from: L */
    public static /* synthetic */ boolean m20264L(C6724e c6724e, View view, MotionEvent motionEvent) {
        return m20247c0(c6724e, view, motionEvent);
    }

    /* renamed from: M */
    public static /* synthetic */ void m20263M(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        m20243f0(shoppingListAdapter, c6724e, view);
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m20262N(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view, MotionEvent motionEvent) {
        return m20245e0(shoppingListAdapter, c6724e, view, motionEvent);
    }

    /* renamed from: O */
    public static /* synthetic */ void m20261O(C6724e c6724e, View view) {
        m20242g0(c6724e, view);
    }

    /* renamed from: P */
    public static final /* synthetic */ InterfaceC6113q m20260P(ShoppingListAdapter shoppingListAdapter) {
        return shoppingListAdapter.f18056f;
    }

    /* renamed from: Q */
    public static final /* synthetic */ Map m20259Q(ShoppingListAdapter shoppingListAdapter) {
        return shoppingListAdapter.f18060j;
    }

    /* renamed from: R */
    public static final /* synthetic */ InterfaceC6661b m20258R(ShoppingListAdapter shoppingListAdapter, int i) {
        return (InterfaceC6661b) shoppingListAdapter.m22155D(i);
    }

    /* renamed from: S */
    public static final /* synthetic */ InterfaceC10524i0 m20257S(ShoppingListAdapter shoppingListAdapter) {
        return shoppingListAdapter.f18055e;
    }

    /* renamed from: T */
    public static final /* synthetic */ Map m20256T(ShoppingListAdapter shoppingListAdapter) {
        return shoppingListAdapter.f18061k;
    }

    /* renamed from: Z */
    private final int m20250Z() {
        return mo29834f() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static final boolean m20247c0(C6724e c6724e, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        int action = motionEvent.getAction();
        if (action == 0) {
            ((AbstractC11734de) c6724e.m22151M()).f30140D.setAddStatesFromChildren(false);
        } else if (action == 1) {
            ((AbstractC11734de) c6724e.m22151M()).f30146J.performClick();
        } else if (action == 3) {
            ((AbstractC11734de) c6724e.m22151M()).f30140D.setAddStatesFromChildren(true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static final void m20246d0(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, InterfaceC6661b interfaceC6661b, View view) {
        Intrinsics.isThisObjectNull(shoppingListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        Intrinsics.isThisObjectNull(interfaceC6661b, "$item");
        shoppingListAdapter.f18067q = false;
        if (((AbstractC11734de) c6724e.m22151M()).f30145I.m33796q()) {
            return;
        }
        if (shoppingListAdapter.f18068r) {
            view.setVisibility(4);
            if (((ShoppingListProduct) interfaceC6661b).m14323y().length() > 0) {
                ((AbstractC11734de) c6724e.m22151M()).f30147K.setVisibility(4);
            }
            ((AbstractC11734de) c6724e.m22151M()).f30144H.setVisibility(4);
            ((AbstractC11734de) c6724e.m22151M()).f30145I.setVisibility(0);
            c6724e.m20891R(false);
            QuantityPickerView quantityPickerView = ((AbstractC11734de) c6724e.m22151M()).f30145I;
            Intrinsics.checkIfNull(quantityPickerView, "holder.binding.quantityQuantityPickerView");
            QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
            return;
        }
        ((AbstractC11734de) c6724e.m22151M()).f30139C.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final boolean m20245e0(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(shoppingListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        if (shoppingListAdapter.f18068r) {
            InterfaceC6108l interfaceC6108l = (InterfaceC6108l) shoppingListAdapter.f18060j.get(Integer.valueOf(c6724e.m36568j()));
            if (interfaceC6108l != null) {
                interfaceC6108l.mo9587d(C13195u.f34156a);
            }
            return view.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m20243f0(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        Intrinsics.isThisObjectNull(shoppingListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        Object m22155D = shoppingListAdapter.m22155D(c6724e.m36568j());
        Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
        ShoppingListProduct shoppingListProduct = (ShoppingListProduct) m22155D;
        shoppingListAdapter.f18067q = false;
        if (shoppingListAdapter.f18068r) {
            if (!shoppingListProduct.m14350D() || ((AbstractC11734de) c6724e.m22151M()).f30145I.m33796q()) {
                return;
            }
            InterfaceC6113q interfaceC6113q = shoppingListAdapter.f18056f;
            EnumC9444a enumC9444a = EnumC9444a.ITEM_UPDATE;
            Object m22155D2 = shoppingListAdapter.m22155D(c6724e.m36568j());
            Objects.requireNonNull(m22155D2, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            interfaceC6113q.mo4533i(enumC9444a, (ShoppingListProduct) m22155D2, Integer.valueOf(c6724e.m36568j()));
            return;
        }
        InterfaceC6113q interfaceC6113q2 = shoppingListAdapter.f18056f;
        EnumC9444a enumC9444a2 = EnumC9444a.CHECKED_UPDATE;
        ShoppingListProduct m14340a = shoppingListProduct.m14340a();
        m14340a.m14347G(!shoppingListProduct.m14334h());
        C13195u c13195u = C13195u.f34156a;
        interfaceC6113q2.mo4533i(enumC9444a2, m14340a, Integer.valueOf(c6724e.m36568j()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m20242g0(C6724e c6724e, View view) {
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        ((AbstractC11734de) c6724e.m22151M()).f30139C.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static final void m20240h0(ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        Intrinsics.isThisObjectNull(shoppingListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        shoppingListAdapter.f18067q = false;
        if (shoppingListAdapter.f18068r) {
            InterfaceC6113q interfaceC6113q = shoppingListAdapter.f18056f;
            EnumC9444a enumC9444a = EnumC9444a.SEARCH;
            Object m22155D = shoppingListAdapter.m22155D(c6724e.m36568j());
            Objects.requireNonNull(m22155D, "null cannot be cast to non-null type pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct");
            interfaceC6113q.mo4533i(enumC9444a, (ShoppingListProduct) m22155D, Integer.valueOf(c6724e.m36568j()));
            return;
        }
        ((AbstractC11734de) c6724e.m22151M()).f30139C.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m20239i0(InterfaceC6661b interfaceC6661b, ShoppingListAdapter shoppingListAdapter, C6724e c6724e, View view) {
        InterfaceC6113q interfaceC6113q;
        Intrinsics.isThisObjectNull(interfaceC6661b, "$item");
        Intrinsics.isThisObjectNull(shoppingListAdapter, "this$0");
        Intrinsics.isThisObjectNull(c6724e, "$holder");
        ShoppingListProduct shoppingListProduct = (ShoppingListProduct) interfaceC6661b;
        if (shoppingListProduct.m14351A() && shoppingListProduct.m14326t() && (interfaceC6113q = shoppingListAdapter.f18056f) != null) {
            interfaceC6113q.mo4533i(EnumC9444a.BADGE_DISCLAIMER, interfaceC6661b, Integer.valueOf(c6724e.m36568j()));
        }
    }

    /* renamed from: U */
    protected boolean m20255U() {
        return this.f18063m;
    }

    /* renamed from: V */
    protected boolean m20254V() {
        return this.f18064n;
    }

    /* renamed from: W */
    public final boolean m20253W() {
        return this.f18068r;
    }

    /* renamed from: X */
    protected int m20252X() {
        return this.f18062l;
    }

    /* renamed from: Y */
    public final List m20251Y() {
        return m22154E();
    }

    @SuppressLint({"ClickableViewAccessibility", "DirectColorInSource"})
    /* renamed from: a0 */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        if (!m20255U() && i == m20250Z()) {
            C6723d c6723d = (C6723d) bindableViewHolder;
            ((AbstractC12140zd) c6723d.m22151M()).mo3560W(true);
            ((AbstractC12140zd) c6723d.m22151M()).mo3561V(this.f18065o.length() > 0);
            ((AbstractC12140zd) c6723d.m22151M()).mo3562U(this.f18065o);
            ((AbstractC12140zd) c6723d.m22151M()).mo3564S(41);
            ((AbstractC12140zd) c6723d.m22151M()).mo3563T(this.f18066p);
            return;
        }
        final InterfaceC6661b interfaceC6661b = (InterfaceC6661b) m22155D(i);
        if (interfaceC6661b != null) {
            if (interfaceC6661b instanceof ShoppingListProduct) {
                final C6724e c6724e = (C6724e) bindableViewHolder;
                long j = this.f18067q ? this.f18057g : 0L;
                this.f18058h.setDuration(j);
                this.f18059i.setDuration(j);
                ShoppingListProduct shoppingListProduct = (ShoppingListProduct) interfaceC6661b;
                ((AbstractC11734de) c6724e.m22151M()).mo4353U(shoppingListProduct);
                ((AbstractC11734de) c6724e.m22151M()).mo4351W(Float.valueOf(this.f18068r ? 0.0f : 0.1f));
                ((AbstractC11734de) c6724e.m22151M()).mo4354T(new DecelerateInterpolator());
                ((AbstractC11734de) c6724e.m22151M()).mo4355S(Long.valueOf(j));
                ((AbstractC11734de) c6724e.m22151M()).mo4352V(Integer.valueOf(m20252X()));
                ((AbstractC11734de) c6724e.m22151M()).f30140D.setBackgroundColor(this.f18070t ? Color.parseColor(shoppingListProduct.m14335f().m14358d()) : this.f18069s);
                ((AbstractC11734de) c6724e.m22151M()).f30140D.setAddStatesFromChildren(!m20254V());
                if (m20254V()) {
                    ((AbstractC11734de) c6724e.m22151M()).f30144H.setForeground(null);
                }
                if (this.f18067q) {
                    ((AbstractC11734de) c6724e.m22151M()).f30144H.startAnimation(this.f18068r ? this.f18058h : this.f18059i);
                }
                ((AbstractC11734de) c6724e.m22151M()).f30144H.setVisibility(this.f18068r ? 0 : 4);
                if (this.f18056f != null) {
                    C6445u c6445u = new C6445u();
                    ((AbstractC11734de) c6724e.m22151M()).f30144H.setOnTouchListener(new View.OnTouchListener() { // from class: kl.k0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            boolean m20247c0;
                            m20247c0 = ShoppingListAdapter.m20247c0(ShoppingListAdapter.C6724e.this, view, motionEvent);
                            return m20247c0;
                        }
                    });
                    ((AbstractC11734de) c6724e.m22151M()).f30146J.setOnClickListener(new View.OnClickListener() { // from class: kl.j0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShoppingListAdapter.m20246d0(ShoppingListAdapter.this, c6724e, interfaceC6661b, view);
                        }
                    });
                    QuantityPickerView quantityPickerView = ((AbstractC11734de) c6724e.m22151M()).f30145I;
                    if (shoppingListProduct.m14323y().length() > 0) {
                        String m14323y = shoppingListProduct.m14323y();
                        quantityPickerView.setTextLabelFormatter("%s " + m14323y);
                    }
                    quantityPickerView.setOnTouchListener(new View.OnTouchListener() { // from class: kl.l0
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            boolean m20245e0;
                            m20245e0 = ShoppingListAdapter.m20245e0(ShoppingListAdapter.this, c6724e, view, motionEvent);
                            return m20245e0;
                        }
                    });
                    QuantityPickerView quantityPickerView2 = ((AbstractC11734de) c6724e.m22151M()).f30145I;
                    Intrinsics.checkIfNull(quantityPickerView2, "holder.binding.quantityQuantityPickerView");
                    quantityPickerView2.setActionListener(new C6727h(c6445u, this, c6724e, c6445u, this, c6724e, interfaceC6661b));
                }
                C13198b c13198b = (C13198b) this.f18061k.get(Integer.valueOf(c6724e.m36568j()));
                if (c13198b != null) {
                    c13198b.m1428g();
                    this.f18061k.put(Integer.valueOf(c6724e.m36568j()), null);
                }
                Map map = this.f18061k;
                Integer valueOf = Integer.valueOf(c6724e.m36568j());
                ExTextView exTextView = ((AbstractC11734de) c6724e.m22151M()).f30142F;
                Intrinsics.checkIfNull(exTextView, "holder.binding.itemNameExTextView");
                map.put(valueOf, new C13198b(exTextView).m1417r(UtilsExtensions.m35167e(3)));
                if (this.f18068r) {
                    C13198b c13198b2 = (C13198b) this.f18061k.get(Integer.valueOf(c6724e.m36568j()));
                    if (c13198b2 != null) {
                        c13198b2.m1428g();
                    }
                } else {
                    ((AbstractC11734de) c6724e.m22151M()).f30141E.setChecked(shoppingListProduct.m14334h());
                    if (shoppingListProduct.m14334h()) {
                        C6772d.m20158d(this.f18055e, null, null, new C6726g(c6724e, null), 3, null);
                    }
                }
                if (this.f18056f != null) {
                    ((AbstractC11734de) c6724e.m22151M()).f30139C.setOnClickListener(new View.OnClickListener() { // from class: kl.i0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShoppingListAdapter.m20243f0(ShoppingListAdapter.this, c6724e, view);
                        }
                    });
                    ((AbstractC11734de) c6724e.m22151M()).f30141E.setOnClickListener(new View.OnClickListener() { // from class: kl.g0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShoppingListAdapter.m20242g0(ShoppingListAdapter.C6724e.this, view);
                        }
                    });
                }
                if (!this.f18072v && shoppingListProduct.m14350D() && this.f18056f != null) {
                    if (this.f18067q) {
                        ((AbstractC11734de) c6724e.m22151M()).f30137A.startAnimation(this.f18068r ? this.f18058h : this.f18059i);
                    }
                    ((AbstractC11734de) c6724e.m22151M()).f30137A.setVisibility(this.f18068r ? 0 : 4);
                } else {
                    ((AbstractC11734de) c6724e.m22151M()).f30137A.setVisibility(8);
                }
                if (this.f18056f != null) {
                    ((AbstractC11734de) c6724e.m22151M()).f30137A.setOnClickListener(new View.OnClickListener() { // from class: kl.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShoppingListAdapter.m20240h0(ShoppingListAdapter.this, c6724e, view);
                        }
                    });
                }
                if (!shoppingListProduct.m14350D()) {
                    ((AbstractC11734de) c6724e.m22151M()).mo4350X(C5579c.m23715d(shoppingListProduct.m14328r(), null, 1, null));
                    ((AbstractC11734de) c6724e.m22151M()).mo4350X(C5579c.m23715d(shoppingListProduct.m14328r(), null, 1, null));
                    ((AbstractC11734de) c6724e.m22151M()).f30143G.setVisibility(0);
                    ((AbstractC11734de) c6724e.m22151M()).mo4349Y(shoppingListProduct.m14336e());
                    ((AbstractC11734de) c6724e.m22151M()).f30156z.setVisibility(shoppingListProduct.m14351A() ? 0 : 8);
                    ((AbstractC11734de) c6724e.m22151M()).f30155y.setVisibility((this.f18056f == null || !shoppingListProduct.m14326t()) ? 8 : 0);
                    ((AbstractC11734de) c6724e.m22151M()).f30155y.setOnClickListener(new View.OnClickListener() { // from class: kl.f0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ShoppingListAdapter.m20239i0(InterfaceC6661b.this, this, c6724e, view);
                        }
                    });
                    ((AbstractC11734de) c6724e.m22151M()).f30140D.setForeground(this.f18068r ? null : this.f18071u);
                    return;
                }
                ((AbstractC11734de) c6724e.m22151M()).mo4350X(BuildConfig.VERSION_NAME);
                ((AbstractC11734de) c6724e.m22151M()).f30143G.setVisibility(8);
                ((AbstractC11734de) c6724e.m22151M()).mo4349Y(BuildConfig.VERSION_NAME);
                ((AbstractC11734de) c6724e.m22151M()).f30156z.setVisibility(8);
                ((AbstractC11734de) c6724e.m22151M()).f30155y.setVisibility(8);
            } else if (interfaceC6661b instanceof ShoppingListCategory) {
                C6721b c6721b = (C6721b) bindableViewHolder;
                ShoppingListCategory shoppingListCategory = (ShoppingListCategory) interfaceC6661b;
                ((AbstractC11768fe) c6721b.m22151M()).mo4239S(Integer.valueOf(Color.parseColor(shoppingListCategory.m14358d())));
                ((AbstractC11768fe) c6721b.m22151M()).mo4238T(shoppingListCategory.m14357e());
            }
        }
    }

    @SuppressLint({"DirectColorInSource"})
    /* renamed from: b0 */
    public void mo36535t(BindableViewHolder bindableViewHolder, int i, List list) {
        C13198b m1416s;
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        Intrinsics.isThisObjectNull(list, "payloads");
        if (i != m20250Z() && !list.isEmpty()) {
            InterfaceC6661b interfaceC6661b = (InterfaceC6661b) m22155D(i);
            if (interfaceC6661b != null) {
                if (interfaceC6661b instanceof ShoppingListProduct) {
                    C6724e c6724e = (C6724e) bindableViewHolder;
                    ((AbstractC11734de) c6724e.m22151M()).f30140D.setBackgroundColor(this.f18070t ? Color.parseColor(((ShoppingListProduct) interfaceC6661b).m14335f().m14358d()) : this.f18069s);
                    ShoppingListProduct shoppingListProduct = (ShoppingListProduct) interfaceC6661b;
                    ((AbstractC11734de) c6724e.m22151M()).f30146J.setText(String.valueOf(shoppingListProduct.m14327s()));
                    ((AbstractC11734de) c6724e.m22151M()).f30145I.setValue(shoppingListProduct.m14327s());
                    ((AbstractC11734de) c6724e.m22151M()).f30143G.setText(C5579c.m23715d(shoppingListProduct.m14328r(), null, 1, null));
                    ((AbstractC11734de) c6724e.m22151M()).f30142F.setText(shoppingListProduct.m14329n());
                    ((AbstractC11734de) c6724e.m22151M()).f30141E.setChecked(shoppingListProduct.m14334h());
                    if (shoppingListProduct.m14334h() && !this.f18068r) {
                        C13198b c13198b = (C13198b) this.f18061k.get(Integer.valueOf(c6724e.m36568j()));
                        if (c13198b == null || (m1416s = c13198b.m1416s(this.f18057g)) == null) {
                            return;
                        }
                        m1416s.m1418q();
                        return;
                    }
                    C13198b c13198b2 = (C13198b) this.f18061k.get(Integer.valueOf(c6724e.m36568j()));
                    if (c13198b2 != null) {
                        c13198b2.m1428g();
                        return;
                    }
                    return;
                }
                super.mo36535t(bindableViewHolder, i, list);
                return;
            }
            return;
        }
        super.mo36535t(bindableViewHolder, i, list);
    }

    /* renamed from: f */
    public int mo29834f() {
        return m20255U() ? super.mo29834f() : super.mo29834f() + 1;
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        if (m20255U() || i != m20250Z()) {
            if (((InterfaceC6661b) m22155D(i)) instanceof ShoppingListCategory) {
                return -2;
            }
            return i;
        }
        return -1;
    }

    /* renamed from: j0 */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == -2) {
            AbstractC11768fe m4304Q = AbstractC11768fe.m4304Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4304Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C6721b(m4304Q);
        } else if (i != -1) {
            AbstractC11734de m4400Q = AbstractC11734de.m4400Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m4400Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C6724e(m4400Q);
        } else {
            AbstractC12140zd m3566Q = AbstractC12140zd.m3566Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3566Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C6723d(m3566Q);
        }
    }

    /* renamed from: k0 */
    public final void m20237k0(List list) {
        Intrinsics.isThisObjectNull(list, "value");
        this.f18066p = list;
        m36541l(m20250Z());
    }

    /* renamed from: l0 */
    public final void m20236l0(int i) {
        this.f18069s = i;
        int i2 = 0;
        this.f18067q = false;
        int mo29834f = mo29834f();
        if (mo29834f < 0) {
            return;
        }
        while (true) {
            m36540m(i2, Integer.valueOf(this.f18069s));
            if (i2 == mo29834f) {
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m0 */
    public void m20235m0(boolean z) {
        this.f18063m = z;
    }

    /* renamed from: n0 */
    public final void m20234n0(boolean z) {
        this.f18072v = z;
    }

    /* renamed from: o0 */
    public final void m20233o0(boolean z) {
        this.f18068r = z;
        this.f18067q = true;
        m36542k();
    }

    /* renamed from: p0 */
    public final void m20232p0(boolean z) {
        this.f18070t = z;
    }

    /* renamed from: q0 */
    public final void m20231q0(boolean z) {
        this.f18067q = z;
    }

    /* renamed from: r0 */
    public final void m20230r0(Drawable drawable) {
        this.f18071u = drawable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s0 */
    public void m20228s0(int i) {
        this.f18062l = i;
    }

    /* renamed from: t0 */
    public final void m20226t0(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        this.f18065o = str;
        m36541l(m20250Z());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListAdapter(InterfaceC10524i0 interfaceC10524i0, boolean z, List list, int i, InterfaceC6113q interfaceC6113q) {
        super(C6720a.f18073w);
        Intrinsics.isThisObjectNull(interfaceC10524i0, "lifecycleScope");
        Intrinsics.isThisObjectNull(list, "users");
        this.f18055e = interfaceC10524i0;
        this.f18056f = interfaceC6113q;
        this.f18057g = 250L;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        this.f18058h = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(new DecelerateInterpolator());
        alphaAnimation2.setFillAfter(true);
        this.f18059i = alphaAnimation2;
        this.f18060j = new LinkedHashMap();
        this.f18061k = new LinkedHashMap();
        this.f18062l = 5;
        this.f18064n = interfaceC6113q == null;
        this.f18065o = BuildConfig.VERSION_NAME;
        this.f18066p = list;
        this.f18067q = true;
        this.f18068r = z;
        this.f18069s = i;
    }
}
