package pt.pingodoce.app.presentation.login.pin.recovery;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.C0868i;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import ci.C2142f;
import ci.C2146h;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Arrays;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import mg.AuthManager;
import mg.C7405s1;
import mg.EmailManager;
import mg.PinRecoveryManager;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p321qk.InterfaceC9761f;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13877n0;
import pt.pingodoce.app.data.local.flows.RecoverPinFlowData;
import pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a */
/* loaded from: classes2.dex */
public final class PinRecoverViewModel extends SubmitAnimatedViewModel implements InterfaceC9761f {

    /* renamed from: C */
    private final AuthManager f24500C;

    /* renamed from: D */
    private final PinRecoveryManager f24501D;

    /* renamed from: E */
    private final EmailManager f24502E;

    /* renamed from: F */
    private final C7405s1 f24503F;

    /* renamed from: G */
    private EnumC9321b f24504G;

    /* renamed from: H */
    private final C1436e0 f24505H;

    /* renamed from: I */
    private final C1436e0 f24506I;

    /* renamed from: J */
    private final C1436e0 f24507J;

    /* renamed from: K */
    private final C1436e0 f24508K;

    /* renamed from: L */
    private final C1436e0 f24509L;

    /* renamed from: M */
    private final C1436e0 f24510M;

    /* renamed from: N */
    private final C1436e0 f24511N;

    /* renamed from: O */
    private final C1436e0 f24512O;

    /* renamed from: P */
    private final LiveData f24513P;

    /* renamed from: Q */
    private final LiveData f24514Q;

    /* renamed from: R */
    private final LiveData f24515R;

    /* renamed from: S */
    private final LiveData f24516S;

    /* renamed from: T */
    private final Void f24517T;

    /* renamed from: U */
    private final InterfaceC6108l f24518U;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoverViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel$1", m20196f = "PinRecoverViewModel.kt", m20195l = {75}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$a */
    /* loaded from: classes2.dex */
    public static final class C9315a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24519x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PinRecoverViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel$1$1", m20196f = "PinRecoverViewModel.kt", m20195l = {76}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$a$a */
        /* loaded from: classes2.dex */
        public static final class C9316a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f24521x;

