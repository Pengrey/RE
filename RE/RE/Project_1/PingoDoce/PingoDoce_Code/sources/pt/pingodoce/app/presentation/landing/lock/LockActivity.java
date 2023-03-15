package pt.pingodoce.app.presentation.landing.lock;

import ai.AbstractC0151j;
import ai.SpeechRecognizerBehavior;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.appcompat.app.ActivityC0325c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1214x;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.AbstractC1474q;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import bi.C1924a;
import cd.C2116d;
import ci.C2142f;
import ci.C2146h;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC3502a;
import fk.LockShoppingListAdapter;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import ne.EventObserver;
import p050d.C4519c;
import p086ei.BenefitsActivity;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p206kk.TermsAndConditionsActivity;
import p207kl.ShoppingListActivity;
import p314qd.InterfaceC9717b;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC11691b6;
import p426wg.AbstractC11808i0;
import p426wg.AbstractC11832j6;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc._Collections;
import p494zh.AbstractC13816c;
import p494zh.C13833f2;
import p494zh.C13869l0;
import p494zh.C13870l1;
import p494zh.C13890q;
import p494zh.C13905t2;
import p494zh.C13909u2;
import p494zh.C13913v2;
import p496zj.CardRegistrationLandingActivity;
import pe.C8614a;
import pk.InsertPinActivity;
import pt.pingodoce.app.data.local.flows.LoginFlowData;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.presentation.landing.lock.LockActivity;
import sb.C10143a;
import sb.C10144b;
import td.C10565r0;
import td.InterfaceC10524i0;

/* compiled from: LockActivity.kt */
@SuppressLint({"StringFormatMatches"})
/* loaded from: classes2.dex */
public final class LockActivity extends FlowActivity implements SpeechRecognizerBehavior {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f24320g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f24321h0;

    /* renamed from: i0 */
    private int f24322i0;

    /* renamed from: j0 */
    private final AbstractC0304b f24323j0;

    /* renamed from: k0 */
    private final AbstractC0304b f24324k0;

    /* renamed from: l0 */
    private final AbstractC0304b f24325l0;

    /* renamed from: m0 */
    private final AbstractC0304b f24326m0;

    /* renamed from: n0 */
    private final AbstractC0304b f24327n0;

    /* renamed from: o0 */
    private final AbstractC0304b f24328o0;

    /* renamed from: p0 */
    private final InterfaceC13178g f24329p0;

    /* renamed from: q0 */
    private final InterfaceC13178g f24330q0;

    /* renamed from: r0 */
    private final InterfaceC13178g f24331r0;

    /* renamed from: s0 */
    private boolean f24332s0;

    /* renamed from: t0 */
    private String f24333t0;

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$a */
    /* loaded from: classes2.dex */
    public static final class C9242a {
        private C9242a() {
        }

        public /* synthetic */ C9242a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$b */
    /* loaded from: classes2.dex */
    static final class C9243b extends AbstractC6438m implements InterfaceC6097a {
        C9243b() {
            super(0);
        }

