package p071e0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.C10774f;
import p373u0.C10783m;
import p392v.C10988p;
import p393v0.C11069v0;

/* compiled from: RippleHostView.android.kt */
/* renamed from: e0.l */
/* loaded from: classes.dex */
public final class C4926l extends View {

    /* renamed from: B */
    private static final int[] f13694B;

    /* renamed from: C */
    private static final int[] f13695C;

    /* renamed from: A */
    private InterfaceC6097a f13696A;

    /* renamed from: w */
    private C4937r f13697w;

    /* renamed from: x */
    private Boolean f13698x;

    /* renamed from: y */
    private Long f13699y;

    /* renamed from: z */
    private Runnable f13700z;

    /* compiled from: RippleHostView.android.kt */
    /* renamed from: e0.l$a */
    /* loaded from: classes.dex */
    public static final class C4927a {
        private C4927a() {
        }

        public /* synthetic */ C4927a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4927a(null);
        f13694B = new int[]{16842919, 16842910};
        f13695C = new int[0];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4926l(Context context) {
        super(context);
        Intrinsics.isThisObjectNull(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m26268a(C4926l c4926l) {
        m39644setRippleState$lambda2(c4926l);
    }

    /* renamed from: c */
    private final void m26266c(boolean z) {
        C4937r c4937r = new C4937r(z);
        setBackground(c4937r);
        this.f13697w = c4937r;
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f13700z;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f13699y;
        long longValue = currentAnimationTimeMillis - (l == null ? 0L : l.longValue());
        if (!z && longValue < 5) {
            Runnable runnable2 = new Runnable() { // from class: e0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C4926l.m39644setRippleState$lambda2(C4926l.this);
                }
            };
            this.f13700z = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            int[] iArr = z ? f13694B : f13695C;
            C4937r c4937r = this.f13697w;
            if (c4937r != null) {
                c4937r.setState(iArr);
            }
        }
        this.f13699y = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setRippleState$lambda-2 */
    public static final void m39644setRippleState$lambda2(C4926l c4926l) {
        Intrinsics.isThisObjectNull(c4926l, "this$0");
        C4937r c4937r = c4926l.f13697w;
        if (c4937r != null) {
            c4937r.setState(f13695C);
        }
        c4926l.f13700z = null;
    }

    /* renamed from: b */
    public final void m26267b(C10988p c10988p, boolean z, long j, int i, long j2, float f, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(c10988p, "interaction");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onInvalidateRipple");
        if (this.f13697w == null || !Intrinsics.equals(Boolean.valueOf(z), this.f13698x)) {
            m26266c(z);
            this.f13698x = Boolean.valueOf(z);
        }
        C4937r c4937r = this.f13697w;
        Intrinsics.ifNullDoSomething(c4937r);
        this.f13696A = interfaceC6097a;
        m26263f(j, i, j2, f);
        if (z) {
            c4937r.setHotspot(C10774f.m7145k(c10988p.m6665a()), C10774f.m7144l(c10988p.m6665a()));
        } else {
            c4937r.setHotspot(c4937r.getBounds().centerX(), c4937r.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: d */
    public final void m26265d() {
        this.f13696A = null;
        Runnable runnable = this.f13700z;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f13700z;
            Intrinsics.ifNullDoSomething(runnable2);
            runnable2.run();
        } else {
            C4937r c4937r = this.f13697w;
            if (c4937r != null) {
                c4937r.setState(f13695C);
            }
        }
        C4937r c4937r2 = this.f13697w;
        if (c4937r2 == null) {
            return;
        }
        c4937r2.setVisible(false, false);
        unscheduleDrawable(c4937r2);
    }

    /* renamed from: e */
    public final void m26264e() {
        setRippleState(false);
    }

    /* renamed from: f */
    public final void m26263f(long j, int i, long j2, float f) {
        C4937r c4937r = this.f13697w;
        if (c4937r == null) {
            return;
        }
        c4937r.m26237c(i);
        c4937r.m26238b(j2, f);
        Rect m6244a = C11069v0.m6244a(C10783m.m7083c(j));
        setLeft(m6244a.left);
        setTop(m6244a.top);
        setRight(m6244a.right);
        setBottom(m6244a.bottom);
        c4937r.setBounds(m6244a);
    }

    public void invalidateDrawable(Drawable drawable) {
        Intrinsics.isThisObjectNull(drawable, "who");
        InterfaceC6097a interfaceC6097a = this.f13696A;
        if (interfaceC6097a == null) {
            return;
        }
        interfaceC6097a.mo42214q();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void refreshDrawableState() {
    }
}
