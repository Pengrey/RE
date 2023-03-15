package com.github.razir.progressbutton;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.content.C0928a;
import androidx.swiperefreshlayout.widget.C1688b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.Arrays;
import p167j.C6204a;
import p181jd.Intrinsics;

/* renamed from: com.github.razir.progressbutton.c */
/* loaded from: classes.dex */
public final class C2373c {

    /* compiled from: DrawableButtonExtensions.kt */
    /* renamed from: com.github.razir.progressbutton.c$a */
    /* loaded from: classes.dex */
    public static final class C2374a implements Drawable.Callback {

        /* renamed from: w */
        final /* synthetic */ TextView f6929w;

        C2374a(TextView textView) {
            this.f6929w = textView;
        }

        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.m20926i(drawable, "who");
            this.f6929w.invalidate();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Intrinsics.m20926i(drawable, "who");
            Intrinsics.m20926i(runnable, "what");
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Intrinsics.m20926i(drawable, "who");
            Intrinsics.m20926i(runnable, "what");
        }
    }

    /* renamed from: a */
    private static final int m33771a(Context context, float f) {
        Resources resources = context.getResources();
        Intrinsics.isNotNull(resources, "resources");
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    private static final C1688b m33770b(Context context, int[] iArr, int i, int i2) {
        C1688b c1688b = new C1688b(context);
        c1688b.m35721o(1);
        if (true ^ (iArr.length == 0)) {
            c1688b.m35727i(Arrays.copyOf(iArr, iArr.length));
        }
        if (i != -1) {
            c1688b.m35728h(i);
        }
        if (i2 != -1) {
            c1688b.m35722n(i2);
        }
        int m35732d = ((int) (c1688b.m35732d() + c1688b.m35731e())) * 2;
        c1688b.setBounds(0, 0, m35732d, m35732d);
        return c1688b;
    }

    /* renamed from: c */
    private static final SpannableString m33769c(Drawable drawable, String str, int i, int i2, boolean z) {
        SpannableString spannableString;
        C2376e c2376e = new C2376e(drawable, 0, 0, z, 6, null);
        if (i == 0) {
            c2376e.m33749a(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            sb2.append(str);
            spannableString = new SpannableString(sb2.toString());
            spannableString.setSpan(c2376e, 0, 1, 33);
        } else if (i != 1) {
            if (i == 2) {
                SpannableString spannableString2 = new SpannableString(" ");
                spannableString2.setSpan(c2376e, 0, 1, 33);
                return spannableString2;
            }
            throw new IllegalArgumentException("Please set the correct gravity");
        } else {
            c2376e.m33748b(i2);
            StringBuilder sb3 = new StringBuilder();
            if (str == null) {
                str = BuildConfig.VERSION_NAME;
            }
            sb3.append(str);
            sb3.append(' ');
            spannableString = new SpannableString(sb3.toString());
            spannableString.setSpan(c2376e, spannableString.length() - 1, spannableString.length(), 33);
        }
        return spannableString;
    }

    /* renamed from: d */
    public static final void m33768d(TextView textView, int i) {
        Intrinsics.m20926i(textView, "$this$hideDrawable");
        m33767e(textView, textView.getContext().getString(i));
    }

    /* renamed from: e */
    public static final void m33767e(TextView textView, String str) {
        Intrinsics.m20926i(textView, "$this$hideDrawable");
        C2378g.m33743d(textView);
        if (C2370b.m33773j(textView)) {
            C2370b.m33777f(textView, str);
        } else {
            textView.setText(str);
        }
    }

    /* renamed from: f */
    public static final boolean m33766f(TextView textView) {
        Intrinsics.m20926i(textView, "$this$isDrawableActive");
        return C2378g.m33741f().containsKey(textView);
    }

    /* renamed from: g */
    private static final void m33765g(TextView textView, Drawable drawable) {
        C2374a c2374a = new C2374a(textView);
        C2378g.m33741f().put(textView, new C2377f(drawable, c2374a));
        drawable.setCallback(c2374a);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
        if (r1 != null) goto L5;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m33764h(android.widget.TextView r3, android.graphics.drawable.Drawable r4, com.github.razir.progressbutton.C2375d r5) {
        /*
            java.lang.String r0 = "$this$showDrawable"
            p181jd.Intrinsics.m20926i(r3, r0)
            java.lang.String r0 = "drawable"
            p181jd.Intrinsics.m20926i(r4, r0)
            java.lang.String r0 = "paramValues"
            p181jd.Intrinsics.m20926i(r5, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "context"
            p181jd.Intrinsics.isNotNull(r0, r1)
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Integer r1 = r5.m33758b()
            if (r1 == 0) goto L31
            int r1 = r1.intValue()
            android.content.Context r2 = r3.getContext()
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L31
            goto L35
        L31:
            java.lang.String r1 = r5.m33759a()
        L35:
            java.lang.Integer r2 = r5.m33755e()
            if (r2 == 0) goto L44
            int r2 = r2.intValue()
            int r0 = r0.getDimensionPixelSize(r2)
            goto L48
        L44:
            int r0 = r5.m33756d()
        L48:
            int r5 = r5.m33757c()
            m33762j(r3, r4, r1, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.razir.progressbutton.C2373c.m33764h(android.widget.TextView, android.graphics.drawable.Drawable, com.github.razir.progressbutton.d):void");
    }

    /* renamed from: i */
    public static final void m33763i(TextView textView, Drawable drawable, InterfaceC6108l interfaceC6108l) {
        Intrinsics.m20926i(textView, "$this$showDrawable");
        Intrinsics.m20926i(drawable, "drawable");
        Intrinsics.m20926i(interfaceC6108l, "params");
        C2375d c2375d = new C2375d();
        interfaceC6108l.mo9587d(c2375d);
        m33764h(textView, drawable, c2375d);
    }

    /* renamed from: j */
    private static final void m33762j(TextView textView, Drawable drawable, String str, int i, int i2) {
        if (m33766f(textView)) {
            C2378g.m33743d(textView);
        }
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (Intrinsics.equals(transformationMethod != null ? transformationMethod.getClass().getName() : null, "android.text.method.AllCapsTransformationMethod") || (textView.getTransformationMethod() instanceof C6204a)) {
            Context context = textView.getContext();
            Intrinsics.isNotNull(context, "context");
            textView.setTransformationMethod(new C2369a(context));
        }
        if (i2 == -1) {
            Context context2 = textView.getContext();
            Intrinsics.isNotNull(context2, "context");
            i2 = m33771a(context2, 10.0f);
        }
        boolean m33773j = C2370b.m33773j(textView);
        SpannableString m33769c = m33769c(drawable, str, i, i2, m33773j);
        if (m33773j) {
            C2370b.m33778e(textView, m33769c);
        } else {
            textView.setText(m33769c);
        }
        C2378g.m33745b(textView);
        m33765g(textView, drawable);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    /* renamed from: k */
    public static final void m33761k(TextView textView, C2381h c2381h) {
        int[] iArr;
        Intrinsics.m20926i(textView, "$this$showProgress");
        Intrinsics.m20926i(c2381h, "params");
        Context context = textView.getContext();
        Intrinsics.isNotNull(context, "context");
        Resources resources = context.getResources();
        Integer m33731q = c2381h.m33731q();
        int dimensionPixelSize = m33731q != null ? resources.getDimensionPixelSize(m33731q.intValue()) : c2381h.m33732p();
        Integer m33733o = c2381h.m33733o();
        int dimensionPixelSize2 = m33733o != null ? resources.getDimensionPixelSize(m33733o.intValue()) : c2381h.m33734n();
        if (c2381h.m33736l() != null) {
            iArr = new int[1];
            Context context2 = textView.getContext();
            Integer m33736l = c2381h.m33736l();
            if (m33736l == null) {
                Intrinsics.m20916s();
            }
            iArr[0] = C0928a.m39113d(context2, m33736l.intValue());
        } else if (c2381h.m33737k() != null) {
            iArr = new int[1];
            Integer m33737k = c2381h.m33737k();
            if (m33737k == null) {
                Intrinsics.m20916s();
            }
            iArr[0] = m33737k.intValue();
        } else if (c2381h.m33735m() != null) {
            iArr = c2381h.m33735m();
            if (iArr == null) {
                Intrinsics.m20916s();
            }
        } else {
            iArr = new int[0];
        }
        Context context3 = textView.getContext();
        Intrinsics.isNotNull(context3, "context");
        m33764h(textView, m33770b(context3, iArr, dimensionPixelSize2, dimensionPixelSize), c2381h);
    }

    /* renamed from: l */
    public static final void m33760l(TextView textView, InterfaceC6108l interfaceC6108l) {
        Intrinsics.m20926i(textView, "$this$showProgress");
        Intrinsics.m20926i(interfaceC6108l, "params");
        C2381h c2381h = new C2381h();
        interfaceC6108l.mo9587d(c2381h);
        m33761k(textView, c2381h);
    }
}
