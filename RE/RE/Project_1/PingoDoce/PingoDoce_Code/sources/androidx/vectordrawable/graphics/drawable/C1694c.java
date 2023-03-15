package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.C0967k;
import androidx.core.graphics.drawable.C0981a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p301q.C9545a;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
/* loaded from: classes.dex */
public class C1694c extends AbstractC1703h implements Animatable {

    /* renamed from: A */
    final Drawable.Callback f5161A;

    /* renamed from: x */
    private C1696b f5162x;

    /* renamed from: y */
    private Context f5163y;

    /* renamed from: z */
    private ArgbEvaluator f5164z;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    /* loaded from: classes.dex */
    class C1695a implements Drawable.Callback {
        C1695a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1694c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1694c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1694c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    /* loaded from: classes.dex */
    public static class C1696b extends Drawable.ConstantState {

        /* renamed from: a */
        int f5166a;

        /* renamed from: b */
        C1704i f5167b;

        /* renamed from: c */
        AnimatorSet f5168c;

        /* renamed from: d */
        ArrayList<Animator> f5169d;

        /* renamed from: e */
        C9545a<Animator, String> f5170e;

        public C1696b(Context context, C1696b c1696b, Drawable.Callback callback, Resources resources) {
            if (c1696b != null) {
                this.f5166a = c1696b.f5166a;
                C1704i c1704i = c1696b.f5167b;
                if (c1704i != null) {
                    Drawable.ConstantState constantState = c1704i.getConstantState();
                    if (resources != null) {
                        this.f5167b = (C1704i) constantState.newDrawable(resources);
                    } else {
                        this.f5167b = (C1704i) constantState.newDrawable();
                    }
                    C1704i c1704i2 = (C1704i) this.f5167b.mutate();
                    this.f5167b = c1704i2;
                    c1704i2.setCallback(callback);
                    this.f5167b.setBounds(c1696b.f5167b.getBounds());
                    this.f5167b.m35650h(false);
                }
                ArrayList<Animator> arrayList = c1696b.f5169d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5169d = new ArrayList<>(size);
                    this.f5170e = new C9545a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c1696b.f5169d.get(i);
                        Animator clone = animator.clone();
                        String str = c1696b.f5170e.get(animator);
                        clone.setTarget(this.f5167b.m35654d(str));
                        this.f5169d.add(clone);
                        this.f5170e.put(clone, str);
                    }
                    m35685a();
                }
            }
        }

        /* renamed from: a */
        public void m35685a() {
            if (this.f5168c == null) {
                this.f5168c = new AnimatorSet();
            }
            this.f5168c.playTogether(this.f5169d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5166a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1694c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C1694c m35688a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1694c c1694c = new C1694c(context);
        c1694c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1694c;
    }

    /* renamed from: b */
    private void m35687b(String str, Animator animator) {
        animator.setTarget(this.f5162x.f5167b.m35654d(str));
        if (Build.VERSION.SDK_INT < 21) {
            m35686c(animator);
        }
        C1696b c1696b = this.f5162x;
        if (c1696b.f5169d == null) {
            c1696b.f5169d = new ArrayList<>();
            this.f5162x.f5170e = new C9545a<>();
        }
        this.f5162x.f5169d.add(animator);
        this.f5162x.f5170e.put(animator, str);
    }

    /* renamed from: c */
    private void m35686c(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                m35686c(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f5164z == null) {
                    this.f5164z = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f5164z);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1703h, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38876a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38875b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5162x.f5167b.draw(canvas);
        if (this.f5162x.f5168c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38873d(drawable);
        }
        return this.f5162x.f5167b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5162x.f5166a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38872e(drawable);
        }
        return this.f5162x.f5167b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5176w == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1697c(this.f5176w.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5162x.f5167b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5162x.f5167b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5162x.f5167b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38870g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C1692a.f5153e);
                    int resourceId = m38961k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1704i m35656b = C1704i.m35656b(resources, resourceId, theme);
                        m35656b.m35650h(false);
                        m35656b.setCallback(this.f5161A);
                        C1704i c1704i = this.f5162x.f5167b;
                        if (c1704i != null) {
                            c1704i.setCallback(null);
                        }
                        this.f5162x.f5167b = m35656b;
                    }
                    m38961k.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1692a.f5154f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5163y;
                        if (context != null) {
                            m35687b(string, C1699e.m35674i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5162x.m35685a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return C0981a.m38869h(drawable);
        }
        return this.f5162x.f5167b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5162x.f5168c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5162x.f5167b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5162x.f5167b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1703h, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5162x.f5167b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5162x.f5167b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5162x.f5167b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38867j(drawable, z);
        } else {
            this.f5162x.f5167b.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5162x.f5167b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTint(int i) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38863n(drawable, i);
        } else {
            this.f5162x.f5167b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38862o(drawable, colorStateList);
        } else {
            this.f5162x.f5167b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.InterfaceC0985b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            C0981a.m38861p(drawable, mode);
        } else {
            this.f5162x.f5167b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5162x.f5167b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f5162x.f5168c.isStarted()) {
        } else {
            this.f5162x.f5168c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f5176w;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5162x.f5168c.end();
        }
    }

    private C1694c(Context context) {
        this(context, null, null);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    /* loaded from: classes.dex */
    private static class C1697c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5171a;

        public C1697c(Drawable.ConstantState constantState) {
            this.f5171a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5171a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5171a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1694c c1694c = new C1694c();
            Drawable newDrawable = this.f5171a.newDrawable();
            c1694c.f5176w = newDrawable;
            newDrawable.setCallback(c1694c.f5161A);
            return c1694c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1694c c1694c = new C1694c();
            Drawable newDrawable = this.f5171a.newDrawable(resources);
            c1694c.f5176w = newDrawable;
            newDrawable.setCallback(c1694c.f5161A);
            return c1694c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1694c c1694c = new C1694c();
            Drawable newDrawable = this.f5171a.newDrawable(resources, theme);
            c1694c.f5176w = newDrawable;
            newDrawable.setCallback(c1694c.f5161A);
            return c1694c;
        }
    }

    private C1694c(Context context, C1696b c1696b, Resources resources) {
        this.f5164z = null;
        C1695a c1695a = new C1695a();
        this.f5161A = c1695a;
        this.f5163y = context;
        if (c1696b != null) {
            this.f5162x = c1696b;
        } else {
            this.f5162x = new C1696b(context, c1696b, c1695a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
