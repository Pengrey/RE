package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* loaded from: classes.dex */
public final class C2852l0 extends AbstractC3039x {
    @Override // com.google.android.gms.internal.measurement.AbstractC3039x
    /* renamed from: a */
    public final InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list) {
        if (str != null && !str.isEmpty() && c2952r4.m32156h(str)) {
            InterfaceC2931q m32160d = c2952r4.m32160d(str);
            if (m32160d instanceof AbstractC2819j) {
                return ((AbstractC2819j) m32160d).mo32094a(c2952r4, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
