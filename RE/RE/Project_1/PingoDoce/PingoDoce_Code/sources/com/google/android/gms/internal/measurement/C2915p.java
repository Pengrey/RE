package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.p */
/* loaded from: classes.dex */
public final class C2915p extends AbstractC2819j {

    /* renamed from: A */
    protected C2952r4 f7915A;

    /* renamed from: y */
    protected final List f7916y;

    /* renamed from: z */
    protected final List f7917z;

    private C2915p(C2915p c2915p) {
        super(c2915p.f7794w);
        ArrayList arrayList = new ArrayList(c2915p.f7916y.size());
        this.f7916y = arrayList;
        arrayList.addAll(c2915p.f7916y);
        ArrayList arrayList2 = new ArrayList(c2915p.f7917z.size());
        this.f7917z = arrayList2;
        arrayList2.addAll(c2915p.f7917z);
        this.f7915A = c2915p.f7915A;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j
    /* renamed from: a */
    public final InterfaceC2931q mo32094a(C2952r4 c2952r4, List list) {
        C2952r4 m32163a = this.f7915A.m32163a();
        for (int i = 0; i < this.f7916y.size(); i++) {
            if (i < list.size()) {
                m32163a.m32159e((String) this.f7916y.get(i), c2952r4.m32162b((InterfaceC2931q) list.get(i)));
            } else {
                m32163a.m32159e((String) this.f7916y.get(i), InterfaceC2931q.f7930f);
            }
        }
        for (InterfaceC2931q interfaceC2931q : this.f7917z) {
            InterfaceC2931q m32162b = m32163a.m32162b(interfaceC2931q);
            if (m32162b instanceof C2947r) {
                m32162b = m32163a.m32162b(interfaceC2931q);
            }
            if (m32162b instanceof C2787h) {
                return ((C2787h) m32162b).m32607a();
            }
        }
        return InterfaceC2931q.f7930f;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2819j, com.google.android.gms.internal.measurement.InterfaceC2931q
    /* renamed from: b */
    public final InterfaceC2931q mo31993b() {
        return new C2915p(this);
    }

    public C2915p(String str, List list, List list2, C2952r4 c2952r4) {
        super(str);
        this.f7916y = new ArrayList();
        this.f7915A = c2952r4;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f7916y.add(((InterfaceC2931q) it.next()).mo31990g());
            }
        }
        this.f7917z = new ArrayList(list2);
    }
}
