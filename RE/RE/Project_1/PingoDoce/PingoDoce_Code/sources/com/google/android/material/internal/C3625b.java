package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.C1059f;
import androidx.core.text.InterfaceC1058e;
import androidx.core.util.C1076h;
import androidx.core.view.C1112b0;
import androidx.core.view.C1158f;
import com.google.android.material.internal.C3638j;
import p120g8.C5616a;
import p170j2.C6298a;
import p198k8.C6608a;
import p354s8.C10083a;
import p354s8.C10087d;
import p354s8.C10092g;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes.dex */
public final class C3625b {

    /* renamed from: t0 */
    private static final boolean f10109t0;

    /* renamed from: u0 */
    private static final Paint f10110u0;

    /* renamed from: A */
    private Typeface f10111A;

    /* renamed from: B */
    private Typeface f10112B;

    /* renamed from: C */
    private Typeface f10113C;

    /* renamed from: D */
    private Typeface f10114D;

    /* renamed from: E */
    private C10083a f10115E;

    /* renamed from: F */
    private C10083a f10116F;

    /* renamed from: G */
    private CharSequence f10117G;

    /* renamed from: H */
    private CharSequence f10118H;

    /* renamed from: I */
    private boolean f10119I;

    /* renamed from: K */
    private boolean f10121K;

    /* renamed from: L */
    private Bitmap f10122L;

    /* renamed from: M */
    private Paint f10123M;

    /* renamed from: N */
    private float f10124N;

    /* renamed from: O */
    private float f10125O;

    /* renamed from: P */
    private float f10126P;

    /* renamed from: Q */
    private float f10127Q;

    /* renamed from: R */
    private float f10128R;

    /* renamed from: S */
    private int f10129S;

    /* renamed from: T */
    private int[] f10130T;

    /* renamed from: U */
    private boolean f10131U;

    /* renamed from: V */
    private final TextPaint f10132V;

    /* renamed from: W */
    private final TextPaint f10133W;

    /* renamed from: X */
    private TimeInterpolator f10134X;

    /* renamed from: Y */
    private TimeInterpolator f10135Y;

    /* renamed from: Z */
    private float f10136Z;

    /* renamed from: a */
    private final View f10137a;

    /* renamed from: a0 */
    private float f10138a0;

    /* renamed from: b */
    private boolean f10139b;

    /* renamed from: b0 */
    private float f10140b0;

    /* renamed from: c */
    private float f10141c;

    /* renamed from: c0 */
    private ColorStateList f10142c0;

    /* renamed from: d */
    private boolean f10143d;

    /* renamed from: d0 */
    private float f10144d0;

    /* renamed from: e */
    private float f10145e;

    /* renamed from: e0 */
    private float f10146e0;

    /* renamed from: f */
    private float f10147f;

    /* renamed from: f0 */
    private float f10148f0;

    /* renamed from: g */
    private int f10149g;

    /* renamed from: g0 */
    private ColorStateList f10150g0;

    /* renamed from: h */
    private final Rect f10151h;

    /* renamed from: h0 */
    private float f10152h0;

    /* renamed from: i */
    private final Rect f10153i;

    /* renamed from: i0 */
    private float f10154i0;

    /* renamed from: j */
    private final RectF f10155j;

    /* renamed from: j0 */
    private float f10156j0;

    /* renamed from: k0 */
    private StaticLayout f10158k0;

    /* renamed from: l0 */
    private float f10160l0;

    /* renamed from: m0 */
    private float f10162m0;

    /* renamed from: n0 */
    private float f10164n0;

    /* renamed from: o */
    private ColorStateList f10165o;

    /* renamed from: o0 */
    private CharSequence f10166o0;

    /* renamed from: p */
    private ColorStateList f10167p;

    /* renamed from: q */
    private int f10169q;

    /* renamed from: r */
    private float f10171r;

    /* renamed from: s */
    private float f10173s;

