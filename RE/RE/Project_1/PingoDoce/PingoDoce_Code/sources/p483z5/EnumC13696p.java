package p483z5;

import android.util.SparseArray;

/* renamed from: z5.p */
/* loaded from: classes.dex */
public enum EnumC13696p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<EnumC13696p> valueMap;
    private final int value;

    static {
        EnumC13696p enumC13696p = DEFAULT;
        EnumC13696p enumC13696p2 = UNMETERED_ONLY;
        EnumC13696p enumC13696p3 = UNMETERED_OR_DAILY;
        EnumC13696p enumC13696p4 = FAST_IF_RADIO_AWAKE;
        EnumC13696p enumC13696p5 = NEVER;
        EnumC13696p enumC13696p6 = UNRECOGNIZED;
        SparseArray<EnumC13696p> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, enumC13696p);
        sparseArray.put(1, enumC13696p2);
        sparseArray.put(2, enumC13696p3);
        sparseArray.put(3, enumC13696p4);
        sparseArray.put(4, enumC13696p5);
        sparseArray.put(-1, enumC13696p6);
    }

    EnumC13696p(int i) {
        this.value = i;
    }

    public static EnumC13696p forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int getNumber() {
        return this.value;
    }
}
