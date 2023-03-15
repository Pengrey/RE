package pt.pingodoce.app.presentation.account.loggedAccount.settings;

import android.view.View;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import lk.EnumC7070a;
import mg.AuthManager;
import mg.BiometricsManager;
import mg.C7405s1;
import mg.CoachMarkManager;
import mg.ConsentsManager;
import mg.LoyaltyCardManager;
import mg.PrefsManager;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13812b0;
import p494zh.C13815b3;
import p494zh.C13822d0;
import p494zh.C13836g0;
import p494zh.C13837g1;
import p494zh.C13891q0;
import p494zh.C13903t0;
import p494zh.C13915w0;
import p494zh.C13926z;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c */
/* loaded from: classes2.dex */
public final class SettingsViewModel extends BaseViewModel {

    /* renamed from: m */
    private final ConsentsManager f23475m;

    /* renamed from: n */
    private final BiometricsManager f23476n;

    /* renamed from: o */
    private final PrefsManager f23477o;

    /* renamed from: p */
    private final CoachMarkManager f23478p;

    /* renamed from: q */
    private final InterfaceC6108l f23479q;

    /* renamed from: r */
    private final C1430c0 f23480r;

    /* renamed from: s */
    private final C1436e0 f23481s;

    /* renamed from: t */
    private final C1436e0 f23482t;

    /* renamed from: u */
    private final LiveData f23483u;

    /* renamed from: v */
    private final LiveData f23484v;

    /* renamed from: w */
    private final C1430c0 f23485w;

    /* renamed from: x */
    private final LiveData f23486x;

