package p324r0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import p181jd.Intrinsics;

/* compiled from: AutofillCallback.android.kt */
/* renamed from: r0.g */
/* loaded from: classes.dex */
public final class C9787g extends AutofillManager.AutofillCallback {

    /* renamed from: a */
    public static final C9787g f25724a = new C9787g();

    private C9787g() {
    }

    /* renamed from: a */
    public final void m9954a(C9781a c9781a) {
        Intrinsics.isThisObjectNull(c9781a, "autofill");
        c9781a.m9973a().registerCallback(this);
    }

    /* renamed from: b */
    public final void m9953b(C9781a c9781a) {
        Intrinsics.isThisObjectNull(c9781a, "autofill");
        c9781a.m9973a().unregisterCallback(this);
    }

    public void onAutofillEvent(View view, int i, int i2) {
        Intrinsics.isThisObjectNull(view, "view");
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
