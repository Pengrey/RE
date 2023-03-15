package p125h;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0486i0;
import androidx.core.content.res.C0967k;
import androidx.core.graphics.drawable.InterfaceC0985b;
import androidx.vectordrawable.graphics.drawable.C1694c;
import androidx.vectordrawable.graphics.drawable.C1704i;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p125h.C5724b;
import p125h.C5730d;
import p147i.C5977b;
import p147i.C5978c;
import p147i.C5980e;
import p301q.C9556e;
import p301q.C9559h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: h.a */
/* loaded from: classes.dex */
public class C5716a extends C5730d implements InterfaceC0985b {

    /* renamed from: K */
    private C5719c f15983K;

    /* renamed from: L */
    private AbstractC5723g f15984L;

    /* renamed from: M */
    private int f15985M;

    /* renamed from: N */
    private int f15986N;

    /* renamed from: O */
    private boolean f15987O;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$b */
    /* loaded from: classes.dex */
    public static class C5718b extends AbstractC5723g {

        /* renamed from: a */
        private final Animatable f15988a;

        C5718b(Animatable animatable) {
            super();
            this.f15988a = animatable;
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: c */
        public void mo23258c() {
            this.f15988a.start();
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: d */
        public void mo23257d() {
            this.f15988a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$c */
    /* loaded from: classes.dex */
    public static class C5719c extends C5730d.C5731a {

        /* renamed from: K */
        C9556e<Long> f15989K;

        /* renamed from: L */
        C9559h<Integer> f15990L;

        C5719c(C5719c c5719c, C5716a c5716a, Resources resources) {
            super(c5719c, c5716a, resources);
            if (c5719c != null) {
                this.f15989K = c5719c.f15989K;
                this.f15990L = c5719c.f15990L;
                return;
            }
            this.f15989K = new C9556e<>();
            this.f15990L = new C9559h<>();
        }

        /* renamed from: D */
        private static long m23268D(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: B */
        int m23270B(int[] iArr, Drawable drawable, int i) {
            int m23212z = super.m23212z(iArr, drawable);
            this.f15990L.m10599l(m23212z, Integer.valueOf(i));
            return m23212z;
        }

        /* renamed from: C */
        int m23269C(int i, int i2, Drawable drawable, boolean z) {
            int m23244a = super.m23244a(drawable);
            long m23268D = m23268D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = m23244a;
            this.f15989K.m10649a(m23268D, Long.valueOf(j2 | j));
            if (z) {
                this.f15989K.m10649a(m23268D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m23244a;
        }

        /* renamed from: E */
        int m23267E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f15990L.m10603g(i, 0).intValue();
        }

        /* renamed from: F */
        int m23266F(int[] iArr) {
            int m23215A = super.m23215A(iArr);
            return m23215A >= 0 ? m23215A : super.m23215A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m23265G(int i, int i2) {
            return (int) this.f15989K.m10643g(m23268D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        boolean m23264H(int i, int i2) {
            return (this.f15989K.m10643g(m23268D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        /* renamed from: I */
        boolean m23263I(int i, int i2) {
            return (this.f15989K.m10643g(m23268D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // p125h.C5730d.C5731a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C5716a(this, null);
        }

        @Override // p125h.C5730d.C5731a, p125h.C5724b.AbstractC5728d
        /* renamed from: r */
        void mo23213r() {
            this.f15989K = this.f15989K.clone();
            this.f15990L = this.f15990L.m10607c();
        }

        @Override // p125h.C5730d.C5731a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C5716a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$d */
    /* loaded from: classes.dex */
    public static class C5720d extends AbstractC5723g {

        /* renamed from: a */
        private final C1694c f15991a;

        C5720d(C1694c c1694c) {
            super();
            this.f15991a = c1694c;
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: c */
        public void mo23258c() {
            this.f15991a.start();
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: d */
        public void mo23257d() {
            this.f15991a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$e */
    /* loaded from: classes.dex */
    public static class C5721e extends AbstractC5723g {

        /* renamed from: a */
        private final ObjectAnimator f15992a;

        /* renamed from: b */
        private final boolean f15993b;

        C5721e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C5722f c5722f = new C5722f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                C5977b.m22540a(ofInt, true);
            }
            ofInt.setDuration(c5722f.m23262a());
            ofInt.setInterpolator(c5722f);
            this.f15993b = z2;
            this.f15992a = ofInt;
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: a */
        public boolean mo23260a() {
            return this.f15993b;
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: b */
        public void mo23259b() {
            this.f15992a.reverse();
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: c */
        public void mo23258c() {
            this.f15992a.start();
        }

        @Override // p125h.C5716a.AbstractC5723g
        /* renamed from: d */
        public void mo23257d() {
            this.f15992a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$f */
    /* loaded from: classes.dex */
    private static class C5722f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f15994a;

        /* renamed from: b */
        private int f15995b;

        /* renamed from: c */
        private int f15996c;

        C5722f(AnimationDrawable animationDrawable, boolean z) {
            m23261b(animationDrawable, z);
        }

        /* renamed from: a */
        int m23262a() {
            return this.f15996c;
        }

        /* renamed from: b */
        int m23261b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f15995b = numberOfFrames;
            int[] iArr = this.f15994a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f15994a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f15994a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f15996c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f15996c) + 0.5f);
            int i2 = this.f15995b;
            int[] iArr = this.f15994a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f15996c : 0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* renamed from: h.a$g */
    /* loaded from: classes.dex */
    public static abstract class AbstractC5723g {
        private AbstractC5723g() {
        }

        /* renamed from: a */
        public boolean mo23260a() {
            return false;
        }

        /* renamed from: b */
        public void mo23259b() {
        }

        /* renamed from: c */
        public abstract void mo23258c();

        /* renamed from: d */
        public abstract void mo23257d();
    }

    public C5716a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C5716a m23278m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C5716a c5716a = new C5716a();
            c5716a.m23277n(context, resources, xmlPullParser, attributeSet, theme);
            return c5716a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m23276o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    m23274q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    m23273r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    /* renamed from: p */
    private void m23275p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m23274q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C5980e.f16509h);
        int resourceId = m38961k.getResourceId(C5980e.f16510i, 0);
        int resourceId2 = m38961k.getResourceId(C5980e.f16511j, -1);
        Drawable m40565j = resourceId2 > 0 ? C0486i0.m40567h().m40565j(context, resourceId2) : null;
        m38961k.recycle();
        int[] m23216k = m23216k(attributeSet);
        if (m40565j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    m40565j = C1704i.m35655c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    m40565j = C5978c.m22539a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    m40565j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (m40565j != null) {
            return this.f15983K.m23270B(m23216k, m40565j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m23273r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C5980e.f16512k);
        int resourceId = m38961k.getResourceId(C5980e.f16515n, -1);
        int resourceId2 = m38961k.getResourceId(C5980e.f16514m, -1);
        int resourceId3 = m38961k.getResourceId(C5980e.f16513l, -1);
        Drawable m40565j = resourceId3 > 0 ? C0486i0.m40567h().m40565j(context, resourceId3) : null;
        boolean z = m38961k.getBoolean(C5980e.f16516o, false);
        m38961k.recycle();
        if (m40565j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    m40565j = C1694c.m35688a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    m40565j = C5978c.m22539a(resources, xmlPullParser, attributeSet, theme);
                } else {
                    m40565j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (m40565j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f15983K.m23269C(resourceId, resourceId2, m40565j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    /* renamed from: s */
    private boolean m23272s(int i) {
        int m23255c;
        int m23265G;
        AbstractC5723g c5718b;
        AbstractC5723g abstractC5723g = this.f15984L;
        if (abstractC5723g != null) {
            if (i == this.f15985M) {
                return true;
            }
            if (i == this.f15986N && abstractC5723g.mo23260a()) {
                abstractC5723g.mo23259b();
                this.f15985M = this.f15986N;
                this.f15986N = i;
                return true;
            }
            m23255c = this.f15985M;
            abstractC5723g.mo23257d();
        } else {
            m23255c = m23255c();
        }
        this.f15984L = null;
        this.f15986N = -1;
        this.f15985M = -1;
        C5719c c5719c = this.f15983K;
        int m23267E = c5719c.m23267E(m23255c);
        int m23267E2 = c5719c.m23267E(i);
        if (m23267E2 == 0 || m23267E == 0 || (m23265G = c5719c.m23265G(m23267E, m23267E2)) < 0) {
            return false;
        }
        boolean m23263I = c5719c.m23263I(m23267E, m23267E2);
        m23251g(m23265G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c5718b = new C5721e((AnimationDrawable) current, c5719c.m23264H(m23267E, m23267E2), m23263I);
        } else if (current instanceof C1694c) {
            c5718b = new C5720d((C1694c) current);
        } else {
            if (current instanceof Animatable) {
                c5718b = new C5718b((Animatable) current);
            }
            return false;
        }
        c5718b.mo23258c();
        this.f15984L = c5718b;
        this.f15986N = m23255c;
        this.f15985M = i;
        return true;
    }

    /* renamed from: t */
    private void m23271t(TypedArray typedArray) {
        C5719c c5719c = this.f15983K;
        if (Build.VERSION.SDK_INT >= 21) {
            c5719c.f16023d |= C5978c.m22538b(typedArray);
        }
        c5719c.m23223x(typedArray.getBoolean(C5980e.f16505d, c5719c.f16028i));
        c5719c.m23227t(typedArray.getBoolean(C5980e.f16506e, c5719c.f16031l));
        c5719c.m23226u(typedArray.getInt(C5980e.f16507f, c5719c.f16011A));
        c5719c.m23225v(typedArray.getInt(C5980e.f16508g, c5719c.f16012B));
        setDither(typedArray.getBoolean(C5980e.f16503b, c5719c.f16043x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h.C5730d, p125h.C5724b
    /* renamed from: h */
    public void mo23218h(C5724b.AbstractC5728d abstractC5728d) {
        super.mo23218h(abstractC5728d);
        if (abstractC5728d instanceof C5719c) {
            this.f15983K = (C5719c) abstractC5728d;
        }
    }

    @Override // p125h.C5730d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p125h.C5724b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC5723g abstractC5723g = this.f15984L;
        if (abstractC5723g != null) {
            abstractC5723g.mo23257d();
            this.f15984L = null;
            m23251g(this.f15985M);
            this.f15985M = -1;
            this.f15986N = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p125h.C5730d
    /* renamed from: l */
    public C5719c mo23217j() {
        return new C5719c(this.f15983K, this, null);
    }

    @Override // p125h.C5730d, p125h.C5724b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f15987O && super.mutate() == this) {
            this.f15983K.mo23213r();
            this.f15987O = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m23277n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray m38961k = C0967k.m38961k(resources, theme, attributeSet, C5980e.f16502a);
        setVisible(m38961k.getBoolean(C5980e.f16504c, true), true);
        m23271t(m38961k);
        m23250i(resources);
        m38961k.recycle();
        m23276o(context, resources, xmlPullParser, attributeSet, theme);
        m23275p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p125h.C5730d, p125h.C5724b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int m23266F = this.f15983K.m23266F(iArr);
        boolean z = m23266F != m23255c() && (m23272s(m23266F) || m23251g(m23266F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // p125h.C5724b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC5723g abstractC5723g = this.f15984L;
        if (abstractC5723g != null && (visible || z2)) {
            if (z) {
                abstractC5723g.mo23258c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C5716a(C5719c c5719c, Resources resources) {
        super(null);
        this.f15985M = -1;
        this.f15986N = -1;
        mo23218h(new C5719c(c5719c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
