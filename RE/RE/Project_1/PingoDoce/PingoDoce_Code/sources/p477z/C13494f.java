package p477z;

import android.view.View;
import p181jd.Intrinsics;
import p373u0.Rect;

/* compiled from: BringRectangleOnScreen.android.kt */
/* renamed from: z.f */
/* loaded from: classes.dex */
public final class C13494f {

    /* renamed from: a */
    private View f34303a;

    /* renamed from: a */
    public final void m1265a(Rect rect) {
        Intrinsics.isThisObjectNull(rect, "rect");
        View view = this.f34303a;
        if (view == null) {
            return;
        }
        view.requestRectangleOnScreen(C13495g.m1263a(rect), false);
    }

    /* renamed from: b */
    public final void m1264b(View view) {
        this.f34303a = view;
    }
}