            /* renamed from: y */
            final /* synthetic */ PinRecoverViewModel f24522y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9316a(PinRecoverViewModel pinRecoverViewModel, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f24522y = pinRecoverViewModel;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9316a(this.f24522y, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9316a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f24521x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    AuthManager m11719v0 = PinRecoverViewModel.m11719v0(this.f24522y);
                    this.f24521x = 1;
                    if (m11719v0.m18874v(this) == m34636d) {
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

        C9315a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9315a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9315a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f24519x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PinRecoverViewModel pinRecoverViewModel = PinRecoverViewModel.this;
                C9316a c9316a = new C9316a(pinRecoverViewModel, null);
                this.f24519x = 1;
                if (PinRecoverViewModel.m11718w0(pinRecoverViewModel, true, c9316a, this) == m34636d) {
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

    /* compiled from: PinRecoverViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC9317b {
        INTRO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoverViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$c */
    /* loaded from: classes2.dex */
    public static final class C9318c extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: PinRecoverViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$c$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9319a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f24524a;

            static {
                int[] iArr = new int[EnumC9317b.values().length];
                iArr[EnumC9317b.INTRO.ordinal()] = 1;
                f24524a = iArr;
            }
        }

        C9318c() {
            super(1);
        }

        /* renamed from: a */
        public final void m11712a(EnumC9317b enumC9317b) {
            Intrinsics.isThisObjectNull(enumC9317b, "action");
            if (C9319a.f24524a[enumC9317b.ordinal()] == 1) {
                PinRecoverViewModel.this.m104v(C2146h.f6181a);
                PinRecoverViewModel.this.m104v(C2142f.f6177a);
                BaseViewModel.m119C(PinRecoverViewModel.this, C13877n0.f34992a, null, 2, null);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m11712a((EnumC9317b) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinRecoverViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel", m20196f = "PinRecoverViewModel.kt", m20195l = {C0868i.f2748C0, C0868i.f2773H0}, m20194m = "onSubmit")
    /* renamed from: pt.pingodoce.app.presentation.login.pin.recovery.a$d */
    /* loaded from: classes2.dex */
    public static final class C9320d extends AbstractC6757d {

        /* renamed from: w */
        Object f24525w;

        /* renamed from: x */
        /* synthetic */ Object f24526x;

        /* renamed from: z */
        int f24528z;

        C9320d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f24526x = obj;
            this.f24528z |= Integer.MIN_VALUE;
            return PinRecoverViewModel.this.m11722n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinRecoverViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AuthManager authManager, PinRecoveryManager pinRecoveryManager, EmailManager emailManager, C7405s1 c7405s1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(authManager, "authManager");
        Intrinsics.isThisObjectNull(pinRecoveryManager, "pinRecoveryManager");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        Intrinsics.isThisObjectNull(c7405s1, "userManager");
        this.f24500C = authManager;
        this.f24501D = pinRecoveryManager;
        this.f24502E = emailManager;
        this.f24503F = c7405s1;
        this.f24504G = EnumC9321b.VALIDATED;
        C1436e0 m37003d = c1459l0.m37003d("_title", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<String>(\"_title\", \"\")");
        this.f24505H = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_subtitle", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_subtitle\", \"\")");
        this.f24506I = m37003d2;
        C1436e0 c1436e0 = new C1436e0(C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_email));
        this.f24507J = c1436e0;
        C1436e0 m37003d3 = c1459l0.m37003d("_helpLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d3, "stateHandle.getLiveData<String>(\"_helpLabel\", \"\")");
        this.f24508K = m37003d3;
        Boolean bool = Boolean.FALSE;
        C1436e0 m37003d4 = c1459l0.m37003d("_iconAlertVisible", bool);
        Intrinsics.checkIfNull(m37003d4, "stateHandle.getLiveData<…iconAlertVisible\", false)");
        this.f24509L = m37003d4;
        Boolean bool2 = Boolean.TRUE;
        C1436e0 m37003d5 = c1459l0.m37003d("_btnVisible", bool2);
        Intrinsics.checkIfNull(m37003d5, "stateHandle.getLiveData<…ean>(\"_btnVisible\", true)");
        this.f24510M = m37003d5;
        C1436e0 m37003d6 = c1459l0.m37003d("_btnLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d6, "stateHandle.getLiveData<String>(\"_btnLabel\", \"\")");
        this.f24511N = m37003d6;
        this.f24512O = new C1436e0(bool2);
        this.f24513P = m37003d;
        this.f24514Q = m37003d2;
        this.f24515R = c1436e0;
        this.f24516S = m37003d4;
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_recover_pin_code_valid_email_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        m37003d.mo166p(string);
        m37003d4.mo166p(bool);
        C6429c0 c6429c0 = C6429c0.f17515a;
        String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_recover_pin_code_valid_email_subtitle);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{((RecoverPinFlowData) m34578S()).m14694b()}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        m37003d2.mo166p(format);
        String string3 = resourcesProvider.m6899a().getString(C2336R.string.btn_resend_recover_email);
        Intrinsics.checkIfNull(string3, "ctx.getString(id)");
        m37003d6.mo166p(string3);
        if (c7405s1.m18496n()) {
            C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9315a(null), 3, null);
        }
        this.f24518U = OperatorExtensions.m35176e(0L, null, new C9318c(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public static final void m11724D0(PinRecoverViewModel pinRecoverViewModel, View view) {
        Intrinsics.isThisObjectNull(pinRecoverViewModel, "this$0");
        pinRecoverViewModel.f24518U.mo9587d(EnumC9317b.INTRO);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m11720u0(PinRecoverViewModel pinRecoverViewModel, View view) {
        m11724D0(pinRecoverViewModel, view);
    }

    /* renamed from: v0 */
    public static final /* synthetic */ AuthManager m11719v0(PinRecoverViewModel pinRecoverViewModel) {
        return pinRecoverViewModel.f24500C;
    }

    /* renamed from: w0 */
    public static final /* synthetic */ Object m11718w0(PinRecoverViewModel pinRecoverViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return pinRecoverViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: A0 */
    public final LiveData m11727A0() {
        return this.f24514Q;
    }

    /* renamed from: B0 */
    public final LiveData m11726B0() {
        return this.f24513P;
    }

    /* renamed from: C0 */
    public final View.OnClickListener m11725C0() {
        return new View.OnClickListener() { // from class: qk.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PinRecoverViewModel.m11724D0(PinRecoverViewModel.this, view);
            }
        };
    }

    /* renamed from: a */
    public String mo10002a() {
        return ((RecoverPinFlowData) m34578S()).m14693c();
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m11723f0() {
        return (Drawable) m11715z0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m11722n0(bd.InterfaceC1886d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel.C9320d
            if (r0 == 0) goto L13
            r0 = r8
            pt.pingodoce.app.presentation.login.pin.recovery.a$d r0 = (pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel.C9320d) r0
            int r1 = r0.f24528z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24528z = r1
            goto L18
        L13:
            pt.pingodoce.app.presentation.login.pin.recovery.a$d r0 = new pt.pingodoce.app.presentation.login.pin.recovery.a$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24526x
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f24528z
            java.lang.String r3 = "ctx.getString(id)"
            r4 = 2131886775(0x7f1202b7, float:1.9408138E38)
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 != r6) goto L36
            java.lang.Object r0 = r0.f24525w
            pt.pingodoce.app.presentation.login.pin.recovery.a r0 = (pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel) r0
            p468yc.C13186n.m1453b(r8)
            goto Lb3
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3e:
            java.lang.Object r0 = r0.f24525w
            pt.pingodoce.app.presentation.login.pin.recovery.a r0 = (pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel) r0
            p468yc.C13186n.m1453b(r8)
            goto L7a
        L46:
            p468yc.C13186n.m1453b(r8)
            com.github.razir.progressbutton.h r8 = new com.github.razir.progressbutton.h
            r8.<init>()
            r8.m33752h(r6)
            androidx.lifecycle.e0 r2 = r7.f24511N
            java.lang.Object r2 = r2.mo172f()
            p181jd.Intrinsics.ifNullDoSomething(r2)
            java.lang.String r2 = (java.lang.String) r2
            r8.m33754f(r2)
            r7.m20318q0(r8)
            pt.pingodoce.app.presentation.login.pin.recovery.b r8 = r7.f24504G
            pt.pingodoce.app.presentation.login.pin.recovery.b r2 = pt.pingodoce.app.presentation.login.pin.recovery.EnumC9321b.NOT_VALIDATED
            if (r8 != r2) goto La1
            mg.v r8 = r7.f24502E
            java.lang.String r2 = r7.mo10002a()
            r0.f24525w = r7
            r0.f24528z = r5
            java.lang.Object r8 = r8.m18455b(r2, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            r0 = r7
        L7a:
            mg.x r8 = (mg.AbstractC7468x) r8
            boolean r1 = r8 instanceof mg.AbstractC7468x.C7472b
            if (r1 == 0) goto L93
            u5.a r8 = r0.m20390g()
            android.content.Context r8 = r8.m6899a()
            java.lang.String r8 = r8.getString(r4)
            p181jd.Intrinsics.checkIfNull(r8, r3)
            r0.m110k(r8)
            goto Ld9
        L93:
            boolean r1 = r8 instanceof mg.AbstractC7468x.AbstractC7469a
            if (r1 == 0) goto Ld9
            mg.x$a r8 = (mg.AbstractC7468x.AbstractC7469a) r8
            we.b r8 = r8.m18430a()
            r0.m109l(r8)
            goto Ld9
        La1:
            mg.q0 r8 = r7.f24501D
            java.lang.String r2 = r7.mo10002a()
            r0.f24525w = r7
            r0.f24528z = r6
            java.lang.Object r8 = r8.m18594c(r2, r0)
            if (r8 != r1) goto Lb2
            return r1
        Lb2:
            r0 = r7
        Lb3:
            og.a r8 = (p276og.Result) r8
            boolean r1 = r8 instanceof p276og.Result.C8077b
            if (r1 == 0) goto Lc3
            og.a$b r8 = (p276og.Result.C8077b) r8
            java.lang.Throwable r8 = r8.m16964b()
            r0.m109l(r8)
            goto Ld9
        Lc3:
            boolean r8 = r8 instanceof p276og.Result.C8078c
            if (r8 == 0) goto Ld9
            u5.a r8 = r0.m20390g()
            android.content.Context r8 = r8.m6899a()
            java.lang.String r8 = r8.getString(r4)
            p181jd.Intrinsics.checkIfNull(r8, r3)
            r0.m110k(r8)
        Ld9:
            r0.m20319p0()
            yc.u r8 = p468yc.C13195u.f34156a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.login.pin.recovery.PinRecoverViewModel.m11722n0(bd.d):java.lang.Object");
    }

    /* renamed from: o0 */
    protected int m11721o0() {
        return 2131951648;
    }

    /* renamed from: x0 */
    public final LiveData m11717x0() {
        return this.f24515R;
    }

    /* renamed from: y0 */
    public final LiveData m11716y0() {
        return this.f24516S;
    }

    /* renamed from: z0 */
    protected Void m11715z0() {
        return this.f24517T;
    }
}
