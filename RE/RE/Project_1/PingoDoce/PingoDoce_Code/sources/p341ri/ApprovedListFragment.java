package p341ri;

import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p319qi.ManageAssociationsViewModel;
import p426wg.AbstractC11869l6;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AbstractC13876n;
import td.InterfaceC10524i0;

/* renamed from: ri.c */
/* loaded from: classes2.dex */
public abstract class ApprovedListFragment<ViewModel extends ManageAssociationsViewModel> extends AbstractC13876n {

    /* renamed from: z0 */
    private final ApprovedAdapter f25910z0 = new ApprovedAdapter();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ApprovedListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyalty.approved.ApprovedListFragment$initViews$1$1", m20196f = "ApprovedListFragment.kt", m20195l = {25}, m20194m = "invokeSuspend")
    /* renamed from: ri.c$a */
    /* loaded from: classes2.dex */
    public static final class C9910a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f25911x;

        /* renamed from: z */
        final /* synthetic */ List f25913z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9910a(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f25913z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9910a(this.f25913z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9910a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f25911x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ApprovedAdapter m9718t2 = ApprovedListFragment.m9718t2(ApprovedListFragment.this);
                List list = this.f25913z;
                Intrinsics.checkIfNull(list, "it");
                this.f25911x = 1;
                if (m9718t2.m22148H(list, this) == m34636d) {
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

    /* renamed from: s2 */
    public static /* synthetic */ void m9719s2(ApprovedListFragment approvedListFragment, List list) {
        m9716v2(approvedListFragment, list);
    }

    /* renamed from: t2 */
    public static final /* synthetic */ ApprovedAdapter m9718t2(ApprovedListFragment approvedListFragment) {
        return approvedListFragment.f25910z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v2 */
    public static final void m9716v2(ApprovedListFragment approvedListFragment, List list) {
        Intrinsics.isThisObjectNull(approvedListFragment, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(approvedListFragment), null, null, new C9910a(list, null), 3, null);
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        ((AbstractC11869l6) m22723h2()).f30864x.setAdapter(this.f25910z0);
    }

    /* renamed from: i2 */
    protected int m9721i2() {
        return C2336R.layout.fragment_approved_association_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u2 */
    public void m9720p2(AbstractC11869l6 abstractC11869l6, ManageAssociationsViewModel manageAssociationsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11869l6, "binding");
        Intrinsics.isThisObjectNull(manageAssociationsViewModel, "viewModel");
        manageAssociationsViewModel.m10056V().mo171i(this, new InterfaceC1440f0() { // from class: ri.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ApprovedListFragment.m9716v2(ApprovedListFragment.this, (List) obj);
            }
        });
    }
}
