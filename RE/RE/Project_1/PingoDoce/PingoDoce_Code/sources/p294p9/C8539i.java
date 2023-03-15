package p294p9;

import p294p9.AbstractC8472a0;

/* renamed from: p9.i */
/* loaded from: classes.dex */
final class C8539i extends AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b {

    /* renamed from: a */
    private final String f22052a;

    @Override // p294p9.AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b
    /* renamed from: a */
    public String mo15241a() {
        return this.f22052a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b) {
            return this.f22052a.equals(((AbstractC8472a0.AbstractC8482e.AbstractC8483a.AbstractC8485b) obj).mo15241a());
        }
        return false;
    }

    public int hashCode() {
        return this.f22052a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f22052a + "}";
    }
}
