package p392v;

import bd.InterfaceC1886d;
import cd.C2116d;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.C6842v;
import kotlinx.coroutines.flow.InterfaceC6834q;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v.n */
/* loaded from: classes.dex */
public final class InteractionSource implements InterfaceC10987m {

    /* renamed from: a */
    private final InterfaceC6834q f28288a = C6842v.m20039b(0, 16, EnumC6771a.DROP_OLDEST, 1, null);

    /* renamed from: a */
    public Object mo6672a(InterfaceC10984j interfaceC10984j, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object mo4529a = mo6674c().mo4529a(interfaceC10984j, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo4529a == m34636d ? mo4529a : C13195u.f34156a;
    }

    /* renamed from: b */
    public boolean mo6671b(InterfaceC10984j interfaceC10984j) {
        Intrinsics.isThisObjectNull(interfaceC10984j, "interaction");
        return mo6674c().mo20083c(interfaceC10984j);
    }

    /* renamed from: d */
    public InterfaceC6834q mo6674c() {
        return this.f28288a;
    }
}
