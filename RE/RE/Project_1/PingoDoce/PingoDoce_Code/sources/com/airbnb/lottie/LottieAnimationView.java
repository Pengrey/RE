package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.C1112b0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p005a4.C0018e;
import p111g.C5586a;
import p130h4.C5848d;
import p130h4.C5852h;
import p152i4.C6015c;

/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: R */
    private static final String f6319R = LottieAnimationView.class.getSimpleName();

    /* renamed from: S */
    private static final InterfaceC2227h<Throwable> f6320S = new C2191a();

    /* renamed from: A */
    private InterfaceC2227h<Throwable> f6321A;

    /* renamed from: B */
    private int f6322B;

    /* renamed from: C */
    private final C2210f f6323C;

    /* renamed from: D */
    private boolean f6324D;

    /* renamed from: E */
    private String f6325E;

    /* renamed from: F */
    private int f6326F;

    /* renamed from: G */
    private boolean f6327G;

    /* renamed from: H */
    private boolean f6328H;

    /* renamed from: I */
    private boolean f6329I;

    /* renamed from: J */
    private boolean f6330J;

    /* renamed from: K */
    private boolean f6331K;

    /* renamed from: L */
    private boolean f6332L;

    /* renamed from: M */
    private EnumC2240q f6333M;

    /* renamed from: N */
    private final Set<InterfaceC2229j> f6334N;

    /* renamed from: O */
    private int f6335O;

    /* renamed from: P */
    private C2232m<C2201d> f6336P;

    /* renamed from: Q */
    private C2201d f6337Q;

    /* renamed from: y */
    private final InterfaceC2227h<C2201d> f6338y;

    /* renamed from: z */
    private final InterfaceC2227h<Throwable> f6339z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2190a();

        /* renamed from: A */
        String f6340A;

        /* renamed from: B */
        int f6341B;

        /* renamed from: C */
        int f6342C;

        /* renamed from: w */
        String f6343w;

        /* renamed from: x */
        int f6344x;

        /* renamed from: y */
        float f6345y;

        /* renamed from: z */
        boolean f6346z;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        /* loaded from: classes.dex */
        class C2190a implements Parcelable.Creator<SavedState> {
            C2190a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState mo34443a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] mo34442b(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C2191a c2191a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f6343w);
            parcel.writeFloat(this.f6345y);
            parcel.writeInt(this.f6346z ? 1 : 0);
            parcel.writeString(this.f6340A);
            parcel.writeInt(this.f6341B);
            parcel.writeInt(this.f6342C);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f6343w = parcel.readString();
            this.f6345y = parcel.readFloat();
            this.f6346z = parcel.readInt() == 1;
            this.f6340A = parcel.readString();
            this.f6341B = parcel.readInt();
            this.f6342C = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    /* loaded from: classes.dex */
    public class C2191a implements InterfaceC2227h<Throwable> {
        C2191a() {
        }

        @Override // com.airbnb.lottie.InterfaceC2227h
        /* renamed from: b */
        public void mo34441b(Throwable th2) {
            if (C5852h.m22880k(th2)) {
                C5848d.m22928d("Unable to load composition.", th2);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th2);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    /* loaded from: classes.dex */
    class C2192b implements InterfaceC2227h<C2201d> {
        C2192b() {
        }

        @Override // com.airbnb.lottie.InterfaceC2227h
        /* renamed from: b */
        public void mo34441b(C2201d c2201d) {
            LottieAnimationView.this.setComposition(c2201d);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    /* loaded from: classes.dex */
    class C2193c implements InterfaceC2227h<Throwable> {
        C2193c() {
        }

        @Override // com.airbnb.lottie.InterfaceC2227h
        /* renamed from: b */
        public void mo34441b(Throwable th2) {
            if (LottieAnimationView.this.f6322B != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f6322B);
            }
            (LottieAnimationView.this.f6321A == null ? LottieAnimationView.f6320S : LottieAnimationView.this.f6321A).mo34441b(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    /* loaded from: classes.dex */
    public class CallableC2194d implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ int f6349a;

        CallableC2194d(int i) {
            this.f6349a = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> mo34438a() {
            return LottieAnimationView.this.f6332L ? C2202e.m34395o(LottieAnimationView.this.getContext(), this.f6349a) : C2202e.m34394p(LottieAnimationView.this.getContext(), this.f6349a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    /* loaded from: classes.dex */
    public class CallableC2195e implements Callable<C2231l<C2201d>> {

        /* renamed from: a */
        final /* synthetic */ String f6351a;

        CallableC2195e(String str) {
            this.f6351a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C2231l<C2201d> mo34437a() {
            return LottieAnimationView.this.f6332L ? C2202e.m34404f(LottieAnimationView.this.getContext(), this.f6351a) : C2202e.m34403g(LottieAnimationView.this.getContext(), this.f6351a, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C2196f {

        /* renamed from: a */
        static final /* synthetic */ int[] f6353a;

        static {
            int[] iArr = new int[EnumC2240q.values().length];
            f6353a = iArr;
            try {
                iArr[EnumC2240q.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6353a[EnumC2240q.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6353a[EnumC2240q.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6338y = new C2192b();
        this.f6339z = new C2193c();
        this.f6322B = 0;
        this.f6323C = new C2210f();
        this.f6327G = false;
        this.f6328H = false;
        this.f6329I = false;
        this.f6330J = false;
        this.f6331K = false;
        this.f6332L = true;
        this.f6333M = EnumC2240q.AUTOMATIC;
        this.f6334N = new HashSet();
        this.f6335O = 0;
        m34451o(attributeSet, C2238o.lottieAnimationViewStyle);
    }

    /* renamed from: i */
    private void m34457i() {
        C2232m<C2201d> c2232m = this.f6336P;
        if (c2232m != null) {
            c2232m.m34293k(this.f6338y);
            this.f6336P.m34294j(this.f6339z);
        }
    }

    /* renamed from: j */
    private void m34456j() {
        this.f6337Q = null;
        this.f6323C.m34337i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r3 != false) goto L25;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m34454l() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C2196f.f6353a
            com.airbnb.lottie.q r1 = r5.f6333M
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L46
            if (r0 == r1) goto L13
            r3 = 3
            if (r0 == r3) goto L15
        L13:
            r1 = r2
            goto L46
        L15:
            com.airbnb.lottie.d r0 = r5.f6337Q
            r3 = 0
            if (r0 == 0) goto L27
            boolean r0 = r0.m34415q()
            if (r0 == 0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L27
            goto L44
        L27:
            com.airbnb.lottie.d r0 = r5.f6337Q
            if (r0 == 0) goto L33
            int r0 = r0.m34419m()
            r4 = 4
            if (r0 <= r4) goto L33
            goto L44
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L3a
            goto L44
        L3a:
            r4 = 24
            if (r0 == r4) goto L44
            r4 = 25
            if (r0 != r4) goto L43
            goto L44
        L43:
            r3 = r2
        L44:
            if (r3 == 0) goto L13
        L46:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L50
            r0 = 0
            r5.setLayerType(r1, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m34454l():void");
    }

    /* renamed from: m */
    private C2232m<C2201d> m34453m(String str) {
        if (isInEditMode()) {
            return new C2232m<>(new CallableC2195e(str), true);
        }
        return this.f6332L ? C2202e.m34406d(getContext(), str) : C2202e.m34405e(getContext(), str, null);
    }

    /* renamed from: n */
    private C2232m<C2201d> m34452n(int i) {
        if (isInEditMode()) {
            return new C2232m<>(new CallableC2194d(i), true);
        }
        return this.f6332L ? C2202e.m34397m(getContext(), i) : C2202e.m34396n(getContext(), i, null);
    }

    /* renamed from: o */
    private void m34451o(AttributeSet attributeSet, int i) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2239p.f6499a, i, 0);
        this.f6332L = obtainStyledAttributes.getBoolean(C2239p.f6501c, true);
        int i2 = C2239p.f6510l;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C2239p.f6505g;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C2239p.f6516r;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(C2239p.f6504f, 0));
        if (obtainStyledAttributes.getBoolean(C2239p.f6500b, false)) {
            this.f6329I = true;
            this.f6331K = true;
        }
        if (obtainStyledAttributes.getBoolean(C2239p.f6508j, false)) {
            this.f6323C.m34342f0(-1);
        }
        int i5 = C2239p.f6513o;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = C2239p.f6512n;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = C2239p.f6515q;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C2239p.f6507i));
        setProgress(obtainStyledAttributes.getFloat(C2239p.f6509k, 0.0f));
        m34455k(obtainStyledAttributes.getBoolean(C2239p.f6503e, false));
        int i8 = C2239p.f6502d;
        if (obtainStyledAttributes.hasValue(i8)) {
            m34459g(new C0018e("**"), InterfaceC2230k.f6457E, new C6015c(new C2241r(C5586a.m23700a(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor())));
        }
        int i9 = C2239p.f6514p;
        if (obtainStyledAttributes.hasValue(i9)) {
            this.f6323C.m34336i0(obtainStyledAttributes.getFloat(i9, 1.0f));
        }
        int i10 = C2239p.f6511m;
        if (obtainStyledAttributes.hasValue(i10)) {
            EnumC2240q enumC2240q = EnumC2240q.AUTOMATIC;
            int i11 = obtainStyledAttributes.getInt(i10, enumC2240q.ordinal());
            if (i11 >= EnumC2240q.values().length) {
                i11 = enumC2240q.ordinal();
            }
            setRenderMode(EnumC2240q.values()[i11]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C2239p.f6506h, false));
        obtainStyledAttributes.recycle();
        this.f6323C.m34332k0(Boolean.valueOf(C5852h.m22885f(getContext()) != 0.0f));
        m34454l();
        this.f6324D = true;
    }

    private void setCompositionTask(C2232m<C2201d> c2232m) {
        m34456j();
        m34457i();
        this.f6336P = c2232m.m34298f(this.f6338y).m34299e(this.f6339z);
    }

    /* renamed from: v */
    private void m34444v() {
        boolean m34450p = m34450p();
        setImageDrawable(null);
        setImageDrawable(this.f6323C);
        if (m34450p) {
            this.f6323C.m34367M();
        }
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        C2199c.m34435a("buildDrawingCache");
        this.f6335O++;
        super.buildDrawingCache(z);
        if (this.f6335O == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(EnumC2240q.HARDWARE);
        }
        this.f6335O--;
        C2199c.m34434b("buildDrawingCache");
    }

    /* renamed from: g */
    public <T> void m34459g(C0018e c0018e, T t, C6015c<T> c6015c) {
        this.f6323C.m34349c(c0018e, t, c6015c);
    }

    public C2201d getComposition() {
        return this.f6337Q;
    }

    public long getDuration() {
        C2201d c2201d = this.f6337Q;
        if (c2201d != null) {
            return c2201d.m34428d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f6323C.m34322s();
    }

    public String getImageAssetsFolder() {
        return this.f6323C.m34319v();
    }

    public float getMaxFrame() {
        return this.f6323C.m34318w();
    }

    public float getMinFrame() {
        return this.f6323C.m34316y();
    }

    public C2235n getPerformanceTracker() {
        return this.f6323C.m34315z();
    }

    public float getProgress() {
        return this.f6323C.m34379A();
    }

    public int getRepeatCount() {
        return this.f6323C.m34378B();
    }

    public int getRepeatMode() {
        return this.f6323C.m34377C();
    }

    public float getScale() {
        return this.f6323C.m34376D();
    }

    public float getSpeed() {
        return this.f6323C.m34375E();
    }

    /* renamed from: h */
    public void m34458h() {
        this.f6329I = false;
        this.f6328H = false;
        this.f6327G = false;
        this.f6323C.m34339h();
        m34454l();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C2210f c2210f = this.f6323C;
        if (drawable2 == c2210f) {
            super.invalidateDrawable(c2210f);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: k */
    public void m34455k(boolean z) {
        this.f6323C.m34329m(z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f6331K || this.f6329I)) {
            m34448r();
            this.f6331K = false;
            this.f6329I = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        if (m34450p()) {
            m34458h();
            this.f6329I = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f6343w;
        this.f6325E = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f6325E);
        }
        int i = savedState.f6344x;
        this.f6326F = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f6345y);
        if (savedState.f6346z) {
            m34448r();
        }
        this.f6323C.m34360T(savedState.f6340A);
        setRepeatMode(savedState.f6341B);
        setRepeatCount(savedState.f6342C);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f6343w = this.f6325E;
        savedState.f6344x = this.f6326F;
        savedState.f6345y = this.f6323C.m34379A();
        savedState.f6346z = this.f6323C.m34372H() || (!C1112b0.m38447V(this) && this.f6329I);
        savedState.f6340A = this.f6323C.m34319v();
        savedState.f6341B = this.f6323C.m34377C();
        savedState.f6342C = this.f6323C.m34378B();
        return savedState;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        if (this.f6324D) {
            if (isShown()) {
                if (this.f6328H) {
                    m34447s();
                } else if (this.f6327G) {
                    m34448r();
                }
                this.f6328H = false;
                this.f6327G = false;
            } else if (m34450p()) {
                m34449q();
                this.f6328H = true;
            }
        }
    }

    /* renamed from: p */
    public boolean m34450p() {
        return this.f6323C.m34372H();
    }

    /* renamed from: q */
    public void m34449q() {
        this.f6331K = false;
        this.f6329I = false;
        this.f6328H = false;
        this.f6327G = false;
        this.f6323C.m34370J();
        m34454l();
    }

    /* renamed from: r */
    public void m34448r() {
        if (isShown()) {
            this.f6323C.m34369K();
            m34454l();
            return;
        }
        this.f6327G = true;
    }

    /* renamed from: s */
    public void m34447s() {
        if (isShown()) {
            this.f6323C.m34367M();
            m34454l();
            return;
        }
        this.f6327G = false;
        this.f6328H = true;
    }

    public void setAnimation(int i) {
        this.f6326F = i;
        this.f6325E = null;
        setCompositionTask(m34452n(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m34445u(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f6332L ? C2202e.m34393q(getContext(), str) : C2202e.m34392r(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f6323C.m34366N(z);
    }

    public void setCacheComposition(boolean z) {
        this.f6332L = z;
    }

    public void setComposition(C2201d c2201d) {
        if (C2199c.f6354a) {
            String str = f6319R;
            Log.v(str, "Set Composition \n" + c2201d);
        }
        this.f6323C.setCallback(this);
        this.f6337Q = c2201d;
        this.f6330J = true;
        boolean m34365O = this.f6323C.m34365O(c2201d);
        this.f6330J = false;
        m34454l();
        if (getDrawable() != this.f6323C || m34365O) {
            if (!m34365O) {
                m34444v();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (InterfaceC2229j interfaceC2229j : this.f6334N) {
                interfaceC2229j.m34306a(c2201d);
            }
        }
    }

    public void setFailureListener(InterfaceC2227h<Throwable> interfaceC2227h) {
        this.f6321A = interfaceC2227h;
    }

    public void setFallbackResource(int i) {
        this.f6322B = i;
    }

    public void setFontAssetDelegate(C2197a c2197a) {
        this.f6323C.m34364P(c2197a);
    }

    public void setFrame(int i) {
        this.f6323C.m34363Q(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f6323C.m34362R(z);
    }

    public void setImageAssetDelegate(InterfaceC2198b interfaceC2198b) {
        this.f6323C.m34361S(interfaceC2198b);
    }

    public void setImageAssetsFolder(String str) {
        this.f6323C.m34360T(str);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m34457i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m34457i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m34457i();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f6323C.m34359U(i);
    }

    public void setMaxProgress(float f) {
        this.f6323C.m34357W(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f6323C.m34355Y(str);
    }

    public void setMinFrame(int i) {
        this.f6323C.m34354Z(i);
    }

    public void setMinProgress(float f) {
        this.f6323C.m34350b0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f6323C.m34348c0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f6323C.m34346d0(z);
    }

    public void setProgress(float f) {
        this.f6323C.m34344e0(f);
    }

    public void setRenderMode(EnumC2240q enumC2240q) {
        this.f6333M = enumC2240q;
        m34454l();
    }

    public void setRepeatCount(int i) {
        this.f6323C.m34342f0(i);
    }

    public void setRepeatMode(int i) {
        this.f6323C.m34340g0(i);
    }

    public void setSafeMode(boolean z) {
        this.f6323C.m34338h0(z);
    }

    public void setScale(float f) {
        this.f6323C.m34336i0(f);
        if (getDrawable() == this.f6323C) {
            m34444v();
        }
    }

    public void setSpeed(float f) {
        this.f6323C.m34334j0(f);
    }

    public void setTextDelegate(C2242s c2242s) {
        this.f6323C.m34330l0(c2242s);
    }

    /* renamed from: t */
    public void m34446t(InputStream inputStream, String str) {
        setCompositionTask(C2202e.m34402h(inputStream, str));
    }

    /* renamed from: u */
    public void m34445u(String str, String str2) {
        m34446t(new ByteArrayInputStream(str.getBytes()), str2);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C2210f c2210f;
        if (!this.f6330J && drawable == (c2210f = this.f6323C) && c2210f.m34372H()) {
            m34449q();
        } else if (!this.f6330J && (drawable instanceof C2210f)) {
            C2210f c2210f2 = (C2210f) drawable;
            if (c2210f2.m34372H()) {
                c2210f2.m34370J();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.f6323C.m34358V(str);
    }

    public void setMinFrame(String str) {
        this.f6323C.m34352a0(str);
    }

    public void setAnimation(String str) {
        this.f6325E = str;
        this.f6326F = 0;
        setCompositionTask(m34453m(str));
    }
}
