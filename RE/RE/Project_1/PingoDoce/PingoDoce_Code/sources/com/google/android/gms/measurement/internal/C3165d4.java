package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2960rc;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.d4 */
/* loaded from: classes.dex */
final class C3165d4 implements InterfaceC2960rc {

    /* renamed from: a */
    final /* synthetic */ String f8384a;

    /* renamed from: b */
    final /* synthetic */ C3176e4 f8385b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3165d4(C3176e4 c3176e4, String str) {
        this.f8385b = c3176e4;
        this.f8384a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2960rc
    /* renamed from: n */
    public final String mo31408n(String str) {
        Map map;
        map = this.f8385b.f8402d;
        Map map2 = (Map) map.get(this.f8384a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
