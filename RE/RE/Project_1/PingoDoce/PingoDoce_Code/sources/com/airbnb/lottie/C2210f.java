package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p005a4.C0018e;
import p005a4.C0021h;
import p055d4.C4727b;
import p096f4.C5401s;
import p130h4.C5848d;
import p130h4.C5851g;
import p130h4.Choreographer$FrameCallbackC5849e;
import p152i4.C6015c;
import p481z3.C13631a;
import p481z3.C13632b;

/* renamed from: com.airbnb.lottie.f */
/* loaded from: classes.dex */
public class C2210f extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: A */
    private boolean f6397A;

    /* renamed from: B */
    private boolean f6398B;

    /* renamed from: C */
    private boolean f6399C;

    /* renamed from: D */
    private final ArrayList<InterfaceC2225o> f6400D;

    /* renamed from: E */
    private final ValueAnimator.AnimatorUpdateListener f6401E;

    /* renamed from: F */
    private C13632b f6402F;

    /* renamed from: G */
    private String f6403G;

    /* renamed from: H */
    private InterfaceC2198b f6404H;

    /* renamed from: I */
    private C13631a f6405I;

    /* renamed from: J */
    C2197a f6406J;

    /* renamed from: K */
    C2242s f6407K;

    /* renamed from: L */
    private boolean f6408L;

    /* renamed from: M */
    private C4727b f6409M;

    /* renamed from: N */
    private int f6410N;

    /* renamed from: O */
    private boolean f6411O;

    /* renamed from: P */
    private boolean f6412P;

    /* renamed from: Q */
    private boolean f6413Q;

    /* renamed from: R */
    private boolean f6414R;

    /* renamed from: S */
    private boolean f6415S;

    /* renamed from: w */
    private final Matrix f6416w = new Matrix();

    /* renamed from: x */
    private C2201d f6417x;

    /* renamed from: y */
    private final Choreographer$FrameCallbackC5849e f6418y;

    /* renamed from: z */
    private float f6419z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$a */
    /* loaded from: classes.dex */
    public class C2211a implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ String f6420a;

        C2211a(String str) {
            this.f6420a = str;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34355Y(this.f6420a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$b */
    /* loaded from: classes.dex */
    public class C2212b implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ int f6422a;

        /* renamed from: b */
        final /* synthetic */ int f6423b;

        C2212b(int i, int i2) {
            this.f6422a = i;
            this.f6423b = i2;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34356X(this.f6422a, this.f6423b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$c */
    /* loaded from: classes.dex */
    public class C2213c implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ int f6425a;

        C2213c(int i) {
            this.f6425a = i;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34363Q(this.f6425a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$d */
    /* loaded from: classes.dex */
    public class C2214d implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ float f6427a;

        C2214d(float f) {
            this.f6427a = f;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34344e0(this.f6427a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$e */
    /* loaded from: classes.dex */
    public class C2215e implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ C0018e f6429a;

        /* renamed from: b */
        final /* synthetic */ Object f6430b;

        /* renamed from: c */
        final /* synthetic */ C6015c f6431c;

        C2215e(C0018e c0018e, Object obj, C6015c c6015c) {
            this.f6429a = c0018e;
            this.f6430b = obj;
            this.f6431c = c6015c;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34349c(this.f6429a, this.f6430b, this.f6431c);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$f */
    /* loaded from: classes.dex */
    class C2216f implements ValueAnimator.AnimatorUpdateListener {
        C2216f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (C2210f.this.f6409M != null) {
                C2210f.this.f6409M.mo26767J(C2210f.this.f6418y.m22919i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$g */
    /* loaded from: classes.dex */
    public class C2217g implements InterfaceC2225o {
        C2217g() {
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34369K();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$h */
    /* loaded from: classes.dex */
    public class C2218h implements InterfaceC2225o {
        C2218h() {
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34367M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$i */
    /* loaded from: classes.dex */
    public class C2219i implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ int f6436a;

        C2219i(int i) {
            this.f6436a = i;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34354Z(this.f6436a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$j */
    /* loaded from: classes.dex */
    public class C2220j implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ float f6438a;

        C2220j(float f) {
            this.f6438a = f;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34350b0(this.f6438a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$k */
    /* loaded from: classes.dex */
    public class C2221k implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ int f6440a;

        C2221k(int i) {
            this.f6440a = i;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34359U(this.f6440a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$l */
    /* loaded from: classes.dex */
    public class C2222l implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ float f6442a;

        C2222l(float f) {
            this.f6442a = f;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34357W(this.f6442a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$m */
    /* loaded from: classes.dex */
    public class C2223m implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ String f6444a;

        C2223m(String str) {
            this.f6444a = str;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34352a0(this.f6444a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$n */
    /* loaded from: classes.dex */
    public class C2224n implements InterfaceC2225o {

        /* renamed from: a */
        final /* synthetic */ String f6446a;

        C2224n(String str) {
            this.f6446a = str;
        }

        @Override // com.airbnb.lottie.C2210f.InterfaceC2225o
        /* renamed from: a */
        public void mo34314a(C2201d c2201d) {
            C2210f.this.m34358V(this.f6446a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LottieDrawable.java */
    /* renamed from: com.airbnb.lottie.f$o */
    /* loaded from: classes.dex */
    public interface InterfaceC2225o {
        /* renamed from: a */
        void mo34314a(C2201d c2201d);
    }

    public C2210f() {
        Choreographer$FrameCallbackC5849e choreographer$FrameCallbackC5849e = new Choreographer$FrameCallbackC5849e();
        this.f6418y = choreographer$FrameCallbackC5849e;
        this.f6419z = 1.0f;
        this.f6397A = true;
        this.f6398B = false;
        this.f6399C = false;
        this.f6400D = new ArrayList<>();
        C2216f c2216f = new C2216f();
        this.f6401E = c2216f;
        this.f6410N = 255;
        this.f6414R = true;
        this.f6415S = false;
        choreographer$FrameCallbackC5849e.addUpdateListener(c2216f);
    }

    /* renamed from: d */
    private boolean m34347d() {
        return this.f6397A || this.f6398B;
    }

    /* renamed from: e */
    private float m34345e(Rect rect) {
        return rect.width() / rect.height();
    }

    /* renamed from: f */
    private boolean m34343f() {
        C2201d c2201d = this.f6417x;
        return c2201d == null || getBounds().isEmpty() || m34345e(getBounds()) == m34345e(c2201d.m34430b());
    }

    /* renamed from: g */
    private void m34341g() {
        C4727b c4727b = new C4727b(this, C5401s.m24407a(this.f6417x), this.f6417x.m34421k(), this.f6417x);
        this.f6409M = c4727b;
        if (this.f6412P) {
            c4727b.mo26768H(true);
        }
    }

    /* renamed from: j */
    private void m34335j(Canvas canvas) {
        if (!m34343f()) {
            m34333k(canvas);
        } else {
            m34331l(canvas);
        }
    }

    /* renamed from: k */
    private void m34333k(Canvas canvas) {
        float f;
        if (this.f6409M == null) {
            return;
        }
        int i = -1;
        Rect bounds = getBounds();
        float width = bounds.width() / this.f6417x.m34430b().width();
        float height = bounds.height() / this.f6417x.m34430b().height();
        if (this.f6414R) {
            float min = Math.min(width, height);
            if (min < 1.0f) {
                f = 1.0f / min;
                width /= f;
                height /= f;
            } else {
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width2 = bounds.width() / 2.0f;
                float height2 = bounds.height() / 2.0f;
                float f2 = width2 * min;
                float f3 = min * height2;
                canvas.translate(width2 - f2, height2 - f3);
                canvas.scale(f, f, f2, f3);
            }
        }
        this.f6416w.reset();
        this.f6416w.preScale(width, height);
        this.f6409M.mo3146f(canvas, this.f6416w, this.f6410N);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    /* renamed from: l */
    private void m34331l(Canvas canvas) {
        float f;
        if (this.f6409M == null) {
            return;
        }
        float f2 = this.f6419z;
        float m34317x = m34317x(canvas);
        if (f2 > m34317x) {
            f = this.f6419z / m34317x;
        } else {
            m34317x = f2;
            f = 1.0f;
        }
        int i = -1;
        if (f > 1.0f) {
            i = canvas.save();
            float width = this.f6417x.m34430b().width() / 2.0f;
            float height = this.f6417x.m34430b().height() / 2.0f;
            float f3 = width * m34317x;
            float f4 = height * m34317x;
            canvas.translate((m34376D() * width) - f3, (m34376D() * height) - f4);
            canvas.scale(f, f, f3, f4);
        }
        this.f6416w.reset();
        this.f6416w.preScale(m34317x, m34317x);
        this.f6409M.mo3146f(canvas, this.f6416w, this.f6410N);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    /* renamed from: q */
    private Context m34324q() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* renamed from: r */
    private C13631a m34323r() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f6405I == null) {
            this.f6405I = new C13631a(getCallback(), this.f6406J);
        }
        return this.f6405I;
    }

    /* renamed from: u */
    private C13632b m34320u() {
        if (getCallback() == null) {
            return null;
        }
        C13632b c13632b = this.f6402F;
        if (c13632b != null && !c13632b.m766b(m34324q())) {
            this.f6402F = null;
        }
        if (this.f6402F == null) {
            this.f6402F = new C13632b(getCallback(), this.f6403G, this.f6404H, this.f6417x.m34422j());
        }
        return this.f6402F;
    }

    /* renamed from: x */
    private float m34317x(Canvas canvas) {
        return Math.min(canvas.getWidth() / this.f6417x.m34430b().width(), canvas.getHeight() / this.f6417x.m34430b().height());
    }

    /* renamed from: A */
    public float m34379A() {
        return this.f6418y.m22919i();
    }

    /* renamed from: B */
    public int m34378B() {
        return this.f6418y.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: C */
    public int m34377C() {
        return this.f6418y.getRepeatMode();
    }

    /* renamed from: D */
    public float m34376D() {
        return this.f6419z;
    }

    /* renamed from: E */
    public float m34375E() {
        return this.f6418y.m22914n();
    }

    /* renamed from: F */
    public C2242s m34374F() {
        return this.f6407K;
    }

    /* renamed from: G */
    public Typeface m34373G(String str, String str2) {
        C13631a m34323r = m34323r();
        if (m34323r != null) {
            return m34323r.m770b(str, str2);
        }
        return null;
    }

    /* renamed from: H */
    public boolean m34372H() {
        Choreographer$FrameCallbackC5849e choreographer$FrameCallbackC5849e = this.f6418y;
        if (choreographer$FrameCallbackC5849e == null) {
            return false;
        }
        return choreographer$FrameCallbackC5849e.isRunning();
    }

    /* renamed from: I */
    public boolean m34371I() {
        return this.f6413Q;
    }

    /* renamed from: J */
    public void m34370J() {
        this.f6400D.clear();
        this.f6418y.m22912p();
    }

    /* renamed from: K */
    public void m34369K() {
        if (this.f6409M == null) {
            this.f6400D.add(new C2217g());
            return;
        }
        if (m34347d() || m34378B() == 0) {
            this.f6418y.m22911q();
        }
        if (m34347d()) {
            return;
        }
        m34363Q((int) (m34375E() < 0.0f ? m34316y() : m34318w()));
        this.f6418y.m22920g();
    }

    /* renamed from: L */
    public List<C0018e> m34368L(C0018e c0018e) {
        if (this.f6409M == null) {
            C5848d.m22929c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.f6409M.mo3150i(c0018e, 0, arrayList, new C0018e(new String[0]));
        return arrayList;
    }

    /* renamed from: M */
    public void m34367M() {
        if (this.f6409M == null) {
            this.f6400D.add(new C2218h());
            return;
        }
        if (m34347d() || m34378B() == 0) {
            this.f6418y.m22907w();
        }
        if (m34347d()) {
            return;
        }
        m34363Q((int) (m34375E() < 0.0f ? m34316y() : m34318w()));
        this.f6418y.m22920g();
    }

    /* renamed from: N */
    public void m34366N(boolean z) {
        this.f6413Q = z;
    }

    /* renamed from: O */
    public boolean m34365O(C2201d c2201d) {
        if (this.f6417x == c2201d) {
            return false;
        }
        this.f6415S = false;
        m34337i();
        this.f6417x = c2201d;
        m34341g();
        this.f6418y.m22905z(c2201d);
        m34344e0(this.f6418y.getAnimatedFraction());
        m34336i0(this.f6419z);
        Iterator it = new ArrayList(this.f6400D).iterator();
        while (it.hasNext()) {
            InterfaceC2225o interfaceC2225o = (InterfaceC2225o) it.next();
            if (interfaceC2225o != null) {
                interfaceC2225o.mo34314a(c2201d);
            }
            it.remove();
        }
        this.f6400D.clear();
        c2201d.m34410v(this.f6411O);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
            return true;
        }
        return true;
    }

    /* renamed from: P */
    public void m34364P(C2197a c2197a) {
        C13631a c13631a = this.f6405I;
        if (c13631a != null) {
            c13631a.m769c(c2197a);
        }
    }

    /* renamed from: Q */
    public void m34363Q(int i) {
        if (this.f6417x == null) {
            this.f6400D.add(new C2213c(i));
        } else {
            this.f6418y.m22927A(i);
        }
    }

    /* renamed from: R */
    public void m34362R(boolean z) {
        this.f6398B = z;
    }

    /* renamed from: S */
    public void m34361S(InterfaceC2198b interfaceC2198b) {
        this.f6404H = interfaceC2198b;
        C13632b c13632b = this.f6402F;
        if (c13632b != null) {
            c13632b.m764d(interfaceC2198b);
        }
    }

    /* renamed from: T */
    public void m34360T(String str) {
        this.f6403G = str;
    }

    /* renamed from: U */
    public void m34359U(int i) {
        if (this.f6417x == null) {
            this.f6400D.add(new C2221k(i));
        } else {
            this.f6418y.m22926B(i + 0.99f);
        }
    }

    /* renamed from: V */
    public void m34358V(String str) {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            this.f6400D.add(new C2224n(str));
            return;
        }
        C0021h m34420l = c2201d.m34420l(str);
        if (m34420l != null) {
            m34359U((int) (m34420l.f82b + m34420l.f83c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: W */
    public void m34357W(float f) {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            this.f6400D.add(new C2222l(f));
        } else {
            m34359U((int) C5851g.m22893k(c2201d.m34416p(), this.f6417x.m34426f(), f));
        }
    }

    /* renamed from: X */
    public void m34356X(int i, int i2) {
        if (this.f6417x == null) {
            this.f6400D.add(new C2212b(i, i2));
        } else {
            this.f6418y.m22925C(i, i2 + 0.99f);
        }
    }

    /* renamed from: Y */
    public void m34355Y(String str) {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            this.f6400D.add(new C2211a(str));
            return;
        }
        C0021h m34420l = c2201d.m34420l(str);
        if (m34420l != null) {
            int i = (int) m34420l.f82b;
            m34356X(i, ((int) m34420l.f83c) + i);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: Z */
    public void m34354Z(int i) {
        if (this.f6417x == null) {
            this.f6400D.add(new C2219i(i));
        } else {
            this.f6418y.m22924D(i);
        }
    }

    /* renamed from: a0 */
    public void m34352a0(String str) {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            this.f6400D.add(new C2223m(str));
            return;
        }
        C0021h m34420l = c2201d.m34420l(str);
        if (m34420l != null) {
            m34354Z((int) m34420l.f82b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    /* renamed from: b0 */
    public void m34350b0(float f) {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            this.f6400D.add(new C2220j(f));
        } else {
            m34354Z((int) C5851g.m22893k(c2201d.m34416p(), this.f6417x.m34426f(), f));
        }
    }

    /* renamed from: c */
    public <T> void m34349c(C0018e c0018e, T t, C6015c<T> c6015c) {
        C4727b c4727b = this.f6409M;
        if (c4727b == null) {
            this.f6400D.add(new C2215e(c0018e, t, c6015c));
            return;
        }
        boolean z = true;
        if (c0018e == C0018e.f75c) {
            c4727b.mo3145h(t, c6015c);
        } else if (c0018e.m42116d() != null) {
            c0018e.m42116d().mo3145h(t, c6015c);
        } else {
            List<C0018e> m34368L = m34368L(c0018e);
            for (int i = 0; i < m34368L.size(); i++) {
                m34368L.get(i).m42116d().mo3145h(t, c6015c);
            }
            z = true ^ m34368L.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == InterfaceC2230k.f6455C) {
                m34344e0(m34379A());
            }
        }
    }

    /* renamed from: c0 */
    public void m34348c0(boolean z) {
        if (this.f6412P == z) {
            return;
        }
        this.f6412P = z;
        C4727b c4727b = this.f6409M;
        if (c4727b != null) {
            c4727b.mo26768H(z);
        }
    }

    /* renamed from: d0 */
    public void m34346d0(boolean z) {
        this.f6411O = z;
        C2201d c2201d = this.f6417x;
        if (c2201d != null) {
            c2201d.m34410v(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f6415S = false;
        C2199c.m34435a("Drawable#draw");
        if (this.f6399C) {
            try {
                m34335j(canvas);
            } catch (Throwable th2) {
                C5848d.m22930b("Lottie crashed in draw!", th2);
            }
        } else {
            m34335j(canvas);
        }
        C2199c.m34434b("Drawable#draw");
    }

    /* renamed from: e0 */
    public void m34344e0(float f) {
        if (this.f6417x == null) {
            this.f6400D.add(new C2214d(f));
            return;
        }
        C2199c.m34435a("Drawable#setProgress");
        this.f6418y.m22927A(this.f6417x.m34424h(f));
        C2199c.m34434b("Drawable#setProgress");
    }

    /* renamed from: f0 */
    public void m34342f0(int i) {
        this.f6418y.setRepeatCount(i);
    }

    /* renamed from: g0 */
    public void m34340g0(int i) {
        this.f6418y.setRepeatMode(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6410N;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            return -1;
        }
        return (int) (c2201d.m34430b().height() * m34376D());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C2201d c2201d = this.f6417x;
        if (c2201d == null) {
            return -1;
        }
        return (int) (c2201d.m34430b().width() * m34376D());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m34339h() {
        this.f6400D.clear();
        this.f6418y.cancel();
    }

    /* renamed from: h0 */
    public void m34338h0(boolean z) {
        this.f6399C = z;
    }

    /* renamed from: i */
    public void m34337i() {
        if (this.f6418y.isRunning()) {
            this.f6418y.cancel();
        }
        this.f6417x = null;
        this.f6409M = null;
        this.f6402F = null;
        this.f6418y.m22921f();
        invalidateSelf();
    }

    /* renamed from: i0 */
    public void m34336i0(float f) {
        this.f6419z = f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f6415S) {
            return;
        }
        this.f6415S = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m34372H();
    }

    /* renamed from: j0 */
    public void m34334j0(float f) {
        this.f6418y.m22923F(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void m34332k0(Boolean bool) {
        this.f6397A = bool.booleanValue();
    }

    /* renamed from: l0 */
    public void m34330l0(C2242s c2242s) {
    }

    /* renamed from: m */
    public void m34329m(boolean z) {
        if (this.f6408L == z) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            C5848d.m22929c("Merge paths are not supported pre-Kit Kat.");
            return;
        }
        this.f6408L = z;
        if (this.f6417x != null) {
            m34341g();
        }
    }

    /* renamed from: m0 */
    public boolean m34328m0() {
        return this.f6417x.m34429c().m10598m() > 0;
    }

    /* renamed from: n */
    public boolean m34327n() {
        return this.f6408L;
    }

    /* renamed from: o */
    public void m34326o() {
        this.f6400D.clear();
        this.f6418y.m22920g();
    }

    /* renamed from: p */
    public C2201d m34325p() {
        return this.f6417x;
    }

    /* renamed from: s */
    public int m34322s() {
        return (int) this.f6418y.m22918j();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f6410N = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        C5848d.m22929c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        m34369K();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        m34326o();
    }

    /* renamed from: t */
    public Bitmap m34321t(String str) {
        C13632b m34320u = m34320u();
        if (m34320u != null) {
            return m34320u.m767a(str);
        }
        C2201d c2201d = this.f6417x;
        C2226g c2226g = c2201d == null ? null : c2201d.m34422j().get(str);
        if (c2226g != null) {
            return c2226g.m34313a();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* renamed from: v */
    public String m34319v() {
        return this.f6403G;
    }

    /* renamed from: w */
    public float m34318w() {
        return this.f6418y.m22916l();
    }

    /* renamed from: y */
    public float m34316y() {
        return this.f6418y.m22915m();
    }

    /* renamed from: z */
    public C2235n m34315z() {
        C2201d c2201d = this.f6417x;
        if (c2201d != null) {
            return c2201d.m34418n();
        }
        return null;
    }
}