    /* renamed from: t */
    private float f10175t;

    /* renamed from: u */
    private float f10176u;

    /* renamed from: v */
    private float f10177v;

    /* renamed from: w */
    private float f10178w;

    /* renamed from: x */
    private Typeface f10179x;

    /* renamed from: y */
    private Typeface f10180y;

    /* renamed from: z */
    private Typeface f10181z;

    /* renamed from: k */
    private int f10157k = 16;

    /* renamed from: l */
    private int f10159l = 16;

    /* renamed from: m */
    private float f10161m = 15.0f;

    /* renamed from: n */
    private float f10163n = 15.0f;

    /* renamed from: J */
    private boolean f10120J = true;

    /* renamed from: p0 */
    private int f10168p0 = 1;

    /* renamed from: q0 */
    private float f10170q0 = 0.0f;

    /* renamed from: r0 */
    private float f10172r0 = 1.0f;

    /* renamed from: s0 */
    private int f10174s0 = C3638j.f10203n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.b$a */
    /* loaded from: classes.dex */
    public class C3626a implements C10083a.InterfaceC10084a {
        C3626a() {
        }

        @Override // p354s8.C10083a.InterfaceC10084a
        /* renamed from: a */
        public void mo9235a(Typeface typeface) {
            C3625b.this.m29587h0(typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollapsingTextHelper.java */
    /* renamed from: com.google.android.material.internal.b$b */
    /* loaded from: classes.dex */
    public class C3627b implements C10083a.InterfaceC10084a {
        C3627b() {
        }

        @Override // p354s8.C10083a.InterfaceC10084a
        /* renamed from: a */
        public void mo9235a(Typeface typeface) {
            C3625b.this.m29565s0(typeface);
        }
    }

    static {
        f10109t0 = Build.VERSION.SDK_INT < 18;
        f10110u0 = null;
    }

    public C3625b(View view) {
        this.f10137a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f10132V = textPaint;
        this.f10133W = new TextPaint(textPaint);
        this.f10153i = new Rect();
        this.f10151h = new Rect();
        this.f10155j = new RectF();
        this.f10147f = m29594e();
        m29607V(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: I0 */
    private boolean m29620I0() {
        return this.f10168p0 > 1 && (!this.f10119I || this.f10143d) && !this.f10121K;
    }

    /* renamed from: K */
    private Layout.Alignment m29618K() {
        int m38197b = C1158f.m38197b(this.f10157k, this.f10119I ? 1 : 0) & 7;
        if (m38197b != 1) {
            return m38197b != 5 ? this.f10119I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f10119I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: N */
    private void m29615N(TextPaint textPaint) {
        textPaint.setTextSize(this.f10163n);
        textPaint.setTypeface(this.f10179x);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f10152h0);
        }
    }

    /* renamed from: O */
    private void m29614O(TextPaint textPaint) {
        textPaint.setTextSize(this.f10161m);
        textPaint.setTypeface(this.f10111A);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.f10154i0);
        }
    }

    /* renamed from: P */
    private void m29613P(float f) {
        if (this.f10143d) {
            this.f10155j.set(f < this.f10147f ? this.f10151h : this.f10153i);
            return;
        }
        this.f10155j.left = m29608U(this.f10151h.left, this.f10153i.left, f, this.f10134X);
        this.f10155j.top = m29608U(this.f10171r, this.f10173s, f, this.f10134X);
        this.f10155j.right = m29608U(this.f10151h.right, this.f10153i.right, f, this.f10134X);
        this.f10155j.bottom = m29608U(this.f10151h.bottom, this.f10153i.bottom, f, this.f10134X);
    }

    /* renamed from: Q */
    private static boolean m29612Q(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: R */
    private boolean m29611R() {
        return C1112b0.m38476E(this.f10137a) == 1;
    }

    /* renamed from: T */
    private boolean m29609T(CharSequence charSequence, boolean z) {
        InterfaceC1058e interfaceC1058e;
        if (z) {
            interfaceC1058e = C1059f.f3398d;
        } else {
            interfaceC1058e = C1059f.f3397c;
        }
        return interfaceC1058e.mo38641a(charSequence, 0, charSequence.length());
    }

    /* renamed from: U */
    private static float m29608U(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C5616a.m23565a(f, f2, f3);
    }

    /* renamed from: W */
    private float m29606W(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    private static int m29602a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: a0 */
    private static boolean m29601a0(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: b */
    private void m29600b(boolean z) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        m29586i(1.0f, z);
        CharSequence charSequence = this.f10118H;
        if (charSequence != null && (staticLayout2 = this.f10158k0) != null) {
            this.f10166o0 = TextUtils.ellipsize(charSequence, this.f10132V, staticLayout2.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f10166o0;
        float f = 0.0f;
        if (charSequence2 != null) {
            this.f10160l0 = m29606W(this.f10132V, charSequence2);
        } else {
            this.f10160l0 = 0.0f;
        }
        int m38197b = C1158f.m38197b(this.f10159l, this.f10119I ? 1 : 0);
        int i = m38197b & 112;
        if (i == 48) {
            this.f10173s = this.f10153i.top;
        } else if (i != 80) {
            this.f10173s = this.f10153i.centerY() - ((this.f10132V.descent() - this.f10132V.ascent()) / 2.0f);
        } else {
            this.f10173s = this.f10153i.bottom + this.f10132V.ascent();
        }
        int i2 = m38197b & 8388615;
        if (i2 == 1) {
            this.f10176u = this.f10153i.centerX() - (this.f10160l0 / 2.0f);
        } else if (i2 != 5) {
            this.f10176u = this.f10153i.left;
        } else {
            this.f10176u = this.f10153i.right - this.f10160l0;
        }
        m29586i(0.0f, z);
        float height = this.f10158k0 != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f10158k0;
        if (staticLayout3 != null && this.f10168p0 > 1) {
            f = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.f10118H;
            if (charSequence3 != null) {
                f = m29606W(this.f10132V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f10158k0;
        this.f10169q = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int m38197b2 = C1158f.m38197b(this.f10157k, this.f10119I ? 1 : 0);
        int i3 = m38197b2 & 112;
        if (i3 == 48) {
            this.f10171r = this.f10151h.top;
        } else if (i3 != 80) {
            this.f10171r = this.f10151h.centerY() - (height / 2.0f);
        } else {
            this.f10171r = (this.f10151h.bottom - height) + this.f10132V.descent();
        }
        int i4 = m38197b2 & 8388615;
        if (i4 == 1) {
            this.f10175t = this.f10151h.centerX() - (f / 2.0f);
        } else if (i4 != 5) {
            this.f10175t = this.f10151h.left;
        } else {
            this.f10175t = this.f10151h.right - f;
        }
        m29584j();
        m29553y0(this.f10141c);
    }

    /* renamed from: c */
    private void m29598c() {
        m29590g(this.f10141c);
    }

    /* renamed from: d */
    private float m29596d(float f) {
        float f2 = this.f10147f;
        if (f <= f2) {
            return C5616a.m23564b(1.0f, 0.0f, this.f10145e, f2, f);
        }
        return C5616a.m23564b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    private float m29594e() {
        float f = this.f10145e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: e0 */
    private void m29593e0(float f) {
        this.f10162m0 = f;
        C1112b0.m38423j0(this.f10137a);
    }

    /* renamed from: f */
    private boolean m29592f(CharSequence charSequence) {
        boolean m29611R = m29611R();
        return this.f10120J ? m29609T(charSequence, m29611R) : m29611R;
    }

    /* renamed from: g */
    private void m29590g(float f) {
        float f2;
        m29613P(f);
        if (this.f10143d) {
            if (f < this.f10147f) {
                this.f10177v = this.f10175t;
                this.f10178w = this.f10171r;
                m29553y0(0.0f);
                f2 = 0.0f;
            } else {
                this.f10177v = this.f10176u;
                this.f10178w = this.f10173s - Math.max(0, this.f10149g);
                m29553y0(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.f10177v = m29608U(this.f10175t, this.f10176u, f, this.f10134X);
            this.f10178w = m29608U(this.f10171r, this.f10173s, f, this.f10134X);
            m29553y0(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = C5616a.f15854b;
        m29593e0(1.0f - m29608U(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m29573o0(m29608U(1.0f, 0.0f, f, timeInterpolator));
        if (this.f10167p != this.f10165o) {
            this.f10132V.setColor(m29602a(m29556x(), m29560v(), f2));
        } else {
            this.f10132V.setColor(m29560v());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.f10152h0;
            float f4 = this.f10154i0;
            if (f3 != f4) {
                this.f10132V.setLetterSpacing(m29608U(f4, f3, f, timeInterpolator));
            } else {
                this.f10132V.setLetterSpacing(f3);
            }
        }
        this.f10126P = m29608U(this.f10144d0, this.f10136Z, f, null);
        this.f10127Q = m29608U(this.f10146e0, this.f10138a0, f, null);
        this.f10128R = m29608U(this.f10148f0, this.f10140b0, f, null);
        int m29602a = m29602a(m29558w(this.f10150g0), m29558w(this.f10142c0), f);
        this.f10129S = m29602a;
        this.f10132V.setShadowLayer(this.f10126P, this.f10127Q, this.f10128R, m29602a);
        if (this.f10143d) {
            this.f10132V.setAlpha((int) (m29596d(f) * this.f10132V.getAlpha()));
        }
        C1112b0.m38423j0(this.f10137a);
    }

    /* renamed from: h */
    private void m29588h(float f) {
        m29586i(f, false);
    }

    /* renamed from: i */
    private void m29586i(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        boolean z3;
        if (this.f10117G == null) {
            return;
        }
        float width = this.f10153i.width();
        float width2 = this.f10151h.width();
        if (m29612Q(f, 1.0f)) {
            f2 = this.f10163n;
            f3 = this.f10152h0;
            this.f10124N = 1.0f;
            Typeface typeface = this.f10114D;
            Typeface typeface2 = this.f10179x;
            if (typeface != typeface2) {
                this.f10114D = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.f10161m;
            float f5 = this.f10154i0;
            Typeface typeface3 = this.f10114D;
            Typeface typeface4 = this.f10111A;
            if (typeface3 != typeface4) {
                this.f10114D = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (m29612Q(f, 0.0f)) {
                this.f10124N = 1.0f;
            } else {
                this.f10124N = m29608U(this.f10161m, this.f10163n, f, this.f10135Y) / this.f10161m;
            }
            float f6 = this.f10163n / this.f10161m;
            width = (!z && width2 * f6 > width) ? Math.min(width / f6, width2) : width2;
            f2 = f4;
            f3 = f5;
            z3 = z2;
        }
        if (width > 0.0f) {
            z3 = ((this.f10125O > f2 ? 1 : (this.f10125O == f2 ? 0 : -1)) != 0) || ((this.f10156j0 > f3 ? 1 : (this.f10156j0 == f3 ? 0 : -1)) != 0) || this.f10131U || z3;
            this.f10125O = f2;
            this.f10156j0 = f3;
            this.f10131U = false;
        }
        if (this.f10118H == null || z3) {
            this.f10132V.setTextSize(this.f10125O);
            this.f10132V.setTypeface(this.f10114D);
            if (Build.VERSION.SDK_INT >= 21) {
                this.f10132V.setLetterSpacing(this.f10156j0);
            }
            this.f10132V.setLinearText(this.f10124N != 1.0f);
            this.f10119I = m29592f(this.f10117G);
            StaticLayout m29582k = m29582k(m29620I0() ? this.f10168p0 : 1, width, this.f10119I);
            this.f10158k0 = m29582k;
            this.f10118H = m29582k.getText();
        }
    }

    /* renamed from: i0 */
    private boolean m29585i0(Typeface typeface) {
        C10083a c10083a = this.f10116F;
        if (c10083a != null) {
            c10083a.m9237c();
        }
        if (this.f10181z != typeface) {
            this.f10181z = typeface;
            Typeface m9197b = C10092g.m9197b(this.f10137a.getContext().getResources().getConfiguration(), typeface);
            this.f10180y = m9197b;
            if (m9197b == null) {
                m9197b = this.f10181z;
            }
            this.f10179x = m9197b;
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m29584j() {
        Bitmap bitmap = this.f10122L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f10122L = null;
        }
    }

    /* renamed from: k */
    private StaticLayout m29582k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        try {
            staticLayout = C3638j.m29530c(this.f10117G, this.f10132V, (int) f).m29528e(TextUtils.TruncateAt.END).m29525h(z).m29529d(i == 1 ? Layout.Alignment.ALIGN_NORMAL : m29618K()).m29526g(false).m29523j(i).m29524i(this.f10170q0, this.f10172r0).m29527f(this.f10174s0).m29532a();
        } catch (C3638j.C3639a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C1076h.m38619f(staticLayout);
    }

    /* renamed from: m */
    private void m29578m(Canvas canvas, float f, float f2) {
        int alpha = this.f10132V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f10132V.setAlpha((int) (this.f10164n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f10132V;
            textPaint.setShadowLayer(this.f10126P, this.f10127Q, this.f10128R, C6608a.m20507a(this.f10129S, textPaint.getAlpha()));
        }
        this.f10158k0.draw(canvas);
        this.f10132V.setAlpha((int) (this.f10162m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f10132V;
            textPaint2.setShadowLayer(this.f10126P, this.f10127Q, this.f10128R, C6608a.m20507a(this.f10129S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f10158k0.getLineBaseline(0);
        CharSequence charSequence = this.f10166o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f10132V);
        if (i >= 31) {
            this.f10132V.setShadowLayer(this.f10126P, this.f10127Q, this.f10128R, this.f10129S);
        }
        if (this.f10143d) {
            return;
        }
        String trim = this.f10166o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f10132V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f10158k0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.f10132V);
    }

    /* renamed from: n */
    private void m29576n() {
        if (this.f10122L != null || this.f10151h.isEmpty() || TextUtils.isEmpty(this.f10118H)) {
            return;
        }
        m29590g(0.0f);
        int width = this.f10158k0.getWidth();
        int height = this.f10158k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f10122L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f10158k0.draw(new Canvas(this.f10122L));
        if (this.f10123M == null) {
            this.f10123M = new Paint(3);
        }
    }

    /* renamed from: o0 */
    private void m29573o0(float f) {
        this.f10164n0 = f;
        C1112b0.m38423j0(this.f10137a);
    }

    /* renamed from: s */
    private float m29566s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (this.f10160l0 / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10119I ? this.f10153i.left : this.f10153i.right - this.f10160l0 : this.f10119I ? this.f10153i.right - this.f10160l0 : this.f10153i.left;
    }

    /* renamed from: t */
    private float m29564t(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (this.f10160l0 / 2.0f);
        }
        return ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) ? this.f10119I ? rectF.left + this.f10160l0 : this.f10153i.right : this.f10119I ? this.f10153i.right : rectF.left + this.f10160l0;
    }

    /* renamed from: t0 */
    private boolean m29563t0(Typeface typeface) {
        C10083a c10083a = this.f10115E;
        if (c10083a != null) {
            c10083a.m9237c();
        }
        if (this.f10113C != typeface) {
            this.f10113C = typeface;
            Typeface m9197b = C10092g.m9197b(this.f10137a.getContext().getResources().getConfiguration(), typeface);
            this.f10112B = m9197b;
            if (m9197b == null) {
                m9197b = this.f10113C;
            }
            this.f10111A = m9197b;
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private int m29558w(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10130T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: x */
    private int m29556x() {
        return m29558w(this.f10165o);
    }

    /* renamed from: y0 */
    private void m29553y0(float f) {
        m29588h(f);
        boolean z = f10109t0 && this.f10124N != 1.0f;
        this.f10121K = z;
        if (z) {
            m29576n();
        }
        C1112b0.m38423j0(this.f10137a);
    }

    /* renamed from: A */
    public int m29637A() {
        return this.f10157k;
    }

    /* renamed from: A0 */
    public void m29636A0(float f) {
        this.f10172r0 = f;
    }

    /* renamed from: B */
    public float m29635B() {
        m29614O(this.f10133W);
        return -this.f10133W.ascent();
    }

    /* renamed from: B0 */
    public void m29634B0(int i) {
        if (i != this.f10168p0) {
            this.f10168p0 = i;
            m29584j();
            m29604Y();
        }
    }

    /* renamed from: C */
    public Typeface m29633C() {
        Typeface typeface = this.f10111A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: C0 */
    public void m29632C0(TimeInterpolator timeInterpolator) {
        this.f10134X = timeInterpolator;
        m29604Y();
    }

    /* renamed from: D */
    public float m29631D() {
        return this.f10141c;
    }

    /* renamed from: D0 */
    public void m29630D0(boolean z) {
        this.f10120J = z;
    }

    /* renamed from: E */
    public float m29629E() {
        return this.f10147f;
    }

    /* renamed from: E0 */
    public final boolean m29628E0(int[] iArr) {
        this.f10130T = iArr;
        if (m29610S()) {
            m29604Y();
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public int m29627F() {
        return this.f10174s0;
    }

    /* renamed from: F0 */
    public void m29626F0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f10117G, charSequence)) {
            this.f10117G = charSequence;
            this.f10118H = null;
            m29584j();
            m29604Y();
        }
    }

    /* renamed from: G */
    public int m29625G() {
        StaticLayout staticLayout = this.f10158k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    /* renamed from: G0 */
    public void m29624G0(TimeInterpolator timeInterpolator) {
        this.f10135Y = timeInterpolator;
        m29604Y();
    }

    /* renamed from: H */
    public float m29623H() {
        return this.f10158k0.getSpacingAdd();
    }

    /* renamed from: H0 */
    public void m29622H0(Typeface typeface) {
        boolean m29585i0 = m29585i0(typeface);
        boolean m29563t0 = m29563t0(typeface);
        if (m29585i0 || m29563t0) {
            m29604Y();
        }
    }

    /* renamed from: I */
    public float m29621I() {
        return this.f10158k0.getSpacingMultiplier();
    }

    /* renamed from: J */
    public int m29619J() {
        return this.f10168p0;
    }

    /* renamed from: L */
    public TimeInterpolator m29617L() {
        return this.f10134X;
    }

    /* renamed from: M */
    public CharSequence m29616M() {
        return this.f10117G;
    }

    /* renamed from: S */
    public final boolean m29610S() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f10167p;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f10165o) != null && colorStateList.isStateful());
    }

    /* renamed from: V */
    public void m29607V(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10181z;
            if (typeface != null) {
                this.f10180y = C10092g.m9197b(configuration, typeface);
            }
            Typeface typeface2 = this.f10113C;
            if (typeface2 != null) {
                this.f10112B = C10092g.m9197b(configuration, typeface2);
            }
            Typeface typeface3 = this.f10180y;
            if (typeface3 == null) {
                typeface3 = this.f10181z;
            }
            this.f10179x = typeface3;
            Typeface typeface4 = this.f10112B;
            if (typeface4 == null) {
                typeface4 = this.f10113C;
            }
            this.f10111A = typeface4;
            m29603Z(true);
        }
    }

    /* renamed from: X */
    void m29605X() {
        this.f10139b = this.f10153i.width() > 0 && this.f10153i.height() > 0 && this.f10151h.width() > 0 && this.f10151h.height() > 0;
    }

    /* renamed from: Y */
    public void m29604Y() {
        m29603Z(false);
    }

    /* renamed from: Z */
    public void m29603Z(boolean z) {
        if ((this.f10137a.getHeight() <= 0 || this.f10137a.getWidth() <= 0) && !z) {
            return;
        }
        m29600b(z);
        m29598c();
    }

    /* renamed from: b0 */
    public void m29599b0(int i, int i2, int i3, int i4) {
        if (m29601a0(this.f10153i, i, i2, i3, i4)) {
            return;
        }
        this.f10153i.set(i, i2, i3, i4);
        this.f10131U = true;
        m29605X();
    }

    /* renamed from: c0 */
    public void m29597c0(Rect rect) {
        m29599b0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d0 */
    public void m29595d0(int i) {
        C10087d c10087d = new C10087d(this.f10137a.getContext(), i);
        if (c10087d.m9211i() != null) {
            this.f10167p = c10087d.m9211i();
        }
        if (c10087d.m9210j() != 0.0f) {
            this.f10163n = c10087d.m9210j();
        }
        ColorStateList colorStateList = c10087d.f26343a;
        if (colorStateList != null) {
            this.f10142c0 = colorStateList;
        }
        this.f10138a0 = c10087d.f26347e;
        this.f10140b0 = c10087d.f26348f;
        this.f10136Z = c10087d.f26349g;
        this.f10152h0 = c10087d.f26351i;
        C10083a c10083a = this.f10116F;
        if (c10083a != null) {
            c10083a.m9237c();
        }
        this.f10116F = new C10083a(new C3626a(), c10087d.m9215e());
        c10087d.m9212h(this.f10137a.getContext(), this.f10116F);
        m29604Y();
    }

    /* renamed from: f0 */
    public void m29591f0(ColorStateList colorStateList) {
        if (this.f10167p != colorStateList) {
            this.f10167p = colorStateList;
            m29604Y();
        }
    }

    /* renamed from: g0 */
    public void m29589g0(int i) {
        if (this.f10159l != i) {
            this.f10159l = i;
            m29604Y();
        }
    }

    /* renamed from: h0 */
    public void m29587h0(Typeface typeface) {
        if (m29585i0(typeface)) {
            m29604Y();
        }
    }

    /* renamed from: j0 */
    public void m29583j0(int i) {
        this.f10149g = i;
    }

    /* renamed from: k0 */
    public void m29581k0(int i, int i2, int i3, int i4) {
        if (m29601a0(this.f10151h, i, i2, i3, i4)) {
            return;
        }
        this.f10151h.set(i, i2, i3, i4);
        this.f10131U = true;
        m29605X();
    }

    /* renamed from: l */
    public void m29580l(Canvas canvas) {
        int save = canvas.save();
        if (this.f10118H == null || !this.f10139b) {
            return;
        }
        this.f10132V.setTextSize(this.f10125O);
        float f = this.f10177v;
        float f2 = this.f10178w;
        boolean z = this.f10121K && this.f10122L != null;
        float f3 = this.f10124N;
        if (f3 != 1.0f && !this.f10143d) {
            canvas.scale(f3, f3, f, f2);
        }
        if (z) {
            canvas.drawBitmap(this.f10122L, f, f2, this.f10123M);
            canvas.restoreToCount(save);
            return;
        }
        if (m29620I0() && (!this.f10143d || this.f10141c > this.f10147f)) {
            m29578m(canvas, this.f10177v - this.f10158k0.getLineStart(0), f2);
        } else {
            canvas.translate(f, f2);
            this.f10158k0.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    /* renamed from: l0 */
    public void m29579l0(Rect rect) {
        m29581k0(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: m0 */
    public void m29577m0(float f) {
        if (this.f10154i0 != f) {
            this.f10154i0 = f;
            m29604Y();
        }
    }

    /* renamed from: n0 */
    public void m29575n0(int i) {
        C10087d c10087d = new C10087d(this.f10137a.getContext(), i);
        if (c10087d.m9211i() != null) {
            this.f10165o = c10087d.m9211i();
        }
        if (c10087d.m9210j() != 0.0f) {
            this.f10161m = c10087d.m9210j();
        }
        ColorStateList colorStateList = c10087d.f26343a;
        if (colorStateList != null) {
            this.f10150g0 = colorStateList;
        }
        this.f10146e0 = c10087d.f26347e;
        this.f10148f0 = c10087d.f26348f;
        this.f10144d0 = c10087d.f26349g;
        this.f10154i0 = c10087d.f26351i;
        C10083a c10083a = this.f10115E;
        if (c10083a != null) {
            c10083a.m9237c();
        }
        this.f10115E = new C10083a(new C3627b(), c10087d.m9215e());
        c10087d.m9212h(this.f10137a.getContext(), this.f10115E);
        m29604Y();
    }

    /* renamed from: o */
    public void m29574o(RectF rectF, int i, int i2) {
        this.f10119I = m29592f(this.f10117G);
        rectF.left = m29566s(i, i2);
        rectF.top = this.f10153i.top;
        rectF.right = m29564t(rectF, i, i2);
        rectF.bottom = this.f10153i.top + m29568r();
    }

    /* renamed from: p */
    public ColorStateList m29572p() {
        return this.f10167p;
    }

    /* renamed from: p0 */
    public void m29571p0(ColorStateList colorStateList) {
        if (this.f10165o != colorStateList) {
            this.f10165o = colorStateList;
            m29604Y();
        }
    }

    /* renamed from: q */
    public int m29570q() {
        return this.f10159l;
    }

    /* renamed from: q0 */
    public void m29569q0(int i) {
        if (this.f10157k != i) {
            this.f10157k = i;
            m29604Y();
        }
    }

    /* renamed from: r */
    public float m29568r() {
        m29615N(this.f10133W);
        return -this.f10133W.ascent();
    }

    /* renamed from: r0 */
    public void m29567r0(float f) {
        if (this.f10161m != f) {
            this.f10161m = f;
            m29604Y();
        }
    }

    /* renamed from: s0 */
    public void m29565s0(Typeface typeface) {
        if (m29563t0(typeface)) {
            m29604Y();
        }
    }

    /* renamed from: u */
    public Typeface m29562u() {
        Typeface typeface = this.f10179x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    /* renamed from: u0 */
    public void m29561u0(float f) {
        float m21278a = C6298a.m21278a(f, 0.0f, 1.0f);
        if (m21278a != this.f10141c) {
            this.f10141c = m21278a;
            m29598c();
        }
    }

    /* renamed from: v */
    public int m29560v() {
        return m29558w(this.f10167p);
    }

    /* renamed from: v0 */
    public void m29559v0(boolean z) {
        this.f10143d = z;
    }

    /* renamed from: w0 */
    public void m29557w0(float f) {
        this.f10145e = f;
        this.f10147f = m29594e();
    }

    /* renamed from: x0 */
    public void m29555x0(int i) {
        this.f10174s0 = i;
    }

    /* renamed from: y */
    public int m29554y() {
        return this.f10169q;
    }

    /* renamed from: z */
    public float m29552z() {
        m29614O(this.f10133W);
        return (-this.f10133W.ascent()) + this.f10133W.descent();
    }

    /* renamed from: z0 */
    public void m29551z0(float f) {
        this.f10170q0 = f;
    }
}
