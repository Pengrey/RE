package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C2567c;
import com.google.android.gms.common.C2569e;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.InterfaceC2805i1;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.joda.time.DateTimeConstants;
import p009a8.C0078k;
import p009a8.C0079l;
import p009a8.C0080m;
import p009a8.C0081n;
import p078e7.C5004e;
import p119g7.C5615c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.g9 */
/* loaded from: classes.dex */
public final class C3203g9 extends AbstractC3188f5 {

    /* renamed from: g */
    private static final String[] f8475g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f8476h = {"_err"};

    /* renamed from: i */
    public static final /* synthetic */ int f8477i = 0;

    /* renamed from: c */
    private SecureRandom f8478c;

    /* renamed from: d */
    private final AtomicLong f8479d;

    /* renamed from: e */
    private int f8480e;

    /* renamed from: f */
    private Integer f8481f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3203g9(C3242k4 c3242k4) {
        super(c3242k4);
        this.f8481f = null;
        this.f8479d = new AtomicLong(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public static boolean m31302V(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public static boolean m31301W(String str) {
        C2597i.m33080f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static boolean m31300X(Context context) {
        ActivityInfo receiverInfo;
        C2597i.m33076j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public static boolean m31299Y(Context context, boolean z) {
        C2597i.m33076j(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return m31289i0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m31289i0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z */
    public static boolean m31298Z(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: a0 */
    public static boolean m31297a0(String str) {
        return !f8476h[0].equals(str);
    }

    /* renamed from: d0 */
    static final boolean m31294d0(Bundle bundle, int i) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    static final boolean m31293e0(String str) {
        C2597i.m33076j(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: f0 */
    private final int m31292f0(String str) {
        if ("_ldl".equals(str)) {
            this.f8410a.m31094z();
            return 2048;
        } else if ("_id".equals(str)) {
            this.f8410a.m31094z();
            return 256;
        } else if ("_lgclid".equals(str)) {
            this.f8410a.m31094z();
            return 100;
        } else {
            this.f8410a.m31094z();
            return 36;
        }
    }

    /* renamed from: g0 */
    private final Object m31291g0(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[]) obj) {
                        if (parcelable instanceof Bundle) {
                            Bundle m31270u0 = m31270u0((Bundle) parcelable);
                            if (!m31270u0.isEmpty()) {
                                arrayList.add(m31270u0);
                            }
                        }
                    }
                    return arrayList.toArray(new Bundle[arrayList.size()]);
                }
                return null;
            }
            return m31279q(obj.toString(), i, z);
        }
    }

    /* renamed from: h0 */
    private static boolean m31290h0(String str, String[] strArr) {
        C2597i.m33076j(strArr);
        for (String str2 : strArr) {
            if (m31298Z(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i0 */
    private static boolean m31289i0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public static long m31278q0(byte[] bArr) {
        C2597i.m33076j(bArr);
        int length = bArr.length;
        int i = 0;
        C2597i.m33073m(length > 0);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public static MessageDigest m31275s() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    /* renamed from: u */
    public static ArrayList m31271u(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzab zzabVar = (zzab) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.f9170w);
            bundle.putString("origin", zzabVar.f9171x);
            bundle.putLong("creation_timestamp", zzabVar.f9173z);
            bundle.putString("name", zzabVar.f9172y.f9183x);
            C0078k.m41975b(bundle, C2597i.m33076j(zzabVar.f9172y.m30815h()));
            bundle.putBoolean("active", zzabVar.f9163A);
            String str = zzabVar.f9164B;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzau zzauVar = zzabVar.f9165C;
            if (zzauVar != null) {
                bundle.putString("timed_out_event_name", zzauVar.f9175w);
                zzas zzasVar = zzauVar.f9176x;
                if (zzasVar != null) {
                    bundle.putBundle("timed_out_event_params", zzasVar.m30817v());
                }
            }
            bundle.putLong("trigger_timeout", zzabVar.f9166D);
            zzau zzauVar2 = zzabVar.f9167E;
            if (zzauVar2 != null) {
                bundle.putString("triggered_event_name", zzauVar2.f9175w);
                zzas zzasVar2 = zzauVar2.f9176x;
                if (zzasVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzasVar2.m30817v());
                }
            }
            bundle.putLong("triggered_timestamp", zzabVar.f9172y.f9184y);
            bundle.putLong("time_to_live", zzabVar.f9168F);
            zzau zzauVar3 = zzabVar.f9169G;
            if (zzauVar3 != null) {
                bundle.putString("expired_event_name", zzauVar3.f9175w);
                zzas zzasVar3 = zzauVar3.f9176x;
                if (zzasVar3 != null) {
                    bundle.putBundle("expired_event_params", zzasVar3.m30817v());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: x */
    public static void m31265x(C3299p6 c3299p6, Bundle bundle, boolean z) {
        if (bundle != null && c3299p6 != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = c3299p6.f8774a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c3299p6.f8775b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c3299p6.f8776c);
                return;
            }
            z = false;
        }
        if (bundle != null && c3299p6 == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public final void m31323A(InterfaceC3192f9 interfaceC3192f9, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m31294d0(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        interfaceC3192f9.mo30835a(str, "_err", bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final void m31322B(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.f8410a.mo31116d().m31326x().m31396c("Not putting event parameter. Invalid value type. name, type", this.f8410a.m31134D().m31453e(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    /* renamed from: C */
    public final void m31321C(InterfaceC2805i1 interfaceC2805i1, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: D */
    public final void m31320D(InterfaceC2805i1 interfaceC2805i1, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: E */
    public final void m31319E(InterfaceC2805i1 interfaceC2805i1, Bundle bundle) {
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: F */
    public final void m31318F(InterfaceC2805i1 interfaceC2805i1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning byte array to wrapper", e);
        }
    }

    /* renamed from: G */
    public final void m31317G(InterfaceC2805i1 interfaceC2805i1, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: H */
    public final void m31316H(InterfaceC2805i1 interfaceC2805i1, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: I */
    public final void m31315I(InterfaceC2805i1 interfaceC2805i1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC2805i1.mo32591A(bundle);
        } catch (RemoteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: J */
    final void m31314J(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i;
        String str4;
        int m31309O;
        if (bundle == null) {
            return;
        }
        this.f8410a.m31094z();
        int i2 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                int m31285m0 = !z ? m31285m0(str5) : 0;
                if (m31285m0 == 0) {
                    m31285m0 = m31286l0(str5);
                }
                i = m31285m0;
            } else {
                i = 0;
            }
            if (i != 0) {
                m31267w(bundle, i, str5, str5, i == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (m31304T(bundle.get(str5))) {
                    this.f8410a.mo31116d().m31326x().m31395d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    m31309O = 22;
                    str4 = str5;
                } else {
                    str4 = str5;
                    m31309O = m31309O(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (m31309O != 0 && !"_ev".equals(str4)) {
                    m31267w(bundle, m31309O, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (m31301W(str4) && !m31290h0(str4, C0080m.f191d) && (i2 = i2 + 1) > 0) {
                    this.f8410a.mo31116d().m31331s().m31396c("Item cannot contain custom parameters", this.f8410a.m31134D().m31454d(str2), this.f8410a.m31134D().m31456b(bundle));
                    m31294d0(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public final boolean m31313K(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (m31293e0(str)) {
                return true;
            }
            if (this.f8410a.m31103q()) {
                this.f8410a.mo31116d().m31331s().m31397b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C3197g3.m31324z(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            if (m31293e0(str2)) {
                return true;
            }
            this.f8410a.mo31116d().m31331s().m31397b("Invalid admob_app_id. Analytics disabled.", C3197g3.m31324z(str2));
            return false;
        } else {
            if (this.f8410a.m31103q()) {
                this.f8410a.mo31116d().m31331s().m31398a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public final boolean m31312L(String str, int i, String str2) {
        if (str2 == null) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            this.f8410a.mo31116d().m31331s().m31395d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean m31311M(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be null. Type", str);
            return false;
        }
        C2597i.m33076j(str2);
        String[] strArr3 = f8475g;
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(strArr3[i])) {
                this.f8410a.mo31116d().m31331s().m31396c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !m31290h0(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !m31290h0(str2, strArr2)) {
            this.f8410a.mo31116d().m31331s().m31396c("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public final boolean m31310N(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                this.f8410a.mo31116d().m31326x().m31395d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int m31309O(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3203g9.m31309O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean m31308P(String str, String str2) {
        if (str2 == null) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.f8410a.mo31116d().m31331s().m31396c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f8410a.mo31116d().m31331s().m31396c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Q */
    public final boolean m31307Q(String str, String str2) {
        if (str2 == null) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.f8410a.mo31116d().m31331s().m31397b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.f8410a.mo31116d().m31331s().m31396c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.f8410a.mo31116d().m31331s().m31396c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public final boolean m31306R(String str) {
        mo30825h();
        if (C5615c.m23567a(this.f8410a.mo31117c()).m23574a(str) == 0) {
            return true;
        }
        this.f8410a.mo31116d().m31333q().m31397b("Permission not granted", str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public final boolean m31305S(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String m31353u = this.f8410a.m31094z().m31353u();
        this.f8410a.mo31114f();
        return m31353u.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public final boolean m31304T(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: U */
    public final boolean m31303U(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo m23570e = C5615c.m23567a(context).m23570e(str, 64);
            if (m23570e == null || (signatureArr = m23570e.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            this.f8410a.mo31116d().m31332r().m31397b("Error obtaining certificate", e2);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean m31296b0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C2597i.m33076j(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final byte[] m31295c0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: i */
    protected final void mo31008i() {
        mo30825h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.f8410a.mo31116d().m31327w().m31398a("Utils falling back to Random for random id");
            }
        }
        this.f8479d.set(nextLong);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3188f5
    /* renamed from: j */
    protected final boolean mo31007j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final int m31288j0(String str, Object obj) {
        boolean m31310N;
        if ("_ldl".equals(str)) {
            m31310N = m31310N("user property referrer", str, m31292f0(str), obj);
        } else {
            m31310N = m31310N("user property", str, m31292f0(str), obj);
        }
        return m31310N ? 0 : 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final int m31287k0(String str) {
        if (m31308P("event", str)) {
            if (m31311M("event", C0079l.f184a, C0079l.f185b, str)) {
                this.f8410a.m31094z();
                return !m31312L("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    /* renamed from: l0 */
    final int m31286l0(String str) {
        if (m31308P("event param", str)) {
            if (m31311M("event param", null, null, str)) {
                this.f8410a.m31094z();
                return !m31312L("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* renamed from: m0 */
    final int m31285m0(String str) {
        if (m31307Q("event param", str)) {
            if (m31311M("event param", null, null, str)) {
                this.f8410a.m31094z();
                return !m31312L("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final int m31284n0(String str) {
        if (m31308P("user property", str)) {
            if (m31311M("user property", C0081n.f192a, null, str)) {
                this.f8410a.m31094z();
                return !m31312L("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final Object m31283o(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            this.f8410a.m31094z();
            return m31291g0(256, obj, true, true);
        }
        if (m31302V(str)) {
            this.f8410a.m31094z();
        } else {
            this.f8410a.m31094z();
            i = 100;
        }
        return m31291g0(i, obj, false, true);
    }

    @EnsuresNonNull({"this.apkVersion"})
    /* renamed from: o0 */
    public final int m31282o0() {
        if (this.f8481f == null) {
            this.f8481f = Integer.valueOf(C2567c.m33224f().m33229a(this.f8410a.mo31117c()) / DateTimeConstants.MILLIS_PER_SECOND);
        }
        return this.f8481f.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final Object m31281p(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m31291g0(m31292f0(str), obj, true, false);
        }
        return m31291g0(m31292f0(str), obj, false, false);
    }

    /* renamed from: p0 */
    public final int m31280p0(int i) {
        return C2567c.m33224f().mo33222h(this.f8410a.mo31117c(), C2569e.f7391a);
    }

    /* renamed from: q */
    public final String m31279q(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
            }
            return null;
        }
        return str;
    }

    /* renamed from: r */
    public final URL m31277r(long j, String str, String str2, long j2) {
        try {
            C2597i.m33080f(str2);
            C2597i.m33080f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 55005L, Integer.valueOf(m31282o0())), str2, str, Long.valueOf(j2));
            if (str.equals(this.f8410a.m31094z().m31352v())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: r0 */
    public final long m31276r0() {
        long andIncrement;
        long j;
        if (this.f8479d.get() == 0) {
            synchronized (this.f8479d) {
                long nextLong = new Random(System.nanoTime() ^ this.f8410a.mo31115e().mo25914a()).nextLong();
                int i = this.f8480e + 1;
                this.f8480e = i;
                j = nextLong + i;
            }
            return j;
        }
        synchronized (this.f8479d) {
            this.f8479d.compareAndSet(-1L, 1L);
            andIncrement = this.f8479d.getAndIncrement();
        }
        return andIncrement;
    }

    /* renamed from: s0 */
    public final long m31274s0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @EnsuresNonNull({"this.secureRandom"})
    /* renamed from: t */
    public final SecureRandom m31273t() {
        mo30825h();
        if (this.f8478c == null) {
            this.f8478c = new SecureRandom();
        }
        return this.f8478c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m31272t0(android.net.Uri r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3203g9.m31272t0(android.net.Uri, boolean):android.os.Bundle");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u0 */
    public final Bundle m31270u0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object m31283o = m31283o(str, bundle.get(str));
                if (m31283o == null) {
                    this.f8410a.mo31116d().m31326x().m31397b("Param value can't be null", this.f8410a.m31134D().m31453e(str));
                } else {
                    m31322B(bundle2, str, m31283o);
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final void m31269v(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            this.f8410a.mo31116d().m31327w().m31397b("Params already contained engagement", Long.valueOf(j2));
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a A[SYNTHETIC] */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m31268v0(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3203g9.m31268v0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    /* renamed from: w */
    final void m31267w(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m31294d0(bundle, i)) {
            this.f8410a.m31094z();
            bundle.putString("_ev", m31279q(str, 40, true));
            if (obj != null) {
                C2597i.m33076j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public final zzau m31266w0(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m31287k0(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            bundle3.putString("_o", str3);
            Bundle m31268v0 = m31268v0(str, str2, bundle3, C5004e.m25917b("_o"), true);
            if (z) {
                m31268v0 = m31270u0(m31268v0);
            }
            C2597i.m33076j(m31268v0);
            return new zzau(str2, new zzas(m31268v0), str3, j);
        }
        this.f8410a.mo31116d().m31332r().m31397b("Invalid conditional property event name", this.f8410a.m31134D().m31452f(str2));
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m31264y(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f8410a.m31124N().m31322B(bundle, str, bundle2.get(str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final void m31263z(C3208h3 c3208h3, int i) {
        int i2 = 0;
        for (String str : new TreeSet(c3208h3.f8493d.keySet())) {
            if (m31301W(str) && (i2 = i2 + 1) > i) {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Event can't contain more than ");
                sb2.append(i);
                sb2.append(" params");
                this.f8410a.mo31116d().m31331s().m31396c(sb2.toString(), this.f8410a.m31134D().m31454d(c3208h3.f8490a), this.f8410a.m31134D().m31456b(c3208h3.f8493d));
                m31294d0(c3208h3.f8493d, 5);
                c3208h3.f8493d.remove(str);
            }
        }
    }
}
