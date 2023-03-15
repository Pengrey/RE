package p393v0;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import p393v0.C11047p;

/* compiled from: AndroidBlendMode.android.kt */
/* renamed from: v0.a */
/* loaded from: classes.dex */
public final class C10993a {
    /* renamed from: a */
    public static final BlendMode m6661a(int i) {
        C11047p.C11048a c11048a = C11047p.f28401a;
        return C11047p.m6380E(i, c11048a.m6349a()) ? BlendMode.CLEAR : C11047p.m6380E(i, c11048a.m6326x()) ? BlendMode.SRC : C11047p.m6380E(i, c11048a.m6343g()) ? BlendMode.DST : C11047p.m6380E(i, c11048a.m6351B()) ? BlendMode.SRC_OVER : C11047p.m6380E(i, c11048a.m6339k()) ? BlendMode.DST_OVER : C11047p.m6380E(i, c11048a.m6324z()) ? BlendMode.SRC_IN : C11047p.m6380E(i, c11048a.m6341i()) ? BlendMode.DST_IN : C11047p.m6380E(i, c11048a.m6352A()) ? BlendMode.SRC_OUT : C11047p.m6380E(i, c11048a.m6340j()) ? BlendMode.DST_OUT : C11047p.m6380E(i, c11048a.m6325y()) ? BlendMode.SRC_ATOP : C11047p.m6380E(i, c11048a.m6342h()) ? BlendMode.DST_ATOP : C11047p.m6380E(i, c11048a.m6350C()) ? BlendMode.XOR : C11047p.m6380E(i, c11048a.m6330t()) ? BlendMode.PLUS : C11047p.m6380E(i, c11048a.m6333q()) ? BlendMode.MODULATE : C11047p.m6380E(i, c11048a.m6328v()) ? BlendMode.SCREEN : C11047p.m6380E(i, c11048a.m6331s()) ? BlendMode.OVERLAY : C11047p.m6380E(i, c11048a.m6345e()) ? BlendMode.DARKEN : C11047p.m6380E(i, c11048a.m6335o()) ? BlendMode.LIGHTEN : C11047p.m6380E(i, c11048a.m6346d()) ? BlendMode.COLOR_DODGE : C11047p.m6380E(i, c11048a.m6347c()) ? BlendMode.COLOR_BURN : C11047p.m6380E(i, c11048a.m6337m()) ? BlendMode.HARD_LIGHT : C11047p.m6380E(i, c11048a.m6327w()) ? BlendMode.SOFT_LIGHT : C11047p.m6380E(i, c11048a.m6344f()) ? BlendMode.DIFFERENCE : C11047p.m6380E(i, c11048a.m6338l()) ? BlendMode.EXCLUSION : C11047p.m6380E(i, c11048a.m6332r()) ? BlendMode.MULTIPLY : C11047p.m6380E(i, c11048a.m6336n()) ? BlendMode.HUE : C11047p.m6380E(i, c11048a.m6329u()) ? BlendMode.SATURATION : C11047p.m6380E(i, c11048a.m6348b()) ? BlendMode.COLOR : C11047p.m6380E(i, c11048a.m6334p()) ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* renamed from: b */
    public static final PorterDuff.Mode m6660b(int i) {
        C11047p.C11048a c11048a = C11047p.f28401a;
        if (C11047p.m6380E(i, c11048a.m6349a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (C11047p.m6380E(i, c11048a.m6326x())) {
            return PorterDuff.Mode.SRC;
        }
        if (C11047p.m6380E(i, c11048a.m6343g())) {
            return PorterDuff.Mode.DST;
        }
        if (C11047p.m6380E(i, c11048a.m6351B())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (C11047p.m6380E(i, c11048a.m6339k())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (C11047p.m6380E(i, c11048a.m6324z())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (C11047p.m6380E(i, c11048a.m6341i())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (C11047p.m6380E(i, c11048a.m6352A())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (C11047p.m6380E(i, c11048a.m6340j())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (C11047p.m6380E(i, c11048a.m6325y())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (C11047p.m6380E(i, c11048a.m6342h())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (C11047p.m6380E(i, c11048a.m6350C())) {
            return PorterDuff.Mode.XOR;
        }
        if (C11047p.m6380E(i, c11048a.m6330t())) {
            return PorterDuff.Mode.ADD;
        }
        if (C11047p.m6380E(i, c11048a.m6328v())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (C11047p.m6380E(i, c11048a.m6331s())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (C11047p.m6380E(i, c11048a.m6345e())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (C11047p.m6380E(i, c11048a.m6335o())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (C11047p.m6380E(i, c11048a.m6333q())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
