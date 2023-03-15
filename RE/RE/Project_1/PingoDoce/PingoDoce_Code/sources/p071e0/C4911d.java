package p071e0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.C0824y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p392v.InterfaceC10985k;

/* compiled from: Ripple.android.kt */
/* renamed from: e0.d */
/* loaded from: classes.dex */
public final class C4911d extends Ripple {
    private C4911d(boolean z, float f, InterfaceC5242r1 interfaceC5242r1) {
        super(z, f, interfaceC5242r1, null);
    }

    public /* synthetic */ C4911d(boolean z, float f, InterfaceC5242r1 interfaceC5242r1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, interfaceC5242r1);
    }

    /* renamed from: c */
    private final ViewGroup m26301c(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(601470064);
        Object mo25256n = interfaceC5179i.mo25256n(C0824y.m39469i());
        while (!(mo25256n instanceof ViewGroup)) {
            ViewParent parent = ((View) mo25256n).getParent();
            if (parent instanceof View) {
                Intrinsics.checkIfNull(parent, "parent");
                mo25256n = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + mo25256n + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) mo25256n;
        interfaceC5179i.mo25282C();
        return viewGroup;
    }

    /* renamed from: b */
    public AbstractC4928m m26302b(InterfaceC10985k interfaceC10985k, boolean z, float f, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC10985k, "interactionSource");
        Intrinsics.isThisObjectNull(interfaceC5242r1, "color");
        Intrinsics.isThisObjectNull(interfaceC5242r12, "rippleAlpha");
        interfaceC5179i.mo25263g(1643266907);
        ViewGroup m26301c = m26301c(interfaceC5179i, (i >> 15) & 14);
        interfaceC5179i.mo25263g(1643267286);
        if (m26301c.isInEditMode()) {
            interfaceC5179i.mo25263g(-3686552);
            boolean mo25276I = interfaceC5179i.mo25276I(interfaceC10985k) | interfaceC5179i.mo25276I(this);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new CommonRipple(z, f, interfaceC5242r1, interfaceC5242r12, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            CommonRipple commonRipple = (CommonRipple) mo25262h;
            interfaceC5179i.mo25282C();
            interfaceC5179i.mo25282C();
            return commonRipple;
        }
        interfaceC5179i.mo25282C();
        C4923i c4923i = null;
        int i2 = 0;
        int childCount = m26301c.getChildCount();
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = m26301c.getChildAt(i2);
            if (childAt instanceof C4923i) {
                c4923i = childAt;
                break;
            }
            i2 = i3;
        }
        if (c4923i == null) {
            Context context = m26301c.getContext();
            Intrinsics.checkIfNull(context, "view.context");
            c4923i = new C4923i(context);
            m26301c.addView(c4923i);
        }
        interfaceC5179i.mo25263g(-3686095);
        boolean mo25276I2 = interfaceC5179i.mo25276I(interfaceC10985k) | interfaceC5179i.mo25276I(this) | interfaceC5179i.mo25276I(c4923i);
        Object mo25262h2 = interfaceC5179i.mo25262h();
        if (mo25276I2 || mo25262h2 == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h2 = new C4907a(z, f, interfaceC5242r1, interfaceC5242r12, c4923i, null);
            interfaceC5179i.mo25247w(mo25262h2);
        }
        interfaceC5179i.mo25282C();
        C4907a c4907a = (C4907a) mo25262h2;
        interfaceC5179i.mo25282C();
        return c4907a;
    }
}
