package p374u1;

import p181jd.Intrinsics;
import p286p1.AnnotatedString;

/* renamed from: u1.a */
/* loaded from: classes.dex */
public final class EditCommand implements InterfaceC10786d {

    /* renamed from: a */
    private final AnnotatedString f27889a;

    /* renamed from: b */
    private final int f27890b;

    public EditCommand(AnnotatedString annotatedString, int i) {
        Intrinsics.isThisObjectNull(annotatedString, "annotatedString");
        this.f27889a = annotatedString;
        this.f27890b = i;
    }

    /* renamed from: a */
    public final String m7082a() {
        return this.f27889a.m15771f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EditCommand) {
            EditCommand editCommand = (EditCommand) obj;
            return Intrinsics.equals(m7082a(), editCommand.m7082a()) && this.f27890b == editCommand.f27890b;
        }
        return false;
    }

    public int hashCode() {
        return (m7082a().hashCode() * 31) + this.f27890b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + m7082a() + "', newCursorPosition=" + this.f27890b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditCommand(String str, int i) {
        this(new AnnotatedString(str, null, null, 6, null), i);
        Intrinsics.isThisObjectNull(str, "text");
    }
}
