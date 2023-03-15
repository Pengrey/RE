package pt.pingodoce.app.presentation.account.loggedAccount.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import ke.ViewModelFactoryByInjection;
import kh.EditBirthDateActivity;
import me.InterfaceC7186c;
import mh.EditNifActivity;
import mk.UpdatePhoneActivity;
import ne.EventObserver;
import p050d.C4519c;
import p110fl.UserDataUpdateActivity;
import p124gk.SplashActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p224lh.EditEmailActivity;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC12019t2;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13831f0;
import p494zh.C13894r;
import p494zh.C13912v1;
import p494zh.C13917w2;
import p494zh.C13922y;
import pe.C8618e;
import pt.pingodoce.app.data.local.flows.OnboardingFlowData;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileActivity;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel;

/* compiled from: ProfileActivity.kt */
/* loaded from: classes2.dex */
public final class ProfileActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23399f0;

    /* renamed from: g0 */
    private final AbstractC0304b f23400g0;

    /* renamed from: h0 */
    private final AbstractC0304b f23401h0;

    /* renamed from: i0 */
    private final AbstractC0304b f23402i0;

    /* renamed from: j0 */
    private final AbstractC0304b f23403j0;

    /* compiled from: ProfileActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileActivity$a */
    /* loaded from: classes2.dex */
    static final class C8846a extends AbstractC6438m implements InterfaceC6097a {
        C8846a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13449t1 = ProfileActivity.this.m13449t1();
            ProfileActivity profileActivity = ProfileActivity.this;
            return m13449t1.m20377b(profileActivity, profileActivity.getIntent().getExtras());
        }
    }

    /* compiled from: ProfileActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8847b implements UiWidgets.InterfaceC7044a {

        /* renamed from: a */
        final /* synthetic */ ProfileViewModel f23405a;

        C8847b(ProfileViewModel profileViewModel) {
            this.f23405a = profileViewModel;
        }

        /* renamed from: a */
        public void m13440a(boolean z) {
            if (z) {
                this.f23405a.m13427W();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProfileActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8848c extends AbstractC6438m implements InterfaceC6108l {
        C8848c() {
            super(1);
        }

        /* renamed from: a */
        public final void m13439a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13917w2) {
                if (c13182l.m1459d() instanceof C13182l) {
                    C13182l c13182l2 = (C13182l) c13182l.m1459d();
                    ProfileActivity profileActivity = ProfileActivity.this;
                    UserDataUpdateActivity.m23729a(ProfileActivity.m13452q1(profileActivity), profileActivity, new OnboardingFlowData(BuildConfig.VERSION_NAME, null, null, (String) c13182l2.m1460c(), (String) c13182l2.m1459d(), null, null, null, false, false, false, null, null, null, null, null, false, null, null, 524262, null), true);
                }
            } else if (interfaceC7186c instanceof C13922y) {
                SplashActivity.m23306c(ProfileActivity.this);
                UpdatePhoneActivity.m18355b(ProfileActivity.this);
                ProfileActivity.this.finish();
            } else if (interfaceC7186c instanceof C13831f0) {
                EditEmailActivity.m19429a(ProfileActivity.m13453p1(ProfileActivity.this), ProfileActivity.this, (String) c13182l.m1459d());
            } else if (interfaceC7186c instanceof C13912v1) {
                EditNifActivity.m18403a(ProfileActivity.m13451r1(ProfileActivity.this), ProfileActivity.this, (String) c13182l.m1459d());
            } else if (interfaceC7186c instanceof C13894r) {
                EditBirthDateActivity.m20362a(ProfileActivity.m13454o1(ProfileActivity.this), ProfileActivity.this, (String) c13182l.m1459d());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13439a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    public ProfileActivity() {
        AbstractC0304b m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: jh.d
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ProfileActivity.m13442z1(ProfileActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…lastName)\n        }\n    }");
        this.f23400g0 = m41364M;
        AbstractC0304b m41364M2 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: jh.f
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ProfileActivity.m13466A1(ProfileActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M2, "registerForActivityResul…del.updateNif(it) }\n    }");
        this.f23401h0 = m41364M2;
        AbstractC0304b m41364M3 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: jh.e
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ProfileActivity.m13444x1(ProfileActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M3, "registerForActivityResul…dateBirthDate(it) }\n    }");
        this.f23402i0 = m41364M3;
        AbstractC0304b m41364M4 = m41364M(new C4519c(), new InterfaceC0303a() { // from class: jh.c
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                ProfileActivity.m13443y1(ProfileActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M4, "registerForActivityResul…l.updateEmail(it) }\n    }");
        this.f23403j0 = m41364M4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m13466A1(ProfileActivity profileActivity, ActivityResult activityResult) {
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_NIF")) == null) {
            return;
        }
        ((ProfileViewModel) profileActivity.m22758I0()).m13409o0(string);
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m13461i1(ProfileActivity profileActivity, ActivityResult activityResult) {
        m13443y1(profileActivity, activityResult);
    }

    /* renamed from: j1 */
    public static /* synthetic */ boolean m13460j1(ProfileActivity profileActivity, View view) {
        return m13446w1(profileActivity, view);
    }

    /* renamed from: k1 */
    public static /* synthetic */ void m13459k1(ProfileActivity profileActivity, ActivityResult activityResult) {
        m13442z1(profileActivity, activityResult);
    }

    /* renamed from: l1 */
    public static /* synthetic */ void m13458l1(ProfileActivity profileActivity, ActivityResult activityResult) {
        m13444x1(profileActivity, activityResult);
    }

    /* renamed from: m1 */
    public static /* synthetic */ void m13457m1(ProfileActivity profileActivity, ActivityResult activityResult) {
        m13466A1(profileActivity, activityResult);
    }

    /* renamed from: n1 */
    public static /* synthetic */ boolean m13455n1(ProfileViewModel profileViewModel, ProfileActivity profileActivity, View view) {
        return m13447v1(profileViewModel, profileActivity, view);
    }

    /* renamed from: o1 */
    public static final /* synthetic */ AbstractC0304b m13454o1(ProfileActivity profileActivity) {
        return profileActivity.f23402i0;
    }

    /* renamed from: p1 */
    public static final /* synthetic */ AbstractC0304b m13453p1(ProfileActivity profileActivity) {
        return profileActivity.f23403j0;
    }

    /* renamed from: q1 */
    public static final /* synthetic */ AbstractC0304b m13452q1(ProfileActivity profileActivity) {
        return profileActivity.f23400g0;
    }

    /* renamed from: r1 */
    public static final /* synthetic */ AbstractC0304b m13451r1(ProfileActivity profileActivity) {
        return profileActivity.f23401h0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final boolean m13447v1(ProfileViewModel profileViewModel, ProfileActivity profileActivity, View view) {
        Intrinsics.isThisObjectNull(profileViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        if (profileViewModel.m13421c0()) {
            UiWidgets m22759H0 = profileActivity.m22759H0();
            String string = profileActivity.getString(C2336R.string.dialog_info_title);
            Intrinsics.checkIfNull(string, "getString(R.string.dialog_info_title)");
            String string2 = profileActivity.getString(C2336R.string.dialog_profile_delete_picture);
            Intrinsics.checkIfNull(string2, "getString(R.string.dialog_profile_delete_picture)");
            UiWidgets.m19495n(m22759H0, string, string2, null, null, new C8847b(profileViewModel), 12, null);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final boolean m13446w1(ProfileActivity profileActivity, View view) {
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        EditEmailActivity.m19429a(profileActivity.f23403j0, profileActivity, BuildConfig.VERSION_NAME);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m13444x1(ProfileActivity profileActivity, ActivityResult activityResult) {
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_BIRTHDATE")) == null) {
            return;
        }
        ((ProfileViewModel) profileActivity.m22758I0()).m13411m0(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m13443y1(ProfileActivity profileActivity, ActivityResult activityResult) {
        Bundle extras;
        String string;
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (string = extras.getString("EXTRA_FOR_EMAIL")) == null) {
            return;
        }
        ((ProfileViewModel) profileActivity.m22758I0()).m13410n0(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m13442z1(ProfileActivity profileActivity, ActivityResult activityResult) {
        Bundle extras;
        OnboardingFlowData onboardingFlowData;
        Intrinsics.isThisObjectNull(profileActivity, "this$0");
        Intent m41352a = activityResult.m41352a();
        if (m41352a == null || (extras = m41352a.getExtras()) == null || (onboardingFlowData = (OnboardingFlowData) extras.getParcelable("EXTRA_FOR_FLOW_DATA")) == null) {
            return;
        }
        ((ProfileViewModel) profileActivity.m22758I0()).m13408p0(onboardingFlowData.m14715m(), onboardingFlowData.m14713r());
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: G0 */
    protected int m13465G0() {
        return C2336R.string.lbl_profile;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13464J0() {
        return C6450z.m20906b(ProfileViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13463K0() {
        return new C8846a();
    }

    /* renamed from: n */
    public boolean m13456n() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s1 */
    public C8618e mo42216v0() {
        return new C8618e();
    }

    /* renamed from: t1 */
    public final ViewModelFactoryByInjection m13449t1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23399f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public void m13462P0(AbstractC12019t2 abstractC12019t2, final ProfileViewModel profileViewModel) {
        Intrinsics.isThisObjectNull(abstractC12019t2, "binding");
        Intrinsics.isThisObjectNull(profileViewModel, "viewModel");
        abstractC12019t2.f31506A.setOnLongClickListener(new View.OnLongClickListener() { // from class: jh.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m12106v1;
                m12106v1 = ProfileActivity.m13447v1(ProfileViewModel.this, this, view);
                return m12106v1;
            }
        });
        abstractC12019t2.f31511z.setOnLongClickListener(new View.OnLongClickListener() { // from class: jh.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m12105w1;
                m12105w1 = ProfileActivity.m13446w1(ProfileActivity.this, view);
                return m12105w1;
            }
        });
        UiEventsLiveData.f18671a.m19526d().mo171i(this, new EventObserver(new C8848c()));
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_profile;
    }
}
