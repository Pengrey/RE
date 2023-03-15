package p071e0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p393v0.C11003c0;
import p393v0.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleHostView.android.kt */
/* renamed from: e0.r */
/* loaded from: classes.dex */
public final class C4937r extends RippleDrawable {

    /* renamed from: A */
    public static final C4938a f13722A = new C4938a(null);

    /* renamed from: B */
    private static Method f13723B;

    /* renamed from: C */
    private static boolean f13724C;

    /* renamed from: w */
    private final boolean f13725w;

    /* renamed from: x */
    private Color f13726x;

    /* renamed from: y */
    private Integer f13727y;

    /* renamed from: z */
    private boolean f13728z;

    /* compiled from: RippleHostView.android.kt */
    /* renamed from: e0.r$a */
    /* loaded from: classes.dex */
    public static final class C4938a {
        private C4938a() {
        }

        public /* synthetic */ C4938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RippleHostView.android.kt */
    /* renamed from: e0.r$b */
    /* loaded from: classes.dex */
    public static final class C4939b {

        /* renamed from: a */
        public static final C4939b f13729a = new C4939b();

        private C4939b() {
        }

        /* renamed from: a */
        public final void m26236a(RippleDrawable rippleDrawable, int i) {
            Intrinsics.isThisObjectNull(rippleDrawable, "ripple");
            rippleDrawable.setRadius(i);
        }
    }

    public C4937r(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f13725w = z;
    }

    /* renamed from: a */
    private final long m26239a(long j, float f) {
        float m15001h;
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        m15001h = _Ranges.m15001h(f, 1.0f);
        return Color.m6648l(j, m15001h, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: b */
    public final void m26238b(long j, float f) {
        long m26239a = m26239a(j, f);
        Color color = this.f13726x;
        if (color == null ? false : Color.m6646n(color.m6638v(), m26239a)) {
            return;
        }
        this.f13726x = Color.m6652h(m26239a);
        setColor(ColorStateList.valueOf(C11003c0.m6587i(m26239a)));
    }

    /* renamed from: c */
    public final void m26237c(int i) {
        Integer num = this.f13727y;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.f13727y = Integer.valueOf(i);
        if (Build.VERSION.SDK_INT < 23) {
            try {
                if (!f13724C) {
                    f13724C = true;
                    f13723B = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                }
                Method method = f13723B;
                if (method == null) {
                    return;
                }
                method.invoke(this, Integer.valueOf(i));
                return;
            } catch (Exception unused) {
                return;
            }
        }
        C4939b.f13729a.m26236a(this, i);
    }

    public Rect getDirtyBounds() {
        if (!this.f13725w) {
            this.f13728z = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkIfNull(dirtyBounds, "super.getDirtyBounds()");
        this.f13728z = false;
        return dirtyBounds;
    }

    public boolean isProjected() {
        return this.f13728z;
    }
}
