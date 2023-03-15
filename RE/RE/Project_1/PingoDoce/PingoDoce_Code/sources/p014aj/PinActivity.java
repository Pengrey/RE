package p014aj;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.activity.result.AbstractC0304b;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.InterfaceC0303a;
import androidx.biometric.BiometricPrompt;
import androidx.lifecycle.InterfaceC1440f0;
import ci.FlowActivity;
import com.alimuzaffar.lib.pin.PinEntryEditText;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.bottomsheet.DialogC3502a;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executors;
import ne.EventObserver;
import p014aj.AbstractC0188n;
import p014aj.PinActivity;
import p047ce.FluidContentResizer;
import p050d.C4519c;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p221le.UiEventsLiveData;
import p378u5.C10841b;
import p426wg.AbstractC11865l2;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: aj.k */
/* loaded from: classes2.dex */
public abstract class PinActivity<ViewModel extends AbstractC0188n<F>, F extends FlowData> extends FlowActivity {

    /* renamed from: g0 */
    private final AbstractC0304b f381g0;

    /* renamed from: h0 */
    private final InterfaceC13178g f382h0;

    /* renamed from: i0 */
    private final InterfaceC13178g f383i0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinActivity.kt */
    /* renamed from: aj.k$a */
    /* loaded from: classes2.dex */
    public static final class C0181a extends AbstractC6438m implements InterfaceC6097a {
        C0181a() {
            super(0);
        }

        /* renamed from: a */
        public static /* synthetic */ void m41665a(PinActivity pinActivity, DialogC3502a dialogC3502a, View view) {
            m41661e(pinActivity, dialogC3502a, view);
        }

        /* renamed from: b */
        public static /* synthetic */ void m41664b(PinActivity pinActivity, DialogC3502a dialogC3502a, View view) {
            m41660f(pinActivity, dialogC3502a, view);
        }

