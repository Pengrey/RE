package p006a5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p181jd.Intrinsics;

/* renamed from: a5.b */
/* loaded from: classes.dex */
public final class GateKeeperRuntimeCache {

    /* renamed from: a */
    private final ConcurrentHashMap f88a = new ConcurrentHashMap();

    /* renamed from: a */
    public final List m42102a(String str) {
        Intrinsics.isThisObjectNull(str, "appId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f88a.get(str);
        if (concurrentHashMap != null) {
            ArrayList arrayList = new ArrayList(concurrentHashMap.size());
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                arrayList.add((GateKeeper) entry.getValue());
            }
            return arrayList;
        }
        return null;
    }

    /* renamed from: b */
    public final void m42101b(String str, List list) {
        Intrinsics.isThisObjectNull(str, "appId");
        Intrinsics.isThisObjectNull(list, "gateKeeperList");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GateKeeper gateKeeper = (GateKeeper) it.next();
            concurrentHashMap.put(gateKeeper.m42104a(), gateKeeper);
        }
        this.f88a.put(str, concurrentHashMap);
    }
}
