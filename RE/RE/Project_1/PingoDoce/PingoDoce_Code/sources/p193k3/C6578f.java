package p193k3;

import android.graphics.drawable.Drawable;
import p129h3.EnumC5826d;
import p181jd.Intrinsics;

/* renamed from: k3.f */
/* loaded from: classes.dex */
public final class C6578f extends AbstractC6579g {

    /* renamed from: a */
    private final Drawable f17812a;

    /* renamed from: b */
    private final boolean f17813b;

    /* renamed from: c */
    private final EnumC5826d f17814c;

    public C6578f(Drawable drawable, boolean z, EnumC5826d enumC5826d) {
        super(null);
        this.f17812a = drawable;
        this.f17813b = z;
        this.f17814c = enumC5826d;
    }

    /* renamed from: a */
    public final EnumC5826d m20551a() {
        return this.f17814c;
    }

    /* renamed from: b */
    public final Drawable m20550b() {
        return this.f17812a;
    }

    /* renamed from: c */
    public final boolean m20549c() {
        return this.f17813b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6578f) {
            C6578f c6578f = (C6578f) obj;
            if (Intrinsics.equals(this.f17812a, c6578f.f17812a) && this.f17813b == c6578f.f17813b && this.f17814c == c6578f.f17814c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f17812a.hashCode() * 31) + Boolean.hashCode(this.f17813b)) * 31) + this.f17814c.hashCode();
    }
}