        /* renamed from: c */
        public static /* synthetic */ void m41663c(PinActivity pinActivity, DialogInterface dialogInterface) {
            m41659g(pinActivity, dialogInterface);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m41661e(PinActivity pinActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(pinActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            pinActivity.m41679G1();
            PinActivity.m41668x1(pinActivity).m41628d0();
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m41660f(PinActivity pinActivity, DialogC3502a dialogC3502a, View view) {
            Intrinsics.isThisObjectNull(pinActivity, "this$0");
            Intrinsics.isThisObjectNull(dialogC3502a, "$this_apply");
            pinActivity.m41678H1();
            PinActivity.m41668x1(pinActivity).m41629c0();
            dialogC3502a.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static final void m41659g(PinActivity pinActivity, DialogInterface dialogInterface) {
            Intrinsics.isThisObjectNull(pinActivity, "this$0");
            pinActivity.m41677I1();
        }

        /* renamed from: d */
        public final DialogC3502a mo42214q() {
            final DialogC3502a dialogC3502a = new DialogC3502a(PinActivity.this);
            final PinActivity pinActivity = PinActivity.this;
            View inflate = dialogC3502a.getLayoutInflater().inflate(C2336R.layout.bottomsheet_for_biometric, (ViewGroup) null);
            dialogC3502a.setContentView(inflate);
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_biometric_negative)).setOnClickListener(new View.OnClickListener() { // from class: aj.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinActivity.C0181a.m41661e(PinActivity.this, dialogC3502a, view);
                }
            });
            ((MaterialButton) inflate.findViewById(C2336R.C2338id.btn_biometric_positive)).setOnClickListener(new View.OnClickListener() { // from class: aj.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinActivity.C0181a.m41660f(PinActivity.this, dialogC3502a, view);
                }
            });
            dialogC3502a.setCancelable(false);
            dialogC3502a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: aj.h
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    PinActivity.C0181a.m41659g(PinActivity.this, dialogInterface);
                }
            });
            return dialogC3502a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinActivity.kt */
    /* renamed from: aj.k$b */
    /* loaded from: classes2.dex */
    public static final class C0182b extends AbstractC6438m implements InterfaceC6097a {
        C0182b() {
            super(0);
        }

        /* renamed from: a */
        public final WeakReference mo42214q() {
            return new WeakReference(PinActivity.m41668x1(PinActivity.this).m41616p0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinActivity.kt */
    /* renamed from: aj.k$c */
    /* loaded from: classes2.dex */
    public static final class C0183c extends AbstractC6438m implements InterfaceC6108l {
        C0183c() {
            super(1);
        }

        /* renamed from: a */
        public final void m41657a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            PinActivity.this.getWindow().setSoftInputMode(3);
            PinActivity.this.m41685A1().show();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m41657a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinActivity.kt */
    /* renamed from: aj.k$d */
    /* loaded from: classes2.dex */
    public static final class C0184d extends AbstractC6438m implements InterfaceC6108l {
        C0184d() {
            super(1);
        }

        /* renamed from: a */
        public final void m41656a(PinViewModel pinViewModel) {
            Intrinsics.isThisObjectNull(pinViewModel, "it");
            int m41703b = pinViewModel.m41703b();
            if (m41703b == 0) {
                BiometricPrompt.AbstractC0544a abstractC0544a = (BiometricPrompt.AbstractC0544a) PinActivity.m41669w1(PinActivity.this).get();
                if (abstractC0544a != null) {
                    new BiometricPrompt(PinActivity.this, Executors.newSingleThreadExecutor(), abstractC0544a).m40318a(pinViewModel.m41704a());
                }
            } else if (m41703b != 11) {
                UiEventsLiveData uiEventsLiveData = UiEventsLiveData.f18671a;
                String string = PinActivity.this.getString(C2336R.string.error_biometric);
                Intrinsics.checkIfNull(string, "getString(R.string.error_biometric)");
                uiEventsLiveData.m19510t(string);
            } else if (Build.VERSION.SDK_INT >= 30) {
                PinActivity.m41670v1(PinActivity.this).m41324a(new Intent("android.settings.BIOMETRIC_ENROLL"));
            } else {
                PinActivity.this.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m41656a((PinViewModel) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PinActivity.kt */
    /* renamed from: aj.k$e */
    /* loaded from: classes2.dex */
    public static final class C0185e extends AbstractC6438m implements InterfaceC6108l {
        C0185e() {
            super(1);
        }

        /* renamed from: a */
        public final void m41655a(EnumC0170a enumC0170a) {
            Intrinsics.isThisObjectNull(enumC0170a, "it");
            PinActivity.this.m41666z1(enumC0170a);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m41655a((EnumC0170a) obj);
            return C13195u.f34156a;
        }
    }

    public PinActivity() {
        InterfaceC13178g m1464a;
        InterfaceC13178g m1464a2;
        AbstractC0304b<I> m41364M = m41364M(new C4519c(), new InterfaceC0303a() { // from class: aj.d
            @Override // androidx.activity.result.InterfaceC0303a
            /* renamed from: a */
            public final void mo37406b(Object obj) {
                PinActivity.m41667y1(PinActivity.this, (ActivityResult) obj);
            }
        });
        Intrinsics.checkIfNull(m41364M, "registerForActivityResul…nt(false)\n        }\n    }");
        this.f381g0 = m41364M;
        m1464a = LazyJVM.m1464a(new C0181a());
        this.f382h0 = m1464a;
        m1464a2 = LazyJVM.m1464a(new C0182b());
        this.f383i0 = m1464a2;
    }

    /* renamed from: B1 */
    private final WeakReference m41684B1() {
        return (WeakReference) this.f383i0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m41682D1(AbstractC0188n abstractC0188n, CharSequence charSequence) {
        Intrinsics.isThisObjectNull(abstractC0188n, "$viewModel");
        abstractC0188n.m41644K0(charSequence.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m41681E1(AbstractC0188n abstractC0188n, String str) {
        Intrinsics.isThisObjectNull(abstractC0188n, "$viewModel");
        Intrinsics.checkIfNull(str, "it");
        abstractC0188n.m41622j0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m41680F1(AbstractC11865l2 abstractC11865l2, Animation animation, Boolean bool) {
        Intrinsics.isThisObjectNull(abstractC11865l2, "$binding");
        Intrinsics.isThisObjectNull(animation, "$animShake");
        if (bool.booleanValue()) {
            return;
        }
        abstractC11865l2.f30839x.startAnimation(animation);
    }

    /* renamed from: r1 */
    public static /* synthetic */ void m41674r1(AbstractC0188n abstractC0188n, String str) {
        m41681E1(abstractC0188n, str);
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m41673s1(AbstractC0188n abstractC0188n, CharSequence charSequence) {
        m41682D1(abstractC0188n, charSequence);
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m41672t1(PinActivity pinActivity, ActivityResult activityResult) {
        m41667y1(pinActivity, activityResult);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m41671u1(AbstractC11865l2 abstractC11865l2, Animation animation, Boolean bool) {
        m41680F1(abstractC11865l2, animation, bool);
    }

    /* renamed from: v1 */
    public static final /* synthetic */ AbstractC0304b m41670v1(PinActivity pinActivity) {
        return pinActivity.f381g0;
    }

    /* renamed from: w1 */
    public static final /* synthetic */ WeakReference m41669w1(PinActivity pinActivity) {
        return pinActivity.m41684B1();
    }

    /* renamed from: x1 */
    public static final /* synthetic */ AbstractC0188n m41668x1(PinActivity pinActivity) {
        return (AbstractC0188n) pinActivity.m22758I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m41667y1(PinActivity pinActivity, ActivityResult activityResult) {
        Intrinsics.isThisObjectNull(pinActivity, "this$0");
        if (activityResult.m41351b() != 0) {
            ((AbstractC0188n) pinActivity.m22758I0()).m41626f0();
            return;
        }
        ((AbstractC0188n) pinActivity.m22758I0()).m41620l0(false);
        ((AbstractC0188n) pinActivity.m22758I0()).m41630b0(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A1 */
    public final DialogC3502a m41685A1() {
        return (DialogC3502a) this.f382h0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: C1 */
    public void m41675n1(final AbstractC11865l2 abstractC11865l2, final AbstractC0188n abstractC0188n) {
        Intrinsics.isThisObjectNull(abstractC11865l2, "binding");
        Intrinsics.isThisObjectNull(abstractC0188n, "viewModel");
        super.m34589n1(abstractC11865l2, abstractC0188n);
        FluidContentResizer.m34623h(FluidContentResizer.f6136a, this, 0L, null, 6, null);
        final Animation loadAnimation = AnimationUtils.loadAnimation(C10841b.m6898a(this).m6899a(), C2336R.anim.shake_animation);
        Intrinsics.checkIfNull(loadAnimation, "AnimationUtils.loadAnimation(ctx, id)");
        abstractC11865l2.f30839x.setOnPinEnteredListener(new PinEntryEditText.InterfaceC2251i() { // from class: aj.g
            @Override // com.alimuzaffar.lib.pin.PinEntryEditText.InterfaceC2251i
            /* renamed from: a */
            public final void mo34281a(CharSequence charSequence) {
                PinActivity.m41682D1(AbstractC0188n.this, charSequence);
            }
        });
        abstractC0188n.m41610v0().mo171i(this, new InterfaceC1440f0() { // from class: aj.e
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PinActivity.m41681E1(AbstractC0188n.this, (String) obj);
            }
        });
        abstractC0188n.m41609w0().mo171i(this, new InterfaceC1440f0() { // from class: aj.f
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                PinActivity.m41680F1(AbstractC11865l2.this, loadAnimation, (Boolean) obj);
            }
        });
        abstractC0188n.m41619m0().mo171i(this, new EventObserver(new C0183c()));
        abstractC0188n.m41615q0().mo171i(this, new EventObserver(new C0184d()));
        abstractC0188n.m41617o0().mo171i(this, new EventObserver(new C0185e()));
        m41677I1();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G1 */
    public void m41679G1() {
        ((AbstractC0188n) m22758I0()).m41620l0(false);
        ((AbstractC0188n) m22758I0()).m41630b0(false);
    }

    /* renamed from: H1 */
    protected void m41678H1() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I1 */
    public final void m41677I1() {
        PinEntryEditText pinEntryEditText = ((AbstractC11865l2) m22738w0()).f30839x;
        Intrinsics.checkIfNull(pinEntryEditText, "binding.codePinEntryEditText");
        m148Y0(pinEntryEditText);
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_pin;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z1 */
    public void m41666z1(EnumC0170a enumC0170a) {
        Intrinsics.isThisObjectNull(enumC0170a, "state");
    }
}
