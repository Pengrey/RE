package p007a6;

import java.util.Arrays;
import java.util.Objects;
import p461y5.C13111b;

/* renamed from: a6.h */
/* loaded from: classes.dex */
public final class C0045h {

    /* renamed from: a */
    private final C13111b f153a;

    /* renamed from: b */
    private final byte[] f154b;

    public C0045h(C13111b c13111b, byte[] bArr) {
        Objects.requireNonNull(c13111b, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f153a = c13111b;
        this.f154b = bArr;
    }

    /* renamed from: a */
    public byte[] m42090a() {
        return this.f154b;
    }

    /* renamed from: b */
    public C13111b m42089b() {
        return this.f153a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0045h) {
            C0045h c0045h = (C0045h) obj;
            if (this.f153a.equals(c0045h.f153a)) {
                return Arrays.equals(this.f154b, c0045h.f154b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f153a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f154b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f153a + ", bytes=[...]}";
    }
}
