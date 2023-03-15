package p336rc;

import android.graphics.PointF;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import sc.EmptyEffect;
import sc.InterfaceC10145a;
import tc.Circle;
import tc.InterfaceC10475c;

/* renamed from: rc.e */
/* loaded from: classes2.dex */
public final class Target {

    /* renamed from: a */
    private final PointF f25838a;

    /* renamed from: b */
    private final InterfaceC10475c f25839b;

    /* renamed from: c */
    private final InterfaceC10145a f25840c;

    /* renamed from: d */
    private final View f25841d;

    /* renamed from: e */
    private final InterfaceC9850b f25842e;

    /* compiled from: Target.kt */
    /* renamed from: rc.e$a */
    /* loaded from: classes2.dex */
    public static final class C9864a {

        /* renamed from: f */
        private static final PointF f25843f;

        /* renamed from: g */
        private static final Circle f25844g;

        /* renamed from: h */
        private static final EmptyEffect f25845h;

        /* renamed from: a */
        private PointF f25846a = f25843f;

        /* renamed from: b */
        private InterfaceC10475c f25847b = f25844g;

        /* renamed from: c */
        private InterfaceC10145a f25848c = f25845h;

        /* renamed from: d */
        private View f25849d;

        /* renamed from: e */
        private InterfaceC9850b f25850e;

        /* compiled from: Target.kt */
        /* renamed from: rc.e$a$a */
        /* loaded from: classes2.dex */
        public static final class C9865a {
            private C9865a() {
            }

            public /* synthetic */ C9865a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C9865a(null);
            f25843f = new PointF(0.0f, 0.0f);
            f25844g = new Circle(100.0f, 0L, null, 6, null);
            f25845h = new EmptyEffect(0L, null, 0, 7, null);
        }

        /* renamed from: a */
        public final Target m9790a() {
            return new Target(this.f25846a, this.f25847b, this.f25848c, this.f25849d, this.f25850e);
        }

        /* renamed from: b */
        public final C9864a m9789b(float f, float f2) {
            m9788c(new PointF(f, f2));
            return this;
        }

        /* renamed from: c */
        public final C9864a m9788c(PointF pointF) {
            Intrinsics.isThisObjectNull(pointF, "anchor");
            this.f25846a = pointF;
            return this;
        }

        /* renamed from: d */
        public final C9864a m9787d(View view) {
            Intrinsics.isThisObjectNull(view, "view");
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            m9789b(iArr[0] + (view.getWidth() / 2.0f), iArr[1] + (view.getHeight() / 2.0f));
            return this;
        }

        /* renamed from: e */
        public final C9864a m9786e(InterfaceC10145a interfaceC10145a) {
            Intrinsics.isThisObjectNull(interfaceC10145a, "effect");
            this.f25848c = interfaceC10145a;
            return this;
        }

        /* renamed from: f */
        public final C9864a m9785f(InterfaceC9850b interfaceC9850b) {
            Intrinsics.isThisObjectNull(interfaceC9850b, "listener");
            this.f25850e = interfaceC9850b;
            return this;
        }

        /* renamed from: g */
        public final C9864a m9784g(View view) {
            Intrinsics.isThisObjectNull(view, "overlay");
            this.f25849d = view;
            return this;
        }

        /* renamed from: h */
        public final C9864a m9783h(InterfaceC10475c interfaceC10475c) {
            Intrinsics.isThisObjectNull(interfaceC10475c, "shape");
            this.f25847b = interfaceC10475c;
            return this;
        }
    }

    public Target(PointF pointF, InterfaceC10475c interfaceC10475c, InterfaceC10145a interfaceC10145a, View view, InterfaceC9850b interfaceC9850b) {
        Intrinsics.isThisObjectNull(pointF, "anchor");
        Intrinsics.isThisObjectNull(interfaceC10475c, "shape");
        Intrinsics.isThisObjectNull(interfaceC10145a, "effect");
        this.f25838a = pointF;
        this.f25839b = interfaceC10475c;
        this.f25840c = interfaceC10145a;
        this.f25841d = view;
        this.f25842e = interfaceC9850b;
    }

    /* renamed from: a */
    public final PointF m9795a() {
        return this.f25838a;
    }

    /* renamed from: b */
    public final InterfaceC10145a m9794b() {
        return this.f25840c;
    }

    /* renamed from: c */
    public final InterfaceC9850b m9793c() {
        return this.f25842e;
    }

    /* renamed from: d */
    public final View m9792d() {
        return this.f25841d;
    }

    /* renamed from: e */
    public final InterfaceC10475c m9791e() {
        return this.f25839b;
    }
}
