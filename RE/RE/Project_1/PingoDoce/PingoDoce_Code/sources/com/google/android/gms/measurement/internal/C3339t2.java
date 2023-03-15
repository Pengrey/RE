package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.C2730d6;
import com.google.android.gms.internal.measurement.C2985t5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTimeConstants;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.t2 */
/* loaded from: classes.dex */
public final class C3339t2 {

    /* renamed from: A */
    public static final C3328s2 f8883A;

    /* renamed from: B */
    public static final C3328s2 f8884B;

    /* renamed from: C */
    public static final C3328s2 f8885C;

    /* renamed from: D */
    public static final C3328s2 f8886D;

    /* renamed from: E */
    public static final C3328s2 f8887E;

    /* renamed from: F */
    public static final C3328s2 f8888F;

    /* renamed from: G */
    public static final C3328s2 f8889G;

    /* renamed from: H */
    public static final C3328s2 f8890H;

    /* renamed from: I */
    public static final C3328s2 f8891I;

    /* renamed from: J */
    public static final C3328s2 f8892J;

    /* renamed from: K */
    public static final C3328s2 f8893K;

    /* renamed from: L */
    public static final C3328s2 f8894L;

    /* renamed from: M */
    public static final C3328s2 f8895M;

    /* renamed from: N */
    public static final C3328s2 f8896N;

    /* renamed from: O */
    public static final C3328s2 f8897O;

    /* renamed from: P */
    public static final C3328s2 f8898P;

    /* renamed from: Q */
    public static final C3328s2 f8899Q;

    /* renamed from: R */
    public static final C3328s2 f8900R;

    /* renamed from: S */
    public static final C3328s2 f8901S;

    /* renamed from: T */
    public static final C3328s2 f8902T;

    /* renamed from: U */
    public static final C3328s2 f8903U;

    /* renamed from: V */
    public static final C3328s2 f8904V;

    /* renamed from: W */
    public static final C3328s2 f8905W;

    /* renamed from: X */
    public static final C3328s2 f8906X;

    /* renamed from: Y */
    public static final C3328s2 f8907Y;

    /* renamed from: Z */
    public static final C3328s2 f8908Z;

    /* renamed from: a0 */
    public static final C3328s2 f8910a0;

    /* renamed from: b0 */
    public static final C3328s2 f8912b0;

    /* renamed from: c0 */
    public static final C3328s2 f8914c0;

    /* renamed from: d0 */
    public static final C3328s2 f8916d0;

    /* renamed from: e0 */
    public static final C3328s2 f8918e0;

    /* renamed from: f0 */
    public static final C3328s2 f8920f0;

    /* renamed from: g0 */
    public static final C3328s2 f8922g0;

    /* renamed from: h0 */
    public static final C3328s2 f8924h0;

    /* renamed from: i0 */
    public static final C3328s2 f8926i0;

    /* renamed from: j0 */
    public static final C3328s2 f8928j0;

    /* renamed from: k */
    public static final C3328s2 f8929k;

    /* renamed from: k0 */
    public static final C3328s2 f8930k0;

    /* renamed from: l */
    public static final C3328s2 f8931l;

    /* renamed from: l0 */
    public static final C3328s2 f8932l0;

    /* renamed from: m */
    public static final C3328s2 f8933m;

    /* renamed from: m0 */
    public static final C3328s2 f8934m0;

    /* renamed from: n */
    public static final C3328s2 f8935n;

    /* renamed from: n0 */
    public static final C3328s2 f8936n0;

    /* renamed from: o */
    public static final C3328s2 f8937o;

    /* renamed from: o0 */
    public static final C3328s2 f8938o0;

    /* renamed from: p */
    public static final C3328s2 f8939p;

    /* renamed from: p0 */
    public static final C3328s2 f8940p0;

    /* renamed from: q */
    public static final C3328s2 f8941q;

    /* renamed from: q0 */
    public static final C3328s2 f8942q0;

    /* renamed from: r */
    public static final C3328s2 f8943r;

    /* renamed from: r0 */
    public static final C3328s2 f8944r0;

    /* renamed from: s */
    public static final C3328s2 f8945s;

    /* renamed from: s0 */
    public static final C3328s2 f8946s0;

    /* renamed from: t */
    public static final C3328s2 f8947t;

    /* renamed from: t0 */
    public static final C3328s2 f8948t0;

    /* renamed from: u */
    public static final C3328s2 f8949u;

    /* renamed from: u0 */
    public static final C3328s2 f8950u0;

    /* renamed from: v */
    public static final C3328s2 f8951v;

