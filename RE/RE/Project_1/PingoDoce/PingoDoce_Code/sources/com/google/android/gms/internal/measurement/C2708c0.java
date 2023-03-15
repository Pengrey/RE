package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* loaded from: classes.dex */
public final class C2708c0 implements Comparator {

    /* renamed from: w */
    final /* synthetic */ AbstractC2819j f7680w;

    /* renamed from: x */
    final /* synthetic */ C2952r4 f7681x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2708c0(AbstractC2819j abstractC2819j, C2952r4 c2952r4) {
        this.f7680w = abstractC2819j;
        this.f7681x = c2952r4;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC2931q interfaceC2931q = (InterfaceC2931q) obj;
        InterfaceC2931q interfaceC2931q2 = (InterfaceC2931q) obj2;
        AbstractC2819j abstractC2819j = this.f7680w;
        C2952r4 c2952r4 = this.f7681x;
        if (interfaceC2931q instanceof C3009v) {
            return !(interfaceC2931q2 instanceof C3009v) ? 1 : 0;
        } else if (interfaceC2931q2 instanceof C3009v) {
            return -1;
        } else {
            if (abstractC2819j == null) {
                return interfaceC2931q.mo31990g().compareTo(interfaceC2931q2.mo31990g());
            }
            return (int) C2969s5.m32127a(abstractC2819j.mo32094a(c2952r4, Arrays.asList(interfaceC2931q, interfaceC2931q2)).mo31992c().doubleValue());
        }
    }
}
