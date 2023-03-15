package p374u1;

import p181jd.Intrinsics;
import p286p1.AnnotatedString;

/* compiled from: EditCommand.kt */
/* renamed from: u1.q */
/* loaded from: classes.dex */
public final class C10803q implements InterfaceC10786d {

    /* renamed from: a */
    private final AnnotatedString f27937a;

    /* renamed from: b */
    private final int f27938b;

    public C10803q(AnnotatedString annotatedString, int i) {
        Intrinsics.isThisObjectNull(annotatedString, "annotatedString");
        this.f27937a = annotatedString;
        this.f27938b = i;
    }

    /* renamed from: a */
    public final String m7004a() {
        return this.f27937a.m15771f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10803q) {
            C10803q c10803q = (C10803q) obj;
            return Intrinsics.equals(m7004a(), c10803q.m7004a()) && this.f27938b == c10803q.f27938b;
        }
        return false;
    }

    public int hashCode() {
        return (m7004a().hashCode() * 31) + this.f27938b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + m7004a() + "', newCursorPosition=" + this.f27938b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10803q(String str, int i) {
        this(new AnnotatedString(str, null, null, 6, null), i);
        Intrinsics.isThisObjectNull(str, "text");
    }
}
