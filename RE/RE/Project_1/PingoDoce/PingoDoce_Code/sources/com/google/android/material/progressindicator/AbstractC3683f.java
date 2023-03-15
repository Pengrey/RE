package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.progressindicator.f */
/* loaded from: classes.dex */
public abstract class AbstractC3683f<T extends Animator> {

    /* renamed from: a */
    protected C3684g f10373a;

    /* renamed from: b */
    protected final float[] f10374b;

    /* renamed from: c */
    protected final int[] f10375c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC3683f(int i) {
        this.f10374b = new float[i * 2];
        this.f10375c = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo29330a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public float m29356b(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* renamed from: c */
    public abstract void mo29329c();

    /* renamed from: d */
    public abstract void mo29328d(AbstractC1693b abstractC1693b);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void m29355e(C3684g c3684g) {
        this.f10373a = c3684g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo29327f();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo29326g();

    /* renamed from: h */
    public abstract void mo29325h();
}
