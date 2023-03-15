package pt.pingodoce.app.services;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ch.LoyaltyActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.firebase.crashlytics.C4181a;
import com.squareup.moshi.C4496p;
import dk.TailoredForYouActivity;
import fj.SearchActivity;
import gl.PromotionActivity;
import id.InterfaceC6112p;
import java.util.List;
import java.util.Objects;
import jm.C6537a;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.C7405s1;
import mg.PrefsManager;
import mg.PushNotificationsManager;
import ml.ShoppingListsActivity;
import p124gk.SplashActivity;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p184jh.ProfileActivity;
import p206kk.FetchTermsAndConditionsActivity;
import p207kl.ShoppingListActivity;
import p256nh.SettingsActivity;
import p322ql.Launchers;
import p371ti.LoyaltyRemovedActivity;
import p390uj.HomeActivity;
import p409vl.TakeAwayOrderListActivity;
import p468yc.C13186n;
import p468yc.C13195u;
import p493zg.AccountActivityLauncher;
import pt.pingodoce.app.PingoDoceApp;
import pt.pingodoce.app.data.local.models.egoi.EgoiEvent;
import pt.pingodoce.app.data.local.models.egoi.EgoiPushActions;
import pt.pingodoce.app.data.local.models.egoi.EgoiPushData;
import pt.pingodoce.app.data.local.models.p300goto.PushActionGotoType;
import pt.pingodoce.app.presentation.landing.lock.LockActivity;
import td.InterfaceC10524i0;
import vc.AbstractActivityC11204b;

/* compiled from: NotificationLandingActivity.kt */
/* loaded from: classes2.dex */
public final class NotificationLandingActivity extends AbstractActivityC11204b {

    /* renamed from: P */
    public C7405s1 f25073P;

    /* renamed from: Q */
    public PrefsManager f25074Q;

    /* compiled from: NotificationLandingActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.services.NotificationLandingActivity$onCreate$3", m20196f = "NotificationLandingActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.services.NotificationLandingActivity$a */
    /* loaded from: classes2.dex */
    static final class C9537a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C6449y f25075A;

        /* renamed from: B */
        final /* synthetic */ String f25076B;

        /* renamed from: x */
        int f25077x;

        /* renamed from: z */
        final /* synthetic */ boolean f25079z;

