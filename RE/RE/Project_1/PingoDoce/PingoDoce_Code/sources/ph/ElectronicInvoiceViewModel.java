package ph;

import android.view.View;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.FlowViewModel;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.LoyaltyCardManager;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13846i0;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: ph.d */
/* loaded from: classes2.dex */
public final class ElectronicInvoiceViewModel extends FlowViewModel {

    /* renamed from: q */
    private final InterfaceC6108l f22235q;

    /* renamed from: r */
    private final LiveData f22236r;

    /* renamed from: s */
    private final LiveData f22237s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ElectronicInvoiceViewModel.kt */
    /* renamed from: ph.d$a */
    /* loaded from: classes2.dex */
    public static final class C8625a extends AbstractC6438m implements InterfaceC6108l {
        C8625a() {
            super(1);
        }

        /* renamed from: a */
        public final void m14979a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(ElectronicInvoiceViewModel.this, C13846i0.f34954a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m14979a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: ph.d$b */
    /* loaded from: classes2.dex */
    public static final class C8626b implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f22239w;

        /* compiled from: Emitters.kt */
        /* renamed from: ph.d$b$a */
        /* loaded from: classes2.dex */
        public static final class C8627a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f22240w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.account.loggedAccount.settings.invoice.ElectronicInvoiceViewModel$special$$inlined$map$1$2", m20196f = "ElectronicInvoiceViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: ph.d$b$a$a */
            /* loaded from: classes2.dex */
            public static final class C8628a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f22241w;

                /* renamed from: x */
                int f22242x;

                public C8628a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f22241w = obj;
                    this.f22242x |= Integer.MIN_VALUE;
                    return C8627a.this.mo4529a(null, this);
                }
            }

            public C8627a(InterfaceC6787d interfaceC6787d) {
                this.f22240w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ph.ElectronicInvoiceViewModel.C8626b.C8627a.C8628a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ph.d$b$a$a r0 = (ph.ElectronicInvoiceViewModel.C8626b.C8627a.C8628a) r0
                    int r1 = r0.f22242x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f22242x = r1
                    goto L18
                L13:
                    ph.d$b$a$a r0 = new ph.d$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f22241w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f22242x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f22240w
                    pt.pingodoce.app.data.remote.models.response.LoyaltyCard r5 = (pt.pingodoce.app.data.remote.models.response.LoyaltyCard) r5
                    java.lang.String r5 = r5.m13799m()
                    r0.f22242x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ph.ElectronicInvoiceViewModel.C8626b.C8627a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8626b(InterfaceC6785c interfaceC6785c) {
            this.f22239w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f22239w.mo20086d(new C8627a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: ph.d$c */
    /* loaded from: classes2.dex */
    public static final class C8629c<I, O> implements InterfaceC7946a {

        /* renamed from: a */
        final /* synthetic */ ResourcesProvider f22244a;

        public C8629c(ResourcesProvider resourcesProvider) {
            this.f22244a = resourcesProvider;
        }

        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            String string = this.f22244a.m6899a().getString(C2336R.string.lbl_onboarding_resume_card);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            return new LoyaltyCardResumeViewModel(string, (String) obj, null, false, null, false, false, false, 0, false, null, false, 4092, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElectronicInvoiceViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, LoyaltyCardManager loyaltyCardManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(loyaltyCardManager, "loyaltyCardManager");
        this.f22235q = BaseViewModel.m113I(this, 0L, new C8625a(), 1, null);
        LiveData m36993a = C1465n0.m36993a(m106t(new C8626b(loyaltyCardManager.m18930p())), new C8629c(resourcesProvider));
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f22236r = m36993a;
        this.f22237s = m36993a;
    }

    /* renamed from: V */
    public static /* synthetic */ void m14983V(ElectronicInvoiceViewModel electronicInvoiceViewModel, View view) {
        m14980Y(electronicInvoiceViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m14980Y(ElectronicInvoiceViewModel electronicInvoiceViewModel, View view) {
        Intrinsics.isThisObjectNull(electronicInvoiceViewModel, "this$0");
        electronicInvoiceViewModel.f22235q.mo9587d(C13195u.f34156a);
    }

    /* renamed from: W */
    public final LiveData m14982W() {
        return this.f22237s;
    }

    /* renamed from: X */
    public final View.OnClickListener m14981X() {
        return new View.OnClickListener() { // from class: ph.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ElectronicInvoiceViewModel.m14980Y(ElectronicInvoiceViewModel.this, view);
            }
        };
    }
}
