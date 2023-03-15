package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p354s8.AbstractC10091f;
import p354s8.C10087d;

/* renamed from: com.google.android.material.internal.k */
/* loaded from: classes.dex */
public class C3640k {

    /* renamed from: c */
    private float f10222c;

    /* renamed from: f */
    private C10087d f10225f;

    /* renamed from: a */
    private final TextPaint f10220a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC10091f f10221b = new C3641a();

    /* renamed from: d */
    private boolean f10223d = true;

    /* renamed from: e */
    private WeakReference<InterfaceC3642b> f10224e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.k$a */
    /* loaded from: classes.dex */
    class C3641a extends AbstractC10091f {
        C3641a() {
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: a */
        public void mo9200a(int i) {
            C3640k.this.f10223d = true;
            InterfaceC3642b interfaceC3642b = (InterfaceC3642b) C3640k.this.f10224e.get();
            if (interfaceC3642b != null) {
                interfaceC3642b.mo29512a();
            }
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: b */
        public void mo9199b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C3640k.this.f10223d = true;
            InterfaceC3642b interfaceC3642b = (InterfaceC3642b) C3640k.this.f10224e.get();
            if (interfaceC3642b != null) {
                interfaceC3642b.mo29512a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.k$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3642b {
        /* renamed from: a */
        void mo29512a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C3640k(InterfaceC3642b interfaceC3642b) {
        m29516g(interfaceC3642b);
    }

    /* renamed from: c */
    private float m29520c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f10220a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C10087d m29519d() {
        return this.f10225f;
    }

    /* renamed from: e */
    public TextPaint m29518e() {
        return this.f10220a;
    }

    /* renamed from: f */
    public float m29517f(String str) {
        if (!this.f10223d) {
            return this.f10222c;
        }
        float m29520c = m29520c(str);
        this.f10222c = m29520c;
        this.f10223d = false;
        return m29520c;
    }

    /* renamed from: g */
    public void m29516g(InterfaceC3642b interfaceC3642b) {
        this.f10224e = new WeakReference<>(interfaceC3642b);
    }

    /* renamed from: h */
    public void m29515h(C10087d c10087d, Context context) {
        if (this.f10225f != c10087d) {
            this.f10225f = c10087d;
            if (c10087d != null) {
                c10087d.m9205o(context, this.f10220a, this.f10221b);
                InterfaceC3642b interfaceC3642b = this.f10224e.get();
                if (interfaceC3642b != null) {
                    this.f10220a.drawableState = interfaceC3642b.getState();
                }
                c10087d.m9206n(context, this.f10220a, this.f10221b);
                this.f10223d = true;
            }
            InterfaceC3642b interfaceC3642b2 = this.f10224e.get();
            if (interfaceC3642b2 != null) {
                interfaceC3642b2.mo29512a();
                interfaceC3642b2.onStateChange(interfaceC3642b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m29514i(boolean z) {
        this.f10223d = z;
    }

    /* renamed from: j */
    public void m29513j(Context context) {
        this.f10225f.m9206n(context, this.f10220a, this.f10221b);
    }
}
