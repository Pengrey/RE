package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;

/* renamed from: com.google.android.material.internal.p */
/* loaded from: classes.dex */
public class C3649p {

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.p$a */
    /* loaded from: classes.dex */
    class RunnableC3650a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ View f10231w;

        RunnableC3650a(View view) {
            this.f10231w = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f10231w.getContext().getSystemService("input_method")).showSoftInput(this.f10231w, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.p$b */
    /* loaded from: classes.dex */
    public class C3651b implements InterfaceC1211u {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3653d f10232a;

        /* renamed from: b */
        final /* synthetic */ C3654e f10233b;

        C3651b(InterfaceC3653d interfaceC3653d, C3654e c3654e) {
            this.f10232a = interfaceC3653d;
            this.f10233b = c3654e;
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            return this.f10232a.mo29484a(view, c1183m0, new C3654e(this.f10233b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.p$c */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC3652c implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC3652c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C1112b0.m38411p0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.p$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3653d {
        /* renamed from: a */
        C1183m0 mo29484a(View view, C1183m0 c1183m0, C3654e c3654e);
    }

    /* renamed from: a */
    public static void m29492a(View view, InterfaceC3653d interfaceC3653d) {
        C1112b0.m38475E0(view, new C3651b(interfaceC3653d, new C3654e(C1112b0.m38466J(view), view.getPaddingTop(), C1112b0.m38468I(view), view.getPaddingBottom())));
        m29486g(view);
    }

    /* renamed from: b */
    public static float m29491b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static Integer m29490c(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    /* renamed from: d */
    public static float m29489d(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C1112b0.m38394y((View) parent);
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m29488e(View view) {
        return C1112b0.m38476E(view) == 1;
    }

    /* renamed from: f */
    public static PorterDuff.Mode m29487f(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: g */
    public static void m29486g(View view) {
        if (C1112b0.m38447V(view)) {
            C1112b0.m38411p0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC3652c());
        }
    }

    /* renamed from: h */
    public static void m29485h(View view) {
        view.requestFocus();
        view.post(new RunnableC3650a(view));
    }

    /* compiled from: ViewUtils.java */
    /* renamed from: com.google.android.material.internal.p$e */
    /* loaded from: classes.dex */
    public static class C3654e {

        /* renamed from: a */
        public int f10234a;

        /* renamed from: b */
        public int f10235b;

        /* renamed from: c */
        public int f10236c;

        /* renamed from: d */
        public int f10237d;

        public C3654e(int i, int i2, int i3, int i4) {
            this.f10234a = i;
            this.f10235b = i2;
            this.f10236c = i3;
            this.f10237d = i4;
        }

        /* renamed from: a */
        public void m29483a(View view) {
            C1112b0.m38473F0(view, this.f10234a, this.f10235b, this.f10236c, this.f10237d);
        }

        public C3654e(C3654e c3654e) {
            this.f10234a = c3654e.f10234a;
            this.f10235b = c3654e.f10235b;
            this.f10236c = c3654e.f10236c;
            this.f10237d = c3654e.f10237d;
        }
    }
}
