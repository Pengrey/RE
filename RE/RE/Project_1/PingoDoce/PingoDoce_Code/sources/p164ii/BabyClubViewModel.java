package p164ii;

import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import ki.SubmitAnimatedViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.AnalyticsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p489zc.C13780s;
import p494zh.AbstractC13816c;
import p494zh.C13826e;
import p494zh.C13830f;
import p494zh.C13840h;
import p494zh.C13845i;
import p494zh.C13850j;
import p494zh.C13855k;
import pt.pingodoce.app.data.local.flows.FlowData;
import pt.pingodoce.app.data.local.models.clubs.EnumC8692b;
import sd.C10156i;

/* renamed from: ii.r */
/* loaded from: classes2.dex */
public abstract class BabyClubViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f16918C;

    /* renamed from: D */
    private int f16919D;

    /* renamed from: E */
    private final C1430c0 f16920E;

    /* renamed from: F */
    private final C1430c0 f16921F;

    /* renamed from: G */
    private final C1430c0 f16922G;

    /* renamed from: H */
    private final C1436e0 f16923H;

    /* renamed from: I */
    private final LiveData f16924I;

    /* renamed from: J */
    private final C1436e0 f16925J;

    /* renamed from: K */
    private final LiveData f16926K;

    /* renamed from: L */
    private final C1436e0 f16927L;

    /* renamed from: M */
    private final LiveData f16928M;

    /* renamed from: N */
    private final C1436e0 f16929N;

    /* renamed from: O */
    private final LiveData f16930O;

    /* renamed from: P */
    private final C1436e0 f16931P;

    /* renamed from: Q */
    private final LiveData f16932Q;

    /* renamed from: R */
    private final C1436e0 f16933R;

    /* renamed from: S */
    private final C1436e0 f16934S;

    /* renamed from: T */
    private final C1436e0 f16935T;

    /* renamed from: U */
    private final C1436e0 f16936U;

    /* renamed from: V */
    private final C1436e0 f16937V;

    /* renamed from: W */
    private final ArrayList f16938W;

    /* compiled from: BabyClubViewModel.kt */
    /* renamed from: ii.r$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC6173a {

        /* compiled from: BabyClubViewModel.kt */
        /* renamed from: ii.r$a$a */
        /* loaded from: classes2.dex */
        public static final class C6174a extends AbstractC6173a {

            /* renamed from: a */
            public static final C6174a f16939a = new C6174a();

            private C6174a() {
                super(null);
            }
        }

        /* compiled from: BabyClubViewModel.kt */
        /* renamed from: ii.r$a$b */
        /* loaded from: classes2.dex */
        public static final class C6175b extends AbstractC6173a {

            /* renamed from: a */
            public static final C6175b f16940a = new C6175b();

            private C6175b() {
                super(null);
            }
        }

        private AbstractC6173a() {
        }

        public /* synthetic */ AbstractC6173a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BabyClubViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        ArrayList m201c;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f16918C = analyticsManager;
        C1430c0 c1430c0 = new C1430c0();
        this.f16920E = c1430c0;
        this.f16921F = c1430c0;
        this.f16922G = new C1430c0();
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", bool);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f16923H = m37003d;
        this.f16924I = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f16925J = m37003d2;
        this.f16926K = m37003d2;
        Boolean bool2 = Boolean.TRUE;
        C1436e0 m37003d3 = c1459l0.m37003d("isNameVisible", bool2);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<…n>(\"isNameVisible\", true)");
        this.f16927L = m37003d3;
        this.f16928M = m37003d3;
        C1436e0 m37003d4 = c1459l0.m37003d("isBirthdateVisible", bool);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<…BirthdateVisible\", false)");
        this.f16929N = m37003d4;
        this.f16930O = m37003d4;
        C1436e0 m37003d5 = c1459l0.m37003d("isIdVisible", bool);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData<…an>(\"isIdVisible\", false)");
        this.f16931P = m37003d5;
        this.f16932Q = m37003d5;
        C1436e0 m37004c = c1459l0.m37004c("name");
        Intrinsics.checkIfNull(m37004c, "stateHandle.getLiveData<String>(\"name\")");
        this.f16933R = m37004c;
        C1436e0 m37004c2 = c1459l0.m37004c("idNumber");
        Intrinsics.checkIfNull(m37004c2, "stateHandle.getLiveData<String>(\"idNumber\")");
        this.f16934S = m37004c2;
        C1436e0 m37004c3 = c1459l0.m37004c("idType");
        Intrinsics.checkIfNull(m37004c3, "stateHandle.getLiveData<String>(\"idType\")");
        this.f16935T = m37004c3;
        C1436e0 m37004c4 = c1459l0.m37004c("birthdate");
        Intrinsics.checkIfNull(m37004c4, "stateHandle.getLiveData<String>(\"birthdate\")");
        this.f16936U = m37004c4;
        Intrinsics.checkIfNull(c1459l0.m37004c("day"), "stateHandle.getLiveData<Int>(\"day\")");
        Intrinsics.checkIfNull(c1459l0.m37004c("month"), "stateHandle.getLiveData<Int>(\"month\")");
        Intrinsics.checkIfNull(c1459l0.m37004c("year"), "stateHandle.getLiveData<Int>(\"year\")");
        C1436e0 m37003d6 = c1459l0.m37003d("isCCChecked", bool2);
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData(\"isCCChecked\", true)");
        this.f16937V = m37003d6;
        c1430c0.m37055q(m37004c, new InterfaceC1440f0() { // from class: ii.o
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BabyClubViewModel.m21989x0(BabyClubViewModel.this, (String) obj);
            }
        });
        c1430c0.m37055q(m37004c4, new InterfaceC1440f0() { // from class: ii.q
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BabyClubViewModel.m21988y0(BabyClubViewModel.this, (String) obj);
            }
        });
        c1430c0.m37055q(m37004c2, new InterfaceC1440f0() { // from class: ii.p
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                BabyClubViewModel.m21987z0(BabyClubViewModel.this, (String) obj);
            }
        });
        m201c = C13780s.m201c(C13850j.f34958a, C13826e.f34933a, C13840h.f34948a, C13845i.f34953a, C13855k.f34963a, C13830f.f34938a);
        this.f16938W = m201c;
    }

    /* renamed from: S0 */
    public static /* synthetic */ void m21997S0(BabyClubViewModel babyClubViewModel, boolean z, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toggleError");
        }
        if ((i & 2) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        babyClubViewModel.m21998R0(z, str);
    }

    /* renamed from: T0 */
    private final boolean m21996T0(String str) {
        return new C10156i("\\d{4,6}").m9021d(str);
    }

    /* renamed from: U0 */
    private final boolean m21995U0(String str) {
        return new C10156i("\\d{8,9}").m9021d(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (m21995U0(r0) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (m21996T0(r5) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        m21997S0(r7, false, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        return true;
     */
    /* renamed from: V0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m21994V0() {
        /*
            r7 = this;
            androidx.lifecycle.e0 r0 = r7.f16934S
            java.lang.Object r0 = r0.mo172f()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L15
            int r0 = r0.length()
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            r3 = 2
            r4 = 0
            if (r0 != 0) goto L77
            androidx.lifecycle.e0 r0 = r7.f16937V
            java.lang.Object r0 = r0.mo172f()
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r0 = p181jd.Intrinsics.equals(r0, r5)
            java.lang.String r5 = ""
            if (r0 == 0) goto L3b
            androidx.lifecycle.e0 r0 = r7.f16934S
            java.lang.Object r0 = r0.mo172f()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L35
            r0 = r5
        L35:
            boolean r0 = r7.m21995U0(r0)
            if (r0 != 0) goto L5b
        L3b:
            androidx.lifecycle.e0 r0 = r7.f16937V
            java.lang.Object r0 = r0.mo172f()
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r0 = p181jd.Intrinsics.equals(r0, r6)
            if (r0 == 0) goto L5f
            androidx.lifecycle.e0 r0 = r7.f16934S
            java.lang.Object r0 = r0.mo172f()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L54
            goto L55
        L54:
            r5 = r0
        L55:
            boolean r0 = r7.m21996T0(r5)
            if (r0 == 0) goto L5f
        L5b:
            m21997S0(r7, r2, r4, r3, r4)
            return r1
        L5f:
            u5.a r0 = r7.m20390g()
            r3 = 2131886441(0x7f120169, float:1.940746E38)
            android.content.Context r0 = r0.m6899a()
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r3 = "ctx.getString(id)"
            p181jd.Intrinsics.checkIfNull(r0, r3)
            r7.m21998R0(r1, r0)
            goto L7a
        L77:
            m21997S0(r7, r2, r4, r3, r4)
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164ii.BabyClubViewModel.m21994V0():boolean");
    }

    /* renamed from: W0 */
    private final void m21993W0() {
        Boolean bool;
        m20319p0();
        if (!Intrinsics.equals(this.f16938W.get(this.f16919D), C13850j.f34958a) && !Intrinsics.equals(this.f16938W.get(this.f16919D), C13830f.f34938a)) {
            if (Intrinsics.equals(this.f16938W.get(this.f16919D), C13840h.f34948a)) {
                C1430c0 c1430c0 = this.f16920E;
                CharSequence charSequence = (CharSequence) this.f16936U.mo172f();
                if (charSequence == null || charSequence.length() == 0) {
                    r1 = true;
                }
                c1430c0.mo166p(Boolean.valueOf(!r1));
                return;
            } else if (Intrinsics.equals(this.f16938W.get(this.f16919D), C13845i.f34953a)) {
                this.f16920E.mo166p(Boolean.valueOf(m21994V0()));
                return;
            } else {
                return;
            }
        }
        C1430c0 c1430c02 = this.f16920E;
        String str = (String) this.f16933R.mo172f();
        if (str != null) {
            bool = Boolean.valueOf(str.length() > 0);
        } else {
            bool = Boolean.FALSE;
        }
        c1430c02.mo166p(bool);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m21992u0(BabyClubViewModel babyClubViewModel, String str) {
        m21989x0(babyClubViewModel, str);
    }

    /* renamed from: v0 */
    public static /* synthetic */ void m21991v0(BabyClubViewModel babyClubViewModel, String str) {
        m21987z0(babyClubViewModel, str);
    }

    /* renamed from: w0 */
    public static /* synthetic */ void m21990w0(BabyClubViewModel babyClubViewModel, String str) {
        m21988y0(babyClubViewModel, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m21989x0(BabyClubViewModel babyClubViewModel, String str) {
        Intrinsics.isThisObjectNull(babyClubViewModel, "this$0");
        babyClubViewModel.m21993W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m21988y0(BabyClubViewModel babyClubViewModel, String str) {
        Intrinsics.isThisObjectNull(babyClubViewModel, "this$0");
        babyClubViewModel.m21993W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m21987z0(BabyClubViewModel babyClubViewModel, String str) {
        Intrinsics.isThisObjectNull(babyClubViewModel, "this$0");
        babyClubViewModel.m21993W0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A0 */
    public final String m22015A0() {
        InterfaceC7886d.C7887a.m17629a(this.f16918C, AnalyticEvents.AbstractC7709b.C7725o.f20351b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        if (Intrinsics.equals(this.f16937V.mo172f(), Boolean.TRUE)) {
            return EnumC8692b.CC.toString();
        }
        return EnumC8692b.CN.toString();
    }

    /* renamed from: B0 */
    public final AbstractC13816c m22014B0() {
        Object obj = this.f16938W.get(this.f16919D);
        Intrinsics.checkIfNull(obj, "listOfSteps[currentStep]");
        return (AbstractC13816c) obj;
    }

    /* renamed from: C0 */
    public final void m22013C0() {
        this.f16919D = this.f16938W.indexOf(C13830f.f34938a);
    }

    /* renamed from: D0 */
    public final C1436e0 m22012D0() {
        return this.f16936U;
    }

    /* renamed from: E0 */
    public final LiveData m22011E0() {
        return this.f16930O;
    }

    /* renamed from: F0 */
    public final C1430c0 m22010F0() {
        return this.f16921F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G0 */
    public final int m22009G0() {
        return this.f16919D;
    }

    /* renamed from: H0 */
    public final LiveData m22008H0() {
        return this.f16926K;
    }

    /* renamed from: I0 */
    public final C1436e0 m22007I0() {
        return this.f16934S;
    }

    /* renamed from: J0 */
    public final C1436e0 m22006J0() {
        return this.f16935T;
    }

    /* renamed from: K0 */
    public final LiveData m22005K0() {
        return this.f16932Q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L0 */
    public final ArrayList m22004L0() {
        return this.f16938W;
    }

    /* renamed from: M0 */
    public final C1436e0 m22003M0() {
        return this.f16933R;
    }

    /* renamed from: N0 */
    public final LiveData m22002N0() {
        return this.f16928M;
    }

    /* renamed from: O0 */
    public final C1436e0 m22001O0() {
        return this.f16937V;
    }

    /* renamed from: P0 */
    public final LiveData m22000P0() {
        return this.f16924I;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final void m21999Q0(int i) {
        this.f16919D = i;
    }

    /* renamed from: R0 */
    protected final void m21998R0(boolean z, String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f16923H.mo166p(Boolean.valueOf(z));
        this.f16925J.mo166p(str);
    }
}
