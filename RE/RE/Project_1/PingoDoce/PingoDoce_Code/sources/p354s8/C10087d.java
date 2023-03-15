package p354s8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0955h;
import p100f8.C5429l;

/* renamed from: s8.d */
/* loaded from: classes.dex */
public class C10087d {

    /* renamed from: a */
    public final ColorStateList f26343a;

    /* renamed from: b */
    public final String f26344b;

    /* renamed from: c */
    public final int f26345c;

    /* renamed from: d */
    public final int f26346d;

    /* renamed from: e */
    public final float f26347e;

    /* renamed from: f */
    public final float f26348f;

    /* renamed from: g */
    public final float f26349g;

    /* renamed from: h */
    public final boolean f26350h;

    /* renamed from: i */
    public final float f26351i;

    /* renamed from: j */
    private ColorStateList f26352j;

    /* renamed from: k */
    private float f26353k;

    /* renamed from: l */
    private final int f26354l;

    /* renamed from: m */
    private boolean f26355m = false;

    /* renamed from: n */
    private Typeface f26356n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: s8.d$a */
    /* loaded from: classes.dex */
    public class C10088a extends C0955h.AbstractC0961f {

        /* renamed from: a */
        final /* synthetic */ AbstractC10091f f26357a;

        C10088a(AbstractC10091f abstractC10091f) {
            this.f26357a = abstractC10091f;
        }

        @Override // androidx.core.content.res.C0955h.AbstractC0961f
        /* renamed from: h */
        public void mo9203h(int i) {
            C10087d.this.f26355m = true;
            this.f26357a.mo9200a(i);
        }

        @Override // androidx.core.content.res.C0955h.AbstractC0961f
        /* renamed from: i */
        public void mo9202i(Typeface typeface) {
            C10087d c10087d = C10087d.this;
            c10087d.f26356n = Typeface.create(typeface, c10087d.f26345c);
            C10087d.this.f26355m = true;
            this.f26357a.mo9199b(C10087d.this.f26356n, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextAppearance.java */
    /* renamed from: s8.d$b */
    /* loaded from: classes.dex */
    public class C10089b extends AbstractC10091f {

        /* renamed from: a */
        final /* synthetic */ Context f26359a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f26360b;

        /* renamed from: c */
        final /* synthetic */ AbstractC10091f f26361c;

        C10089b(Context context, TextPaint textPaint, AbstractC10091f abstractC10091f) {
            this.f26359a = context;
            this.f26360b = textPaint;
            this.f26361c = abstractC10091f;
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: a */
        public void mo9200a(int i) {
            this.f26361c.mo9200a(i);
        }

        @Override // p354s8.AbstractC10091f
        /* renamed from: b */
        public void mo9199b(Typeface typeface, boolean z) {
            C10087d.this.m9204p(this.f26359a, this.f26360b, typeface);
            this.f26361c.mo9199b(typeface, z);
        }
    }

    public C10087d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C5429l.f14913C5);
        m9208l(obtainStyledAttributes.getDimension(C5429l.f14921D5, 0.0f));
        m9209k(C10086c.m9229a(context, obtainStyledAttributes, C5429l.f14945G5));
        C10086c.m9229a(context, obtainStyledAttributes, C5429l.f14953H5);
        C10086c.m9229a(context, obtainStyledAttributes, C5429l.f14961I5);
        this.f26345c = obtainStyledAttributes.getInt(C5429l.f14937F5, 0);
        this.f26346d = obtainStyledAttributes.getInt(C5429l.f14929E5, 1);
        int m9224f = C10086c.m9224f(obtainStyledAttributes, C5429l.f15009O5, C5429l.f15001N5);
        this.f26354l = obtainStyledAttributes.getResourceId(m9224f, 0);
        this.f26344b = obtainStyledAttributes.getString(m9224f);
        obtainStyledAttributes.getBoolean(C5429l.f15017P5, false);
        this.f26343a = C10086c.m9229a(context, obtainStyledAttributes, C5429l.f14969J5);
        this.f26347e = obtainStyledAttributes.getFloat(C5429l.f14977K5, 0.0f);
        this.f26348f = obtainStyledAttributes.getFloat(C5429l.f14985L5, 0.0f);
        this.f26349g = obtainStyledAttributes.getFloat(C5429l.f14993M5, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C5429l.f15039S3);
            int i2 = C5429l.f15047T3;
            this.f26350h = obtainStyledAttributes2.hasValue(i2);
            this.f26351i = obtainStyledAttributes2.getFloat(i2, 0.0f);
            obtainStyledAttributes2.recycle();
            return;
        }
        this.f26350h = false;
        this.f26351i = 0.0f;
    }

