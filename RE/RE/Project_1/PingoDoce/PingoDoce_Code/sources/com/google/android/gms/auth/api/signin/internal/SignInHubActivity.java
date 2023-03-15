package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.ActivityC1354d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.util.Objects;
import p379u6.C10846e;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends ActivityC1354d {

    /* renamed from: R */
    private static boolean f7079R = false;

    /* renamed from: M */
    private boolean f7080M = false;

    /* renamed from: N */
    private SignInConfiguration f7081N;

    /* renamed from: O */
    private boolean f7082O;

    /* renamed from: P */
    private int f7083P;

    /* renamed from: Q */
    private Intent f7084Q;

    /* renamed from: a0 */
    private final void m33583a0() {
        m37322Q().mo36941c(0, null, new C2439q(this, null));
        f7079R = false;
    }

    /* renamed from: b0 */
    private final void m33582b0(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f7079R = false;
    }

    /* renamed from: c0 */
    private final void m33581c0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f7081N);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f7080M = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m33582b0(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@RecentlyNonNull AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC1354d, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.f7080M) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m33592h() != null) {
                GoogleSignInAccount m33592h = signInAccount.m33592h();
                C10846e m6891a = C10846e.m6891a(this);
                GoogleSignInOptions m33586h = this.f7081N.m33586h();
                Objects.requireNonNull(m33592h);
                m6891a.m6889c(m33586h, m33592h);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m33592h);
                this.f7082O = true;
                this.f7083P = i2;
                this.f7084Q = intent;
                m33583a0();
                return;
            } else if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m33582b0(intExtra);
                return;
            }
        }
        m33582b0(8);
    }

    @Override // androidx.fragment.app.ActivityC1354d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0904g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m33582b0(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f7081N = signInConfiguration;
            if (bundle == null) {
                if (f7079R) {
                    setResult(0);
                    m33582b0(12502);
                    return;
                }
                f7079R = true;
                m33581c0(action);
                return;
            }
            boolean z = bundle.getBoolean("signingInGoogleApiClients");
            this.f7082O = z;
            if (z) {
                this.f7083P = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                Objects.requireNonNull(intent2);
                this.f7084Q = intent2;
                m33583a0();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC1354d, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f7079R = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityC0904g, android.app.Activity
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f7082O);
        if (this.f7082O) {
            bundle.putInt("signInResultCode", this.f7083P);
            bundle.putParcelable("signInResultData", this.f7084Q);
        }
    }
}
