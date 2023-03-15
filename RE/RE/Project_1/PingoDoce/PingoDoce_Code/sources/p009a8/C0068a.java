package p009a8;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EnumC3193g;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: a8.a */
/* loaded from: classes.dex */
public final class C0068a {

    /* renamed from: b */
    public static final C0068a f178b = new C0068a(null, null);

    /* renamed from: a */
    private final EnumMap f179a;

    public C0068a(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(EnumC3193g.class);
        this.f179a = enumMap;
        enumMap.put((EnumMap) EnumC3193g.AD_STORAGE, (EnumC3193g) bool);
        enumMap.put((EnumMap) EnumC3193g.ANALYTICS_STORAGE, (EnumC3193g) bool2);
    }

    /* renamed from: a */
    public static C0068a m41992a(Bundle bundle) {
        EnumC3193g[] values;
        if (bundle == null) {
            return f178b;
        }
        EnumMap enumMap = new EnumMap(EnumC3193g.class);
        for (EnumC3193g enumC3193g : EnumC3193g.values()) {
            enumMap.put((EnumMap) enumC3193g, (EnumC3193g) m41980m(bundle.getString(enumC3193g.zzd)));
        }
        return new C0068a(enumMap);
    }

    /* renamed from: b */
    public static C0068a m41991b(String str) {
        EnumMap enumMap = new EnumMap(EnumC3193g.class);
        if (str != null) {
            int i = 0;
            while (true) {
                EnumC3193g[] enumC3193gArr = EnumC3193g.zzc;
                int length = enumC3193gArr.length;
                if (i >= 2) {
                    break;
                }
                EnumC3193g enumC3193g = enumC3193gArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put((EnumMap) enumC3193g, (EnumC3193g) bool);
                }
                i++;
            }
        }
        return new C0068a(enumMap);
    }

    /* renamed from: g */
    public static String m41986g(Bundle bundle) {
        EnumC3193g[] values;
        String string;
        for (EnumC3193g enumC3193g : EnumC3193g.values()) {
            if (bundle.containsKey(enumC3193g.zzd) && (string = bundle.getString(enumC3193g.zzd)) != null && m41980m(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m41983j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: l */
    static final int m41981l(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: m */
    private static Boolean m41980m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C0068a m41990c(C0068a c0068a) {
        EnumC3193g[] values;
        EnumMap enumMap = new EnumMap(EnumC3193g.class);
        for (EnumC3193g enumC3193g : EnumC3193g.values()) {
            Boolean bool = (Boolean) this.f179a.get(enumC3193g);
            Boolean bool2 = (Boolean) c0068a.f179a.get(enumC3193g);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put((EnumMap) enumC3193g, (EnumC3193g) bool);
        }
        return new C0068a(enumMap);
    }

    /* renamed from: d */
    public final C0068a m41989d(C0068a c0068a) {
        EnumC3193g[] values;
        EnumMap enumMap = new EnumMap(EnumC3193g.class);
        for (EnumC3193g enumC3193g : EnumC3193g.values()) {
            Boolean bool = (Boolean) this.f179a.get(enumC3193g);
            if (bool == null) {
                bool = (Boolean) c0068a.f179a.get(enumC3193g);
            }
            enumMap.put((EnumMap) enumC3193g, (EnumC3193g) bool);
        }
        return new C0068a(enumMap);
    }

    /* renamed from: e */
    public final Boolean m41988e() {
        return (Boolean) this.f179a.get(EnumC3193g.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        EnumC3193g[] values;
        if (obj instanceof C0068a) {
            C0068a c0068a = (C0068a) obj;
            for (EnumC3193g enumC3193g : EnumC3193g.values()) {
                if (m41981l((Boolean) this.f179a.get(enumC3193g)) != m41981l((Boolean) c0068a.f179a.get(enumC3193g))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean m41987f() {
        return (Boolean) this.f179a.get(EnumC3193g.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String m41985h() {
        char c;
        StringBuilder sb2 = new StringBuilder("G1");
        EnumC3193g[] enumC3193gArr = EnumC3193g.zzc;
        int length = enumC3193gArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f179a.get(enumC3193gArr[i]);
            if (bool == null) {
                c = '-';
            } else {
                c = bool.booleanValue() ? '1' : '0';
            }
            sb2.append(c);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean bool : this.f179a.values()) {
            i = (i * 31) + m41981l(bool);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean m41984i(EnumC3193g enumC3193g) {
        Boolean bool = (Boolean) this.f179a.get(enumC3193g);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean m41982k(C0068a c0068a) {
        EnumC3193g[] enumC3193gArr;
        for (EnumC3193g enumC3193g : (EnumC3193g[]) this.f179a.keySet().toArray(new EnumC3193g[0])) {
            Boolean bool = (Boolean) this.f179a.get(enumC3193g);
            Boolean bool2 = (Boolean) c0068a.f179a.get(enumC3193g);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("settings: ");
        EnumC3193g[] values = EnumC3193g.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            EnumC3193g enumC3193g = values[i];
            if (i != 0) {
                sb2.append(", ");
            }
            sb2.append(enumC3193g.name());
            sb2.append("=");
            Boolean bool = (Boolean) this.f179a.get(enumC3193g);
            if (!this.f179a.containsKey(enumC3193g) && bool != null) {
                sb2.append(true != bool.booleanValue() ? "denied" : "granted");
            } else {
                sb2.append("uninitialized");
            }
        }
        return sb2.toString();
    }

    public C0068a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(EnumC3193g.class);
        this.f179a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
