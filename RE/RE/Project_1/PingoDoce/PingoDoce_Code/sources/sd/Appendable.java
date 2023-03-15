package sd;

import id.InterfaceC6108l;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.l */
/* loaded from: classes2.dex */
public class Appendable {
    /* renamed from: a */
    public static void m8964a(java.lang.Appendable appendable, Object obj, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(appendable, "<this>");
        if (interfaceC6108l != null) {
            appendable.append((CharSequence) interfaceC6108l.mo9587d(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
