package p091f;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1348c;

/* renamed from: f.c */
/* loaded from: classes.dex */
public class C5149c extends DialogInterface$OnCancelListenerC1348c {
    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: o2 */
    public Dialog mo3127o2(Bundle bundle) {
        return new DialogC5147b(m37654G(), m37334n2());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: w2 */
    public void mo25550w2(Dialog dialog, int i) {
        if (dialog instanceof DialogC5147b) {
            DialogC5147b dialogC5147b = (DialogC5147b) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            dialogC5147b.m25554e(1);
            return;
        }
        super.mo25550w2(dialog, i);
    }
}
