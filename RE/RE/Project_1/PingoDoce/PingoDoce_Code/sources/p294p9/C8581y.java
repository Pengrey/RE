package p294p9;

import java.util.Objects;
import p294p9.AbstractC8520c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p9.y */
/* loaded from: classes.dex */
public final class C8581y extends AbstractC8520c0.AbstractC8522b {

    /* renamed from: a */
    private final int f22174a;

    /* renamed from: b */
    private final String f22175b;

    /* renamed from: c */
    private final int f22176c;

    /* renamed from: d */
    private final long f22177d;

    /* renamed from: e */
    private final long f22178e;

    /* renamed from: f */
    private final boolean f22179f;

    /* renamed from: g */
    private final int f22180g;

    /* renamed from: h */
    private final String f22181h;

    /* renamed from: i */
    private final String f22182i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8581y(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f22174a = i;
        Objects.requireNonNull(str, "Null model");
        this.f22175b = str;
        this.f22176c = i2;
        this.f22177d = j;
        this.f22178e = j2;
        this.f22179f = z;
        this.f22180g = i3;
        Objects.requireNonNull(str2, "Null manufacturer");
        this.f22181h = str2;
        Objects.requireNonNull(str3, "Null modelClass");
        this.f22182i = str3;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: a */
    public int mo15104a() {
        return this.f22174a;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: b */
    public int mo15103b() {
        return this.f22176c;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: d */
    public long mo15102d() {
        return this.f22178e;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: e */
    public boolean mo15101e() {
        return this.f22179f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8520c0.AbstractC8522b) {
            AbstractC8520c0.AbstractC8522b abstractC8522b = (AbstractC8520c0.AbstractC8522b) obj;
            return this.f22174a == abstractC8522b.mo15104a() && this.f22175b.equals(abstractC8522b.mo15099g()) && this.f22176c == abstractC8522b.mo15103b() && this.f22177d == abstractC8522b.mo15096j() && this.f22178e == abstractC8522b.mo15102d() && this.f22179f == abstractC8522b.mo15101e() && this.f22180g == abstractC8522b.mo15097i() && this.f22181h.equals(abstractC8522b.mo15100f()) && this.f22182i.equals(abstractC8522b.mo15098h());
        }
        return false;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: f */
    public String mo15100f() {
        return this.f22181h;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: g */
    public String mo15099g() {
        return this.f22175b;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: h */
    public String mo15098h() {
        return this.f22182i;
    }

    public int hashCode() {
        long j = this.f22177d;
        long j2 = this.f22178e;
        return ((((((((((((((((this.f22174a ^ 1000003) * 1000003) ^ this.f22175b.hashCode()) * 1000003) ^ this.f22176c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f22179f ? 1231 : 1237)) * 1000003) ^ this.f22180g) * 1000003) ^ this.f22181h.hashCode()) * 1000003) ^ this.f22182i.hashCode();
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: i */
    public int mo15097i() {
        return this.f22180g;
    }

    @Override // p294p9.AbstractC8520c0.AbstractC8522b
    /* renamed from: j */
    public long mo15096j() {
        return this.f22177d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f22174a + ", model=" + this.f22175b + ", availableProcessors=" + this.f22176c + ", totalRam=" + this.f22177d + ", diskSpace=" + this.f22178e + ", isEmulator=" + this.f22179f + ", state=" + this.f22180g + ", manufacturer=" + this.f22181h + ", modelClass=" + this.f22182i + "}";
    }
}
