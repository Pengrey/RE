package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.internal.InterfaceC3930b;
import com.google.android.play.core.tasks.C3973l;
import p031b9.C1844a;
import p031b9.C1854k;
import p101f9.AbstractC5433d;

/* renamed from: com.google.android.play.core.review.j */
/* loaded from: classes.dex */
public final class C3961j {

    /* renamed from: c */
    private static final C1844a f11246c = new C1844a("ReviewService");

    /* renamed from: a */
    final C1854k<InterfaceC3930b> f11247a;

    /* renamed from: b */
    private final String f11248b;

    public C3961j(Context context) {
        this.f11248b = context.getPackageName();
        this.f11247a = new C1854k<>(context, f11246c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C3957f.f11240a);
    }

    /* renamed from: a */
    public final AbstractC5433d<ReviewInfo> m28519a() {
        f11246c.m35277f("requestInAppReview (%s)", this.f11248b);
        C3973l c3973l = new C3973l();
        this.f11247a.m35271c(new C3958g(this, c3973l, c3973l));
        return c3973l.m28502a();
    }
}
