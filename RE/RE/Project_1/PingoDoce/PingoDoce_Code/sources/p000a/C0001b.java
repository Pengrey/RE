package p000a;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.C4405j;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import java.util.EnumMap;
import java.util.HashSet;
import p239mb.C7155b;

/* renamed from: a.b */
/* loaded from: classes.dex */
public class C0001b {

    /* renamed from: c */
    private int f2c;

    /* renamed from: f */
    private boolean f3f;

    /* renamed from: a */
    private int f4a = -1;

    /* renamed from: b */
    private int f5b = -16777216;

    /* renamed from: d */
    private String f6d = null;

    /* renamed from: e */
    private EnumC4392a f7e = null;

    public C0001b(String str, Bundle bundle, String str2, int i) {
        this.f2c = Integer.MIN_VALUE;
        this.f3f = false;
        this.f2c = i;
        this.f3f = m42213a(str, bundle, str2);
    }

    /* renamed from: a */
    private boolean m42213a(String str, Bundle bundle, String str2) {
        EnumC4392a enumC4392a = EnumC4392a.QR_CODE;
        this.f7e = enumC4392a;
        this.f7e = enumC4392a;
        m42212b(str, bundle, str2);
        String str3 = this.f6d;
        return str3 != null && str3.length() > 0;
    }

