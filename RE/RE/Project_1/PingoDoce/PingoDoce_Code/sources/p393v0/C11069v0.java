package p393v0;

import android.graphics.Rect;
import android.graphics.RectF;
import p181jd.Intrinsics;

/* compiled from: RectHelper.android.kt */
/* renamed from: v0.v0 */
/* loaded from: classes.dex */
public final class C11069v0 {
    /* renamed from: a */
    public static final Rect m6244a(p373u0.Rect rect) {
        Intrinsics.isThisObjectNull(rect, "<this>");
        return new Rect((int) rect.m7125f(), (int) rect.m7122i(), (int) rect.m7124g(), (int) rect.m7128c());
    }

    /* renamed from: b */
    public static final RectF m6243b(p373u0.Rect rect) {
        Intrinsics.isThisObjectNull(rect, "<this>");
        return new RectF(rect.m7125f(), rect.m7122i(), rect.m7124g(), rect.m7128c());
    }

    /* renamed from: c */
    public static final p373u0.Rect m6242c(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "<this>");
        return new p373u0.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
