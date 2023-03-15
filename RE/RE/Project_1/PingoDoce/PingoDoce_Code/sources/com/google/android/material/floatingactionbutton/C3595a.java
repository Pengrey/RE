package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes.dex */
class C3595a {

    /* renamed from: a */
    private Animator f9997a;

    /* renamed from: a */
    public void m29760a() {
        Animator animator = this.f9997a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m29759b() {
        this.f9997a = null;
    }

    /* renamed from: c */
    public void m29758c(Animator animator) {
        m29760a();
        this.f9997a = animator;
    }
}
