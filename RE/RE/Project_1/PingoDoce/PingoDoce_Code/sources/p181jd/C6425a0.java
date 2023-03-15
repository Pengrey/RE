package p181jd;

import p314qd.InterfaceC9717b;
import p314qd.InterfaceC9718c;
import p314qd.InterfaceC9719d;
import p314qd.InterfaceC9720e;
import p314qd.InterfaceC9721f;

/* renamed from: jd.a0 */
/* loaded from: classes2.dex */
public class C6425a0 {
    /* renamed from: a */
    public InterfaceC9719d m20970a(C6434h c6434h) {
        return c6434h;
    }

    /* renamed from: b */
    public InterfaceC9717b m20969b(Class cls) {
        return new ClassReference(cls);
    }

    /* renamed from: c */
    public InterfaceC9718c m20968c(Class cls, String str) {
        return new PackageReference(cls, str);
    }

    /* renamed from: d */
    public InterfaceC9720e m20967d(AbstractC6439n abstractC6439n) {
        return abstractC6439n;
    }

    /* renamed from: e */
    public InterfaceC9721f m20966e(AbstractC6442r abstractC6442r) {
        return abstractC6442r;
    }

    /* renamed from: f */
    public String m20965f(InterfaceC6433g interfaceC6433g) {
        String obj = interfaceC6433g.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: g */
    public String m20964g(AbstractC6438m abstractC6438m) {
        return m20965f(abstractC6438m);
    }
}