    /* renamed from: d */
    private void m9216d() {
        String str;
        if (this.f26356n == null && (str = this.f26344b) != null) {
            this.f26356n = Typeface.create(str, this.f26345c);
        }
        if (this.f26356n == null) {
            int i = this.f26346d;
            if (i == 1) {
                this.f26356n = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.f26356n = Typeface.SERIF;
            } else if (i != 3) {
                this.f26356n = Typeface.DEFAULT;
            } else {
                this.f26356n = Typeface.MONOSPACE;
            }
            this.f26356n = Typeface.create(this.f26356n, this.f26345c);
        }
    }

    /* renamed from: m */
    private boolean m9207m(Context context) {
        if (C10090e.m9201a()) {
            return true;
        }
        int i = this.f26354l;
        return (i != 0 ? C0955h.m38998c(context, i) : null) != null;
    }

    /* renamed from: e */
    public Typeface m9215e() {
        m9216d();
        return this.f26356n;
    }

    /* renamed from: f */
    public Typeface m9214f(Context context) {
        if (this.f26355m) {
            return this.f26356n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m38994g = C0955h.m38994g(context, this.f26354l);
                this.f26356n = m38994g;
                if (m38994g != null) {
                    this.f26356n = Typeface.create(m38994g, this.f26345c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f26344b, e);
            }
        }
        m9216d();
        this.f26355m = true;
        return this.f26356n;
    }

    /* renamed from: g */
    public void m9213g(Context context, TextPaint textPaint, AbstractC10091f abstractC10091f) {
        m9204p(context, textPaint, m9215e());
        m9212h(context, new C10089b(context, textPaint, abstractC10091f));
    }

    /* renamed from: h */
    public void m9212h(Context context, AbstractC10091f abstractC10091f) {
        if (m9207m(context)) {
            m9214f(context);
        } else {
            m9216d();
        }
        int i = this.f26354l;
        if (i == 0) {
            this.f26355m = true;
        }
        if (this.f26355m) {
            abstractC10091f.mo9199b(this.f26356n, true);
            return;
        }
        try {
            C0955h.m38992i(context, i, new C10088a(abstractC10091f), null);
        } catch (Resources.NotFoundException unused) {
            this.f26355m = true;
            abstractC10091f.mo9200a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f26344b, e);
            this.f26355m = true;
            abstractC10091f.mo9200a(-3);
        }
    }

    /* renamed from: i */
    public ColorStateList m9211i() {
        return this.f26352j;
    }

    /* renamed from: j */
    public float m9210j() {
        return this.f26353k;
    }

    /* renamed from: k */
    public void m9209k(ColorStateList colorStateList) {
        this.f26352j = colorStateList;
    }

    /* renamed from: l */
    public void m9208l(float f) {
        this.f26353k = f;
    }

    /* renamed from: n */
    public void m9206n(Context context, TextPaint textPaint, AbstractC10091f abstractC10091f) {
        m9205o(context, textPaint, abstractC10091f);
        ColorStateList colorStateList = this.f26352j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f26349g;
        float f2 = this.f26347e;
        float f3 = this.f26348f;
        ColorStateList colorStateList2 = this.f26343a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: o */
    public void m9205o(Context context, TextPaint textPaint, AbstractC10091f abstractC10091f) {
        if (m9207m(context)) {
            m9204p(context, textPaint, m9214f(context));
        } else {
            m9213g(context, textPaint, abstractC10091f);
        }
    }

    /* renamed from: p */
    public void m9204p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface m9198a = C10092g.m9198a(context, typeface);
        if (m9198a != null) {
            typeface = m9198a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f26345c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f26353k);
        if (Build.VERSION.SDK_INT < 21 || !this.f26350h) {
            return;
        }
        textPaint.setLetterSpacing(this.f26351i);
    }
}
