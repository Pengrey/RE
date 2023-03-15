package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.C0928a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n */
/* loaded from: classes.dex */
public final class C3270n extends AbstractC3188f5 {

    /* renamed from: c */
    private long f8691c;

    /* renamed from: d */
    private String f8692d;

    /* renamed from: e */
    private AccountManager f8693e;

    /* renamed from: f */
    private Boolean f8694f;

    /* renamed from: g */
    private long f8695g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3270n(C3242k4 c3242k4) {
        super(c3242k4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: j */
    protected final boolean mo31007j() {
        Calendar calendar = Calendar.getInstance();
        this.f8691c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f8692d = sb2.toString();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final long m31072o() {
        mo30825h();
        return this.f8695g;
    }

    /* renamed from: p */
    public final long m31071p() {
        m31346k();
        return this.f8691c;
    }

    /* renamed from: q */
    public final String m31070q() {
        m31346k();
        return this.f8692d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m31069r() {
        mo30825h();
        this.f8694f = null;
        this.f8695g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m31068s() {
        Account[] result;
        mo30825h();
        long mo25914a = this.f8410a.mo31115e().mo25914a();
        if (mo25914a - this.f8695g > 86400000) {
            this.f8694f = null;
        }
        Boolean bool = this.f8694f;
        if (bool == null) {
            if (C0928a.m39116a(this.f8410a.mo31117c(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f8410a.mo31116d().m31325y().m31398a("Permission error checking for dasher/unicorn accounts");
                this.f8695g = mo25914a;
                this.f8694f = Boolean.FALSE;
                return false;
            }
            if (this.f8693e == null) {
                this.f8693e = AccountManager.get(this.f8410a.mo31117c());
            }
            try {
                result = this.f8693e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f8410a.mo31116d().m31330t().m31397b("Exception checking account types", e);
            }
            if (result != null && result.length > 0) {
                this.f8694f = Boolean.TRUE;
                this.f8695g = mo25914a;
                return true;
            }
            Account[] result2 = this.f8693e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f8694f = Boolean.TRUE;
                this.f8695g = mo25914a;
                return true;
            }
            this.f8695g = mo25914a;
            this.f8694f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
