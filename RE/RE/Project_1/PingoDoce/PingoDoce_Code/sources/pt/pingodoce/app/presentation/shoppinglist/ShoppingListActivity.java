package pt.pingodoce.app.presentation.shoppinglist;

import ai.AbstractC0151j;
import ai.SpeechRecognizerBehavior;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Location;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.app.ActivityC0325c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.databinding.C1275f;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1474q;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.RecyclerView;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import be.UtilsExtensions;
import bi.C1924a;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.keyboardevents.C2354b;
import com.github.guilhe.keyboardevents.C2355c;
import com.github.guilhe.keyboardevents.EnumC2353a;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import ee.MarginItemDecoration;
import fj.SearchActivity;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import il.PurchaseListActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import je.RecyclerViewItemTouchHelper;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import md.C7182a;
import md.InterfaceC7183c;
import md.ObservableProperty;
import me.InterfaceC7186c;
import mg.StoreManager;
import ml.ShoppingListsActivity;
import ne.EventObserver;
import nl.SharedWithActivity;
import p039c3.C2046o;
import p047ce.FluidContentResizer;
import p050d.C4519c;
import p079e8.InterfaceC5018e;
import p106fe.CommonUtils;
import p106fe.IntentUtils;
import p181jd.AbstractC6438m;
import p181jd.C6440o;
import p181jd.C6445u;
import p181jd.C6449y;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p207kl.ShoppingListAdapter;
import p207kl.ShoppingListItemPlaceHolderAdapter;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p227ll.ManualSortShoppingListActivity;
import p276og.Result;
import p314qd.InterfaceC9717b;
import p314qd.InterfaceC9724h;
import p336rc.InterfaceC9849a;
import p336rc.InterfaceC9850b;
import p336rc.Spotlight;
import p336rc.Target;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p389ui.LoyaltyCardActivity;
import p391ul.TakeAwayOrderDetailActivity;
import p400v7.C11131c;
import p426wg.AbstractC11734de;
import p426wg.AbstractC11759f5;
import p426wg.AbstractC11829j3;
import p426wg.AbstractC11832j6;
import p426wg.AbstractC11946p5;
import p426wg.AbstractC11948p7;
import p426wg.AbstractC11988r7;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import p494zh.C13838g2;
import p494zh.C13843h2;
import p494zh.C13885o2;
import p494zh.C13899s0;
import p494zh.C13920x1;
import pe.C8614a;
import pt.pingodoce.app.data.local.models.shoppinglist.LiteralProduct;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListCategory;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.data.remote.models.response.Store;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;
import sb.C10143a;
import sb.C10144b;
import sc.RippleEffect;
import tc.Circle;
import tc.RoundedRectangle;
import td.C10565r0;
import td.InterfaceC10524i0;

/* compiled from: ShoppingListActivity.kt */
/* loaded from: classes2.dex */
public final class ShoppingListActivity extends BaseActivity implements SpeechRecognizerBehavior {

    /* renamed from: L0 */
    static final /* synthetic */ InterfaceC9724h[] f24635L0 = {C6450z.m20904d(new C6440o(ShoppingListActivity.class, "isTutorialShowing", "isTutorialShowing()Lkotlin/Pair;", 0)), C6450z.m20904d(new C6440o(ShoppingListActivity.class, "isInEditMode", "isInEditMode()Z", 0))};

    /* renamed from: A0 */
    private final InterfaceC13178g f24636A0;

    /* renamed from: B0 */
    private final AbstractC0304b f24637B0;

    /* renamed from: C0 */
    private final AbstractC0304b f24638C0;

    /* renamed from: D0 */
    private final AbstractC0304b f24639D0;

    /* renamed from: E0 */
    private final AbstractC0304b f24640E0;

    /* renamed from: F0 */
    private final AbstractC0304b f24641F0;

    /* renamed from: G0 */
    private final AbstractC0304b f24642G0;

    /* renamed from: H0 */
    private boolean f24643H0;

    /* renamed from: I0 */
    private final InterfaceC13178g f24644I0;

    /* renamed from: J0 */
    private final InterfaceC13178g f24645J0;

    /* renamed from: K0 */
    private final InterfaceC13178g f24646K0;

    /* renamed from: f0 */
    public StoreManager f24647f0;

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24648g0;

    /* renamed from: h0 */
    private Bundle f24649h0;

    /* renamed from: i0 */
    private boolean f24650i0;

    /* renamed from: j0 */
    private boolean f24651j0;

    /* renamed from: k0 */
    private boolean f24652k0;

    /* renamed from: l0 */
    private boolean f24653l0;

    /* renamed from: n0 */
    private boolean f24655n0;

    /* renamed from: r0 */
    private ShoppingListAdapter f24659r0;

    /* renamed from: t0 */
    private final InterfaceC7183c f24661t0;

    /* renamed from: u0 */
    private final InterfaceC7183c f24662u0;

    /* renamed from: v0 */
    private final InterfaceC13178g f24663v0;

    /* renamed from: w0 */
    private final InterfaceC13178g f24664w0;

    /* renamed from: x0 */
    private LatLng f24665x0;

    /* renamed from: y0 */
    private final InterfaceC6108l f24666y0;

    /* renamed from: z0 */
    private final InterfaceC13178g f24667z0;

    /* renamed from: m0 */
    private int f24654m0 = -1;

    /* renamed from: o0 */
    private boolean f24656o0 = true;

    /* renamed from: p0 */
    private boolean f24657p0 = true;

    /* renamed from: q0 */
    private ShoppingListViewModel.EnumC9455e f24658q0 = ShoppingListViewModel.EnumC9455e.MANUAL;

