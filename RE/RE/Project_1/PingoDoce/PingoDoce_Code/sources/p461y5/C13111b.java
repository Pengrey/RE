package p461y5;

import java.util.Objects;

/* renamed from: y5.b */
/* loaded from: classes.dex */
public final class C13111b {

    /* renamed from: a */
    private final String f34087a;

    private C13111b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f34087a = str;
    }

    /* renamed from: b */
    public static C13111b m1584b(String str) {
        return new C13111b(str);
    }

    /* renamed from: a */
    public String m1585a() {
        return this.f34087a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13111b) {
            return this.f34087a.equals(((C13111b) obj).f34087a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34087a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f34087a + "\"}";
    }
}
