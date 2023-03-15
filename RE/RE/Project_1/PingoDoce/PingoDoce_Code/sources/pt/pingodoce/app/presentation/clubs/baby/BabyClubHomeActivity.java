package pt.pingodoce.app.presentation.clubs.baby;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import me.InterfaceC7186c;
import ne.EventObserver;
import p164ii.BabyClubAdapter;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11736e;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import p494zh.BaseActivity;
import p494zh.C13810a3;
import p494zh.C13883o0;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.ClubBabyFlowData;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;
import td.InterfaceC10524i0;

/* compiled from: BabyClubHomeActivity.kt */
/* loaded from: classes2.dex */
public final class BabyClubHomeActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23674f0;

    /* renamed from: g0 */
    private boolean f23675g0;

    /* renamed from: h0 */
    private final BabyClubAdapter f23676h0 = m12955u1();

    /* compiled from: BabyClubHomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$a */
    /* loaded from: classes2.dex */
    static final class C8966a extends AbstractC6438m implements InterfaceC6097a {
        C8966a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(BabyClubHomeActivity.this.m12959q1(), BabyClubHomeActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubHomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$initViews$1$1", m20196f = "BabyClubHomeActivity.kt", m20195l = {70}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8967b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23678x;

        /* renamed from: z */
        final /* synthetic */ List f23680z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8967b(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23680z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8967b(this.f23680z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8967b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23678x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubAdapter m12966k1 = BabyClubHomeActivity.m12966k1(BabyClubHomeActivity.this);
                List list = this.f23680z;
                Intrinsics.checkIfNull(list, "it");
                this.f23678x = 1;
                if (m12966k1.m22148H(list, this) == m34636d) {
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
    /* compiled from: BabyClubHomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8968c extends AbstractC6438m implements InterfaceC6108l {
        C8968c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12951a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13883o0) {
                BabyClubHomeActivity babyClubHomeActivity = BabyClubHomeActivity.this;
                p164ii.BabyClubUpdateActivity.m22018a(babyClubHomeActivity, BabyClubHomeActivity.m12962n1(babyClubHomeActivity));
            } else if (interfaceC7186c instanceof C13810a3) {
                Uri parse = Uri.parse("https://bebe.pingodoce.pt/");
                Intrinsics.checkIfNull(parse, "parse(this)");
                BabyClubHomeActivity.this.startActivity(new Intent("android.intent.action.VIEW", parse));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12951a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: BabyClubHomeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$onResume$1", m20196f = "BabyClubHomeActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$d */
    /* loaded from: classes2.dex */
    static final class C8969d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23682x;

        C8969d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8969d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8969d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f23682x == 0) {
                C13186n.m1453b(obj);
                BabyClubHomeActivity babyClubHomeActivity = BabyClubHomeActivity.this;
                Bundle extras = babyClubHomeActivity.getIntent().getExtras();
                boolean z = false;
                if ((extras != null ? extras.getBoolean("KEY_FOR_CLUB_SUBSCRIPTION") : false) || Intrinsics.equals(BabyClubHomeActivity.m12964m1(BabyClubHomeActivity.this).m12899h0().mo172f(), C6755b.m20201a(true))) {
                    z = true;
                }
                BabyClubHomeActivity.m12961o1(babyClubHomeActivity, z);
                if (BabyClubHomeActivity.m12962n1(BabyClubHomeActivity.this)) {
                    BabyClubHomeActivity.m12965l1(BabyClubHomeActivity.this).f30164x.setAdapter(BabyClubHomeActivity.m12966k1(BabyClubHomeActivity.this));
                }
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubHomeActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$e */
    /* loaded from: classes2.dex */
    public static final class C8970e extends AbstractC6438m implements InterfaceC6112p {

        /* compiled from: BabyClubHomeActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$e$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8971a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23685a;

            static {
                int[] iArr = new int[EnumC8984a.values().length];
                iArr[EnumC8984a.EDIT.ordinal()] = 1;
                iArr[EnumC8984a.DELETE.ordinal()] = 2;
                f23685a = iArr;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubHomeActivity.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeActivity$e$b */
        /* loaded from: classes2.dex */
        public static final class C8972b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ BabyClubHomeActivity f23686w;

            /* renamed from: x */
            final /* synthetic */ ClubBaby f23687x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8972b(BabyClubHomeActivity babyClubHomeActivity, ClubBaby clubBaby) {
                super(0);
                this.f23686w = babyClubHomeActivity;
                this.f23687x = clubBaby;
            }

            /* renamed from: a */
            public static /* synthetic */ void m12947a(BabyClubHomeActivity babyClubHomeActivity, DialogC3502a dialogC3502a, View view) {
                m12943e(babyClubHomeActivity, dialogC3502a, view);
            }

            /* renamed from: b */
            public static /* synthetic */ void m12946b(BabyClubHomeActivity babyClubHomeActivity, ClubBaby clubBaby, DialogC3502a dialogC3502a, View view) {
                m12944d(babyClubHomeActivity, clubBaby, dialogC3502a, view);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static final void m12944d(BabyClubHomeActivity babyClubHomeActivity, ClubBaby clubBaby, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(babyClubHomeActivity, "this$0");
                Intrinsics.isThisObjectNull(clubBaby, "$baby");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                BabyClubHomeActivity.m12964m1(babyClubHomeActivity).m12890q0();
                BabyClubHomeActivity.m12964m1(babyClubHomeActivity).m12889r0(clubBaby.m14632d());
                dialogC3502a.dismiss();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static final void m12943e(BabyClubHomeActivity babyClubHomeActivity, DialogC3502a dialogC3502a, View view) {
                Intrinsics.isThisObjectNull(babyClubHomeActivity, "this$0");
                Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
                BabyClubHomeActivity.m12964m1(babyClubHomeActivity).m12892o0();
                dialogC3502a.dismiss();
            }

            /* renamed from: c */
            public final DialogC3502a mo42214q() {
                final DialogC3502a dialogC3502a = new DialogC3502a(this.f23686w);
                final BabyClubHomeActivity babyClubHomeActivity = this.f23686w;
                final ClubBaby clubBaby = this.f23687x;
                View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottom_sheet_for_unsubscribe_baby, (ViewGroup) null);
                dialogC3502a.setContentView(inflate);
                ((TextView) inflate.findViewById(C2336R.C2338id.const_header)).setText(babyClubHomeActivity.getString(C2336R.string.lbl_unsubscribe_baby_question, new Object[]{clubBaby.m14630f()}));
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_unsubscribe)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.baby.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BabyClubHomeActivity.C8970e.C8972b.m12944d(BabyClubHomeActivity.this, clubBaby, dialogC3502a, view);
                    }
                });
                ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_no_go_back)).setOnClickListener(new View.OnClickListener() { // from class: pt.pingodoce.app.presentation.clubs.baby.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BabyClubHomeActivity.C8970e.C8972b.m12943e(BabyClubHomeActivity.this, dialogC3502a, view);
                    }
                });
                dialogC3502a.setCancelable(false);
                return dialogC3502a;
            }
        }

        C8970e() {
            super(2);
        }

        /* renamed from: b */
        private static final DialogC3502a m12948b(InterfaceC13178g interfaceC13178g) {
            return (DialogC3502a) interfaceC13178g.getValue();
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m12949a((ClubBaby) obj, (EnumC8984a) obj2);
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m12949a(ClubBaby clubBaby, EnumC8984a enumC8984a) {
            InterfaceC13178g m1464a;
            Intrinsics.isThisObjectNull(clubBaby, "baby");
            Intrinsics.isThisObjectNull(enumC8984a, "actionType");
            int i = C8971a.f23685a[enumC8984a.ordinal()];
            if (i == 1) {
                BabyClubHomeActivity.m12964m1(BabyClubHomeActivity.this).m12895l0();
                p164ii.BabyClubUpdateActivity.m22017b(BabyClubHomeActivity.this, new ClubBabyFlowData(clubBaby.m14630f(), clubBaby.m14633c(), clubBaby.m14632d(), clubBaby.m14631e()));
            } else if (i != 2) {
            } else {
                BabyClubHomeActivity.m12964m1(BabyClubHomeActivity.this).m12891p0();
                m1464a = LazyJVM.m1464a(new C8972b(BabyClubHomeActivity.this, clubBaby));
                m12948b(m1464a).show();
            }
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12968i1(BabyClubHomeViewModel babyClubHomeViewModel, Boolean bool) {
        m12956t1(babyClubHomeViewModel, bool);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12967j1(AbstractC11736e abstractC11736e, BabyClubHomeActivity babyClubHomeActivity, List list) {
        m12957s1(abstractC11736e, babyClubHomeActivity, list);
    }

    /* renamed from: k1 */
    public static final /* synthetic */ BabyClubAdapter m12966k1(BabyClubHomeActivity babyClubHomeActivity) {
        return babyClubHomeActivity.f23676h0;
    }

    /* renamed from: l1 */
    public static final /* synthetic */ AbstractC11736e m12965l1(BabyClubHomeActivity babyClubHomeActivity) {
        return (AbstractC11736e) babyClubHomeActivity.m22738w0();
    }

    /* renamed from: m1 */
    public static final /* synthetic */ BabyClubHomeViewModel m12964m1(BabyClubHomeActivity babyClubHomeActivity) {
        return (BabyClubHomeViewModel) babyClubHomeActivity.m22758I0();
    }

    /* renamed from: n1 */
    public static final /* synthetic */ boolean m12962n1(BabyClubHomeActivity babyClubHomeActivity) {
        return babyClubHomeActivity.f23675g0;
    }

    /* renamed from: o1 */
    public static final /* synthetic */ void m12961o1(BabyClubHomeActivity babyClubHomeActivity, boolean z) {
        babyClubHomeActivity.f23675g0 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m12957s1(AbstractC11736e abstractC11736e, BabyClubHomeActivity babyClubHomeActivity, List list) {
        Intrinsics.isThisObjectNull(abstractC11736e, "$binding");
        Intrinsics.isThisObjectNull(babyClubHomeActivity, "this$0");
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() >= 3) {
            abstractC11736e.f30160C.setVisibility(8);
            abstractC11736e.f30159B.setVisibility(8);
        } else {
            abstractC11736e.f30160C.setVisibility(0);
            abstractC11736e.f30159B.setVisibility(0);
        }
        C6772d.m20158d(LifecycleOwner.m36965a(babyClubHomeActivity), null, null, new C8967b(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m12956t1(BabyClubHomeViewModel babyClubHomeViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(babyClubHomeViewModel, "$viewModel");
        Intrinsics.checkIfNull(bool, "it");
        if (bool.booleanValue()) {
            babyClubHomeViewModel.m12894m0();
        } else {
            babyClubHomeViewModel.m12893n0();
        }
    }

    /* renamed from: u1 */
    private final BabyClubAdapter m12955u1() {
        return new BabyClubAdapter(new C8970e());
    }

    /* renamed from: G0 */
    protected int m12972G0() {
        return C2336R.string.lbl_baby_club_name;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12971J0() {
        return C6450z.m20906b(BabyClubHomeViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12970K0() {
        return new C8966a();
    }

    /* renamed from: n */
    public boolean m12963n() {
        return true;
    }

    public void onBackPressed() {
        ((BabyClubHomeViewModel) m22758I0()).m12896k0();
        super.onBackPressed();
    }

    protected void onResume() {
        super.onResume();
        LifecycleOwner.m36965a(this).m36984i(new C8969d(null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: q1 */
    public final ViewModelFactoryByInjection m12959q1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23674f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r1 */
    public void m12969P0(final AbstractC11736e abstractC11736e, final BabyClubHomeViewModel babyClubHomeViewModel) {
        Intrinsics.isThisObjectNull(abstractC11736e, "binding");
        Intrinsics.isThisObjectNull(babyClubHomeViewModel, "viewModel");
        babyClubHomeViewModel.m12902e0().mo171i(this, new InterfaceC1440f0() { // from class: ii.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BabyClubHomeActivity.m12957s1(AbstractC11736e.this, this, (List) obj);
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8968c()));
        babyClubHomeViewModel.m12899h0().mo171i(this, new InterfaceC1440f0() { // from class: ii.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BabyClubHomeActivity.m12956t1(BabyClubHomeViewModel.this, (Boolean) obj);
            }
        });
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(getString(C2336R.string.lbl_baby_club_name));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_baby_club_home;
    }
}
