package p336rc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.C0928a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: rc.c */
/* loaded from: classes2.dex */
public final class Spotlight {

    /* renamed from: a */
    private int f25803a;

    /* renamed from: b */
    private final SpotlightView f25804b;

    /* renamed from: c */
    private final Target[] f25805c;

    /* renamed from: d */
    private final long f25806d;

    /* renamed from: e */
    private final TimeInterpolator f25807e;

    /* renamed from: f */
    private final ViewGroup f25808f;

    /* renamed from: g */
    private final InterfaceC9849a f25809g;

    /* compiled from: Spotlight.kt */
    /* renamed from: rc.c$a */
    /* loaded from: classes2.dex */
    public static final class C9851a {

        /* renamed from: h */
        private static final long f25810h;

        /* renamed from: i */
        private static final DecelerateInterpolator f25811i;

        /* renamed from: j */
        private static final int f25812j;

        /* renamed from: a */
        private Target[] f25813a;

        /* renamed from: b */
        private long f25814b;

        /* renamed from: c */
        private TimeInterpolator f25815c;

        /* renamed from: d */
        private int f25816d;

        /* renamed from: e */
        private ViewGroup f25817e;

        /* renamed from: f */
        private InterfaceC9849a f25818f;

        /* renamed from: g */
        private final Activity f25819g;

        /* compiled from: Spotlight.kt */
        /* renamed from: rc.c$a$a */
        /* loaded from: classes2.dex */
        public static final class C9852a {
            private C9852a() {
            }

            public /* synthetic */ C9852a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C9852a(null);
            f25810h = TimeUnit.SECONDS.toMillis(1L);
            f25811i = new DecelerateInterpolator(2.0f);
            f25812j = 100663296;
        }

        public C9851a(Activity activity) {
            Intrinsics.isThisObjectNull(activity, "activity");
            this.f25819g = activity;
            this.f25814b = f25810h;
            this.f25815c = f25811i;
            this.f25816d = f25812j;
        }

        /* renamed from: a */
        public final Spotlight m9811a() {
            SpotlightView spotlightView = new SpotlightView(this.f25819g, null, 0, this.f25816d);
            Target[] targetArr = this.f25813a;
            if (targetArr != null) {
                ViewGroup viewGroup = this.f25817e;
                if (viewGroup == null) {
                    Window window = this.f25819g.getWindow();
                    Intrinsics.checkIfNull(window, "activity.window");
                    View decorView = window.getDecorView();
                    Objects.requireNonNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    viewGroup = (ViewGroup) decorView;
                }
                return new Spotlight(spotlightView, targetArr, this.f25814b, this.f25815c, viewGroup, this.f25818f, null);
            }
            throw new IllegalArgumentException("targets should not be null. ".toString());
        }

        /* renamed from: b */
        public final C9851a m9810b(TimeInterpolator timeInterpolator) {
            Intrinsics.isThisObjectNull(timeInterpolator, "interpolator");
            this.f25815c = timeInterpolator;
            return this;
        }

        /* renamed from: c */
        public final C9851a m9809c(int i) {
            this.f25816d = C0928a.m39113d(this.f25819g, i);
            return this;
        }

        /* renamed from: d */
        public final C9851a m9808d(ViewGroup viewGroup) {
            Intrinsics.isThisObjectNull(viewGroup, "container");
            this.f25817e = viewGroup;
            return this;
        }

        /* renamed from: e */
        public final C9851a m9807e(long j) {
            this.f25814b = j;
            return this;
        }

        /* renamed from: f */
        public final C9851a m9806f(InterfaceC9849a interfaceC9849a) {
            Intrinsics.isThisObjectNull(interfaceC9849a, "listener");
            this.f25818f = interfaceC9849a;
            return this;
        }

