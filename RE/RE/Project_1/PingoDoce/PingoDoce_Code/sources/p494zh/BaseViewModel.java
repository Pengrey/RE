package p494zh;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.FlowLiveData;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import ci.C2153n;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ke.CoreBaseViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import mg.C7405s1;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import td.C10565r0;
import td.InterfaceC10524i0;
import ve.InvalidGrantException;
import ve.VersionControlException;

/* renamed from: zh.o */
/* loaded from: classes2.dex */
public abstract class BaseViewModel extends CoreBaseViewModel {

    /* renamed from: i */
    protected C7405s1 f34995i;

    /* renamed from: j */
    private final InterfaceC13178g f34996j;

    /* renamed from: k */
    private final C1436e0 f34997k;

    /* renamed from: l */
    private final LiveData f34998l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    /* renamed from: zh.o$a */
    /* loaded from: classes2.dex */
    public static final class C13880a extends AbstractC6438m implements InterfaceC6097a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BaseViewModel.kt */
        /* renamed from: zh.o$a$a */
        /* loaded from: classes2.dex */
        public static final class C13881a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ BaseViewModel f35000w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13881a(BaseViewModel baseViewModel) {
                super(1);
                this.f35000w = baseViewModel;
            }

            /* renamed from: a */
            public final void m97a(boolean z) {
                BaseViewModel.m107s(this.f35000w).mo166p(Boolean.valueOf(z));
            }

            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                m97a(((Boolean) obj).booleanValue());
                return C13195u.f34156a;
            }
        }

        C13880a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC6108l mo42214q() {
            return OperatorExtensions.m35177d(BaseViewModel.this.m118D(), C1473p0.m36987a(BaseViewModel.this), new C13881a(BaseViewModel.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.base.BaseViewModel$togglePlaceHolders$1", m20196f = "BaseViewModel.kt", m20195l = {58}, m20194m = "invokeSuspend")
    /* renamed from: zh.o$b */
    /* loaded from: classes2.dex */
    public static final class C13882b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ BaseViewModel f35001A;

        /* renamed from: x */
        int f35002x;

        /* renamed from: y */
        final /* synthetic */ boolean f35003y;

        /* renamed from: z */
        final /* synthetic */ boolean f35004z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13882b(boolean z, boolean z2, BaseViewModel baseViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f35003y = z;
            this.f35004z = z2;
            this.f35001A = baseViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C13882b(this.f35003y, this.f35004z, this.f35001A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C13882b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f35002x;
            if (i == 0) {
                C13186n.m1453b(obj);
                long j = (this.f35003y || !this.f35004z) ? 0L : 500L;
                this.f35002x = 1;
                if (C10565r0.m7677a(j, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            BaseViewModel.m108r(this.f35001A).mo9587d(C6755b.m20201a(this.f35003y));
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        InterfaceC13178g m1464a;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        m1464a = LazyJVM.m1464a(new C13880a());
        this.f34996j = m1464a;
        C1436e0 c1436e0 = new C1436e0();
        this.f34997k = c1436e0;
        this.f34998l = c1436e0;
    }

    /* renamed from: C */
    public static /* synthetic */ void m119C(BaseViewModel baseViewModel, AbstractC13816c abstractC13816c, Object obj, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateTo");
        }
        if ((i & 2) != 0) {
            obj = null;
        }
        baseViewModel.m120B(abstractC13816c, obj);
    }

    /* renamed from: I */
    public static /* synthetic */ InterfaceC6108l m113I(BaseViewModel baseViewModel, long j, InterfaceC6108l interfaceC6108l, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 1000;
            }
            return baseViewModel.m114H(j, interfaceC6108l);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: throttleClick");
    }

    /* renamed from: K */
    public static /* synthetic */ void m111K(BaseViewModel baseViewModel, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: togglePlaceHolders");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        baseViewModel.m112J(z, z2);
    }

    /* renamed from: r */
    public static final /* synthetic */ InterfaceC6108l m108r(BaseViewModel baseViewModel) {
        return baseViewModel.m103w();
    }

    /* renamed from: s */
    public static final /* synthetic */ C1436e0 m107s(BaseViewModel baseViewModel) {
        return baseViewModel.f34997k;
    }

    /* renamed from: w */
    private final InterfaceC6108l m103w() {
        return (InterfaceC6108l) this.f34996j.getValue();
    }

    /* renamed from: A */
    public final boolean m121A() {
        return m101y().m18495o();
    }

    /* renamed from: B */
    public final void m120B(AbstractC13816c abstractC13816c, Object obj) {
        Intrinsics.isThisObjectNull(abstractC13816c, "to");
        UiEventsLiveData.f18671a.m19512r(abstractC13816c, obj);
    }

    /* renamed from: D */
    protected long m118D() {
        return 200L;
    }

    /* renamed from: E */
    protected final void m117E() {
        UiEventsLiveData.f18671a.m19513q();
    }

    /* renamed from: F */
    protected final void m116F() {
        UiEventsLiveData.f18671a.m19509u();
    }

    /* renamed from: G */
    public final void m115G() {
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        String string = m20390g().m6899a().getString(C2336R.string.dialog_caution_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String string2 = m20390g().m6899a().getString(C2336R.string.dialog_action_unauthorised);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        UiEventsLiveData.m19514p(uiEventsLiveData, string, string2, null, 4, null);
    }

    /* renamed from: H */
    protected final InterfaceC6108l m114H(long j, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "clickAction");
        return OperatorExtensions.m35177d(j, C1473p0.m36987a(this), interfaceC6108l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public final void m112J(boolean z, boolean z2) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C13882b(z, z2, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m110k(String str) {
        if (str != null) {
            SnackBarLiveData.m21968c(SnackBarLiveData.f16957a, str, null, 0, 0, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public void m109l(Throwable th2) {
        Intrinsics.isThisObjectNull(th2, "t");
        if (th2 instanceof InvalidGrantException) {
            m117E();
        } else if (th2 instanceof VersionControlException) {
            m116F();
        } else {
            super.m20385l(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final LiveData m106t(InterfaceC6785c interfaceC6785c) {
        Intrinsics.isThisObjectNull(interfaceC6785c, "<this>");
        return FlowLiveData.m37007b(interfaceC6785c, C1473p0.m36987a(this).mo7716y(), 0L, 2, null);
    }

    /* renamed from: u */
    public final void m105u() {
        UiEventsLiveData.m19517m(UiEventsLiveData.f18671a, 0, null, 3, null);
    }

    /* renamed from: v */
    public final void m104v(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        C2153n c2153n = C2153n.f6190a;
        c2153n.m34581d(interfaceC2154o);
        c2153n.m34582c(interfaceC2154o);
    }

    /* renamed from: x */
    public final LiveData m102x() {
        return this.f34998l;
    }

    /* renamed from: y */
    protected final C7405s1 m101y() {
        C7405s1 c7405s1 = this.f34995i;
        if (c7405s1 != null) {
            return c7405s1;
        }
        Intrinsics.throwUninitPropException("userManagerBaseViewModel");
        return null;
    }

    /* renamed from: z */
    public final boolean m100z() {
        return m101y().m18498l();
    }
}