    /* renamed from: b */
    private void m42212b(String str, Bundle bundle, String str2) {
        str2.hashCode();
        int i = 0;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1309271157:
                if (str2.equals("PHONE_TYPE")) {
                    c = 0;
                    break;
                }
                break;
            case -670199783:
                if (str2.equals("CONTACT_TYPE")) {
                    c = 1;
                    break;
                }
                break;
            case 709220992:
                if (str2.equals("SMS_TYPE")) {
                    c = 2;
                    break;
                }
                break;
            case 1349204356:
                if (str2.equals("LOCATION_TYPE")) {
                    c = 3;
                    break;
                }
                break;
            case 1778595596:
                if (str2.equals("TEXT_TYPE")) {
                    c = 4;
                    break;
                }
                break;
            case 1833351709:
                if (str2.equals("EMAIL_TYPE")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String m42205i = m42205i(str);
                if (m42205i != null) {
                    this.f6d = "tel:" + m42205i;
                    PhoneNumberUtils.formatNumber(m42205i);
                    return;
                }
                return;
            case 1:
                if (bundle == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder(100);
                StringBuilder sb3 = new StringBuilder(100);
                sb2.append("VCARD:");
                String m42205i2 = m42205i(bundle.getString("name"));
                if (m42205i2 != null) {
                    sb2.append("N:");
                    sb2.append(m42211c(m42205i2));
                    sb2.append(';');
                    sb3.append(m42205i2);
                }
                String m42205i3 = m42205i(bundle.getString("postal"));
                if (m42205i3 != null) {
                    sb2.append("ADR:");
                    sb2.append(m42211c(m42205i3));
                    sb2.append(';');
                    sb3.append('\n');
                    sb3.append(m42205i3);
                }
                HashSet<String> hashSet = new HashSet(C0000a.f0a.length);
                int i2 = 0;
                while (true) {
                    String[] strArr = C0000a.f0a;
                    if (i2 < strArr.length) {
                        String m42205i4 = m42205i(bundle.getString(strArr[i2]));
                        if (m42205i4 != null) {
                            hashSet.add(m42205i4);
                        }
                        i2++;
                    } else {
                        for (String str3 : hashSet) {
                            sb2.append("TEL:");
                            sb2.append(m42211c(str3));
                            sb2.append(';');
                            sb3.append('\n');
                            sb3.append(PhoneNumberUtils.formatNumber(str3));
                        }
                        HashSet<String> hashSet2 = new HashSet(C0000a.f1b.length);
                        while (true) {
                            String[] strArr2 = C0000a.f1b;
                            if (i < strArr2.length) {
                                String m42205i5 = m42205i(bundle.getString(strArr2[i]));
                                if (m42205i5 != null) {
                                    hashSet2.add(m42205i5);
                                }
                                i++;
                            } else {
                                for (String str4 : hashSet2) {
                                    sb2.append("EMAIL:");
                                    sb2.append(m42211c(str4));
                                    sb2.append(';');
                                    sb3.append('\n');
                                    sb3.append(str4);
                                }
                                String m42205i6 = m42205i(bundle.getString("URL_KEY"));
                                if (m42205i6 != null) {
                                    sb2.append("URL:");
                                    sb2.append(m42205i6);
                                    sb2.append(';');
                                    sb3.append('\n');
                                    sb3.append(m42205i6);
                                }
                                String m42205i7 = m42205i(bundle.getString("NOTE_KEY"));
                                if (m42205i7 != null) {
                                    sb2.append("NOTE:");
                                    sb2.append(m42211c(m42205i7));
                                    sb2.append(';');
                                    sb3.append('\n');
                                    sb3.append(m42205i7);
                                }
                                if (sb3.length() > 0) {
                                    sb2.append(';');
                                    this.f6d = sb2.toString();
                                    return;
                                }
                                this.f6d = null;
                                return;
                            }
                        }
                    }
                }
            case 2:
                String m42205i8 = m42205i(str);
                if (m42205i8 != null) {
                    this.f6d = "sms:" + m42205i8;
                    PhoneNumberUtils.formatNumber(m42205i8);
                    return;
                }
                return;
            case 3:
                if (bundle != null) {
                    float f = bundle.getFloat("LAT", Float.MAX_VALUE);
                    float f2 = bundle.getFloat("LONG", Float.MAX_VALUE);
                    if (f == Float.MAX_VALUE || f2 == Float.MAX_VALUE) {
                        return;
                    }
                    this.f6d = "geo:" + f + ',' + f2;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(f);
                    sb4.append(",");
                    sb4.append(f2);
                    return;
                }
                return;
            case 4:
                if (str == null || str.length() <= 0) {
                    return;
                }
                this.f6d = str;
                return;
            case 5:
                String m42205i9 = m42205i(str);
                if (m42205i9 != null) {
                    this.f6d = "mailto:" + m42205i9;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private String m42211c(String str) {
        if (str != null) {
            if (str.indexOf(58) >= 0 || str.indexOf(59) >= 0) {
                int length = str.length();
                StringBuilder sb2 = new StringBuilder(length);
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ':' || charAt == ';') {
                        sb2.append('\\');
                    }
                    sb2.append(charAt);
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }

    /* renamed from: g */
    private String m42207g(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) > 255) {
                return "UTF-8";
            }
        }
        return null;
    }

    /* renamed from: i */
    private String m42205i(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim;
    }

    /* renamed from: d */
    public Bitmap m42210d() {
        EnumMap enumMap;
        if (this.f3f) {
            try {
                String m42207g = m42207g(this.f6d);
                if (m42207g != null) {
                    EnumMap enumMap2 = new EnumMap(EnumC4401f.class);
                    enumMap2.put((EnumMap) EnumC4401f.CHARACTER_SET, (EnumC4401f) m42207g);
                    enumMap = enumMap2;
                } else {
                    enumMap = null;
                }
                C4405j c4405j = new C4405j();
                String str = this.f6d;
                EnumC4392a enumC4392a = this.f7e;
                int i = this.f2c;
                C7155b mo497a = c4405j.mo497a(str, enumC4392a, i, i, enumMap);
                int m19053l = mo497a.m19053l();
                int m19056i = mo497a.m19056i();
                int[] iArr = new int[m19053l * m19056i];
                for (int i2 = 0; i2 < m19056i; i2++) {
                    int i3 = i2 * m19053l;
                    for (int i4 = 0; i4 < m19053l; i4++) {
                        iArr[i3 + i4] = mo497a.m19059e(i4, i2) ? m42209e() : m42208f();
                    }
                }
                Bitmap createBitmap = Bitmap.createBitmap(m19053l, m19056i, Bitmap.Config.ARGB_8888);
                createBitmap.setPixels(iArr, 0, m19053l, 0, 0, m19053l, m19056i);
                return createBitmap;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public int m42209e() {
        return this.f5b;
    }

    /* renamed from: f */
    public int m42208f() {
        return this.f4a;
    }

    /* renamed from: h */
    public void m42206h(int i) {
        this.f4a = i;
    }
}
