package p396v3;

import android.os.Build;
import p489zc._Arrays;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: v3.f */
/* loaded from: classes.dex */
public final class C11094f {

    /* renamed from: a */
    private static final boolean f28482a;

    static {
        String m8891i0;
        boolean m8948C;
        boolean m272z;
        String str;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i == 26) {
            String str2 = Build.MODEL;
            if (str2 != null) {
                m8891i0 = C10171u.m8891i0(str2, "SAMSUNG-");
                m8948C = StringsJVM.m8948C(m8891i0, "SM-", false, 2, null);
                if (m8948C) {
                    m272z = true;
                } else {
                    String str3 = Build.DEVICE;
                    if (str3 != null) {
                        m272z = _Arrays.m272z(new String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, str3);
                    }
                }
                z = m272z;
            }
        } else if (i == 27 && (str = Build.DEVICE) != null) {
            m272z = _Arrays.m272z(new String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8"}, str);
            z = m272z;
        }
        f28482a = z;
    }

    /* renamed from: a */
    public static final AbstractC11103m m6161a(InterfaceC11108q interfaceC11108q) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || f28482a) {
            return new C11105o(false);
        }
        if (i != 26 && i != 27) {
            return new C11105o(true);
        }
        return new C11106p(interfaceC11108q);
    }
}
