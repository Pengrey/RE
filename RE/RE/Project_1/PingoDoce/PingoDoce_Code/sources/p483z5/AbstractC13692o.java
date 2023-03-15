package p483z5;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;
import p483z5.C13680i;

@AutoValue
/* renamed from: z5.o */
/* loaded from: classes.dex */
public abstract class AbstractC13692o {

    /* compiled from: NetworkConnectionInfo.java */
    @AutoValue.Builder
    /* renamed from: z5.o$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13693a {
        /* renamed from: a */
        public abstract AbstractC13692o mo583a();

        /* renamed from: b */
        public abstract AbstractC13693a mo582b(EnumC13694b enumC13694b);

        /* renamed from: c */
        public abstract AbstractC13693a mo581c(EnumC13695c enumC13695c);
    }

    /* compiled from: NetworkConnectionInfo.java */
    /* renamed from: z5.o$b */
    /* loaded from: classes.dex */
    public enum EnumC13694b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final SparseArray<EnumC13694b> valueMap;
        private final int value;

        static {
            EnumC13694b enumC13694b = UNKNOWN_MOBILE_SUBTYPE;
            EnumC13694b enumC13694b2 = GPRS;
            EnumC13694b enumC13694b3 = EDGE;
            EnumC13694b enumC13694b4 = UMTS;
            EnumC13694b enumC13694b5 = CDMA;
            EnumC13694b enumC13694b6 = EVDO_0;
            EnumC13694b enumC13694b7 = EVDO_A;
            EnumC13694b enumC13694b8 = RTT;
            EnumC13694b enumC13694b9 = HSDPA;
            EnumC13694b enumC13694b10 = HSUPA;
            EnumC13694b enumC13694b11 = HSPA;
            EnumC13694b enumC13694b12 = IDEN;
            EnumC13694b enumC13694b13 = EVDO_B;
            EnumC13694b enumC13694b14 = LTE;
            EnumC13694b enumC13694b15 = EHRPD;
            EnumC13694b enumC13694b16 = HSPAP;
            EnumC13694b enumC13694b17 = GSM;
            EnumC13694b enumC13694b18 = TD_SCDMA;
            EnumC13694b enumC13694b19 = IWLAN;
            EnumC13694b enumC13694b20 = LTE_CA;
            SparseArray<EnumC13694b> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, enumC13694b);
            sparseArray.put(1, enumC13694b2);
            sparseArray.put(2, enumC13694b3);
            sparseArray.put(3, enumC13694b4);
            sparseArray.put(4, enumC13694b5);
            sparseArray.put(5, enumC13694b6);
            sparseArray.put(6, enumC13694b7);
            sparseArray.put(7, enumC13694b8);
            sparseArray.put(8, enumC13694b9);
            sparseArray.put(9, enumC13694b10);
            sparseArray.put(10, enumC13694b11);
            sparseArray.put(11, enumC13694b12);
            sparseArray.put(12, enumC13694b13);
            sparseArray.put(13, enumC13694b14);
            sparseArray.put(14, enumC13694b15);
            sparseArray.put(15, enumC13694b16);
            sparseArray.put(16, enumC13694b17);
            sparseArray.put(17, enumC13694b18);
            sparseArray.put(18, enumC13694b19);
            sparseArray.put(19, enumC13694b20);
        }

        EnumC13694b(int i) {
            this.value = i;
        }

        public static EnumC13694b forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* compiled from: NetworkConnectionInfo.java */
    /* renamed from: z5.o$c */
    /* loaded from: classes.dex */
    public enum EnumC13695c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        private static final SparseArray<EnumC13695c> valueMap;
        private final int value;

        static {
            EnumC13695c enumC13695c = MOBILE;
            EnumC13695c enumC13695c2 = WIFI;
            EnumC13695c enumC13695c3 = MOBILE_MMS;
            EnumC13695c enumC13695c4 = MOBILE_SUPL;
            EnumC13695c enumC13695c5 = MOBILE_DUN;
            EnumC13695c enumC13695c6 = MOBILE_HIPRI;
            EnumC13695c enumC13695c7 = WIMAX;
            EnumC13695c enumC13695c8 = BLUETOOTH;
            EnumC13695c enumC13695c9 = DUMMY;
            EnumC13695c enumC13695c10 = ETHERNET;
            EnumC13695c enumC13695c11 = MOBILE_FOTA;
            EnumC13695c enumC13695c12 = MOBILE_IMS;
            EnumC13695c enumC13695c13 = MOBILE_CBS;
            EnumC13695c enumC13695c14 = WIFI_P2P;
            EnumC13695c enumC13695c15 = MOBILE_IA;
            EnumC13695c enumC13695c16 = MOBILE_EMERGENCY;
            EnumC13695c enumC13695c17 = PROXY;
            EnumC13695c enumC13695c18 = VPN;
            EnumC13695c enumC13695c19 = NONE;
            SparseArray<EnumC13695c> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, enumC13695c);
            sparseArray.put(1, enumC13695c2);
            sparseArray.put(2, enumC13695c3);
            sparseArray.put(3, enumC13695c4);
            sparseArray.put(4, enumC13695c5);
            sparseArray.put(5, enumC13695c6);
            sparseArray.put(6, enumC13695c7);
            sparseArray.put(7, enumC13695c8);
            sparseArray.put(8, enumC13695c9);
            sparseArray.put(9, enumC13695c10);
            sparseArray.put(10, enumC13695c11);
            sparseArray.put(11, enumC13695c12);
            sparseArray.put(12, enumC13695c13);
            sparseArray.put(13, enumC13695c14);
            sparseArray.put(14, enumC13695c15);
            sparseArray.put(15, enumC13695c16);
            sparseArray.put(16, enumC13695c17);
            sparseArray.put(17, enumC13695c18);
            sparseArray.put(-1, enumC13695c19);
        }

        EnumC13695c(int i) {
            this.value = i;
        }

        public static EnumC13695c forNumber(int i) {
            return valueMap.get(i);
        }

        public int getValue() {
            return this.value;
        }
    }

    /* renamed from: a */
    public static AbstractC13693a m586a() {
        return new C13680i.C13682b();
    }

    /* renamed from: b */
    public abstract EnumC13694b mo585b();

    /* renamed from: c */
    public abstract EnumC13695c mo584c();
}
