package p092f0;

import androidx.compose.runtime.CompositionContext;

/* renamed from: f0.h */
/* loaded from: classes.dex */
public final class C5175h {
    /* renamed from: a */
    public static final int m25299a(InterfaceC5179i interfaceC5179i, int i) {
        return interfaceC5179i.mo25244z();
    }

    /* renamed from: b */
    public static final InterfaceC5258v0 m25298b(InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5258v0 mo25268b = interfaceC5179i.mo25268b();
        if (mo25268b != null) {
            interfaceC5179i.mo25271N(mo25268b);
            return mo25268b;
        }
        throw new IllegalStateException("no recompose scope found".toString());
    }

    /* renamed from: c */
    public static final void m25297c() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    /* renamed from: d */
    public static final CompositionContext m25296d(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-1359197906);
        CompositionContext mo25284A = interfaceC5179i.mo25284A();
        interfaceC5179i.mo25282C();
        return mo25284A;
    }
}
