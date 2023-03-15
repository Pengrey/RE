package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2680a4;
import com.google.android.gms.internal.measurement.C2696b4;
import com.google.android.gms.internal.measurement.C2712c4;
import com.google.android.gms.internal.measurement.C2728d4;
import com.google.android.gms.internal.measurement.C2976sc;
import com.google.android.gms.internal.measurement.C2999u4;
import com.google.android.gms.internal.measurement.C3014v4;
import com.google.android.gms.internal.measurement.C3029w4;
import com.google.android.gms.internal.measurement.C3044x4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p009a8.C0089v;
import p301q.C9545a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.n9 */
/* loaded from: classes.dex */
public final class C3280n9 {

    /* renamed from: a */
    private String f8712a;

    /* renamed from: b */
    private boolean f8713b;

    /* renamed from: c */
    private C3014v4 f8714c;

    /* renamed from: d */
    private BitSet f8715d;

    /* renamed from: e */
    private BitSet f8716e;

    /* renamed from: f */
    private Map f8717f;

    /* renamed from: g */
    private Map f8718g;

    /* renamed from: h */
    final /* synthetic */ C3335s9 f8719h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3280n9(C3335s9 c3335s9, String str, C0089v c0089v) {
        this.f8719h = c3335s9;
        this.f8712a = str;
        this.f8713b = true;
        this.f8715d = new BitSet();
        this.f8716e = new BitSet();
        this.f8717f = new C9545a();
        this.f8718g = new C9545a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m31060b(C3280n9 c3280n9) {
        return c3280n9.f8715d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2696b4 m31061a(int i) {
        ArrayList arrayList;
        List list;
        C2680a4 m32879B = C2696b4.m32879B();
        m32879B.m32928r(i);
        m32879B.m32926u(this.f8713b);
        C3014v4 c3014v4 = this.f8714c;
        if (c3014v4 != null) {
            m32879B.m32925w(c3014v4);
        }
        C2999u4 m31978F = C3014v4.m31978F();
        m31978F.m32011s(C3159c9.m31431H(this.f8715d));
        m31978F.m32009w(C3159c9.m31431H(this.f8716e));
        Map map = this.f8717f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f8717f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f8717f.get(Integer.valueOf(intValue));
                if (l != null) {
                    C2712c4 m32791C = C2728d4.m32791C();
                    m32791C.m32814s(intValue);
                    m32791C.m32815r(l.longValue());
                    arrayList2.add((C2728d4) m32791C.m32426p());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m31978F.m32012r(arrayList);
        }
        Map map2 = this.f8718g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f8718g.keySet()) {
                C3029w4 m31838D = C3044x4.m31838D();
                m31838D.m31908s(num2.intValue());
                List list2 = (List) this.f8718g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m31838D.m31909r(list2);
                }
                arrayList3.add((C3044x4) m31838D.m32426p());
            }
            list = arrayList3;
        }
        m31978F.m32010u(list);
        m32879B.m32927s(m31978F);
        return (C2696b4) m32879B.m32426p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31059c(AbstractC3313q9 abstractC3313q9) {
        int mo31023a = abstractC3313q9.mo31023a();
        Boolean bool = abstractC3313q9.f8823c;
        if (bool != null) {
            this.f8716e.set(mo31023a, bool.booleanValue());
        }
        Boolean bool2 = abstractC3313q9.f8824d;
        if (bool2 != null) {
            this.f8715d.set(mo31023a, bool2.booleanValue());
        }
        if (abstractC3313q9.f8825e != null) {
            Map map = this.f8717f;
            Integer valueOf = Integer.valueOf(mo31023a);
            Long l = (Long) map.get(valueOf);
            long longValue = abstractC3313q9.f8825e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f8717f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC3313q9.f8826f != null) {
            Map map2 = this.f8718g;
            Integer valueOf2 = Integer.valueOf(mo31023a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f8718g.put(valueOf2, list);
            }
            if (abstractC3313q9.mo31021c()) {
                list.clear();
            }
            C2976sc.m32098b();
            C3182f m31094z = this.f8719h.f8410a.m31094z();
            String str = this.f8712a;
            C3328s2 c3328s2 = C3339t2.f8907Y;
            if (m31094z.m31373B(str, c3328s2) && abstractC3313q9.mo31022b()) {
                list.clear();
            }
            C2976sc.m32098b();
            if (this.f8719h.f8410a.m31094z().m31373B(this.f8712a, c3328s2)) {
                Long valueOf3 = Long.valueOf(abstractC3313q9.f8826f.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(abstractC3313q9.f8826f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3280n9(C3335s9 c3335s9, String str, C3014v4 c3014v4, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C0089v c0089v) {
        this.f8719h = c3335s9;
        this.f8712a = str;
        this.f8715d = bitSet;
        this.f8716e = bitSet2;
        this.f8717f = map;
        this.f8718g = new C9545a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f8718g.put(num, arrayList);
        }
        this.f8713b = false;
        this.f8714c = c3014v4;
    }
}
