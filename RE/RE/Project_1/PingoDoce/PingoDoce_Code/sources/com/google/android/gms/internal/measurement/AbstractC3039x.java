package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes.dex */
public abstract class AbstractC3039x {

    /* renamed from: a */
    final List f8079a = new ArrayList();

    /* renamed from: a */
    public abstract InterfaceC2931q mo31735a(String str, C2952r4 c2952r4, List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final InterfaceC2931q m31854b(String str) {
        if (this.f8079a.contains(C2969s5.m32123e(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