        /* renamed from: g */
        public final C9851a m9805g(List list) {
            Intrinsics.isThisObjectNull(list, "targets");
            if (!list.isEmpty()) {
                Object[] array = list.toArray(new Target[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                this.f25813a = (Target[]) array;
                return this;
            }
            throw new IllegalArgumentException("targets should not be empty. ".toString());
        }

        /* renamed from: h */
        public final C9851a m9804h(Target... targetArr) {
            Intrinsics.isThisObjectNull(targetArr, "targets");
            if (!(targetArr.length == 0)) {
                this.f25813a = (Target[]) Arrays.copyOf(targetArr, targetArr.length);
                return this;
            }
            throw new IllegalArgumentException("targets should not be empty. ".toString());
        }
    }

    /* compiled from: Spotlight.kt */
    /* renamed from: rc.c$b */
    /* loaded from: classes2.dex */
    public static final class C9853b {
        private C9853b() {
        }

        public /* synthetic */ C9853b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Spotlight.kt */
    /* renamed from: rc.c$c */
    /* loaded from: classes2.dex */
    public static final class C9854c extends AnimatorListenerAdapter {
        C9854c() {
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            Spotlight.m9822d(Spotlight.this).m9803a();
            Spotlight.m9824b(Spotlight.this).removeView(Spotlight.m9822d(Spotlight.this));
            InterfaceC9849a m9821e = Spotlight.m9821e(Spotlight.this);
            if (m9821e != null) {
                m9821e.mo9829a();
            }
        }
    }

    /* compiled from: Spotlight.kt */
    /* renamed from: rc.c$d */
    /* loaded from: classes2.dex */
    public static final class C9855d extends AnimatorListenerAdapter {

        /* renamed from: b */
        final /* synthetic */ int f25822b;

        C9855d(int i) {
            this.f25822b = i;
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            InterfaceC9850b m9793c = Spotlight.m9820f(Spotlight.this)[Spotlight.m9823c(Spotlight.this)].m9793c();
            if (m9793c != null) {
                m9793c.mo9827a();
            }
            if (this.f25822b < Spotlight.m9820f(Spotlight.this).length) {
                Target[] m9820f = Spotlight.m9820f(Spotlight.this);
                int i = this.f25822b;
                Target target = m9820f[i];
                Spotlight.m9819g(Spotlight.this, i);
                Spotlight.m9822d(Spotlight.this).m9799e(target);
                InterfaceC9850b m9793c2 = target.m9793c();
                if (m9793c2 != null) {
                    m9793c2.mo9826b();
                    return;
                }
                return;
            }
            Spotlight.m9825a(Spotlight.this);
        }
    }

    /* compiled from: Spotlight.kt */
    /* renamed from: rc.c$e */
    /* loaded from: classes2.dex */
    public static final class C9856e extends AnimatorListenerAdapter {
        C9856e() {
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            Spotlight.m9818h(Spotlight.this, 0);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.isThisObjectNull(animator, "animation");
            InterfaceC9849a m9821e = Spotlight.m9821e(Spotlight.this);
            if (m9821e != null) {
                m9821e.mo9828b();
            }
        }
    }

    static {
        new C9853b(null);
    }

    private Spotlight(SpotlightView spotlightView, Target[] targetArr, long j, TimeInterpolator timeInterpolator, ViewGroup viewGroup, InterfaceC9849a interfaceC9849a) {
        this.f25804b = spotlightView;
        this.f25805c = targetArr;
        this.f25806d = j;
        this.f25807e = timeInterpolator;
        this.f25808f = viewGroup;
        this.f25809g = interfaceC9849a;
        this.f25803a = -1;
        viewGroup.addView(spotlightView, -1, -1);
    }

    /* renamed from: a */
    public static final /* synthetic */ void m9825a(Spotlight spotlight) {
        spotlight.m9816j();
    }

    /* renamed from: b */
    public static final /* synthetic */ ViewGroup m9824b(Spotlight spotlight) {
        return spotlight.f25808f;
    }

    /* renamed from: c */
    public static final /* synthetic */ int m9823c(Spotlight spotlight) {
        return spotlight.f25803a;
    }

    /* renamed from: d */
    public static final /* synthetic */ SpotlightView m9822d(Spotlight spotlight) {
        return spotlight.f25804b;
    }

    /* renamed from: e */
    public static final /* synthetic */ InterfaceC9849a m9821e(Spotlight spotlight) {
        return spotlight.f25809g;
    }

    /* renamed from: f */
    public static final /* synthetic */ Target[] m9820f(Spotlight spotlight) {
        return spotlight.f25805c;
    }

    /* renamed from: g */
    public static final /* synthetic */ void m9819g(Spotlight spotlight, int i) {
        spotlight.f25803a = i;
    }

    /* renamed from: h */
    public static final /* synthetic */ void m9818h(Spotlight spotlight, int i) {
        spotlight.m9814l(i);
    }

    /* renamed from: j */
    private final void m9816j() {
        this.f25804b.m9802b(this.f25806d, this.f25807e, new C9854c());
    }

    /* renamed from: l */
    private final void m9814l(int i) {
        if (this.f25803a == -1) {
            Target target = this.f25805c[i];
            this.f25803a = i;
            this.f25804b.m9799e(target);
            InterfaceC9850b m9793c = target.m9793c();
            if (m9793c != null) {
                m9793c.mo9826b();
                return;
            }
            return;
        }
        this.f25804b.m9801c(new C9855d(i));
    }

    /* renamed from: n */
    private final void m9812n() {
        this.f25804b.m9800d(this.f25806d, this.f25807e, new C9856e());
    }

    /* renamed from: i */
    public final void m9817i() {
        m9816j();
    }

    /* renamed from: k */
    public final void m9815k() {
        m9814l(this.f25803a + 1);
    }

    /* renamed from: m */
    public final void m9813m() {
        m9812n();
    }

    public /* synthetic */ Spotlight(SpotlightView spotlightView, Target[] targetArr, long j, TimeInterpolator timeInterpolator, ViewGroup viewGroup, InterfaceC9849a interfaceC9849a, DefaultConstructorMarker defaultConstructorMarker) {
        this(spotlightView, targetArr, j, timeInterpolator, viewGroup, interfaceC9849a);
    }
}
