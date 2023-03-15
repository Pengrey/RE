package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.C0945d;
import androidx.core.content.res.C0955h;
import androidx.core.content.res.C0967k;
import androidx.core.graphics.C0972c;
import androidx.core.graphics.drawable.C0981a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p301q.C9545a;

/* renamed from: androidx.vectordrawable.graphics.drawable.i */
/* loaded from: classes.dex */
public class C1704i extends AbstractC1703h {

    /* renamed from: F */
    static final PorterDuff.Mode f5177F = PorterDuff.Mode.SRC_IN;

    /* renamed from: A */
    private boolean f5178A;

    /* renamed from: B */
    private boolean f5179B;

    /* renamed from: C */
    private final float[] f5180C;

    /* renamed from: D */
    private final Matrix f5181D;

    /* renamed from: E */
    private final Rect f5182E;

    /* renamed from: x */
    private C1712h f5183x;

    /* renamed from: y */
    private PorterDuffColorFilter f5184y;

    /* renamed from: z */
    private ColorFilter f5185z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$b */
    /* loaded from: classes.dex */
    public static class C1706b extends AbstractC1710f {
        C1706b() {
        }

        /* renamed from: f */
        private void m35646f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5212b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5211a = C0972c.m38929d(string2);
            }
            this.f5213c = C0967k.m38965g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1704i.AbstractC1710f
        /* renamed from: c */
        public boolean mo35636c() {
            return true;
        }

