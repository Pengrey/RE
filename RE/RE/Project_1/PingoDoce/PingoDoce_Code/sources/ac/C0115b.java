package ac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p488zb.C13744a;

/* renamed from: ac.b */
/* loaded from: classes2.dex */
final class C0115b {

    /* renamed from: a */
    private final Map<Integer, Integer> f269a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] m41884a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f269a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C13744a.m518b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m41883b(int i) {
        Integer num = this.f269a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f269a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
