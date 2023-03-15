package p372u;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u.d */
/* loaded from: classes.dex */
public final class EdgeEffectCompat {

    /* renamed from: a */
    public static final EdgeEffectCompat f27450a = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    /* renamed from: a */
    public final EdgeEffect m7394a(Context context, AttributeSet attributeSet) {
        Intrinsics.isThisObjectNull(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public final float m7393b(EdgeEffect edgeEffect) {
        Intrinsics.isThisObjectNull(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* renamed from: c */
    public final float m7392c(EdgeEffect edgeEffect, float f, float f2) {
        Intrinsics.isThisObjectNull(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