    /* renamed from: y */
    private final LiveData f23487y;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SettingsViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC8878a {
        NOTIFICATIONS,
        CARD,
        INVOICE,
        MADEFORYOU,
        PIN,
        COACH_MARKS,
        APP_RATING,
        TERMS,
        PRIVACY,
        LOGOUT,
        DELETE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$b */
    /* loaded from: classes2.dex */
    public static final class C8879b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: x */
        final /* synthetic */ ResourcesProvider f23489x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SettingsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel$clickThrottle$1$1", m20196f = "SettingsViewModel.kt", m20195l = {68}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$b$a */
        /* loaded from: classes2.dex */
        public static final class C8880a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: x */
            int f23490x;

            /* renamed from: y */
            final /* synthetic */ SettingsViewModel f23491y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8880a(SettingsViewModel settingsViewModel, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f23491y = settingsViewModel;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C8880a(this.f23491y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C8880a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23490x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    CoachMarkManager m13328X = SettingsViewModel.m13328X(this.f23491y);
                    this.f23490x = 1;
                    if (m13328X.m18621c(this) == m34636d) {
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

        /* compiled from: SettingsViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$b$b */
        /* loaded from: classes2.dex */
        public static final class C8881b implements UiWidgets.InterfaceC7044a {

            /* renamed from: a */
            final /* synthetic */ SettingsViewModel f23492a;

            C8881b(SettingsViewModel settingsViewModel) {
                this.f23492a = settingsViewModel;
            }

            /* renamed from: a */
            public void m13297a(boolean z) {
                if (z) {
                    BaseViewModel.m119C(this.f23492a, C13891q0.f35012a, null, 2, null);
                }
            }
        }

        /* compiled from: SettingsViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$b$c */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C8882c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23493a;

            static {
                int[] iArr = new int[EnumC8878a.values().length];
                iArr[EnumC8878a.NOTIFICATIONS.ordinal()] = 1;
                iArr[EnumC8878a.CARD.ordinal()] = 2;
                iArr[EnumC8878a.MADEFORYOU.ordinal()] = 3;
                iArr[EnumC8878a.INVOICE.ordinal()] = 4;
                iArr[EnumC8878a.PIN.ordinal()] = 5;
                iArr[EnumC8878a.COACH_MARKS.ordinal()] = 6;
                iArr[EnumC8878a.APP_RATING.ordinal()] = 7;
                iArr[EnumC8878a.TERMS.ordinal()] = 8;
                iArr[EnumC8878a.PRIVACY.ordinal()] = 9;
                iArr[EnumC8878a.DELETE.ordinal()] = 10;
                iArr[EnumC8878a.LOGOUT.ordinal()] = 11;
                f23493a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8879b(ResourcesProvider resourcesProvider) {
            super(1);
            this.f23489x = resourcesProvider;
        }

        /* renamed from: a */
        public final void m13299a(EnumC8878a enumC8878a) {
            Intrinsics.isThisObjectNull(enumC8878a, "action");
            switch (C8882c.f23493a[enumC8878a.ordinal()]) {
                case 1:
                    BaseViewModel.m119C(SettingsViewModel.this, C13837g1.f34945a, null, 2, null);
                    return;
                case 2:
                    BaseViewModel.m119C(SettingsViewModel.this, C13903t0.f35024a, null, 2, null);
                    return;
                case 3:
                    BaseViewModel.m119C(SettingsViewModel.this, C13915w0.f35036a, null, 2, null);
                    return;
                case 4:
                    BaseViewModel.m119C(SettingsViewModel.this, C13836g0.f34944a, null, 2, null);
                    return;
                case 5:
                    BaseViewModel.m119C(SettingsViewModel.this, C13926z.f35047a, null, 2, null);
                    return;
                case 6:
                    C6770c.m20162b(null, new C8880a(SettingsViewModel.this, null), 1, null);
                    SettingsViewModel settingsViewModel = SettingsViewModel.this;
                    String string = this.f23489x.m6899a().getString(C2336R.string.lbl_settings_reset_coachmarks_success);
                    Intrinsics.checkIfNull(string, "ctx.getString(id)");
                    SettingsViewModel.m13325a0(settingsViewModel, string);
                    return;
                case 7:
                    SettingsViewModel.m13326Z(SettingsViewModel.this).m18532e();
                    SettingsViewModel settingsViewModel2 = SettingsViewModel.this;
                    String string2 = this.f23489x.m6899a().getString(C2336R.string.lbl_settings_reset_app_rating_success);
                    Intrinsics.checkIfNull(string2, "ctx.getString(id)");
                    SettingsViewModel.m13325a0(settingsViewModel2, string2);
                    return;
                case 8:
                    SettingsViewModel settingsViewModel3 = SettingsViewModel.this;
                    String string3 = this.f23489x.m6899a().getString(C2336R.string.lbl_settings_terms);
                    Intrinsics.checkIfNull(string3, "ctx.getString(id)");
                    SettingsViewModel.m13329W(settingsViewModel3, string3, EnumC7070a.TERM_OF_USE);
                    return;
                case 9:
                    SettingsViewModel settingsViewModel4 = SettingsViewModel.this;
                    String string4 = this.f23489x.m6899a().getString(C2336R.string.lbl_settings_privacy);
                    Intrinsics.checkIfNull(string4, "ctx.getString(id)");
                    SettingsViewModel.m13329W(settingsViewModel4, string4, EnumC7070a.PRIVACY);
                    return;
                case 10:
                    BaseViewModel.m119C(SettingsViewModel.this, C13822d0.f34929a, null, 2, null);
                    return;
                case 11:
                    UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                    String string5 = this.f23489x.m6899a().getString(C2336R.string.dialog_alert_title);
                    Intrinsics.checkIfNull(string5, "ctx.getString(id)");
                    String string6 = this.f23489x.m6899a().getString(C2336R.string.dialog_logout);
                    Intrinsics.checkIfNull(string6, "ctx.getString(id)");
                    UiEventsLiveData.m19519k(uiEventsLiveData, string5, string6, null, null, new C8881b(SettingsViewModel.this), 12, null);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m13299a((EnumC8878a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SettingsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel$fetchConsents$1", m20196f = "SettingsViewModel.kt", m20195l = {142}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$c */
    /* loaded from: classes2.dex */
    public static final class C8883c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f23494A;

        /* renamed from: x */
        int f23495x;

        /* renamed from: z */
        final /* synthetic */ EnumC7070a f23497z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SettingsViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel$fetchConsents$1$1", m20196f = "SettingsViewModel.kt", m20195l = {143}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$c$a */
        /* loaded from: classes2.dex */
        public static final class C8884a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f23498A;

            /* renamed from: x */
            int f23499x;

            /* renamed from: y */
            final /* synthetic */ SettingsViewModel f23500y;

            /* renamed from: z */
            final /* synthetic */ EnumC7070a f23501z;

            /* compiled from: SettingsViewModel.kt */
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$c$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C8885a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f23502a;

                static {
                    int[] iArr = new int[EnumC7070a.values().length];
                    iArr[EnumC7070a.TERM_OF_USE.ordinal()] = 1;
                    iArr[EnumC7070a.PRIVACY.ordinal()] = 2;
                    f23502a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8884a(SettingsViewModel settingsViewModel, EnumC7070a enumC7070a, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23500y = settingsViewModel;
                this.f23501z = enumC7070a;
                this.f23498A = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8884a(this.f23500y, this.f23501z, this.f23498A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8884a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23499x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ConsentsManager m13327Y = SettingsViewModel.m13327Y(this.f23500y);
                    this.f23499x = 1;
                    obj = m13327Y.m18567d(this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    int i2 = C8885a.f23502a[this.f23501z.ordinal()];
                    Object obj2 = null;
                    if (i2 == 1) {
                        BaseViewModel.m119C(this.f23500y, C13812b0.f34920a, null, 2, null);
                    } else if (i2 == 2) {
                        Iterator it = ((Iterable) ((Result.C8078c) result).m16962b()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((Consent) next).m13861h()) {
                                obj2 = next;
                                break;
                            }
                        }
                        Consent consent = (Consent) obj2;
                        if (consent != null) {
                            this.f23500y.m120B(C13815b3.f34923a, new Term(this.f23498A, consent.m13867a()));
                        }
                    }
                } else if (result instanceof Result.C8077b) {
                    SettingsViewModel.m13324b0(this.f23500y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8883c(EnumC7070a enumC7070a, String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23497z = enumC7070a;
            this.f23494A = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8883c(this.f23497z, this.f23494A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8883c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23495x;
            if (i == 0) {
                C13186n.m1453b(obj);
                SettingsViewModel settingsViewModel = SettingsViewModel.this;
                C8884a c8884a = new C8884a(settingsViewModel, this.f23497z, this.f23494A, null);
                this.f23495x = 1;
                if (SettingsViewModel.m13323c0(settingsViewModel, true, c8884a, this) == m34636d) {
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

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d */
    /* loaded from: classes2.dex */
    public static final class C8886d implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f23503w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d$a */
        /* loaded from: classes2.dex */
        public static final class C8887a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f23504w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel$special$$inlined$map$1$2", m20196f = "SettingsViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d$a$a */
            /* loaded from: classes2.dex */
            public static final class C8888a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f23505w;

                /* renamed from: x */
                int f23506x;

                public C8888a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23505w = obj;
                    this.f23506x |= Integer.MIN_VALUE;
                    return C8887a.this.mo4529a(null, this);
                }
            }

            public C8887a(InterfaceC6787d interfaceC6787d) {
                this.f23504w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r6, bd.InterfaceC1886d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel.C8886d.C8887a.C8888a
                    if (r0 == 0) goto L13
                    r0 = r7
                    pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d$a$a r0 = (pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel.C8886d.C8887a.C8888a) r0
                    int r1 = r0.f23506x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23506x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d$a$a r0 = new pt.pingodoce.app.presentation.account.loggedAccount.settings.c$d$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f23505w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f23506x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r7)
                    goto L56
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    p468yc.C13186n.m1453b(r7)
                    kotlinx.coroutines.flow.d r7 = r5.f23504w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r6 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r6
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard$Type r2 = r6.m13798n()
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard$Type r4 = pt.pingodoce.app.data.remote.models.response.LoyaltyCard.Type.PoupaMais
                    if (r2 != r4) goto L48
                    boolean r6 = r6.m13814P()
                    if (r6 == 0) goto L48
                    r6 = r3
                    goto L49
                L48:
                    r6 = 0
                L49:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C6755b.m20201a(r6)
                    r0.f23506x = r3
                    java.lang.Object r6 = r7.mo4529a(r6, r0)
                    if (r6 != r1) goto L56
                    return r1
                L56:
                    yc.u r6 = p468yc.C13195u.f34156a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.account.loggedAccount.settings.SettingsViewModel.C8886d.C8887a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8886d(InterfaceC6785c interfaceC6785c) {
            this.f23503w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f23503w.mo20086d(new C8887a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager, AuthManager authManager, ConsentsManager consentsManager, BiometricsManager biometricsManager, PrefsManager prefsManager, CoachMarkManager coachMarkManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(biometricsManager, "biometricsManager");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(coachMarkManager, "coachMarkManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f23475m = consentsManager;
        this.f23476n = biometricsManager;
        this.f23477o = prefsManager;
        this.f23478p = coachMarkManager;
        this.f23479q = OperatorExtensions.m35176e(0L, null, new C8879b(resourcesProvider), 3, null);
        C1430c0 c1430c0 = new C1430c0();
        this.f23480r = c1430c0;
        C1436e0 c1436e0 = new C1436e0("3.1.5");
        this.f23481s = c1436e0;
        C1436e0 c1436e02 = new C1436e0(374);
        this.f23482t = c1436e02;
        this.f23483u = m106t(c7405s1.m18497m());
        this.f23484v = m106t(new C8886d(loyaltyCardManager.m18930p()));
        this.f23485w = c1430c0;
        this.f23486x = c1436e0;
        this.f23487y = c1436e02;
        c1430c0.mo166p(Boolean.valueOf(biometricsManager.m18774b()));
        c1430c0.m37055q(c1430c0, new InterfaceC1440f0() { // from class: nh.n
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SettingsViewModel.m13330V(SettingsViewModel.this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static final void m13341A0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.TERMS);
    }

    /* renamed from: L */
    public static /* synthetic */ void m13340L(SettingsViewModel settingsViewModel, View view) {
        m13301y0(settingsViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m13339M(SettingsViewModel settingsViewModel, View view) {
        m13319g0(settingsViewModel, view);
    }

    /* renamed from: N */
    public static /* synthetic */ void m13338N(SettingsViewModel settingsViewModel, View view) {
        m13341A0(settingsViewModel, view);
    }

    /* renamed from: O */
    public static /* synthetic */ void m13337O(SettingsViewModel settingsViewModel, View view) {
        m13310p0(settingsViewModel, view);
    }

    /* renamed from: P */
    public static /* synthetic */ void m13336P(SettingsViewModel settingsViewModel, View view) {
        m13321e0(settingsViewModel, view);
    }

    /* renamed from: Q */
    public static /* synthetic */ void m13335Q(SettingsViewModel settingsViewModel, View view) {
        m13307s0(settingsViewModel, view);
    }

    /* renamed from: R */
    public static /* synthetic */ void m13334R(SettingsViewModel settingsViewModel, View view) {
        m13317i0(settingsViewModel, view);
    }

    /* renamed from: S */
    public static /* synthetic */ void m13333S(SettingsViewModel settingsViewModel, View view) {
        m13303w0(settingsViewModel, view);
    }

    /* renamed from: T */
    public static /* synthetic */ void m13332T(SettingsViewModel settingsViewModel, Boolean bool) {
        m13330V(settingsViewModel, bool);
    }

    /* renamed from: U */
    public static /* synthetic */ void m13331U(SettingsViewModel settingsViewModel, View view) {
        m13305u0(settingsViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m13330V(SettingsViewModel settingsViewModel, Boolean bool) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        if (Intrinsics.equals(bool, Boolean.valueOf(settingsViewModel.f23476n.m18774b()))) {
            return;
        }
        BiometricsManager biometricsManager = settingsViewModel.f23476n;
        Intrinsics.checkIfNull(bool, "enabled");
        biometricsManager.m18772d(bool.booleanValue());
    }

    /* renamed from: W */
    public static final /* synthetic */ void m13329W(SettingsViewModel settingsViewModel, String str, EnumC7070a enumC7070a) {
        settingsViewModel.m13316j0(str, enumC7070a);
    }

    /* renamed from: X */
    public static final /* synthetic */ CoachMarkManager m13328X(SettingsViewModel settingsViewModel) {
        return settingsViewModel.f23478p;
    }

    /* renamed from: Y */
    public static final /* synthetic */ ConsentsManager m13327Y(SettingsViewModel settingsViewModel) {
        return settingsViewModel.f23475m;
    }

    /* renamed from: Z */
    public static final /* synthetic */ PrefsManager m13326Z(SettingsViewModel settingsViewModel) {
        return settingsViewModel.f23477o;
    }

    /* renamed from: a0 */
    public static final /* synthetic */ void m13325a0(SettingsViewModel settingsViewModel, String str) {
        settingsViewModel.m110k(str);
    }

    /* renamed from: b0 */
    public static final /* synthetic */ void m13324b0(SettingsViewModel settingsViewModel, Throwable th2) {
        settingsViewModel.m109l(th2);
    }

    /* renamed from: c0 */
    public static final /* synthetic */ Object m13323c0(SettingsViewModel settingsViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return settingsViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m13321e0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.APP_RATING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m13319g0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.COACH_MARKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m13317i0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.DELETE);
    }

    /* renamed from: j0 */
    private final void m13316j0(String str, EnumC7070a enumC7070a) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8883c(enumC7070a, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static final void m13310p0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.INVOICE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public static final void m13307s0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.LOGOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static final void m13305u0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.NOTIFICATIONS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m13303w0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.PIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m13301y0(SettingsViewModel settingsViewModel, View view) {
        Intrinsics.isThisObjectNull(settingsViewModel, "this$0");
        settingsViewModel.f23479q.mo9587d(EnumC8878a.PRIVACY);
    }

    /* renamed from: d0 */
    public final View.OnClickListener m13322d0() {
        return new View.OnClickListener() { // from class: nh.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13321e0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: f0 */
    public final View.OnClickListener m13320f0() {
        return new View.OnClickListener() { // from class: nh.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13319g0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: h0 */
    public final View.OnClickListener m13318h0() {
        return new View.OnClickListener() { // from class: nh.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13317i0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: k0 */
    public final LiveData m13315k0() {
        return this.f23487y;
    }

    /* renamed from: l0 */
    public final LiveData m13314l0() {
        return this.f23486x;
    }

    /* renamed from: m0 */
    public final C1430c0 m13313m0() {
        return this.f23485w;
    }

    /* renamed from: n0 */
    public final LiveData m13312n0() {
        return this.f23483u;
    }

    /* renamed from: o0 */
    public final View.OnClickListener m13311o0() {
        return new View.OnClickListener() { // from class: nh.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13310p0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: q0 */
    public final LiveData m13309q0() {
        return this.f23484v;
    }

    /* renamed from: r0 */
    public final View.OnClickListener m13308r0() {
        return new View.OnClickListener() { // from class: nh.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13307s0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: t0 */
    public final View.OnClickListener m13306t0() {
        return new View.OnClickListener() { // from class: nh.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13305u0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: v0 */
    public final View.OnClickListener m13304v0() {
        return new View.OnClickListener() { // from class: nh.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13303w0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: x0 */
    public final View.OnClickListener m13302x0() {
        return new View.OnClickListener() { // from class: nh.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13301y0(SettingsViewModel.this, view);
            }
        };
    }

    /* renamed from: z0 */
    public final View.OnClickListener m13300z0() {
        return new View.OnClickListener() { // from class: nh.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsViewModel.m13341A0(SettingsViewModel.this, view);
            }
        };
    }
}
