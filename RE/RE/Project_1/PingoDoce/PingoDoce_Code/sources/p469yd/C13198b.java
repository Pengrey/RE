package p469yd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lib.mozidev.p225me.extextview.ExTextView;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: yd.b */
/* loaded from: classes2.dex */
public final class C13198b implements InterfaceC13197a {

    /* renamed from: a */
    private InterfaceC13200b f34159a;

    /* renamed from: b */
    private final Paint f34160b;

    /* renamed from: c */
    private boolean f34161c;

    /* renamed from: d */
    private float f34162d;

    /* renamed from: e */
    private float f34163e;

    /* renamed from: f */
    private final float f34164f;

    /* renamed from: g */
    private int f34165g;

    /* renamed from: h */
    private float f34166h;

    /* renamed from: i */
    private long f34167i;

    /* renamed from: j */
    private int f34168j;

    /* renamed from: k */
    private boolean f34169k;

    /* renamed from: l */
    private boolean f34170l;

    /* renamed from: m */
    private int f34171m;

    /* renamed from: n */
    private List f34172n;

    /* renamed from: o */
    private final ExTextView f34173o;

    /* compiled from: StrikeThroughPainting.kt */
    /* renamed from: yd.b$a */
    /* loaded from: classes2.dex */
    public static final class C13199a {
        private C13199a() {
        }

        public /* synthetic */ C13199a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: StrikeThroughPainting.kt */
    /* renamed from: yd.b$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC13200b {
        /* renamed from: a */
        void m1415a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StrikeThroughPainting.kt */
    /* renamed from: yd.b$c */
    /* loaded from: classes2.dex */
    public static final class C13201c implements ValueAnimator.AnimatorUpdateListener {
        C13201c() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C13198b c13198b = C13198b.this;
            Intrinsics.isNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                C13198b.m1431d(c13198b, ((Float) animatedValue).floatValue());
                C13198b.m1432c(C13198b.this).invalidate();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* compiled from: StrikeThroughPainting.kt */
    /* renamed from: yd.b$d */
    /* loaded from: classes2.dex */
    public static final class C13202d extends AnimatorListenerAdapter {
        C13202d() {
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.m20926i(animator, "animation");
            super.onAnimationEnd(animator);
            C13198b.m1430e(C13198b.this, true);
            InterfaceC13200b m1433b = C13198b.m1433b(C13198b.this);
            if (m1433b != null) {
                m1433b.m1415a();
            }
        }
    }

    static {
        new C13199a(null);
    }

    public C13198b(ExTextView exTextView) {
        Intrinsics.m20926i(exTextView, "targetView");
        this.f34173o = exTextView;
        Paint paint = new Paint();
        this.f34160b = paint;
        this.f34164f = 0.2857143f;
        this.f34165g = -16777216;
        this.f34166h = 2.0f;
        this.f34167i = 1000L;
        this.f34169k = true;
        this.f34172n = new ArrayList();
        exTextView.m19397f(this);
        paint.setColor(this.f34165g);
        paint.setStrokeWidth(this.f34166h);
    }

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC13200b m1433b(C13198b c13198b) {
        return c13198b.f34159a;
    }

