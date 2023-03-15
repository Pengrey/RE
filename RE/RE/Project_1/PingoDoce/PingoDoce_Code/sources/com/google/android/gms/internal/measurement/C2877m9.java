package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.m9 */
/* loaded from: classes.dex */
final class C2877m9 {
    /* renamed from: a */
    public static final int m32466a(int i, Object obj, Object obj2) {
        C2861l9 c2861l9 = (C2861l9) obj;
        C2845k9 c2845k9 = (C2845k9) obj2;
        if (c2861l9.isEmpty()) {
            return 0;
        }
        Iterator it = c2861l9.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    /* renamed from: b */
    public static final Object m32465b(Object obj, Object obj2) {
        C2861l9 c2861l9 = (C2861l9) obj;
        C2861l9 c2861l92 = (C2861l9) obj2;
        if (!c2861l92.isEmpty()) {
            if (!c2861l9.m32482j()) {
                c2861l9 = c2861l9.m32485d();
            }
            c2861l9.m32483f(c2861l92);
        }
        return c2861l9;
    }
}
