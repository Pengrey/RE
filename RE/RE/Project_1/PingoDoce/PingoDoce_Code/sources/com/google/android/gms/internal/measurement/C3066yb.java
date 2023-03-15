package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.yb */
/* loaded from: classes.dex */
public final class C3066yb implements InterfaceC3051xb {

    /* renamed from: A */
    public static final AbstractC2890n6 f8106A;

    /* renamed from: B */
    public static final AbstractC2890n6 f8107B;

    /* renamed from: C */
    public static final AbstractC2890n6 f8108C;

    /* renamed from: D */
    public static final AbstractC2890n6 f8109D;

    /* renamed from: E */
    public static final AbstractC2890n6 f8110E;

    /* renamed from: F */
    public static final AbstractC2890n6 f8111F;

    /* renamed from: G */
    public static final AbstractC2890n6 f8112G;

    /* renamed from: H */
    public static final AbstractC2890n6 f8113H;

    /* renamed from: I */
    public static final AbstractC2890n6 f8114I;

    /* renamed from: a */
    public static final AbstractC2890n6 f8115a;

    /* renamed from: b */
    public static final AbstractC2890n6 f8116b;

    /* renamed from: c */
    public static final AbstractC2890n6 f8117c;

    /* renamed from: d */
    public static final AbstractC2890n6 f8118d;

    /* renamed from: e */
    public static final AbstractC2890n6 f8119e;

    /* renamed from: f */
    public static final AbstractC2890n6 f8120f;

    /* renamed from: g */
    public static final AbstractC2890n6 f8121g;

    /* renamed from: h */
    public static final AbstractC2890n6 f8122h;

    /* renamed from: i */
    public static final AbstractC2890n6 f8123i;

    /* renamed from: j */
    public static final AbstractC2890n6 f8124j;

    /* renamed from: k */
    public static final AbstractC2890n6 f8125k;

    /* renamed from: l */
    public static final AbstractC2890n6 f8126l;

    /* renamed from: m */
    public static final AbstractC2890n6 f8127m;

    /* renamed from: n */
    public static final AbstractC2890n6 f8128n;

    /* renamed from: o */
    public static final AbstractC2890n6 f8129o;

    /* renamed from: p */
    public static final AbstractC2890n6 f8130p;

    /* renamed from: q */
    public static final AbstractC2890n6 f8131q;

    /* renamed from: r */
    public static final AbstractC2890n6 f8132r;

    /* renamed from: s */
    public static final AbstractC2890n6 f8133s;

    /* renamed from: t */
    public static final AbstractC2890n6 f8134t;

    /* renamed from: u */
    public static final AbstractC2890n6 f8135u;

    /* renamed from: v */
    public static final AbstractC2890n6 f8136v;

    /* renamed from: w */
    public static final AbstractC2890n6 f8137w;

    /* renamed from: x */
    public static final AbstractC2890n6 f8138x;

    /* renamed from: y */
    public static final AbstractC2890n6 f8139y;

    /* renamed from: z */
    public static final AbstractC2890n6 f8140z;