    /* renamed from: s0 */
    private final C1618k f24660s0 = new C1618k(new RecyclerViewItemTouchHelper(0, 0, new C9433v(), null, 11, null));

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9377a {
        private C9377a() {
        }

        public /* synthetic */ C9377a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$a0 */
    /* loaded from: classes2.dex */
    public static final class C9378a0 extends AbstractC6438m implements InterfaceC6097a {
        C9378a0() {
            super(0);
        }

        /* renamed from: a */
        public final void m11256a() {
            ShoppingListActivity.m11305m2(ShoppingListActivity.this, false);
            ShoppingListActivity.m11326f2(ShoppingListActivity.this, false);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m11256a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$a1 */
    /* loaded from: classes2.dex */
    static final class C9379a1 extends AbstractC6438m implements InterfaceC6097a {
        C9379a1() {
            super(0);
        }

        /* renamed from: a */
        public final DialogC3502a mo42214q() {
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            return shoppingListActivity.m11348V2(shoppingListActivity);
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$b */
    /* loaded from: classes2.dex */
    private enum EnumC9380b {
        EDIT_MODE,
        STORE_MODE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$setupRecyclerView$8$1$1", m20196f = "ShoppingListActivity.kt", m20195l = {707}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$b0 */
    /* loaded from: classes2.dex */
    public static final class C9381b0 extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24670x;

        /* renamed from: y */
        final /* synthetic */ EditText f24671y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9381b0(EditText editText, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24671y = editText;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9381b0(this.f24671y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9381b0) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24670x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f24670x = 1;
                if (C10565r0.m7677a(50L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            this.f24671y.requestFocus();
            EditText editText = this.f24671y;
            CharSequence text = editText.getText();
            if (text == null) {
                text = BuildConfig.VERSION_NAME;
            }
            editText.setSelection(text.length());
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9382c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24672a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f24673b;

        static {
            int[] iArr = new int[EnumC9380b.values().length];
            iArr[EnumC9380b.EDIT_MODE.ordinal()] = 1;
            iArr[EnumC9380b.STORE_MODE.ordinal()] = 2;
            f24672a = iArr;
            int[] iArr2 = new int[ShoppingListViewModel.EnumC9452b.values().length];
            iArr2[ShoppingListViewModel.EnumC9452b.VOICE.ordinal()] = 1;
            iArr2[ShoppingListViewModel.EnumC9452b.EAN13.ordinal()] = 2;
            f24673b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$setupRecyclerView$9", m20196f = "ShoppingListActivity.kt", m20195l = {717}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$c0 */
    /* loaded from: classes2.dex */
    public static final class C9383c0 extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24674x;

        /* renamed from: y */
        final /* synthetic */ ShoppingListViewModel f24675y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9383c0(ShoppingListViewModel shoppingListViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24675y = shoppingListViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9383c0(this.f24675y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9383c0) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24674x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel shoppingListViewModel = this.f24675y;
                this.f24674x = 1;
                if (ShoppingListViewModel.m11129e2(shoppingListViewModel, false, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9384d implements Animator.AnimatorListener {

        /* renamed from: b */
        final /* synthetic */ boolean f24677b;

        /* renamed from: c */
        final /* synthetic */ int f24678c;

        C9384d(boolean z, int i) {
            this.f24677b = z;
            this.f24678c = i;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            TextView textView = ShoppingListActivity.m11366N1(ShoppingListActivity.this).f30658X;
            boolean z = this.f24677b;
            int i = this.f24678c;
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            Intrinsics.checkIfNull(textView, BuildConfig.VERSION_NAME);
            textView.setCompoundDrawablesWithIntrinsicBounds(C0928a.m39111f(C10841b.m6897b(textView).m6899a(), z ? C2336R.C2337drawable.ic_edit : C2336R.C2337drawable.ic_shopping_cart), (Drawable) null, (Drawable) null, (Drawable) null);
            ResourcesProvider m6897b = C10841b.m6897b(textView);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6897b.m6899a(), i).getTheme().resolveAttribute(C2336R.attr.colorOnPrimary, typedValue, true);
            textView.setTextColor(C0928a.m39113d(m6897b.m6899a(), typedValue.resourceId));
            Drawable drawable = textView.getCompoundDrawables()[0];
            ResourcesProvider m6897b2 = C10841b.m6897b(textView);
            TypedValue typedValue2 = new TypedValue();
            new ContextThemeWrapper(m6897b2.m6899a(), i).getTheme().resolveAttribute(C2336R.attr.viewsIconTint, typedValue2, true);
            drawable.setTint(C0928a.m39113d(m6897b2.m6899a(), typedValue2.resourceId));
            textView.setText(shoppingListActivity.getString(z ? C2336R.string.lbl_shopping_list_edit_mode : C2336R.string.lbl_shopping_list_store_mode));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: View.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$d0 */
    /* loaded from: classes2.dex */
    public static final class View$OnLayoutChangeListenerC9385d0 implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC11829j3 f24679a;

        /* renamed from: b */
        final /* synthetic */ ShoppingListActivity f24680b;

        /* renamed from: c */
        final /* synthetic */ AbstractC11734de f24681c;

        /* renamed from: d */
        final /* synthetic */ C6445u f24682d;

        /* renamed from: e */
        final /* synthetic */ C6449y f24683e;

        public View$OnLayoutChangeListenerC9385d0(AbstractC11829j3 abstractC11829j3, ShoppingListActivity shoppingListActivity, AbstractC11734de abstractC11734de, C6445u c6445u, C6449y c6449y) {
            this.f24679a = abstractC11829j3;
            this.f24680b = shoppingListActivity;
            this.f24681c = abstractC11734de;
            this.f24682d = c6445u;
            this.f24683e = c6449y;
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [rc.c, T] */
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Spotlight spotlight;
            Intrinsics.isThisObjectNull(view, "view");
            view.removeOnLayoutChangeListener(this);
            C6445u c6445u = new C6445u();
            Target.C9864a c9864a = new Target.C9864a();
            ConstraintLayout constraintLayout = this.f24679a.f30650P;
            Intrinsics.checkIfNull(constraintLayout, "binding.modeToggleConstraintLayout");
            Target.C9864a m9783h = c9864a.m9787d(constraintLayout).m9783h(new RoundedRectangle(this.f24679a.f30642H.getHeight(), this.f24679a.f30642H.getWidth(), 100.0f, 0L, null, 24, null));
            ResourcesProvider m6898a = C10841b.m6898a(this.f24680b);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            Target.C9864a m9785f = m9783h.m9786e(new RippleEffect(0.0f, 200.0f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9418p0(this.f24682d));
            AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p7.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_toggle));
            abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC9421q0(this.f24682d, this.f24683e));
            C13195u c13195u = C13195u.f34156a;
            View m37802s = abstractC11948p7.m37802s();
            Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a = m9785f.m9784g(m37802s).m9790a();
            Target.C9864a c9864a2 = new Target.C9864a();
            ImageButton imageButton = this.f24681c.f30137A;
            Intrinsics.checkIfNull(imageButton, "rowBinding.btnSearchImageButton");
            Target.C9864a m9783h2 = c9864a2.m9787d(imageButton).m9783h(new Circle(100.0f, 0L, null, 6, null));
            ResourcesProvider m6898a2 = C10841b.m6898a(this.f24680b);
            TypedValue typedValue2 = new TypedValue();
            new ContextThemeWrapper(m6898a2.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue2, true);
            Target.C9864a m9785f2 = m9783h2.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9413n0(this.f24682d));
            AbstractC11948p7 abstractC11948p72 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p72.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_1));
            abstractC11948p72.f31211x.setOnClickListener(new View$OnClickListenerC9416o0(this.f24682d, this.f24683e));
            View m37802s2 = abstractC11948p72.m37802s();
            Intrinsics.checkIfNull(m37802s2, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a2 = m9785f2.m9784g(m37802s2).m9790a();
            Target.C9864a c9864a3 = new Target.C9864a();
            TextView textView = this.f24681c.f30146J;
            Intrinsics.checkIfNull(textView, "rowBinding.quantityTextView");
            Target.C9864a m9783h3 = c9864a3.m9787d(textView).m9783h(new RoundedRectangle(this.f24681c.m37802s().getHeight(), this.f24681c.m37802s().getWidth(), 100.0f, 0L, null, 24, null));
            ResourcesProvider m6898a3 = C10841b.m6898a(this.f24680b);
            TypedValue typedValue3 = new TypedValue();
            new ContextThemeWrapper(m6898a3.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue3, true);
            Target.C9864a m9785f3 = m9783h3.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a3.m6899a(), typedValue3.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9408l0(c6445u, this.f24680b, this.f24681c));
            AbstractC11948p7 abstractC11948p73 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p73.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_2));
            abstractC11948p73.f31211x.setOnClickListener(new View$OnClickListenerC9411m0(this.f24682d, this.f24681c));
            QuantityPickerView quantityPickerView = this.f24681c.f30145I;
            Intrinsics.checkIfNull(quantityPickerView, "rowBinding.quantityQuantityPickerView");
            quantityPickerView.setActionListener(new C9423r0(this.f24681c, this.f24682d, this.f24683e));
            View m37802s3 = abstractC11948p73.m37802s();
            Intrinsics.checkIfNull(m37802s3, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a3 = m9785f3.m9784g(m37802s3).m9790a();
            float m35167e = UtilsExtensions.m35167e(90);
            Target.C9864a m9783h4 = new Target.C9864a().m9789b(m9790a2.m9795a().x - UtilsExtensions.m35167e(25), m9790a2.m9795a().y).m9783h(new Circle(100.0f, 0L, null, 6, null));
            ResourcesProvider m6898a4 = C10841b.m6898a(this.f24680b);
            TypedValue typedValue4 = new TypedValue();
            new ContextThemeWrapper(m6898a4.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue4, true);
            Target.C9864a m9785f4 = m9783h4.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a4.m6899a(), typedValue4.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9394h0(c6445u, this.f24680b, m35167e, this.f24681c, this.f24682d));
            AbstractC11948p7 abstractC11948p74 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p74.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_3));
            abstractC11948p74.f31211x.setOnClickListener(new View$OnClickListenerC9399i0(this.f24682d, m35167e, this.f24681c, this.f24683e));
            View m37802s4 = abstractC11948p74.m37802s();
            Intrinsics.checkIfNull(m37802s4, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a4 = m9785f4.m9784g(m37802s4).m9790a();
            Target.C9864a c9864a4 = new Target.C9864a();
            View m37802s5 = this.f24679a.f30659Y.m37802s();
            Intrinsics.checkIfNull(m37802s5, "binding.tutorialRowInclude.root");
            Target.C9864a m9783h5 = c9864a4.m9787d(m37802s5).m9783h(new RoundedRectangle(this.f24681c.m37802s().getHeight(), this.f24681c.m37802s().getWidth(), 0.0f, 0L, null, 24, null));
            ResourcesProvider m6898a5 = C10841b.m6898a(this.f24680b);
            TypedValue typedValue5 = new TypedValue();
            new ContextThemeWrapper(m6898a5.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue5, true);
            Target.C9864a m9785f5 = m9783h5.m9786e(new RippleEffect(0.0f, 200.0f, C0928a.m39113d(m6898a5.m6899a(), typedValue5.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9403j0(this.f24682d));
            AbstractC11948p7 abstractC11948p75 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p75.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_4));
            abstractC11948p75.f31211x.setText(this.f24680b.getString(C2336R.string.btn_ok_alt));
            abstractC11948p75.f31211x.setOnClickListener(new View$OnClickListenerC9406k0(this.f24682d, this.f24683e));
            View m37802s6 = abstractC11948p75.m37802s();
            Intrinsics.checkIfNull(m37802s6, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a5 = m9785f5.m9784g(m37802s6).m9790a();
            Target.C9864a m9783h6 = new Target.C9864a().m9785f(new C9389f0(this.f24682d)).m9783h(new Circle(0.0f, 0L, null, 6, null));
            AbstractC11948p7 abstractC11948p76 = (AbstractC11948p7) C1275f.m37764e(this.f24680b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p76.f31212y.setText(this.f24680b.getString(C2336R.string.lbl_shopping_list_coachmark_buy_online));
            abstractC11948p76.f31211x.setText(this.f24680b.getString(C2336R.string.btn_ok_alt));
            abstractC11948p76.f31211x.setOnClickListener(new View$OnClickListenerC9392g0(this.f24682d, this.f24683e));
            View m37802s7 = abstractC11948p76.m37802s();
            Intrinsics.checkIfNull(m37802s7, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a6 = m9783h6.m9784g(m37802s7).m9790a();
            Activity activity = (Activity) new WeakReference(this.f24680b).get();
            if (activity != null) {
                C6449y c6449y = this.f24683e;
                Intrinsics.checkIfNull(activity, "it");
                Spotlight.C9851a m9804h = new Spotlight.C9851a(activity).m9804h(m9790a, m9790a2, m9790a3, m9790a4, m9790a5, m9790a6);
                ResourcesProvider m6898a6 = C10841b.m6898a(this.f24680b);
                TypedValue typedValue6 = new TypedValue();
                new ContextThemeWrapper(m6898a6.m6899a(), 2131951658).getTheme().resolveAttribute(C2336R.attr.overlayColor, typedValue6, true);
                c6449y.f17533w = m9804h.m9809c(typedValue6.resourceId).m9807e(500L).m9810b(new DecelerateInterpolator(2.0f)).m9808d((ViewGroup) this.f24679a.m37802s()).m9806f(new C9387e0(this.f24681c, this.f24679a)).m9811a();
                T t = this.f24683e.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9813m();
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$e */
    /* loaded from: classes2.dex */
    static final class C9386e extends AbstractC6438m implements InterfaceC6097a {
        C9386e() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC11759f5 mo42214q() {
            AbstractC11759f5 m4310Q = AbstractC11759f5.m4310Q(ShoppingListActivity.this.getLayoutInflater());
            Intrinsics.checkIfNull(m4310Q, "inflate(\n            layoutInflater\n        )");
            return m4310Q;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$e0 */
    /* loaded from: classes2.dex */
    public static final class C9387e0 implements InterfaceC9849a {

        /* renamed from: b */
        final /* synthetic */ AbstractC11734de f24686b;

        /* renamed from: c */
        final /* synthetic */ AbstractC11829j3 f24687c;

        C9387e0(AbstractC11734de abstractC11734de, AbstractC11829j3 abstractC11829j3) {
            this.f24686b = abstractC11734de;
            this.f24687c = abstractC11829j3;
        }

        /* renamed from: a */
        public void mo9829a() {
            this.f24686b.m37802s().setVisibility(8);
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            ShoppingListActivity.m11298o2(shoppingListActivity, ShoppingListActivity.m11341Z1(shoppingListActivity), this.f24687c);
            ShoppingListActivity.m11301n2(ShoppingListActivity.this, new C13182l(EnumC9380b.EDIT_MODE, Boolean.FALSE));
        }

        /* renamed from: b */
        public void mo9828b() {
            ShoppingListActivity.m11301n2(ShoppingListActivity.this, new C13182l(EnumC9380b.EDIT_MODE, Boolean.TRUE));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$f */
    /* loaded from: classes2.dex */
    static final class C9388f extends AbstractC6438m implements InterfaceC6097a {
        C9388f() {
            super(0);
        }

        /* renamed from: a */
        public final DialogC3502a mo42214q() {
            DialogC3502a dialogC3502a = new DialogC3502a(ShoppingListActivity.this);
            dialogC3502a.setContentView(ShoppingListActivity.m11368M1(ShoppingListActivity.this).m37802s());
            return dialogC3502a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$f0 */
    /* loaded from: classes2.dex */
    public static final class C9389f0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24690b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$buyNowTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {1097}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$f0$a */
        /* loaded from: classes2.dex */
        static final class C9390a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24691x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24692y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9390a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24692y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9390a(this.f24692y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9390a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24691x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24691x = 1;
                    if (C10565r0.m7677a(500L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24692y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9389f0(C6445u c6445u) {
            this.f24690b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9390a(this.f24690b, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$g */
    /* loaded from: classes2.dex */
    static final class C9391g extends AbstractC6438m implements InterfaceC6097a {
        C9391g() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC11946p5 mo42214q() {
            AbstractC11946p5 m3904Q = AbstractC11946p5.m3904Q(ShoppingListActivity.this.getLayoutInflater());
            Intrinsics.checkIfNull(m3904Q, "inflate(\n            layoutInflater\n        )");
            return m3904Q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$g0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9392g0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24694w;

        /* renamed from: x */
        final /* synthetic */ C6449y f24695x;

        View$OnClickListenerC9392g0(C6445u c6445u, C6449y c6449y) {
            this.f24694w = c6445u;
            this.f24695x = c6449y;
        }

        public final void onClick(View view) {
            Spotlight spotlight;
            C6445u c6445u = this.f24694w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                T t = this.f24695x.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$h */
    /* loaded from: classes2.dex */
    static final class C9393h extends AbstractC6438m implements InterfaceC6097a {
        C9393h() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m11248a(ShoppingListActivity shoppingListActivity, DialogC3502a dialogC3502a, View view) {
            m11244e(shoppingListActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m11247b(DialogC3502a dialogC3502a, View view) {
            m11245d(dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m11245d(DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m11244e(ShoppingListActivity shoppingListActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            ShoppingListActivity.m11341Z1(shoppingListActivity).m11175P0();
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(ShoppingListActivity.this);
            final ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            dialogC3502a.setContentView(ShoppingListActivity.m11364O1(shoppingListActivity).m37802s());
            dialogC3502a.setCancelable(false);
            ShoppingListActivity.m11364O1(shoppingListActivity).f31206x.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.shoppinglist.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShoppingListActivity.C9393h.m11245d(DialogC3502a.this, view);
                }
            });
            ShoppingListActivity.m11364O1(shoppingListActivity).f31207y.setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.shoppinglist.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ShoppingListActivity.C9393h.m11244e(ShoppingListActivity.this, dialogC3502a, view);
                }
            });
            shoppingListActivity.m11327f();
            return dialogC3502a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$h0 */
    /* loaded from: classes2.dex */
    public static final class C9394h0 implements InterfaceC9850b {

        /* renamed from: a */
        final /* synthetic */ C6445u f24697a;

        /* renamed from: b */
        final /* synthetic */ ShoppingListActivity f24698b;

        /* renamed from: c */
        final /* synthetic */ float f24699c;

        /* renamed from: d */
        final /* synthetic */ AbstractC11734de f24700d;

        /* renamed from: e */
        final /* synthetic */ C6445u f24701e;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$deleteTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {970}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$h0$a */
        /* loaded from: classes2.dex */
        static final class C9395a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ C6445u f24702A;

            /* renamed from: x */
            int f24703x;

            /* renamed from: y */
            final /* synthetic */ float f24704y;

            /* renamed from: z */
            final /* synthetic */ AbstractC11734de f24705z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ShoppingListActivity.kt */
            /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$h0$a$a */
            /* loaded from: classes2.dex */
            public static final class C9396a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                final /* synthetic */ AbstractC11734de f24706a;

                C9396a(AbstractC11734de abstractC11734de) {
                    this.f24706a = abstractC11734de;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Intrinsics.isThisObjectNull(valueAnimator, "animation");
                    ConstraintLayout constraintLayout = this.f24706a.f30140D;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    constraintLayout.setTranslationX(-((Float) animatedValue).floatValue());
                    ImageView imageView = this.f24706a.f30154x;
                    Object animatedValue2 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    imageView.setTranslationX((-((Float) animatedValue2).floatValue()) / 7);
                }
            }

            /* compiled from: ShoppingListActivity.kt */
            /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$h0$a$b */
            /* loaded from: classes2.dex */
            public static final class C9397b implements Animator.AnimatorListener {

                /* renamed from: a */
                final /* synthetic */ C6445u f24707a;

                C9397b(C6445u c6445u) {
                    this.f24707a = c6445u;
                }

                public void onAnimationCancel(Animator animator) {
                    Intrinsics.isThisObjectNull(animator, "animation");
                }

                public void onAnimationEnd(Animator animator) {
                    Intrinsics.isThisObjectNull(animator, "animation");
                    this.f24707a.f17529w = true;
                }

                public void onAnimationRepeat(Animator animator) {
                    Intrinsics.isThisObjectNull(animator, "animation");
                }

                public void onAnimationStart(Animator animator) {
                    Intrinsics.isThisObjectNull(animator, "animation");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9395a(float f, AbstractC11734de abstractC11734de, C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24704y = f;
                this.f24705z = abstractC11734de;
                this.f24702A = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9395a(this.f24704y, this.f24705z, this.f24702A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9395a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24703x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24703x = 1;
                    if (C10565r0.m7677a(500L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                ValueAnimator m24301a = CommonUtils.f15361a.m24301a(0.0f, this.f24704y, 500L);
                AbstractC11734de abstractC11734de = this.f24705z;
                C6445u c6445u = this.f24702A;
                m24301a.addUpdateListener(new C9396a(abstractC11734de));
                m24301a.addListener(new C9397b(c6445u));
                m24301a.start();
                return C13195u.f34156a;
            }
        }

        C9394h0(C6445u c6445u, ShoppingListActivity shoppingListActivity, float f, AbstractC11734de abstractC11734de, C6445u c6445u2) {
            this.f24697a = c6445u;
            this.f24698b = shoppingListActivity;
            this.f24699c = f;
            this.f24700d = abstractC11734de;
            this.f24701e = c6445u2;
        }

        /* renamed from: a */
        public void mo9827a() {
            this.f24697a.f17529w = false;
        }

        /* renamed from: b */
        public void mo9826b() {
            C6445u c6445u = this.f24697a;
            if (c6445u.f17529w) {
                return;
            }
            c6445u.f17529w = true;
            LifecycleOwner.m36965a(this.f24698b).m36984i(new C9395a(this.f24699c, this.f24700d, this.f24701e, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$i */
    /* loaded from: classes2.dex */
    static final class C9398i extends AbstractC6438m implements InterfaceC6108l {
        C9398i() {
            super(1);
        }

        /* renamed from: a */
        public final void m11242a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            ShoppingListActivity.m11341Z1(ShoppingListActivity.this).m11157V0(ShoppingListActivity.m11343Y1(ShoppingListActivity.this));
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11242a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$i0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9399i0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24709w;

        /* renamed from: x */
        final /* synthetic */ float f24710x;

        /* renamed from: y */
        final /* synthetic */ AbstractC11734de f24711y;

        /* renamed from: z */
        final /* synthetic */ C6449y f24712z;

        /* compiled from: ShoppingListActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$i0$a */
        /* loaded from: classes2.dex */
        static final class C9400a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC11734de f24713a;

            C9400a(AbstractC11734de abstractC11734de) {
                this.f24713a = abstractC11734de;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Intrinsics.isThisObjectNull(valueAnimator, "animation");
                ConstraintLayout constraintLayout = this.f24713a.f30140D;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                constraintLayout.setTranslationX(-((Float) animatedValue).floatValue());
                ImageView imageView = this.f24713a.f30154x;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                imageView.setTranslationX((-((Float) animatedValue2).floatValue()) / 7);
            }
        }

        /* compiled from: ShoppingListActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$i0$b */
        /* loaded from: classes2.dex */
        public static final class C9401b implements Animator.AnimatorListener {

            /* renamed from: a */
            final /* synthetic */ C6449y f24714a;

            C9401b(C6449y c6449y) {
                this.f24714a = c6449y;
            }

            public void onAnimationCancel(Animator animator) {
                Intrinsics.isThisObjectNull(animator, "animation");
            }

            public void onAnimationEnd(Animator animator) {
                Spotlight spotlight;
                Intrinsics.isThisObjectNull(animator, "animation");
                T t = this.f24714a.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
            }

            public void onAnimationRepeat(Animator animator) {
                Intrinsics.isThisObjectNull(animator, "animation");
            }

            public void onAnimationStart(Animator animator) {
                Intrinsics.isThisObjectNull(animator, "animation");
            }
        }

        View$OnClickListenerC9399i0(C6445u c6445u, float f, AbstractC11734de abstractC11734de, C6449y c6449y) {
            this.f24709w = c6445u;
            this.f24710x = f;
            this.f24711y = abstractC11734de;
            this.f24712z = c6449y;
        }

        public final void onClick(View view) {
            C6445u c6445u = this.f24709w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                ValueAnimator m24301a = CommonUtils.f15361a.m24301a(this.f24710x, 0.0f, 500L);
                AbstractC11734de abstractC11734de = this.f24711y;
                C6449y c6449y = this.f24712z;
                m24301a.addUpdateListener(new C9400a(abstractC11734de));
                m24301a.addListener(new C9401b(c6449y));
                m24301a.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$getToolbarMenuItemClickListener$1$1", m20196f = "ShoppingListActivity.kt", m20195l = {136}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$j */
    /* loaded from: classes2.dex */
    public static final class C9402j extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24715x;

        C9402j(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9402j(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9402j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24715x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListViewModel m11341Z1 = ShoppingListActivity.m11341Z1(ShoppingListActivity.this);
                this.f24715x = 1;
                if (ShoppingListViewModel.m11129e2(m11341Z1, false, this, 1, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$j0 */
    /* loaded from: classes2.dex */
    public static final class C9403j0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24718b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$editTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {1065}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$j0$a */
        /* loaded from: classes2.dex */
        static final class C9404a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24719x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24720y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9404a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24720y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9404a(this.f24720y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9404a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24719x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24719x = 1;
                    if (C10565r0.m7677a(500L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24720y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9403j0(C6445u c6445u) {
            this.f24718b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9404a(this.f24718b, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$k */
    /* loaded from: classes2.dex */
    public static final class C9405k implements UiWidgets.InterfaceC7044a {
        C9405k() {
        }

        /* renamed from: a */
        public void m11239a(boolean z) {
            if (z) {
                ShoppingListActivity.m11341Z1(ShoppingListActivity.this).m11172Q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$k0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9406k0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24722w;

        /* renamed from: x */
        final /* synthetic */ C6449y f24723x;

        View$OnClickListenerC9406k0(C6445u c6445u, C6449y c6449y) {
            this.f24722w = c6445u;
            this.f24723x = c6449y;
        }

        public final void onClick(View view) {
            Spotlight spotlight;
            C6445u c6445u = this.f24722w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                T t = this.f24723x.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$l */
    /* loaded from: classes2.dex */
    public static final class C9407l implements UiWidgets.InterfaceC7044a {
        C9407l() {
        }

        /* renamed from: a */
        public void m11238a(boolean z) {
            if (z) {
                ShoppingListActivity.m11305m2(ShoppingListActivity.this, true);
                ShoppingListActivity.m11341Z1(ShoppingListActivity.this).m11163T0();
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$l0 */
    /* loaded from: classes2.dex */
    public static final class C9408l0 implements InterfaceC9850b {

        /* renamed from: a */
        final /* synthetic */ C6445u f24725a;

        /* renamed from: b */
        final /* synthetic */ ShoppingListActivity f24726b;

        /* renamed from: c */
        final /* synthetic */ AbstractC11734de f24727c;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$quantityTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {907}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$l0$a */
        /* loaded from: classes2.dex */
        static final class C9409a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24728x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11734de f24729y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9409a(AbstractC11734de abstractC11734de, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24729y = abstractC11734de;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9409a(this.f24729y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9409a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24728x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24728x = 1;
                    if (C10565r0.m7677a(500L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24729y.f30146J.setVisibility(4);
                this.f24729y.f30144H.setVisibility(4);
                this.f24729y.f30145I.setVisibility(0);
                QuantityPickerView quantityPickerView = this.f24729y.f30145I;
                Intrinsics.checkIfNull(quantityPickerView, "rowBinding.quantityQuantityPickerView");
                QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
                return C13195u.f34156a;
            }
        }

        C9408l0(C6445u c6445u, ShoppingListActivity shoppingListActivity, AbstractC11734de abstractC11734de) {
            this.f24725a = c6445u;
            this.f24726b = shoppingListActivity;
            this.f24727c = abstractC11734de;
        }

        /* renamed from: a */
        public void mo9827a() {
            this.f24725a.f17529w = false;
        }

        /* renamed from: b */
        public void mo9826b() {
            C6445u c6445u = this.f24725a;
            if (c6445u.f17529w) {
                return;
            }
            c6445u.f17529w = true;
            LifecycleOwner.m36965a(this.f24726b).m36984i(new C9409a(this.f24727c, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$m */
    /* loaded from: classes2.dex */
    static final class C9410m extends AbstractC6438m implements InterfaceC6097a {
        C9410m() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ShoppingListActivity.this.m11381G2(), ShoppingListActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$m0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9411m0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24731w;

        /* renamed from: x */
        final /* synthetic */ AbstractC11734de f24732x;

        View$OnClickListenerC9411m0(C6445u c6445u, AbstractC11734de abstractC11734de) {
            this.f24731w = c6445u;
            this.f24732x = abstractC11734de;
        }

        public final void onClick(View view) {
            C6445u c6445u = this.f24731w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                QuantityPickerView quantityPickerView = this.f24732x.f30145I;
                Intrinsics.checkIfNull(quantityPickerView, "rowBinding.quantityQuantityPickerView");
                QuantityPickerView.m33790w(quantityPickerView, 0L, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$initViews$11", m20196f = "ShoppingListActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$n */
    /* loaded from: classes2.dex */
    public static final class C9412n extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC11829j3 f24733A;

        /* renamed from: x */
        int f24734x;

        /* renamed from: y */
        final /* synthetic */ ShoppingListViewModel f24735y;

        /* renamed from: z */
        final /* synthetic */ ShoppingListActivity f24736z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9412n(ShoppingListViewModel shoppingListViewModel, ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24735y = shoppingListViewModel;
            this.f24736z = shoppingListActivity;
            this.f24733A = abstractC11829j3;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9412n(this.f24735y, this.f24736z, this.f24733A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9412n) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24734x == 0) {
                C13186n.m1453b(obj);
                if (this.f24735y.m11205C1()) {
                    ShoppingListActivity.m11298o2(this.f24736z, this.f24735y, this.f24733A);
                } else {
                    ShoppingListActivity.m11291q2(this.f24736z, this.f24733A);
                }
                ShoppingListActivity.m11334c2(this.f24736z);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$n0 */
    /* loaded from: classes2.dex */
    public static final class C9413n0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24738b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$searchTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {856}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$n0$a */
        /* loaded from: classes2.dex */
        static final class C9414a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24739x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24740y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9414a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24740y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9414a(this.f24740y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9414a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24739x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24739x = 1;
                    if (C10565r0.m7677a(1000L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24740y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9413n0(C6445u c6445u) {
            this.f24738b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9414a(this.f24738b, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$o */
    /* loaded from: classes2.dex */
    public static final class C9415o implements AdapterView.OnItemSelectedListener {

        /* renamed from: x */
        final /* synthetic */ ShoppingListViewModel f24742x;

        C9415o(ShoppingListViewModel shoppingListViewModel) {
            this.f24742x = shoppingListViewModel;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (ShoppingListActivity.m11355S1(ShoppingListActivity.this)) {
                return;
            }
            ShoppingListActivity.m11309l2(ShoppingListActivity.this, true);
            ShoppingListActivity.m11305m2(ShoppingListActivity.this, true);
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            ShoppingListViewModel.EnumC9455e m11361P1 = ShoppingListActivity.m11361P1(shoppingListActivity);
            ShoppingListViewModel.EnumC9455e enumC9455e = ShoppingListViewModel.EnumC9455e.CATEGORY;
            ShoppingListActivity.m11312k2(shoppingListActivity, (m11361P1 != enumC9455e && i == enumC9455e.ordinal()) || (ShoppingListActivity.m11361P1(ShoppingListActivity.this) == enumC9455e && i != enumC9455e.ordinal()));
            ShoppingListViewModel shoppingListViewModel = this.f24742x;
            if (i == 0) {
                enumC9455e = ShoppingListViewModel.EnumC9455e.MANUAL;
                ShoppingListActivity.m11329e2(ShoppingListActivity.this, enumC9455e);
            } else if (i != 1) {
                ShoppingListActivity.m11329e2(ShoppingListActivity.this, enumC9455e);
            } else {
                enumC9455e = ShoppingListViewModel.EnumC9455e.PROMOTION;
                ShoppingListActivity.m11329e2(ShoppingListActivity.this, enumC9455e);
            }
            shoppingListViewModel.m11165S1(enumC9455e);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$o0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9416o0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24743w;

        /* renamed from: x */
        final /* synthetic */ C6449y f24744x;

        View$OnClickListenerC9416o0(C6445u c6445u, C6449y c6449y) {
            this.f24743w = c6445u;
            this.f24744x = c6449y;
        }

        public final void onClick(View view) {
            Spotlight spotlight;
            C6445u c6445u = this.f24743w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                T t = this.f24744x.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$p */
    /* loaded from: classes2.dex */
    public static final class C9417p extends AbstractC6438m implements InterfaceC6108l {
        C9417p() {
            super(1);
        }

        /* renamed from: a */
        public final void m11233a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13899s0) {
                if (ShoppingListActivity.m11370L1(ShoppingListActivity.this)) {
                    return;
                }
                LoyaltyCardActivity.m6783c(ShoppingListActivity.this, null, 1, null);
            } else if (interfaceC7186c instanceof C13843h2) {
                ManualSortShoppingListActivity.m19366a(ShoppingListActivity.m11349V1(ShoppingListActivity.this), ShoppingListActivity.this);
            } else if (interfaceC7186c instanceof C13920x1) {
                ShoppingListActivity.m11339a2(ShoppingListActivity.this);
            } else if (interfaceC7186c instanceof C13885o2) {
                TakeAwayOrderDetailActivity.m6701a(ShoppingListActivity.this, (TakeAwayOrder) c13182l.m1459d());
            } else if (interfaceC7186c instanceof C13838g2) {
                IntentUtils.m24293a(ShoppingListActivity.this, (String) c13182l.m1459d());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11233a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$p0 */
    /* loaded from: classes2.dex */
    public static final class C9418p0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24747b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForEditMode$1$toggleTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {814}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$p0$a */
        /* loaded from: classes2.dex */
        static final class C9419a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24748x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24749y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9419a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24749y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9419a(this.f24749y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9419a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24748x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24748x = 1;
                    if (C10565r0.m7677a(1000L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24749y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9418p0(C6445u c6445u) {
            this.f24747b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9419a(this.f24747b, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$initViews$6$1", m20196f = "ShoppingListActivity.kt", m20195l = {438}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$q */
    /* loaded from: classes2.dex */
    public static final class C9420q extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24750x;

        C9420q(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9420q(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9420q) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24750x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
                this.f24750x = 1;
                if (shoppingListActivity.m11340Z2(shoppingListActivity, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$q0 */
    /* loaded from: classes2.dex */
    public static final class View$OnClickListenerC9421q0 implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C6445u f24752w;

        /* renamed from: x */
        final /* synthetic */ C6449y f24753x;

        View$OnClickListenerC9421q0(C6445u c6445u, C6449y c6449y) {
            this.f24752w = c6445u;
            this.f24753x = c6449y;
        }

        public final void onClick(View view) {
            Spotlight spotlight;
            C6445u c6445u = this.f24752w;
            if (c6445u.f17529w) {
                c6445u.f17529w = false;
                T t = this.f24753x.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$initViews$6$2", m20196f = "ShoppingListActivity.kt", m20195l = {445}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$r */
    /* loaded from: classes2.dex */
    public static final class C9422r extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24754x;

        C9422r(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9422r(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9422r) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24754x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
                AbstractC0304b m11359Q1 = ShoppingListActivity.m11359Q1(shoppingListActivity);
                this.f24754x = 1;
                if (C1924a.m35138a(shoppingListActivity, m11359Q1, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* compiled from: QuantityPickerView.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$r0 */
    /* loaded from: classes2.dex */
    public static final class C9423r0 implements QuantityPickerView.InterfaceC2363b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11734de f24756a;

        /* renamed from: b */
        final /* synthetic */ C6445u f24757b;

        /* renamed from: c */
        final /* synthetic */ C6449y f24758c;

        public C9423r0(AbstractC11734de abstractC11734de, C6445u c6445u, C6449y c6449y) {
            this.f24756a = abstractC11734de;
            this.f24757b = c6445u;
            this.f24758c = c6449y;
        }

        /* renamed from: a */
        public void m11229a(boolean z) {
            Spotlight spotlight;
            if (!z) {
                this.f24756a.f30145I.setVisibility(4);
                this.f24756a.f30146J.setVisibility(0);
                this.f24756a.f30144H.setVisibility(0);
                this.f24757b.f17529w = false;
                T t = this.f24758c.f17533w;
                if (t == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) t;
                }
                spotlight.m9815k();
                return;
            }
            this.f24757b.f17529w = true;
        }

        /* renamed from: b */
        public void m11228b(boolean z) {
        }

        /* renamed from: c */
        public void m11227c(QuantityPickerView quantityPickerView, int i) {
            Intrinsics.m20926i(quantityPickerView, "view");
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$s */
    /* loaded from: classes2.dex */
    public static final class C9424s implements Animator.AnimatorListener {
        C9424s() {
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            ShoppingListActivity.m11332d2(ShoppingListActivity.this, false);
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            ShoppingListActivity.m11318i2(shoppingListActivity, !ShoppingListActivity.m11337b2(shoppingListActivity));
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            ShoppingListActivity.m11332d2(ShoppingListActivity.this, true);
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$s0 */
    /* loaded from: classes2.dex */
    public static final class C9425s0 implements InterfaceC9849a {
        C9425s0() {
        }

        /* renamed from: a */
        public void mo9829a() {
            ShoppingListActivity.m11301n2(ShoppingListActivity.this, new C13182l(EnumC9380b.STORE_MODE, Boolean.FALSE));
        }

        /* renamed from: b */
        public void mo9828b() {
            ShoppingListActivity.m11301n2(ShoppingListActivity.this, new C13182l(EnumC9380b.STORE_MODE, Boolean.TRUE));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$t */
    /* loaded from: classes2.dex */
    static final class C9426t<T> implements InterfaceC1440f0 {

        /* renamed from: b */
        final /* synthetic */ boolean f24762b;

        C9426t(boolean z) {
            this.f24762b = z;
        }

        /* renamed from: a */
        public final void mo37325a(Boolean bool) {
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            boolean z = this.f24762b;
            boolean m11190K0 = ShoppingListActivity.m11341Z1(shoppingListActivity).m11190K0();
            Intrinsics.checkIfNull(bool, "hasLoyaltyCard");
            ShoppingListActivity.m11280t2(shoppingListActivity, z, m11190K0, bool.booleanValue());
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$t0 */
    /* loaded from: classes2.dex */
    public static final class C9427t0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24764b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForShoppingMode$cardTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {1183}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$t0$a */
        /* loaded from: classes2.dex */
        static final class C9428a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24765x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24766y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9428a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24766y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9428a(this.f24766y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9428a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24765x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24765x = 1;
                    if (C10565r0.m7677a(1000L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24766y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9427t0(C6445u c6445u) {
            this.f24764b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9428a(this.f24764b, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$u */
    /* loaded from: classes2.dex */
    static final class C9429u<T> implements InterfaceC1440f0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$isInEditMode$2$3$1", m20196f = "ShoppingListActivity.kt", m20195l = {235}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$u$a */
        /* loaded from: classes2.dex */
        public static final class C9430a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24768x;

            /* renamed from: y */
            final /* synthetic */ ShoppingListActivity f24769y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9430a(ShoppingListActivity shoppingListActivity, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24769y = shoppingListActivity;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9430a(this.f24769y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9430a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24768x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24768x = 1;
                    if (C10565r0.m7677a(300L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                ShoppingListActivity.m11287r2(this.f24769y);
                return C13195u.f34156a;
            }
        }

        C9429u() {
        }

        /* renamed from: a */
        public final void mo37325a(EnumC2353a enumC2353a) {
            if (enumC2353a == EnumC2353a.CLOSED) {
                C2355c.f6855c.m33838a().mo167o(ShoppingListActivity.this);
                C6772d.m20158d(LifecycleOwner.m36965a(ShoppingListActivity.this), null, null, new C9430a(ShoppingListActivity.this, null), 3, null);
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$u0 */
    /* loaded from: classes2.dex */
    public static final class C9431u0 implements InterfaceC9850b {

        /* renamed from: b */
        final /* synthetic */ C6445u f24771b;

        /* compiled from: ShoppingListActivity.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$showCoachMarksForShoppingMode$uncheckTarget$1$onStarted$1", m20196f = "ShoppingListActivity.kt", m20195l = {1225}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$u0$a */
        /* loaded from: classes2.dex */
        static final class C9432a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f24772x;

            /* renamed from: y */
            final /* synthetic */ C6445u f24773y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9432a(C6445u c6445u, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f24773y = c6445u;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C9432a(this.f24773y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C9432a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24772x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    this.f24772x = 1;
                    if (C10565r0.m7677a(1000L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                this.f24773y.f17529w = true;
                return C13195u.f34156a;
            }
        }

        C9431u0(C6445u c6445u) {
            this.f24771b = c6445u;
        }

        /* renamed from: a */
        public void mo9827a() {
        }

        /* renamed from: b */
        public void mo9826b() {
            LifecycleOwner.m36965a(ShoppingListActivity.this).m36984i(new C9432a(this.f24771b, null));
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$v */
    /* loaded from: classes2.dex */
    static final class C9433v extends AbstractC6438m implements InterfaceC6113q {
        C9433v() {
            super(3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m11221a((RecyclerView.AbstractC1531c0) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m11221a(RecyclerView.AbstractC1531c0 abstractC1531c0, int i, int i2) {
            Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
            ShoppingListActivity.m11323g2(ShoppingListActivity.this, true);
            ShoppingListActivity.m11341Z1(ShoppingListActivity.this).m11169R0(abstractC1531c0.m36568j());
            ShoppingListActivity.m11326f2(ShoppingListActivity.this, abstractC1531c0.m36568j() == 0);
        }
    }

    /* compiled from: Delegates.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$v0 */
    /* loaded from: classes2.dex */
    public static final class C9434v0 extends ObservableProperty {

        /* renamed from: b */
        final /* synthetic */ ShoppingListActivity f24775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9434v0(Object obj, ShoppingListActivity shoppingListActivity) {
            super(obj);
            this.f24775b = shoppingListActivity;
        }

        /* renamed from: c */
        protected void m11220c(InterfaceC9724h interfaceC9724h, Object obj, Object obj2) {
            Intrinsics.isThisObjectNull(interfaceC9724h, "property");
            C13182l c13182l = (C13182l) obj2;
            C13182l c13182l2 = (C13182l) obj;
            int i = C9382c.f24672a[((EnumC9380b) c13182l.m1460c()).ordinal()];
            if (i == 1) {
                ShoppingListActivity.m11341Z1(this.f24775b).m11138b2(((Boolean) c13182l.m1459d()).booleanValue());
            } else if (i != 2) {
            } else {
                ShoppingListActivity.m11341Z1(this.f24775b).m11135c2(((Boolean) c13182l.m1459d()).booleanValue());
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$onResume$1", m20196f = "ShoppingListActivity.kt", m20195l = {360}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$w */
    /* loaded from: classes2.dex */
    static final class C9435w extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24776x;

        /* renamed from: y */
        int f24777y;

        C9435w(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9435w(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9435w) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            MenuItem menuItem;
            m34636d = C2116d.m34636d();
            int i = this.f24777y;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                MenuItem findItem = ShoppingListActivity.m11347W1(ShoppingListActivity.this).getMenu().findItem(C2336R.C2338id.action_search);
                if (findItem != null) {
                    StoreManager m11379H2 = ShoppingListActivity.this.m11379H2();
                    this.f24776x = findItem;
                    this.f24777y = 1;
                    Object m18760g = m11379H2.m18760g(this);
                    if (m18760g == m34636d) {
                        return m34636d;
                    }
                    menuItem = findItem;
                    obj = m18760g;
                }
                return C13195u.f34156a;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                menuItem = (MenuItem) this.f24776x;
                C13186n.m1453b(obj);
            }
            Store store = (Store) ((Result) obj).m16966a();
            if (store == null || !store.m13707k()) {
                z = false;
            }
            menuItem.setVisible(z);
            return C13195u.f34156a;
        }
    }

    /* compiled from: Delegates.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$w0 */
    /* loaded from: classes2.dex */
    public static final class C9436w0 extends ObservableProperty {

        /* renamed from: b */
        final /* synthetic */ ShoppingListActivity f24779b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9436w0(Object obj, ShoppingListActivity shoppingListActivity) {
            super(obj);
            this.f24779b = shoppingListActivity;
        }

        /* renamed from: c */
        protected void m11218c(InterfaceC9724h interfaceC9724h, Object obj, Object obj2) {
            Intrinsics.isThisObjectNull(interfaceC9724h, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            ShoppingListActivity.m11353T1(this.f24779b).m35981m(booleanValue ? ShoppingListActivity.m11366N1(this.f24779b).f30654T : null);
            if (ShoppingListActivity.m11351U1(this.f24779b) != null) {
                ShoppingListAdapter m11351U1 = ShoppingListActivity.m11351U1(this.f24779b);
                if (m11351U1 == null) {
                    Intrinsics.throwUninitPropException("shoppingListAdapter");
                    m11351U1 = null;
                }
                m11351U1.m20233o0(booleanValue);
            }
            TransitionManager.beginDelayedTransition(ShoppingListActivity.m11347W1(this.f24779b));
            LiveData m11130e1 = ShoppingListActivity.m11341Z1(this.f24779b).m11130e1();
            ShoppingListActivity shoppingListActivity = this.f24779b;
            m11130e1.mo171i(shoppingListActivity, new C9426t(booleanValue));
            if (!booleanValue && !ShoppingListActivity.m11341Z1(this.f24779b).m11203D1()) {
                if (C2354b.m33840f(this.f24779b, 0.0f, 1, null)) {
                    LiveData<EnumC2353a> m33838a = C2355c.f6855c.m33838a();
                    ShoppingListActivity shoppingListActivity2 = this.f24779b;
                    m33838a.mo171i(shoppingListActivity2, new C9429u());
                } else {
                    ShoppingListActivity.m11287r2(this.f24779b);
                }
            }
            if (!booleanValue && C2354b.m33840f(this.f24779b, 0.0f, 1, null)) {
                C2354b.m33844b(this.f24779b);
            }
            if (booleanValue) {
                return;
            }
            ShoppingListActivity.m11357R1(this.f24779b).mo9587d(C13195u.f34156a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$x */
    /* loaded from: classes2.dex */
    public static final class C9437x extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: x */
        final /* synthetic */ ShoppingListViewModel f24781x;

        /* compiled from: ShoppingListActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$x$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9438a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24782a;

            static {
                int[] iArr = new int[EnumC9444a.values().length];
                iArr[EnumC9444a.SEARCH.ordinal()] = 1;
                iArr[EnumC9444a.QUANTITY_VALUE_UPDATE_REQUEST.ordinal()] = 2;
                iArr[EnumC9444a.QUANTITY_UPDATE.ordinal()] = 3;
                iArr[EnumC9444a.CHECKED_UPDATE.ordinal()] = 4;
                iArr[EnumC9444a.ITEM_UPDATE.ordinal()] = 5;
                iArr[EnumC9444a.BADGE_DISCLAIMER.ordinal()] = 6;
                f24782a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9437x(ShoppingListViewModel shoppingListViewModel) {
            super(3);
            this.f24781x = shoppingListViewModel;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            m11217a((EnumC9444a) obj, (ShoppingListProduct) obj2, ((Number) obj3).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m11217a(EnumC9444a enumC9444a, ShoppingListProduct shoppingListProduct, int i) {
            Intrinsics.isThisObjectNull(enumC9444a, "action");
            Intrinsics.isThisObjectNull(shoppingListProduct, "product");
            switch (C9438a.f24782a[enumC9444a.ordinal()]) {
                case 1:
                    ShoppingListActivity.m11315j2(ShoppingListActivity.this, i);
                    SearchActivity.m23748d(ShoppingListActivity.m11345X1(ShoppingListActivity.this), ShoppingListActivity.this, shoppingListProduct.m14329n());
                    C2354b.m33844b(ShoppingListActivity.this);
                    return;
                case 2:
                    this.f24781x.m11099o2(shoppingListProduct);
                    return;
                case 3:
                case 4:
                    this.f24781x.m11108l2(shoppingListProduct);
                    return;
                case 5:
                    this.f24781x.m11160U0(shoppingListProduct);
                    return;
                case 6:
                    ShoppingListActivity.m11295p2(ShoppingListActivity.this, shoppingListProduct);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$x0 */
    /* loaded from: classes2.dex */
    static final class C9439x0 extends AbstractC6438m implements InterfaceC6097a {
        C9439x0() {
            super(0);
        }

        /* renamed from: a */
        public final SpeechRecognizer mo42214q() {
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            return shoppingListActivity.m11352T2(shoppingListActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$setupRecyclerView$2", m20196f = "ShoppingListActivity.kt", m20195l = {630}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$y */
    /* loaded from: classes2.dex */
    public static final class C9440y extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        Object f24784x;

        /* renamed from: y */
        int f24785y;

        C9440y(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9440y(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9440y) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            ShoppingListAdapter shoppingListAdapter;
            m34636d = C2116d.m34636d();
            int i = this.f24785y;
            boolean z = true;
            if (i == 0) {
                C13186n.m1453b(obj);
                ShoppingListAdapter m11351U1 = ShoppingListActivity.m11351U1(ShoppingListActivity.this);
                if (m11351U1 == null) {
                    Intrinsics.throwUninitPropException("shoppingListAdapter");
                    m11351U1 = null;
                }
                StoreManager m11379H2 = ShoppingListActivity.this.m11379H2();
                this.f24784x = m11351U1;
                this.f24785y = 1;
                Object m18760g = m11379H2.m18760g(this);
                if (m18760g == m34636d) {
                    return m34636d;
                }
                shoppingListAdapter = m11351U1;
                obj = m18760g;
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                shoppingListAdapter = (ShoppingListAdapter) this.f24784x;
                C13186n.m1453b(obj);
            }
            Store store = (Store) ((Result) obj).m16966a();
            if (store == null || store.m13707k()) {
                z = false;
            }
            shoppingListAdapter.m20234n0(z);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$updateAdapter$1", m20196f = "ShoppingListActivity.kt", m20195l = {739, 745}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$y0 */
    /* loaded from: classes2.dex */
    public static final class C9441y0 extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ boolean f24787A;

        /* renamed from: B */
        final /* synthetic */ List f24788B;

        /* renamed from: C */
        final /* synthetic */ boolean f24789C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC6097a f24790D;

        /* renamed from: x */
        int f24791x;

        /* renamed from: y */
        int f24792y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9441y0(boolean z, List list, boolean z2, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24787A = z;
            this.f24788B = list;
            this.f24789C = z2;
            this.f24790D = interfaceC6097a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9441y0(this.f24787A, this.f24788B, this.f24789C, this.f24790D, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9441y0) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity.C9441y0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$z */
    /* loaded from: classes2.dex */
    public static final class C9442z extends AbstractC6438m implements InterfaceC6097a {
        C9442z() {
            super(0);
        }

        /* renamed from: a */
        public final void m11213a() {
            ShoppingListActivity.m11305m2(ShoppingListActivity.this, false);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m11213a();
            return C13195u.f34156a;
        }
    }

    /* compiled from: ShoppingListActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.shoppinglist.ShoppingListActivity$z0 */
    /* loaded from: classes2.dex */
    static final class C9443z0 extends AbstractC6438m implements InterfaceC6097a {
        C9443z0() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC11832j6 mo42214q() {
            ShoppingListActivity shoppingListActivity = ShoppingListActivity.this;
            return shoppingListActivity.m11350U2(shoppingListActivity);
        }
    }

    static {
        new C9377a(null);
    }

    public ShoppingListActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        InterfaceC13178g m1464a5;
        InterfaceC13178g m1464a6;
        InterfaceC13178g m1464a7;
        C7182a c7182a = C7182a.f19008a;
        this.f24661t0 = new C9434v0(new C13182l(EnumC9380b.EDIT_MODE, Boolean.FALSE), this);
        this.f24662u0 = new C9436w0(Boolean.TRUE, this);
        m1464a = LazyJVM.m1464a(new C9391g());
        this.f24663v0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C9393h());
        this.f24664w0 = m1464a2;
        this.f24666y0 = OperatorExtensions.m35177d(10000L, LifecycleOwner.m36965a(this), new C9398i());
        m1464a3 = LazyJVM.m1464a(new C9386e());
        this.f24667z0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C9388f());
        this.f24636A0 = m1464a4;
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.h
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11331d3(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…ingListsCount()\n        }");
        this.f24637B0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11269w3(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…)\n            }\n        }");
        this.f24638C0 = m41364M2;
        AbstractC0304b m41364M3 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.e
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11338a3(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M3, "registerForActivityResul…hShoppingList()\n        }");
        this.f24639D0 = m41364M3;
        AbstractC0304b m41364M4 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.d
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11294p3(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M4, "registerForActivityResul…stActiveUsers()\n        }");
        this.f24640E0 = m41364M4;
        AbstractC0304b m41364M5 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.f
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11272v3(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M5, "registerForActivityResul…)\n            }\n        }");
        this.f24641F0 = m41364M5;
        AbstractC0304b m41364M6 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: kl.g
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ShoppingListActivity.m11395A2(ShoppingListActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M6, "registerForActivityResul…}\n            }\n        }");
        this.f24642G0 = m41364M6;
        m1464a5 = LazyJVM.m1464a(new C9443z0());
        this.f24644I0 = m1464a5;
        m1464a6 = LazyJVM.m1464a(new C9379a1());
        this.f24645J0 = m1464a6;
        m1464a7 = LazyJVM.m1464a(new C9439x0());
        this.f24646K0 = m1464a7;
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m11396A1(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        m11258z2(shoppingListActivity, valueAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m11395A2(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        String m9059a;
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        C10144b m9065g = C10143a.m9065g(activityResult.m41351b(), activityResult.m41352a());
        if (m9065g == null || (m9059a = m9065g.m9059a()) == null) {
            return;
        }
        Intrinsics.checkIfNull(m9059a, "contents");
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11144Z1(m9059a);
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m11393B1(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        m11270w2(shoppingListActivity, valueAnimator);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m11391C1(ShoppingListViewModel shoppingListViewModel, ShoppingListActivity shoppingListActivity, C13195u c13195u) {
        m11356R2(shoppingListViewModel, shoppingListActivity, c13195u);
    }

    /* renamed from: C2 */
    private final AbstractC11759f5 m11390C2() {
        return (AbstractC11759f5) this.f24667z0.getValue();
    }

    /* renamed from: D1 */
    public static /* synthetic */ boolean m11388D1(AbstractC11829j3 abstractC11829j3, TextView textView, int i, KeyEvent keyEvent) {
        return m11365N2(abstractC11829j3, textView, i, keyEvent);
    }

    /* renamed from: D2 */
    private final DialogC3502a m11387D2() {
        return (DialogC3502a) this.f24636A0.getValue();
    }

    /* renamed from: E1 */
    public static /* synthetic */ void m11386E1(ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3, ShoppingListViewModel shoppingListViewModel, C13195u c13195u) {
        m11360P2(shoppingListActivity, abstractC11829j3, shoppingListViewModel, c13195u);
    }

    /* renamed from: E2 */
    private final AbstractC11946p5 m11385E2() {
        return (AbstractC11946p5) this.f24663v0.getValue();
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m11384F1(C6445u c6445u, C6449y c6449y, View view) {
        m11279t3(c6445u, c6449y, view);
    }

    /* renamed from: F2 */
    private final DialogC3502a m11383F2() {
        return (DialogC3502a) this.f24664w0.getValue();
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m11382G1(ShoppingListActivity shoppingListActivity, View view) {
        m11367M2(shoppingListActivity, view);
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m11380H1(AbstractC11829j3 abstractC11829j3, ShoppingListActivity shoppingListActivity, Boolean bool) {
        m11297o3(abstractC11829j3, shoppingListActivity, bool);
    }

    /* renamed from: I1 */
    public static /* synthetic */ void m11378I1(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        m11265x2(shoppingListActivity, valueAnimator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I2 */
    public static final boolean m11377I2(ShoppingListActivity shoppingListActivity, MenuItem menuItem) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        C2354b.m33844b(shoppingListActivity);
        ((AbstractC11829j3) shoppingListActivity.m22738w0()).f30653S.requestFocus();
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_search) {
            SearchActivity.m23747e(shoppingListActivity.f24637B0, shoppingListActivity, null, 2, null);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_send) {
            String m11091r1 = ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11091r1();
            String string = shoppingListActivity.getString(C2336R.string.lbl_shopping_list_share_title);
            Intrinsics.checkIfNull(string, "getString(R.string.lbl_shopping_list_share_title)");
            IntentUtils.m24292b(shoppingListActivity, m11091r1, string);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_shared) {
            SharedWithActivity.m17518a(shoppingListActivity.f24640E0, shoppingListActivity);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_sync) {
            C6772d.m20158d(LifecycleOwner.m36965a(shoppingListActivity), null, null, new C9402j(null), 3, null);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_import) {
            shoppingListActivity.m11374J2();
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_clear) {
            UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
            String string2 = shoppingListActivity.getString(C2336R.string.dialog_shopping_lists_title);
            Intrinsics.checkIfNull(string2, "getString(R.string.dialog_shopping_lists_title)");
            String string3 = shoppingListActivity.getString(C2336R.string.dialog_make_list_clear_message);
            Intrinsics.checkIfNull(string3, "getString(R.string.dialog_make_list_clear_message)");
            UiEventsLiveData.m19519k(uiEventsLiveData, string2, string3, null, null, new C9405k(), 12, null);
            return true;
        } else if (valueOf != null && valueOf.intValue() == C2336R.C2338id.action_delete) {
            UiEventsLiveData uiEventsLiveData2 = UiEventsLiveData.f18671a;
            String string4 = shoppingListActivity.getString(C2336R.string.dialog_shopping_lists_title);
            Intrinsics.checkIfNull(string4, "getString(R.string.dialog_shopping_lists_title)");
            String string5 = shoppingListActivity.getString(((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11186L1() ? C2336R.string.dialog_shopping_delete_shared : C2336R.string.dialog_make_list_delete_message_alt);
            Intrinsics.checkIfNull(string5, "getString(if (viewModel.…_list_delete_message_alt)");
            UiEventsLiveData.m19519k(uiEventsLiveData2, string4, string5, null, null, new C9407l(), 12, null);
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m11375J1(ShoppingListActivity shoppingListActivity, List list) {
        m11304m3(shoppingListActivity, list);
    }

    /* renamed from: J2 */
    private final void m11374J2() {
        if (m151V0()) {
            return;
        }
        PurchaseListActivity.m21957c(this.f24639D0, this, false, false, 4, null);
    }

    /* renamed from: K1 */
    public static /* synthetic */ void m11372K1(C6445u c6445u, C6449y c6449y, View view) {
        m11276u3(c6445u, c6449y, view);
    }

    /* renamed from: L1 */
    public static final /* synthetic */ boolean m11370L1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.m151V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m11369L2(ShoppingListActivity shoppingListActivity, View view) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        if (shoppingListActivity.m151V0()) {
            return;
        }
        C2354b.m33844b(shoppingListActivity);
        ShoppingListsActivity.m18326a(shoppingListActivity.f24637B0, shoppingListActivity);
    }

    /* renamed from: M1 */
    public static final /* synthetic */ AbstractC11759f5 m11368M1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.m11390C2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m11367M2(ShoppingListActivity shoppingListActivity, View view) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        shoppingListActivity.m11374J2();
    }

    /* renamed from: N1 */
    public static final /* synthetic */ AbstractC11829j3 m11366N1(ShoppingListActivity shoppingListActivity) {
        return (AbstractC11829j3) shoppingListActivity.m22738w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N2 */
    public static final boolean m11365N2(AbstractC11829j3 abstractC11829j3, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        if (i == 3) {
            abstractC11829j3.f30662x.performClick();
            return true;
        }
        return false;
    }

    /* renamed from: O1 */
    public static final /* synthetic */ AbstractC11946p5 m11364O1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.m11385E2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O2 */
    public static final void m11363O2(ShoppingListActivity shoppingListActivity, ShoppingListViewModel.EnumC9452b enumC9452b) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.ifNullDoSomething(enumC9452b);
        int i = C9382c.f24673b[enumC9452b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LifecycleOwner.m36965a(shoppingListActivity).m36984i(new C9422r(null));
        } else if (!SpeechRecognizer.isRecognitionAvailable(shoppingListActivity)) {
            shoppingListActivity.onError(3);
        } else {
            LifecycleOwner.m36965a(shoppingListActivity).m36984i(new C9420q(null));
        }
    }

    /* renamed from: P1 */
    public static final /* synthetic */ ShoppingListViewModel.EnumC9455e m11361P1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24658q0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P2 */
    public static final void m11360P2(ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3, ShoppingListViewModel shoppingListViewModel, C13195u c13195u) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        Intrinsics.isThisObjectNull(shoppingListViewModel, "$viewModel");
        if (shoppingListActivity.f24650i0) {
            return;
        }
        abstractC11829j3.f30645K.setExpanded(true);
        Object mo172f = shoppingListViewModel.m11177O1().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        AnimatorSet m11273v2 = m11273v2(shoppingListActivity, !((Boolean) mo172f).booleanValue(), 0L, 2, null);
        m11273v2.addListener(new C9424s());
        m11273v2.start();
    }

    /* renamed from: Q1 */
    public static final /* synthetic */ AbstractC0304b m11359Q1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24642G0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q2 */
    public static final void m11358Q2(ShoppingListActivity shoppingListActivity, C13195u c13195u) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        shoppingListActivity.m145b1().mo41749a(AbstractC0151j.C0152a.f332a);
    }

    /* renamed from: R1 */
    public static final /* synthetic */ InterfaceC6108l m11357R1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24666y0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m11356R2(ShoppingListViewModel shoppingListViewModel, ShoppingListActivity shoppingListActivity, C13195u c13195u) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        if (shoppingListViewModel.m11207B1()) {
            shoppingListActivity.m11383F2().show();
        } else {
            shoppingListViewModel.m11175P0();
        }
    }

    /* renamed from: S1 */
    public static final /* synthetic */ boolean m11355S1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24657p0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m11354S2(ShoppingListViewModel shoppingListViewModel, AbstractC11829j3 abstractC11829j3, Boolean bool) {
        Intrinsics.isThisObjectNull(shoppingListViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        Object mo172f = shoppingListViewModel.m11083u1().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            abstractC11829j3.f30637C.setVisibility(8);
        } else {
            abstractC11829j3.f30637C.setVisibility(0);
        }
    }

    /* renamed from: T1 */
    public static final /* synthetic */ C1618k m11353T1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24660s0;
    }

    /* renamed from: U1 */
    public static final /* synthetic */ ShoppingListAdapter m11351U1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24659r0;
    }

    /* renamed from: V1 */
    public static final /* synthetic */ AbstractC0304b m11349V1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24641F0;
    }

    /* renamed from: W1 */
    public static final /* synthetic */ Toolbar m11347W1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.m22737y0();
    }

    /* renamed from: W2 */
    private final void m11346W2(boolean z) {
        m11277u2(z, 0L).start();
    }

    /* renamed from: X1 */
    public static final /* synthetic */ AbstractC0304b m11345X1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24638C0;
    }

    /* renamed from: X2 */
    private final boolean m11344X2() {
        return ((Boolean) this.f24662u0.mo18994b(this, f24635L0[1])).booleanValue();
    }

    /* renamed from: Y1 */
    public static final /* synthetic */ LatLng m11343Y1(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.f24665x0;
    }

    /* renamed from: Y2 */
    private final C13182l m11342Y2() {
        return (C13182l) this.f24661t0.mo18994b(this, f24635L0[0]);
    }

    /* renamed from: Z1 */
    public static final /* synthetic */ ShoppingListViewModel m11341Z1(ShoppingListActivity shoppingListActivity) {
        return (ShoppingListViewModel) shoppingListActivity.m22758I0();
    }

    /* renamed from: a2 */
    public static final /* synthetic */ void m11339a2(ShoppingListActivity shoppingListActivity) {
        shoppingListActivity.m11374J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m11338a3(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11162T1();
    }

    /* renamed from: b2 */
    public static final /* synthetic */ boolean m11337b2(ShoppingListActivity shoppingListActivity) {
        return shoppingListActivity.m11344X2();
    }

    /* renamed from: b3 */
    private final void m11336b3() {
        if (C0928a.m39116a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 && C0928a.m39116a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            C11131c.m6034a(this).m31620v().mo30791e(new InterfaceC5018e() { // from class: kl.u
                @Override // p079e8.InterfaceC5018e
                /* renamed from: b */
                public final void mo20210b(Object obj) {
                    ShoppingListActivity.m11333c3(ShoppingListActivity.this, (Location) obj);
                }
            });
        }
    }

    /* renamed from: c2 */
    public static final /* synthetic */ void m11334c2(ShoppingListActivity shoppingListActivity) {
        shoppingListActivity.m11336b3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m11333c3(ShoppingListActivity shoppingListActivity, Location location) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "$this_with");
        if (location != null) {
            shoppingListActivity.f24665x0 = new LatLng(location.getLatitude(), location.getLongitude());
        }
    }

    /* renamed from: d2 */
    public static final /* synthetic */ void m11332d2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24650i0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m11331d3(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        shoppingListActivity.f24656o0 = activityResult.m41351b() == -1;
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11162T1();
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11159U1();
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11156V1();
    }

    /* renamed from: e2 */
    public static final /* synthetic */ void m11329e2(ShoppingListActivity shoppingListActivity, ShoppingListViewModel.EnumC9455e enumC9455e) {
        shoppingListActivity.f24658q0 = enumC9455e;
    }

    /* renamed from: f2 */
    public static final /* synthetic */ void m11326f2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24653l0 = z;
    }

    /* renamed from: f3 */
    private final void m11325f3(boolean z) {
        this.f24662u0.mo18995a(this, f24635L0[1], Boolean.valueOf(z));
    }

    /* renamed from: g2 */
    public static final /* synthetic */ void m11323g2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24651j0 = z;
    }

    /* renamed from: g3 */
    private final void m11322g3(C13182l c13182l) {
        this.f24661t0.mo18995a(this, f24635L0[0], c13182l);
    }

    /* renamed from: h2 */
    public static final /* synthetic */ void m11321h2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24657p0 = z;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: h3 */
    private final void m11320h3(final ShoppingListViewModel shoppingListViewModel, final AbstractC11829j3 abstractC11829j3) {
        AbstractC1474q m36965a = LifecycleOwner.m36965a(this);
        List m11088s1 = shoppingListViewModel.m11088s1();
        ResourcesProvider m6898a = C10841b.m6898a(this);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(m6898a.m6899a(), 2131951715).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
        ShoppingListAdapter shoppingListAdapter = new ShoppingListAdapter(m36965a, false, m11088s1, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), new C9437x(shoppingListViewModel), 2, null);
        this.f24659r0 = shoppingListAdapter;
        ResourcesProvider m6898a2 = C10841b.m6898a(this);
        TypedValue typedValue2 = new TypedValue();
        new ContextThemeWrapper(m6898a2.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(16843534, typedValue2, true);
        shoppingListAdapter.m20230r0(C0928a.m39111f(m6898a2.m6899a(), typedValue2.resourceId));
        C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9440y(null), 3, null);
        final PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11829j3.f30654T;
        ShoppingListAdapter shoppingListAdapter2 = this.f24659r0;
        if (shoppingListAdapter2 == null) {
            Intrinsics.throwUninitPropException("shoppingListAdapter");
            shoppingListAdapter2 = null;
        }
        placeHolderRecyclerView.setAdapter(shoppingListAdapter2);
        placeHolderRecyclerView.setHoldersAdapter(new ShoppingListItemPlaceHolderAdapter());
        placeHolderRecyclerView.setHoldersItemDecoration(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(10), 0, 0, false, false, 0, C0868i.f2773H0, null));
        placeHolderRecyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: kl.c0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m10519i3;
                m10519i3 = ShoppingListActivity.m11317i3(PlaceHolderRecyclerView.this, this, view, motionEvent);
                return m10519i3;
            }
        });
        shoppingListViewModel.m11133d1().mo171i(this, new InterfaceC1440f0() { // from class: kl.o
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11314j3(ShoppingListActivity.this, shoppingListViewModel, abstractC11829j3, (List) obj);
            }
        });
        shoppingListViewModel.m102x().mo171i(this, new InterfaceC1440f0() { // from class: kl.s
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11308l3(AbstractC11829j3.this, (Boolean) obj);
            }
        });
        shoppingListViewModel.m11151X0().mo171i(this, new InterfaceC1440f0() { // from class: kl.k
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11304m3(ShoppingListActivity.this, (List) obj);
            }
        });
        shoppingListViewModel.m11100o1().mo171i(this, new InterfaceC1440f0() { // from class: kl.j
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11300n3(ShoppingListActivity.this, (String) obj);
            }
        });
        shoppingListViewModel.m11183M1().mo171i(this, new InterfaceC1440f0() { // from class: kl.t
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11297o3(AbstractC11829j3.this, this, (Boolean) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9383c0(shoppingListViewModel, null));
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m11319i1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11269w3(shoppingListActivity, activityResult);
    }

    /* renamed from: i2 */
    public static final /* synthetic */ void m11318i2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.m11325f3(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i3 */
    public static final boolean m11317i3(PlaceHolderRecyclerView placeHolderRecyclerView, ShoppingListActivity shoppingListActivity, View view, MotionEvent motionEvent) {
        Intrinsics.isThisObjectNull(placeHolderRecyclerView, "$this_with");
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        if (placeHolderRecyclerView.m36611w0()) {
            return true;
        }
        ShoppingListAdapter shoppingListAdapter = null;
        if (C2354b.m33841e(placeHolderRecyclerView, 0.0f, 1, null)) {
            C2354b.m33844b(shoppingListActivity);
        }
        ShoppingListAdapter shoppingListAdapter2 = shoppingListActivity.f24659r0;
        if (shoppingListAdapter2 == null) {
            Intrinsics.throwUninitPropException("shoppingListAdapter");
        } else {
            shoppingListAdapter = shoppingListAdapter2;
        }
        shoppingListAdapter.m20231q0(false);
        return false;
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m11316j1(ShoppingListActivity shoppingListActivity, ShoppingListViewModel.EnumC9452b enumC9452b) {
        m11363O2(shoppingListActivity, enumC9452b);
    }

    /* renamed from: j2 */
    public static final /* synthetic */ void m11315j2(ShoppingListActivity shoppingListActivity, int i) {
        shoppingListActivity.f24654m0 = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m11314j3(ShoppingListActivity shoppingListActivity, ShoppingListViewModel shoppingListViewModel, final AbstractC11829j3 abstractC11829j3, List list) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(shoppingListViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        MenuItem findItem = shoppingListActivity.m22737y0().getMenu().findItem(C2336R.C2338id.action_shared);
        boolean z = false;
        if (findItem != null) {
            findItem.setVisible(shoppingListViewModel.m11190K0() && shoppingListActivity.m11344X2());
        }
        if (shoppingListActivity.f24655n0) {
            shoppingListActivity.f24655n0 = false;
            boolean z2 = shoppingListActivity.f24658q0 == ShoppingListViewModel.EnumC9455e.CATEGORY;
            ResourcesProvider m6898a = C10841b.m6898a(shoppingListActivity);
            int i = z2 ? 2131951702 : 2131951714;
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), i).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            int m39113d = C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId);
            ResourcesProvider m6898a2 = C10841b.m6898a(shoppingListActivity);
            int i2 = z2 ? 2131951714 : 2131951702;
            TypedValue typedValue2 = new TypedValue();
            new ContextThemeWrapper(m6898a2.m6899a(), i2).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue2, true);
            int m39113d2 = C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId);
            ValueAnimator m23714e = C5579c.m23714e(m39113d, m39113d2, 350L);
            m23714e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl.x
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ShoppingListActivity.m11311k3(ShoppingListActivity.this, abstractC11829j3, valueAnimator);
                }
            });
            m23714e.start();
            Intrinsics.checkIfNull(list, "it");
            shoppingListActivity.m11264x3(list, true, false, new C9442z());
            ShoppingListAdapter shoppingListAdapter = shoppingListActivity.f24659r0;
            ShoppingListAdapter shoppingListAdapter2 = null;
            if (shoppingListAdapter == null) {
                Intrinsics.throwUninitPropException("shoppingListAdapter");
                shoppingListAdapter = null;
            }
            shoppingListAdapter.m20232p0(z2);
            ShoppingListAdapter shoppingListAdapter3 = shoppingListActivity.f24659r0;
            if (shoppingListAdapter3 == null) {
                Intrinsics.throwUninitPropException("shoppingListAdapter");
            } else {
                shoppingListAdapter2 = shoppingListAdapter3;
            }
            shoppingListAdapter2.m20236l0(m39113d2);
            return;
        }
        boolean z3 = (shoppingListActivity.f24652k0 || shoppingListActivity.f24651j0 || Intrinsics.equals(shoppingListViewModel.m102x().mo172f(), Boolean.TRUE)) ? false : true;
        Intrinsics.checkIfNull(list, "it");
        if (shoppingListActivity.f24656o0 || (shoppingListViewModel.m11136c1() && shoppingListActivity.f24653l0)) {
            z = true;
        }
        shoppingListActivity.m11264x3(list, z, z3, new C9378a0());
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m11313k1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11294p3(shoppingListActivity, activityResult);
    }

    /* renamed from: k2 */
    public static final /* synthetic */ void m11312k2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24655n0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m11311k3(ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        Window window = shoppingListActivity.getWindow();
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) animatedValue).intValue());
        Toolbar m22737y0 = shoppingListActivity.m22737y0();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        m22737y0.setBackgroundColor(((Integer) animatedValue2).intValue());
        AppBarLayout appBarLayout = abstractC11829j3.f30645K;
        Object animatedValue3 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
        appBarLayout.setBackgroundColor(((Integer) animatedValue3).intValue());
        ConstraintLayout constraintLayout = abstractC11829j3.f30648N;
        Object animatedValue4 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue4, "null cannot be cast to non-null type kotlin.Int");
        constraintLayout.setBackgroundColor(((Integer) animatedValue4).intValue());
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m11310l1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11338a3(shoppingListActivity, activityResult);
    }

    /* renamed from: l2 */
    public static final /* synthetic */ void m11309l2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24652k0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m11308l3(AbstractC11829j3 abstractC11829j3, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        C2046o.m34853a(abstractC11829j3.f30654T);
        PlaceHolderRecyclerView placeHolderRecyclerView = abstractC11829j3.f30654T;
        Intrinsics.checkIfNull(bool, "it");
        placeHolderRecyclerView.m33813B1(bool.booleanValue());
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m11306m1(ShoppingListActivity shoppingListActivity, Location location) {
        m11333c3(shoppingListActivity, location);
    }

    /* renamed from: m2 */
    public static final /* synthetic */ void m11305m2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.f24656o0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m11304m3(ShoppingListActivity shoppingListActivity, List list) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        ShoppingListAdapter shoppingListAdapter = shoppingListActivity.f24659r0;
        if (shoppingListAdapter == null) {
            Intrinsics.throwUninitPropException("shoppingListAdapter");
            shoppingListAdapter = null;
        }
        Intrinsics.checkIfNull(list, "it");
        shoppingListAdapter.m20237k0(list);
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m11302n1(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        m11262y2(shoppingListActivity, valueAnimator);
    }

    /* renamed from: n2 */
    public static final /* synthetic */ void m11301n2(ShoppingListActivity shoppingListActivity, C13182l c13182l) {
        shoppingListActivity.m11322g3(c13182l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m11300n3(ShoppingListActivity shoppingListActivity, String str) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        ShoppingListAdapter shoppingListAdapter = shoppingListActivity.f24659r0;
        if (shoppingListAdapter == null) {
            Intrinsics.throwUninitPropException("shoppingListAdapter");
            shoppingListAdapter = null;
        }
        Intrinsics.checkIfNull(str, "it");
        shoppingListAdapter.m20226t0(str);
    }

    /* renamed from: o1 */
    public static /* synthetic */ void m11299o1(ShoppingListActivity shoppingListActivity, C13195u c13195u) {
        m11358Q2(shoppingListActivity, c13195u);
    }

    /* renamed from: o2 */
    public static final /* synthetic */ void m11298o2(ShoppingListActivity shoppingListActivity, ShoppingListViewModel shoppingListViewModel, AbstractC11829j3 abstractC11829j3) {
        shoppingListActivity.m11320h3(shoppingListViewModel, abstractC11829j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m11297o3(AbstractC11829j3 abstractC11829j3, ShoppingListActivity shoppingListActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11829j3, "$binding");
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        EditText editText = abstractC11829j3.f30653S;
        Intrinsics.checkIfNull(bool, "editing");
        if (bool.booleanValue()) {
            if (!C2354b.m33840f(shoppingListActivity, 0.0f, 1, null)) {
                C2354b.m33839g(shoppingListActivity);
            }
            C6772d.m20158d(LifecycleOwner.m36965a(shoppingListActivity), null, null, new C9381b0(editText, null), 3, null);
            return;
        }
        C2354b.m33844b(shoppingListActivity);
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m11296p1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11272v3(shoppingListActivity, activityResult);
    }

    /* renamed from: p2 */
    public static final /* synthetic */ void m11295p2(ShoppingListActivity shoppingListActivity, ShoppingListProduct shoppingListProduct) {
        shoppingListActivity.m11290q3(shoppingListProduct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m11294p3(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11159U1();
    }

    /* renamed from: q1 */
    public static /* synthetic */ void m11292q1(AbstractC11829j3 abstractC11829j3, Boolean bool) {
        m11308l3(abstractC11829j3, bool);
    }

    /* renamed from: q2 */
    public static final /* synthetic */ void m11291q2(ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3) {
        shoppingListActivity.m11286r3(abstractC11829j3);
    }

    /* renamed from: q3 */
    private final void m11290q3(ShoppingListProduct shoppingListProduct) {
        m11390C2().mo4267U(shoppingListProduct.m14336e());
        m11390C2().mo4269S(shoppingListProduct.m14338c());
        String m14337d = shoppingListProduct.m14337d();
        AbstractC11759f5 m11390C2 = m11390C2();
        if (m14337d.length() == 0) {
            m14337d = getString(C2336R.string.lbl_badge_disclaimer);
            Intrinsics.checkIfNull(m14337d, "getString(R.string.lbl_badge_disclaimer)");
        }
        m11390C2.mo4268T(m14337d);
        m11387D2().show();
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m11288r1(ShoppingListActivity shoppingListActivity, AbstractC11829j3 abstractC11829j3, ValueAnimator valueAnimator) {
        m11311k3(shoppingListActivity, abstractC11829j3, valueAnimator);
    }

    /* renamed from: r2 */
    public static final /* synthetic */ void m11287r2(ShoppingListActivity shoppingListActivity) {
        shoppingListActivity.m11283s3();
    }

    /* JADX WARN: Type inference failed for: r0v46, types: [rc.c, T] */
    /* renamed from: r3 */
    private final void m11286r3(AbstractC11829j3 abstractC11829j3) {
        Spotlight spotlight;
        C6449y c6449y = new C6449y();
        C6445u c6445u = new C6445u();
        AbstractC11734de abstractC11734de = abstractC11829j3.f30659Y;
        Intrinsics.checkIfNull(abstractC11734de, "binding.tutorialRowInclude");
        String string = getString(C2336R.string.lbl_shopping_list_coachmark_item_name);
        ShoppingListCategory shoppingListCategory = new ShoppingListCategory(null, null, 0, 7, null);
        Intrinsics.checkIfNull(string, "getString(R.string.lbl_s…list_coachmark_item_name)");
        LiteralProduct literalProduct = new LiteralProduct(null, 0L, shoppingListCategory, string, 0, false, null, 0, 0, false, 1011, null);
        abstractC11734de.f30145I.setValue(literalProduct.m14367s());
        abstractC11734de.f30155y.setVisibility(8);
        abstractC11734de.f30146J.setText(literalProduct.m14348F());
        abstractC11734de.f30142F.setText(literalProduct.m14368n());
        View m37802s = abstractC11829j3.f30659Y.m37802s();
        Intrinsics.checkIfNull(m37802s, "binding.tutorialRowInclude.root");
        if (C1112b0.m38446W(m37802s) && !m37802s.isLayoutRequested()) {
            C6445u c6445u2 = new C6445u();
            Target.C9864a c9864a = new Target.C9864a();
            ConstraintLayout constraintLayout = abstractC11829j3.f30650P;
            Intrinsics.checkIfNull(constraintLayout, "binding.modeToggleConstraintLayout");
            Target.C9864a m9783h = c9864a.m9787d(constraintLayout).m9783h(new RoundedRectangle(abstractC11829j3.f30642H.getHeight(), abstractC11829j3.f30642H.getWidth(), 100.0f, 0L, null, 24, null));
            ResourcesProvider m6898a = C10841b.m6898a(this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            Target.C9864a m9785f = m9783h.m9786e(new RippleEffect(0.0f, 200.0f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9418p0(c6445u));
            AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p7.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_toggle));
            abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC9421q0(c6445u, c6449y));
            C13195u c13195u = C13195u.f34156a;
            View m37802s2 = abstractC11948p7.m37802s();
            Intrinsics.checkIfNull(m37802s2, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a = m9785f.m9784g(m37802s2).m9790a();
            Target.C9864a c9864a2 = new Target.C9864a();
            ImageButton imageButton = abstractC11734de.f30137A;
            Intrinsics.checkIfNull(imageButton, "rowBinding.btnSearchImageButton");
            Target.C9864a m9783h2 = c9864a2.m9787d(imageButton).m9783h(new Circle(100.0f, 0L, null, 6, null));
            ResourcesProvider m6898a2 = C10841b.m6898a(this);
            TypedValue typedValue2 = new TypedValue();
            new ContextThemeWrapper(m6898a2.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue2, true);
            Target.C9864a m9785f2 = m9783h2.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9413n0(c6445u));
            AbstractC11948p7 abstractC11948p72 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p72.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_1));
            abstractC11948p72.f31211x.setOnClickListener(new View$OnClickListenerC9416o0(c6445u, c6449y));
            View m37802s3 = abstractC11948p72.m37802s();
            Intrinsics.checkIfNull(m37802s3, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a2 = m9785f2.m9784g(m37802s3).m9790a();
            Target.C9864a c9864a3 = new Target.C9864a();
            TextView textView = abstractC11734de.f30146J;
            Intrinsics.checkIfNull(textView, "rowBinding.quantityTextView");
            Target.C9864a m9783h3 = c9864a3.m9787d(textView).m9783h(new RoundedRectangle(abstractC11734de.m37802s().getHeight(), abstractC11734de.m37802s().getWidth(), 100.0f, 0L, null, 24, null));
            ResourcesProvider m6898a3 = C10841b.m6898a(this);
            TypedValue typedValue3 = new TypedValue();
            new ContextThemeWrapper(m6898a3.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue3, true);
            Target.C9864a m9785f3 = m9783h3.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a3.m6899a(), typedValue3.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9408l0(c6445u2, this, abstractC11734de));
            AbstractC11948p7 abstractC11948p73 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p73.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_2));
            abstractC11948p73.f31211x.setOnClickListener(new View$OnClickListenerC9411m0(c6445u, abstractC11734de));
            QuantityPickerView quantityPickerView = abstractC11734de.f30145I;
            Intrinsics.checkIfNull(quantityPickerView, "rowBinding.quantityQuantityPickerView");
            quantityPickerView.setActionListener(new C9423r0(abstractC11734de, c6445u, c6449y));
            View m37802s4 = abstractC11948p73.m37802s();
            Intrinsics.checkIfNull(m37802s4, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a3 = m9785f3.m9784g(m37802s4).m9790a();
            float m35167e = UtilsExtensions.m35167e(90);
            Target.C9864a m9783h4 = new Target.C9864a().m9789b(m9790a2.m9795a().x - UtilsExtensions.m35167e(25), m9790a2.m9795a().y).m9783h(new Circle(100.0f, 0L, null, 6, null));
            ResourcesProvider m6898a4 = C10841b.m6898a(this);
            TypedValue typedValue4 = new TypedValue();
            new ContextThemeWrapper(m6898a4.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue4, true);
            Target.C9864a m9785f4 = m9783h4.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a4.m6899a(), typedValue4.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9394h0(c6445u2, this, m35167e, abstractC11734de, c6445u));
            AbstractC11948p7 abstractC11948p74 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p74.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_3));
            abstractC11948p74.f31211x.setOnClickListener(new View$OnClickListenerC9399i0(c6445u, m35167e, abstractC11734de, c6449y));
            View m37802s5 = abstractC11948p74.m37802s();
            Intrinsics.checkIfNull(m37802s5, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a4 = m9785f4.m9784g(m37802s5).m9790a();
            Target.C9864a c9864a4 = new Target.C9864a();
            View m37802s6 = abstractC11829j3.f30659Y.m37802s();
            Intrinsics.checkIfNull(m37802s6, "binding.tutorialRowInclude.root");
            Target.C9864a m9783h5 = c9864a4.m9787d(m37802s6).m9783h(new RoundedRectangle(abstractC11734de.m37802s().getHeight(), abstractC11734de.m37802s().getWidth(), 0.0f, 0L, null, 24, null));
            ResourcesProvider m6898a5 = C10841b.m6898a(this);
            TypedValue typedValue5 = new TypedValue();
            new ContextThemeWrapper(m6898a5.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue5, true);
            Target.C9864a m9785f5 = m9783h5.m9786e(new RippleEffect(0.0f, 200.0f, C0928a.m39113d(m6898a5.m6899a(), typedValue5.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9403j0(c6445u));
            AbstractC11948p7 abstractC11948p75 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p75.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_add_item_step_4));
            abstractC11948p75.f31211x.setText(getString(C2336R.string.btn_ok_alt));
            abstractC11948p75.f31211x.setOnClickListener(new View$OnClickListenerC9406k0(c6445u, c6449y));
            View m37802s7 = abstractC11948p75.m37802s();
            Intrinsics.checkIfNull(m37802s7, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a5 = m9785f5.m9784g(m37802s7).m9790a();
            Target.C9864a m9783h6 = new Target.C9864a().m9785f(new C9389f0(c6445u)).m9783h(new Circle(0.0f, 0L, null, 6, null));
            AbstractC11948p7 abstractC11948p76 = (AbstractC11948p7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
            abstractC11948p76.f31212y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_buy_online));
            abstractC11948p76.f31211x.setText(getString(C2336R.string.btn_ok_alt));
            abstractC11948p76.f31211x.setOnClickListener(new View$OnClickListenerC9392g0(c6445u, c6449y));
            View m37802s8 = abstractC11948p76.m37802s();
            Intrinsics.checkIfNull(m37802s8, "inflate<ViewCoachmarksDe…                   }.root");
            Target m9790a6 = m9783h6.m9784g(m37802s8).m9790a();
            Activity activity = (Activity) new WeakReference(this).get();
            if (activity != null) {
                Intrinsics.checkIfNull(activity, "it");
                Spotlight.C9851a m9804h = new Spotlight.C9851a(activity).m9804h(m9790a, m9790a2, m9790a3, m9790a4, m9790a5, m9790a6);
                ResourcesProvider m6898a6 = C10841b.m6898a(this);
                TypedValue typedValue6 = new TypedValue();
                new ContextThemeWrapper(m6898a6.m6899a(), 2131951658).getTheme().resolveAttribute(C2336R.attr.overlayColor, typedValue6, true);
                ?? m9811a = m9804h.m9809c(typedValue6.resourceId).m9807e(500L).m9810b(new DecelerateInterpolator(2.0f)).m9808d((ViewGroup) abstractC11829j3.m37802s()).m9806f(new C9387e0(abstractC11734de, abstractC11829j3)).m9811a();
                c6449y.f17533w = m9811a;
                if (m9811a == 0) {
                    Intrinsics.throwUninitPropException("spotlight");
                    spotlight = null;
                } else {
                    spotlight = (Spotlight) m9811a;
                }
                spotlight.m9813m();
                return;
            }
            return;
        }
        m37802s.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC9385d0(abstractC11829j3, this, abstractC11734de, c6445u, c6449y));
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m11285s1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11395A2(shoppingListActivity, activityResult);
    }

    /* renamed from: s2 */
    public static final /* synthetic */ void m11284s2(ShoppingListActivity shoppingListActivity, boolean z) {
        shoppingListActivity.m11261y3(z);
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [rc.c, T] */
    /* renamed from: s3 */
    private final void m11283s3() {
        final C6449y c6449y = new C6449y();
        final C6445u c6445u = new C6445u();
        Target.C9864a c9864a = new Target.C9864a();
        MaterialButton materialButton = ((AbstractC11829j3) m22738w0()).f30635A;
        Intrinsics.checkIfNull(materialButton, "binding.cardMaterialButton");
        Target.C9864a m9783h = c9864a.m9787d(materialButton).m9783h(new Circle(60.0f, 0L, null, 6, null));
        ResourcesProvider m6898a = C10841b.m6898a(this);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
        Target.C9864a m9785f = m9783h.m9786e(new RippleEffect(0.0f, 80.0f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9427t0(c6445u));
        Spotlight spotlight = null;
        AbstractC11988r7 abstractC11988r7 = (AbstractC11988r7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_for_store_mode, null, false);
        abstractC11988r7.f31381y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_card));
        abstractC11988r7.f31380x.setOnClickListener(new View.OnClickListener() { // from class: kl.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListActivity.m11279t3(C6445u.this, c6449y, view);
            }
        });
        View m37802s = abstractC11988r7.m37802s();
        Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksFo… }\n                }.root");
        Target m9790a = m9785f.m9784g(m37802s).m9790a();
        Target.C9864a c9864a2 = new Target.C9864a();
        MaterialButton materialButton2 = ((AbstractC11829j3) m22738w0()).f30660Z;
        Intrinsics.checkIfNull(materialButton2, "binding.uncheckMaterialButton");
        Target.C9864a m9783h2 = c9864a2.m9787d(materialButton2).m9783h(new Circle(60.0f, 0L, null, 6, null));
        ResourcesProvider m6898a2 = C10841b.m6898a(this);
        TypedValue typedValue2 = new TypedValue();
        new ContextThemeWrapper(m6898a2.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue2, true);
        Target.C9864a m9785f2 = m9783h2.m9786e(new RippleEffect(0.0f, 80.0f, C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId), 1500L, null, 1, 16, null)).m9785f(new C9431u0(c6445u));
        AbstractC11988r7 abstractC11988r72 = (AbstractC11988r7) C1275f.m37764e(getLayoutInflater(), C2336R.layout.view_coachmarks_for_store_mode, null, false);
        abstractC11988r72.f31381y.setText(getString(C2336R.string.lbl_shopping_list_coachmark_unselect));
        abstractC11988r72.f31380x.setText(getString(C2336R.string.btn_ok_alt));
        abstractC11988r72.f31380x.setOnClickListener(new View.OnClickListener() { // from class: kl.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListActivity.m11276u3(C6445u.this, c6449y, view);
            }
        });
        View m37802s2 = abstractC11988r72.m37802s();
        Intrinsics.checkIfNull(m37802s2, "inflate<ViewCoachmarksFo… }\n                }.root");
        Target m9790a2 = m9785f2.m9784g(m37802s2).m9790a();
        Activity activity = (Activity) new WeakReference(this).get();
        if (activity != null) {
            Spotlight.C9851a m9804h = new Spotlight.C9851a(activity).m9804h(m9790a, m9790a2);
            ResourcesProvider m6898a3 = C10841b.m6898a(this);
            TypedValue typedValue3 = new TypedValue();
            new ContextThemeWrapper(m6898a3.m6899a(), 2131951658).getTheme().resolveAttribute(C2336R.attr.overlayColor, typedValue3, true);
            ?? m9811a = m9804h.m9809c(typedValue3.resourceId).m9807e(500L).m9810b(new DecelerateInterpolator(2.0f)).m9808d((ViewGroup) ((AbstractC11829j3) m22738w0()).m37802s()).m9806f(new C9425s0()).m9811a();
            c6449y.f17533w = m9811a;
            if (m9811a == 0) {
                Intrinsics.throwUninitPropException("spotlight");
            } else {
                spotlight = (Spotlight) m9811a;
            }
            spotlight.m9813m();
        }
    }

    /* renamed from: t1 */
    public static /* synthetic */ boolean m11281t1(PlaceHolderRecyclerView placeHolderRecyclerView, ShoppingListActivity shoppingListActivity, View view, MotionEvent motionEvent) {
        return m11317i3(placeHolderRecyclerView, shoppingListActivity, view, motionEvent);
    }

    /* renamed from: t2 */
    public static final /* synthetic */ void m11280t2(ShoppingListActivity shoppingListActivity, boolean z, boolean z2, boolean z3) {
        shoppingListActivity.m11257z3(z, z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m11279t3(C6445u c6445u, C6449y c6449y, View view) {
        Spotlight spotlight;
        Intrinsics.isThisObjectNull(c6445u, "$maySkip");
        Intrinsics.isThisObjectNull(c6449y, "$spotlight");
        if (c6445u.f17529w) {
            c6445u.f17529w = false;
            T t = c6449y.f17533w;
            if (t == 0) {
                Intrinsics.throwUninitPropException("spotlight");
                spotlight = null;
            } else {
                spotlight = (Spotlight) t;
            }
            spotlight.m9815k();
        }
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m11278u1(ShoppingListActivity shoppingListActivity, ShoppingListViewModel shoppingListViewModel, AbstractC11829j3 abstractC11829j3, List list) {
        m11314j3(shoppingListActivity, shoppingListViewModel, abstractC11829j3, list);
    }

    /* renamed from: u2 */
    private final AnimatorSet m11277u2(boolean z, long j) {
        int i = z ? 2131951712 : 2131951713;
        CommonUtils commonUtils = CommonUtils.f15361a;
        ValueAnimator m24301a = commonUtils.m24301a(z ? 0.5f : 0.0f, z ? 0.0f : 0.5f, j);
        m24301a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShoppingListActivity.m11270w2(ShoppingListActivity.this, valueAnimator);
            }
        });
        Drawable background = ((AbstractC11829j3) m22738w0()).f30657W.getBackground();
        Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ColorStateList color = ((GradientDrawable) background).getColor();
        Intrinsics.ifNullDoSomething(color);
        int defaultColor = color.getDefaultColor();
        ResourcesProvider m6898a = C10841b.m6898a(this);
        TypedValue typedValue = new TypedValue();
        new ContextThemeWrapper(m6898a.m6899a(), i).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
        long j2 = j / 2;
        ValueAnimator m23714e = C5579c.m23714e(defaultColor, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), j2);
        m23714e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShoppingListActivity.m11265x2(ShoppingListActivity.this, valueAnimator);
            }
        });
        ValueAnimator m24301a2 = commonUtils.m24301a(1.0f, 0.0f, j2);
        m24301a2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShoppingListActivity.m11262y2(ShoppingListActivity.this, valueAnimator);
            }
        });
        m24301a2.addListener(new C9384d(z, i));
        ValueAnimator m24301a3 = commonUtils.m24301a(0.0f, 1.0f, j2);
        m24301a3.setStartDelay(m24301a3.getDuration());
        m24301a3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kl.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShoppingListActivity.m11258z2(ShoppingListActivity.this, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m24301a, m23714e, m24301a2, m24301a3);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m11276u3(C6445u c6445u, C6449y c6449y, View view) {
        Spotlight spotlight;
        Intrinsics.isThisObjectNull(c6445u, "$maySkip");
        Intrinsics.isThisObjectNull(c6449y, "$spotlight");
        if (c6445u.f17529w) {
            c6445u.f17529w = false;
            T t = c6449y.f17533w;
            if (t == 0) {
                Intrinsics.throwUninitPropException("spotlight");
                spotlight = null;
            } else {
                spotlight = (Spotlight) t;
            }
            spotlight.m9815k();
        }
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m11274v1(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        m11331d3(shoppingListActivity, activityResult);
    }

    /* renamed from: v2 */
    static /* synthetic */ AnimatorSet m11273v2(ShoppingListActivity shoppingListActivity, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 250;
        }
        return shoppingListActivity.m11277u2(z, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m11272v3(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11162T1();
        }
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m11271w1(ShoppingListActivity shoppingListActivity, String str) {
        m11300n3(shoppingListActivity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m11270w2(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11141a2(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m11269w3(ShoppingListActivity shoppingListActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        if (activityResult.m41351b() == -1) {
            ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11153W1(shoppingListActivity.f24654m0);
            ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11162T1();
            ((ShoppingListViewModel) shoppingListActivity.m22758I0()).m11156V1();
        }
    }

    /* renamed from: x1 */
    public static /* synthetic */ boolean m11266x1(ShoppingListActivity shoppingListActivity, MenuItem menuItem) {
        return m11377I2(shoppingListActivity, menuItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x2 */
    public static final void m11265x2(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        ConstraintLayout constraintLayout = ((AbstractC11829j3) shoppingListActivity.m22738w0()).f30657W;
        Drawable background = constraintLayout.getBackground();
        Objects.requireNonNull(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        gradientDrawable.setColor(((Integer) animatedValue).intValue());
        constraintLayout.setBackground(gradientDrawable);
    }

    /* renamed from: x3 */
    private final void m11264x3(List list, boolean z, boolean z2, InterfaceC6097a interfaceC6097a) {
        LifecycleOwner.m36965a(this).m36984i(new C9441y0(z2, list, z, interfaceC6097a, null));
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m11263y1(ShoppingListViewModel shoppingListViewModel, AbstractC11829j3 abstractC11829j3, Boolean bool) {
        m11354S2(shoppingListViewModel, abstractC11829j3, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m11262y2(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        TextView textView = ((AbstractC11829j3) shoppingListActivity.m22738w0()).f30658X;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        textView.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: y3 */
    private final void m11261y3(boolean z) {
        if (!z) {
            ViewGroup.LayoutParams layoutParams = ((AbstractC11829j3) m22738w0()).f30646L.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            ((AppBarLayout.C3455f) layoutParams).m30664g(0);
        } else {
            ViewGroup.LayoutParams layoutParams2 = ((AbstractC11829j3) m22738w0()).f30646L.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            ((AppBarLayout.C3455f) layoutParams2).m30664g(7);
        }
        ((AbstractC11829j3) m22738w0()).f30646L.requestLayout();
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m11259z1(ShoppingListActivity shoppingListActivity, View view) {
        m11369L2(shoppingListActivity, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m11258z2(ShoppingListActivity shoppingListActivity, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(shoppingListActivity, "this$0");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        TextView textView = ((AbstractC11829j3) shoppingListActivity.m22738w0()).f30658X;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        textView.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: z3 */
    private final void m11257z3(boolean z, boolean z2, boolean z3) {
        Menu menu = m22737y0().getMenu();
        Intrinsics.checkIfNull(menu, "getToolbar().menu");
        Iterator m38121a = androidx.core.view.Menu.m38121a(menu);
        while (m38121a.hasNext()) {
            MenuItem menuItem = (MenuItem) m38121a.next();
            boolean z4 = true;
            if (z) {
                int itemId = menuItem.getItemId();
                if (itemId != C2336R.C2338id.action_import ? itemId != C2336R.C2338id.action_shared ? true : z2 : z3) {
                    menuItem.setVisible(z4);
                }
            }
            z4 = false;
            menuItem.setVisible(z4);
        }
    }

    /* renamed from: A */
    public void m11398A(String str) {
        Intrinsics.isThisObjectNull(str, "itemQuery");
        ((AbstractC11829j3) m22738w0()).f30662x.performClick();
    }

    /* renamed from: A0 */
    protected int m11397A0() {
        return C2336R.C2339menu.menu_shopping_list;
    }

    /* renamed from: B */
    public SpeechRecognizer m11394B() {
        return (SpeechRecognizer) this.f24646K0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B2 */
    public C8614a mo42216v0() {
        return new C8614a();
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: G2 */
    public final ViewModelFactoryByInjection m11381G2() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24648g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: H2 */
    public final StoreManager m11379H2() {
        StoreManager storeManager = this.f24647f0;
        if (storeManager != null) {
            return storeManager;
        }
        Intrinsics.throwUninitPropException("storeManager");
        return null;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11376J0() {
        return C6450z.m20906b(ShoppingListViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11373K0() {
        return new C9410m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: K2 */
    public void m11362P0(final AbstractC11829j3 abstractC11829j3, final ShoppingListViewModel shoppingListViewModel) {
        Intrinsics.isThisObjectNull(abstractC11829j3, "binding");
        Intrinsics.isThisObjectNull(shoppingListViewModel, "viewModel");
        abstractC11829j3.f30649O.setOnClickListener(new View.OnClickListener() { // from class: kl.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListActivity.m11369L2(ShoppingListActivity.this, view);
            }
        });
        abstractC11829j3.f30647M.setOnClickListener(new View.OnClickListener() { // from class: kl.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShoppingListActivity.m11367M2(ShoppingListActivity.this, view);
            }
        });
        abstractC11829j3.f30651Q.setOnItemSelectedListener(new C9415o(shoppingListViewModel));
        abstractC11829j3.f30653S.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: kl.b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m10566N2;
                m10566N2 = ShoppingListActivity.m11365N2(AbstractC11829j3.this, textView, i, keyEvent);
                return m10566N2;
            }
        });
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        C2354b.m33845a(this);
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C9417p()));
        shoppingListViewModel.m11148Y0().mo171i(this, new InterfaceC1440f0() { // from class: kl.n
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11363O2(ShoppingListActivity.this, (ShoppingListViewModel.EnumC9452b) obj);
            }
        });
        shoppingListViewModel.m11073z1().mo171i(this, new InterfaceC1440f0() { // from class: kl.p
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11360P2(ShoppingListActivity.this, abstractC11829j3, shoppingListViewModel, (C13195u) obj);
            }
        });
        shoppingListViewModel.m11094q1().mo171i(this, new InterfaceC1440f0() { // from class: kl.m
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11358Q2(ShoppingListActivity.this, (C13195u) obj);
            }
        });
        shoppingListViewModel.m11142a1().mo171i(this, new InterfaceC1440f0() { // from class: kl.q
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11356R2(ShoppingListViewModel.this, this, (C13195u) obj);
            }
        });
        shoppingListViewModel.m11083u1().mo171i(this, new InterfaceC1440f0() { // from class: kl.r
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ShoppingListActivity.m11354S2(ShoppingListViewModel.this, abstractC11829j3, (Boolean) obj);
            }
        });
        LifecycleOwner.m36965a(this).m36984i(new C9412n(shoppingListViewModel, this, abstractC11829j3, null));
        if (this.f24649h0 == null) {
            m11325f3(true);
            m11346W2(m11344X2());
        }
    }

    /* renamed from: T2 */
    public SpeechRecognizer m11352T2(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41721f(this, activityC0325c);
    }

    /* renamed from: U2 */
    public AbstractC11832j6 m11350U2(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41720g(this, activityC0325c);
    }

    /* renamed from: V2 */
    public DialogC3502a m11348V2(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41719h(this, activityC0325c);
    }

    /* renamed from: Z2 */
    public Object m11340Z2(ActivityC0325c activityC0325c, InterfaceC1886d interfaceC1886d) {
        return SpeechRecognizerBehavior.C0167a.m41714m(this, activityC0325c, interfaceC1886d);
    }

    /* renamed from: c */
    public boolean m11335c() {
        return this.f24643H0;
    }

    /* renamed from: e */
    public void m11330e(boolean z) {
        this.f24643H0 = z;
    }

    /* renamed from: e3 */
    public void m11328e3(ActivityC0325c activityC0325c) {
        SpeechRecognizerBehavior.C0167a.m41705v(this, activityC0325c);
    }

    /* renamed from: f */
    public void m11327f() {
        SpeechRecognizerBehavior.C0167a.m41706u(this);
    }

    /* renamed from: g */
    public void m11324g() {
        m11328e3(this);
    }

    /* renamed from: m */
    public DialogC3502a m11307m() {
        return (DialogC3502a) this.f24645J0.getValue();
    }

    /* renamed from: n */
    public boolean m11303n() {
        return true;
    }

    public void onBackPressed() {
        if (this.f24650i0 || ((Boolean) m11342Y2().m1459d()).booleanValue()) {
            return;
        }
        super.onBackPressed();
    }

    public void onBeginningOfSpeech() {
        SpeechRecognizerBehavior.C0167a.m41713n(this);
    }

    public void onBufferReceived(byte[] bArr) {
    }

    protected void onCreate(Bundle bundle) {
        this.f24649h0 = bundle;
        super.onCreate(bundle);
    }

    protected void onDestroy() {
        try {
            m11394B().destroy();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public void onEndOfSpeech() {
        SpeechRecognizerBehavior.C0167a.m41712o(this);
    }

    public void onError(int i) {
        SpeechRecognizerBehavior.C0167a.m41711p(this, i);
    }

    public void onEvent(int i, Bundle bundle) {
    }

    public void onPartialResults(Bundle bundle) {
        SpeechRecognizerBehavior.C0167a.m41710q(this, bundle);
    }

    protected void onPause() {
        super.onPause();
        m11282t();
    }

    public void onReadyForSpeech(Bundle bundle) {
        SpeechRecognizerBehavior.C0167a.m41709r(this, bundle);
    }

    public void onResults(Bundle bundle) {
        SpeechRecognizerBehavior.C0167a.m41708s(this, bundle);
    }

    protected void onResume() {
        super.onResume();
        Bundle bundle = this.f24649h0;
        if (bundle != null) {
            Intrinsics.ifNullDoSomething(bundle);
            m11325f3(bundle.getBoolean("STATE_FOR_MODE"));
            m11346W2(m11344X2());
            Bundle bundle2 = this.f24649h0;
            Intrinsics.ifNullDoSomething(bundle2);
            Serializable serializable = bundle2.getSerializable("STATE_FOR_ORDER");
            if (serializable == null) {
                serializable = ShoppingListViewModel.EnumC9455e.MANUAL;
            }
            this.f24658q0 = (ShoppingListViewModel.EnumC9455e) serializable;
            this.f24655n0 = true;
            ((ShoppingListViewModel) m22758I0()).m11165S1(this.f24658q0);
            Bundle bundle3 = this.f24649h0;
            Intrinsics.ifNullDoSomething(bundle3);
            this.f24654m0 = bundle3.getInt("STATE_FOR_INDEX_TO_REPLACE", -1);
            this.f24649h0 = null;
        }
        ((ShoppingListViewModel) m22758I0()).m11093q2();
        C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9435w(null), 3, null);
    }

    public void onRmsChanged(float f) {
    }

    protected void onSaveInstanceState(Bundle bundle) {
        Intrinsics.isThisObjectNull(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_FOR_MODE", m11344X2());
        bundle.putSerializable("STATE_FOR_ORDER", this.f24658q0);
        bundle.putInt("STATE_FOR_INDEX_TO_REPLACE", this.f24654m0);
    }

    /* renamed from: q */
    public String m11293q() {
        return ((AbstractC11829j3) m22738w0()).f30653S.getText().toString();
    }

    /* renamed from: r */
    public void m11289r(String str) {
        Intrinsics.isThisObjectNull(str, "value");
        ((AbstractC11829j3) m22738w0()).f30653S.setText(str);
    }

    /* renamed from: t */
    public void m11282t() {
        SpeechRecognizerBehavior.C0167a.m41722e(this);
    }

    /* renamed from: x */
    public AbstractC11832j6 m11268x() {
        return (AbstractC11832j6) this.f24644I0.getValue();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_shopping_list;
    }

    /* renamed from: z0 */
    protected Toolbar.InterfaceC0450f m11260z0() {
        return new Toolbar.InterfaceC0450f() { // from class: kl.i
            @Override // androidx.appcompat.widget.Toolbar.InterfaceC0450f
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean m10576I2;
                m10576I2 = ShoppingListActivity.m11377I2(ShoppingListActivity.this, menuItem);
                return m10576I2;
            }
        };
    }
}