    /* renamed from: v0 */
    public static final C3328s2 f8952v0;

    /* renamed from: w */
    public static final C3328s2 f8953w;

    /* renamed from: w0 */
    public static final C3328s2 f8954w0;

    /* renamed from: x */
    public static final C3328s2 f8955x;

    /* renamed from: y */
    public static final C3328s2 f8956y;

    /* renamed from: z */
    public static final C3328s2 f8957z;

    /* renamed from: a */
    private static final List f8909a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final Set f8911b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static final C3328s2 f8913c = m31011a("measurement.ad_id_cache_time", 10000L, 10000L, C3336t.f8880a);

    /* renamed from: d */
    public static final C3328s2 f8915d = m31011a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C3183f0.f8430a);

    /* renamed from: e */
    public static final C3328s2 f8917e = m31011a("measurement.config.cache_time", 86400000L, 3600000L, C3366w.f9048a);

    /* renamed from: f */
    public static final C3328s2 f8919f = m31011a("measurement.config.url_scheme", "https", "https", C3227j0.f8551a);

    /* renamed from: g */
    public static final C3328s2 f8921g = m31011a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C3357v0.f9035a);

    /* renamed from: h */
    public static final C3328s2 f8923h = m31011a("measurement.upload.max_bundles", 100, 100, C3217i1.f8513a);

    /* renamed from: i */
    public static final C3328s2 f8925i = m31011a("measurement.upload.max_batch_size", 65536, 65536, C3348u1.f9020a);

    /* renamed from: j */
    public static final C3328s2 f8927j = m31011a("measurement.upload.max_bundle_size", 65536, 65536, C3207h2.f8489a);

    static {
        Integer valueOf = Integer.valueOf((int) DateTimeConstants.MILLIS_PER_SECOND);
        f8929k = m31011a("measurement.upload.max_events_per_bundle", valueOf, valueOf, C3251l2.f8646a);
        f8931l = m31011a("measurement.upload.max_events_per_day", 100000, 100000, C3262m2.f8670a);
        f8933m = m31011a("measurement.upload.max_error_events_per_day", valueOf, valueOf, C3304q0.f8793a);
        f8935n = m31011a("measurement.upload.max_public_events_per_day", 50000, 50000, C3151c1.f8361a);
        f8937o = m31011a("measurement.upload.max_conversions_per_day", 10000, 10000, C3272n1.f8697a);
        f8939p = m31011a("measurement.upload.max_realtime_events_per_day", 10, 10, C3388y1.f9119a);
        f8941q = m31011a("measurement.store.max_stored_events_per_app", 100000, 100000, C3240k2.f8587a);
        f8943r = m31011a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C3273n2.f8698a);
        f8945s = m31011a("measurement.upload.backoff_period", 43200000L, 43200000L, C3284o2.f8728a);
        f8947t = m31011a("measurement.upload.window_interval", 3600000L, 3600000L, C3295p2.f8763a);
        f8949u = m31011a("measurement.upload.interval", 3600000L, 3600000L, C3346u.f9018a);
        f8951v = m31011a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C3356v.f9034a);
        f8953w = m31011a("measurement.upload.debug_upload_interval", 1000L, 1000L, C3386y.f9116a);
        f8955x = m31011a("measurement.upload.minimum_delay", 500L, 500L, C3396z.f9140a);
        f8956y = m31011a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C3128a0.f8294a);
        f8957z = m31011a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C3139b0.f8342a);
        f8883A = m31011a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C3150c0.f8360a);
        f8884B = m31011a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C3161d0.f8375a);
        f8885C = m31011a("measurement.upload.retry_time", 1800000L, 1800000L, C3172e0.f8395a);
        f8886D = m31011a("measurement.upload.retry_count", 6, 6, C3194g0.f8444a);
        f8887E = m31011a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C3205h0.f8487a);
        f8888F = m31011a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C3216i0.f8512a);
        f8889G = m31011a("measurement.audience.filter_result_max_count", 200, 200, C3238k0.f8585a);
        f8890H = m31011a("measurement.upload.max_public_user_properties", 25, 25, null);
        f8891I = m31011a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f8892J = m31011a("measurement.upload.max_public_event_params", 25, 25, null);
        f8893K = m31011a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C3249l0.f8644a);
        Boolean bool = Boolean.FALSE;
        f8894L = m31011a("measurement.test.boolean_flag", bool, bool, C3260m0.f8668a);
        f8895M = m31011a("measurement.test.string_flag", "---", "---", C3271n0.f8696a);
        f8896N = m31011a("measurement.test.long_flag", -1L, -1L, C3282o0.f8726a);
        f8897O = m31011a("measurement.test.int_flag", -2, -2, C3293p0.f8761a);
        Double valueOf2 = Double.valueOf(-3.0d);
        f8898P = m31011a("measurement.test.double_flag", valueOf2, valueOf2, C3315r0.f8827a);
        f8899Q = m31011a("measurement.experiment.max_ids", 50, 50, C3326s0.f8854a);
        f8900R = m31011a("measurement.max_bundles_per_iteration", 100, 100, C3337t0.f8881a);
        f8901S = m31011a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C3347u0.f9019a);
        Boolean bool2 = Boolean.TRUE;
        f8902T = m31011a("measurement.validation.internal_limits_internal_event_params", bool2, bool2, C3367w0.f9049a);
        f8903U = m31011a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, C3377x0.f9082a);
        f8904V = m31011a("measurement.quality.checksum", bool, bool, null);
        f8905W = m31011a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, C3397z0.f9141a);
        f8906X = m31011a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, C3129a1.f8295a);
        f8907Y = m31011a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, C3140b1.f8343a);
        f8908Z = m31011a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, C3162d1.f8376a);
        f8910a0 = m31011a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, C3173e1.f8396a);
        f8912b0 = m31011a("measurement.lifecycle.app_in_background_parameter", bool, bool, C3184f1.f8431a);
        f8914c0 = m31011a("measurement.integration.disable_firebase_instance_id", bool, bool, C3195g1.f8445a);
        f8916d0 = m31011a("measurement.collection.service.update_with_analytics_fix", bool, bool, C3206h1.f8488a);
        f8918e0 = m31011a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, C3228j1.f8552a);
        f8920f0 = m31011a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, C3239k1.f8586a);
        f8922g0 = m31011a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, C3250l1.f8645a);
        f8924h0 = m31011a("measurement.upload.file_truncate_fix", bool, bool, C3261m1.f8669a);
        m31011a("measurement.collection.synthetic_data_mitigation", bool, bool, C3283o1.f8727a);
        f8926i0 = m31011a("measurement.androidId.delete_feature", bool2, bool2, C3294p1.f8762a);
        f8928j0 = m31011a("measurement.service.storage_consent_support_version", 203600, 203600, C3305q1.f8794a);
        m31011a("measurement.client.click_identifier_control.dev", bool, bool, C3316r1.f8828a);
        m31011a("measurement.service.click_identifier_control", bool, bool, C3327s1.f8855a);
        f8930k0 = m31011a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, C3338t1.f8882a);
        f8932l0 = m31011a("measurement.module.pixie.fix_array", bool2, bool2, C3358v1.f9036a);
        f8934m0 = m31011a("measurement.adid_zero.service", bool2, bool2, C3368w1.f9050a);
        f8936n0 = m31011a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, C3378x1.f9083a);
        f8938o0 = m31011a("measurement.adid_zero.remove_lair_if_userid_cleared", bool2, bool2, C3130a2.f8296a);
        f8940p0 = m31011a("measurement.adid_zero.remove_lair_on_id_value_change_only", bool2, bool2, C3141b2.f8344a);
        f8942q0 = m31011a("measurement.adid_zero.adid_uid", bool, bool, C3152c2.f8362a);
        f8944r0 = m31011a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, C3163d2.f8377a);
        f8946s0 = m31011a("measurement.service.refactor.package_side_screen", bool2, bool2, C3174e2.f8397a);
        f8948t0 = m31011a("measurement.enhanced_campaign.service", bool, bool, C3185f2.f8432a);
        f8950u0 = m31011a("measurement.enhanced_campaign.client", bool, bool, C3196g2.f8446a);
        f8952v0 = m31011a("measurement.service.store_null_safelist", bool, bool, C3218i2.f8514a);
        f8954w0 = m31011a("measurement.service.store_safelist", bool, bool, C3229j2.f8553a);
    }

    /* renamed from: a */
    static C3328s2 m31011a(String str, Object obj, Object obj2, InterfaceC3306q2 interfaceC3306q2) {
        C3328s2 c3328s2 = new C3328s2(str, obj, obj2, interfaceC3306q2, null);
        f8909a.add(c3328s2);
        return c3328s2;
    }

    /* renamed from: c */
    public static Map m31009c(Context context) {
        C2985t5 m32070b = C2985t5.m32070b(context.getContentResolver(), C2730d6.m32785a("com.google.android.gms.measurement"));
        return m32070b == null ? Collections.emptyMap() : m32070b.m32069c();
    }
}
