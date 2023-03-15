package pl;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6097a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.AnalyticsManager;
import mg.C7347m1;
import p165ij.SnackBarLiveData;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p470yf.SnackBarAction;
import p489zc._Collections;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: pl.j */
/* loaded from: classes2.dex */
public abstract class TakeAwayCheckoutViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final AnalyticsManager f22338C;

    /* renamed from: D */
    private final C7347m1 f22339D;

    /* renamed from: E */
    private final Void f22340E;

    /* renamed from: F */
    private C2381h f22341F;

    /* renamed from: G */
    private final C1436e0 f22342G;

    /* renamed from: H */
    private final C1436e0 f22343H;

    /* renamed from: I */
    private final C1436e0 f22344I;

    /* renamed from: J */
    private final C1436e0 f22345J;

    /* renamed from: K */
    private final C1436e0 f22346K;

    /* renamed from: L */
    private final C1436e0 f22347L;

    /* renamed from: M */
    private final LiveData f22348M;

    /* renamed from: N */
    private final LiveData f22349N;

    /* renamed from: O */
    private final LiveData f22350O;

    /* renamed from: P */
    private final LiveData f22351P;

    /* renamed from: Q */
    private final LiveData f22352Q;

    /* renamed from: R */
    private final LiveData f22353R;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutViewModel.kt */
    /* renamed from: pl.j$a */
    /* loaded from: classes2.dex */
    public static final class C8664a extends AbstractC6438m implements InterfaceC6097a {
        C8664a() {
            super(0);
        }

        /* renamed from: a */
        public final void m14839a() {
            TakeAwayCheckoutViewModel.m14845u0(TakeAwayCheckoutViewModel.this).m18694A();
            TakeAwayCheckoutViewModel.this.m14852H0();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m14839a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayCheckoutViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.checkout.TakeAwayCheckoutViewModel", m20196f = "TakeAwayCheckoutViewModel.kt", m20195l = {62}, m20194m = "onSubmit$suspendImpl")
    /* renamed from: pl.j$b */
    /* loaded from: classes2.dex */
    public static final class C8665b extends AbstractC6757d {

        /* renamed from: w */
        Object f22355w;

        /* renamed from: x */
        /* synthetic */ Object f22356x;

        /* renamed from: z */
        int f22358z;

        C8665b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f22356x = obj;
            this.f22358z |= Integer.MIN_VALUE;
            return TakeAwayCheckoutViewModel.m14853G0(TakeAwayCheckoutViewModel.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayCheckoutViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f22338C = analyticsManager;
        this.f22339D = c7347m1;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_take_away_order));
        this.f22341F = c2381h;
        C1436e0 c1436e0 = new C1436e0(new ArrayList());
        this.f22342G = c1436e0;
        C1436e0 m37003d = c1459l0.m37003d("_itemsCount", "0");
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData(\"_itemsCount\", \"0\")");
        this.f22343H = m37003d;
        C1436e0 m37003d2 = c1459l0.m37003d("_status", new TakeAwayCheckout(null, null, null, null, 0, null, null, null, null, null, null, false, 4095, null));
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData(…tus\", TakeAwayCheckout())");
        this.f22344I = m37003d2;
        C1436e0 c1436e02 = new C1436e0();
        this.f22345J = c1436e02;
        C1436e0 c1436e03 = new C1436e0(Boolean.valueOf(c7347m1.m18685g() > 0));
        this.f22346K = c1436e03;
        C1436e0 c1436e04 = new C1436e0(10);
        this.f22347L = c1436e04;
        this.f22348M = c1436e04;
        this.f22349N = c1436e0;
        this.f22350O = m37003d;
        this.f22351P = m37003d2;
        this.f22352Q = c1436e02;
        this.f22353R = c1436e03;
        m14852H0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object m14853G0(pl.TakeAwayCheckoutViewModel r24, bd.InterfaceC1886d r25) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.TakeAwayCheckoutViewModel.m14853G0(pl.j, bd.d):java.lang.Object");
    }

    /* renamed from: u0 */
    public static final /* synthetic */ C7347m1 m14845u0(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel) {
        return takeAwayCheckoutViewModel.f22339D;
    }

    /* renamed from: y0 */
    public static /* synthetic */ void m14841y0(TakeAwayCheckoutViewModel takeAwayCheckoutViewModel, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteItem");
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        takeAwayCheckoutViewModel.m14842x0(i, z);
    }

    /* renamed from: A0 */
    protected Void m14859A0() {
        return this.f22340E;
    }

    /* renamed from: B0 */
    public final LiveData m14858B0() {
        return this.f22349N;
    }

    /* renamed from: C0 */
    public final LiveData m14857C0() {
        return this.f22350O;
    }

    /* renamed from: D0 */
    public final LiveData m14856D0() {
        return this.f22352Q;
    }

    /* renamed from: E0 */
    public final LiveData m14855E0() {
        return this.f22348M;
    }

    /* renamed from: F0 */
    public final LiveData m14854F0() {
        return this.f22351P;
    }

    /* renamed from: H0 */
    public final void m14852H0() {
        List m453p0;
        if (m34577T()) {
            C1436e0 c1436e0 = this.f22342G;
            m453p0 = _Collections.m453p0(this.f22339D.m18684h());
            c1436e0.mo166p(m453p0);
            this.f22343H.mo166p(String.valueOf(this.f22339D.m18685g()));
            C1436e0 c1436e02 = this.f22344I;
            TakeAwayCheckout m14690a = ((TakeAwayFlowData) m34578S()).m14690a();
            C6429c0 c6429c0 = C6429c0.f17515a;
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(this.f22339D.m18683i())}, 1));
            Intrinsics.checkIfNull(format, "format(format, *args)");
            c1436e02.mo166p(TakeAwayCheckout.m10868b(m14690a, null, format, null, null, 0, null, null, null, null, null, null, false, 4093, null));
            this.f22346K.mo166p(Boolean.valueOf(this.f22339D.m18685g() > 0));
        }
    }

    /* renamed from: I0 */
    public final void m14851I0(String str) {
        Intrinsics.isThisObjectNull(str, "email");
        m34576U(new TakeAwayFlowData(((TakeAwayFlowData) m34578S()).m14689b(), TakeAwayCheckout.m10868b(((TakeAwayFlowData) m34578S()).m14690a(), null, null, null, null, 0, null, null, null, null, str, null, false, 3583, null)));
        m14852H0();
    }

    /* renamed from: J0 */
    public final void m14850J0(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "item");
        this.f22339D.m18693B(takeAwayProduct);
        m14852H0();
    }

    /* renamed from: K0 */
    public final void m14849K0(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        int m18675q = this.f22339D.m18675q(takeAwayProduct);
        if (m18675q == 0) {
            m18675q = takeAwayProduct.m14235w();
        }
        boolean z = takeAwayProduct.m14234y() < takeAwayProduct.m14235w();
        this.f22347L.mo166p(Integer.valueOf(m18675q));
        if ((takeAwayProduct.m14234y() <= 10 && this.f22339D.m18685g() < 30) || z) {
            takeAwayProduct.m14253N(takeAwayProduct.m14234y());
            m14850J0(takeAwayProduct);
        }
        takeAwayProduct.m14254M(m18675q);
        this.f22339D.m18692C(takeAwayProduct, m18675q, takeAwayProduct.m14235w());
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m14848f0() {
        return (Drawable) m14859A0();
    }

    /* renamed from: g0 */
    protected C2381h m14847g0() {
        return this.f22341F;
    }

    /* renamed from: n0 */
    protected Object m14846n0(InterfaceC1886d interfaceC1886d) {
        return m14853G0(this, interfaceC1886d);
    }

    /* renamed from: v0 */
    public final void m14844v0(TakeAwayProduct takeAwayProduct) {
        Intrinsics.isThisObjectNull(takeAwayProduct, "product");
        int m18675q = this.f22339D.m18675q(takeAwayProduct);
        this.f22339D.m18691a(TakeAwayProduct.m14249c(takeAwayProduct, 0, 0, null, null, null, null, null, 0.0f, null, null, false, false, false, 0, null, takeAwayProduct.m14235w(), 0, 0, 229375, null));
        this.f22347L.mo166p(Integer.valueOf(m18675q));
        this.f22339D.m18692C(takeAwayProduct, m18675q, takeAwayProduct.m14235w());
    }

    /* renamed from: w0 */
    public final void m14843w0() {
        this.f22339D.m18689c();
        m14852H0();
    }

    /* renamed from: x0 */
    public final void m14842x0(int i, boolean z) {
        TakeAwayProduct takeAwayProduct;
        List list = (List) this.f22349N.mo172f();
        if (list == null || (takeAwayProduct = (TakeAwayProduct) list.get(i)) == null) {
            return;
        }
        C7347m1.m18667y(this.f22339D, takeAwayProduct, false, 2, null);
        m14852H0();
        if (z) {
            SnackBarLiveData snackBarLiveData = SnackBarLiveData.f16957a;
            String string = m20390g().m6899a().getString(C2336R.string.lbl_list_item_removed);
            Intrinsics.checkIfNull(string, "ctx.getString(id)");
            String string2 = m20390g().m6899a().getString(C2336R.string.lbl_list_item_undo_remove);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            SnackBarLiveData.m21968c(snackBarLiveData, string, new SnackBarAction(string2, new C8664a()), 0, 0, 12, null);
        }
    }

    /* renamed from: z0 */
    public final LiveData m14840z0() {
        return this.f22353R;
    }
}
