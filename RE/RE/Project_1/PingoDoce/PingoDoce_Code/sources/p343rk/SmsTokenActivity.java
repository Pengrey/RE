package p343rk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.lifecycle.InterfaceC1440f0;
import ci.FlowActivity;
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2378g;
import com.google.android.gms.common.api.Status;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.crashlytics.C4181a;
import java.util.Objects;
import java.util.function.Consumer;
import p050d.C4519c;
import p181jd.Intrinsics;
import p330r6.C9816a;
import p343rk.SmsTokenViewModel;
import p378u5.C10841b;
import p426wg.AbstractC11944p3;
import pe.C8617d;
import pt.pingodoce.app.data.local.flows.PhoneFlowData;
import sd.C10156i;
import sd.InterfaceC10152g;

/* renamed from: rk.e */
/* loaded from: classes2.dex */
public abstract class SmsTokenActivity<ViewModel extends SmsTokenViewModel<F>, F extends PhoneFlowData> extends FlowActivity {

    /* renamed from: g0 */
    private final AbstractC0304b f25978g0;

    /* renamed from: h0 */
    private final C9924a f25979h0;

    /* compiled from: SmsTokenActivity.kt */
    /* renamed from: rk.e$a */
    /* loaded from: classes2.dex */
    public static final class C9924a extends BroadcastReceiver {
        C9924a() {
        }

        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            Intrinsics.isThisObjectNull(context, "context");
            Intrinsics.isThisObjectNull(intent, "intent");
            if (!Intrinsics.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction()) || (extras = intent.getExtras()) == null) {
                return;
            }
            SmsTokenActivity smsTokenActivity = SmsTokenActivity.this;
            Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            if (((Status) obj).m33508t() != 0) {
                return;
            }
            try {
                SmsTokenActivity.m9691v1(smsTokenActivity).m41324a((Intent) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"));
            } catch (Exception e) {
                C4181a.m28418a().m28415d(e);
            }
        }
    }

    public SmsTokenActivity() {
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: rk.b
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                SmsTokenActivity.m9690w1(SmsTokenActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…        }\n        }\n    }");
        this.f25978g0 = m41364M;
        this.f25979h0 = new C9924a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final boolean m9700A1(AbstractC11944p3 abstractC11944p3, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(abstractC11944p3, "$binding");
        if (i == 6) {
            abstractC11944p3.f31197C.performClick();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m9699B1(AbstractC11944p3 abstractC11944p3, Animation animation, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11944p3, "$binding");
        Intrinsics.isThisObjectNull(animation, "$animShake");
        Intrinsics.checkIfNull(bool, "enable");
        if (bool.booleanValue()) {
            abstractC11944p3.f31200x.startAnimation(animation);
        }
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m9696r1(SmsTokenActivity smsTokenActivity, InterfaceC10152g interfaceC10152g) {
        m9688x1(smsTokenActivity, interfaceC10152g);
    }

    /* renamed from: s1 */
    public static /* synthetic */ boolean m9695s1(AbstractC11944p3 abstractC11944p3, TextView textView, int i, KeyEvent keyEvent) {
        return m9700A1(abstractC11944p3, textView, i, keyEvent);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m9694t1(AbstractC11944p3 abstractC11944p3, Animation animation, Boolean bool) {
        m9699B1(abstractC11944p3, animation, bool);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m9693u1(SmsTokenActivity smsTokenActivity, ActivityResult activityResult) {
        m9690w1(smsTokenActivity, activityResult);
    }

    /* renamed from: v1 */
    public static final /* synthetic */ AbstractC0304b m9691v1(SmsTokenActivity smsTokenActivity) {
        return smsTokenActivity.f25978g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m9690w1(SmsTokenActivity smsTokenActivity, ActivityResult activityResult) {
        Intent m41352a;
        String stringExtra;
        Intrinsics.isThisObjectNull(smsTokenActivity, "this$0");
        if (activityResult.m41351b() != -1 || (m41352a = activityResult.m41352a()) == null || (stringExtra = m41352a.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")) == null) {
            return;
        }
        C10156i.m9022c(new C10156i("\\d{4}"), stringExtra, 0, 2, null).iterator().forEachRemaining(new Consumer() { // from class: rk.d
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SmsTokenActivity.m9688x1(SmsTokenActivity.this, (InterfaceC10152g) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m9688x1(SmsTokenActivity smsTokenActivity, InterfaceC10152g interfaceC10152g) {
        Intrinsics.isThisObjectNull(smsTokenActivity, "this$0");
        Intrinsics.isThisObjectNull(interfaceC10152g, "match");
        ((AbstractC11944p3) smsTokenActivity.m22738w0()).f31200x.setText(interfaceC10152g.getValue());
        ((AbstractC11944p3) smsTokenActivity.m22738w0()).f31197C.performClick();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        registerReceiver(this.f25979h0, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"));
        C9816a.m9920a(this).mo9919u(null);
    }

    protected void onDestroy() {
        unregisterReceiver(this.f25979h0);
        super.onDestroy();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_sms_token;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y1 */
    public C8617d mo42216v0() {
        return new C8617d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z1 */
    public void m9697n1(final AbstractC11944p3 abstractC11944p3, SmsTokenViewModel smsTokenViewModel) {
        Intrinsics.isThisObjectNull(abstractC11944p3, "binding");
        Intrinsics.isThisObjectNull(smsTokenViewModel, "viewModel");
        super.m34589n1(abstractC11944p3, smsTokenViewModel);
        PinEntryEditText pinEntryEditText = abstractC11944p3.f31200x;
        Intrinsics.checkIfNull(pinEntryEditText, "binding.codePinEntryEditText");
        m148Y0(pinEntryEditText);
        abstractC11944p3.f31200x.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: rk.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean m9700A1;
                m9700A1 = SmsTokenActivity.m9700A1(AbstractC11944p3.this, textView, i, keyEvent);
                return m9700A1;
            }
        });
        final Animation loadAnimation = AnimationUtils.loadAnimation(C10841b.m6898a(this).m6899a(), C2336R.anim.shake_animation);
        Intrinsics.checkIfNull(loadAnimation, "AnimationUtils.loadAnimation(ctx, id)");
        smsTokenViewModel.m9677I0().mo171i(this, new InterfaceC1440f0() { // from class: rk.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                SmsTokenActivity.m9699B1(AbstractC11944p3.this, loadAnimation, (Boolean) obj);
            }
        });
        MaterialButton materialButton = abstractC11944p3.f31197C;
        Intrinsics.checkIfNull(materialButton, "binding.submitMaterialButton");
        C2378g.m33744c(this, materialButton);
    }
}
