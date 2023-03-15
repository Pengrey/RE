package p007a6;

import java.util.Set;
import p461y5.C13111b;
import p461y5.InterfaceC13114e;
import p461y5.InterfaceC13115f;
import p461y5.InterfaceC13116g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.p */
/* loaded from: classes.dex */
public final class C0058p implements InterfaceC13116g {

    /* renamed from: a */
    private final Set<C13111b> f159a;

    /* renamed from: b */
    private final AbstractC0056o f160b;

    /* renamed from: c */
    private final InterfaceC0061s f161c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0058p(Set<C13111b> set, AbstractC0056o abstractC0056o, InterfaceC0061s interfaceC0061s) {
        this.f159a = set;
        this.f160b = abstractC0056o;
        this.f161c = interfaceC0061s;
    }

    @Override // p461y5.InterfaceC13116g
    /* renamed from: a */
    public <T> InterfaceC13115f<T> mo1575a(String str, Class<T> cls, C13111b c13111b, InterfaceC13114e<T, byte[]> interfaceC13114e) {
        if (this.f159a.contains(c13111b)) {
            return new C0060r(this.f160b, str, c13111b, interfaceC13114e, this.f161c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c13111b, this.f159a));
    }
}