    static {
        C2842k6 c2842k6 = new C2842k6(C2730d6.m32785a("com.google.android.gms.measurement"));
        f8115a = c2842k6.m32512c("measurement.ad_id_cache_time", 10000L);
        f8116b = c2842k6.m32512c("measurement.max_bundles_per_iteration", 100L);
        f8117c = c2842k6.m32512c("measurement.config.cache_time", 86400000L);
        c2842k6.m32511d("measurement.log_tag", "FA");
        f8118d = c2842k6.m32511d("measurement.config.url_authority", "app-measurement.com");
        f8119e = c2842k6.m32511d("measurement.config.url_scheme", "https");
        f8120f = c2842k6.m32512c("measurement.upload.debug_upload_interval", 1000L);
        f8121g = c2842k6.m32512c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f8122h = c2842k6.m32512c("measurement.store.max_stored_events_per_app", 100000L);
        f8123i = c2842k6.m32512c("measurement.experiment.max_ids", 50L);
        f8124j = c2842k6.m32512c("measurement.audience.filter_result_max_count", 200L);
        f8125k = c2842k6.m32512c("measurement.alarm_manager.minimum_interval", 60000L);
        f8126l = c2842k6.m32512c("measurement.upload.minimum_delay", 500L);
        f8127m = c2842k6.m32512c("measurement.monitoring.sample_period_millis", 86400000L);
        f8128n = c2842k6.m32512c("measurement.upload.realtime_upload_interval", 10000L);
        f8129o = c2842k6.m32512c("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        c2842k6.m32512c("measurement.config.cache_time.service", 3600000L);
        f8130p = c2842k6.m32512c("measurement.service_client.idle_disconnect_millis", 5000L);
        c2842k6.m32511d("measurement.log_tag.service", "FA-SVC");
        f8131q = c2842k6.m32512c("measurement.upload.stale_data_deletion_interval", 86400000L);
        f8132r = c2842k6.m32512c("measurement.sdk.attribution.cache.ttl", 604800000L);
        f8133s = c2842k6.m32512c("measurement.upload.backoff_period", 43200000L);
        f8134t = c2842k6.m32512c("measurement.upload.initial_upload_delay_time", 15000L);
        f8135u = c2842k6.m32512c("measurement.upload.interval", 3600000L);
        f8136v = c2842k6.m32512c("measurement.upload.max_bundle_size", 65536L);
        f8137w = c2842k6.m32512c("measurement.upload.max_bundles", 100L);
        f8138x = c2842k6.m32512c("measurement.upload.max_conversions_per_day", 500L);
        f8139y = c2842k6.m32512c("measurement.upload.max_error_events_per_day", 1000L);
        f8140z = c2842k6.m32512c("measurement.upload.max_events_per_bundle", 1000L);
        f8106A = c2842k6.m32512c("measurement.upload.max_events_per_day", 100000L);
        f8107B = c2842k6.m32512c("measurement.upload.max_public_events_per_day", 50000L);
        f8108C = c2842k6.m32512c("measurement.upload.max_queue_time", 2419200000L);
        f8109D = c2842k6.m32512c("measurement.upload.max_realtime_events_per_day", 10L);
        f8110E = c2842k6.m32512c("measurement.upload.max_batch_size", 65536L);
        f8111F = c2842k6.m32512c("measurement.upload.retry_count", 6L);
        f8112G = c2842k6.m32512c("measurement.upload.retry_time", 1800000L);
        f8113H = c2842k6.m32511d("measurement.upload.url", "https://app-measurement.com/a");
        f8114I = c2842k6.m32512c("measurement.upload.window_interval", 3600000L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: A */
    public final long mo31770A() {
        return ((Long) f8137w.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: B */
    public final long mo31769B() {
        return ((Long) f8133s.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: C */
    public final long mo31768C() {
        return ((Long) f8107B.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: D */
    public final long mo31767D() {
        return ((Long) f8138x.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: E */
    public final String mo31766E() {
        return (String) f8118d.m32438b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: F */
    public final long mo31765F() {
        return ((Long) f8134t.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: G */
    public final long mo31764G() {
        return ((Long) f8110E.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: H */
    public final long mo31763H() {
        return ((Long) f8139y.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: I */
    public final String mo31762I() {
        return (String) f8119e.m32438b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: J */
    public final long mo31761J() {
        return ((Long) f8135u.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: K */
    public final long mo31760K() {
        return ((Long) f8111F.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: L */
    public final long mo31759L() {
        return ((Long) f8131q.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: M */
    public final String mo31758M() {
        return (String) f8113H.m32438b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: N */
    public final long mo31757N() {
        return ((Long) f8112G.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: O */
    public final long mo31756O() {
        return ((Long) f8140z.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: P */
    public final long mo31755P() {
        return ((Long) f8108C.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: Q */
    public final long mo31754Q() {
        return ((Long) f8136v.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: a */
    public final long mo31753a() {
        return ((Long) f8117c.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: b */
    public final long mo31752b() {
        return ((Long) f8120f.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: c */
    public final long mo31751c() {
        return ((Long) f8124j.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: d */
    public final long mo31750d() {
        return ((Long) f8121g.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: e */
    public final long mo31749e() {
        return ((Long) f8122h.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: f */
    public final long mo31748f() {
        return ((Long) f8123i.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: g */
    public final long mo31747g() {
        return ((Long) f8125k.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: h */
    public final long mo31746h() {
        return ((Long) f8128n.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: l */
    public final long mo31745l() {
        return ((Long) f8126l.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: m */
    public final long mo31744m() {
        return ((Long) f8127m.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: p */
    public final long mo31743p() {
        return ((Long) f8114I.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: q */
    public final long mo31742q() {
        return ((Long) f8109D.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: t */
    public final long mo31741t() {
        return ((Long) f8129o.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: x */
    public final long mo31740x() {
        return ((Long) f8130p.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: y */
    public final long mo31739y() {
        return ((Long) f8132r.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    /* renamed from: z */
    public final long mo31738z() {
        return ((Long) f8106A.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    public final long zza() {
        return ((Long) f8115a.m32438b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3051xb
    public final long zzb() {
        return ((Long) f8116b.m32438b()).longValue();
    }
}
