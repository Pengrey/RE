package td;

import kotlinx.coroutines.internal.C6867h0;

/* renamed from: td.b2 */
/* loaded from: classes2.dex */
public final class C10488b2 {

    /* renamed from: a */
    private static final C6867h0 f27208a = new C6867h0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C6867h0 f27209b = new C6867h0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    private static final C6867h0 f27210c = new C6867h0("COMPLETING_RETRY");

    /* renamed from: d */
    private static final C6867h0 f27211d = new C6867h0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    private static final C6867h0 f27212e = new C6867h0("SEALED");

    /* renamed from: f */
    private static final C10487b1 f27213f = new C10487b1(false);

    /* renamed from: g */
    private static final C10487b1 f27214g = new C10487b1(true);

    /* renamed from: g */
    public static final Object m7846g(Object obj) {
        return obj instanceof InterfaceC10548n1 ? new C10552o1((InterfaceC10548n1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m7845h(Object obj) {
        InterfaceC10548n1 interfaceC10548n1;
        C10552o1 c10552o1 = obj instanceof C10552o1 ? (C10552o1) obj : null;
        return (c10552o1 == null || (interfaceC10548n1 = c10552o1.f27268a) == null) ? obj : interfaceC10548n1;
    }
}
