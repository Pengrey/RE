package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.internal.measurement.C2831jb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p009a8.C0068a;
import p266o6.C8022a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.y7 */
/* loaded from: classes.dex */
public final class C3394y7 extends AbstractC3323r8 {

    /* renamed from: d */
    private final Map f9130d;

    /* renamed from: e */
    private String f9131e;

    /* renamed from: f */
    private boolean f9132f;

    /* renamed from: g */
    private long f9133g;

    /* renamed from: h */
    public final C3307q3 f9134h;

    /* renamed from: i */
    public final C3307q3 f9135i;

    /* renamed from: j */
    public final C3307q3 f9136j;

    /* renamed from: k */
    public final C3307q3 f9137k;

    /* renamed from: l */
    public final C3307q3 f9138l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3394y7(C3137a9 c3137a9) {
        super(c3137a9);
        this.f9130d = new HashMap();
        C3340t3 m31132F = this.f8410a.m31132F();
        m31132F.getClass();
        this.f9134h = new C3307q3(m31132F, "last_delete_stale", 0L);
        C3340t3 m31132F2 = this.f8410a.m31132F();
        m31132F2.getClass();
        this.f9135i = new C3307q3(m31132F2, "backoff", 0L);
        C3340t3 m31132F3 = this.f8410a.m31132F();
        m31132F3.getClass();
        this.f9136j = new C3307q3(m31132F3, "last_upload", 0L);
        C3340t3 m31132F4 = this.f8410a.m31132F();
        m31132F4.getClass();
        this.f9137k = new C3307q3(m31132F4, "last_upload_attempt", 0L);
        C3340t3 m31132F5 = this.f8410a.m31132F();
        m31132F5.getClass();
        this.f9138l = new C3307q3(m31132F5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        return false;
    }

    @Deprecated
    /* renamed from: m */
    final Pair m30838m(String str) {
        C8022a.C8023a m17138a;
        C3384x7 c3384x7;
        C8022a.C8023a m17138a2;
        mo30825h();
        long mo25912c = this.f8410a.mo31115e().mo25912c();
        C2831jb.m32527b();
        if (this.f8410a.m31094z().m31373B(null, C3339t2.f8942q0)) {
            C3384x7 c3384x72 = (C3384x7) this.f9130d.get(str);
            if (c3384x72 != null && mo25912c < c3384x72.f9111c) {
                return new Pair(c3384x72.f9109a, Boolean.valueOf(c3384x72.f9110b));
            }
            C8022a.m17137b(true);
            long m31356r = mo25912c + this.f8410a.m31094z().m31356r(str, C3339t2.f8913c);
            try {
                m17138a2 = C8022a.m17138a(this.f8410a.mo31117c());
            } catch (Exception e) {
                this.f8410a.mo31116d().m31333q().m31397b("Unable to get advertising id", e);
                c3384x7 = new C3384x7(BuildConfig.VERSION_NAME, false, m31356r);
            }
            if (m17138a2 == null) {
                return new Pair(BuildConfig.VERSION_NAME, Boolean.FALSE);
            }
            String m17131a = m17138a2.m17131a();
            if (m17131a != null) {
                c3384x7 = new C3384x7(m17131a, m17138a2.m17130b(), m31356r);
            } else {
                c3384x7 = new C3384x7(BuildConfig.VERSION_NAME, m17138a2.m17130b(), m31356r);
            }
            this.f9130d.put(str, c3384x7);
            C8022a.m17137b(false);
            return new Pair(c3384x7.f9109a, Boolean.valueOf(c3384x7.f9110b));
        }
        String str2 = this.f9131e;
        if (str2 != null && mo25912c < this.f9133g) {
            return new Pair(str2, Boolean.valueOf(this.f9132f));
        }
        this.f9133g = mo25912c + this.f8410a.m31094z().m31356r(str, C3339t2.f8913c);
        C8022a.m17137b(true);
        try {
            m17138a = C8022a.m17138a(this.f8410a.mo31117c());
        } catch (Exception e2) {
            this.f8410a.mo31116d().m31333q().m31397b("Unable to get advertising id", e2);
            this.f9131e = BuildConfig.VERSION_NAME;
        }
        if (m17138a == null) {
            return new Pair(BuildConfig.VERSION_NAME, Boolean.FALSE);
        }
        this.f9131e = BuildConfig.VERSION_NAME;
        String m17131a2 = m17138a.m17131a();
        if (m17131a2 != null) {
            this.f9131e = m17131a2;
        }
        this.f9132f = m17138a.m17130b();
        C8022a.m17137b(false);
        return new Pair(this.f9131e, Boolean.valueOf(this.f9132f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final Pair m30837n(String str, C0068a c0068a) {
        if (c0068a.m41984i(EnumC3193g.AD_STORAGE)) {
            return m30838m(str);
        }
        return new Pair(BuildConfig.VERSION_NAME, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: o */
    public final String m30836o(String str) {
        mo30825h();
        String str2 = (String) m30838m(str).first;
        MessageDigest m31275s = C3203g9.m31275s();
        if (m31275s == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, m31275s.digest(str2.getBytes())));
    }
}
