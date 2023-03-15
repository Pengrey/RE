package p129h3;

import android.graphics.drawable.Drawable;
import p181jd.Intrinsics;

/* renamed from: h3.e */
/* loaded from: classes.dex */
public final class C5827e {

    /* renamed from: a */
    private final Drawable f16229a;

    /* renamed from: b */
    private final boolean f16230b;

    public C5827e(Drawable drawable, boolean z) {
        this.f16229a = drawable;
        this.f16230b = z;
    }

    /* renamed from: a */
    public final Drawable m22973a() {
        return this.f16229a;
    }

    /* renamed from: b */
    public final boolean m22972b() {
        return this.f16230b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5827e) {
            C5827e c5827e = (C5827e) obj;
            if (Intrinsics.equals(this.f16229a, c5827e.f16229a) && this.f16230b == c5827e.f16230b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f16229a.hashCode() * 31) + Boolean.hashCode(this.f16230b);
    }
}
