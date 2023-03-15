package p286p1;

import p181jd.Intrinsics;

/* renamed from: p1.b0 */
/* loaded from: classes.dex */
public final class TtsAnnotation extends AbstractC8338a0 {

    /* renamed from: a */
    private final String f21590a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsAnnotation(String str) {
        super(null);
        Intrinsics.isThisObjectNull(str, "verbatim");
        this.f21590a = str;
    }

    /* renamed from: a */
    public final String m15752a() {
        return this.f21590a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TtsAnnotation) && Intrinsics.equals(this.f21590a, ((TtsAnnotation) obj).f21590a);
    }

    public int hashCode() {
        return this.f21590a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f21590a + ')';
    }
}
