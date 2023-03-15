package p013ah;

import androidx.lifecycle.C1459l0;
import ke.InterfaceC6657b;
import p423wc.C11615d;
import p445xc.InterfaceC12341a;
import pt.pingodoce.app.presentation.account.anonymousAccount.AnonymousAccountViewModel;

/* renamed from: ah.f */
/* loaded from: classes2.dex */
public final class C0143f implements InterfaceC6657b {

    /* renamed from: a */
    private final C0142e f317a;

    C0143f(C0142e c0142e) {
        this.f317a = c0142e;
    }

    /* renamed from: c */
    public static InterfaceC12341a<Object> m41763c(C0142e c0142e) {
        return C11615d.m4594a(new C0143f(c0142e));
    }

    @Override // ke.InterfaceC6657b
    /* renamed from: b */
    public AnonymousAccountViewModel mo14a(C1459l0 c1459l0) {
        return this.f317a.m41766b(c1459l0);
    }
}