        /* renamed from: a */
        public final LockShoppingListAdapter mo42214q() {
            AbstractC1474q m36965a = LifecycleOwner.m36965a(LockActivity.this);
            ResourcesProvider m6898a = C10841b.m6898a(LockActivity.this);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), 2131951674).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
            return new LockShoppingListAdapter(m36965a, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
        }
    }

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$c */
    /* loaded from: classes2.dex */
    static final class C9244c extends AbstractC6438m implements InterfaceC6097a {
        C9244c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(LockActivity.this.m11985N1(), LockActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$initShoppingListBottomSheet$1$1", m20196f = "LockActivity.kt", m20195l = {248}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9245d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24336x;

        C9245d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9245d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9245d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24336x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LockActivity lockActivity = LockActivity.this;
                AbstractC0304b m11996E1 = LockActivity.m11996E1(lockActivity);
                this.f24336x = 1;
                if (C1924a.m35138a(lockActivity, m11996E1, this) == m34636d) {
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
    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$initShoppingListBottomSheet$2$1", m20196f = "LockActivity.kt", m20195l = {256}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9246e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24338x;

        C9246e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9246e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9246e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24338x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LockActivity lockActivity = LockActivity.this;
                this.f24338x = 1;
                if (lockActivity.m11971a2(lockActivity, this) == m34636d) {
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
    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$initShoppingListBottomSheet$3$1", m20196f = "LockActivity.kt", m20195l = {262}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9247f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24340x;

        /* renamed from: y */
        final /* synthetic */ LockViewModel f24341y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9247f(LockViewModel lockViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24341y = lockViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9247f(this.f24341y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9247f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24340x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LockViewModel lockViewModel = this.f24341y;
                this.f24340x = 1;
                if (lockViewModel.m11913Q0(this) == m34636d) {
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
    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$initViews$2$1", m20196f = "LockActivity.kt", m20195l = {204}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9248g extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24342x;

        /* renamed from: y */
        final /* synthetic */ AbstractC11808i0 f24343y;

        /* renamed from: z */
        final /* synthetic */ LockActivity f24344z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9248g(AbstractC11808i0 abstractC11808i0, LockActivity lockActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24343y = abstractC11808i0;
            this.f24344z = lockActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9248g(this.f24343y, this.f24344z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9248g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24342x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f24343y.f30521x.m37802s().setVisibility(0);
                this.f24342x = 1;
                if (C10565r0.m7677a(200L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            LockActivity.m11993H1(this.f24344z, true);
            return C13195u.f34156a;
        }
    }

    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$initViews$3$1$1", m20196f = "LockActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$h */
    /* loaded from: classes2.dex */
    static final class C9249h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ List f24345A;

        /* renamed from: B */
        final /* synthetic */ AbstractC11808i0 f24346B;

        /* renamed from: x */
        int f24347x;

        /* renamed from: z */
        final /* synthetic */ View f24349z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9249h(View view, List list, AbstractC11808i0 abstractC11808i0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24349z = view;
            this.f24345A = list;
            this.f24346B = abstractC11808i0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9249h(this.f24349z, this.f24345A, this.f24346B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9249h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            List m459j0;
            List<ShoppingListProduct> m460i0;
            int m186r;
            C2116d.m34636d();
            if (this.f24347x == 0) {
                C13186n.m1453b(obj);
                LockActivity lockActivity = LockActivity.this;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    Display display = lockActivity.getDisplay();
                    if (display != null) {
                        display.getRealMetrics(new DisplayMetrics());
                    }
                } else {
                    lockActivity.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (i >= 30) {
                    Display display2 = lockActivity.getDisplay();
                    if (display2 != null) {
                        display2.getRealMetrics(displayMetrics);
                    }
                } else {
                    lockActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                }
                int i2 = displayMetrics.heightPixels;
                int identifier = lockActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
                int i3 = 0;
                int dimensionPixelSize = i2 - (identifier > 0 ? lockActivity.getResources().getDimensionPixelSize(identifier) : 0);
                int identifier2 = lockActivity.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize2 = identifier2 > 0 ? lockActivity.getResources().getDimensionPixelSize(identifier2) : 0;
                TypedValue typedValue = new TypedValue();
                lockActivity.getTheme().resolveAttribute(16843499, typedValue, true);
                int dimension = (int) (((((int) ((dimensionPixelSize - dimensionPixelSize2) - typedValue.getDimension(new DisplayMetrics()))) - this.f24349z.getHeight()) - C10841b.m6898a(LockActivity.this).m6899a().getResources().getDimension(C2336R.dimen.shopping_in_lock_max_items_offset)) / C10841b.m6898a(LockActivity.this).m6899a().getResources().getDimension(C2336R.dimen.shopping_list_item_min_height));
                if (this.f24345A.size() > dimension) {
                    LockActivity lockActivity2 = LockActivity.this;
                    List list = this.f24345A;
                    Intrinsics.checkIfNull(list, "list");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ShoppingListProduct) {
                            arrayList.add(obj2);
                        }
                    }
                    m460i0 = _Collections.m460i0(arrayList, this.f24345A.size() - dimension);
                    m186r = Iterables.m186r(m460i0, 10);
                    ArrayList<Number> arrayList2 = new ArrayList(m186r);
                    for (ShoppingListProduct shoppingListProduct : m460i0) {
                        arrayList2.add(C6755b.m20199c(shoppingListProduct.m14327s()));
                    }
                    for (Number number : arrayList2) {
                        i3 += number.intValue();
                    }
                    LockActivity.m11994G1(lockActivity2, i3);
                }
                this.f24346B.mo4166Q(C6755b.m20199c(LockActivity.m11995F1(LockActivity.this)));
                LockShoppingListAdapter m11997D1 = LockActivity.m11997D1(LockActivity.this);
                List list2 = this.f24345A;
                Intrinsics.checkIfNull(list2, "list");
                m459j0 = _Collections.m459j0(list2, dimension);
                m11997D1.m22153F(m459j0);
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$i */
    /* loaded from: classes2.dex */
    public static final class C9250i extends AbstractC6438m implements InterfaceC6108l {
        C9250i() {
            super(1);
        }

        /* renamed from: a */
        public final void m11934a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(LockActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11934a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: View.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$j */
    /* loaded from: classes2.dex */
    public static final class RunnableC9251j implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f24351w;

        /* renamed from: x */
        final /* synthetic */ LockActivity f24352x;

        /* renamed from: y */
        final /* synthetic */ List f24353y;

        /* renamed from: z */
        final /* synthetic */ AbstractC11808i0 f24354z;

        public RunnableC9251j(View view, LockActivity lockActivity, List list, AbstractC11808i0 abstractC11808i0) {
            this.f24351w = view;
            this.f24352x = lockActivity;
            this.f24353y = list;
            this.f24354z = abstractC11808i0;
        }

        public final void run() {
            LifecycleOwner.m36965a(this.f24352x).m36984i(new C9249h(this.f24351w, this.f24353y, this.f24354z, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LockActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.landing.lock.LockActivity$parseResult$1", m20196f = "LockActivity.kt", m20195l = {151}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$k */
    /* loaded from: classes2.dex */
    public static final class C9252k extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24355x;

        C9252k(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9252k(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9252k) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24355x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f24355x = 1;
                if (C10565r0.m7677a(200L, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            LockActivity.this.finish();
            return C13195u.f34156a;
        }
    }

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$l */
    /* loaded from: classes2.dex */
    static final class C9253l extends AbstractC6438m implements InterfaceC6097a {
        C9253l() {
            super(0);
        }

        /* renamed from: a */
        public final SpeechRecognizer mo42214q() {
            LockActivity lockActivity = LockActivity.this;
            return lockActivity.m11974X1(lockActivity);
        }
    }

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$m */
    /* loaded from: classes2.dex */
    static final class C9254m extends AbstractC6438m implements InterfaceC6097a {
        C9254m() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC11832j6 mo42214q() {
            LockActivity lockActivity = LockActivity.this;
            return lockActivity.m11973Y1(lockActivity);
        }
    }

    /* compiled from: LockActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.landing.lock.LockActivity$n */
    /* loaded from: classes2.dex */
    static final class C9255n extends AbstractC6438m implements InterfaceC6097a {
        C9255n() {
            super(0);
        }

        /* renamed from: a */
        public final DialogC3502a mo42214q() {
            LockActivity lockActivity = LockActivity.this;
            return lockActivity.m11972Z1(lockActivity);
        }
    }

    static {
        new C9242a(null);
    }

    public LockActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        InterfaceC13178g m1464a3;
        InterfaceC13178g m1464a4;
        m1464a = LazyJVM.m1464a(new C9243b());
        this.f24321h0 = m1464a;
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.i
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11984O1(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…E\n            )\n        }");
        this.f24323j0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.h
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11992I1(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…T\n            )\n        }");
        this.f24324k0 = m41364M2;
        AbstractC0304b m41364M3 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.f
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11990J1(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M3, "registerForActivityResul…OR_UNLOCK_CARD)\n        }");
        this.f24325l0 = m41364M3;
        AbstractC0304b m41364M4 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.k
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11968c2(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M4, "registerForActivityResul…T\n            )\n        }");
        this.f24326m0 = m41364M4;
        AbstractC0304b m41364M5 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.j
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11967d2(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M5, "registerForActivityResul…G\n            )\n        }");
        this.f24327n0 = m41364M5;
        AbstractC0304b m41364M6 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: fk.g
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LockActivity.m11988K1(LockActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M6, "registerForActivityResul…}\n            }\n        }");
        this.f24328o0 = m41364M6;
        m1464a2 = LazyJVM.m1464a(new C9254m());
        this.f24329p0 = m1464a2;
        m1464a3 = LazyJVM.m1464a(new C9255n());
        this.f24330q0 = m1464a3;
        m1464a4 = LazyJVM.m1464a(new C9253l());
        this.f24331r0 = m1464a4;
        this.f24333t0 = BuildConfig.VERSION_NAME;
    }

    /* renamed from: A1 */
    public static /* synthetic */ void m12001A1(LockActivity lockActivity, ActivityResult activityResult) {
        m11967d2(lockActivity, activityResult);
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m11999B1(LockActivity lockActivity, ActivityResult activityResult) {
        m11968c2(lockActivity, activityResult);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m11998C1(LockActivity lockActivity, LockViewModel lockViewModel, View view) {
        m11979S1(lockActivity, lockViewModel, view);
    }

    /* renamed from: D1 */
    public static final /* synthetic */ LockShoppingListAdapter m11997D1(LockActivity lockActivity) {
        return lockActivity.m11986M1();
    }

    /* renamed from: E1 */
    public static final /* synthetic */ AbstractC0304b m11996E1(LockActivity lockActivity) {
        return lockActivity.f24328o0;
    }

    /* renamed from: F1 */
    public static final /* synthetic */ int m11995F1(LockActivity lockActivity) {
        return lockActivity.f24322i0;
    }

    /* renamed from: G1 */
    public static final /* synthetic */ void m11994G1(LockActivity lockActivity, int i) {
        lockActivity.f24322i0 = i;
    }

    /* renamed from: H1 */
    public static final /* synthetic */ void m11993H1(LockActivity lockActivity, boolean z) {
        lockActivity.m11960h2(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m11992I1(LockActivity lockActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.checkIfNull(activityResult, "it");
        lockActivity.m11965e2(activityResult, 190);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m11990J1(LockActivity lockActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        lockActivity.m145b1().mo41749a(AbstractC0151j.C0156e.f336a);
        Intrinsics.checkIfNull(activityResult, "it");
        lockActivity.m11965e2(activityResult, 160);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m11988K1(LockActivity lockActivity, ActivityResult activityResult) {
        String m9059a;
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        C10144b m9065g = C10143a.m9065g(activityResult.m41351b(), activityResult.m41352a());
        if (m9065g == null || (m9059a = m9065g.m9059a()) == null) {
            return;
        }
        Intrinsics.checkIfNull(m9059a, "contents");
        ((LockViewModel) lockActivity.m22758I0()).m11909U0(m9059a);
    }

    /* renamed from: M1 */
    private final LockShoppingListAdapter m11986M1() {
        return (LockShoppingListAdapter) this.f24321h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m11984O1(LockActivity lockActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.checkIfNull(activityResult, "it");
        lockActivity.m11965e2(activityResult, 150);
    }

    /* renamed from: P1 */
    private final void m11982P1(AbstractC11691b6 abstractC11691b6, final LockViewModel lockViewModel) {
        abstractC11691b6.m37802s().setVisibility(8);
        abstractC11691b6.f29926E.setOnClickListener(new View.OnClickListener() { // from class: fk.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockActivity.m11981Q1(LockActivity.this, view);
            }
        });
        abstractC11691b6.f29930I.setOnClickListener(new View.OnClickListener() { // from class: fk.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockActivity.m11980R1(LockActivity.this, view);
            }
        });
        abstractC11691b6.f29925D.setOnClickListener(new View.OnClickListener() { // from class: fk.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LockActivity.m11979S1(LockActivity.this, lockViewModel, view);
            }
        });
        abstractC11691b6.f29927F.setAdapter(m11986M1());
        BottomSheetBehavior.m30367f0(abstractC11691b6.m37802s()).m30410E0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m11981Q1(LockActivity lockActivity, View view) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        LifecycleOwner.m36965a(lockActivity).m36984i(new C9245d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m11980R1(LockActivity lockActivity, View view) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        if (!SpeechRecognizer.isRecognitionAvailable(lockActivity)) {
            lockActivity.onError(3);
        } else {
            LifecycleOwner.m36965a(lockActivity).m36984i(new C9246e(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m11979S1(LockActivity lockActivity, LockViewModel lockViewModel, View view) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.isThisObjectNull(lockViewModel, "$viewModel");
        C6772d.m20158d(LifecycleOwner.m36965a(lockActivity), null, null, new C9247f(lockViewModel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public static final void m11977U1(AbstractC11808i0 abstractC11808i0, LockActivity lockActivity, List list) {
        Intrinsics.isThisObjectNull(abstractC11808i0, "$binding");
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        ConstraintLayout constraintLayout = abstractC11808i0.f30521x.f29924C;
        Intrinsics.checkIfNull(constraintLayout, "binding.bottomsheetIncluded.footerConstraintLayout");
        Intrinsics.checkIfNull(ViewTreeObserver$OnPreDrawListenerC1214x.m38016a(constraintLayout, new RunnableC9251j(constraintLayout, lockActivity, list, abstractC11808i0)), "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V1 */
    public static final void m11976V1(LockActivity lockActivity, Boolean bool) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.checkIfNull(bool, "it");
        if (bool.booleanValue()) {
            C5579c.m23718a(lockActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W1 */
    public static final void m11975W1(LockActivity lockActivity, AbstractC11808i0 abstractC11808i0, Boolean bool) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.isThisObjectNull(abstractC11808i0, "$binding");
        LifecycleOwner.m36965a(lockActivity).m36984i(new C9248g(abstractC11808i0, lockActivity, null));
    }

    /* renamed from: b2 */
    private final void m11970b2() {
        ShoppingListActivity.m20275a(this);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c2 */
    public static final void m11968c2(LockActivity lockActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.checkIfNull(activityResult, "it");
        lockActivity.m11965e2(activityResult, 170);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d2 */
    public static final void m11967d2(LockActivity lockActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(lockActivity, "this$0");
        Intrinsics.checkIfNull(activityResult, "it");
        lockActivity.m11965e2(activityResult, 180);
    }

    /* renamed from: e2 */
    private final void m11965e2(ActivityResult activityResult, int i) {
        if (activityResult.m41351b() == -1) {
            ((LockViewModel) m22758I0()).m11907V0(true);
            if (i == 150) {
                C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9252k(null), 3, null);
            } else if (i == 170) {
                m11970b2();
                finish();
            } else if (i == 180) {
                CardRegistrationLandingActivity.m59b(this);
                finish();
            } else if (i != 190) {
            } else {
                BenefitsActivity.m25726a(this);
                finish();
            }
        }
    }

    /* renamed from: f2 */
    private final void m11963f2() {
        ((AbstractC11808i0) m22738w0()).f30513D.setEnabled(false);
        ((AbstractC11808i0) m22738w0()).f30521x.m37802s().setVisibility(8);
    }

    /* renamed from: h2 */
    private final void m11960h2(boolean z) {
        BottomSheetBehavior.m30367f0(((AbstractC11808i0) m22738w0()).f30521x.m37802s()).m30402I0(z ? 3 : 4);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m11953r1(LockActivity lockActivity, ActivityResult activityResult) {
        m11990J1(lockActivity, activityResult);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m11952s1(LockActivity lockActivity, ActivityResult activityResult) {
        m11988K1(lockActivity, activityResult);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m11950t1(AbstractC11808i0 abstractC11808i0, LockActivity lockActivity, List list) {
        m11977U1(abstractC11808i0, lockActivity, list);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m11949u1(LockActivity lockActivity, View view) {
        m11981Q1(lockActivity, view);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m11948v1(LockActivity lockActivity, AbstractC11808i0 abstractC11808i0, Boolean bool) {
        m11975W1(lockActivity, abstractC11808i0, bool);
    }

    /* renamed from: w1 */
    public static /* synthetic */ void m11947w1(LockActivity lockActivity, ActivityResult activityResult) {
        m11992I1(lockActivity, activityResult);
    }

    /* renamed from: x1 */
    public static /* synthetic */ void m11944x1(LockActivity lockActivity, ActivityResult activityResult) {
        m11984O1(lockActivity, activityResult);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m11943y1(LockActivity lockActivity, View view) {
        m11980R1(lockActivity, view);
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m11942z1(LockActivity lockActivity, Boolean bool) {
        m11976V1(lockActivity, bool);
    }

    /* renamed from: A */
    public void m12002A(String str) {
        Intrinsics.isThisObjectNull(str, "itemQuery");
        ((LockViewModel) m22758I0()).m11884p0(str);
    }

    /* renamed from: B */
    public SpeechRecognizer m12000B() {
        return (SpeechRecognizer) this.f24331r0.getValue();
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11991J0() {
        return C6450z.m20906b(LockViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11989K0() {
        return new C9244c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L1 */
    public C8614a mo42216v0() {
        return new C8614a();
    }

    /* renamed from: N1 */
    public final ViewModelFactoryByInjection m11985N1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24320g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: T1 */
    public void m11956n1(final AbstractC11808i0 abstractC11808i0, LockViewModel lockViewModel) {
        Intrinsics.isThisObjectNull(abstractC11808i0, "binding");
        Intrinsics.isThisObjectNull(lockViewModel, "viewModel");
        super.m34589n1(abstractC11808i0, lockViewModel);
        C1112b0.m38465J0(abstractC11808i0.f30516G, "TRANSITION_IMAGE");
        AbstractC11691b6 abstractC11691b6 = abstractC11808i0.f30521x;
        Intrinsics.checkIfNull(abstractC11691b6, BuildConfig.VERSION_NAME);
        m11982P1(abstractC11691b6, lockViewModel);
        lockViewModel.m11916N0().mo171i(this, new InterfaceC1440f0() { // from class: fk.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LockActivity.m11975W1(LockActivity.this, abstractC11808i0, (Boolean) obj);
            }
        });
        lockViewModel.m11926D0().mo171i(this, new InterfaceC1440f0() { // from class: fk.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LockActivity.m11977U1(AbstractC11808i0.this, this, (List) obj);
            }
        });
        lockViewModel.m11912R0().mo171i(this, new InterfaceC1440f0() { // from class: fk.l
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LockActivity.m11976V1(LockActivity.this, (Boolean) obj);
            }
        });
        lockViewModel.m11915O0().mo171i(this, new EventObserver(new C9250i()));
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_VERSION_CONTROL")) {
            z = false;
        }
        if (z) {
            m11963f2();
        }
    }

    /* renamed from: X1 */
    public SpeechRecognizer m11974X1(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41721f(this, activityC0325c);
    }

    /* renamed from: Y1 */
    public AbstractC11832j6 m11973Y1(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41720g(this, activityC0325c);
    }

    /* renamed from: Z1 */
    public DialogC3502a m11972Z1(ActivityC0325c activityC0325c) {
        return SpeechRecognizerBehavior.C0167a.m41719h(this, activityC0325c);
    }

    /* renamed from: a2 */
    public Object m11971a2(ActivityC0325c activityC0325c, InterfaceC1886d interfaceC1886d) {
        return SpeechRecognizerBehavior.C0167a.m41714m(this, activityC0325c, interfaceC1886d);
    }

    /* renamed from: c */
    public boolean m11969c() {
        return this.f24332s0;
    }

    /* renamed from: e */
    public void m11966e(boolean z) {
        this.f24332s0 = z;
    }

    /* renamed from: f */
    public void m11964f() {
        SpeechRecognizerBehavior.C0167a.m41706u(this);
    }

    /* renamed from: g */
    public void m11962g() {
        m11961g2(this);
    }

    /* renamed from: g2 */
    public void m11961g2(ActivityC0325c activityC0325c) {
        SpeechRecognizerBehavior.C0167a.m41705v(this, activityC0325c);
    }

    /* renamed from: k1 */
    protected List m11959k1() {
        List m194j;
        m194j = C13780s.m194j(C2142f.f6177a, C2146h.f6181a);
        return m194j;
    }

    /* renamed from: m */
    public DialogC3502a m11958m() {
        return (DialogC3502a) this.f24330q0.getValue();
    }

    /* renamed from: m1 */
    public void m11957m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (Intrinsics.equals(abstractC13816c, C13870l1.f34987a)) {
            InsertPinActivity.m14936b(this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13913v2.f35034a)) {
            InsertPinActivity.m14937a(this.f24323j0, this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13905t2.f35026a)) {
            InsertPinActivity.m14937a(this.f24325l0, this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13890q.f35011a)) {
            InsertPinActivity.m14937a(this.f24324k0, this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13833f2.f34941a)) {
            InsertPinActivity.m14937a(this.f24326m0, this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13909u2.f35030a)) {
            InsertPinActivity.m14937a(this.f24327n0, this, (LoginFlowData) c13182l.m1459d());
        } else if (Intrinsics.equals(abstractC13816c, C13869l0.f34986a)) {
            finish();
        }
    }

    public void onBackPressed() {
    }

    public void onBeginningOfSpeech() {
        SpeechRecognizerBehavior.C0167a.m41713n(this);
    }

    public void onBufferReceived(byte[] bArr) {
    }

    protected void onDestroy() {
        try {
            m12000B().destroy();
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
        m11951t();
        if (isFinishing()) {
            return;
        }
        ((LockViewModel) m22758I0()).m11907V0(false);
    }

    public void onReadyForSpeech(Bundle bundle) {
        SpeechRecognizerBehavior.C0167a.m41709r(this, bundle);
    }

    public void onResults(Bundle bundle) {
        SpeechRecognizerBehavior.C0167a.m41708s(this, bundle);
    }

    public void onRmsChanged(float f) {
    }

    /* renamed from: q */
    public String m11955q() {
        return this.f24333t0;
    }

    /* renamed from: r */
    public void m11954r(String str) {
        Intrinsics.isThisObjectNull(str, "<set-?>");
        this.f24333t0 = str;
    }

    /* renamed from: t */
    public void m11951t() {
        SpeechRecognizerBehavior.C0167a.m41722e(this);
    }

    /* renamed from: x */
    public AbstractC11832j6 m11946x() {
        return (AbstractC11832j6) this.f24329p0.getValue();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_lock;
    }
}
