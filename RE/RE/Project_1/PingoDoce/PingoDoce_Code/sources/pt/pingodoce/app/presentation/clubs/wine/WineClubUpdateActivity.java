package pt.pingodoce.app.presentation.clubs.wine;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import be.UtilsExtensions;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import ee.MarginItemDecoration;
import fm.C5579c;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import lk.EnumC7070a;
import ne.EventObserver;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p185ji.WineClubListRegionAdapter;
import p185ji.WineClubListTypeAdapter;
import p206kk.TermsAndConditionsActivity;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11942p1;
import p468yc.C13182l;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.AbstractC13816c;
import p494zh.AppNavigationTypes;
import p494zh.C13820c3;
import p494zh.C13825d3;
import p494zh.C13839g3;
import p494zh.C13844h3;
import p494zh.C13849i3;
import p494zh.C13854j3;
import p494zh.C13859k3;
import pe.C8617d;
import pt.pingodoce.app.data.local.models.clubs.FormFieldOption;
import pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity;
import pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel;

/* compiled from: WineClubUpdateActivity.kt */
/* loaded from: classes2.dex */
public final class WineClubUpdateActivity extends FlowActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23755g0;

    /* renamed from: h0 */
    private WineClubListTypeAdapter f23756h0 = new WineClubListTypeAdapter(null, null, 3, null);

    /* renamed from: i0 */
    private WineClubListRegionAdapter f23757i0 = new WineClubListRegionAdapter(null, null, 3, null);

    /* renamed from: j0 */
    private final InterfaceC13178g f23758j0;

    /* renamed from: k0 */
    private final InterfaceC13178g f23759k0;

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$a */
    /* loaded from: classes2.dex */
    static final class C9012a extends AbstractC6438m implements InterfaceC6097a {
        C9012a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12838a(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12834e(wineClubUpdateActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m12837b(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12835d(wineClubUpdateActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12835d(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12767r1(WineClubViewModel.AbstractC9050b.C9051a.f23870a);
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m12834e(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12767r1(WineClubViewModel.AbstractC9050b.C9052b.f23871a);
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(WineClubUpdateActivity.this);
            final WineClubUpdateActivity wineClubUpdateActivity = WineClubUpdateActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_age_restriction, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.wine.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WineClubUpdateActivity.C9012a.m12835d(WineClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.wine.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WineClubUpdateActivity.C9012a.m12834e(WineClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            return dialogC3502a;
        }
    }

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$b */
    /* loaded from: classes2.dex */
    static final class C9013b extends AbstractC6438m implements InterfaceC6097a {
        C9013b() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m12833a(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12829e(wineClubUpdateActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m12832b(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            m12830d(wineClubUpdateActivity, dialogC3502a, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m12830d(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12769p1();
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12767r1(WineClubViewModel.AbstractC9050b.C9051a.f23870a);
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m12829e(WineClubUpdateActivity wineClubUpdateActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12768q1();
            WineClubUpdateActivity.m12845u1(wineClubUpdateActivity).m12767r1(WineClubViewModel.AbstractC9050b.C9052b.f23871a);
            dialogC3502a.dismiss();
        }

        /* renamed from: c */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(WineClubUpdateActivity.this);
            final WineClubUpdateActivity wineClubUpdateActivity = WineClubUpdateActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_terms_rgpd_layout, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            TextView textView = (TextView) inflate.findViewById(C2336R.C2338id.tv_term_conditions);
            if (textView != null) {
                textView.setText(Html.fromHtml(wineClubUpdateActivity.getString(C2336R.string.lbl_club_terms_conditions_bottomsheet_description), 0));
            }
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_accept)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.wine.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WineClubUpdateActivity.C9013b.m12830d(WineClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_term_cancel)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.wine.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WineClubUpdateActivity.C9013b.m12829e(WineClubUpdateActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            Intrinsics.checkIfNull(textView, "tvTermConditions");
            WineClubUpdateActivity.m12844v1(wineClubUpdateActivity, textView);
            return dialogC3502a;
        }
    }

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$c */
    /* loaded from: classes2.dex */
    static final class C9014c extends AbstractC6438m implements InterfaceC6097a {
        C9014c() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m12839z1 = WineClubUpdateActivity.this.m12839z1();
            WineClubUpdateActivity wineClubUpdateActivity = WineClubUpdateActivity.this;
            return m12839z1.m20377b(wineClubUpdateActivity, wineClubUpdateActivity.getIntent().getExtras());
        }
    }

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$d */
    /* loaded from: classes2.dex */
    public static final class C9015d implements UiWidgets.InterfaceC7045b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11942p1 f23763a;

        C9015d(AbstractC11942p1 abstractC11942p1) {
            this.f23763a = abstractC11942p1;
        }

        /* renamed from: a */
        public void m12827a(String str) {
            Intrinsics.isThisObjectNull(str, "date");
            this.f23763a.f31188x.f30879x.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$e */
    /* loaded from: classes2.dex */
    public static final class C9016e extends AbstractC6438m implements InterfaceC6108l {
        C9016e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12826a(Term term) {
            Intrinsics.isThisObjectNull(term, "term");
            TermsAndConditionsActivity.m20276b(WineClubUpdateActivity.this, term.m22124a(), term.m22123b(), false, 4, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12826a((Term) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$f */
    /* loaded from: classes2.dex */
    public static final class C9017f extends AbstractC6438m implements InterfaceC6112p {

        /* compiled from: WineClubUpdateActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$f$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9018a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23766a;

            static {
                int[] iArr = new int[EnumC9057i.values().length];
                iArr[EnumC9057i.ADD.ordinal()] = 1;
                iArr[EnumC9057i.REMOVE.ordinal()] = 2;
                f23766a = iArr;
            }
        }

        C9017f() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12825a((FormFieldOption) obj, (EnumC9057i) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12825a(FormFieldOption formFieldOption, EnumC9057i enumC9057i) {
            Intrinsics.isThisObjectNull(formFieldOption, "wineOption");
            Intrinsics.isThisObjectNull(enumC9057i, "actionType");
            int i = C9018a.f23766a[enumC9057i.ordinal()];
            if (i == 1) {
                WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12739P0().add(formFieldOption.m14602a());
            } else if (i != 2) {
            } else {
                WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12739P0().remove(formFieldOption.m14602a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$g */
    /* loaded from: classes2.dex */
    public static final class C9019g extends AbstractC6438m implements InterfaceC6112p {

        /* compiled from: WineClubUpdateActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$g$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9020a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23768a;

            static {
                int[] iArr = new int[EnumC9056h.values().length];
                iArr[EnumC9056h.ADD.ordinal()] = 1;
                iArr[EnumC9056h.REMOVE.ordinal()] = 2;
                f23768a = iArr;
            }
        }

        C9019g() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12824a((FormFieldOption) obj, (EnumC9056h) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12824a(FormFieldOption formFieldOption, EnumC9056h enumC9056h) {
            Intrinsics.isThisObjectNull(formFieldOption, "wineOption");
            Intrinsics.isThisObjectNull(enumC9056h, "actionType");
            int i = C9020a.f23768a[enumC9056h.ordinal()];
            if (i == 1) {
                WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12740O0().add(formFieldOption.m14602a());
            } else if (i != 2) {
            } else {
                WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12740O0().remove(formFieldOption.m14602a());
            }
        }
    }

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$h */
    /* loaded from: classes2.dex */
    public static final class C9021h extends ClickableSpan {
        C9021h() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12774l1(C5579c.m23717b(this, (TextView) view), EnumC7070a.PRIVACY);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    /* compiled from: WineClubUpdateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateActivity$i */
    /* loaded from: classes2.dex */
    public static final class C9022i extends ClickableSpan {
        C9022i() {
        }

        public void onClick(View view) {
            Intrinsics.isThisObjectNull(view, "textView");
            WineClubUpdateActivity.m12845u1(WineClubUpdateActivity.this).m12774l1(C5579c.m23717b(this, (TextView) view), EnumC7070a.TERM_OF_USE);
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.isThisObjectNull(textPaint, "ds");
        }
    }

    public WineClubUpdateActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        m1464a = LazyJVM.m1464a(new C9013b());
        this.f23758j0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C9012a());
        this.f23759k0 = m1464a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m12859B1(WineClubUpdateActivity wineClubUpdateActivity, SimpleDateFormat simpleDateFormat, AbstractC11942p1 abstractC11942p1, View view) {
        Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
        Intrinsics.isThisObjectNull(simpleDateFormat, "$birthdayDateFormat");
        Intrinsics.isThisObjectNull(abstractC11942p1, "$binding");
        UiWidgets m22759H0 = wineClubUpdateActivity.m22759H0();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -120);
        long timeInMillis = calendar.getTimeInMillis();
        String format = simpleDateFormat.format(new Date());
        C9015d c9015d = new C9015d(abstractC11942p1);
        Intrinsics.checkIfNull(format, "format(Date())");
        UiWidgets.m19498k(m22759H0, simpleDateFormat, format, timeInMillis, 0, c9015d, 8, null);
    }

    /* renamed from: C1 */
    private final void m12858C1() {
        this.f23756h0 = new WineClubListTypeAdapter(((WineClubUpdateViewModel) m22758I0()).m12749F0(), new C9017f());
        PlaceHolderRecyclerView placeHolderRecyclerView = ((AbstractC11942p1) m22738w0()).f31190z.f31389z;
        placeHolderRecyclerView.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(0), UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), false, false, 1));
        placeHolderRecyclerView.setAdapter(this.f23756h0);
        ((WineClubUpdateViewModel) m22758I0()).m12753B0().mo171i(this, new InterfaceC1440f0() { // from class: ji.x
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                WineClubUpdateActivity.m12857D1(WineClubUpdateActivity.this, (List) obj);
            }
        });
        this.f23757i0 = new WineClubListRegionAdapter(((WineClubUpdateViewModel) m22758I0()).m12750E0(), new C9019g());
        PlaceHolderRecyclerView placeHolderRecyclerView2 = ((AbstractC11942p1) m22738w0()).f31189y.f31217y;
        placeHolderRecyclerView2.m36657h(new MarginItemDecoration(UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(0), UtilsExtensions.m35167e(16), UtilsExtensions.m35167e(8), false, false, 1));
        placeHolderRecyclerView2.setAdapter(this.f23757i0);
        ((WineClubUpdateViewModel) m22758I0()).m12754A0().mo171i(this, new InterfaceC1440f0() { // from class: ji.w
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                WineClubUpdateActivity.m12856E1(WineClubUpdateActivity.this, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m12857D1(WineClubUpdateActivity wineClubUpdateActivity, List list) {
        Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
        WineClubListTypeAdapter wineClubListTypeAdapter = wineClubUpdateActivity.f23756h0;
        Intrinsics.checkIfNull(list, "it");
        wineClubListTypeAdapter.m22153F(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m12856E1(WineClubUpdateActivity wineClubUpdateActivity, List list) {
        Intrinsics.isThisObjectNull(wineClubUpdateActivity, "this$0");
        WineClubListRegionAdapter wineClubListRegionAdapter = wineClubUpdateActivity.f23757i0;
        Intrinsics.checkIfNull(list, "it");
        wineClubListRegionAdapter.m22153F(list);
    }

    /* renamed from: F1 */
    private final void m12855F1(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        C9022i c9022i = new C9022i();
        C9021h c9021h = new C9021h();
        spannableString.setSpan(c9022i, 15, 47, 33);
        spannableString.setSpan(c9021h, 49, 87, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m12848r1(WineClubUpdateActivity wineClubUpdateActivity, SimpleDateFormat simpleDateFormat, AbstractC11942p1 abstractC11942p1, View view) {
        m12859B1(wineClubUpdateActivity, simpleDateFormat, abstractC11942p1, view);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m12847s1(WineClubUpdateActivity wineClubUpdateActivity, List list) {
        m12856E1(wineClubUpdateActivity, list);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m12846t1(WineClubUpdateActivity wineClubUpdateActivity, List list) {
        m12857D1(wineClubUpdateActivity, list);
    }

    /* renamed from: u1 */
    public static final /* synthetic */ WineClubUpdateViewModel m12845u1(WineClubUpdateActivity wineClubUpdateActivity) {
        return (WineClubUpdateViewModel) wineClubUpdateActivity.m22758I0();
    }

    /* renamed from: v1 */
    public static final /* synthetic */ void m12844v1(WineClubUpdateActivity wineClubUpdateActivity, TextView textView) {
        wineClubUpdateActivity.m12855F1(textView);
    }

    /* renamed from: x1 */
    private final DialogC3502a m12841x1() {
        return (DialogC3502a) this.f23759k0.getValue();
    }

    /* renamed from: y1 */
    private final DialogC3502a m12840y1() {
        return (DialogC3502a) this.f23758j0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A1 */
    public void m12849n1(final AbstractC11942p1 abstractC11942p1, WineClubUpdateViewModel wineClubUpdateViewModel) {
        Intrinsics.isThisObjectNull(abstractC11942p1, "binding");
        Intrinsics.isThisObjectNull(wineClubUpdateViewModel, "viewModel");
        super.m34589n1(abstractC11942p1, wineClubUpdateViewModel);
        m12858C1();
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("EXTRA_EDIT_WINE")) {
            abstractC11942p1.f31183C.setVisibility(8);
            abstractC11942p1.f31181A.setVisibility(8);
            abstractC11942p1.f31184D.setVisibility(8);
            wineClubUpdateViewModel.m12751D0().mo166p(Boolean.TRUE);
            Bundle extras2 = getIntent().getExtras();
            String string = extras2 != null ? extras2.getString("KEY_FOR_WINE_CLUB_TYPE") : null;
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != -1115257117) {
                    if (hashCode == -934795532 && string.equals("region")) {
                        wineClubUpdateViewModel.m12733V0(wineClubUpdateViewModel.m12743L0().indexOf(C13825d3.f34932a));
                        abstractC11942p1.f31184D.setVisibility(8);
                        abstractC11942p1.f31189y.mo3842S(true);
                    }
                } else if (string.equals("wineType")) {
                    wineClubUpdateViewModel.m12733V0(wineClubUpdateViewModel.m12743L0().indexOf(AppNavigationTypes.f34937a));
                    abstractC11942p1.f31190z.f31387x.setVisibility(8);
                    abstractC11942p1.f31190z.mo3778S(true);
                }
            }
        } else {
            Bundle extras3 = getIntent().getExtras();
            if (extras3 != null && extras3.getBoolean("KEY_FOR_CLUB_SUBSCRIPTION")) {
                wineClubUpdateViewModel.m12734U0(WineClubViewModel.AbstractC9047a.C9049b.f23869a);
            } else {
                wineClubUpdateViewModel.m12734U0(WineClubViewModel.AbstractC9047a.C9048a.f23868a);
            }
            abstractC11942p1.f31188x.mo3998U(true);
            abstractC11942p1.f31184D.setVisibility(8);
            ((TextView) findViewById(C2336R.C2338id.const_step)).setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"1"}), 0));
        }
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        abstractC11942p1.f31188x.f30880y.setOnClickListener(new View.OnClickListener() { // from class: ji.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WineClubUpdateActivity.m12859B1(WineClubUpdateActivity.this, simpleDateFormat, abstractC11942p1, view);
            }
        });
        wineClubUpdateViewModel.m12773m1().mo171i(this, new EventObserver(new C9016e()));
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12854J0() {
        return C6450z.m20906b(WineClubUpdateViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12853K0() {
        return new C9014c();
    }

    /* renamed from: m1 */
    public void m12851m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
        AbstractC13816c abstractC13816c = (AbstractC13816c) c13182l.m1460c();
        if (abstractC13816c instanceof C13839g3) {
            ((AbstractC11942p1) m22738w0()).f31181A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"1"}), 0));
            ((AbstractC11942p1) m22738w0()).f31183C.setProgress(33);
            ((AbstractC11942p1) m22738w0()).f31185E.setText(getString(C2336R.string.btn_continue));
            ((AbstractC11942p1) m22738w0()).f31184D.setVisibility(8);
            ((AbstractC11942p1) m22738w0()).f31190z.mo3778S(false);
            ((AbstractC11942p1) m22738w0()).f31189y.mo3842S(false);
            ((AbstractC11942p1) m22738w0()).f31188x.mo3998U(true);
        } else if (abstractC13816c instanceof C13820c3) {
            m12841x1().show();
        } else if (abstractC13816c instanceof C13854j3) {
            m12840y1().show();
        } else if (abstractC13816c instanceof C13849i3) {
            ((AbstractC11942p1) m22738w0()).f31181A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"2"}), 0));
            ((AbstractC11942p1) m22738w0()).f31183C.setProgress(66);
            ((AbstractC11942p1) m22738w0()).f31185E.setText(getString(C2336R.string.btn_continue));
            ((AbstractC11942p1) m22738w0()).f31184D.setVisibility(0);
            ((AbstractC11942p1) m22738w0()).f31188x.mo3998U(false);
            ((AbstractC11942p1) m22738w0()).f31189y.mo3842S(false);
            ((AbstractC11942p1) m22738w0()).f31190z.mo3778S(true);
        } else if (abstractC13816c instanceof C13844h3) {
            ((AbstractC11942p1) m22738w0()).f31185E.setEnabled(false);
            ((AbstractC11942p1) m22738w0()).f31181A.setText(Html.fromHtml(getString(C2336R.string.lbl_clubs_progress_bar_step, new Object[]{"3"}), 0));
            ((AbstractC11942p1) m22738w0()).f31183C.setProgress(100);
            ((AbstractC11942p1) m22738w0()).f31185E.setText(getString(C2336R.string.btn_save));
            ((AbstractC11942p1) m22738w0()).f31184D.setVisibility(0);
            ((AbstractC11942p1) m22738w0()).f31188x.mo3998U(false);
            ((AbstractC11942p1) m22738w0()).f31190z.mo3778S(false);
            ((AbstractC11942p1) m22738w0()).f31189y.mo3842S(true);
        } else if (abstractC13816c instanceof C13859k3) {
            p185ji.WineClubWelcomeActivity.m20832a(this);
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: n */
    public boolean m12850n() {
        return true;
    }

    public void onBackPressed() {
        ((WineClubUpdateViewModel) m22758I0()).m12767r1(WineClubViewModel.AbstractC9050b.C9052b.f23871a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_new_club_wine;
    }

    /* renamed from: z1 */
    public final ViewModelFactoryByInjection m12839z1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23755g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }
}
