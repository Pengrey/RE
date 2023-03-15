package p037c1;

import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5220m0;

/* renamed from: c1.c */
/* loaded from: classes.dex */
public final class C1988c implements InterfaceC1987b {

    /* renamed from: a */
    private final InterfaceC6108l<C1985a, Boolean> f5811a;

    /* renamed from: b */
    private final InterfaceC5220m0 f5812b;

    /* JADX WARN: Multi-variable type inference failed */
    private C1988c(int i, InterfaceC6108l<? super C1985a, Boolean> interfaceC6108l) {
        InterfaceC5220m0 m24962d;
        this.f5811a = interfaceC6108l;
        m24962d = C5232o1.m24962d(C1985a.m34982c(i), null, 2, null);
        this.f5812b = m24962d;
    }

    public /* synthetic */ C1988c(int i, InterfaceC6108l interfaceC6108l, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, interfaceC6108l);
    }

    @Override // p037c1.InterfaceC1987b
    /* renamed from: a */
    public int mo34973a() {
        return ((C1985a) this.f5812b.getValue()).m34976i();
    }

    /* renamed from: b */
    public void m34972b(int i) {
        this.f5812b.setValue(C1985a.m34982c(i));
    }
}
