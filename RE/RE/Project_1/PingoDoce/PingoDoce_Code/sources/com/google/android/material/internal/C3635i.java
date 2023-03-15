package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
/* loaded from: classes.dex */
public final class C3635i {

    /* renamed from: a */
    private final ArrayList<C3637b> f10196a = new ArrayList<>();

    /* renamed from: b */
    private C3637b f10197b = null;

    /* renamed from: c */
    ValueAnimator f10198c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f10199d = new C3636a();

    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.i$a */
    /* loaded from: classes.dex */
    class C3636a extends AnimatorListenerAdapter {
        C3636a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C3635i c3635i = C3635i.this;
            if (c3635i.f10198c == animator) {
                c3635i.f10198c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateListAnimator.java */
    /* renamed from: com.google.android.material.internal.i$b */
    /* loaded from: classes.dex */
    public static class C3637b {

        /* renamed from: a */
        final int[] f10201a;

        /* renamed from: b */
        final ValueAnimator f10202b;

        C3637b(int[] iArr, ValueAnimator valueAnimator) {
            this.f10201a = iArr;
            this.f10202b = valueAnimator;
        }
    }

    /* renamed from: b */
    private void m29536b() {
        ValueAnimator valueAnimator = this.f10198c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10198c = null;
        }
    }

    /* renamed from: e */
    private void m29533e(C3637b c3637b) {
        ValueAnimator valueAnimator = c3637b.f10202b;
        this.f10198c = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void m29537a(int[] iArr, ValueAnimator valueAnimator) {
        C3637b c3637b = new C3637b(iArr, valueAnimator);
        valueAnimator.addListener(this.f10199d);
        this.f10196a.add(c3637b);
    }

    /* renamed from: c */
    public void m29535c() {
        ValueAnimator valueAnimator = this.f10198c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f10198c = null;
        }
    }

    /* renamed from: d */
    public void m29534d(int[] iArr) {
        C3637b c3637b;
        int size = this.f10196a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c3637b = null;
                break;
            }
            c3637b = this.f10196a.get(i);
            if (StateSet.stateSetMatches(c3637b.f10201a, iArr)) {
                break;
            }
            i++;
        }
        C3637b c3637b2 = this.f10197b;
        if (c3637b == c3637b2) {
            return;
        }
        if (c3637b2 != null) {
            m29536b();
        }
        this.f10197b = c3637b;
        if (c3637b != null) {
            m29533e(c3637b);
        }
    }
}
