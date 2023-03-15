package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.util.C1076h;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.material.internal.j */
/* loaded from: classes.dex */
final class C3638j {

    /* renamed from: n */
    static final int f10203n;

    /* renamed from: o */
    private static boolean f10204o;

    /* renamed from: p */
    private static Constructor<StaticLayout> f10205p;

    /* renamed from: q */
    private static Object f10206q;

    /* renamed from: a */
    private CharSequence f10207a;

    /* renamed from: b */
    private final TextPaint f10208b;

    /* renamed from: c */
    private final int f10209c;

    /* renamed from: e */
    private int f10211e;

    /* renamed from: l */
    private boolean f10218l;

    /* renamed from: d */
    private int f10210d = 0;

    /* renamed from: f */
    private Layout.Alignment f10212f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g */
    private int f10213g = Reader.READ_DONE;

    /* renamed from: h */
    private float f10214h = 0.0f;

    /* renamed from: i */
    private float f10215i = 1.0f;

    /* renamed from: j */
    private int f10216j = f10203n;

    /* renamed from: k */
    private boolean f10217k = true;

    /* renamed from: m */
    private TextUtils.TruncateAt f10219m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StaticLayoutBuilderCompat.java */
    /* renamed from: com.google.android.material.internal.j$a */
    /* loaded from: classes.dex */
    public static class C3639a extends Exception {
        C3639a(Throwable th2) {
            super("Error thrown initializing StaticLayout " + th2.getMessage(), th2);
        }
    }

    static {
        f10203n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private C3638j(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f10207a = charSequence;
        this.f10208b = textPaint;
        this.f10209c = i;
        this.f10211e = charSequence.length();
    }

    /* renamed from: b */
    private void m29531b() throws C3639a {
        Class<?> cls;
        if (f10204o) {
            return;
        }
        try {
            boolean z = this.f10218l && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f10206q = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = C3638j.class.getClassLoader();
                String str = this.f10218l ? "RTL" : "LTR";
                Class<?> loadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> loadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f10206q = loadClass2.getField(str).get(loadClass2);
                cls = loadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f10205p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f10204o = true;
        } catch (Exception e) {
            throw new C3639a(e);
        }
    }

    /* renamed from: c */
    public static C3638j m29530c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new C3638j(charSequence, textPaint, i);
    }

    /* renamed from: a */
    public StaticLayout m29532a() throws C3639a {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f10207a == null) {
            this.f10207a = BuildConfig.VERSION_NAME;
        }
        int max = Math.max(0, this.f10209c);
        CharSequence charSequence = this.f10207a;
        if (this.f10213g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f10208b, max, this.f10219m);
        }
        int min = Math.min(charSequence.length(), this.f10211e);
        this.f10211e = min;
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.f10218l && this.f10213g == 1) {
                this.f10212f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f10210d, min, this.f10208b, max);
            obtain.setAlignment(this.f10212f);
            obtain.setIncludePad(this.f10217k);
            if (this.f10218l) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f10219m;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f10213g);
            float f = this.f10214h;
            if (f != 0.0f || this.f10215i != 1.0f) {
                obtain.setLineSpacing(f, this.f10215i);
            }
            if (this.f10213g > 1) {
                obtain.setHyphenationFrequency(this.f10216j);
            }
            return obtain.build();
        }
        m29531b();
        try {
            return (StaticLayout) ((Constructor) C1076h.m38619f(f10205p)).newInstance(charSequence, Integer.valueOf(this.f10210d), Integer.valueOf(this.f10211e), this.f10208b, Integer.valueOf(max), this.f10212f, C1076h.m38619f(f10206q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f10217k), null, Integer.valueOf(max), Integer.valueOf(this.f10213g));
        } catch (Exception e) {
            throw new C3639a(e);
        }
    }

    /* renamed from: d */
    public C3638j m29529d(Layout.Alignment alignment) {
        this.f10212f = alignment;
        return this;
    }

    /* renamed from: e */
    public C3638j m29528e(TextUtils.TruncateAt truncateAt) {
        this.f10219m = truncateAt;
        return this;
    }

    /* renamed from: f */
    public C3638j m29527f(int i) {
        this.f10216j = i;
        return this;
    }

    /* renamed from: g */
    public C3638j m29526g(boolean z) {
        this.f10217k = z;
        return this;
    }

    /* renamed from: h */
    public C3638j m29525h(boolean z) {
        this.f10218l = z;
        return this;
    }

    /* renamed from: i */
    public C3638j m29524i(float f, float f2) {
        this.f10214h = f;
        this.f10215i = f2;
        return this;
    }

    /* renamed from: j */
    public C3638j m29523j(int i) {
        this.f10213g = i;
        return this;
    }
}
