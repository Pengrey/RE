package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.C1076h;
import java.util.ArrayList;
import java.util.List;
import p120g8.C5616a;
import p120g8.C5617b;
import p120g8.C5623h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
/* loaded from: classes.dex */
public abstract class AbstractC3596b implements InterfaceC3617f {

    /* renamed from: a */
    private final Context f9998a;

    /* renamed from: b */
    private final ExtendedFloatingActionButton f9999b;

    /* renamed from: c */
    private final ArrayList<Animator.AnimatorListener> f10000c = new ArrayList<>();

    /* renamed from: d */
    private final C3595a f10001d;

    /* renamed from: e */
    private C5623h f10002e;

    /* renamed from: f */
    private C5623h f10003f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseMotionStrategy.java */
    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    /* loaded from: classes.dex */
    public class C3597a extends Property<ExtendedFloatingActionButton, Float> {
        C3597a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C5616a.m23565a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.f9955e0.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC3596b.this.f9999b.f9955e0.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f9955e0.getColorForState(extendedFloatingActionButton.getDrawableState(), AbstractC3596b.this.f9999b.f9955e0.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C5616a.m23565a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.m29830B(extendedFloatingActionButton.f9955e0);
            } else {
                extendedFloatingActionButton.m29830B(valueOf);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3596b(ExtendedFloatingActionButton extendedFloatingActionButton, C3595a c3595a) {
        this.f9999b = extendedFloatingActionButton;
        this.f9998a = extendedFloatingActionButton.getContext();
        this.f10001d = c3595a;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: a */
    public void mo29678a() {
        this.f10001d.m29759b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: b */
    public void mo29677b() {
        this.f10001d.m29759b();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: e */
    public C5623h mo29674e() {
        return this.f10003f;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: f */
    public AnimatorSet mo29673f() {
        return m29756l(m29755m());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: g */
    public final List<Animator.AnimatorListener> mo29672g() {
        return this.f10000c;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    /* renamed from: j */
    public final void mo29669j(C5623h c5623h) {
        this.f10003f = c5623h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public AnimatorSet m29756l(C5623h c5623h) {
        ArrayList arrayList = new ArrayList();
        if (c5623h.m23543j("opacity")) {
            arrayList.add(c5623h.m23547f("opacity", this.f9999b, View.ALPHA));
        }
        if (c5623h.m23543j("scale")) {
            arrayList.add(c5623h.m23547f("scale", this.f9999b, View.SCALE_Y));
            arrayList.add(c5623h.m23547f("scale", this.f9999b, View.SCALE_X));
        }
        if (c5623h.m23543j("width")) {
            arrayList.add(c5623h.m23547f("width", this.f9999b, ExtendedFloatingActionButton.f9938g0));
        }
        if (c5623h.m23543j("height")) {
            arrayList.add(c5623h.m23547f("height", this.f9999b, ExtendedFloatingActionButton.f9939h0));
        }
        if (c5623h.m23543j("paddingStart")) {
            arrayList.add(c5623h.m23547f("paddingStart", this.f9999b, ExtendedFloatingActionButton.f9940i0));
        }
        if (c5623h.m23543j("paddingEnd")) {
            arrayList.add(c5623h.m23547f("paddingEnd", this.f9999b, ExtendedFloatingActionButton.f9941j0));
        }
        if (c5623h.m23543j("labelOpacity")) {
            arrayList.add(c5623h.m23547f("labelOpacity", this.f9999b, new C3597a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C5617b.m23562a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final C5623h m29755m() {
        C5623h c5623h = this.f10003f;
        if (c5623h != null) {
            return c5623h;
        }
        if (this.f10002e == null) {
            this.f10002e = C5623h.m23549d(this.f9998a, mo29676c());
        }
        return (C5623h) C1076h.m38619f(this.f10002e);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC3617f
    public void onAnimationStart(Animator animator) {
        this.f10001d.m29758c(animator);
    }
}
