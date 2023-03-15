package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.C3646n;
import p100f8.C5419b;
import p100f8.C5424g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: classes.dex */
public class C3467e {

    /* renamed from: a */
    private static final int[] f9399a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m30603a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m30602b(View view, float f) {
        int integer = view.getResources().getInteger(C5424g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, C5419b.state_liftable, -C5419b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m30601c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m29500h = C3646n.m29500h(context, attributeSet, f9399a, i, i2, new int[0]);
        try {
            if (m29500h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m29500h.getResourceId(0, 0)));
            }
        } finally {
            m29500h.recycle();
        }
    }
}