    /* renamed from: c */
    public static final /* synthetic */ ExTextView m1432c(C13198b c13198b) {
        return c13198b.f34173o;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m1431d(C13198b c13198b, float f) {
        c13198b.f34163e = f;
    }

    /* renamed from: e */
    public static final /* synthetic */ void m1430e(C13198b c13198b, boolean z) {
        c13198b.f34170l = z;
    }

    /* renamed from: f */
    private final void m1429f() {
        this.f34171m = 0;
        for (Rect rect : this.f34172n) {
            this.f34171m += rect.width();
        }
    }

    /* renamed from: h */
    private final void m1427h(Canvas canvas) {
        int size = this.f34172n.size();
        for (int i = 0; i < size; i++) {
            m1425j(canvas, i, ((Rect) this.f34172n.get(i)).width() * this.f34163e);
        }
    }

    /* renamed from: i */
    private final void m1426i(Canvas canvas) {
        float f = this.f34171m * this.f34163e;
        int m1421n = m1421n(f);
        if (m1421n < 0) {
            return;
        }
        float f2 = 0.0f;
        for (int i = 0; i < m1421n; i++) {
            f2 += m1424k(this, canvas, i, 0.0f, 4, null);
        }
        m1425j(canvas, m1421n, f - f2);
    }

    /* renamed from: j */
    private final float m1425j(Canvas canvas, int i, float f) {
        Rect rect = (Rect) this.f34172n.get(i);
        TextPaint paint = this.f34173o.getPaint();
        Intrinsics.isNotNull(paint, "targetView.paint");
        float textSize = paint.getTextSize() * this.f34164f;
        TextPaint paint2 = this.f34173o.getPaint();
        Intrinsics.isNotNull(paint2, "targetView.paint");
        float f2 = ((-1) * paint2.getFontMetrics().top) - textSize;
        float f3 = 0.0f;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            f3 += ((Rect) this.f34172n.get(i)).height();
        }
        float f4 = f3 + f2;
        if (f == -1.0f) {
            f = rect.width();
        }
        int i2 = rect.left;
        canvas.drawLine(i2, f4, i2 + f, f4, this.f34160b);
        return f;
    }

    /* renamed from: k */
    static /* synthetic */ float m1424k(C13198b c13198b, Canvas canvas, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = -1.0f;
        }
        return c13198b.m1425j(canvas, i, f);
    }

    /* renamed from: l */
    private final void m1423l() {
        int lineCount = this.f34173o.getLineCount();
        Layout layout = this.f34173o.getLayout();
        for (int i = 0; i < lineCount; i++) {
            Rect rect = new Rect();
            if (this.f34169k) {
                rect.set((int) layout.getLineLeft(i), layout.getLineTop(i), (int) layout.getLineRight(i), layout.getLineBottom(i));
            } else {
                this.f34173o.getLineBounds(i, rect);
            }
            this.f34172n.add(rect);
        }
    }

    /* renamed from: m */
    private final C13195u m1422m() {
        this.f34162d = 0.0f;
        TextPaint paint = this.f34173o.getPaint();
        Intrinsics.isNotNull(paint, "targetView.paint");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetrics != null) {
            this.f34162d = fontMetrics.bottom - fontMetrics.top;
            return C13195u.f34156a;
        }
        return C13195u.f34156a;
    }

    /* renamed from: n */
    private final int m1421n(float f) {
        int size = this.f34172n.size();
        float f2 = 0.0f;
        for (int i = 0; i < size; i++) {
            f2 += ((Rect) this.f34172n.get(i)).width();
            if (f2 >= f) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private final void m1420o() {
        m1422m();
        m1423l();
        if (this.f34168j != 0) {
            return;
        }
        m1429f();
    }

    /* renamed from: p */
    private final void m1419p() {
        this.f34163e = 0.0f;
        this.f34161c = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C13201c());
        ofFloat.addListener(new C13202d());
        Intrinsics.isNotNull(ofFloat, "animator");
        ofFloat.setDuration(this.f34167i);
        ofFloat.start();
    }

    /* renamed from: a */
    public void mo1435a(Canvas canvas) {
        Intrinsics.m20926i(canvas, "canvas");
        if (!this.f34161c || this.f34162d == 0.0f) {
            return;
        }
        canvas.save();
        int i = this.f34168j;
        if (i == 0) {
            m1426i(canvas);
        } else if (i == 1) {
            m1427h(canvas);
        }
        canvas.restore();
    }

    /* renamed from: g */
    public final void m1428g() {
        this.f34161c = false;
        this.f34163e = 0.0f;
        this.f34173o.invalidate();
    }

    /* renamed from: q */
    public final void m1418q() {
        m1420o();
        m1419p();
    }

    /* renamed from: r */
    public final C13198b m1417r(float f) {
        this.f34166h = f;
        this.f34160b.setStrokeWidth(f);
        return this;
    }

    /* renamed from: s */
    public final C13198b m1416s(long j) {
        this.f34167i = j;
        return this;
    }
}
