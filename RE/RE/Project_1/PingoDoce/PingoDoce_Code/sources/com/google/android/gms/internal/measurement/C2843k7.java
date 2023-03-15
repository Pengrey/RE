package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* loaded from: classes.dex */
final class C2843k7 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC2955r7 abstractC2955r7 = (AbstractC2955r7) obj;
        AbstractC2955r7 abstractC2955r72 = (AbstractC2955r7) obj2;
        C2811i7 c2811i7 = new C2811i7(abstractC2955r7);
        C2811i7 c2811i72 = new C2811i7(abstractC2955r72);
        while (c2811i7.hasNext() && c2811i72.hasNext()) {
            int m32533a = C2827j7.m32533a(c2811i7.zza() & 255, c2811i72.zza() & 255);
            if (m32533a != 0) {
                return m32533a;
            }
        }
        return C2827j7.m32533a(abstractC2955r7.mo32153g(), abstractC2955r72.mo32153g());
    }
}
