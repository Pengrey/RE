package p347s1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: s1.f */
/* loaded from: classes.dex */
public final class PlaceholderSpan extends ReplacementSpan {

    /* renamed from: A */
    private final float f26238A;

    /* renamed from: B */
    private final int f26239B;

    /* renamed from: C */
    private Paint.FontMetricsInt f26240C;

    /* renamed from: D */
    private int f26241D;

    /* renamed from: E */
    private int f26242E;

    /* renamed from: F */
    private boolean f26243F;

    /* renamed from: w */
    private final float f26244w;

    /* renamed from: x */
    private final int f26245x;

    /* renamed from: y */
    private final float f26246y;

    /* renamed from: z */
    private final int f26247z;

    /* compiled from: PlaceholderSpan.kt */
    /* renamed from: s1.f$a */
    /* loaded from: classes.dex */
    public static final class C10035a {
        private C10035a() {
        }

        public /* synthetic */ C10035a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10035a(null);
    }

    public PlaceholderSpan(float f, int i, float f2, int i2, float f3, int i3) {
        this.f26244w = f;
        this.f26245x = i;
        this.f26246y = f2;
        this.f26247z = i2;
        this.f26238A = f3;
        this.f26239B = i3;
    }

    /* renamed from: a */
    public final Paint.FontMetricsInt m9349a() {
        Paint.FontMetricsInt fontMetricsInt = this.f26240C;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitPropException("fontMetrics");
        return null;
    }

    /* renamed from: b */
    public final int m9348b() {
        if (this.f26243F) {
            return this.f26242E;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    /* renamed from: c */
    public final int m9347c() {
        return this.f26239B;
    }

    /* renamed from: d */
    public final int m9346d() {
        if (this.f26243F) {
            return this.f26241D;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        Intrinsics.isThisObjectNull(paint, "paint");
    }

    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int m9345a;
        Intrinsics.isThisObjectNull(paint, "paint");
        this.f26243F = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkIfNull(fontMetricsInt2, "paint.fontMetricsInt");
        this.f26240C = fontMetricsInt2;
        if (m9349a().descent > m9349a().ascent) {
            int i3 = this.f26245x;
            if (i3 == 0) {
                f = this.f26244w * this.f26238A;
            } else if (i3 == 1) {
                f = this.f26244w * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f26241D = C10036g.m9345a(f);
            int i4 = this.f26247z;
            if (i4 == 0) {
                m9345a = C10036g.m9345a(this.f26246y * this.f26238A);
            } else if (i4 == 1) {
                m9345a = C10036g.m9345a(this.f26246y * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.f26242E = m9345a;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = m9349a().ascent;
                fontMetricsInt.descent = m9349a().descent;
                fontMetricsInt.leading = m9349a().leading;
                switch (m9347c()) {
                    case 0:
                        if (fontMetricsInt.ascent > (-m9348b())) {
                            fontMetricsInt.ascent = -m9348b();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + m9348b() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + m9348b();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - m9348b()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - m9348b();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < m9348b()) {
                            int m9348b = fontMetricsInt.ascent - ((m9348b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = m9348b;
                            fontMetricsInt.descent = m9348b + m9348b();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(m9349a().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(m9349a().bottom, fontMetricsInt.descent);
            }
            return m9346d();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }
}
