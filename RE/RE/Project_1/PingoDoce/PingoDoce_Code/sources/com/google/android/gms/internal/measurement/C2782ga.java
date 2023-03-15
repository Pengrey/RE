package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ga */
/* loaded from: classes.dex */
public final class C2782ga extends C2894na {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2782ga(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.measurement.C2894na
    /* renamed from: b */
    public final void mo32422b() {
        if (!m32413n()) {
            for (int i = 0; i < m32421d(); i++) {
                Map.Entry m32416k = m32416k(i);
                if (((InterfaceC2796h8) m32416k.getKey()).m32600a()) {
                    m32416k.setValue(Collections.unmodifiableList((List) m32416k.getValue()));
                }
            }
            for (Map.Entry entry : m32420e()) {
                if (((InterfaceC2796h8) entry.getKey()).m32600a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo32422b();
    }
}
