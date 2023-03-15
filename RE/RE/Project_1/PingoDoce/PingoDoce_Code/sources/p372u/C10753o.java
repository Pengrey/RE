package p372u;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p181jd.Intrinsics;

/* compiled from: EdgeEffectCompat.kt */
/* renamed from: u.o */
/* loaded from: classes.dex */
public final class C10753o {

    /* renamed from: a */
    public static final C10753o f27827a = new C10753o();

    private C10753o() {
    }

    /* renamed from: a */
    public final EdgeEffect m7222a(Context context, AttributeSet attributeSet) {
        Intrinsics.isThisObjectNull(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            return EdgeEffectCompat.f27450a.m7394a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public final float m7221b(EdgeEffect edgeEffect) {
        Intrinsics.isThisObjectNull(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return EdgeEffectCompat.f27450a.m7393b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public final void m7220c(EdgeEffect edgeEffect, int i) {
        Intrinsics.isThisObjectNull(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    /* renamed from: d */
    public final float m7219d(EdgeEffect edgeEffect, float f, float f2) {
        Intrinsics.isThisObjectNull(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return EdgeEffectCompat.f27450a.m7392c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }
}
