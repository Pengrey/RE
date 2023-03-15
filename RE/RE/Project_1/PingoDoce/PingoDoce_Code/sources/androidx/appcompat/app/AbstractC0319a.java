package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p070e.C4906j;
import p189k.AbstractC6541b;

/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0319a {

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0321b {
        /* renamed from: a */
        void m41288a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0322c {
        /* renamed from: a */
        public abstract CharSequence m41287a();

        /* renamed from: b */
        public abstract View m41286b();

        /* renamed from: c */
        public abstract Drawable m41285c();

        /* renamed from: d */
        public abstract CharSequence m41284d();

        /* renamed from: e */
        public abstract void m41283e();
    }

    /* renamed from: g */
    public boolean m41293g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo41094h();

    /* renamed from: i */
    public abstract void mo41093i(boolean z);

    /* renamed from: j */
    public abstract int mo41092j();

    /* renamed from: k */
    public abstract Context mo41091k();

    /* renamed from: l */
    public boolean m41292l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo41090m(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m41291n() {
    }

    /* renamed from: o */
    public abstract boolean mo41089o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean m41290p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean m41289q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo41088r(boolean z);

    /* renamed from: s */
    public abstract void mo41087s(boolean z);

    /* renamed from: t */
    public abstract void mo41086t(CharSequence charSequence);

    /* renamed from: u */
    public abstract AbstractC6541b mo41085u(AbstractC6541b.InterfaceC6542a interfaceC6542a);

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0320a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f795a;

        public C0320a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f795a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13586t);
            this.f795a = obtainStyledAttributes.getInt(C4906j.f13591u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0320a(int i, int i2) {
            super(i, i2);
            this.f795a = 0;
            this.f795a = 8388627;
        }

        public C0320a(C0320a c0320a) {
            super((ViewGroup.MarginLayoutParams) c0320a);
            this.f795a = 0;
            this.f795a = c0320a.f795a;
        }

        public C0320a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f795a = 0;
        }
    }
}
