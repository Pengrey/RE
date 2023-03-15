package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.review.a */
/* loaded from: classes.dex */
public final class C3952a extends ReviewInfo {

    /* renamed from: w */
    private final PendingIntent f11236w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3952a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f11236w = pendingIntent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: a */
    public final PendingIntent mo28526a() {
        return this.f11236w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.f11236w.equals(((ReviewInfo) obj).mo28526a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11236w.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11236w);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
        sb2.append("ReviewInfo{pendingIntent=");
        sb2.append(valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
