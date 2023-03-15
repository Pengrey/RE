package p299pj;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;

/* renamed from: pj.g */
/* loaded from: classes2.dex */
public abstract class WalkThroughViewModel extends BaseViewModel {

    /* renamed from: m */
    private final C1436e0 f22263m;

    /* renamed from: n */
    private final C1436e0 f22264n;

    /* renamed from: o */
    private final LiveData f22265o;

    /* renamed from: p */
    private final LiveData f22266p;

    /* renamed from: q */
    private final InterfaceC6108l f22267q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WalkThroughViewModel.kt */
    /* renamed from: pj.g$a */
    /* loaded from: classes2.dex */
    public static final class C8637a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C8637a f22268w = new C8637a();

        C8637a() {
            super(1);
        }

        /* renamed from: a */
        public final void m14938a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m14938a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkThroughViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C1436e0 c1436e0 = new C1436e0(Boolean.TRUE);
        this.f22263m = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_begin);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f22264n = c1436e02;
        this.f22265o = c1436e0;
        this.f22266p = c1436e02;
        this.f22267q = BaseViewModel.m113I(this, 0L, C8637a.f22268w, 1, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m14949L(WalkThroughViewModel walkThroughViewModel, View view) {
        m14946O(walkThroughViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m14948M(WalkThroughViewModel walkThroughViewModel, View view) {
        m14939V(walkThroughViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m14946O(WalkThroughViewModel walkThroughViewModel, View view) {
        Intrinsics.isThisObjectNull(walkThroughViewModel, "this$0");
        walkThroughViewModel.m14944Q().mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m14939V(WalkThroughViewModel walkThroughViewModel, View view) {
        Intrinsics.isThisObjectNull(walkThroughViewModel, "this$0");
        walkThroughViewModel.m14944Q().mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    public final View.OnClickListener m14947N() {
        return new View.OnClickListener() { // from class: pj.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalkThroughViewModel.m14946O(WalkThroughViewModel.this, view);
            }
        };
    }

    /* renamed from: P */
    public final LiveData m14945P() {
        return this.f22266p;
    }

    /* renamed from: Q */
    protected InterfaceC6108l m14944Q() {
        return this.f22267q;
    }

    /* renamed from: R */
    public final LiveData m14943R() {
        return this.f22265o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: S */
    public final C1436e0 m14942S() {
        return this.f22264n;
    }

    /* renamed from: T */
    public final void m14941T(boolean z) {
        this.f22263m.mo166p(Boolean.valueOf(z));
    }

    /* renamed from: U */
    public final View.OnClickListener m14940U() {
        return new View.OnClickListener() { // from class: pj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalkThroughViewModel.m14939V(WalkThroughViewModel.this, view);
            }
        };
    }
}
