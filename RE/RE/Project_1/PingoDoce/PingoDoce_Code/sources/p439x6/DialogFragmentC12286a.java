package p439x6;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: x6.a */
/* loaded from: classes.dex */
public class DialogFragmentC12286a extends DialogFragment {

    /* renamed from: w */
    private Dialog f32471w;

    /* renamed from: x */
    private DialogInterface.OnCancelListener f32472x;

    /* renamed from: y */
    private Dialog f32473y;

    /* renamed from: a */
    public static DialogFragmentC12286a m3128a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC12286a dialogFragmentC12286a = new DialogFragmentC12286a();
        Dialog dialog2 = (Dialog) C2597i.m33075k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC12286a.f32471w = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC12286a.f32472x = onCancelListener;
        }
        return dialogFragmentC12286a;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f32472x;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f32471w;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f32473y == null) {
                this.f32473y = new AlertDialog.Builder((Context) C2597i.m33076j(getActivity())).create();
            }
            return this.f32473y;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
