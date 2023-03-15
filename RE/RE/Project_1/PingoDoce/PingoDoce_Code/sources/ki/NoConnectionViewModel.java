package ki;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;

/* renamed from: ki.b */
/* loaded from: classes2.dex */
public abstract class NoConnectionViewModel extends BaseViewModel {

    /* renamed from: m */
    private final C1436e0 f17966m;

    /* renamed from: n */
    private final C1436e0 f17967n;

    /* renamed from: o */
    private final InterfaceC6108l f17968o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NoConnectionViewModel.kt */
    /* renamed from: ki.b$a */
    /* loaded from: classes2.dex */
    public static final class C6667a extends AbstractC6438m implements InterfaceC6108l {
        C6667a() {
            super(1);
        }

        /* renamed from: a */
        public final void m20347a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            NoConnectionViewModel.this.m20350O(false);
            NoConnectionViewModel.this.m20351N();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20347a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoConnectionViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C1436e0 m37003d = c1459l0.m37003d("_shouldNoConectionBeVisibile", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(…ectionBeVisibile\", false)");
        this.f17966m = m37003d;
        this.f17967n = m37003d;
        this.f17968o = BaseViewModel.m113I(this, 0L, new C6667a(), 1, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m20353L(NoConnectionViewModel noConnectionViewModel, View view) {
        m20348Q(noConnectionViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m20348Q(NoConnectionViewModel noConnectionViewModel, View view) {
        Intrinsics.isThisObjectNull(noConnectionViewModel, "this$0");
        noConnectionViewModel.f17968o.mo9587d(C13195u.f34156a);
    }

    /* renamed from: M */
    public final C1436e0 m20352M() {
        return this.f17967n;
    }

    /* renamed from: N */
    protected abstract void m20351N();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public final void m20350O(boolean z) {
        this.f17966m.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: P */
    public final View.OnClickListener m20349P() {
        return new View.OnClickListener() { // from class: ki.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoConnectionViewModel.m20348Q(NoConnectionViewModel.this, view);
            }
        };
    }
}
