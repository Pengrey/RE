package p297pd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pd.a */
/* loaded from: classes2.dex */
public final class C8605a implements InterfaceC8606b<Float> {

    /* renamed from: w */
    private final float f22219w;

    /* renamed from: x */
    private final float f22220x;

    public C8605a(float f, float f2) {
        this.f22219w = f;
        this.f22220x = f2;
    }

    @Override // p297pd.InterfaceC8607c
    /* renamed from: a */
    public Float mo42222b() {
        return Float.valueOf(this.f22220x);
    }

    @Override // p297pd.InterfaceC8607c
    /* renamed from: c */
    public Float mo42223getStart() {
        return Float.valueOf(this.f22219w);
    }

    /* renamed from: d */
    public boolean m15036d() {
        return this.f22219w > this.f22220x;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8605a) {
            if (m15036d() && ((C8605a) obj).m15036d()) {
                return true;
            }
            C8605a c8605a = (C8605a) obj;
            if (this.f22219w == c8605a.f22219w) {
                if (this.f22220x == c8605a.f22220x) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (m15036d()) {
            return -1;
        }
        return (Float.valueOf(this.f22219w).hashCode() * 31) + Float.valueOf(this.f22220x).hashCode();
    }

    public String toString() {
        return this.f22219w + ".." + this.f22220x;
    }
}
