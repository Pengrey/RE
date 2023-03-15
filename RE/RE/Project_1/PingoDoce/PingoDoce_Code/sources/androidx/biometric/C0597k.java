package androidx.biometric;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0323b;
import androidx.core.content.C0928a;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1348c;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.InterfaceC1440f0;

/* renamed from: androidx.biometric.k */
/* loaded from: classes.dex */
public class C0597k extends DialogInterface$OnCancelListenerC1348c {

    /* renamed from: M0 */
    final Handler f1908M0 = new Handler(Looper.getMainLooper());

    /* renamed from: N0 */
    final Runnable f1909N0 = new RunnableC0598a();

    /* renamed from: O0 */
    C0582f f1910O0;

    /* renamed from: P0 */
    private int f1911P0;

    /* renamed from: Q0 */
    private int f1912Q0;

    /* renamed from: R0 */
    private ImageView f1913R0;

    /* renamed from: S0 */
    TextView f1914S0;

    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$a */
    /* loaded from: classes.dex */
    class RunnableC0598a implements Runnable {
        RunnableC0598a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0597k.this.m40116C2();
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$b */
    /* loaded from: classes.dex */
    class DialogInterface$OnClickListenerC0599b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC0599b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C0597k.this.f1910O0.m40182b0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$c */
    /* loaded from: classes.dex */
    public class C0600c implements InterfaceC1440f0<Integer> {
        C0600c() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(Integer num) {
            C0597k c0597k = C0597k.this;
            c0597k.f1908M0.removeCallbacks(c0597k.f1909N0);
            C0597k.this.m40114E2(num.intValue());
            C0597k.this.m40113F2(num.intValue());
            C0597k c0597k2 = C0597k.this;
            c0597k2.f1908M0.postDelayed(c0597k2.f1909N0, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$d */
    /* loaded from: classes.dex */
    public class C0601d implements InterfaceC1440f0<CharSequence> {
        C0601d() {
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: a */
        public void mo37325a(CharSequence charSequence) {
            C0597k c0597k = C0597k.this;
            c0597k.f1908M0.removeCallbacks(c0597k.f1909N0);
            C0597k.this.m40112G2(charSequence);
            C0597k c0597k2 = C0597k.this;
            c0597k2.f1908M0.postDelayed(c0597k2.f1909N0, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$e */
    /* loaded from: classes.dex */
    public static class C0602e {
        /* renamed from: a */
        static void m40107a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    /* renamed from: androidx.biometric.k$f */
    /* loaded from: classes.dex */
    private static class C0603f {
        /* renamed from: a */
        static int m40106a() {
            return C0610o.colorError;
        }
    }

    /* renamed from: A2 */
    private int m40118A2(int i) {
        Context m37654G = m37654G();
        ActivityC1354d m37547y = m37547y();
        if (m37654G != null && m37547y != null) {
            TypedValue typedValue = new TypedValue();
            m37654G.getTheme().resolveAttribute(i, typedValue, true);
            TypedArray obtainStyledAttributes = m37547y.obtainStyledAttributes(typedValue.data, new int[]{i});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            return color;
        }
        Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B2 */
    public static C0597k m40117B2() {
        return new C0597k();
    }

    /* renamed from: D2 */
    private boolean m40115D2(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return false;
        }
        if (i == 1 && i2 == 2) {
            return true;
        }
        return i == 2 && i2 == 1;
    }

    /* renamed from: y2 */
    private void m40111y2() {
        ActivityC1354d m37547y = m37547y();
        if (m37547y == null) {
            return;
        }
        C0582f c0582f = (C0582f) new C1479r0(m37547y).m36981a(C0582f.class);
        this.f1910O0 = c0582f;
        c0582f.m40164t().mo171i(this, new C0600c());
        this.f1910O0.m40166r().mo171i(this, new C0601d());
    }

    /* renamed from: z2 */
    private Drawable m40110z2(int i, int i2) {
        int i3;
        Context m37654G = m37654G();
        if (m37654G == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i == 0 && i2 == 1) {
            i3 = C0612q.fingerprint_dialog_fp_icon;
        } else if (i == 1 && i2 == 2) {
            i3 = C0612q.f1919a;
        } else if (i == 2 && i2 == 1) {
            i3 = C0612q.fingerprint_dialog_fp_icon;
        } else if (i != 1 || i2 != 3) {
            return null;
        } else {
            i3 = C0612q.fingerprint_dialog_fp_icon;
        }
        return C0928a.m39111f(m37654G, i3);
    }

    /* renamed from: C2 */
    void m40116C2() {
        Context m37654G = m37654G();
        if (m37654G == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            return;
        }
        this.f1910O0.m40184Z(1);
        this.f1910O0.m40186X(m37654G.getString(C0615t.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        m40111y2();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1911P0 = m40118A2(C0603f.m40106a());
        } else {
            Context m37654G = m37654G();
            this.f1911P0 = m37654G != null ? C0928a.m39113d(m37654G, C0611p.biometric_error_color) : 0;
        }
        this.f1912Q0 = m40118A2(16842808);
    }

    /* renamed from: E2 */
    void m40114E2(int i) {
        int m40165s;
        Drawable m40110z2;
        if (this.f1913R0 == null || Build.VERSION.SDK_INT < 23 || (m40110z2 = m40110z2((m40165s = this.f1910O0.m40165s()), i)) == null) {
            return;
        }
        this.f1913R0.setImageDrawable(m40110z2);
        if (m40115D2(m40165s, i)) {
            C0602e.m40107a(m40110z2);
        }
        this.f1910O0.m40185Y(i);
    }

    /* renamed from: F2 */
    void m40113F2(int i) {
        TextView textView = this.f1914S0;
        if (textView != null) {
            textView.setTextColor(i == 2 ? this.f1911P0 : this.f1912Q0);
        }
    }

    /* renamed from: G2 */
    void m40112G2(CharSequence charSequence) {
        TextView textView = this.f1914S0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public void mo37619T0() {
        super.mo37619T0();
        this.f1908M0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Y0 */
    public void mo33458Y0() {
        super.mo33458Y0();
        this.f1910O0.m40185Y(0);
        this.f1910O0.m40184Z(1);
        this.f1910O0.m40186X(m37589f0(C0615t.fingerprint_dialog_touch_sensor));
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: o2 */
    public Dialog mo3127o2(Bundle bundle) {
        CharSequence m40161w;
        DialogC0323b.C0324a c0324a = new DialogC0323b.C0324a(m37650H1());
        c0324a.m41263q(this.f1910O0.m40159y());
        View inflate = LayoutInflater.from(c0324a.m41278b()).inflate(C0614s.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0613r.fingerprint_subtitle);
        if (textView != null) {
            CharSequence m40160x = this.f1910O0.m40160x();
            if (TextUtils.isEmpty(m40160x)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(m40160x);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(C0613r.fingerprint_description);
        if (textView2 != null) {
            CharSequence m40167q = this.f1910O0.m40167q();
            if (TextUtils.isEmpty(m40167q)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(m40167q);
            }
        }
        this.f1913R0 = (ImageView) inflate.findViewById(C0613r.fingerprint_icon);
        this.f1914S0 = (TextView) inflate.findViewById(C0613r.fingerprint_error);
        if (C0555b.m40285c(this.f1910O0.m40177g())) {
            m40161w = m37589f0(C0615t.confirm_device_credential_password);
        } else {
            m40161w = this.f1910O0.m40161w();
        }
        c0324a.m41270j(m40161w, new DialogInterface$OnClickListenerC0599b());
        c0324a.m41262r(inflate);
        DialogC0323b m41279a = c0324a.m41279a();
        m41279a.setCanceledOnTouchOutside(false);
        return m41279a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f1910O0.m40188V(true);
    }
}
