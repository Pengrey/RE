package p047ce;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Objects;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p348s2.C10038b;
import p468yc.C13195u;

/* renamed from: ce.c */
/* loaded from: classes2.dex */
public final class FluidContentResizer {

    /* renamed from: a */
    public static final FluidContentResizer f6136a = new FluidContentResizer();

    /* renamed from: b */
    private static ValueAnimator f6137b = new ObjectAnimator();

    /* renamed from: c */
    private static boolean f6138c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FluidContentResizer.kt */
    /* renamed from: ce.c$a */
    /* loaded from: classes2.dex */
    public static final class C2120a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ ActivityViewHolder f6139w;

        /* renamed from: x */
        final /* synthetic */ long f6140x;

        /* renamed from: y */
        final /* synthetic */ Interpolator f6141y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2120a(ActivityViewHolder activityViewHolder, long j, Interpolator interpolator) {
            super(1);
            this.f6139w = activityViewHolder;
            this.f6140x = j;
            this.f6141y = interpolator;
        }

        /* renamed from: a */
        public final void m34621a(C2122d c2122d) {
            Intrinsics.isThisObjectNull(c2122d, "it");
            if (FluidContentResizer.m34628c()) {
                FluidContentResizer.m34629b(FluidContentResizer.f6136a, this.f6139w, c2122d, this.f6140x, this.f6141y);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m34621a((C2122d) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FluidContentResizer.kt */
    /* renamed from: ce.c$b */
    /* loaded from: classes2.dex */
    public static final class C2121b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C2121b f6142w = new C2121b();

        C2121b() {
            super(0);
        }

        /* renamed from: a */
        public final void m34620a() {
            FluidContentResizer.f6136a.m34625f();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m34620a();
            return C13195u.f34156a;
        }
    }

    private FluidContentResizer() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m34630a(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        m34626e(viewGroup, valueAnimator);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m34629b(FluidContentResizer fluidContentResizer, ActivityViewHolder activityViewHolder, C2122d c2122d, long j, Interpolator interpolator) {
        fluidContentResizer.m34627d(activityViewHolder, c2122d, j, interpolator);
    }

    /* renamed from: c */
    public static final /* synthetic */ boolean m34628c() {
        return f6138c;
    }

    /* renamed from: d */
    private final void m34627d(ActivityViewHolder activityViewHolder, C2122d c2122d, long j, Interpolator interpolator) {
        final ViewGroup m34635a = activityViewHolder.m34635a();
        m34622i(m34635a, c2122d.m34618b());
        f6137b.cancel();
        ValueAnimator ofInt = ObjectAnimator.ofInt(c2122d.m34618b(), c2122d.m34619a());
        ofInt.setInterpolator(interpolator);
        ofInt.setDuration(j);
        Intrinsics.checkIfNull(ofInt, "ofInt(event.contentHeigh… = animDuration\n        }");
        f6137b = ofInt;
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ce.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FluidContentResizer.m34626e(m34635a, valueAnimator);
            }
        });
        f6137b.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m34626e(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(viewGroup, "$contentView");
        FluidContentResizer fluidContentResizer = f6136a;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        fluidContentResizer.m34622i(viewGroup, ((Integer) animatedValue).intValue());
    }

    /* renamed from: h */
    public static /* synthetic */ void m34623h(FluidContentResizer fluidContentResizer, Activity activity, long j, Interpolator interpolator, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 300;
        }
        if ((i & 4) != 0) {
            interpolator = new C10038b();
        }
        fluidContentResizer.m34624g(activity, j, interpolator);
    }

    /* renamed from: i */
    private final void m34622i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public final void m34625f() {
        f6138c = false;
        f6137b.cancel();
        f6137b.removeAllUpdateListeners();
    }

    /* renamed from: g */
    public final void m34624g(Activity activity, long j, Interpolator interpolator) {
        Intrinsics.isThisObjectNull(activity, "activity");
        Intrinsics.isThisObjectNull(interpolator, "interpolator");
        ActivityViewHolder m34631a = ActivityViewHolder.f6130d.m34631a(activity);
        KeyboardVisibilityDetector.f6146a.m34617a(m34631a, new C2120a(m34631a, j, interpolator));
        m34631a.m34632d(C2121b.f6142w);
        f6138c = true;
    }
}
