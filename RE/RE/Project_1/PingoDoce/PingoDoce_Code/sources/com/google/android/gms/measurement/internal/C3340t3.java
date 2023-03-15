package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p009a8.C0068a;
import p266o6.C8022a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t3 */
/* loaded from: classes.dex */
public final class C3340t3 extends AbstractC3188f5 {

    /* renamed from: x */
    static final Pair f8958x = new Pair(BuildConfig.VERSION_NAME, 0L);

    /* renamed from: c */
    private SharedPreferences f8959c;

    /* renamed from: d */
    public C3318r3 f8960d;

    /* renamed from: e */
    public final C3307q3 f8961e;

    /* renamed from: f */
    public final C3307q3 f8962f;

    /* renamed from: g */
    public final C3329s3 f8963g;

    /* renamed from: h */
    private String f8964h;

    /* renamed from: i */
    private boolean f8965i;

    /* renamed from: j */
    private long f8966j;

    /* renamed from: k */
    public final C3307q3 f8967k;

    /* renamed from: l */
    public final C3285o3 f8968l;

    /* renamed from: m */
    public final C3329s3 f8969m;

    /* renamed from: n */
    public final C3285o3 f8970n;

    /* renamed from: o */
    public final C3307q3 f8971o;

    /* renamed from: p */
    public boolean f8972p;

    /* renamed from: q */
    public final C3285o3 f8973q;

    /* renamed from: r */
    public final C3285o3 f8974r;

    /* renamed from: s */
    public final C3307q3 f8975s;

    /* renamed from: t */
    public final C3329s3 f8976t;

    /* renamed from: u */
    public final C3329s3 f8977u;

    /* renamed from: v */
    public final C3307q3 f8978v;

    /* renamed from: w */
    public final C3296p3 f8979w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3340t3(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8967k = new C3307q3(this, "session_timeout", 1800000L);
        this.f8968l = new C3285o3(this, "start_new_session", true);
        this.f8971o = new C3307q3(this, "last_pause_time", 0L);
        this.f8969m = new C3329s3(this, "non_personalized_ads", null);
        this.f8970n = new C3285o3(this, "allow_remote_dynamite", false);
        this.f8961e = new C3307q3(this, "first_open_time", 0L);
        this.f8962f = new C3307q3(this, "app_install_time", 0L);
        this.f8963g = new C3329s3(this, "app_instance_id", null);
        this.f8973q = new C3285o3(this, "app_backgrounded", false);
        this.f8974r = new C3285o3(this, "deep_link_retrieval_complete", false);
        this.f8975s = new C3307q3(this, "deep_link_retrieval_attempts", 0L);
        this.f8976t = new C3329s3(this, "firebase_feature_rollouts", null);
        this.f8977u = new C3329s3(this, "deferred_attribution_cache", null);
        this.f8978v = new C3307q3(this, "deferred_attribution_cache_timestamp", 0L);
        this.f8979w = new C3296p3(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    /* renamed from: i */
    protected final void mo31008i() {
        SharedPreferences sharedPreferences = this.f8410a.mo31117c().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f8959c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f8972p = z;
        if (!z) {
            SharedPreferences.Editor edit = this.f8959c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f8410a.m31094z();
        this.f8960d = new C3318r3(this, "health_monitor", Math.max(0L, ((Long) C3339t2.f8915d.m31018a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: j */
    protected final boolean mo31007j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final SharedPreferences m31006o() {
        mo30825h();
        m31346k();
        C2597i.m33076j(this.f8959c);
        return this.f8959c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Pair m31005p(String str) {
        mo30825h();
        long mo25912c = this.f8410a.mo31115e().mo25912c();
        String str2 = this.f8964h;
        if (str2 != null && mo25912c < this.f8966j) {
            return new Pair(str2, Boolean.valueOf(this.f8965i));
        }
        this.f8966j = mo25912c + this.f8410a.m31094z().m31356r(str, C3339t2.f8913c);
        C8022a.m17137b(true);
        try {
            C8022a.C8023a m17138a = C8022a.m17138a(this.f8410a.mo31117c());
            this.f8964h = BuildConfig.VERSION_NAME;
            String m17131a = m17138a.m17131a();
            if (m17131a != null) {
                this.f8964h = m17131a;
            }
            this.f8965i = m17138a.m17130b();
        } catch (Exception e) {
            this.f8410a.mo31116d().m31333q().m31397b("Unable to get advertising id", e);
            this.f8964h = BuildConfig.VERSION_NAME;
        }
        C8022a.m17137b(false);
        return new Pair(this.f8964h, Boolean.valueOf(this.f8965i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public final C0068a m31004q() {
        mo30825h();
        return C0068a.m41991b(m31006o().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final Boolean m31003r() {
        mo30825h();
        if (m31006o().contains("measurement_enabled")) {
            return Boolean.valueOf(m31006o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final void m31002s(Boolean bool) {
        mo30825h();
        SharedPreferences.Editor edit = m31006o().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public final void m31001t(boolean z) {
        mo30825h();
        this.f8410a.mo31116d().m31328v().m31397b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = m31006o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean m31000u() {
        SharedPreferences sharedPreferences = this.f8959c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean m30999v(long j) {
        return j - this.f8967k.m31039a() > this.f8971o.m31039a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean m30998w(int i) {
        return C0068a.m41983j(i, m31006o().getInt("consent_source", 100));
    }
}
