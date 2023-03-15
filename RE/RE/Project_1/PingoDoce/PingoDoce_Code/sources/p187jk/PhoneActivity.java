package p187jk;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0303a;
import androidx.core.content.C0928a;
import androidx.lifecycle.InterfaceC1440f0;
import ci.FlowActivity;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2378g;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.C4181a;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p047ce.FluidContentResizer;
import p050d.C4521d;
import p180jc.View$OnFocusChangeListenerC6420a;
import p181jd.Intrinsics;
import p187jk.PhoneViewModel;
import p308q6.C9667a;
import p378u5.C10841b;
import p378u5.ResourcesProvider;
import p426wg.AbstractC11828j2;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import sd.StringsJVM;

/* renamed from: jk.d */
/* loaded from: classes2.dex */
public abstract class PhoneActivity<ViewModel extends PhoneViewModel<F>, F extends PhoneFlowData> extends FlowActivity {

    /* renamed from: g0 */
    private final AbstractC0304b f17659g0;

    /* compiled from: PhoneActivity.kt */
    /* renamed from: jk.d$a */
    /* loaded from: classes2.dex */
    public static final class C6519a {
        private C6519a() {
        }

        public /* synthetic */ C6519a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PhoneActivity.kt */
    /* renamed from: jk.d$b */
    /* loaded from: classes2.dex */
    public static final class C6520b implements TextWatcher {

        /* renamed from: w */
        final /* synthetic */ AbstractC11828j2 f17660w;

        /* renamed from: x */
        final /* synthetic */ PhoneActivity f17661x;

        C6520b(AbstractC11828j2 abstractC11828j2, PhoneActivity phoneActivity) {
            this.f17660w = abstractC11828j2;
            this.f17661x = phoneActivity;
        }

