package p484z6;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.InterfaceC2505h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.q */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterface$OnClickListenerC13720q implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static AbstractDialogInterface$OnClickListenerC13720q m555b(Activity activity, Intent intent, int i) {
        return new C13718o(intent, activity, i);
    }

    /* renamed from: c */
    public static AbstractDialogInterface$OnClickListenerC13720q m554c(InterfaceC2505h interfaceC2505h, Intent intent, int i) {
        return new C13719p(intent, interfaceC2505h, 2);
    }

    /* renamed from: a */
    protected abstract void mo556a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo556a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
