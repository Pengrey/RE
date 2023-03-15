package p236m7;

import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: m7.d */
/* loaded from: classes.dex */
public final class C7137d {

    /* renamed from: a */
    public static final Feature f18949a;

    /* renamed from: b */
    public static final Feature f18950b;

    /* renamed from: c */
    public static final Feature f18951c;

    /* renamed from: d */
    public static final Feature f18952d;

    /* renamed from: e */
    public static final Feature[] f18953e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f18949a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        f18950b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f18951c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f18952d = feature4;
        f18953e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
