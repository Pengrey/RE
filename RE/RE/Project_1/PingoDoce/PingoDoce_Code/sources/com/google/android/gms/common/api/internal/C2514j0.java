package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import p484z6.C13701c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.j0 */
/* loaded from: classes.dex */
public final class C2514j0 {

    /* renamed from: a */
    private final C2485b<?> f7276a;

    /* renamed from: b */
    private final Feature f7277b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2514j0(C2485b c2485b, Feature feature, C2511i0 c2511i0) {
        this.f7276a = c2485b;
        this.f7277b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2514j0)) {
            C2514j0 c2514j0 = (C2514j0) obj;
            if (C13701c.m575a(this.f7276a, c2514j0.f7276a) && C13701c.m575a(this.f7277b, c2514j0.f7277b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C13701c.m574b(this.f7276a, this.f7277b);
    }

    public final String toString() {
        return C13701c.m573c(this).m572a("key", this.f7276a).m572a("feature", this.f7277b).toString();
    }
}
