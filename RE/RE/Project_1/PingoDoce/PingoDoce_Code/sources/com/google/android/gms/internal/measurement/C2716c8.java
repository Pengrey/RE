package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c8 */
/* loaded from: classes.dex */
final class C2716c8 {

    /* renamed from: a */
    private final Object f7692a;

    /* renamed from: b */
    private final int f7693b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2716c8(Object obj, int i) {
        this.f7692a = obj;
        this.f7693b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2716c8) {
            C2716c8 c2716c8 = (C2716c8) obj;
            return this.f7692a == c2716c8.f7692a && this.f7693b == c2716c8.f7693b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f7692a) * 65535) + this.f7693b;
    }
}
