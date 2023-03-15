package si;

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
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p319qi.ManageAssociationsViewModel;
import p426wg.AbstractC11908n6;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.AbstractC13876n;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCardAssociation;
import td.InterfaceC10524i0;

/* renamed from: si.e */
/* loaded from: classes2.dex */
public abstract class PendingListFragment<ViewModel extends ManageAssociationsViewModel> extends AbstractC13876n {

    /* renamed from: z0 */
    private final PendingAdapter f26648z0 = m8462x2();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PendingListFragment.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyalty.pending.PendingListFragment$initViews$1$1", m20196f = "PendingListFragment.kt", m20195l = {25}, m20194m = "invokeSuspend")
    /* renamed from: si.e$a */
    /* loaded from: classes2.dex */
    public static final class C10225a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f26649x;

        /* renamed from: z */
        final /* synthetic */ List f26651z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10225a(List list, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f26651z = list;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10225a(this.f26651z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10225a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f26649x;
            if (i == 0) {
                C13186n.m1453b(obj);
                PendingAdapter m8466t2 = PendingListFragment.m8466t2(PendingListFragment.this);
                List list = this.f26651z;
                Intrinsics.checkIfNull(list, "it");
                this.f26649x = 1;
                if (m8466t2.m22148H(list, this) == m34636d) {
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
    /* compiled from: PendingListFragment.kt */
    /* renamed from: si.e$b */
    /* loaded from: classes2.dex */
    public static final class C10226b extends AbstractC6438m implements InterfaceC6112p {
        C10226b() {
            super(2);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m8460a((LoyaltyCardAssociation) obj, ((Boolean) obj2).booleanValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m8460a(LoyaltyCardAssociation loyaltyCardAssociation, boolean z) {
            Intrinsics.isThisObjectNull(loyaltyCardAssociation, "listItem");
            PendingListFragment.m8465u2(PendingListFragment.this).m10050b0(loyaltyCardAssociation, z);
        }
    }

    /* renamed from: s2 */
    public static /* synthetic */ void m8467s2(PendingListFragment pendingListFragment, List list) {
        m8463w2(pendingListFragment, list);
    }

    /* renamed from: t2 */
    public static final /* synthetic */ PendingAdapter m8466t2(PendingListFragment pendingListFragment) {
        return pendingListFragment.f26648z0;
    }

    /* renamed from: u2 */
    public static final /* synthetic */ ManageAssociationsViewModel m8465u2(PendingListFragment pendingListFragment) {
        return (ManageAssociationsViewModel) pendingListFragment.m22721j2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2 */
    public static final void m8463w2(PendingListFragment pendingListFragment, List list) {
        Intrinsics.isThisObjectNull(pendingListFragment, "this$0");
        C6772d.m20158d(LifecycleOwner.m36965a(pendingListFragment), null, null, new C10225a(list, null), 3, null);
    }

    /* renamed from: x2 */
    private final PendingAdapter m8462x2() {
        return new PendingAdapter(new C10226b());
    }

    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        ((AbstractC11908n6) m22723h2()).f31027A.setAdapter(this.f26648z0);
    }

    /* renamed from: i2 */
    protected int m8469i2() {
        return C2336R.layout.fragment_pending_association_list;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v2 */
    public void m8468p2(AbstractC11908n6 abstractC11908n6, ManageAssociationsViewModel manageAssociationsViewModel) {
        Intrinsics.isThisObjectNull(abstractC11908n6, "binding");
        Intrinsics.isThisObjectNull(manageAssociationsViewModel, "viewModel");
        manageAssociationsViewModel.m10055W().mo171i(this, new InterfaceC1440f0() { // from class: si.d
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PendingListFragment.m8463w2(PendingListFragment.this, (List) obj);
            }
        });
    }
}
