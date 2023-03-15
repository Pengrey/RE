package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.C2691b;
import com.google.android.gms.internal.measurement.C2695b3;
import com.google.android.gms.internal.measurement.C2696b4;
import com.google.android.gms.internal.measurement.C2728d4;
import com.google.android.gms.internal.measurement.C2732d8;
import com.google.android.gms.internal.measurement.C2744e4;
import com.google.android.gms.internal.measurement.C2760f4;
import com.google.android.gms.internal.measurement.C2775g3;
import com.google.android.gms.internal.measurement.C2807i3;
import com.google.android.gms.internal.measurement.C2808i4;
import com.google.android.gms.internal.measurement.C2824j4;
import com.google.android.gms.internal.measurement.C2849kd;
import com.google.android.gms.internal.measurement.C2887n3;
import com.google.android.gms.internal.measurement.C2888n4;
import com.google.android.gms.internal.measurement.C2904o4;
import com.google.android.gms.internal.measurement.C2920p4;
import com.google.android.gms.internal.measurement.C3014v4;
import com.google.android.gms.internal.measurement.C3044x4;
import com.google.android.gms.internal.measurement.C3059y4;
import com.google.android.gms.internal.measurement.C3072z2;
import com.google.android.gms.internal.measurement.C3074z4;
import com.google.android.gms.internal.measurement.InterfaceC2957r9;
import com.google.android.gms.internal.measurement.zzkh;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p009a8.C0079l;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.c9 */
/* loaded from: classes.dex */
public final class C3159c9 extends AbstractC3323r8 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3159c9(C3137a9 c3137a9) {
        super(c3137a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static InterfaceC2957r9 m31436C(InterfaceC2957r9 interfaceC2957r9, byte[] bArr) throws zzkh {
        C2732d8 m32782b = C2732d8.m32782b();
        if (m32782b != null) {
            return interfaceC2957r9.mo32136t(bArr, m32782b);
        }
        return interfaceC2957r9.mo32137h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public static List m31431H(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static boolean m31427L(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public static boolean m31425N(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public static final void m31423P(C2744e4 c2744e4, String str, Object obj) {
        List m32768K = c2744e4.m32768K();
        int i = 0;
        while (true) {
            if (i >= m32768K.size()) {
                i = -1;
                break;
            } else if (str.equals(((C2824j4) m32768K.get(i)).m32552G())) {
                break;
            } else {
                i++;
            }
        }
        C2808i4 m32554E = C2824j4.m32554E();
        m32554E.m32576D(str);
        if (obj instanceof Long) {
            m32554E.m32577C(((Long) obj).longValue());
        }
        if (i >= 0) {
            c2744e4.m32774D(i, m32554E);
        } else {
            c2744e4.m32762x(m32554E);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final boolean m31422m(zzau zzauVar, zzp zzpVar) {
        C2597i.m33076j(zzauVar);
        C2597i.m33076j(zzpVar);
        return (TextUtils.isEmpty(zzpVar.f9205x) && TextUtils.isEmpty(zzpVar.f9198M)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static final C2824j4 m31421n(C2760f4 c2760f4, String str) {
        for (C2824j4 c2824j4 : c2760f4.m32733I()) {
            if (c2824j4.m32552G().equals(str)) {
                return c2824j4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static final Object m31420o(C2760f4 c2760f4, String str) {
        C2824j4 m31421n = m31421n(c2760f4, str);
        if (m31421n != null) {
            if (m31421n.m32535X()) {
                return m31421n.m32551H();
            }
            if (m31421n.m32537V()) {
                return Long.valueOf(m31421n.m32555D());
            }
            if (m31421n.m32539T()) {
                return Double.valueOf(m31421n.m32558A());
            }
            if (m31421n.m32556C() > 0) {
                List<C2824j4> m32550I = m31421n.m32550I();
                ArrayList arrayList = new ArrayList();
                for (C2824j4 c2824j4 : m32550I) {
                    if (c2824j4 != null) {
                        Bundle bundle = new Bundle();
                        for (C2824j4 c2824j42 : c2824j4.m32550I()) {
                            if (c2824j42.m32535X()) {
                                bundle.putString(c2824j42.m32552G(), c2824j42.m32551H());
                            } else if (c2824j42.m32537V()) {
                                bundle.putLong(c2824j42.m32552G(), c2824j42.m32555D());
                            } else if (c2824j42.m32539T()) {
                                bundle.putDouble(c2824j42.m32552G(), c2824j42.m32558A());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    /* renamed from: p */
    private final void m31419p(StringBuilder sb2, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2824j4 c2824j4 = (C2824j4) it.next();
            if (c2824j4 != null) {
                m31417r(sb2, i2);
                sb2.append("param {\n");
                m31414u(sb2, i2, "name", c2824j4.m32536W() ? this.f8410a.m31134D().m31453e(c2824j4.m32552G()) : null);
                m31414u(sb2, i2, "string_value", c2824j4.m32535X() ? c2824j4.m32551H() : null);
                m31414u(sb2, i2, "int_value", c2824j4.m32537V() ? Long.valueOf(c2824j4.m32555D()) : null);
                m31414u(sb2, i2, "double_value", c2824j4.m32539T() ? Double.valueOf(c2824j4.m32558A()) : null);
                if (c2824j4.m32556C() > 0) {
                    m31419p(sb2, i2, c2824j4.m32550I());
                }
                m31417r(sb2, i2);
                sb2.append("}\n");
            }
        }
    }

    /* renamed from: q */
    private final void m31418q(StringBuilder sb2, int i, C2695b3 c2695b3) {
        String str;
        if (c2695b3 == null) {
            return;
        }
        m31417r(sb2, i);
        sb2.append("filter {\n");
        if (c2695b3.m32884H()) {
            m31414u(sb2, i, "complement", Boolean.valueOf(c2695b3.m32885G()));
        }
        if (c2695b3.m32882J()) {
            m31414u(sb2, i, "param_name", this.f8410a.m31134D().m31453e(c2695b3.m32887E()));
        }
        if (c2695b3.m32881K()) {
            int i2 = i + 1;
            C2887n3 m32888D = c2695b3.m32888D();
            if (m32888D != null) {
                m31417r(sb2, i2);
                sb2.append("string_filter {\n");
                if (m32888D.m32449I()) {
                    switch (m32888D.m32448J()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    m31414u(sb2, i2, "match_type", str);
                }
                if (m32888D.m32450H()) {
                    m31414u(sb2, i2, "expression", m32888D.m32454D());
                }
                if (m32888D.m32451G()) {
                    m31414u(sb2, i2, "case_sensitive", Boolean.valueOf(m32888D.m32452F()));
                }
                if (m32888D.m32457A() > 0) {
                    m31417r(sb2, i2 + 1);
                    sb2.append("expression_list {\n");
                    for (String str2 : m32888D.m32453E()) {
                        m31417r(sb2, i2 + 2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                m31417r(sb2, i2);
                sb2.append("}\n");
            }
        }
        if (c2695b3.m32883I()) {
            m31413v(sb2, i + 1, "number_filter", c2695b3.m32889C());
        }
        m31417r(sb2, i);
        sb2.append("}\n");
    }

    /* renamed from: r */
    private static final void m31417r(StringBuilder sb2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("  ");
        }
    }

    /* renamed from: s */
    private static final String m31416s(boolean z, boolean z2, boolean z3) {
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("Dynamic ");
        }
        if (z2) {
            sb2.append("Sequence ");
        }
        if (z3) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    /* renamed from: t */
    private static final void m31415t(StringBuilder sb2, int i, String str, C3014v4 c3014v4) {
        if (c3014v4 == null) {
            return;
        }
        m31417r(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (c3014v4.m31982B() != 0) {
            m31417r(sb2, 4);
            sb2.append("results: ");
            int i2 = 0;
            for (Long l : c3014v4.m31973K()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l);
                i2 = i3;
            }
            sb2.append('\n');
        }
        if (c3014v4.m31980D() != 0) {
            m31417r(sb2, 4);
            sb2.append("status: ");
            int i4 = 0;
            for (Long l2 : c3014v4.m31971M()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l2);
                i4 = i5;
            }
            sb2.append('\n');
        }
        if (c3014v4.m31983A() != 0) {
            m31417r(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (C2728d4 c2728d4 : c3014v4.m31974J()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c2728d4.m32786H() ? Integer.valueOf(c2728d4.m32793A()) : null);
                sb2.append(":");
                sb2.append(c2728d4.m32787G() ? Long.valueOf(c2728d4.m32792B()) : null);
                i6 = i7;
            }
            sb2.append("}\n");
        }
        if (c3014v4.m31981C() != 0) {
            m31417r(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (C3044x4 c3044x4 : c3014v4.m31972L()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb2.append(", ");
                }
                sb2.append(c3044x4.m31833I() ? Integer.valueOf(c3044x4.m31840B()) : null);
                sb2.append(": [");
                int i10 = 0;
                for (Long l3 : c3044x4.m31836F()) {
                    long longValue = l3.longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i10 = i11;
                }
                sb2.append("]");
                i8 = i9;
            }
            sb2.append("}\n");
        }
        m31417r(sb2, 3);
        sb2.append("}\n");
    }

    /* renamed from: u */
    private static final void m31414u(StringBuilder sb2, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        m31417r(sb2, i + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    /* renamed from: v */
    private static final void m31413v(StringBuilder sb2, int i, String str, C2775g3 c2775g3) {
        if (c2775g3 == null) {
            return;
        }
        m31417r(sb2, i);
        sb2.append(str);
        sb2.append(" {\n");
        if (c2775g3.m32635G()) {
            int m32630L = c2775g3.m32630L();
            m31414u(sb2, i, "comparison_type", m32630L != 1 ? m32630L != 2 ? m32630L != 3 ? m32630L != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (c2775g3.m32633I()) {
            m31414u(sb2, i, "match_as_float", Boolean.valueOf(c2775g3.m32636F()));
        }
        if (c2775g3.m32634H()) {
            m31414u(sb2, i, "comparison_value", c2775g3.m32639C());
        }
        if (c2775g3.m32631K()) {
            m31414u(sb2, i, "min_comparison_value", c2775g3.m32637E());
        }
        if (c2775g3.m32632J()) {
            m31414u(sb2, i, "max_comparison_value", c2775g3.m32638D());
        }
        m31417r(sb2, i);
        sb2.append("}\n");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static int m31412w(C2904o4 c2904o4, String str) {
        for (int i = 0; i < c2904o4.m32359k0(); i++) {
            if (str.equals(c2904o4.m32364f0(i).m31706F())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final zzau m31438A(C2691b c2691b) {
        Object obj;
        Bundle m31410y = m31410y(c2691b.m32897e(), true);
        String obj2 = (!m31410y.containsKey("_o") || (obj = m31410y.get("_o")) == null) ? "app" : obj.toString();
        String m41973b = C0079l.m41973b(c2691b.m32898d());
        if (m41973b == null) {
            m41973b = c2691b.m32898d();
        }
        return new zzau(m41973b, new zzas(m31410y), obj2, c2691b.m32901a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final C2760f4 m31437B(C3281o c3281o) {
        C2744e4 m32737E = C2760f4.m32737E();
        m32737E.m32772G(c3281o.f8724e);
        C3303q c3303q = new C3303q(c3281o.f8725f);
        while (c3303q.hasNext()) {
            String next = c3303q.next();
            C2808i4 m32554E = C2824j4.m32554E();
            m32554E.m32576D(next);
            Object m30821E = c3281o.f8725f.m30821E(next);
            C2597i.m33076j(m30821E);
            m31429J(m32554E, m30821E);
            m32737E.m32762x(m32554E);
        }
        return (C2760f4) m32737E.m32426p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final String m31435D(C2888n4 c2888n4) {
        if (c2888n4 == null) {
            return BuildConfig.VERSION_NAME;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        for (C2920p4 c2920p4 : c2888n4.m32444D()) {
            if (c2920p4 != null) {
                m31417r(sb2, 1);
                sb2.append("bundle {\n");
                if (c2920p4.m32238j1()) {
                    m31414u(sb2, 1, "protocol_version", Integer.valueOf(c2920p4.m32222r1()));
                }
                m31414u(sb2, 1, "platform", c2920p4.m32295J());
                if (c2920p4.m32246f1()) {
                    m31414u(sb2, 1, "gmp_version", Long.valueOf(c2920p4.m32320A1()));
                }
                if (c2920p4.m32226p1()) {
                    m31414u(sb2, 1, "uploading_gmp_version", Long.valueOf(c2920p4.m32305F1()));
                }
                if (c2920p4.m32321A0()) {
                    m31414u(sb2, 1, "dynamite_version", Long.valueOf(c2920p4.m32208y1()));
                }
                if (c2920p4.m32211x0()) {
                    m31414u(sb2, 1, "config_version", Long.valueOf(c2920p4.m32212w1()));
                }
                m31414u(sb2, 1, "gmp_app_id", c2920p4.m32304G());
                m31414u(sb2, 1, "admob_app_id", c2920p4.m32290K1());
                m31414u(sb2, 1, "app_id", c2920p4.m32287L1());
                m31414u(sb2, 1, "app_version", c2920p4.m32319B());
                if (c2920p4.m32215v0()) {
                    m31414u(sb2, 1, "app_version_major", Integer.valueOf(c2920p4.m32257a0()));
                }
                m31414u(sb2, 1, "firebase_instance_id", c2920p4.m32307F());
                if (c2920p4.m32207z0()) {
                    m31414u(sb2, 1, "dev_cert_hash", Long.valueOf(c2920p4.m32210x1()));
                }
                m31414u(sb2, 1, "app_store", c2920p4.m32322A());
                if (c2920p4.m32228o1()) {
                    m31414u(sb2, 1, "upload_timestamp_millis", Long.valueOf(c2920p4.m32308E1()));
                }
                if (c2920p4.m32232m1()) {
                    m31414u(sb2, 1, "start_timestamp_millis", Long.valueOf(c2920p4.m32311D1()));
                }
                if (c2920p4.m32248e1()) {
                    m31414u(sb2, 1, "end_timestamp_millis", Long.valueOf(c2920p4.m32206z1()));
                }
                if (c2920p4.m32240i1()) {
                    m31414u(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2920p4.m32314C1()));
                }
                if (c2920p4.m32242h1()) {
                    m31414u(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2920p4.m32317B1()));
                }
                m31414u(sb2, 1, "app_instance_id", c2920p4.m32284M1());
                m31414u(sb2, 1, "resettable_device_id", c2920p4.m32292K());
                m31414u(sb2, 1, "ds_id", c2920p4.m32310E());
                if (c2920p4.m32244g1()) {
                    m31414u(sb2, 1, "limited_ad_tracking", Boolean.valueOf(c2920p4.m32221s0()));
                }
                m31414u(sb2, 1, "os_version", c2920p4.m32298I());
                m31414u(sb2, 1, "device_model", c2920p4.m32313D());
                m31414u(sb2, 1, "user_default_language", c2920p4.m32289L());
                if (c2920p4.m32230n1()) {
                    m31414u(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(c2920p4.m32218t1()));
                }
                if (c2920p4.m32213w0()) {
                    m31414u(sb2, 1, "bundle_sequential_index", Integer.valueOf(c2920p4.m32254b1()));
                }
                if (c2920p4.m32234l1()) {
                    m31414u(sb2, 1, "service_upload", Boolean.valueOf(c2920p4.m32219t0()));
                }
                m31414u(sb2, 1, "health_monitor", c2920p4.m32301H());
                if (!this.f8410a.m31094z().m31373B(null, C3339t2.f8926i0) && c2920p4.m32217u0() && c2920p4.m32214v1() != 0) {
                    m31414u(sb2, 1, "android_id", Long.valueOf(c2920p4.m32214v1()));
                }
                if (c2920p4.m32236k1()) {
                    m31414u(sb2, 1, "retry_counter", Integer.valueOf(c2920p4.m32220s1()));
                }
                if (c2920p4.m32209y0()) {
                    m31414u(sb2, 1, "consent_signals", c2920p4.m32316C());
                }
                List<C3074z4> m32281O = c2920p4.m32281O();
                if (m32281O != null) {
                    for (C3074z4 c3074z4 : m32281O) {
                        if (c3074z4 != null) {
                            m31417r(sb2, 2);
                            sb2.append("user_property {\n");
                            m31414u(sb2, 2, "set_timestamp_millis", c3074z4.m31694R() ? Long.valueOf(c3074z4.m31709C()) : null);
                            m31414u(sb2, 2, "name", this.f8410a.m31134D().m31452f(c3074z4.m31706F()));
                            m31414u(sb2, 2, "string_value", c3074z4.m31705G());
                            m31414u(sb2, 2, "int_value", c3074z4.m31695Q() ? Long.valueOf(c3074z4.m31710B()) : null);
                            m31414u(sb2, 2, "double_value", c3074z4.m31696P() ? Double.valueOf(c3074z4.m31711A()) : null);
                            m31417r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2696b4> m32286M = c2920p4.m32286M();
                if (m32286M != null) {
                    for (C2696b4 c2696b4 : m32286M) {
                        if (c2696b4 != null) {
                            m31417r(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (c2696b4.m32870K()) {
                                m31414u(sb2, 2, "audience_id", Integer.valueOf(c2696b4.m32880A()));
                            }
                            if (c2696b4.m32869L()) {
                                m31414u(sb2, 2, "new_audience", Boolean.valueOf(c2696b4.m32871J()));
                            }
                            m31415t(sb2, 2, "current_data", c2696b4.m32877D());
                            if (c2696b4.m32868M()) {
                                m31415t(sb2, 2, "previous_data", c2696b4.m32876E());
                            }
                            m31417r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C2760f4> m32283N = c2920p4.m32283N();
                if (m32283N != null) {
                    for (C2760f4 c2760f4 : m32283N) {
                        if (c2760f4 != null) {
                            m31417r(sb2, 2);
                            sb2.append("event {\n");
                            m31414u(sb2, 2, "name", this.f8410a.m31134D().m31454d(c2760f4.m32734H()));
                            if (c2760f4.m32722T()) {
                                m31414u(sb2, 2, "timestamp_millis", Long.valueOf(c2760f4.m32738D()));
                            }
                            if (c2760f4.m32723S()) {
                                m31414u(sb2, 2, "previous_timestamp_millis", Long.valueOf(c2760f4.m32739C()));
                            }
                            if (c2760f4.m32724R()) {
                                m31414u(sb2, 2, "count", Integer.valueOf(c2760f4.m32741A()));
                            }
                            if (c2760f4.m32740B() != 0) {
                                m31419p(sb2, 2, c2760f4.m32733I());
                            }
                            m31417r(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                m31417r(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final String m31434E(C3072z2 c3072z2) {
        if (c3072z2 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (c3072z2.m31714O()) {
            m31414u(sb2, 0, "filter_id", Integer.valueOf(c3072z2.m31727B()));
        }
        m31414u(sb2, 0, "event_name", this.f8410a.m31134D().m31454d(c3072z2.m31722G()));
        String m31416s = m31416s(c3072z2.m31718K(), c3072z2.m31717L(), c3072z2.m31716M());
        if (!m31416s.isEmpty()) {
            m31414u(sb2, 0, "filter_type", m31416s);
        }
        if (c3072z2.m31715N()) {
            m31413v(sb2, 1, "event_count_filter", c3072z2.m31723F());
        }
        if (c3072z2.m31728A() > 0) {
            sb2.append("  filters {\n");
            for (C2695b3 c2695b3 : c3072z2.m31721H()) {
                m31418q(sb2, 2, c2695b3);
            }
        }
        m31417r(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final String m31433F(C2807i3 c2807i3) {
        if (c2807i3 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (c2807i3.m32581J()) {
            m31414u(sb2, 0, "filter_id", Integer.valueOf(c2807i3.m32590A()));
        }
        m31414u(sb2, 0, "property_name", this.f8410a.m31134D().m31452f(c2807i3.m32586E()));
        String m31416s = m31416s(c2807i3.m32584G(), c2807i3.m32583H(), c2807i3.m32582I());
        if (!m31416s.isEmpty()) {
            m31414u(sb2, 0, "filter_type", m31416s);
        }
        m31418q(sb2, 1, c2807i3.m32589B());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public final List m31432G(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f8410a.mo31116d().m31327w().m31397b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f8410a.mo31116d().m31327w().m31396c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r3 instanceof android.os.Parcelable[]) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r5 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if (r7 >= r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        r4.add(m31430I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        r3 = (java.util.ArrayList) r3;
        r5 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
        if (r7 >= r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
        r4.add(m31430I((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
        r4.add(m31430I((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r0.put(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x000d A[SYNTHETIC] */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map m31430I(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            com.google.android.gms.internal.measurement.C2849kd.m32503b()
            com.google.android.gms.measurement.internal.k4 r4 = r10.f8410a
            com.google.android.gms.measurement.internal.f r4 = r4.m31094z()
            r5 = 0
            com.google.android.gms.measurement.internal.s2 r6 = com.google.android.gms.measurement.internal.C3339t2.f8932l0
            boolean r4 = r4.m31373B(r5, r6)
            if (r4 == 0) goto L3c
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L3c:
            boolean r4 = r3 instanceof android.os.Bundle[]
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 != 0) goto L4f
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L49
            goto L4f
        L49:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L4f:
            if (r12 == 0) goto Ld
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r5 = r3 instanceof android.os.Parcelable[]
            r6 = 0
            if (r5 == 0) goto L73
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r5 = r3.length
            r7 = r6
        L5f:
            if (r7 >= r5) goto La1
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m31430I(r8, r6)
            r4.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5f
        L73:
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 == 0) goto L94
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r5 = r3.size()
            r7 = r6
        L7e:
            if (r7 >= r5) goto La1
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L91
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.m31430I(r8, r6)
            r4.add(r8)
        L91:
            int r7 = r7 + 1
            goto L7e
        L94:
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto La1
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.m31430I(r3, r6)
            r4.add(r3)
        La1:
            r0.put(r2, r4)
            goto Ld
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3159c9.m31430I(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m31429J(C2808i4 c2808i4, Object obj) {
        Bundle[] bundleArr;
        C2597i.m33076j(obj);
        c2808i4.m32579A();
        c2808i4.m32570x();
        c2808i4.m32571w();
        c2808i4.m32569z();
        if (obj instanceof String) {
            c2808i4.m32575F((String) obj);
        } else if (obj instanceof Long) {
            c2808i4.m32577C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c2808i4.m32578B(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C2808i4 m32554E = C2824j4.m32554E();
                    for (String str : bundle.keySet()) {
                        C2808i4 m32554E2 = C2824j4.m32554E();
                        m32554E2.m32576D(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            m32554E2.m32577C(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            m32554E2.m32575F((String) obj2);
                        } else if (obj2 instanceof Double) {
                            m32554E2.m32578B(((Double) obj2).doubleValue());
                        }
                        m32554E.m32572u(m32554E2);
                    }
                    if (m32554E.m32574r() > 0) {
                        arrayList.add((C2824j4) m32554E.m32426p());
                    }
                }
            }
            c2808i4.m32573s(arrayList);
        } else {
            this.f8410a.mo31116d().m31332r().m31397b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final void m31428K(C3059y4 c3059y4, Object obj) {
        C2597i.m33076j(obj);
        c3059y4.m31806u();
        c3059y4.m31807s();
        c3059y4.m31808r();
        if (obj instanceof String) {
            c3059y4.m31809B((String) obj);
        } else if (obj instanceof Long) {
            c3059y4.m31804x(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c3059y4.m31805w(((Double) obj).doubleValue());
        } else {
            this.f8410a.mo31116d().m31332r().m31397b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m31426M(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.f8410a.mo31115e().mo25914a() - j) > j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public final byte[] m31424O(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Failed to gzip content", e);
            throw e;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final long m31411x(byte[] bArr) {
        C2597i.m33076j(bArr);
        this.f8410a.m31124N().mo30825h();
        MessageDigest m31275s = C3203g9.m31275s();
        if (m31275s == null) {
            this.f8410a.mo31116d().m31332r().m31398a("Failed to get MD5");
            return 0L;
        }
        return C3203g9.m31278q0(m31275s.digest(bArr));
    }

    /* renamed from: y */
    final Bundle m31410y(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                C2849kd.m32503b();
                if (this.f8410a.m31094z().m31373B(null, C3339t2.f8932l0)) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.add(m31410y((Map) arrayList.get(i), false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                } else {
                    ArrayList arrayList3 = (ArrayList) obj;
                    ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList4.add(m31410y((Map) arrayList3.get(i2), false));
                    }
                    bundle.putParcelableArrayList(str, arrayList4);
                }
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final Parcelable m31409z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.f8410a.mo31116d().m31332r().m31398a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
