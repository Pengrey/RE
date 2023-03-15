package p068di;

import androidx.lifecycle.C1459l0;
import ke.InterfaceC6657b;
import p423wc.C11615d;
import p445xc.InterfaceC12341a;

/* renamed from: di.e */
/* loaded from: classes2.dex */
public final class C4864e implements InterfaceC6657b {

    /* renamed from: a */
    private final C4863d f13288a;

    C4864e(C4863d c4863d) {
        this.f13288a = c4863d;
    }

    /* renamed from: c */
    public static InterfaceC12341a<Object> m26431c(C4863d c4863d) {
        return C11615d.m4594a(new C4864e(c4863d));
    }

    @Override // ke.InterfaceC6657b
    /* renamed from: b */
    public WebViewModel mo14a(C1459l0 c1459l0) {
        return this.f13288a.m26434b(c1459l0);
    }
}
