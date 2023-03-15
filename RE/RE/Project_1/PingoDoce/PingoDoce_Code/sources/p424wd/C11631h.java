package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p468yc.C13195u;

/* renamed from: wd.h */
/* loaded from: classes2.dex */
public final class C11631h<T> extends AbstractC11629g<T, T> {
    public /* synthetic */ C11631h(InterfaceC6785c interfaceC6785c, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6785c, (i2 & 2) != 0 ? C1894h.f5621w : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC6771a.SUSPEND : enumC6771a);
    }

    @Override // p424wd.AbstractC11621d
    /* renamed from: i */
    protected AbstractC11621d<T> mo4555i(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return new C11631h(this.f29734z, coroutineContext, i, enumC6771a);
    }

    @Override // p424wd.AbstractC11629g
    /* renamed from: p */
    protected Object mo4554p(InterfaceC6787d<? super T> interfaceC6787d, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        Object m34636d;
        Object mo20086d = this.f29734z.mo20086d(interfaceC6787d, interfaceC1886d);
        m34636d = C2116d.m34636d();
        return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
    }

    public C11631h(InterfaceC6785c<? extends T> interfaceC6785c, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        super(interfaceC6785c, coroutineContext, i, enumC6771a);
    }
}
