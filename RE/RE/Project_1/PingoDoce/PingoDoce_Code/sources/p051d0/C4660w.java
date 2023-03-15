package p051d0;

import bd.InterfaceC1886d;
import cd.C2116d;
import p070e.C4906j;
import p345s.Animatable;
import p345s.C10002t;
import p345s.C10019z;
import p345s.C9978p0;
import p345s.InterfaceC9950h;
import p392v.InterfaceC10984j;
import p468yc.C13195u;
import p479z1.C13605g;

/* renamed from: d0.w */
/* loaded from: classes.dex */
public final class C4660w {

    /* renamed from: a */
    private static final C9978p0<C13605g> f12695a = new C9978p0<>(C4906j.f13390C0, 0, C10019z.m9389a(), 2, null);

    /* renamed from: b */
    private static final C9978p0<C13605g> f12696b = new C9978p0<>(150, 0, new C10002t(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: c */
    private static final C9978p0<C13605g> f12697c = new C9978p0<>(C4906j.f13390C0, 0, new C10002t(0.4f, 0.0f, 0.6f, 1.0f), 2, null);

    /* renamed from: d */
    public static final Object m27008d(Animatable<C13605g, ?> animatable, float f, InterfaceC10984j interfaceC10984j, InterfaceC10984j interfaceC10984j2, InterfaceC1886d<? super C13195u> interfaceC1886d) {
        InterfaceC9950h<C13605g> m27012b;
        Object m34636d;
        Object m34636d2;
        if (interfaceC10984j2 != null) {
            m27012b = Elevation.f12694a.m27013a(interfaceC10984j2);
        } else {
            m27012b = interfaceC10984j != null ? Elevation.f12694a.m27012b(interfaceC10984j) : null;
        }
        InterfaceC9950h<C13605g> interfaceC9950h = m27012b;
        if (interfaceC9950h != null) {
            Object m9653f = Animatable.m9653f(animatable, C13605g.m878d(f), interfaceC9950h, null, null, interfaceC1886d, 12, null);
            m34636d2 = C2116d.m34636d();
            return m9653f == m34636d2 ? m9653f : C13195u.f34156a;
        }
        Object m9637v = animatable.m9637v(C13605g.m878d(f), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m9637v == m34636d ? m9637v : C13195u.f34156a;
    }
}
