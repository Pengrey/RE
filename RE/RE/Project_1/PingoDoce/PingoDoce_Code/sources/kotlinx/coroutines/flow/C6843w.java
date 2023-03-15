package kotlinx.coroutines.flow;

import bd.InterfaceC1886d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p424wd.AbstractC11620c;
import p468yc.C13195u;
import td.C10539l0;

/* renamed from: kotlinx.coroutines.flow.w */
/* loaded from: classes2.dex */
public final class C6843w extends AbstractC11620c<C6838u<?>> {

    /* renamed from: a */
    public long f18282a = -1;

    /* renamed from: b */
    public InterfaceC1886d<? super C13195u> f18283b;

    @Override // p424wd.AbstractC11620c
    /* renamed from: c */
    public boolean mo20033c(C6838u<?> c6838u) {
        if (this.f18282a >= 0) {
            return false;
        }
        this.f18282a = c6838u.m20058W();
        return true;
    }

    @Override // p424wd.AbstractC11620c
    /* renamed from: d */
    public Continuation<Unit>[] mo20032d(C6838u<?> c6838u) {
        if (C10539l0.m7720a()) {
            if (!(this.f18282a >= 0)) {
                throw new AssertionError();
            }
        }
        long j = this.f18282a;
        this.f18282a = -1L;
        this.f18283b = null;
        return c6838u.m20059V(j);
    }
}
