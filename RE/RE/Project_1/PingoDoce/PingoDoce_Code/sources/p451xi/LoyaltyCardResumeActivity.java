package p451xi;

import android.text.Html;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2378g;
import com.google.android.material.button.MaterialButton;
import ee.CustomDividerItemDecoration;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11756f2;
import p451xi.AbstractC12995e;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;
import td.InterfaceC10524i0;

/* renamed from: xi.c */
/* loaded from: classes2.dex */
public abstract class LoyaltyCardResumeActivity<ViewModel extends AbstractC12995e<F>, F extends FlowData> extends FlowActivity {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardResumeActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeActivity$initViews$1$1", m20196f = "LoyaltyCardResumeActivity.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: xi.c$a */
    /* loaded from: classes2.dex */
    public static final class C12992a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f33721x;

        /* renamed from: y */
        final /* synthetic */ LoyaltyCardResumeAdapter f33722y;

        /* renamed from: z */
        final /* synthetic */ List f33723z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12992a(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f33722y = loyaltyCardResumeAdapter;
            this.f33723z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12992a(this.f33722y, this.f33723z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12992a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f33721x;
            if (i == 0) {
                C13186n.m1453b(obj);
                LoyaltyCardResumeAdapter loyaltyCardResumeAdapter = this.f33722y;
                List list = this.f33723z;
                Intrinsics.checkIfNull(list, "it");
                this.f33721x = 1;
                if (loyaltyCardResumeAdapter.m22148H(list, this) == m34636d) {
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
    /* compiled from: LoyaltyCardResumeActivity.kt */
    /* renamed from: xi.c$b */
    /* loaded from: classes2.dex */
    public static final class C12993b extends AbstractC6438m implements InterfaceC6108l {
        C12993b() {
            super(1);
        }

        /* renamed from: a */
        public final void m1984a(EnumC9077a enumC9077a) {
            Intrinsics.isThisObjectNull(enumC9077a, "action");
            LoyaltyCardResumeActivity.this.m1993t1(enumC9077a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1984a((EnumC9077a) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m1995r1(LoyaltyCardResumeActivity loyaltyCardResumeActivity, LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list) {
        m1989w1(loyaltyCardResumeActivity, loyaltyCardResumeAdapter, list);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m1994s1(AbstractC11756f2 abstractC11756f2, String str) {
        m1987x1(abstractC11756f2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m1989w1(LoyaltyCardResumeActivity loyaltyCardResumeActivity, LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, List list) {
        Intrinsics.isThisObjectNull(loyaltyCardResumeActivity, "this$0");
        Intrinsics.isThisObjectNull(loyaltyCardResumeAdapter, "$adapter");
        C6772d.m20158d(LifecycleOwner.m36965a(loyaltyCardResumeActivity), null, null, new C12992a(loyaltyCardResumeAdapter, list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m1987x1(AbstractC11756f2 abstractC11756f2, String str) {
        Intrinsics.isThisObjectNull(abstractC11756f2, "$binding");
        abstractC11756f2.f30288z.setText(Html.fromHtml(str, 0));
    }

    /* renamed from: k1 */
    protected List m1997k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2144a.f6179a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* renamed from: t1 */
    public abstract void m1993t1(EnumC9077a enumC9077a);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public void m1996n1(final AbstractC11756f2 abstractC11756f2, AbstractC12995e abstractC12995e) {
        Intrinsics.isThisObjectNull(abstractC11756f2, "binding");
        Intrinsics.isThisObjectNull(abstractC12995e, "viewModel");
        super.m34589n1(abstractC11756f2, abstractC12995e);
        final LoyaltyCardResumeAdapter loyaltyCardResumeAdapter = new LoyaltyCardResumeAdapter(new C12993b());
        abstractC11756f2.f30283C.m36657h(new CustomDividerItemDecoration(this, 16, 0, 0, 0, 12, null));
        abstractC11756f2.f30283C.setAdapter(loyaltyCardResumeAdapter);
        MaterialButton materialButton = abstractC11756f2.f30284D;
        Intrinsics.checkIfNull(materialButton, "binding.submitMaterialButton");
        C2378g.m33744c(this, materialButton);
        abstractC12995e.m1968x0().mo171i(this, new InterfaceC1440f0() { // from class: xi.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoyaltyCardResumeActivity.m1989w1(LoyaltyCardResumeActivity.this, loyaltyCardResumeAdapter, (List) obj);
            }
        });
        abstractC12995e.m1966z0().mo171i(this, new InterfaceC1440f0() { // from class: xi.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                LoyaltyCardResumeActivity.m1987x1(AbstractC11756f2.this, (String) obj);
            }
        });
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_onboarding_resume;
    }
}