        public void afterTextChanged(Editable editable) {
            if (editable != null) {
                AbstractC11828j2 abstractC11828j2 = this.f17660w;
                PhoneActivity phoneActivity = this.f17661x;
                abstractC11828j2.f30627C.setTextSize(0, C10841b.m6898a(phoneActivity).m6899a().getResources().getDimension(editable.length() == 0 ? C2336R.dimen.phone_input_hint : C2336R.dimen.phone_input));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    static {
        new C6519a(null);
    }

    public PhoneActivity() {
        AbstractC0304b<I> m41364M = m41364M(new C4521d(), new InterfaceC0303a() { // from class: jk.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                PhoneActivity.m20737w1(PhoneActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…        }\n        }\n    }");
        this.f17659g0 = m41364M;
    }

    /* renamed from: r1 */
    public static /* synthetic */ boolean m20742r1(AbstractC11828j2 abstractC11828j2, TextView textView, int i, KeyEvent keyEvent) {
        return m20734y1(abstractC11828j2, textView, i, keyEvent);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m20741s1(PhoneActivity phoneActivity, ActivityResult activityResult) {
        m20737w1(phoneActivity, activityResult);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m20740t1(AbstractC11828j2 abstractC11828j2, PhoneActivity phoneActivity, Animation animation, Boolean bool) {
        m20738v1(abstractC11828j2, phoneActivity, animation, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m20738v1(AbstractC11828j2 abstractC11828j2, PhoneActivity phoneActivity, Animation animation, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11828j2, "$binding");
        Intrinsics.isThisObjectNull(phoneActivity, "this$0");
        Intrinsics.isThisObjectNull(animation, "$animShake");
        Intrinsics.checkIfNull(bool, "enabled");
        if (bool.booleanValue()) {
            EditText editText = abstractC11828j2.f30627C;
            ResourcesProvider m6898a = C10841b.m6898a(phoneActivity);
            TypedValue typedValue = new TypedValue();
            new ContextThemeWrapper(m6898a.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(C2336R.attr.colorError, typedValue, true);
            editText.setTextColor(C0928a.m39113d(m6898a.m6899a(), typedValue.resourceId));
            abstractC11828j2.f30627C.startAnimation(animation);
            return;
        }
        EditText editText2 = abstractC11828j2.f30627C;
        ResourcesProvider m6898a2 = C10841b.m6898a(phoneActivity);
        TypedValue typedValue2 = new TypedValue();
        new ContextThemeWrapper(m6898a2.m6899a(), (int) C2336R.style.App).getTheme().resolveAttribute(16842806, typedValue2, true);
        editText2.setTextColor(C0928a.m39113d(m6898a2.m6899a(), typedValue2.resourceId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m20737w1(PhoneActivity phoneActivity, ActivityResult activityResult) {
        Intent m41352a;
        Credential credential;
        boolean m8948C;
        String m8935y;
        Intrinsics.isThisObjectNull(phoneActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (credential = (Credential) m41352a.getParcelableExtra("com.google.android.gms.credentials.Credential")) == null) {
            return;
        }
        String m33647y = credential.m33647y();
        Intrinsics.checkIfNull(m33647y, "it.id");
        m8948C = StringsJVM.m8948C(m33647y, "+351", false, 2, null);
        if (m8948C) {
            EditText editText = ((AbstractC11828j2) phoneActivity.m22738w0()).f30627C;
            m8935y = StringsJVM.m8935y(m33647y, "+351", BuildConfig.VERSION_NAME, false, 4, null);
            editText.setText(m8935y);
        }
    }

    /* renamed from: x1 */
    private final void m20735x1(final AbstractC11828j2 abstractC11828j2) {
        EditText editText = abstractC11828j2.f30627C;
        Intrinsics.checkIfNull(editText, "binding.etPhoneInput");
        View$OnFocusChangeListenerC6420a view$OnFocusChangeListenerC6420a = new View$OnFocusChangeListenerC6420a("[000] [000] [000]", editText);
        view$OnFocusChangeListenerC6420a.m20974e(true);
        abstractC11828j2.f30627C.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jk.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m20734y1;
                m20734y1 = PhoneActivity.m20734y1(AbstractC11828j2.this, textView, i, keyEvent);
                return m20734y1;
            }
        });
        abstractC11828j2.f30627C.addTextChangedListener(view$OnFocusChangeListenerC6420a);
        abstractC11828j2.f30627C.addTextChangedListener(new C6520b(abstractC11828j2, this));
        abstractC11828j2.f30627C.setOnFocusChangeListener(view$OnFocusChangeListenerC6420a);
        MaterialButton materialButton = abstractC11828j2.f30628D;
        Intrinsics.checkIfNull(materialButton, "binding.submitMaterialButton");
        C2378g.m33744c(this, materialButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final boolean m20734y1(AbstractC11828j2 abstractC11828j2, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(abstractC11828j2, "$binding");
        if (i == 6) {
            abstractC11828j2.f30628D.performClick();
            return true;
        }
        return false;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m20733z1() && m149X0()) {
            Object systemService = getSystemService("phone");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            if (((TelephonyManager) systemService).getSimState() == 5) {
                try {
                    this.f17659g0.m41324a(new IntentSenderRequest.C0302b(C9667a.m10230a(this).m10229u(new HintRequest.C2410a().m33635b(true).m33636a())).m41327a());
                } catch (Exception e) {
                    C4181a.m28418a().m28415d(e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u1 */
    public void m20743n1(final AbstractC11828j2 abstractC11828j2, PhoneViewModel phoneViewModel) {
        Intrinsics.isThisObjectNull(abstractC11828j2, "binding");
        Intrinsics.isThisObjectNull(phoneViewModel, "viewModel");
        super.m34589n1(abstractC11828j2, phoneViewModel);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        final Animation loadAnimation = AnimationUtils.loadAnimation(C10841b.m6898a(this).m6899a(), C2336R.anim.shake_animation);
        Intrinsics.checkIfNull(loadAnimation, "AnimationUtils.loadAnimation(ctx, id)");
        phoneViewModel.m20722K0().mo171i(this, new InterfaceC1440f0() { // from class: jk.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PhoneActivity.m20738v1(AbstractC11828j2.this, this, loadAnimation, (Boolean) obj);
            }
        });
        m20735x1(abstractC11828j2);
        EditText editText = abstractC11828j2.f30627C;
        Intrinsics.checkIfNull(editText, "binding.etPhoneInput");
        m148Y0(editText);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_phone;
    }

    /* renamed from: z1 */
    protected boolean m20733z1() {
        return true;
    }
}
