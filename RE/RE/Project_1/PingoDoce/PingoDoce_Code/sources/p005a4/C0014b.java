package p005a4;

/* renamed from: a4.b */
/* loaded from: classes.dex */
public class C0014b {

    /* renamed from: a */
    public final String f55a;

    /* renamed from: b */
    public final String f56b;

    /* renamed from: c */
    public final float f57c;

    /* renamed from: d */
    public final EnumC0015a f58d;

    /* renamed from: e */
    public final int f59e;

    /* renamed from: f */
    public final float f60f;

    /* renamed from: g */
    public final float f61g;

    /* renamed from: h */
    public final int f62h;

    /* renamed from: i */
    public final int f63i;

    /* renamed from: j */
    public final float f64j;

    /* renamed from: k */
    public final boolean f65k;

    /* compiled from: DocumentData.java */
    /* renamed from: a4.b$a */
    /* loaded from: classes.dex */
    public enum EnumC0015a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C0014b(String str, String str2, float f, EnumC0015a enumC0015a, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f55a = str;
        this.f56b = str2;
        this.f57c = f;
        this.f58d = enumC0015a;
        this.f59e = i;
        this.f60f = f2;
        this.f61g = f3;
        this.f62h = i2;
        this.f63i = i3;
        this.f64j = f4;
        this.f65k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f55a.hashCode() * 31) + this.f56b.hashCode()) * 31) + this.f57c)) * 31) + this.f58d.ordinal()) * 31) + this.f59e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f60f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f62h;
    }
}
