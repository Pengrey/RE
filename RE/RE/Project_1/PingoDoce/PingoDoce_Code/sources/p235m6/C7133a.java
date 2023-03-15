package p235m6;

import android.util.SparseArray;
import java.util.HashMap;
import p461y5.EnumC13113d;

/* renamed from: m6.a */
/* loaded from: classes.dex */
public final class C7133a {

    /* renamed from: a */
    private static SparseArray<EnumC13113d> f18944a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC13113d, Integer> f18945b;

    static {
        HashMap<EnumC13113d, Integer> hashMap = new HashMap<>();
        f18945b = hashMap;
        hashMap.put(EnumC13113d.DEFAULT, 0);
        f18945b.put(EnumC13113d.VERY_LOW, 1);
        f18945b.put(EnumC13113d.HIGHEST, 2);
        for (EnumC13113d enumC13113d : f18945b.keySet()) {
            f18944a.append(f18945b.get(enumC13113d).intValue(), enumC13113d);
        }
    }

    /* renamed from: a */
    public static int m19105a(EnumC13113d enumC13113d) {
        Integer num = f18945b.get(enumC13113d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC13113d);
    }

    /* renamed from: b */
    public static EnumC13113d m19104b(int i) {
        EnumC13113d enumC13113d = f18944a.get(i);
        if (enumC13113d != null) {
            return enumC13113d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
