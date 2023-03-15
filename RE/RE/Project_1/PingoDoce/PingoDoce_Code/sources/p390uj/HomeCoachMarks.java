package p390uj;

import android.app.Activity;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.core.content.C0928a;
import androidx.core.view.C1112b0;
import androidx.databinding.C1275f;
import bd.InterfaceC1886d;
import be.UtilsExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.lang.ref.WeakReference;
import java.util.List;
import jm.C6537a;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p336rc.InterfaceC9849a;
import p336rc.Spotlight;
import p336rc.Target;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p407vj.DefaultStoreActivity;
import p426wg.AbstractC11737e0;
import p426wg.AbstractC11948p7;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import pt.pingodoce.app.presentation.home.HomeActivity;
import pt.pingodoce.app.presentation.home.HomeViewModel;
import sc.RippleEffect;
import tc.RoundedRectangle;
import td.C10565r0;
import td.InterfaceC10524i0;

/* renamed from: uj.w */
/* loaded from: classes2.dex */
public interface HomeCoachMarks {

    /* compiled from: HomeCoachMarks.kt */
    /* renamed from: uj.w$a */
    /* loaded from: classes2.dex */
    public static final class C10938a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        /* renamed from: uj.w$a$a */
        /* loaded from: classes2.dex */
        public static final class C10939a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            public static final C10939a f28183w = new C10939a();

            C10939a() {
                super(0);
            }

