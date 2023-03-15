package p401v8;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.graphics.drawable.InterfaceC0985b;
import androidx.core.util.C1070c;
import java.util.BitSet;
import p100f8.C5419b;
import p198k8.C6608a;
import p252n8.C7688a;
import p381u8.C10850a;
import p401v8.C11148k;
import p401v8.C11152l;
import p401v8.C11156m;

/* renamed from: v8.g */
/* loaded from: classes.dex */
public class C11141g extends Drawable implements InterfaceC0985b, InterfaceC11164n {

    /* renamed from: T */
    private static final String f28571T = C11141g.class.getSimpleName();

    /* renamed from: U */
    private static final Paint f28572U;

    /* renamed from: A */
    private boolean f28573A;

    /* renamed from: B */
    private final Matrix f28574B;

    /* renamed from: C */
    private final Path f28575C;

    /* renamed from: D */
    private final Path f28576D;

    /* renamed from: E */
    private final RectF f28577E;

    /* renamed from: F */
    private final RectF f28578F;

    /* renamed from: G */
    private final Region f28579G;

    /* renamed from: H */
    private final Region f28580H;

    /* renamed from: I */
    private C11148k f28581I;

    /* renamed from: J */
    private final Paint f28582J;

    /* renamed from: K */
    private final Paint f28583K;

    /* renamed from: L */
    private final C10850a f28584L;

    /* renamed from: M */
    private final C11152l.InterfaceC11154b f28585M;

    /* renamed from: N */
    private final C11152l f28586N;

    /* renamed from: O */
    private PorterDuffColorFilter f28587O;

    /* renamed from: P */
    private PorterDuffColorFilter f28588P;

    /* renamed from: Q */
    private int f28589Q;

    /* renamed from: R */
    private final RectF f28590R;

    /* renamed from: S */
    private boolean f28591S;

    /* renamed from: w */
    private C11144c f28592w;

    /* renamed from: x */
    private final C11156m.AbstractC11163g[] f28593x;

    /* renamed from: y */
    private final C11156m.AbstractC11163g[] f28594y;

    /* renamed from: z */
    private final BitSet f28595z;

    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: v8.g$a */
    /* loaded from: classes.dex */
    class C11142a implements C11152l.InterfaceC11154b {
        C11142a() {
        }

        @Override // p401v8.C11152l.InterfaceC11154b
        /* renamed from: a */
        public void mo5885a(C11156m c11156m, Matrix matrix, int i) {
            C11141g.this.f28595z.set(i, c11156m.m5879e());
            C11141g.this.f28593x[i] = c11156m.m5878f(matrix);
        }

