package p171j3;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.AbstractC1693b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p129h3.C5828f;
import p220ld.C7037c;
import p297pd._Ranges;
import p327r3.EnumC9804h;

/* renamed from: j3.a */
/* loaded from: classes.dex */
public final class C6299a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    private final List<AbstractC1693b> f17268A = new ArrayList();

    /* renamed from: B */
    private final int f17269B;

    /* renamed from: C */
    private final int f17270C;

    /* renamed from: D */
    private long f17271D;

    /* renamed from: E */
    private int f17272E;

    /* renamed from: F */
    private int f17273F;

    /* renamed from: G */
    private Drawable f17274G;

    /* renamed from: H */
    private final Drawable f17275H;

    /* renamed from: w */
    private final EnumC9804h f17276w;

    /* renamed from: x */
    private final int f17277x;

    /* renamed from: y */
    private final boolean f17278y;

    /* renamed from: z */
    private final boolean f17279z;

    /* compiled from: CrossfadeDrawable.kt */
    /* renamed from: j3.a$a */
    /* loaded from: classes.dex */
    public static final class C6300a {
        private C6300a() {
        }

        public /* synthetic */ C6300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C6300a(null);
    }

    public C6299a(Drawable drawable, Drawable drawable2, EnumC9804h enumC9804h, int i, boolean z, boolean z2) {
        this.f17276w = enumC9804h;
        this.f17277x = i;
        this.f17278y = z;
        this.f17279z = z2;
        this.f17269B = m21276a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f17270C = m21276a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f17272E = 255;
        this.f17274G = drawable != null ? drawable.mutate() : null;
        Drawable mutate = drawable2 != null ? drawable2.mutate() : null;
        this.f17275H = mutate;
        if (i > 0) {
            Drawable drawable3 = this.f17274G;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (mutate == null) {
                return;
            }
            mutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    /* renamed from: a */
    private final int m21276a(Integer num, Integer num2) {
        if (this.f17279z || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    /* renamed from: b */
    private final void m21275b() {
        this.f17273F = 2;
        this.f17274G = null;
        List<AbstractC1693b> list = this.f17268A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).mo29392a(this);
        }
    }

    /* renamed from: c */
    public final void m21274c(Drawable drawable, Rect rect) {
        int m19531b;
        int m19531b2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double m22969c = C5828f.m22969c(intrinsicWidth, intrinsicHeight, width, height, this.f17276w);
            double d = 2;
            m19531b = C7037c.m19531b((width - (intrinsicWidth * m22969c)) / d);
            m19531b2 = C7037c.m19531b((height - (m22969c * intrinsicHeight)) / d);
            drawable.setBounds(rect.left + m19531b, rect.top + m19531b2, rect.right - m19531b, rect.bottom - m19531b2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        double m14998k;
        int save;
        Drawable drawable;
        int i = this.f17273F;
        if (i == 0) {
            Drawable drawable2 = this.f17274G;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f17272E);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                }
            }
        } else if (i == 2) {
            Drawable drawable3 = this.f17275H;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f17272E);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                }
            }
        } else {
            double uptimeMillis = (SystemClock.uptimeMillis() - this.f17271D) / this.f17277x;
            m14998k = _Ranges.m14998k(uptimeMillis, 0.0d, 1.0d);
            int i2 = this.f17272E;
            int i3 = (int) (m14998k * i2);
            if (this.f17278y) {
                i2 -= i3;
            }
            boolean z = uptimeMillis >= 1.0d;
            if (!z && (drawable = this.f17274G) != null) {
                drawable.setAlpha(i2);
                save = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                }
            }
            Drawable drawable4 = this.f17275H;
            if (drawable4 != null) {
                drawable4.setAlpha(i3);
                save = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                }
            }
            if (z) {
                m21275b();
            } else {
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17272E;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        Drawable drawable;
        int i = this.f17273F;
        if (i == 0) {
            Drawable drawable2 = this.f17274G;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        } else if (i != 1) {
            if (i == 2 && (drawable = this.f17275H) != null) {
                return drawable.getColorFilter();
            }
            return null;
        } else {
            Drawable drawable3 = this.f17275H;
            if (drawable3 == null || (colorFilter = drawable3.getColorFilter()) == null) {
                Drawable drawable4 = this.f17274G;
                if (drawable4 != null) {
                    return drawable4.getColorFilter();
                }
                return null;
            }
            return colorFilter;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f17270C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f17269B;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f17274G;
        Drawable drawable2 = this.f17275H;
        int i = this.f17273F;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        } else if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else if (drawable == null || drawable2 == null) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        } else {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f17273F == 1;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            m21274c(drawable, rect);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 != null) {
            m21274c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f17274G;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f17275H;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17274G;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f17275H;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (z) {
            this.f17272E = i;
            return;
        }
        throw new IllegalArgumentException(("Invalid alpha: " + i).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17274G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f17275H;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f17274G;
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
        Drawable drawable2 = this.f17275H;
        Animatable animatable2 = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f17273F != 0) {
            return;
        }
        this.f17273F = 1;
        this.f17271D = SystemClock.uptimeMillis();
        List<AbstractC1693b> list = this.f17268A;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).m35689b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f17274G;
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        Drawable drawable2 = this.f17275H;
        Animatable animatable2 = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f17273F != 2) {
            m21275b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
