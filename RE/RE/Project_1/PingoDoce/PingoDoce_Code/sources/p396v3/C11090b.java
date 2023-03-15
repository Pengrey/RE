package p396v3;

import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p107ff.InterfaceC5469e;
import p107ff.Response;
import td.C10534k;

/* renamed from: v3.b */
/* loaded from: classes.dex */
public final class C11090b {
    /* renamed from: a */
    public static final Object m6171a(InterfaceC5469e interfaceC5469e, InterfaceC1886d<? super Response> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C10534k c10534k = new C10534k(m34637c, 1);
        c10534k.m7723y();
        C11100j c11100j = new C11100j(interfaceC5469e, c10534k);
        interfaceC5469e.mo24162E(c11100j);
        c10534k.mo7778n(c11100j);
        Object m7728t = c10534k.m7728t();
        m34636d = C2116d.m34636d();
        if (m7728t == m34636d) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        return m7728t;
    }
}