            /* renamed from: a */
            public final void m6732a() {
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m6732a();
                return C13195u.f34156a;
            }
        }

        /* compiled from: HomeCoachMarks.kt */
        /* renamed from: uj.w$a$b */
        /* loaded from: classes2.dex */
        public static final class C10940b implements InterfaceC9849a {

            /* renamed from: a */
            final /* synthetic */ InterfaceC6097a f28184a;

            C10940b(InterfaceC6097a interfaceC6097a) {
                this.f28184a = interfaceC6097a;
            }

            /* renamed from: a */
            public void mo9829a() {
                this.f28184a.mo42214q();
            }

            /* renamed from: b */
            public void mo9828b() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$DefaultImpls", m20196f = "HomeCoachMarks.kt", m20195l = {137, 143}, m20194m = "showCoachMarksForBenefits")
        /* renamed from: uj.w$a$c */
        /* loaded from: classes2.dex */
        public static final class C10941c extends AbstractC6757d {

            /* renamed from: A */
            Object f28185A;

            /* renamed from: B */
            /* synthetic */ Object f28186B;

            /* renamed from: C */
            int f28187C;

            /* renamed from: w */
            Object f28188w;

            /* renamed from: x */
            Object f28189x;

            /* renamed from: y */
            Object f28190y;

            /* renamed from: z */
            Object f28191z;

            C10941c(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f28186B = obj;
                this.f28187C |= Integer.MIN_VALUE;
                return C10938a.m6735d(null, null, null, null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForBenefits$2", m20196f = "HomeCoachMarks.kt", m20195l = {139, 141}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$d */
        /* loaded from: classes2.dex */
        public static final class C10942d extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f28192x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28193y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10942d(AbstractC11737e0 abstractC11737e0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28193y = abstractC11737e0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10942d(this.f28193y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10942d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f28192x;
                if (i == 0 || i == 1) {
                    C13186n.m1453b(obj);
                    while (this.f28193y.f30167A.getWidth() == 0) {
                        this.f28192x = 1;
                        if (C10565r0.m7677a(100L, this) == m34636d) {
                            return m34636d;
                        }
                    }
                    this.f28192x = 2;
                    if (C10565r0.m7677a(300L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForBenefits$3", m20196f = "HomeCoachMarks.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$e */
        /* loaded from: classes2.dex */
        public static final class C10943e extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ HomeActivity f28194A;

            /* renamed from: B */
            final /* synthetic */ HomeCoachMarks f28195B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6097a f28196C;

            /* renamed from: x */
            int f28197x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28198y;

            /* renamed from: z */
            final /* synthetic */ HomeViewModel f28199z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeCoachMarks.kt */
            /* renamed from: uj.w$a$e$a */
            /* loaded from: classes2.dex */
            public static final class View$OnClickListenerC10944a implements View.OnClickListener {

                /* renamed from: w */
                final /* synthetic */ HomeActivity f28200w;

                View$OnClickListenerC10944a(HomeActivity homeActivity) {
                    this.f28200w = homeActivity;
                }

                public final void onClick(View view) {
                    Spotlight m12231c2 = this.f28200w.m12231c2();
                    if (m12231c2 != null) {
                        m12231c2.m9815k();
                    }
                }
            }

            /* compiled from: View.kt */
            /* renamed from: uj.w$a$e$b */
            /* loaded from: classes2.dex */
            public static final class View$OnLayoutChangeListenerC10945b implements View.OnLayoutChangeListener {

                /* renamed from: a */
                final /* synthetic */ AbstractC11737e0 f28201a;

                /* renamed from: b */
                final /* synthetic */ HomeViewModel f28202b;

                /* renamed from: c */
                final /* synthetic */ HomeActivity f28203c;

                /* renamed from: d */
                final /* synthetic */ HomeCoachMarks f28204d;

                /* renamed from: e */
                final /* synthetic */ InterfaceC6097a f28205e;

                public View$OnLayoutChangeListenerC10945b(AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks, InterfaceC6097a interfaceC6097a) {
                    this.f28201a = abstractC11737e0;
                    this.f28202b = homeViewModel;
                    this.f28203c = homeActivity;
                    this.f28204d = homeCoachMarks;
                    this.f28205e = interfaceC6097a;
                }

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    List m202b;
                    Intrinsics.isThisObjectNull(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    Target.C9864a c9864a = new Target.C9864a();
                    MaterialCardView materialCardView = this.f28201a.f30167A;
                    Intrinsics.checkIfNull(materialCardView, "binding.benefitsMaterialCardView");
                    Target.C9864a m9787d = c9864a.m9787d(materialCardView);
                    MaterialCardView materialCardView2 = this.f28201a.f30167A;
                    Target.C9864a m9783h = m9787d.m9783h(new RoundedRectangle(materialCardView2.getHeight(), materialCardView2.getWidth(), 20.0f, 0L, null, 24, null));
                    float f = 200.0f * (Intrinsics.equals(this.f28202b.m12146W0().mo172f(), Boolean.TRUE) ? 3 : 1);
                    ResourcesProvider m6898a = C10841b.m6898a(this.f28203c);
                    TypedValue typedValue = new TypedValue();
                    new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                    Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                    AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(this.f28203c.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                    abstractC11948p7.f31212y.setText(this.f28203c.getString(C2336R.string.lbl_home_benefits_coachmark));
                    abstractC11948p7.f31211x.setText(this.f28203c.getString(C2336R.string.btn_ok_alt));
                    abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10944a(this.f28203c));
                    View m37802s = abstractC11948p7.m37802s();
                    Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                    Target m9790a = m9786e.m9784g(m37802s).m9790a();
                    HomeCoachMarks homeCoachMarks = this.f28204d;
                    HomeActivity homeActivity = this.f28203c;
                    AbstractC11737e0 abstractC11737e0 = this.f28201a;
                    m202b = CollectionsJVM.m202b(m9790a);
                    C10938a.m6738a(homeCoachMarks, homeActivity, abstractC11737e0, m202b, this.f28205e);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10943e(AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28198y = abstractC11737e0;
                this.f28199z = homeViewModel;
                this.f28194A = homeActivity;
                this.f28195B = homeCoachMarks;
                this.f28196C = interfaceC6097a;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10943e(this.f28198y, this.f28199z, this.f28194A, this.f28195B, this.f28196C, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10943e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                List m202b;
                C2116d.m34636d();
                if (this.f28197x == 0) {
                    C13186n.m1453b(obj);
                    MaterialCardView materialCardView = this.f28198y.f30167A;
                    Intrinsics.checkIfNull(materialCardView, "binding.benefitsMaterialCardView");
                    AbstractC11737e0 abstractC11737e0 = this.f28198y;
                    HomeViewModel homeViewModel = this.f28199z;
                    HomeActivity homeActivity = this.f28194A;
                    HomeCoachMarks homeCoachMarks = this.f28195B;
                    InterfaceC6097a interfaceC6097a = this.f28196C;
                    if (C1112b0.m38446W(materialCardView) && !materialCardView.isLayoutRequested()) {
                        Target.C9864a c9864a = new Target.C9864a();
                        MaterialCardView materialCardView2 = abstractC11737e0.f30167A;
                        Intrinsics.checkIfNull(materialCardView2, "binding.benefitsMaterialCardView");
                        Target.C9864a m9787d = c9864a.m9787d(materialCardView2);
                        MaterialCardView materialCardView3 = abstractC11737e0.f30167A;
                        Target.C9864a m9783h = m9787d.m9783h(new RoundedRectangle(materialCardView3.getHeight(), materialCardView3.getWidth(), 20.0f, 0L, null, 24, null));
                        float f = (Intrinsics.equals(homeViewModel.m12146W0().mo172f(), C6755b.m20201a(true)) ? 3 : 1) * 200.0f;
                        ResourcesProvider m6898a = C10841b.m6898a(homeActivity);
                        TypedValue typedValue = new TypedValue();
                        new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                        Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                        AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(homeActivity.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                        abstractC11948p7.f31212y.setText(homeActivity.getString(C2336R.string.lbl_home_benefits_coachmark));
                        abstractC11948p7.f31211x.setText(homeActivity.getString(C2336R.string.btn_ok_alt));
                        abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10944a(homeActivity));
                        View m37802s = abstractC11948p7.m37802s();
                        Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                        m202b = CollectionsJVM.m202b(m9786e.m9784g(m37802s).m9790a());
                        C10938a.m6738a(homeCoachMarks, homeActivity, abstractC11737e0, m202b, interfaceC6097a);
                    } else {
                        materialCardView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC10945b(abstractC11737e0, homeViewModel, homeActivity, homeCoachMarks, interfaceC6097a));
                    }
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$DefaultImpls", m20196f = "HomeCoachMarks.kt", m20195l = {33, 38}, m20194m = "showCoachMarksForDefaultStore")
        /* renamed from: uj.w$a$f */
        /* loaded from: classes2.dex */
        public static final class C10946f extends AbstractC6757d {

            /* renamed from: A */
            int f28206A;

            /* renamed from: w */
            Object f28207w;

            /* renamed from: x */
            Object f28208x;

            /* renamed from: y */
            Object f28209y;

            /* renamed from: z */
            /* synthetic */ Object f28210z;

            C10946f(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f28210z = obj;
                this.f28206A |= Integer.MIN_VALUE;
                return C10938a.m6734e(null, null, null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForDefaultStore$2", m20196f = "HomeCoachMarks.kt", m20195l = {35}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$g */
        /* loaded from: classes2.dex */
        public static final class C10947g extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f28211x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28212y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10947g(AbstractC11737e0 abstractC11737e0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28212y = abstractC11737e0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10947g(this.f28212y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10947g) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f28211x;
                if (i != 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                while (this.f28212y.f30185S.getWidth() == 0) {
                    this.f28211x = 1;
                    if (C10565r0.m7677a(100L, this) == m34636d) {
                        return m34636d;
                    }
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForDefaultStore$3", m20196f = "HomeCoachMarks.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$h */
        /* loaded from: classes2.dex */
        public static final class C10948h extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ HomeCoachMarks f28213A;

            /* renamed from: x */
            int f28214x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28215y;

            /* renamed from: z */
            final /* synthetic */ HomeActivity f28216z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeCoachMarks.kt */
            /* renamed from: uj.w$a$h$a */
            /* loaded from: classes2.dex */
            public static final class View$OnClickListenerC10949a implements View.OnClickListener {

                /* renamed from: w */
                final /* synthetic */ HomeActivity f28217w;

                View$OnClickListenerC10949a(HomeActivity homeActivity) {
                    this.f28217w = homeActivity;
                }

                public final void onClick(View view) {
                    DefaultStoreActivity.m5308a(this.f28217w.m12232b2(), this.f28217w);
                }
            }

            /* compiled from: View.kt */
            /* renamed from: uj.w$a$h$b */
            /* loaded from: classes2.dex */
            public static final class View$OnLayoutChangeListenerC10950b implements View.OnLayoutChangeListener {

                /* renamed from: a */
                final /* synthetic */ AbstractC11737e0 f28218a;

                /* renamed from: b */
                final /* synthetic */ HomeActivity f28219b;

                /* renamed from: c */
                final /* synthetic */ HomeCoachMarks f28220c;

                public View$OnLayoutChangeListenerC10950b(AbstractC11737e0 abstractC11737e0, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks) {
                    this.f28218a = abstractC11737e0;
                    this.f28219b = homeActivity;
                    this.f28220c = homeCoachMarks;
                }

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    List m202b;
                    Intrinsics.isThisObjectNull(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    Target.C9864a c9864a = new Target.C9864a();
                    TextView textView = this.f28218a.f30185S;
                    Intrinsics.checkIfNull(textView, "binding.storePickerTextView");
                    Target.C9864a m9783h = c9864a.m9787d(textView).m9783h(new RoundedRectangle(this.f28218a.f30185S.getHeight() + UtilsExtensions.m35167e(10), UtilsExtensions.m35167e(10) + this.f28218a.f30185S.getWidth(), 150.0f, 0L, null, 24, null));
                    ResourcesProvider m6898a = C10841b.m6898a(this.f28219b);
                    TypedValue typedValue = new TypedValue();
                    new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                    Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                    AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(this.f28219b.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                    abstractC11948p7.f31212y.setText(this.f28219b.getString(C2336R.string.lbl_home_store_coachmark_toggle));
                    abstractC11948p7.f31211x.setText(this.f28219b.getString(C2336R.string.btn_store));
                    abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10949a(this.f28219b));
                    View m37802s = abstractC11948p7.m37802s();
                    Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                    Target m9790a = m9786e.m9784g(m37802s).m9790a();
                    HomeCoachMarks homeCoachMarks = this.f28220c;
                    HomeActivity homeActivity = this.f28219b;
                    AbstractC11737e0 abstractC11737e0 = this.f28218a;
                    m202b = CollectionsJVM.m202b(m9790a);
                    C10938a.m6736c(homeCoachMarks, homeActivity, abstractC11737e0, m202b, null, 4, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10948h(AbstractC11737e0 abstractC11737e0, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28215y = abstractC11737e0;
                this.f28216z = homeActivity;
                this.f28213A = homeCoachMarks;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10948h(this.f28215y, this.f28216z, this.f28213A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10948h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                List m202b;
                C2116d.m34636d();
                if (this.f28214x == 0) {
                    C13186n.m1453b(obj);
                    TextView textView = this.f28215y.f30185S;
                    Intrinsics.checkIfNull(textView, "binding.storePickerTextView");
                    AbstractC11737e0 abstractC11737e0 = this.f28215y;
                    HomeActivity homeActivity = this.f28216z;
                    HomeCoachMarks homeCoachMarks = this.f28213A;
                    if (C1112b0.m38446W(textView) && !textView.isLayoutRequested()) {
                        Target.C9864a c9864a = new Target.C9864a();
                        TextView textView2 = abstractC11737e0.f30185S;
                        Intrinsics.checkIfNull(textView2, "binding.storePickerTextView");
                        Target.C9864a m9783h = c9864a.m9787d(textView2).m9783h(new RoundedRectangle(abstractC11737e0.f30185S.getHeight() + UtilsExtensions.m35167e(10), abstractC11737e0.f30185S.getWidth() + UtilsExtensions.m35167e(10), 150.0f, 0L, null, 24, null));
                        ResourcesProvider m6898a = C10841b.m6898a(homeActivity);
                        TypedValue typedValue = new TypedValue();
                        new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                        Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, 150.0f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                        AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(homeActivity.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                        abstractC11948p7.f31212y.setText(homeActivity.getString(C2336R.string.lbl_home_store_coachmark_toggle));
                        abstractC11948p7.f31211x.setText(homeActivity.getString(C2336R.string.btn_store));
                        abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10949a(homeActivity));
                        View m37802s = abstractC11948p7.m37802s();
                        Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                        m202b = CollectionsJVM.m202b(m9786e.m9784g(m37802s).m9790a());
                        C10938a.m6736c(homeCoachMarks, homeActivity, abstractC11737e0, m202b, null, 4, null);
                    } else {
                        textView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC10950b(abstractC11737e0, homeActivity, homeCoachMarks));
                    }
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$DefaultImpls", m20196f = "HomeCoachMarks.kt", m20195l = {87, C0868i.f2968t0}, m20194m = "showCoachMarksForLoyalty")
        /* renamed from: uj.w$a$i */
        /* loaded from: classes2.dex */
        public static final class C10951i extends AbstractC6757d {

            /* renamed from: A */
            Object f28221A;

            /* renamed from: B */
            /* synthetic */ Object f28222B;

            /* renamed from: C */
            int f28223C;

            /* renamed from: w */
            Object f28224w;

            /* renamed from: x */
            Object f28225x;

            /* renamed from: y */
            Object f28226y;

            /* renamed from: z */
            Object f28227z;

            C10951i(InterfaceC1886d interfaceC1886d) {
                super(interfaceC1886d);
            }

            public final Object invokeSuspend(Object obj) {
                this.f28222B = obj;
                this.f28223C |= Integer.MIN_VALUE;
                return C10938a.m6733f(null, null, null, null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForLoyalty$2", m20196f = "HomeCoachMarks.kt", m20195l = {89, 91}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$j */
        /* loaded from: classes2.dex */
        public static final class C10952j extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f28228x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28229y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10952j(AbstractC11737e0 abstractC11737e0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28229y = abstractC11737e0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10952j(this.f28229y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10952j) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f28228x;
                if (i == 0 || i == 1) {
                    C13186n.m1453b(obj);
                    while (this.f28229y.f30169C.getWidth() == 0) {
                        this.f28228x = 1;
                        if (C10565r0.m7677a(100L, this) == m34636d) {
                            return m34636d;
                        }
                    }
                    this.f28228x = 2;
                    if (C10565r0.m7677a(300L, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeCoachMarks.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.home.HomeCoachMarks$showCoachMarksForLoyalty$3", m20196f = "HomeCoachMarks.kt", m20195l = {}, m20194m = "invokeSuspend")
        /* renamed from: uj.w$a$k */
        /* loaded from: classes2.dex */
        public static final class C10953k extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ HomeActivity f28230A;

            /* renamed from: B */
            final /* synthetic */ HomeCoachMarks f28231B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC6097a f28232C;

            /* renamed from: x */
            int f28233x;

            /* renamed from: y */
            final /* synthetic */ AbstractC11737e0 f28234y;

            /* renamed from: z */
            final /* synthetic */ HomeViewModel f28235z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeCoachMarks.kt */
            /* renamed from: uj.w$a$k$a */
            /* loaded from: classes2.dex */
            public static final class View$OnClickListenerC10954a implements View.OnClickListener {

                /* renamed from: w */
                final /* synthetic */ HomeActivity f28236w;

                View$OnClickListenerC10954a(HomeActivity homeActivity) {
                    this.f28236w = homeActivity;
                }

                public final void onClick(View view) {
                    Spotlight m12231c2 = this.f28236w.m12231c2();
                    if (m12231c2 != null) {
                        m12231c2.m9815k();
                    }
                }
            }

            /* compiled from: View.kt */
            /* renamed from: uj.w$a$k$b */
            /* loaded from: classes2.dex */
            public static final class View$OnLayoutChangeListenerC10955b implements View.OnLayoutChangeListener {

                /* renamed from: a */
                final /* synthetic */ AbstractC11737e0 f28237a;

                /* renamed from: b */
                final /* synthetic */ HomeViewModel f28238b;

                /* renamed from: c */
                final /* synthetic */ HomeActivity f28239c;

                /* renamed from: d */
                final /* synthetic */ HomeCoachMarks f28240d;

                /* renamed from: e */
                final /* synthetic */ InterfaceC6097a f28241e;

                public View$OnLayoutChangeListenerC10955b(AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks, InterfaceC6097a interfaceC6097a) {
                    this.f28237a = abstractC11737e0;
                    this.f28238b = homeViewModel;
                    this.f28239c = homeActivity;
                    this.f28240d = homeCoachMarks;
                    this.f28241e = interfaceC6097a;
                }

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    List m202b;
                    Intrinsics.isThisObjectNull(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    Target.C9864a c9864a = new Target.C9864a();
                    MaterialCardView materialCardView = this.f28237a.f30169C;
                    Intrinsics.checkIfNull(materialCardView, "binding.bpBenefitsMaterialCardView");
                    Target.C9864a m9787d = c9864a.m9787d(materialCardView);
                    MaterialCardView materialCardView2 = this.f28237a.f30169C;
                    Target.C9864a m9783h = m9787d.m9783h(new RoundedRectangle(materialCardView2.getHeight(), materialCardView2.getWidth(), 20.0f, 0L, null, 24, null));
                    float f = 200.0f * (Intrinsics.equals(this.f28238b.m12146W0().mo172f(), Boolean.TRUE) ? 3 : 1);
                    ResourcesProvider m6898a = C10841b.m6898a(this.f28239c);
                    TypedValue typedValue = new TypedValue();
                    new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                    Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                    AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(this.f28239c.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                    abstractC11948p7.f31212y.setText(this.f28239c.getString(C2336R.string.lbl_home_loyalty_coachmark));
                    abstractC11948p7.f31211x.setText(this.f28239c.getString(C2336R.string.btn_ok_alt));
                    abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10954a(this.f28239c));
                    View m37802s = abstractC11948p7.m37802s();
                    Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                    Target m9790a = m9786e.m9784g(m37802s).m9790a();
                    HomeCoachMarks homeCoachMarks = this.f28240d;
                    HomeActivity homeActivity = this.f28239c;
                    AbstractC11737e0 abstractC11737e0 = this.f28237a;
                    m202b = CollectionsJVM.m202b(m9790a);
                    C10938a.m6738a(homeCoachMarks, homeActivity, abstractC11737e0, m202b, this.f28241e);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10953k(AbstractC11737e0 abstractC11737e0, HomeViewModel homeViewModel, HomeActivity homeActivity, HomeCoachMarks homeCoachMarks, InterfaceC6097a interfaceC6097a, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f28234y = abstractC11737e0;
                this.f28235z = homeViewModel;
                this.f28230A = homeActivity;
                this.f28231B = homeCoachMarks;
                this.f28232C = interfaceC6097a;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10953k(this.f28234y, this.f28235z, this.f28230A, this.f28231B, this.f28232C, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10953k) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                List m202b;
                C2116d.m34636d();
                if (this.f28233x == 0) {
                    C13186n.m1453b(obj);
                    MaterialCardView materialCardView = this.f28234y.f30169C;
                    Intrinsics.checkIfNull(materialCardView, "binding.bpBenefitsMaterialCardView");
                    AbstractC11737e0 abstractC11737e0 = this.f28234y;
                    HomeViewModel homeViewModel = this.f28235z;
                    HomeActivity homeActivity = this.f28230A;
                    HomeCoachMarks homeCoachMarks = this.f28231B;
                    InterfaceC6097a interfaceC6097a = this.f28232C;
                    if (C1112b0.m38446W(materialCardView) && !materialCardView.isLayoutRequested()) {
                        Target.C9864a c9864a = new Target.C9864a();
                        MaterialCardView materialCardView2 = abstractC11737e0.f30169C;
                        Intrinsics.checkIfNull(materialCardView2, "binding.bpBenefitsMaterialCardView");
                        Target.C9864a m9787d = c9864a.m9787d(materialCardView2);
                        MaterialCardView materialCardView3 = abstractC11737e0.f30169C;
                        Target.C9864a m9783h = m9787d.m9783h(new RoundedRectangle(materialCardView3.getHeight(), materialCardView3.getWidth(), 20.0f, 0L, null, 24, null));
                        float f = (Intrinsics.equals(homeViewModel.m12146W0().mo172f(), C6755b.m20201a(true)) ? 3 : 1) * 200.0f;
                        ResourcesProvider m6898a = C10841b.m6898a(homeActivity);
                        TypedValue typedValue = new TypedValue();
                        new ContextThemeWrapper(m6898a.m6899a(), 2131951659).getTheme().resolveAttribute(C2336R.attr.colorPrimary, typedValue, true);
                        Target.C9864a m9786e = m9783h.m9786e(new RippleEffect(0.0f, f, C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId), 1500L, null, 1, 16, null));
                        AbstractC11948p7 abstractC11948p7 = (AbstractC11948p7) C1275f.m37764e(homeActivity.getLayoutInflater(), C2336R.layout.view_coachmarks_default, null, false);
                        abstractC11948p7.f31212y.setText(homeActivity.getString(C2336R.string.lbl_home_loyalty_coachmark));
                        abstractC11948p7.f31211x.setText(homeActivity.getString(C2336R.string.btn_ok_alt));
                        abstractC11948p7.f31211x.setOnClickListener(new View$OnClickListenerC10954a(homeActivity));
                        View m37802s = abstractC11948p7.m37802s();
                        Intrinsics.checkIfNull(m37802s, "inflate<ViewCoachmarksDe…                   }.root");
                        m202b = CollectionsJVM.m202b(m9786e.m9784g(m37802s).m9790a());
                        C10938a.m6738a(homeCoachMarks, homeActivity, abstractC11737e0, m202b, interfaceC6097a);
                    } else {
                        materialCardView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC10955b(abstractC11737e0, homeViewModel, homeActivity, homeCoachMarks, interfaceC6097a));
                    }
                    return C13195u.f34156a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* renamed from: a */
        public static final /* synthetic */ void m6738a(HomeCoachMarks homeCoachMarks, HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, List list, InterfaceC6097a interfaceC6097a) {
            m6737b(homeCoachMarks, homeActivity, abstractC11737e0, list, interfaceC6097a);
        }

        /* renamed from: b */
        private static void m6737b(HomeCoachMarks homeCoachMarks, HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, List list, InterfaceC6097a interfaceC6097a) {
            if (list.isEmpty()) {
                C6537a.m20677b("Targets list is empty and can't be", new Object[0]);
                return;
            }
            Activity activity = (Activity) new WeakReference(homeActivity).get();
            if (activity != null) {
                Spotlight.C9851a m9805g = new Spotlight.C9851a(activity).m9805g(list);
                ResourcesProvider m6898a = C10841b.m6898a(homeActivity);
                TypedValue typedValue = new TypedValue();
                new ContextThemeWrapper(m6898a.m6899a(), 2131951658).getTheme().resolveAttribute(C2336R.attr.overlayColor, typedValue, true);
                homeActivity.m12219n2(m9805g.m9809c(typedValue.resourceId).m9807e(500L).m9810b(new DecelerateInterpolator(2.0f)).m9808d((ViewGroup) abstractC11737e0.m37802s()).m9806f(new C10940b(interfaceC6097a)).m9811a());
            }
            Spotlight m12231c2 = homeActivity.m12231c2();
            if (m12231c2 != null) {
                m12231c2.m9813m();
            }
        }

        /* renamed from: c */
        public static /* synthetic */ void m6736c(HomeCoachMarks homeCoachMarks, HomeActivity homeActivity, AbstractC11737e0 abstractC11737e0, List list, InterfaceC6097a interfaceC6097a, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setCoachMarkTargets");
            }
            if ((i & 4) != 0) {
                interfaceC6097a = C10939a.f28183w;
            }
            m6737b(homeCoachMarks, homeActivity, abstractC11737e0, list, interfaceC6097a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object m6735d(p390uj.HomeCoachMarks r15, pt.pingodoce.app.presentation.home.HomeActivity r16, p426wg.AbstractC11737e0 r17, pt.pingodoce.app.presentation.home.HomeViewModel r18, id.InterfaceC6097a r19, bd.InterfaceC1886d r20) {
            /*
                r0 = r17
                r1 = r20
                boolean r2 = r1 instanceof p390uj.HomeCoachMarks.C10938a.C10941c
                if (r2 == 0) goto L17
                r2 = r1
                uj.w$a$c r2 = (p390uj.HomeCoachMarks.C10938a.C10941c) r2
                int r3 = r2.f28187C
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f28187C = r3
                goto L1c
            L17:
                uj.w$a$c r2 = new uj.w$a$c
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f28186B
                java.lang.Object r3 = cd.C2111b.m34640d()
                int r4 = r2.f28187C
                r5 = 2
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L57
                if (r4 == r6) goto L3a
                if (r4 != r5) goto L32
                p468yc.C13186n.m1453b(r1)
                goto L9f
            L32:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L3a:
                java.lang.Object r0 = r2.f28185A
                id.a r0 = (id.InterfaceC6097a) r0
                java.lang.Object r4 = r2.f28191z
                pt.pingodoce.app.presentation.home.a r4 = (pt.pingodoce.app.presentation.home.HomeViewModel) r4
                java.lang.Object r6 = r2.f28190y
                wg.e0 r6 = (p426wg.AbstractC11737e0) r6
                java.lang.Object r8 = r2.f28189x
                pt.pingodoce.app.presentation.home.HomeActivity r8 = (pt.pingodoce.app.presentation.home.HomeActivity) r8
                java.lang.Object r9 = r2.f28188w
                uj.w r9 = (p390uj.HomeCoachMarks) r9
                p468yc.C13186n.m1453b(r1)
                r13 = r0
                r10 = r4
                r11 = r8
                r12 = r9
                r9 = r6
                goto L81
            L57:
                p468yc.C13186n.m1453b(r1)
                td.e0 r1 = td.C10587w0.m7621a()
                uj.w$a$d r4 = new uj.w$a$d
                r4.<init>(r0, r7)
                r8 = r15
                r2.f28188w = r8
                r9 = r16
                r2.f28189x = r9
                r2.f28190y = r0
                r10 = r18
                r2.f28191z = r10
                r11 = r19
                r2.f28185A = r11
                r2.f28187C = r6
                java.lang.Object r1 = kotlinx.coroutines.C6769b.m20164g(r1, r4, r2)
                if (r1 != r3) goto L7d
                return r3
            L7d:
                r12 = r8
                r13 = r11
                r11 = r9
                r9 = r0
            L81:
                td.c2 r0 = td.C10587w0.m7619c()
                uj.w$a$e r1 = new uj.w$a$e
                r14 = 0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r2.f28188w = r7
                r2.f28189x = r7
                r2.f28190y = r7
                r2.f28191z = r7
                r2.f28185A = r7
                r2.f28187C = r5
                java.lang.Object r0 = kotlinx.coroutines.C6769b.m20164g(r0, r1, r2)
                if (r0 != r3) goto L9f
                return r3
            L9f:
                yc.u r0 = p468yc.C13195u.f34156a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p390uj.HomeCoachMarks.C10938a.m6735d(uj.w, pt.pingodoce.app.presentation.home.HomeActivity, wg.e0, pt.pingodoce.app.presentation.home.a, id.a, bd.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[RETURN] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object m6734e(p390uj.HomeCoachMarks r5, pt.pingodoce.app.presentation.home.HomeActivity r6, p426wg.AbstractC11737e0 r7, pt.pingodoce.app.presentation.home.HomeViewModel r8, bd.InterfaceC1886d r9) {
            /*
                boolean r8 = r9 instanceof p390uj.HomeCoachMarks.C10938a.C10946f
                if (r8 == 0) goto L13
                r8 = r9
                uj.w$a$f r8 = (p390uj.HomeCoachMarks.C10938a.C10946f) r8
                int r0 = r8.f28206A
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r0 & r1
                if (r2 == 0) goto L13
                int r0 = r0 - r1
                r8.f28206A = r0
                goto L18
            L13:
                uj.w$a$f r8 = new uj.w$a$f
                r8.<init>(r9)
            L18:
                java.lang.Object r9 = r8.f28210z
                java.lang.Object r0 = cd.C2111b.m34640d()
                int r1 = r8.f28206A
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L47
                if (r1 == r3) goto L35
                if (r1 != r2) goto L2d
                p468yc.C13186n.m1453b(r9)
                goto L7a
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                java.lang.Object r5 = r8.f28209y
                r7 = r5
                wg.e0 r7 = (p426wg.AbstractC11737e0) r7
                java.lang.Object r5 = r8.f28208x
                r6 = r5
                pt.pingodoce.app.presentation.home.HomeActivity r6 = (pt.pingodoce.app.presentation.home.HomeActivity) r6
                java.lang.Object r5 = r8.f28207w
                uj.w r5 = (p390uj.HomeCoachMarks) r5
                p468yc.C13186n.m1453b(r9)
                goto L62
            L47:
                p468yc.C13186n.m1453b(r9)
                td.e0 r9 = td.C10587w0.m7621a()
                uj.w$a$g r1 = new uj.w$a$g
                r1.<init>(r7, r4)
                r8.f28207w = r5
                r8.f28208x = r6
                r8.f28209y = r7
                r8.f28206A = r3
                java.lang.Object r9 = kotlinx.coroutines.C6769b.m20164g(r9, r1, r8)
                if (r9 != r0) goto L62
                return r0
            L62:
                td.c2 r9 = td.C10587w0.m7619c()
                uj.w$a$h r1 = new uj.w$a$h
                r1.<init>(r7, r6, r5, r4)
                r8.f28207w = r4
                r8.f28208x = r4
                r8.f28209y = r4
                r8.f28206A = r2
                java.lang.Object r5 = kotlinx.coroutines.C6769b.m20164g(r9, r1, r8)
                if (r5 != r0) goto L7a
                return r0
            L7a:
                yc.u r5 = p468yc.C13195u.f34156a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p390uj.HomeCoachMarks.C10938a.m6734e(uj.w, pt.pingodoce.app.presentation.home.HomeActivity, wg.e0, pt.pingodoce.app.presentation.home.a, bd.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e A[RETURN] */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object m6733f(p390uj.HomeCoachMarks r15, pt.pingodoce.app.presentation.home.HomeActivity r16, p426wg.AbstractC11737e0 r17, pt.pingodoce.app.presentation.home.HomeViewModel r18, id.InterfaceC6097a r19, bd.InterfaceC1886d r20) {
            /*
                r0 = r17
                r1 = r20
                boolean r2 = r1 instanceof p390uj.HomeCoachMarks.C10938a.C10951i
                if (r2 == 0) goto L17
                r2 = r1
                uj.w$a$i r2 = (p390uj.HomeCoachMarks.C10938a.C10951i) r2
                int r3 = r2.f28223C
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L17
                int r3 = r3 - r4
                r2.f28223C = r3
                goto L1c
            L17:
                uj.w$a$i r2 = new uj.w$a$i
                r2.<init>(r1)
            L1c:
                java.lang.Object r1 = r2.f28222B
                java.lang.Object r3 = cd.C2111b.m34640d()
                int r4 = r2.f28223C
                r5 = 2
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L57
                if (r4 == r6) goto L3a
                if (r4 != r5) goto L32
                p468yc.C13186n.m1453b(r1)
                goto L9f
            L32:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L3a:
                java.lang.Object r0 = r2.f28221A
                id.a r0 = (id.InterfaceC6097a) r0
                java.lang.Object r4 = r2.f28227z
                pt.pingodoce.app.presentation.home.a r4 = (pt.pingodoce.app.presentation.home.HomeViewModel) r4
                java.lang.Object r6 = r2.f28226y
                wg.e0 r6 = (p426wg.AbstractC11737e0) r6
                java.lang.Object r8 = r2.f28225x
                pt.pingodoce.app.presentation.home.HomeActivity r8 = (pt.pingodoce.app.presentation.home.HomeActivity) r8
                java.lang.Object r9 = r2.f28224w
                uj.w r9 = (p390uj.HomeCoachMarks) r9
                p468yc.C13186n.m1453b(r1)
                r13 = r0
                r10 = r4
                r11 = r8
                r12 = r9
                r9 = r6
                goto L81
            L57:
                p468yc.C13186n.m1453b(r1)
                td.e0 r1 = td.C10587w0.m7621a()
                uj.w$a$j r4 = new uj.w$a$j
                r4.<init>(r0, r7)
                r8 = r15
                r2.f28224w = r8
                r9 = r16
                r2.f28225x = r9
                r2.f28226y = r0
                r10 = r18
                r2.f28227z = r10
                r11 = r19
                r2.f28221A = r11
                r2.f28223C = r6
                java.lang.Object r1 = kotlinx.coroutines.C6769b.m20164g(r1, r4, r2)
                if (r1 != r3) goto L7d
                return r3
            L7d:
                r12 = r8
                r13 = r11
                r11 = r9
                r9 = r0
            L81:
                td.c2 r0 = td.C10587w0.m7619c()
                uj.w$a$k r1 = new uj.w$a$k
                r14 = 0
                r8 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14)
                r2.f28224w = r7
                r2.f28225x = r7
                r2.f28226y = r7
                r2.f28227z = r7
                r2.f28221A = r7
                r2.f28223C = r5
                java.lang.Object r0 = kotlinx.coroutines.C6769b.m20164g(r0, r1, r2)
                if (r0 != r3) goto L9f
                return r3
            L9f:
                yc.u r0 = p468yc.C13195u.f34156a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p390uj.HomeCoachMarks.C10938a.m6733f(uj.w, pt.pingodoce.app.presentation.home.HomeActivity, wg.e0, pt.pingodoce.app.presentation.home.a, id.a, bd.d):java.lang.Object");
        }
    }
}