        /* compiled from: NotificationLandingActivity.kt */
        /* renamed from: pt.pingodoce.app.services.NotificationLandingActivity$a$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9538a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f25080a;

            static {
                int[] iArr = new int[PushActionGotoType.values().length];
                iArr[PushActionGotoType.HOME.ordinal()] = 1;
                iArr[PushActionGotoType.PROMOTIONS.ordinal()] = 2;
                iArr[PushActionGotoType.SHOPPING_LIST.ordinal()] = 3;
                iArr[PushActionGotoType.TAKE_AWAY.ordinal()] = 4;
                iArr[PushActionGotoType.ACCOUNT.ordinal()] = 5;
                iArr[PushActionGotoType.LOYALTY_CARD_REQUESTS.ordinal()] = 6;
                iArr[PushActionGotoType.SHOPPING_LISTS.ordinal()] = 7;
                iArr[PushActionGotoType.TAKE_AWAY_ORDER_LIST.ordinal()] = 8;
                iArr[PushActionGotoType.BENEFIT.ordinal()] = 9;
                iArr[PushActionGotoType.DETAIL.ordinal()] = 10;
                iArr[PushActionGotoType.SEARCH.ordinal()] = 11;
                iArr[PushActionGotoType.PROFILE.ordinal()] = 12;
                iArr[PushActionGotoType.DEFINITION.ordinal()] = 13;
                iArr[PushActionGotoType.TERMS_OF_SERVICE.ordinal()] = 14;
                iArr[PushActionGotoType.DATA_PROTECTION.ordinal()] = 15;
                iArr[PushActionGotoType.PRODUCT_DETAIL.ordinal()] = 16;
                iArr[PushActionGotoType.BANNER_DETAIL.ordinal()] = 17;
                iArr[PushActionGotoType.HOUSE_HOLD_REMOVED.ordinal()] = 18;
                f25080a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9537a(boolean z, C6449y c6449y, String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f25079z = z;
            this.f25075A = c6449y;
            this.f25076B = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9537a(this.f25079z, this.f25075A, this.f25076B, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9537a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f25077x == 0) {
                C13186n.m1453b(obj);
                if (NotificationLandingActivity.m10698j0(NotificationLandingActivity.this, false)) {
                    if (this.f25079z) {
                        SplashActivity.m23305d(NotificationLandingActivity.this, (PushActionGotoType) this.f25075A.f17533w);
                    } else {
                        SplashActivity.m23308a(NotificationLandingActivity.this);
                    }
                    NotificationLandingActivity.this.finish();
                } else {
                    if (this.f25079z) {
                        switch (C9538a.f25080a[((PushActionGotoType) this.f25075A.f17533w).ordinal()]) {
                            case 1:
                                HomeActivity.m6743b(NotificationLandingActivity.this);
                                break;
                            case 2:
                                PromotionActivity.m23290a(NotificationLandingActivity.this);
                                break;
                            case 3:
                                ShoppingListActivity.m20275a(NotificationLandingActivity.this);
                                break;
                            case 4:
                                NotificationLandingActivity notificationLandingActivity = NotificationLandingActivity.this;
                                Launchers.m9999c(notificationLandingActivity, notificationLandingActivity.m10696l0().m18495o());
                                break;
                            case 5:
                                NotificationLandingActivity notificationLandingActivity2 = NotificationLandingActivity.this;
                                AccountActivityLauncher.m156b(notificationLandingActivity2, notificationLandingActivity2.m10696l0().m18495o());
                                break;
                            case 6:
                                if (!NotificationLandingActivity.this.m10696l0().m18498l()) {
                                    LoyaltyActivity.m34604a(NotificationLandingActivity.this, true);
                                    break;
                                } else {
                                    HomeActivity.m6743b(NotificationLandingActivity.this);
                                    break;
                                }
                            case 7:
                                if (!NotificationLandingActivity.this.m10696l0().m18498l()) {
                                    ShoppingListsActivity.m18325b(NotificationLandingActivity.this);
                                    break;
                                } else {
                                    HomeActivity.m6743b(NotificationLandingActivity.this);
                                    break;
                                }
                            case 8:
                                if (!NotificationLandingActivity.this.m10696l0().m18498l()) {
                                    TakeAwayOrderListActivity.m5240a(NotificationLandingActivity.this);
                                    break;
                                } else {
                                    HomeActivity.m6743b(NotificationLandingActivity.this);
                                    break;
                                }
                            case 9:
                                HomeActivity.m6743b(NotificationLandingActivity.this);
                                if (!NotificationLandingActivity.this.m10696l0().m18498l()) {
                                    HomeActivity.m6744a(NotificationLandingActivity.this);
                                    break;
                                }
                                break;
                            case 10:
                                TailoredForYouActivity.m26361a(NotificationLandingActivity.this);
                                break;
                            case 11:
                                SearchActivity.m23750b(NotificationLandingActivity.this);
                                break;
                            case 12:
                                ProfileActivity.m20847a(NotificationLandingActivity.this);
                                break;
                            case 13:
                                SettingsActivity.m17626a(NotificationLandingActivity.this);
                                break;
                            case 14:
                                SettingsActivity.m17626a(NotificationLandingActivity.this);
                                break;
                            case 15:
                                FetchTermsAndConditionsActivity.m20279b(NotificationLandingActivity.this, false, 1, null);
                                break;
                            case 16:
                                p090em.PushNotificationDispatcherActivity.m25577a(NotificationLandingActivity.this, this.f25076B);
                                break;
                            case 17:
                                HomeActivity.m6742c(NotificationLandingActivity.this, this.f25076B);
                                break;
                            case 18:
                                HomeActivity.m6743b(NotificationLandingActivity.this);
                                LoyaltyRemovedActivity.m7465a(NotificationLandingActivity.this);
                                break;
                        }
                        if (NotificationLandingActivity.this.getApplication() instanceof PingoDoceApp) {
                            Application application = NotificationLandingActivity.this.getApplication();
                            Objects.requireNonNull(application, "null cannot be cast to non-null type pt.pingodoce.app.PingoDoceApp");
                            Activity m14789e = ((PingoDoceApp) application).m14789e();
                            if (Intrinsics.equals(m14789e != null ? m14789e.getClass().getCanonicalName() : null, LockActivity.class.getCanonicalName()) && !NotificationLandingActivity.this.m10696l0().m18498l()) {
                                fk.LockActivity.m23738b(NotificationLandingActivity.this, null, 1, null);
                            }
                        }
                    }
                    NotificationLandingActivity.this.finish();
                }
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: j0 */
    public static final /* synthetic */ boolean m10698j0(NotificationLandingActivity notificationLandingActivity, boolean z) {
        return notificationLandingActivity.m10695m0(z);
    }

