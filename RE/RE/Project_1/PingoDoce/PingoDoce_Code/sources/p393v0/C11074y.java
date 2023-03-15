package p393v0;

import android.graphics.Canvas;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CanvasUtils.android.kt */
/* renamed from: v0.y */
/* loaded from: classes.dex */
public final class C11074y {

    /* renamed from: a */
    public static final C11074y f28454a = new C11074y();

    private C11074y() {
    }

    /* renamed from: a */
    public final void m6236a(Canvas canvas, boolean z) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
