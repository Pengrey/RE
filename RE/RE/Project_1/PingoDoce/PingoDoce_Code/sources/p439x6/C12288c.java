package p439x6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1348c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: x6.c */
/* loaded from: classes.dex */
public class C12288c extends DialogInterface$OnCancelListenerC1348c {

    /* renamed from: M0 */
    private Dialog f32474M0;

    /* renamed from: N0 */
    private DialogInterface.OnCancelListener f32475N0;

    /* renamed from: O0 */
    private Dialog f32476O0;

    /* renamed from: y2 */
    public static C12288c m3125y2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C12288c c12288c = new C12288c();
        Dialog dialog2 = (Dialog) C2597i.m33075k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c12288c.f32474M0 = dialog2;
        if (onCancelListener != null) {
            c12288c.f32475N0 = onCancelListener;
        }
        return c12288c;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: o2 */
    public Dialog mo3127o2(Bundle bundle) {
        Dialog dialog = this.f32474M0;
        if (dialog == null) {
            m37327u2(false);
            if (this.f32476O0 == null) {
                this.f32476O0 = new AlertDialog.Builder((Context) C2597i.m33076j(m37654G())).create();
            }
            return this.f32476O0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f32475N0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: x2 */
    public void mo3126x2(FragmentManager fragmentManager, String str) {
        super.mo3126x2(fragmentManager, str);
    }
}
