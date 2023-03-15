package p305q3;

import android.graphics.drawable.Drawable;
import p181jd.Intrinsics;

/* renamed from: q3.d */
/* loaded from: classes.dex */
public final class C9626d extends AbstractC9632h {

    /* renamed from: a */
    private final Drawable f25330a;

    /* renamed from: b */
    private final C9629g f25331b;

    /* renamed from: c */
    private final Throwable f25332c;

    public C9626d(Drawable drawable, C9629g c9629g, Throwable th2) {
        super(null);
        this.f25330a = drawable;
        this.f25331b = c9629g;
        this.f25332c = th2;
    }

    /* renamed from: a */
    public Drawable mo10332a() {
        return this.f25330a;
    }

    /* renamed from: b */
    public C9629g mo10331b() {
        return this.f25331b;
    }

    /* renamed from: c */
    public final Throwable m10403c() {
        return this.f25332c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9626d) {
            C9626d c9626d = (C9626d) obj;
            if (Intrinsics.equals(mo10332a(), c9626d.mo10332a()) && Intrinsics.equals(mo10331b(), c9626d.mo10331b()) && Intrinsics.equals(this.f25332c, c9626d.f25332c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable mo10332a = mo10332a();
        return ((((mo10332a != null ? mo10332a.hashCode() : 0) * 31) + mo10331b().hashCode()) * 31) + this.f25332c.hashCode();
    }
}
