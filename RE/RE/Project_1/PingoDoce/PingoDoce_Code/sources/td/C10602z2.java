package td;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlinx.coroutines.internal.C6870j;
import kotlinx.coroutines.internal.C6872k;
import p468yc.C13195u;

/* renamed from: td.z2 */
/* loaded from: classes2.dex */
public final class C10602z2 {
    /* renamed from: a */
    public static final Object m7582a(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        InterfaceC1886d m34637c;
        Object m34636d;
        Object m34636d2;
        Object m34636d3;
        CoroutineContext context = interfaceC1886d.getContext();
        C10588w1.m7609j(context);
        m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
        C6870j c6870j = m34637c instanceof C6870j ? (C6870j) m34637c : null;
        if (c6870j == null) {
            m34636d = C13195u.f34156a;
        } else {
            if (c6870j.f18320z.mo7627F0(context)) {
                c6870j.m19953i(context, C13195u.f34156a);
            } else {
                C10597y2 c10597y2 = new C10597y2();
                CoroutineContext mo4545f0 = context.mo4545f0(c10597y2);
                C13195u c13195u = C13195u.f34156a;
                c6870j.m19953i(mo4545f0, c13195u);
                if (c10597y2.f27309x) {
                    m34636d = C6872k.m19942d(c6870j) ? C2116d.m34636d() : c13195u;
                }
            }
            m34636d = C2116d.m34636d();
        }
        m34636d2 = C2116d.m34636d();
        if (m34636d == m34636d2) {
            DebugProbes.m20186c(interfaceC1886d);
        }
        m34636d3 = C2116d.m34636d();
        return m34636d == m34636d3 ? m34636d : C13195u.f34156a;
    }
}
