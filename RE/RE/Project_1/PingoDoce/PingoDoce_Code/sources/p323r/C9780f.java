package p323r;

import android.view.ViewConfiguration;
import androidx.compose.p018ui.platform.CompositionLocals;
import p092f0.InterfaceC5179i;
import p345s.C10013x;
import p345s.InterfaceC10009v;
import p479z1.Density;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
/* renamed from: r.f */
/* loaded from: classes.dex */
public final class C9780f {

    /* renamed from: a */
    private static final float f25717a = ViewConfiguration.getScrollFriction();

    /* renamed from: a */
    public static final float m9975a() {
        return f25717a;
    }

    /* renamed from: b */
    public static final <T> InterfaceC10009v<T> m9974b(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-903108490);
        Density density = (Density) interfaceC5179i.mo25256n(CompositionLocals.m39708d());
        Float valueOf = Float.valueOf(density.getDensity());
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(valueOf);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C10013x.m9397a(new SplineBasedFloatDecayAnimationSpec(density));
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC10009v<T> interfaceC10009v = (InterfaceC10009v) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC10009v;
    }
}
