package lc;

import p181jd.Intrinsics;

/* renamed from: lc.c */
/* loaded from: classes2.dex */
public final class C7033c {

    /* renamed from: a */
    private final char f18667a;

    /* renamed from: b */
    private final String f18668b;

    /* renamed from: c */
    private final boolean f18669c;

    /* renamed from: a */
    public final char m19539a() {
        return this.f18667a;
    }

    /* renamed from: b */
    public final String m19538b() {
        return this.f18668b;
    }

    /* renamed from: c */
    public final boolean m19537c() {
        return this.f18669c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7033c) {
                C7033c c7033c = (C7033c) obj;
                if ((this.f18667a == c7033c.f18667a) && Intrinsics.equals(this.f18668b, c7033c.f18668b)) {
                    if (this.f18669c == c7033c.f18669c) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.f18667a * 31;
        String str = this.f18668b;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f18669c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "Notation(character=" + this.f18667a + ", characterSet=" + this.f18668b + ", isOptional=" + this.f18669c + ")";
    }
}