        @Override // p401v8.C11152l.InterfaceC11154b
        /* renamed from: b */
        public void mo5884b(C11156m c11156m, Matrix matrix, int i) {
            C11141g.this.f28595z.set(i + 4, c11156m.m5879e());
            C11141g.this.f28594y[i] = c11156m.m5878f(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: v8.g$b */
    /* loaded from: classes.dex */
    public class C11143b implements C11148k.InterfaceC11151c {

        /* renamed from: a */
        final /* synthetic */ float f28597a;

        C11143b(C11141g c11141g, float f) {
            this.f28597a = f;
        }

        @Override // p401v8.C11148k.InterfaceC11151c
        /* renamed from: a */
        public InterfaceC11137c mo5900a(InterfaceC11137c interfaceC11137c) {
            return interfaceC11137c instanceof C11146i ? interfaceC11137c : new C11136b(this.f28597a, interfaceC11137c);
        }
    }

    static {
        Paint paint = new Paint(1);
        f28572U = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* synthetic */ C11141g(C11144c c11144c, C11142a c11142a) {
        this(c11144c);
    }

    /* renamed from: F */
    private float m6024F() {
        if (m6016N()) {
            return this.f28583K.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: L */
    private boolean m6018L() {
        C11144c c11144c = this.f28592w;
        int i = c11144c.f28614q;
        return i != 1 && c11144c.f28615r > 0 && (i == 2 || m6008V());
    }

    /* renamed from: M */
    private boolean m6017M() {
        Paint.Style style = this.f28592w.f28619v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    /* renamed from: N */
    private boolean m6016N() {
        Paint.Style style = this.f28592w.f28619v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f28583K.getStrokeWidth() > 0.0f;
    }

    /* renamed from: P */
    private void m6014P() {
        super.invalidateSelf();
    }

    /* renamed from: S */
    private void m6011S(Canvas canvas) {
        if (m6018L()) {
            canvas.save();
            m6009U(canvas);
            if (!this.f28591S) {
                m5978n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f28590R.width() - getBounds().width());
            int height = (int) (this.f28590R.height() - getBounds().height());
            if (width >= 0 && height >= 0) {
                Bitmap createBitmap = Bitmap.createBitmap(((int) this.f28590R.width()) + (this.f28592w.f28615r * 2) + width, ((int) this.f28590R.height()) + (this.f28592w.f28615r * 2) + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f = (getBounds().left - this.f28592w.f28615r) - width;
                float f2 = (getBounds().top - this.f28592w.f28615r) - height;
                canvas2.translate(-f, -f2);
                m5978n(canvas2);
                canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
                return;
            }
            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
        }
    }

    /* renamed from: T */
    private static int m6010T(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* renamed from: U */
    private void m6009U(Canvas canvas) {
        int m6028B = m6028B();
        int m6027C = m6027C();
        if (Build.VERSION.SDK_INT < 21 && this.f28591S) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f28592w.f28615r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(m6028B, m6027C);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(m6028B, m6027C);
    }

    /* renamed from: f */
    private PorterDuffColorFilter m5994f(Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int m5982l = m5982l(color);
            this.f28589Q = m5982l;
            if (m5982l != color) {
                return new PorterDuffColorFilter(m5982l, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    /* renamed from: g */
    private void m5992g(RectF rectF, Path path) {
        m5990h(rectF, path);
        if (this.f28592w.f28607j != 1.0f) {
            this.f28574B.reset();
            Matrix matrix = this.f28574B;
            float f = this.f28592w.f28607j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f28574B);
        }
        path.computeBounds(this.f28590R, true);
    }

    /* renamed from: i */
    private void m5988i() {
        C11148k m5933y = m6025E().m5933y(new C11143b(this, -m6024F()));
        this.f28581I = m5933y;
        this.f28586N.m5896d(m5933y, this.f28592w.f28608k, m5970v(), this.f28576D);
    }

    /* renamed from: j */
    private PorterDuffColorFilter m5986j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = m5982l(colorForState);
        }
        this.f28589Q = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* renamed from: k */
    private PorterDuffColorFilter m5984k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return m5986j(colorStateList, mode, z);
        }
        return m5994f(paint, z);
    }

    /* renamed from: k0 */
    private boolean m5983k0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f28592w.f28601d == null || color2 == (colorForState2 = this.f28592w.f28601d.getColorForState(iArr, (color2 = this.f28582J.getColor())))) {
            z = false;
        } else {
            this.f28582J.setColor(colorForState2);
            z = true;
        }
        if (this.f28592w.f28602e == null || color == (colorForState = this.f28592w.f28602e.getColorForState(iArr, (color = this.f28583K.getColor())))) {
            return z;
        }
        this.f28583K.setColor(colorForState);
        return true;
    }

    /* renamed from: l0 */
    private boolean m5981l0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f28587O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f28588P;
        C11144c c11144c = this.f28592w;
        this.f28587O = m5984k(c11144c.f28604g, c11144c.f28605h, this.f28582J, true);
        C11144c c11144c2 = this.f28592w;
        this.f28588P = m5984k(c11144c2.f28603f, c11144c2.f28605h, this.f28583K, false);
        C11144c c11144c3 = this.f28592w;
        if (c11144c3.f28618u) {
            this.f28584L.m6881d(c11144c3.f28604g.getColorForState(getState(), 0));
        }
        return (C1070c.m38634a(porterDuffColorFilter, this.f28587O) && C1070c.m38634a(porterDuffColorFilter2, this.f28588P)) ? false : true;
    }

    /* renamed from: m */
    public static C11141g m5980m(Context context, float f) {
        int m20505c = C6608a.m20505c(context, C5419b.colorSurface, C11141g.class.getSimpleName());
        C11141g c11141g = new C11141g();
        c11141g.m6015O(context);
        c11141g.m6004Z(ColorStateList.valueOf(m20505c));
        c11141g.m6005Y(f);
        return c11141g;
    }

    /* renamed from: m0 */
    private void m5979m0() {
        float m6019K = m6019K();
        this.f28592w.f28615r = (int) Math.ceil(0.75f * m6019K);
        this.f28592w.f28616s = (int) Math.ceil(m6019K * 0.25f);
        m5981l0();
        m6014P();
    }

    /* renamed from: n */
    private void m5978n(Canvas canvas) {
        if (this.f28595z.cardinality() > 0) {
            Log.w(f28571T, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f28592w.f28616s != 0) {
            canvas.drawPath(this.f28575C, this.f28584L.m6882c());
        }
        for (int i = 0; i < 4; i++) {
            this.f28593x[i].m5835b(this.f28584L, this.f28592w.f28615r, canvas);
            this.f28594y[i].m5835b(this.f28584L, this.f28592w.f28615r, canvas);
        }
        if (this.f28591S) {
            int m6028B = m6028B();
            int m6027C = m6027C();
            canvas.translate(-m6028B, -m6027C);
            canvas.drawPath(this.f28575C, f28572U);
            canvas.translate(m6028B, m6027C);
        }
    }

    /* renamed from: o */
    private void m5977o(Canvas canvas) {
        m5975q(canvas, this.f28582J, this.f28575C, this.f28592w.f28598a, m5971u());
    }

    /* renamed from: q */
    private void m5975q(Canvas canvas, Paint paint, Path path, C11148k c11148k, RectF rectF) {
        if (c11148k.m5937u(rectF)) {
            float mo5959a = c11148k.m5938t().mo5959a(rectF) * this.f28592w.f28608k;
            canvas.drawRoundRect(rectF, mo5959a, mo5959a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: v */
    private RectF m5970v() {
        this.f28578F.set(m5971u());
        float m6024F = m6024F();
        this.f28578F.inset(m6024F, m6024F);
        return this.f28578F;
    }

    /* renamed from: A */
    public int m6029A() {
        return this.f28589Q;
    }

    /* renamed from: B */
    public int m6028B() {
        C11144c c11144c = this.f28592w;
        return (int) (c11144c.f28616s * Math.sin(Math.toRadians(c11144c.f28617t)));
    }

    /* renamed from: C */
    public int m6027C() {
        C11144c c11144c = this.f28592w;
        return (int) (c11144c.f28616s * Math.cos(Math.toRadians(c11144c.f28617t)));
    }

    /* renamed from: D */
    public int m6026D() {
        return this.f28592w.f28615r;
    }

    /* renamed from: E */
    public C11148k m6025E() {
        return this.f28592w.f28598a;
    }

    /* renamed from: G */
    public ColorStateList m6023G() {
        return this.f28592w.f28604g;
    }

    /* renamed from: H */
    public float m6022H() {
        return this.f28592w.f28598a.m5940r().mo5959a(m5971u());
    }

    /* renamed from: I */
    public float m6021I() {
        return this.f28592w.f28598a.m5938t().mo5959a(m5971u());
    }

    /* renamed from: J */
    public float m6020J() {
        return this.f28592w.f28613p;
    }

    /* renamed from: K */
    public float m6019K() {
        return m5969w() + m6020J();
    }

    /* renamed from: O */
    public void m6015O(Context context) {
        this.f28592w.f28599b = new C7688a(context);
        m5979m0();
    }

    /* renamed from: Q */
    public boolean m6013Q() {
        C7688a c7688a = this.f28592w.f28599b;
        return c7688a != null && c7688a.m17713e();
    }

    /* renamed from: R */
    public boolean m6012R() {
        return this.f28592w.f28598a.m5937u(m5971u());
    }

    /* renamed from: V */
    public boolean m6008V() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || !(m6012R() || this.f28575C.isConvex() || i >= 29);
    }

    /* renamed from: W */
    public void m6007W(float f) {
        setShapeAppearanceModel(this.f28592w.f28598a.m5935w(f));
    }

    /* renamed from: X */
    public void m6006X(InterfaceC11137c interfaceC11137c) {
        setShapeAppearanceModel(this.f28592w.f28598a.m5934x(interfaceC11137c));
    }

    /* renamed from: Y */
    public void m6005Y(float f) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28612o != f) {
            c11144c.f28612o = f;
            m5979m0();
        }
    }

    /* renamed from: Z */
    public void m6004Z(ColorStateList colorStateList) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28601d != colorStateList) {
            c11144c.f28601d = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: a0 */
    public void m6003a0(float f) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28608k != f) {
            c11144c.f28608k = f;
            this.f28573A = true;
            invalidateSelf();
        }
    }

    /* renamed from: b0 */
    public void m6001b0(int i, int i2, int i3, int i4) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28606i == null) {
            c11144c.f28606i = new Rect();
        }
        this.f28592w.f28606i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    /* renamed from: c0 */
    public void m5999c0(float f) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28611n != f) {
            c11144c.f28611n = f;
            m5979m0();
        }
    }

