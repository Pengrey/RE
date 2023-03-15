package com.github.razir.progressbutton;

import android.graphics.drawable.Drawable;
import p181jd.Intrinsics;

/* renamed from: com.github.razir.progressbutton.f */
/* loaded from: classes.dex */
public final class C2377f {

    /* renamed from: a */
    private Drawable f6938a;

    /* renamed from: b */
    private final Drawable.Callback f6939b;

    public C2377f(Drawable drawable, Drawable.Callback callback) {
        Intrinsics.m20926i(drawable, "drawable");
        Intrinsics.m20926i(callback, "callback");
        this.f6938a = drawable;
        this.f6939b = callback;
    }

    /* renamed from: a */
    public final Drawable m33747a() {
        return this.f6938a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2377f) {
                C2377f c2377f = (C2377f) obj;
                return Intrinsics.equals(this.f6938a, c2377f.f6938a) && Intrinsics.equals(this.f6939b, c2377f.f6939b);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Drawable drawable = this.f6938a;
        int hashCode = (drawable != null ? drawable.hashCode() : 0) * 31;
        Drawable.Callback callback = this.f6939b;
        return hashCode + (callback != null ? callback.hashCode() : 0);
    }

    public String toString() {
        return "DrawableViewData(drawable=" + this.f6938a + ", callback=" + this.f6939b + ")";
    }
}
