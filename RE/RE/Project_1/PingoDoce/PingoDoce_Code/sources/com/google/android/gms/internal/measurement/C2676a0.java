package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.a0 */
/* loaded from: classes.dex */
public final class C2676a0 extends AbstractC3039x {
    /* JADX INFO: Access modifiers changed from: protected */
    public C2676a0() {
        this.f8079a.add(EnumC2884n0.APPLY);
        this.f8079a.add(EnumC2884n0.BLOCK);
        this.f8079a.add(EnumC2884n0.BREAK);
        this.f8079a.add(EnumC2884n0.CASE);
        this.f8079a.add(EnumC2884n0.DEFAULT);
        this.f8079a.add(EnumC2884n0.CONTINUE);
        this.f8079a.add(EnumC2884n0.DEFINE_FUNCTION);
        this.f8079a.add(EnumC2884n0.FN);
        this.f8079a.add(EnumC2884n0.IF);
        this.f8079a.add(EnumC2884n0.QUOTE);
        this.f8079a.add(EnumC2884n0.RETURN);
        this.f8079a.add(EnumC2884n0.SWITCH);
        this.f8079a.add(EnumC2884n0.TERNARY);
    }

    /* renamed from: c */
    private static InterfaceC2931q m32930c(C2952r4 c2952r4, List list) {
        C2969s5.m32119i(EnumC2884n0.FN.name(), 2, list);
        InterfaceC2931q m32162b = c2952r4.m32162b((InterfaceC2931q) list.get(0));
        InterfaceC2931q m32162b2 = c2952r4.m32162b((InterfaceC2931q) list.get(1));
        if (m32162b2 instanceof C2755f) {
            List m32753B = ((C2755f) m32162b2).m32753B();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C2915p(m32162b.mo31990g(), m32753B, arrayList, c2952r4);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", m32162b2.getClass().getCanonicalName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
        if (r8.equals("continue") == false) goto L67;
     */
    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2931q mo31735a(java.lang.String r8, com.google.android.gms.internal.measurement.C2952r4 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2676a0.mo31735a(java.lang.String, com.google.android.gms.internal.measurement.r4, java.util.List):com.google.android.gms.internal.measurement.q");
    }
}