    /* renamed from: d0 */
    public void m5997d0(boolean z) {
        this.f28591S = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f28582J.setColorFilter(this.f28587O);
        int alpha = this.f28582J.getAlpha();
        this.f28582J.setAlpha(m6010T(alpha, this.f28592w.f28610m));
        this.f28583K.setColorFilter(this.f28588P);
        this.f28583K.setStrokeWidth(this.f28592w.f28609l);
        int alpha2 = this.f28583K.getAlpha();
        this.f28583K.setAlpha(m6010T(alpha2, this.f28592w.f28610m));
        if (this.f28573A) {
            m5988i();
            m5992g(m5971u(), this.f28575C);
            this.f28573A = false;
        }
        m6011S(canvas);
        if (m6017M()) {
            m5977o(canvas);
        }
        if (m6016N()) {
            mo5974r(canvas);
        }
        this.f28582J.setAlpha(alpha);
        this.f28583K.setAlpha(alpha2);
    }

    /* renamed from: e0 */
    public void m5995e0(int i) {
        this.f28584L.m6881d(i);
        this.f28592w.f28618u = false;
        m6014P();
    }

    /* renamed from: f0 */
    public void m5993f0(int i) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28617t != i) {
            c11144c.f28617t = i;
            m6014P();
        }
    }

    /* renamed from: g0 */
    public void m5991g0(float f, int i) {
        m5985j0(f);
        m5987i0(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f28592w.f28610m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f28592w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f28592w.f28614q == 2) {
            return;
        }
        if (m6012R()) {
            outline.setRoundRect(getBounds(), m6022H() * this.f28592w.f28608k);
            return;
        }
        m5992g(m5971u(), this.f28575C);
        if (this.f28575C.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f28575C);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f28592w.f28606i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f28579G.set(getBounds());
        m5992g(m5971u(), this.f28575C);
        this.f28580H.setPath(this.f28575C, this.f28579G);
        this.f28579G.op(this.f28580H, Region.Op.DIFFERENCE);
        return this.f28579G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final void m5990h(RectF rectF, Path path) {
        C11152l c11152l = this.f28586N;
        C11144c c11144c = this.f28592w;
        c11152l.m5895e(c11144c.f28598a, c11144c.f28608k, rectF, this.f28585M, path);
    }

    /* renamed from: h0 */
    public void m5989h0(float f, ColorStateList colorStateList) {
        m5985j0(f);
        m5987i0(colorStateList);
    }

    /* renamed from: i0 */
    public void m5987i0(ColorStateList colorStateList) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28602e != colorStateList) {
            c11144c.f28602e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f28573A = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f28592w.f28604g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f28592w.f28603f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f28592w.f28602e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f28592w.f28601d) != null && colorStateList4.isStateful())));
    }

    /* renamed from: j0 */
    public void m5985j0(float f) {
        this.f28592w.f28609l = f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public int m5982l(int i) {
        float m6019K = m6019K() + m5966z();
        C7688a c7688a = this.f28592w.f28599b;
        return c7688a != null ? c7688a.m17715c(i, m6019K) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f28592w = new C11144c(this.f28592w);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f28573A = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.C3640k.InterfaceC3642b
    public boolean onStateChange(int[] iArr) {
        boolean z = m5983k0(iArr) || m5981l0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m5976p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        m5975q(canvas, paint, path, this.f28592w.f28598a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void mo5974r(Canvas canvas) {
        m5975q(canvas, this.f28583K, this.f28576D, this.f28581I, m5970v());
    }

    /* renamed from: s */
    public float m5973s() {
        return this.f28592w.f28598a.m5948j().mo5959a(m5971u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28610m != i) {
            c11144c.f28610m = i;
            m6014P();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f28592w.f28600c = colorFilter;
        m6014P();
    }

    @Override // p401v8.InterfaceC11164n
    public void setShapeAppearanceModel(C11148k c11148k) {
        this.f28592w.f28598a = c11148k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        this.f28592w.f28604g = colorStateList;
        m5981l0();
        m6014P();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        C11144c c11144c = this.f28592w;
        if (c11144c.f28605h != mode) {
            c11144c.f28605h = mode;
            m5981l0();
            m6014P();
        }
    }

    /* renamed from: t */
    public float m5972t() {
        return this.f28592w.f28598a.m5946l().mo5959a(m5971u());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public RectF m5971u() {
        this.f28577E.set(getBounds());
        return this.f28577E;
    }

    /* renamed from: w */
    public float m5969w() {
        return this.f28592w.f28612o;
    }

    /* renamed from: x */
    public ColorStateList m5968x() {
        return this.f28592w.f28601d;
    }

    /* renamed from: y */
    public float m5967y() {
        return this.f28592w.f28608k;
    }

    /* renamed from: z */
    public float m5966z() {
        return this.f28592w.f28611n;
    }

    public C11141g() {
        this(new C11148k());
    }

    public C11141g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C11148k.m5953e(context, attributeSet, i, i2).m5914m());
    }

    public C11141g(C11148k c11148k) {
        this(new C11144c(c11148k, null));
    }

    private C11141g(C11144c c11144c) {
        C11152l c11152l;
        this.f28593x = new C11156m.AbstractC11163g[4];
        this.f28594y = new C11156m.AbstractC11163g[4];
        this.f28595z = new BitSet(8);
        this.f28574B = new Matrix();
        this.f28575C = new Path();
        this.f28576D = new Path();
        this.f28577E = new RectF();
        this.f28578F = new RectF();
        this.f28579G = new Region();
        this.f28580H = new Region();
        Paint paint = new Paint(1);
        this.f28582J = paint;
        Paint paint2 = new Paint(1);
        this.f28583K = paint2;
        this.f28584L = new C10850a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c11152l = C11152l.m5889k();
        } else {
            c11152l = new C11152l();
        }
        this.f28586N = c11152l;
        this.f28590R = new RectF();
        this.f28591S = true;
        this.f28592w = c11144c;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m5981l0();
        m5983k0(getState());
        this.f28585M = new C11142a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* renamed from: v8.g$c */
    /* loaded from: classes.dex */
    public static final class C11144c extends Drawable.ConstantState {

        /* renamed from: a */
        public C11148k f28598a;

        /* renamed from: b */
        public C7688a f28599b;

        /* renamed from: c */
        public ColorFilter f28600c;

        /* renamed from: d */
        public ColorStateList f28601d;

        /* renamed from: e */
        public ColorStateList f28602e;

        /* renamed from: f */
        public ColorStateList f28603f;

        /* renamed from: g */
        public ColorStateList f28604g;

        /* renamed from: h */
        public PorterDuff.Mode f28605h;

        /* renamed from: i */
        public Rect f28606i;

        /* renamed from: j */
        public float f28607j;

        /* renamed from: k */
        public float f28608k;

        /* renamed from: l */
        public float f28609l;

        /* renamed from: m */
        public int f28610m;

        /* renamed from: n */
        public float f28611n;

        /* renamed from: o */
        public float f28612o;

        /* renamed from: p */
        public float f28613p;

        /* renamed from: q */
        public int f28614q;

        /* renamed from: r */
        public int f28615r;

        /* renamed from: s */
        public int f28616s;

        /* renamed from: t */
        public int f28617t;

        /* renamed from: u */
        public boolean f28618u;

        /* renamed from: v */
        public Paint.Style f28619v;

        public C11144c(C11148k c11148k, C7688a c7688a) {
            this.f28601d = null;
            this.f28602e = null;
            this.f28603f = null;
            this.f28604g = null;
            this.f28605h = PorterDuff.Mode.SRC_IN;
            this.f28606i = null;
            this.f28607j = 1.0f;
            this.f28608k = 1.0f;
            this.f28610m = 255;
            this.f28611n = 0.0f;
            this.f28612o = 0.0f;
            this.f28613p = 0.0f;
            this.f28614q = 0;
            this.f28615r = 0;
            this.f28616s = 0;
            this.f28617t = 0;
            this.f28618u = false;
            this.f28619v = Paint.Style.FILL_AND_STROKE;
            this.f28598a = c11148k;
            this.f28599b = c7688a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C11141g c11141g = new C11141g(this, null);
            c11141g.f28573A = true;
            return c11141g;
        }

        public C11144c(C11144c c11144c) {
            this.f28601d = null;
            this.f28602e = null;
            this.f28603f = null;
            this.f28604g = null;
            this.f28605h = PorterDuff.Mode.SRC_IN;
            this.f28606i = null;
            this.f28607j = 1.0f;
            this.f28608k = 1.0f;
            this.f28610m = 255;
            this.f28611n = 0.0f;
            this.f28612o = 0.0f;
            this.f28613p = 0.0f;
            this.f28614q = 0;
            this.f28615r = 0;
            this.f28616s = 0;
            this.f28617t = 0;
            this.f28618u = false;
            this.f28619v = Paint.Style.FILL_AND_STROKE;
            this.f28598a = c11144c.f28598a;
            this.f28599b = c11144c.f28599b;
            this.f28609l = c11144c.f28609l;
            this.f28600c = c11144c.f28600c;
            this.f28601d = c11144c.f28601d;
            this.f28602e = c11144c.f28602e;
            this.f28605h = c11144c.f28605h;
            this.f28604g = c11144c.f28604g;
            this.f28610m = c11144c.f28610m;
            this.f28607j = c11144c.f28607j;
            this.f28616s = c11144c.f28616s;
            this.f28614q = c11144c.f28614q;
            this.f28618u = c11144c.f28618u;
            this.f28608k = c11144c.f28608k;
            this.f28611n = c11144c.f28611n;
            this.f28612o = c11144c.f28612o;
            this.f28613p = c11144c.f28613p;
            this.f28615r = c11144c.f28615r;
            this.f28617t = c11144c.f28617t;
            this.f28603f = c11144c.f28603f;
            this.f28619v = c11144c.f28619v;
            if (c11144c.f28606i != null) {
                this.f28606i = new Rect(c11144c.f28606i);
            }
        }
    }
}
