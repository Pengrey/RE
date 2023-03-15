package vi;

import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import bi.C1924a;
import cd.C2116d;
import ci.C2143g;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2378g;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p047ce.FluidContentResizer;
import p050d.C4519c;
import p180jc.View$OnFocusChangeListenerC6420a;
import p181jd.Intrinsics;
import p426wg.AbstractC11981r0;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.FlowData;
import sb.C10143a;
import sb.C10144b;
import td.InterfaceC10524i0;
import vi.LoyaltyCardInsertViewModel;

/* renamed from: vi.c */
/* loaded from: classes2.dex */
public abstract class LoyaltyCardInsertActivity<ViewModel extends LoyaltyCardInsertViewModel<F>, F extends FlowData> extends FlowActivity {

    /* renamed from: g0 */
    private final AbstractC0304b f29163g0;

    /* compiled from: LoyaltyCardInsertActivity.kt */
    /* renamed from: vi.c$a */
    /* loaded from: classes2.dex */
    public static final class C11365a {
        private C11365a() {
        }

        public /* synthetic */ C11365a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardInsertActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.common.loyaltycard.insert.LoyaltyCardInsertActivity$initViews$1$1", m20196f = "LoyaltyCardInsertActivity.kt", m20195l = {49}, m20194m = "invokeSuspend")
    /* renamed from: vi.c$b */
    /* loaded from: classes2.dex */
    public static final class C11366b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29164x;

        /* renamed from: y */
        final /* synthetic */ LoyaltyCardInsertViewModel f29165y;

        /* renamed from: z */
        final /* synthetic */ LoyaltyCardInsertActivity f29166z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11366b(LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, LoyaltyCardInsertActivity loyaltyCardInsertActivity, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29165y = loyaltyCardInsertViewModel;
            this.f29166z = loyaltyCardInsertActivity;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C11366b(this.f29165y, this.f29166z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11366b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29164x;
            if (i == 0) {
                C13186n.m1453b(obj);
                this.f29165y.m5319B0();
                LoyaltyCardInsertActivity loyaltyCardInsertActivity = this.f29166z;
                AbstractC0304b m5329t1 = LoyaltyCardInsertActivity.m5329t1(loyaltyCardInsertActivity);
                this.f29164x = 1;
                if (C1924a.m35138a(loyaltyCardInsertActivity, m5329t1, this) == m34636d) {
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

    static {
        new C11365a(null);
    }

    public LoyaltyCardInsertActivity() {
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: vi.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                LoyaltyCardInsertActivity.m5328u1(LoyaltyCardInsertActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…)\n            }\n        }");
        this.f29163g0 = m41364M;
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m5331r1(LoyaltyCardInsertActivity loyaltyCardInsertActivity, ActivityResult activityResult) {
        m5328u1(loyaltyCardInsertActivity, activityResult);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m5330s1(LoyaltyCardInsertActivity loyaltyCardInsertActivity, LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, View view) {
        m5322y1(loyaltyCardInsertActivity, loyaltyCardInsertViewModel, view);
    }

    /* renamed from: t1 */
    public static final /* synthetic */ AbstractC0304b m5329t1(LoyaltyCardInsertActivity loyaltyCardInsertActivity) {
        return loyaltyCardInsertActivity.f29163g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m5328u1(LoyaltyCardInsertActivity loyaltyCardInsertActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(loyaltyCardInsertActivity, "this$0");
        C10144b m9065g = C10143a.m9065g(activityResult.m41351b(), activityResult.m41352a());
        if (m9065g != null) {
            TextInputEditText textInputEditText = ((AbstractC11981r0) loyaltyCardInsertActivity.m22738w0()).f31348x;
            String m9059a = m9065g.m9059a();
            if (m9059a == null) {
                m9059a = BuildConfig.VERSION_NAME;
            } else {
                Intrinsics.checkIfNull(m9059a, "result.contents ?: \"\"");
            }
            textInputEditText.setText(m9059a);
            ((AbstractC11981r0) loyaltyCardInsertActivity.m22738w0()).f31348x.setSelection(((AbstractC11981r0) loyaltyCardInsertActivity.m22738w0()).f31348x.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m5322y1(LoyaltyCardInsertActivity loyaltyCardInsertActivity, LoyaltyCardInsertViewModel loyaltyCardInsertViewModel, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardInsertActivity, "this$0");
        Intrinsics.isThisObjectNull(loyaltyCardInsertViewModel, "$viewModel");
        LifecycleOwner.m36965a(loyaltyCardInsertActivity).m36984i(new C11366b(loyaltyCardInsertViewModel, loyaltyCardInsertActivity, null));
    }

    /* renamed from: k1 */
    protected List m5333k1() {
        List m194j;
        m194j = C13780s.m194j(C2143g.f6178a, C2143g.C2144a.f6179a, C2143g.C2145b.f6180a);
        return m194j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* renamed from: w1 */
    protected boolean m5325w1() {
        return false;
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_loyalty_card_insert;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x1 */
    public void m5332n1(AbstractC11981r0 abstractC11981r0, final LoyaltyCardInsertViewModel loyaltyCardInsertViewModel) {
        Intrinsics.isThisObjectNull(abstractC11981r0, "binding");
        Intrinsics.isThisObjectNull(loyaltyCardInsertViewModel, "viewModel");
        super.m34589n1(abstractC11981r0, loyaltyCardInsertViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        TextInputEditText textInputEditText = abstractC11981r0.f31348x;
        Intrinsics.checkIfNull(textInputEditText, "binding.cardEditText");
        m148Y0(textInputEditText);
        abstractC11981r0.mo3821Q(Boolean.valueOf(m5325w1()));
        TextInputEditText textInputEditText2 = abstractC11981r0.f31348x;
        Intrinsics.checkIfNull(textInputEditText2, "binding.cardEditText");
        View$OnFocusChangeListenerC6420a view$OnFocusChangeListenerC6420a = new View$OnFocusChangeListenerC6420a("[0] [000000] [000000]", textInputEditText2);
        view$OnFocusChangeListenerC6420a.m20974e(true);
        abstractC11981r0.f31348x.addTextChangedListener(view$OnFocusChangeListenerC6420a);
        abstractC11981r0.f31349y.setEndIconOnClickListener(new View.OnClickListener() { // from class: vi.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LoyaltyCardInsertActivity.m5322y1(LoyaltyCardInsertActivity.this, loyaltyCardInsertViewModel, view);
            }
        });
        MaterialButton materialButton = abstractC11981r0.f31345A;
        Intrinsics.checkIfNull(materialButton, "binding.submitMaterialButton");
        C2378g.m33744c(this, materialButton);
    }
}
