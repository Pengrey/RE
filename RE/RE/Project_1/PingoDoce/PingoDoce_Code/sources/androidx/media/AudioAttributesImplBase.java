package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f4398a = 0;

    /* renamed from: b */
    int f4399b = 0;

    /* renamed from: c */
    int f4400c = 0;

    /* renamed from: d */
    int f4401d = -1;

    /* renamed from: a */
    public int m36916a() {
        return this.f4399b;
    }

    /* renamed from: b */
    public int m36915b() {
        int i = this.f4400c;
        int m36914c = m36914c();
        if (m36914c == 6) {
            i |= 4;
        } else if (m36914c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m36914c() {
        int i = this.f4401d;
        return i != -1 ? i : AudioAttributesCompat.m36918a(false, this.f4400c, this.f4398a);
    }

    /* renamed from: d */
    public int m36913d() {
        return this.f4398a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f4399b == audioAttributesImplBase.m36916a() && this.f4400c == audioAttributesImplBase.m36915b() && this.f4398a == audioAttributesImplBase.m36913d() && this.f4401d == audioAttributesImplBase.f4401d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4399b), Integer.valueOf(this.f4400c), Integer.valueOf(this.f4398a), Integer.valueOf(this.f4401d)});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4401d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4401d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.m36917b(this.f4398a));
        sb2.append(" content=");
        sb2.append(this.f4399b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4400c).toUpperCase());
        return sb2.toString();
    }
}
