package sd;

import p181jd.Intrinsics;
import p297pd.C8611f;

/* renamed from: sd.f */
/* loaded from: classes2.dex */
public final class Regex {

    /* renamed from: a */
    private final String f26485a;

    /* renamed from: b */
    private final C8611f f26486b;

    public Regex(String str, C8611f c8611f) {
        Intrinsics.isThisObjectNull(str, "value");
        Intrinsics.isThisObjectNull(c8611f, "range");
        this.f26485a = str;
        this.f26486b = c8611f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Regex) {
            Regex regex = (Regex) obj;
            return Intrinsics.equals(this.f26485a, regex.f26485a) && Intrinsics.equals(this.f26486b, regex.f26486b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f26485a.hashCode() * 31) + this.f26486b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f26485a + ", range=" + this.f26486b + ')';
    }
}
