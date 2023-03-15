package p305q3;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import p129h3.EnumC5826d;
import p181jd.Intrinsics;

/* renamed from: q3.n */
/* loaded from: classes.dex */
public final class C9641n extends AbstractC9632h {

    /* renamed from: a */
    private final Drawable f25441a;

    /* renamed from: b */
    private final C9629g f25442b;

    /* renamed from: c */
    private final EnumC5826d f25443c;

    /* renamed from: d */
    private final MemoryCache.Key f25444d;

    /* renamed from: e */
    private final String f25445e;

    /* renamed from: f */
    private final boolean f25446f;

    /* renamed from: g */
    private final boolean f25447g;

    public C9641n(Drawable drawable, C9629g c9629g, EnumC5826d enumC5826d, MemoryCache.Key key, String str, boolean z, boolean z2) {
        super(null);
        this.f25441a = drawable;
        this.f25442b = c9629g;
        this.f25443c = enumC5826d;
        this.f25444d = key;
        this.f25445e = str;
        this.f25446f = z;
        this.f25447g = z2;
    }

    /* renamed from: a */
    public Drawable mo10332a() {
        return this.f25441a;
    }

    /* renamed from: b */
    public C9629g mo10331b() {
        return this.f25442b;
    }

    /* renamed from: c */
    public final EnumC5826d m10301c() {
        return this.f25443c;
    }

    /* renamed from: d */
    public final boolean m10300d() {
        return this.f25447g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9641n) {
            C9641n c9641n = (C9641n) obj;
            if (Intrinsics.equals(mo10332a(), c9641n.mo10332a()) && Intrinsics.equals(mo10331b(), c9641n.mo10331b()) && this.f25443c == c9641n.f25443c && Intrinsics.equals(this.f25444d, c9641n.f25444d) && Intrinsics.equals(this.f25445e, c9641n.f25445e) && this.f25446f == c9641n.f25446f && this.f25447g == c9641n.f25447g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((mo10332a().hashCode() * 31) + mo10331b().hashCode()) * 31) + this.f25443c.hashCode()) * 31;
        MemoryCache.Key key = this.f25444d;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f25445e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f25446f)) * 31) + Boolean.hashCode(this.f25447g);
    }
}
