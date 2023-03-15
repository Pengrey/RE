package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.v0 */
/* loaded from: classes.dex */
public final class C3909v0 {

    /* renamed from: a */
    private final Map<String, Double> f11191a = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized double m28624a(String str, C3870l1 c3870l1) {
        double d;
        d = (((C3881o0) c3870l1).f11077g + 1.0d) / ((C3881o0) c3870l1).f11078h;
        this.f11191a.put(str, Double.valueOf(d));
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void m28623b(String str) {
        this.f11191a.put(str, Double.valueOf(0.0d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized double m28622c(String str) {
        Double d = this.f11191a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
