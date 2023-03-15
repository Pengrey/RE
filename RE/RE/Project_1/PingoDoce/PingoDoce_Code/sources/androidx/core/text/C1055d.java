package androidx.core.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C1070c;

/* renamed from: androidx.core.text.d */
/* loaded from: classes.dex */
public class C1055d implements Spannable {

    /* renamed from: w */
    private final Spannable f3384w;

    /* renamed from: x */
    private final C1056a f3385x;

    /* renamed from: y */
    private final PrecomputedText f3386y;

    /* renamed from: a */
    public C1056a m38655a() {
        return this.f3385x;
    }

    /* renamed from: b */
    public PrecomputedText m38654b() {
        Spannable spannable = this.f3384w;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f3384w.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3384w.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3384w.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3384w.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (T[]) this.f3386y.getSpans(i, i2, cls);
        }
        return (T[]) this.f3384w.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3384w.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3384w.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3386y.removeSpan(obj);
                return;
            } else {
                this.f3384w.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3386y.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f3384w.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f3384w.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3384w.toString();
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* renamed from: androidx.core.text.d$a */
    /* loaded from: classes.dex */
    public static final class C1056a {

        /* renamed from: a */
        private final TextPaint f3387a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3388b;

        /* renamed from: c */
        private final int f3389c;

        /* renamed from: d */
        private final int f3390d;

        /* compiled from: PrecomputedTextCompat.java */
        /* renamed from: androidx.core.text.d$a$a */
        /* loaded from: classes.dex */
        public static class C1057a {

            /* renamed from: a */
            private final TextPaint f3391a;

            /* renamed from: b */
            private TextDirectionHeuristic f3392b;

            /* renamed from: c */
            private int f3393c;

            /* renamed from: d */
            private int f3394d;

            public C1057a(TextPaint textPaint) {
                this.f3391a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f3393c = 1;
                    this.f3394d = 1;
                } else {
                    this.f3394d = 0;
                    this.f3393c = 0;
                }
                if (i >= 18) {
                    this.f3392b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f3392b = null;
                }
            }

            /* renamed from: a */
            public C1056a m38648a() {
                return new C1056a(this.f3391a, this.f3392b, this.f3393c, this.f3394d);
            }

            /* renamed from: b */
            public C1057a m38647b(int i) {
                this.f3393c = i;
                return this;
            }

            /* renamed from: c */
            public C1057a m38646c(int i) {
                this.f3394d = i;
                return this;
            }

            /* renamed from: d */
            public C1057a m38645d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3392b = textDirectionHeuristic;
                return this;
            }
        }

        C1056a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f3387a = textPaint;
            this.f3388b = textDirectionHeuristic;
            this.f3389c = i;
            this.f3390d = i2;
        }

        /* renamed from: a */
        public boolean m38653a(C1056a c1056a) {
            int i = Build.VERSION.SDK_INT;
            if ((i < 23 || (this.f3389c == c1056a.m38652b() && this.f3390d == c1056a.m38651c())) && this.f3387a.getTextSize() == c1056a.m38649e().getTextSize() && this.f3387a.getTextScaleX() == c1056a.m38649e().getTextScaleX() && this.f3387a.getTextSkewX() == c1056a.m38649e().getTextSkewX()) {
                if ((i < 21 || (this.f3387a.getLetterSpacing() == c1056a.m38649e().getLetterSpacing() && TextUtils.equals(this.f3387a.getFontFeatureSettings(), c1056a.m38649e().getFontFeatureSettings()))) && this.f3387a.getFlags() == c1056a.m38649e().getFlags()) {
                    if (i >= 24) {
                        if (!this.f3387a.getTextLocales().equals(c1056a.m38649e().getTextLocales())) {
                            return false;
                        }
                    } else if (i >= 17 && !this.f3387a.getTextLocale().equals(c1056a.m38649e().getTextLocale())) {
                        return false;
                    }
                    return this.f3387a.getTypeface() == null ? c1056a.m38649e().getTypeface() == null : this.f3387a.getTypeface().equals(c1056a.m38649e().getTypeface());
                }
                return false;
            }
            return false;
        }

        /* renamed from: b */
        public int m38652b() {
            return this.f3389c;
        }

        /* renamed from: c */
        public int m38651c() {
            return this.f3390d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m38650d() {
            return this.f3388b;
        }

        /* renamed from: e */
        public TextPaint m38649e() {
            return this.f3387a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C1056a) {
                C1056a c1056a = (C1056a) obj;
                if (m38653a(c1056a)) {
                    return Build.VERSION.SDK_INT < 18 || this.f3388b == c1056a.m38650d();
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C1070c.m38633b(Float.valueOf(this.f3387a.getTextSize()), Float.valueOf(this.f3387a.getTextScaleX()), Float.valueOf(this.f3387a.getTextSkewX()), Float.valueOf(this.f3387a.getLetterSpacing()), Integer.valueOf(this.f3387a.getFlags()), this.f3387a.getTextLocales(), this.f3387a.getTypeface(), Boolean.valueOf(this.f3387a.isElegantTextHeight()), this.f3388b, Integer.valueOf(this.f3389c), Integer.valueOf(this.f3390d));
            }
            if (i >= 21) {
                return C1070c.m38633b(Float.valueOf(this.f3387a.getTextSize()), Float.valueOf(this.f3387a.getTextScaleX()), Float.valueOf(this.f3387a.getTextSkewX()), Float.valueOf(this.f3387a.getLetterSpacing()), Integer.valueOf(this.f3387a.getFlags()), this.f3387a.getTextLocale(), this.f3387a.getTypeface(), Boolean.valueOf(this.f3387a.isElegantTextHeight()), this.f3388b, Integer.valueOf(this.f3389c), Integer.valueOf(this.f3390d));
            }
            if (i >= 18) {
                return C1070c.m38633b(Float.valueOf(this.f3387a.getTextSize()), Float.valueOf(this.f3387a.getTextScaleX()), Float.valueOf(this.f3387a.getTextSkewX()), Integer.valueOf(this.f3387a.getFlags()), this.f3387a.getTextLocale(), this.f3387a.getTypeface(), this.f3388b, Integer.valueOf(this.f3389c), Integer.valueOf(this.f3390d));
            }
            if (i >= 17) {
                return C1070c.m38633b(Float.valueOf(this.f3387a.getTextSize()), Float.valueOf(this.f3387a.getTextScaleX()), Float.valueOf(this.f3387a.getTextSkewX()), Integer.valueOf(this.f3387a.getFlags()), this.f3387a.getTextLocale(), this.f3387a.getTypeface(), this.f3388b, Integer.valueOf(this.f3389c), Integer.valueOf(this.f3390d));
            }
            return C1070c.m38633b(Float.valueOf(this.f3387a.getTextSize()), Float.valueOf(this.f3387a.getTextScaleX()), Float.valueOf(this.f3387a.getTextSkewX()), Integer.valueOf(this.f3387a.getFlags()), this.f3387a.getTypeface(), this.f3388b, Integer.valueOf(this.f3389c), Integer.valueOf(this.f3390d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3387a.getTextSize());
            sb2.append(", textScaleX=" + this.f3387a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3387a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb2.append(", letterSpacing=" + this.f3387a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f3387a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb2.append(", textLocale=" + this.f3387a.getTextLocales());
            } else if (i >= 17) {
                sb2.append(", textLocale=" + this.f3387a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f3387a.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + this.f3387a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f3388b);
            sb2.append(", breakStrategy=" + this.f3389c);
            sb2.append(", hyphenationFrequency=" + this.f3390d);
            sb2.append("}");
            return sb2.toString();
        }

        public C1056a(PrecomputedText.Params params) {
            this.f3387a = params.getTextPaint();
            this.f3388b = params.getTextDirection();
            this.f3389c = params.getBreakStrategy();
            this.f3390d = params.getHyphenationFrequency();
        }
    }
}
