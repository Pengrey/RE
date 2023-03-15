package fi;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import fm.C5580d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ki.NoConnectionViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p494zh.BaseViewModel;
import p494zh.C13899s0;
import pt.pingodoce.app.data.remote.models.response.Benefit;
import td.InterfaceC10524i0;

/* renamed from: fi.f */
/* loaded from: classes2.dex */
public final class BenefitsDetailsViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final C5580d f15676p;

    /* renamed from: q */
    private final C1436e0 f15677q;

    /* renamed from: r */
    private final LiveData f15678r;

    /* renamed from: s */
    private final InterfaceC6108l f15679s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsDetailsViewModel.kt */
    /* renamed from: fi.f$a */
    /* loaded from: classes2.dex */
    public static final class C5527a extends AbstractC6438m implements InterfaceC6108l {
        C5527a() {
            super(1);
        }

        /* renamed from: a */
        public final void m23781a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(BenefitsDetailsViewModel.this, C13899s0.f35020a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m23781a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BenefitsDetailsViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.benefits.details.BenefitsDetailsViewModel$setBenefit$1", m20196f = "BenefitsDetailsViewModel.kt", m20195l = {44}, m20194m = "invokeSuspend")
    /* renamed from: fi.f$b */
    /* loaded from: classes2.dex */
    public static final class C5528b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15681x;

        /* renamed from: y */
        final /* synthetic */ Benefit f15682y;

        /* renamed from: z */
        final /* synthetic */ BenefitsDetailsViewModel f15683z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5528b(Benefit benefit, BenefitsDetailsViewModel benefitsDetailsViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f15682y = benefit;
            this.f15683z = benefitsDetailsViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5528b(this.f15682y, this.f15683z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5528b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f15681x;
            if (i == 0) {
                C13186n.m1453b(obj);
                if (this.f15682y == null) {
                    return C13195u.f34156a;
                }
                C5580d m23788S = BenefitsDetailsViewModel.m23788S(this.f15683z);
                String m13934f = this.f15682y.m13934f();
                this.f15681x = 1;
                obj = C5580d.m23709b(m23788S, m13934f, 380, 51, 0, 0, this, 24, null);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            C1436e0 m23787T = BenefitsDetailsViewModel.m23787T(this.f15683z);
            if (!this.f15683z.m23785V(this.f15682y.m13934f())) {
                bitmap = null;
            }
            m23787T.mo169m(bitmap);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsDetailsViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C5580d c5580d) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c5580d, "zxingHelper");
        this.f15676p = c5580d;
        C1436e0 c1436e0 = new C1436e0();
        this.f15677q = c1436e0;
        this.f15678r = c1436e0;
        this.f15679s = BaseViewModel.m113I(this, 0L, new C5527a(), 1, null);
    }

    /* renamed from: R */
    public static /* synthetic */ void m23789R(BenefitsDetailsViewModel benefitsDetailsViewModel, View view) {
        m23782Y(benefitsDetailsViewModel, view);
    }

    /* renamed from: S */
    public static final /* synthetic */ C5580d m23788S(BenefitsDetailsViewModel benefitsDetailsViewModel) {
        return benefitsDetailsViewModel.f15676p;
    }

    /* renamed from: T */
    public static final /* synthetic */ C1436e0 m23787T(BenefitsDetailsViewModel benefitsDetailsViewModel) {
        return benefitsDetailsViewModel.f15677q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m23782Y(BenefitsDetailsViewModel benefitsDetailsViewModel, View view) {
        Intrinsics.isThisObjectNull(benefitsDetailsViewModel, "this$0");
        benefitsDetailsViewModel.f15679s.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    protected void m23790N() {
    }

    /* renamed from: U */
    public final LiveData m23786U() {
        return this.f15678r;
    }

    /* renamed from: V */
    public final boolean m23785V(String str) {
        Intrinsics.isThisObjectNull(str, "ean");
        return (str.length() > 0) && TextUtils.getTrimmedLength(str) > 1;
    }

    /* renamed from: W */
    public final void m23784W(Benefit benefit) {
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C5528b(benefit, this, null), 3, null);
    }

    /* renamed from: X */
    public final View.OnClickListener m23783X() {
        return new View.OnClickListener() { // from class: fi.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BenefitsDetailsViewModel.m23782Y(BenefitsDetailsViewModel.this, view);
            }
        };
    }
}
