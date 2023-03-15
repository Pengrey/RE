package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1490u0;
import androidx.lifecycle.C1492v0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.C1664d;

/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC1348c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: F0 */
    private boolean f4019F0;

    /* renamed from: H0 */
    private Dialog f4020H0;

    /* renamed from: I0 */
    private boolean f4021I0;

    /* renamed from: J0 */
    private boolean f4022J0;

    /* renamed from: K0 */
    private boolean f4023K0;

    /* renamed from: w0 */
    private Handler f4024w0;

    /* renamed from: x0 */
    private Runnable f4025x0 = new RunnableC1349a();

    /* renamed from: y0 */
    private DialogInterface.OnCancelListener f4026y0 = new DialogInterface$OnCancelListenerC1350b();

    /* renamed from: z0 */
    private DialogInterface.OnDismissListener f4027z0 = new DialogInterface$OnDismissListenerC1351c();

    /* renamed from: A0 */
    private int f4028A0 = 0;

    /* renamed from: B0 */
    private int f4029B0 = 0;

    /* renamed from: C0 */
    private boolean f4030C0 = true;

    /* renamed from: D0 */
    private boolean f4031D0 = true;

    /* renamed from: E0 */
    private int f4032E0 = -1;

    /* renamed from: G0 */
    private InterfaceC1440f0<InterfaceC1491v> f4033G0 = new C1352d();

    /* renamed from: L0 */
    private boolean f4034L0 = false;

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    class RunnableC1349a implements Runnable {
        RunnableC1349a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            DialogInterface$OnCancelListenerC1348c.this.f4027z0.onDismiss(DialogInterface$OnCancelListenerC1348c.this.f4020H0);
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: classes.dex */
    class DialogInterface$OnCancelListenerC1350b implements DialogInterface.OnCancelListener {
        DialogInterface$OnCancelListenerC1350b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC1348c.this.f4020H0 != null) {
                DialogInterface$OnCancelListenerC1348c dialogInterface$OnCancelListenerC1348c = DialogInterface$OnCancelListenerC1348c.this;
                dialogInterface$OnCancelListenerC1348c.onCancel(dialogInterface$OnCancelListenerC1348c.f4020H0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    class DialogInterface$OnDismissListenerC1351c implements DialogInterface.OnDismissListener {
        DialogInterface$OnDismissListenerC1351c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterface$OnCancelListenerC1348c.this.f4020H0 != null) {
                DialogInterface$OnCancelListenerC1348c dialogInterface$OnCancelListenerC1348c = DialogInterface$OnCancelListenerC1348c.this;
                dialogInterface$OnCancelListenerC1348c.onDismiss(dialogInterface$OnCancelListenerC1348c.f4020H0);
            }
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    class C1352d implements InterfaceC1440f0<InterfaceC1491v> {
        C1352d() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: a */
        public void mo37325a(InterfaceC1491v interfaceC1491v) {
            if (interfaceC1491v == null || !DialogInterface$OnCancelListenerC1348c.this.f4031D0) {
                return;
            }
            View m37648I1 = DialogInterface$OnCancelListenerC1348c.this.m37648I1();
            if (m37648I1.getParent() == null) {
                if (DialogInterface$OnCancelListenerC1348c.this.f4020H0 != null) {
                    if (FragmentManager.m37520H0(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterface$OnCancelListenerC1348c.this.f4020H0);
                    }
                    DialogInterface$OnCancelListenerC1348c.this.f4020H0.setContentView(m37648I1);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    }

    /* compiled from: DialogFragment.java */
    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: classes.dex */
    class C1353e extends AbstractC1365f {

        /* renamed from: a */
        final /* synthetic */ AbstractC1365f f4039a;

        C1353e(AbstractC1365f abstractC1365f) {
            this.f4039a = abstractC1365f;
        }

        @Override // androidx.fragment.app.AbstractC1365f
        /* renamed from: d */
        public View mo37277d(int i) {
            if (this.f4039a.mo37276e()) {
                return this.f4039a.mo37277d(i);
            }
            return DialogInterface$OnCancelListenerC1348c.this.m37333p2(i);
        }

        @Override // androidx.fragment.app.AbstractC1365f
        /* renamed from: e */
        public boolean mo37276e() {
            return this.f4039a.mo37276e() || DialogInterface$OnCancelListenerC1348c.this.m37332q2();
        }
    }

    /* renamed from: l2 */
    private void m37336l2(boolean z, boolean z2) {
        if (this.f4022J0) {
            return;
        }
        this.f4022J0 = true;
        this.f4023K0 = false;
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4020H0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f4024w0.getLooper()) {
                    onDismiss(this.f4020H0);
                } else {
                    this.f4024w0.post(this.f4025x0);
                }
            }
        }
        this.f4021I0 = true;
        if (this.f4032E0 >= 0) {
            m37620T().m37488X0(this.f4032E0, 1);
            this.f4032E0 = -1;
            return;
        }
        AbstractC1382r m37447m = m37620T().m37447m();
        m37447m.mo37177m(this);
        if (z) {
            m37447m.mo37183g();
        } else {
            m37447m.mo37184f();
        }
    }

    /* renamed from: r2 */
    private void m37331r2(Bundle bundle) {
        if (this.f4031D0 && !this.f4034L0) {
            try {
                this.f4019F0 = true;
                Dialog mo3127o2 = mo3127o2(bundle);
                this.f4020H0 = mo3127o2;
                if (this.f4031D0) {
                    mo25550w2(mo3127o2, this.f4028A0);
                    Context m37654G = m37654G();
                    if (m37654G instanceof Activity) {
                        this.f4020H0.setOwnerActivity((Activity) m37654G);
                    }
                    this.f4020H0.setCancelable(this.f4030C0);
                    this.f4020H0.setOnCancelListener(this.f4026y0);
                    this.f4020H0.setOnDismissListener(this.f4027z0);
                    this.f4034L0 = true;
                } else {
                    this.f4020H0 = null;
                }
            } finally {
                this.f4019F0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        super.mo5750A0(context);
        m37580j0().mo170j(this.f4033G0);
        if (this.f4023K0) {
            return;
        }
        this.f4022J0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        this.f4024w0 = new Handler();
        this.f4031D0 = this.f3817T == 0;
        if (bundle != null) {
            this.f4028A0 = bundle.getInt("android:style", 0);
            this.f4029B0 = bundle.getInt("android:theme", 0);
            this.f4030C0 = bundle.getBoolean("android:cancelable", true);
            this.f4031D0 = bundle.getBoolean("android:showsDialog", this.f4031D0);
            this.f4032E0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: K0 */
    public void mo37344K0() {
        super.mo37344K0();
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            this.f4021I0 = true;
            dialog.setOnDismissListener(null);
            this.f4020H0.dismiss();
            if (!this.f4022J0) {
                onDismiss(this.f4020H0);
            }
            this.f4020H0 = null;
            this.f4034L0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: L0 */
    public void mo37343L0() {
        super.mo37343L0();
        if (!this.f4023K0 && !this.f4022J0) {
            this.f4022J0 = true;
        }
        m37580j0().mo168n(this.f4033G0);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: M0 */
    public LayoutInflater mo37342M0(Bundle bundle) {
        LayoutInflater mo37342M0 = super.mo37342M0(bundle);
        if (this.f4031D0 && !this.f4019F0) {
            m37331r2(bundle);
            if (FragmentManager.m37520H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4020H0;
            return dialog != null ? mo37342M0.cloneInContext(dialog.getContext()) : mo37342M0;
        }
        if (FragmentManager.m37520H0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f4031D0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            } else {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            }
        }
        return mo37342M0;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo29884Z0(Bundle bundle) {
        super.mo29884Z0(bundle);
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f4028A0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f4029B0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f4030C0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f4031D0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f4032E0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public void mo29891a1() {
        super.mo29891a1();
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            this.f4021I0 = false;
            dialog.show();
            View decorView = this.f4020H0.getWindow().getDecorView();
            C1490u0.m36968b(decorView, this);
            C1492v0.m36966b(decorView, this);
            C1664d.m35782b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public void mo29890b1() {
        super.mo29890b1();
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d1 */
    public void mo37341d1(Bundle bundle) {
        Bundle bundle2;
        super.mo37341d1(bundle);
        if (this.f4020H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4020H0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: j2 */
    public void mo30315j2() {
        m37336l2(false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public void mo37337k1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo37337k1(layoutInflater, viewGroup, bundle);
        if (this.f3826d0 != null || this.f4020H0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4020H0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: k2 */
    public void mo30314k2() {
        m37336l2(true, false);
    }

    /* renamed from: m2 */
    public Dialog m37335m2() {
        return this.f4020H0;
    }

    /* renamed from: n2 */
    public int m37334n2() {
        return this.f4029B0;
    }

    /* renamed from: o2 */
    public Dialog mo3127o2(Bundle bundle) {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(m37650H1(), m37334n2());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4021I0) {
            return;
        }
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m37336l2(true, true);
    }

    /* renamed from: p2 */
    View m37333p2(int i) {
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    /* renamed from: q2 */
    boolean m37332q2() {
        return this.f4034L0;
    }

    /* renamed from: s2 */
    public final Dialog m37330s2() {
        Dialog m37335m2 = m37335m2();
        if (m37335m2 != null) {
            return m37335m2;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    /* renamed from: t */
    public AbstractC1365f mo37329t() {
        return new C1353e(super.mo37329t());
    }

    /* renamed from: t2 */
    public void m37328t2(boolean z) {
        this.f4030C0 = z;
        Dialog dialog = this.f4020H0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    /* renamed from: u2 */
    public void m37327u2(boolean z) {
        this.f4031D0 = z;
    }

    /* renamed from: v2 */
    public void m37326v2(int i, int i2) {
        if (FragmentManager.m37520H0(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i + ", " + i2);
        }
        this.f4028A0 = i;
        if (i == 2 || i == 3) {
            this.f4029B0 = 16973913;
        }
        if (i2 != 0) {
            this.f4029B0 = i2;
        }
    }

    /* renamed from: w2 */
    public void mo25550w2(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: x2 */
    public void mo3126x2(FragmentManager fragmentManager, String str) {
        this.f4022J0 = false;
        this.f4023K0 = true;
        AbstractC1382r m37447m = fragmentManager.m37447m();
        m37447m.m37186d(this, str);
        m37447m.mo37184f();
    }
}