    /* renamed from: m0 */
    private final boolean m10695m0(boolean z) {
        Object systemService = getSystemService("activity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && Intrinsics.equals(runningAppProcessInfo.processName, getPackageName())) {
                Application application = getApplication();
                Objects.requireNonNull(application, "null cannot be cast to non-null type pt.pingodoce.app.PingoDoceApp");
                Activity m14789e = ((PingoDoceApp) application).m14789e();
                String canonicalName = m14789e != null ? m14789e.getClass().getCanonicalName() : null;
                return canonicalName == null || Intrinsics.equals(canonicalName, NotificationLandingActivity.class.getCanonicalName()) || (z && Intrinsics.equals(canonicalName, LockActivity.class.getCanonicalName()));
            }
        }
        return true;
    }

    /* renamed from: k0 */
    public final PrefsManager m10697k0() {
        PrefsManager prefsManager = this.f25074Q;
        if (prefsManager != null) {
            return prefsManager;
        }
        Intrinsics.throwUninitPropException("sharedPrefsManager");
        return null;
    }

    /* renamed from: l0 */
    public final C7405s1 m10696l0() {
        C7405s1 c7405s1 = this.f25073P;
        if (c7405s1 != null) {
            return c7405s1;
        }
        Intrinsics.throwUninitPropException("userManager");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, pt.pingodoce.app.data.local.models.goto.PushActionGotoType] */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, pt.pingodoce.app.data.local.models.goto.PushActionGotoType] */
    /* JADX WARN: Type inference failed for: r6v19, types: [pt.pingodoce.app.data.local.models.goto.PushActionGotoType] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @SuppressLint({"DefaultLocale"})
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        C6449y c6449y = new C6449y();
        c6449y.f17533w = PushActionGotoType.UNKNOWN;
        if (extras != null) {
            String string = extras.getString("E-GOI_PUSH");
            PushActionGotoType pushActionGotoType = null;
            if (string != null) {
                try {
                    EgoiPushData egoiPushData = (EgoiPushData) new C4496p.C4497a().m27364a().m27369c(EgoiPushData.class).m27476c(string);
                    if (egoiPushData != null) {
                        C6537a.m20675d("Egoi push received: " + egoiPushData, new Object[0]);
                        m10697k0().m18552H(new EgoiEvent(egoiPushData.m14581c(), egoiPushData.m14579e(), egoiPushData.m14580d()));
                        if (egoiPushData.m14583a().length() > 0) {
                            EgoiPushActions egoiPushActions = (EgoiPushActions) new C4496p.C4497a().m27364a().m27369c(EgoiPushActions.class).m27476c(egoiPushData.m14583a());
                            String str2 = (String) PushNotificationsManager.f19758c.m18426a(egoiPushActions != null ? egoiPushActions.m14588b() : null).get("gotoPayload");
                            if (str2 != null) {
                                c6449y.f17533w = PushActionGotoType.Companion.m14573a(str2);
                            }
                        }
                    }
                } catch (Throwable unused) {
                    String str3 = "Failed to parse a possible Egoi push notification: " + string;
                    C4181a.m28418a().m28416c(str3);
                    C6537a.m20675d(str3, new Object[0]);
                }
            }
            T t = c6449y.f17533w;
            T t2 = PushActionGotoType.UNKNOWN;
            if (t == t2) {
                PushActionGotoType pushActionGotoType2 = (PushActionGotoType) extras.getParcelable("goto");
                if (pushActionGotoType2 != null) {
                    C6537a.m20675d("Push with goto: " + pushActionGotoType2, new Object[0]);
                    pushActionGotoType = pushActionGotoType2;
                }
                if (pushActionGotoType != null) {
                    t2 = pushActionGotoType;
                }
                c6449y.f17533w = t2;
            }
        }
        boolean z = c6449y.f17533w != PushActionGotoType.UNKNOWN;
        if (extras == null || (str = extras.getString("gotoPayload")) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        C6772d.m20158d(LifecycleOwner.m36965a(this), null, null, new C9537a(z, c6449y, str, null), 3, null);
    }
}