        /* renamed from: e */
        public void m35647e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0967k.m38962j(xmlPullParser, "pathData")) {
                TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5152d);
                m35646f(m38961k, xmlPullParser);
                m38961k.recycle();
            }
        }

        C1706b(C1706b c1706b) {
            super(c1706b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1709e {
        private AbstractC1709e() {
        }

        /* renamed from: a */
        public boolean mo35638a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo35637b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$h */
    /* loaded from: classes.dex */
    public static class C1712h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5232a;

        /* renamed from: b */
        C1711g f5233b;

        /* renamed from: c */
        ColorStateList f5234c;

        /* renamed from: d */
        PorterDuff.Mode f5235d;

        /* renamed from: e */
        boolean f5236e;

        /* renamed from: f */
        Bitmap f5237f;

        /* renamed from: g */
        ColorStateList f5238g;

        /* renamed from: h */
        PorterDuff.Mode f5239h;

        /* renamed from: i */
        int f5240i;

        /* renamed from: j */
        boolean f5241j;

        /* renamed from: k */
        boolean f5242k;

        /* renamed from: l */
        Paint f5243l;

        public C1712h(C1712h c1712h) {
            this.f5234c = null;
            this.f5235d = C1704i.f5177F;
            if (c1712h != null) {
                this.f5232a = c1712h.f5232a;
                C1711g c1711g = new C1711g(c1712h.f5233b);
                this.f5233b = c1711g;
                if (c1712h.f5233b.f5220e != null) {
                    c1711g.f5220e = new Paint(c1712h.f5233b.f5220e);
                }
                if (c1712h.f5233b.f5219d != null) {
                    this.f5233b.f5219d = new Paint(c1712h.f5233b.f5219d);
                }
                this.f5234c = c1712h.f5234c;
                this.f5235d = c1712h.f5235d;
                this.f5236e = c1712h.f5236e;
            }
        }

        /* renamed from: a */
        public boolean m35627a(int i, int i2) {
            return i == this.f5237f.getWidth() && i2 == this.f5237f.getHeight();
        }

        /* renamed from: b */
        public boolean m35626b() {
            return !this.f5242k && this.f5238g == this.f5234c && this.f5239h == this.f5235d && this.f5241j == this.f5236e && this.f5240i == this.f5233b.getRootAlpha();
        }

        /* renamed from: c */
        public void m35625c(int i, int i2) {
            if (this.f5237f == null || !m35627a(i, i2)) {
                this.f5237f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5242k = true;
            }
        }

        /* renamed from: d */
        public void m35624d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5237f, (Rect) null, rect, m35623e(colorFilter));
        }

        /* renamed from: e */
        public Paint m35623e(ColorFilter colorFilter) {
            if (m35622f() || colorFilter != null) {
                if (this.f5243l == null) {
                    Paint paint = new Paint();
                    this.f5243l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f5243l.setAlpha(this.f5233b.getRootAlpha());
                this.f5243l.setColorFilter(colorFilter);
                return this.f5243l;
            }
            return null;
        }

        /* renamed from: f */
        public boolean m35622f() {
            return this.f5233b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean m35621g() {
            return this.f5233b.m35629f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5232a;
        }

        /* renamed from: h */
        public boolean m35620h(int[] iArr) {
            boolean m35628g = this.f5233b.m35628g(iArr);
            this.f5242k |= m35628g;
            return m35628g;
        }

        /* renamed from: i */
        public void m35619i() {
            this.f5238g = this.f5234c;
            this.f5239h = this.f5235d;
            this.f5240i = this.f5233b.getRootAlpha();
            this.f5241j = this.f5236e;
            this.f5242k = false;
        }

        /* renamed from: j */
        public void m35618j(int i, int i2) {
            this.f5237f.eraseColor(0);
            this.f5233b.m35633b(new Canvas(this.f5237f), i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C1704i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C1704i(this);
        }

        public C1712h() {
            this.f5234c = null;
            this.f5235d = C1704i.f5177F;
            this.f5233b = new C1711g();
        }
    }

    C1704i() {
        this.f5179B = true;
        this.f5180C = new float[9];
        this.f5181D = new Matrix();
        this.f5182E = new Rect();
        this.f5183x = new C1712h();
    }

    /* renamed from: a */
    static int m35657a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    /* renamed from: b */
    public static C1704i m35656b(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C1704i c1704i = new C1704i();
            c1704i.f5176w = C0955h.m38996e(resources, i, theme);
            new C1713i(c1704i.f5176w.getConstantState());
            return c1704i;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return m35655c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static C1704i m35655c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1704i c1704i = new C1704i();
        c1704i.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1704i;
    }

    /* renamed from: e */
    private void m35653e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1712h c1712h = this.f5183x;
        C1711g c1711g = c1712h.f5233b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c1711g.f5223h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1708d c1708d = (C1708d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1707c c1707c = new C1707c();
                    c1707c.m35643g(resources, attributeSet, theme, xmlPullParser);
                    c1708d.f5199b.add(c1707c);
                    if (c1707c.getPathName() != null) {
                        c1711g.f5231p.put(c1707c.getPathName(), c1707c);
                    }
                    z = false;
                    c1712h.f5232a = c1707c.f5214d | c1712h.f5232a;
                } else if ("clip-path".equals(name)) {
                    C1706b c1706b = new C1706b();
                    c1706b.m35647e(resources, attributeSet, theme, xmlPullParser);
                    c1708d.f5199b.add(c1706b);
                    if (c1706b.getPathName() != null) {
                        c1711g.f5231p.put(c1706b.getPathName(), c1706b);
                    }
                    c1712h.f5232a = c1706b.f5214d | c1712h.f5232a;
                } else if ("group".equals(name)) {
                    C1708d c1708d2 = new C1708d();
                    c1708d2.m35641c(resources, attributeSet, theme, xmlPullParser);
                    c1708d.f5199b.add(c1708d2);
                    arrayDeque.push(c1708d2);
                    if (c1708d2.getGroupName() != null) {
                        c1711g.f5231p.put(c1708d2.getGroupName(), c1708d2);
                    }
                    c1712h.f5232a = c1708d2.f5208k | c1712h.f5232a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m35652f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0981a.m38871f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m35651g(int i, PorterDuff.Mode mode) {
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

    /* renamed from: i */
    private void m35649i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C1712h c1712h = this.f5183x;
        C1711g c1711g = c1712h.f5233b;
        c1712h.f5235d = m35651g(C0967k.m38965g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList m38969c = C0967k.m38969c(typedArray, xmlPullParser, theme, "tint", 1);
        if (m38969c != null) {
            c1712h.f5234c = m38969c;
        }
        c1712h.f5236e = C0967k.m38971a(typedArray, xmlPullParser, "autoMirrored", 5, c1712h.f5236e);
        c1711g.f5226k = C0967k.m38966f(typedArray, xmlPullParser, "viewportWidth", 7, c1711g.f5226k);
        float m38966f = C0967k.m38966f(typedArray, xmlPullParser, "viewportHeight", 8, c1711g.f5227l);
        c1711g.f5227l = m38966f;
        if (c1711g.f5226k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (m38966f > 0.0f) {
            c1711g.f5224i = typedArray.getDimension(3, c1711g.f5224i);
            float dimension = typedArray.getDimension(2, c1711g.f5225j);
            c1711g.f5225j = dimension;
            if (c1711g.f5224i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                c1711g.setAlpha(C0967k.m38966f(typedArray, xmlPullParser, "alpha", 4, c1711g.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c1711g.f5229n = string;
                    c1711g.f5231p.put(string, c1711g);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38875b(drawable);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Object m35654d(String str) {
        return this.f5183x.f5233b.f5231p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5182E);
        if (this.f5182E.width() <= 0 || this.f5182E.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f5185z;
        if (colorFilter == null) {
            colorFilter = this.f5184y;
        }
        canvas.getMatrix(this.f5181D);
        this.f5181D.getValues(this.f5180C);
        float abs = Math.abs(this.f5180C[0]);
        float abs2 = Math.abs(this.f5180C[4]);
        float abs3 = Math.abs(this.f5180C[1]);
        float abs4 = Math.abs(this.f5180C[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f5182E.width() * abs));
        int min2 = Math.min(2048, (int) (this.f5182E.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f5182E;
        canvas.translate(rect.left, rect.top);
        if (m35652f()) {
            canvas.translate(this.f5182E.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f5182E.offsetTo(0, 0);
        this.f5183x.m35625c(min, min2);
        if (!this.f5179B) {
            this.f5183x.m35618j(min, min2);
        } else if (!this.f5183x.m35626b()) {
            this.f5183x.m35618j(min, min2);
            this.f5183x.m35619i();
        }
        this.f5183x.m35624d(canvas, colorFilter, this.f5182E);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38873d(drawable);
        }
        return this.f5183x.f5233b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5183x.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38872e(drawable);
        }
        return this.f5185z;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5176w != null && Build.VERSION.SDK_INT >= 24) {
            return new C1713i(this.f5176w.getConstantState());
        }
        this.f5183x.f5232a = getChangingConfigurations();
        return this.f5183x;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f5183x.f5233b.f5225j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f5183x.f5233b.f5224i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m35650h(boolean z) {
        this.f5179B = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38869h(drawable);
        }
        return this.f5183x.f5236e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C1712h c1712h;
        ColorStateList colorStateList;
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c1712h = this.f5183x) != null && (c1712h.m35621g() || ((colorStateList = this.f5183x.f5234c) != null && colorStateList.isStateful())));
    }

    /* renamed from: j */
    PorterDuffColorFilter m35648j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5178A && super.mutate() == this) {
            this.f5183x = new C1712h(this.f5183x);
            this.f5178A = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1712h c1712h = this.f5183x;
        ColorStateList colorStateList = c1712h.f5234c;
        if (colorStateList != null && (mode = c1712h.f5235d) != null) {
            this.f5184y = m35648j(this.f5184y, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c1712h.m35621g() && c1712h.m35620h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5183x.f5233b.getRootAlpha() != i) {
            this.f5183x.f5233b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38867j(drawable, z);
        } else {
            this.f5183x.f5236e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5185z = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38863n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38862o(drawable, colorStateList);
            return;
        }
        C1712h c1712h = this.f5183x;
        if (c1712h.f5234c != colorStateList) {
            c1712h.f5234c = colorStateList;
            this.f5184y = m35648j(this.f5184y, colorStateList, c1712h.f5235d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38861p(drawable, mode);
            return;
        }
        C1712h c1712h = this.f5183x;
        if (c1712h.f5235d != mode) {
            c1712h.f5235d = mode;
            this.f5184y = m35648j(this.f5184y, c1712h.f5234c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i */
    /* loaded from: classes.dex */
    public static class C1713i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5244a;

        public C1713i(Drawable.ConstantState constantState) {
            this.f5244a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5244a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5244a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1704i c1704i = new C1704i();
            c1704i.f5176w = (VectorDrawable) this.f5244a.newDrawable();
            return c1704i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1704i c1704i = new C1704i();
            c1704i.f5176w = (VectorDrawable) this.f5244a.newDrawable(resources);
            return c1704i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1704i c1704i = new C1704i();
            c1704i.f5176w = (VectorDrawable) this.f5244a.newDrawable(resources, theme);
            return c1704i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1710f extends AbstractC1709e {

        /* renamed from: a */
        protected C0972c.C0974b[] f5211a;

        /* renamed from: b */
        String f5212b;

        /* renamed from: c */
        int f5213c;

        /* renamed from: d */
        int f5214d;

        public AbstractC1710f() {
            super();
            this.f5211a = null;
            this.f5213c = 0;
        }

        /* renamed from: c */
        public boolean mo35636c() {
            return false;
        }

        /* renamed from: d */
        public void m35635d(Path path) {
            path.reset();
            C0972c.C0974b[] c0974bArr = this.f5211a;
            if (c0974bArr != null) {
                C0972c.C0974b.m38918e(c0974bArr, path);
            }
        }

        public C0972c.C0974b[] getPathData() {
            return this.f5211a;
        }

        public String getPathName() {
            return this.f5212b;
        }

        public void setPathData(C0972c.C0974b[] c0974bArr) {
            if (!C0972c.m38931b(this.f5211a, c0974bArr)) {
                this.f5211a = C0972c.m38927f(c0974bArr);
            } else {
                C0972c.m38923j(this.f5211a, c0974bArr);
            }
        }

        public AbstractC1710f(AbstractC1710f abstractC1710f) {
            super();
            this.f5211a = null;
            this.f5213c = 0;
            this.f5212b = abstractC1710f.f5212b;
            this.f5214d = abstractC1710f.f5214d;
            this.f5211a = C0972c.m38927f(abstractC1710f.f5211a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38870g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1712h c1712h = this.f5183x;
        c1712h.f5233b = new C1711g();
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5149a);
        m35649i(m38961k, xmlPullParser, theme);
        m38961k.recycle();
        c1712h.f5232a = getChangingConfigurations();
        c1712h.f5242k = true;
        m35653e(resources, xmlPullParser, attributeSet, theme);
        this.f5184y = m35648j(this.f5184y, c1712h.f5234c, c1712h.f5235d);
    }

    C1704i(C1712h c1712h) {
        this.f5179B = true;
        this.f5180C = new float[9];
        this.f5181D = new Matrix();
        this.f5182E = new Rect();
        this.f5183x = c1712h;
        this.f5184y = m35648j(this.f5184y, c1712h.f5234c, c1712h.f5235d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$c */
    /* loaded from: classes.dex */
    public static class C1707c extends AbstractC1710f {

        /* renamed from: e */
        private int[] f5186e;

        /* renamed from: f */
        C0945d f5187f;

        /* renamed from: g */
        float f5188g;

        /* renamed from: h */
        C0945d f5189h;

        /* renamed from: i */
        float f5190i;

        /* renamed from: j */
        float f5191j;

        /* renamed from: k */
        float f5192k;

        /* renamed from: l */
        float f5193l;

        /* renamed from: m */
        float f5194m;

        /* renamed from: n */
        Paint.Cap f5195n;

        /* renamed from: o */
        Paint.Join f5196o;

        /* renamed from: p */
        float f5197p;

        C1707c() {
            this.f5188g = 0.0f;
            this.f5190i = 1.0f;
            this.f5191j = 1.0f;
            this.f5192k = 0.0f;
            this.f5193l = 1.0f;
            this.f5194m = 0.0f;
            this.f5195n = Paint.Cap.BUTT;
            this.f5196o = Paint.Join.MITER;
            this.f5197p = 4.0f;
        }

        /* renamed from: e */
        private Paint.Cap m35645e(int i, Paint.Cap cap) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m35644f(int i, Paint.Join join) {
            if (i != 0) {
                if (i != 1) {
                    return i != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m35642h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5186e = null;
            if (C0967k.m38962j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5212b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5211a = C0972c.m38929d(string2);
                }
                this.f5189h = C0967k.m38967e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5191j = C0967k.m38966f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5191j);
                this.f5195n = m35645e(C0967k.m38965g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5195n);
                this.f5196o = m35644f(C0967k.m38965g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5196o);
                this.f5197p = C0967k.m38966f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5197p);
                this.f5187f = C0967k.m38967e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5190i = C0967k.m38966f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5190i);
                this.f5188g = C0967k.m38966f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5188g);
                this.f5193l = C0967k.m38966f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5193l);
                this.f5194m = C0967k.m38966f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5194m);
                this.f5192k = C0967k.m38966f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5192k);
                this.f5213c = C0967k.m38965g(typedArray, xmlPullParser, "fillType", 13, this.f5213c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1704i.AbstractC1709e
        /* renamed from: a */
        public boolean mo35638a() {
            return this.f5189h.m39031i() || this.f5187f.m39031i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1704i.AbstractC1709e
        /* renamed from: b */
        public boolean mo35637b(int[] iArr) {
            return this.f5187f.m39030j(iArr) | this.f5189h.m39030j(iArr);
        }

        /* renamed from: g */
        public void m35643g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5151c);
            m35642h(m38961k, xmlPullParser, theme);
            m38961k.recycle();
        }

        float getFillAlpha() {
            return this.f5191j;
        }

        int getFillColor() {
            return this.f5189h.m39035e();
        }

        float getStrokeAlpha() {
            return this.f5190i;
        }

        int getStrokeColor() {
            return this.f5187f.m39035e();
        }

        float getStrokeWidth() {
            return this.f5188g;
        }

        float getTrimPathEnd() {
            return this.f5193l;
        }

        float getTrimPathOffset() {
            return this.f5194m;
        }

        float getTrimPathStart() {
            return this.f5192k;
        }

        void setFillAlpha(float f) {
            this.f5191j = f;
        }

        void setFillColor(int i) {
            this.f5189h.m39029k(i);
        }

        void setStrokeAlpha(float f) {
            this.f5190i = f;
        }

        void setStrokeColor(int i) {
            this.f5187f.m39029k(i);
        }

        void setStrokeWidth(float f) {
            this.f5188g = f;
        }

        void setTrimPathEnd(float f) {
            this.f5193l = f;
        }

        void setTrimPathOffset(float f) {
            this.f5194m = f;
        }

        void setTrimPathStart(float f) {
            this.f5192k = f;
        }

        C1707c(C1707c c1707c) {
            super(c1707c);
            this.f5188g = 0.0f;
            this.f5190i = 1.0f;
            this.f5191j = 1.0f;
            this.f5192k = 0.0f;
            this.f5193l = 1.0f;
            this.f5194m = 0.0f;
            this.f5195n = Paint.Cap.BUTT;
            this.f5196o = Paint.Join.MITER;
            this.f5197p = 4.0f;
            this.f5186e = c1707c.f5186e;
            this.f5187f = c1707c.f5187f;
            this.f5188g = c1707c.f5188g;
            this.f5190i = c1707c.f5190i;
            this.f5189h = c1707c.f5189h;
            this.f5213c = c1707c.f5213c;
            this.f5191j = c1707c.f5191j;
            this.f5192k = c1707c.f5192k;
            this.f5193l = c1707c.f5193l;
            this.f5194m = c1707c.f5194m;
            this.f5195n = c1707c.f5195n;
            this.f5196o = c1707c.f5196o;
            this.f5197p = c1707c.f5197p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$g */
    /* loaded from: classes.dex */
    public static class C1711g {

        /* renamed from: q */
        private static final Matrix f5215q = new Matrix();

        /* renamed from: a */
        private final Path f5216a;

        /* renamed from: b */
        private final Path f5217b;

        /* renamed from: c */
        private final Matrix f5218c;

        /* renamed from: d */
        Paint f5219d;

        /* renamed from: e */
        Paint f5220e;

        /* renamed from: f */
        private PathMeasure f5221f;

        /* renamed from: g */
        private int f5222g;

        /* renamed from: h */
        final C1708d f5223h;

        /* renamed from: i */
        float f5224i;

        /* renamed from: j */
        float f5225j;

        /* renamed from: k */
        float f5226k;

        /* renamed from: l */
        float f5227l;

        /* renamed from: m */
        int f5228m;

        /* renamed from: n */
        String f5229n;

        /* renamed from: o */
        Boolean f5230o;

        /* renamed from: p */
        final C9545a<String, Object> f5231p;

        public C1711g() {
            this.f5218c = new Matrix();
            this.f5224i = 0.0f;
            this.f5225j = 0.0f;
            this.f5226k = 0.0f;
            this.f5227l = 0.0f;
            this.f5228m = 255;
            this.f5229n = null;
            this.f5230o = null;
            this.f5231p = new C9545a<>();
            this.f5223h = new C1708d();
            this.f5216a = new Path();
            this.f5217b = new Path();
        }

        /* renamed from: a */
        private static float m35634a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m35632c(C1708d c1708d, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c1708d.f5198a.set(matrix);
            c1708d.f5198a.preConcat(c1708d.f5207j);
            canvas.save();
            for (int i3 = 0; i3 < c1708d.f5199b.size(); i3++) {
                AbstractC1709e abstractC1709e = c1708d.f5199b.get(i3);
                if (abstractC1709e instanceof C1708d) {
                    m35632c((C1708d) abstractC1709e, c1708d.f5198a, canvas, i, i2, colorFilter);
                } else if (abstractC1709e instanceof AbstractC1710f) {
                    m35631d(c1708d, (AbstractC1710f) abstractC1709e, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m35631d(C1708d c1708d, AbstractC1710f abstractC1710f, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = i / this.f5226k;
            float f2 = i2 / this.f5227l;
            float min = Math.min(f, f2);
            Matrix matrix = c1708d.f5198a;
            this.f5218c.set(matrix);
            this.f5218c.postScale(f, f2);
            float m35630e = m35630e(matrix);
            if (m35630e == 0.0f) {
                return;
            }
            abstractC1710f.m35635d(this.f5216a);
            Path path = this.f5216a;
            this.f5217b.reset();
            if (abstractC1710f.mo35636c()) {
                this.f5217b.setFillType(abstractC1710f.f5213c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f5217b.addPath(path, this.f5218c);
                canvas.clipPath(this.f5217b);
                return;
            }
            C1707c c1707c = (C1707c) abstractC1710f;
            float f3 = c1707c.f5192k;
            if (f3 != 0.0f || c1707c.f5193l != 1.0f) {
                float f4 = c1707c.f5194m;
                float f5 = (f3 + f4) % 1.0f;
                float f6 = (c1707c.f5193l + f4) % 1.0f;
                if (this.f5221f == null) {
                    this.f5221f = new PathMeasure();
                }
                this.f5221f.setPath(this.f5216a, false);
                float length = this.f5221f.getLength();
                float f7 = f5 * length;
                float f8 = f6 * length;
                path.reset();
                if (f7 > f8) {
                    this.f5221f.getSegment(f7, length, path, true);
                    this.f5221f.getSegment(0.0f, f8, path, true);
                } else {
                    this.f5221f.getSegment(f7, f8, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f5217b.addPath(path, this.f5218c);
            if (c1707c.f5189h.m39028l()) {
                C0945d c0945d = c1707c.f5189h;
                if (this.f5220e == null) {
                    Paint paint = new Paint(1);
                    this.f5220e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f5220e;
                if (c0945d.m39032h()) {
                    Shader m39034f = c0945d.m39034f();
                    m39034f.setLocalMatrix(this.f5218c);
                    paint2.setShader(m39034f);
                    paint2.setAlpha(Math.round(c1707c.f5191j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(C1704i.m35657a(c0945d.m39035e(), c1707c.f5191j));
                }
                paint2.setColorFilter(colorFilter);
                this.f5217b.setFillType(c1707c.f5213c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f5217b, paint2);
            }
            if (c1707c.f5187f.m39028l()) {
                C0945d c0945d2 = c1707c.f5187f;
                if (this.f5219d == null) {
                    Paint paint3 = new Paint(1);
                    this.f5219d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f5219d;
                Paint.Join join = c1707c.f5196o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = c1707c.f5195n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(c1707c.f5197p);
                if (c0945d2.m39032h()) {
                    Shader m39034f2 = c0945d2.m39034f();
                    m39034f2.setLocalMatrix(this.f5218c);
                    paint4.setShader(m39034f2);
                    paint4.setAlpha(Math.round(c1707c.f5190i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(C1704i.m35657a(c0945d2.m39035e(), c1707c.f5190i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(c1707c.f5188g * min * m35630e);
                canvas.drawPath(this.f5217b, paint4);
            }
        }

        /* renamed from: e */
        private float m35630e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float m35634a = m35634a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(m35634a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void m35633b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m35632c(this.f5223h, f5215q, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean m35629f() {
            if (this.f5230o == null) {
                this.f5230o = Boolean.valueOf(this.f5223h.mo35638a());
            }
            return this.f5230o.booleanValue();
        }

        /* renamed from: g */
        public boolean m35628g(int[] iArr) {
            return this.f5223h.mo35637b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5228m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5228m = i;
        }

        public C1711g(C1711g c1711g) {
            this.f5218c = new Matrix();
            this.f5224i = 0.0f;
            this.f5225j = 0.0f;
            this.f5226k = 0.0f;
            this.f5227l = 0.0f;
            this.f5228m = 255;
            this.f5229n = null;
            this.f5230o = null;
            C9545a<String, Object> c9545a = new C9545a<>();
            this.f5231p = c9545a;
            this.f5223h = new C1708d(c1711g.f5223h, c9545a);
            this.f5216a = new Path(c1711g.f5216a);
            this.f5217b = new Path(c1711g.f5217b);
            this.f5224i = c1711g.f5224i;
            this.f5225j = c1711g.f5225j;
            this.f5226k = c1711g.f5226k;
            this.f5227l = c1711g.f5227l;
            this.f5222g = c1711g.f5222g;
            this.f5228m = c1711g.f5228m;
            this.f5229n = c1711g.f5229n;
            String str = c1711g.f5229n;
            if (str != null) {
                c9545a.put(str, this);
            }
            this.f5230o = c1711g.f5230o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.i$d */
    /* loaded from: classes.dex */
    public static class C1708d extends AbstractC1709e {

        /* renamed from: a */
        final Matrix f5198a;

        /* renamed from: b */
        final ArrayList<AbstractC1709e> f5199b;

        /* renamed from: c */
        float f5200c;

        /* renamed from: d */
        private float f5201d;

        /* renamed from: e */
        private float f5202e;

        /* renamed from: f */
        private float f5203f;

        /* renamed from: g */
        private float f5204g;

        /* renamed from: h */
        private float f5205h;

        /* renamed from: i */
        private float f5206i;

        /* renamed from: j */
        final Matrix f5207j;

        /* renamed from: k */
        int f5208k;

        /* renamed from: l */
        private int[] f5209l;

        /* renamed from: m */
        private String f5210m;

        public C1708d(C1708d c1708d, C9545a<String, Object> c9545a) {
            super();
            AbstractC1710f c1706b;
            this.f5198a = new Matrix();
            this.f5199b = new ArrayList<>();
            this.f5200c = 0.0f;
            this.f5201d = 0.0f;
            this.f5202e = 0.0f;
            this.f5203f = 1.0f;
            this.f5204g = 1.0f;
            this.f5205h = 0.0f;
            this.f5206i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5207j = matrix;
            this.f5210m = null;
            this.f5200c = c1708d.f5200c;
            this.f5201d = c1708d.f5201d;
            this.f5202e = c1708d.f5202e;
            this.f5203f = c1708d.f5203f;
            this.f5204g = c1708d.f5204g;
            this.f5205h = c1708d.f5205h;
            this.f5206i = c1708d.f5206i;
            this.f5209l = c1708d.f5209l;
            String str = c1708d.f5210m;
            this.f5210m = str;
            this.f5208k = c1708d.f5208k;
            if (str != null) {
                c9545a.put(str, this);
            }
            matrix.set(c1708d.f5207j);
            ArrayList<AbstractC1709e> arrayList = c1708d.f5199b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1709e abstractC1709e = arrayList.get(i);
                if (abstractC1709e instanceof C1708d) {
                    this.f5199b.add(new C1708d((C1708d) abstractC1709e, c9545a));
                } else {
                    if (abstractC1709e instanceof C1707c) {
                        c1706b = new C1707c((C1707c) abstractC1709e);
                    } else if (abstractC1709e instanceof C1706b) {
                        c1706b = new C1706b((C1706b) abstractC1709e);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5199b.add(c1706b);
                    String str2 = c1706b.f5212b;
                    if (str2 != null) {
                        c9545a.put(str2, c1706b);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m35640d() {
            this.f5207j.reset();
            this.f5207j.postTranslate(-this.f5201d, -this.f5202e);
            this.f5207j.postScale(this.f5203f, this.f5204g);
            this.f5207j.postRotate(this.f5200c, 0.0f, 0.0f);
            this.f5207j.postTranslate(this.f5205h + this.f5201d, this.f5206i + this.f5202e);
        }

        /* renamed from: e */
        private void m35639e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5209l = null;
            this.f5200c = C0967k.m38966f(typedArray, xmlPullParser, "rotation", 5, this.f5200c);
            this.f5201d = typedArray.getFloat(1, this.f5201d);
            this.f5202e = typedArray.getFloat(2, this.f5202e);
            this.f5203f = C0967k.m38966f(typedArray, xmlPullParser, "scaleX", 3, this.f5203f);
            this.f5204g = C0967k.m38966f(typedArray, xmlPullParser, "scaleY", 4, this.f5204g);
            this.f5205h = C0967k.m38966f(typedArray, xmlPullParser, "translateX", 6, this.f5205h);
            this.f5206i = C0967k.m38966f(typedArray, xmlPullParser, "translateY", 7, this.f5206i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5210m = string;
            }
            m35640d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1704i.AbstractC1709e
        /* renamed from: a */
        public boolean mo35638a() {
            for (int i = 0; i < this.f5199b.size(); i++) {
                if (this.f5199b.get(i).mo35638a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.C1704i.AbstractC1709e
        /* renamed from: b */
        public boolean mo35637b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5199b.size(); i++) {
                z |= this.f5199b.get(i).mo35637b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void m35641c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5150b);
            m35639e(m38961k, xmlPullParser);
            m38961k.recycle();
        }

        public String getGroupName() {
            return this.f5210m;
        }

        public Matrix getLocalMatrix() {
            return this.f5207j;
        }

        public float getPivotX() {
            return this.f5201d;
        }

        public float getPivotY() {
            return this.f5202e;
        }

        public float getRotation() {
            return this.f5200c;
        }

        public float getScaleX() {
            return this.f5203f;
        }

        public float getScaleY() {
            return this.f5204g;
        }

        public float getTranslateX() {
            return this.f5205h;
        }

        public float getTranslateY() {
            return this.f5206i;
        }

        public void setPivotX(float f) {
            if (f != this.f5201d) {
                this.f5201d = f;
                m35640d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5202e) {
                this.f5202e = f;
                m35640d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5200c) {
                this.f5200c = f;
                m35640d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5203f) {
                this.f5203f = f;
                m35640d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5204g) {
                this.f5204g = f;
                m35640d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5205h) {
                this.f5205h = f;
                m35640d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5206i) {
                this.f5206i = f;
                m35640d();
            }
        }

        public C1708d() {
            super();
            this.f5198a = new Matrix();
            this.f5199b = new ArrayList<>();
            this.f5200c = 0.0f;
            this.f5201d = 0.0f;
            this.f5202e = 0.0f;
            this.f5203f = 1.0f;
            this.f5204g = 1.0f;
            this.f5205h = 0.0f;
            this.f5206i = 0.0f;
            this.f5207j = new Matrix();
            this.f5210m = null;
        }
    }
}
