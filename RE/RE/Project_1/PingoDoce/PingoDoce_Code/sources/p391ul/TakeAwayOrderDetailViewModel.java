package p391ul;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.C1459l0;
import bd.InterfaceC1886d;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import id.InterfaceC6108l;
import java.util.List;
import ki.SubmitAnimatedViewModel;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import mg.C7347m1;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p221le.UiWidgets;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p489zc.C13780s;
import pt.pingodoce.app.data.local.flows.TakeAwayFlowData;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: ul.e */
/* loaded from: classes2.dex */
public final class TakeAwayOrderDetailViewModel extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final C7347m1 f28263C;

    /* renamed from: D */
    private final Void f28264D;

    /* renamed from: E */
    private C2381h f28265E;

    /* compiled from: TakeAwayOrderDetailViewModel.kt */
    /* renamed from: ul.e$a */
    /* loaded from: classes2.dex */
    public static final class C10970a implements UiWidgets.InterfaceC7044a {
        C10970a() {
        }

        /* renamed from: a */
        public void m6688a(boolean z) {
            if (z) {
                TakeAwayOrderDetailViewModel.m6693v0(TakeAwayOrderDetailViewModel.this).mo9587d(C13195u.f34156a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayOrderDetailViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.takeaway.orders.detail.TakeAwayOrderDetailViewModel", m20196f = "TakeAwayOrderDetailViewModel.kt", m20195l = {61}, m20194m = "onSubmit")
    /* renamed from: ul.e$b */
    /* loaded from: classes2.dex */
    public static final class C10971b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f28267w;

        /* renamed from: y */
        int f28269y;

        C10971b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28267w = obj;
            this.f28269y |= Integer.MIN_VALUE;
            return TakeAwayOrderDetailViewModel.this.m6696n0(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayOrderDetailViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, C7347m1 c7347m1) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(c7347m1, "manager");
        this.f28263C = c7347m1;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_take_away_cancel));
        this.f28265E = c2381h;
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m6694u0(TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel, View view) {
        m6691x0(takeAwayOrderDetailViewModel, view);
    }

    /* renamed from: v0 */
    public static final /* synthetic */ InterfaceC6108l m6693v0(TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel) {
        return takeAwayOrderDetailViewModel.m20325j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m6691x0(TakeAwayOrderDetailViewModel takeAwayOrderDetailViewModel, View view) {
        Intrinsics.isThisObjectNull(takeAwayOrderDetailViewModel, "this$0");
        UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
        String string = takeAwayOrderDetailViewModel.m20390g().m6899a().getString(C2336R.string.dialog_alert_title);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        String string2 = takeAwayOrderDetailViewModel.m20390g().m6899a().getString(C2336R.string.dialog_take_away_cancel);
        Intrinsics.checkIfNull(string2, "ctx.getString(id)");
        UiEventsLiveData.m19519k(uiEventsLiveData, string, string2, null, null, new C10970a(), 12, null);
    }

    /* renamed from: A0 */
    public final TakeAwayCheckout m6699A0() {
        return ((TakeAwayFlowData) m34578S()).m14690a();
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m6698f0() {
        return (Drawable) m6690y0();
    }

    /* renamed from: g0 */
    protected C2381h m6697g0() {
        return this.f28265E;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object m6696n0(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p391ul.TakeAwayOrderDetailViewModel.C10971b
            if (r0 == 0) goto L13
            r0 = r5
            ul.e$b r0 = (p391ul.TakeAwayOrderDetailViewModel.C10971b) r0
            int r1 = r0.f28269y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28269y = r1
            goto L18
        L13:
            ul.e$b r0 = new ul.e$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28267w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f28269y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L53
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            boolean r5 = r4.m34577T()
            if (r5 == 0) goto L5b
            mg.m1 r5 = r4.f28263C
            pt.pingodoce.app.data.local.flows.FlowData r2 = r4.m34578S()
            pt.pingodoce.app.data.local.flows.TakeAwayFlowData r2 = (pt.pingodoce.app.data.local.flows.TakeAwayFlowData) r2
            pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout r2 = r2.m14690a()
            java.lang.String r2 = r2.m10865e()
            r0.f28269y = r3
            java.lang.Object r5 = r5.m18690b(r2, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            le.a r5 = p221le.UiEventsLiveData.f18671a
            r0 = 0
            r1 = 3
            r2 = 0
            p221le.UiEventsLiveData.m19517m(r5, r0, r2, r1, r2)
        L5b:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p391ul.TakeAwayOrderDetailViewModel.m6696n0(bd.d):java.lang.Object");
    }

    /* renamed from: o0 */
    protected int m6695o0() {
        return 2131951648;
    }

    /* renamed from: w0 */
    public final View.OnClickListener m6692w0() {
        return new View.OnClickListener() { // from class: ul.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TakeAwayOrderDetailViewModel.m6691x0(TakeAwayOrderDetailViewModel.this, view);
            }
        };
    }

    /* renamed from: y0 */
    protected Void m6690y0() {
        return this.f28264D;
    }

    /* renamed from: z0 */
    public final List m6689z0() {
        List m197g;
        List m197g2;
        List m14276k;
        if (m34577T()) {
            TakeAwayOrder m18679m = this.f28263C.m18679m(((TakeAwayFlowData) m34578S()).m14690a().m10865e());
            if (m18679m == null || (m14276k = m18679m.m14276k()) == null) {
                m197g2 = C13780s.m197g();
                return m197g2;
            }
            return m14276k;
        }
        m197g = C13780s.m197g();
        return m197g;
    }
}
