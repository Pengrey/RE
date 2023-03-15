package p393v0;

import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p181jd.Intrinsics;

/* compiled from: AndroidColorFilter.android.kt */
/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C11006d {
    /* renamed from: a */
    public static final ColorFilter m6564a(long j, int i) {
        BlendModeColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            porterDuffColorFilter = C11051q.f28434a.m6317a(j, i);
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(C11003c0.m6587i(j), C10993a.m6660b(i));
        }
        return new ColorFilter(porterDuffColorFilter);
    }

    /* renamed from: b */
    public static final ColorFilter m6563b(ColorFilter colorFilter) {
        Intrinsics.isThisObjectNull(colorFilter, "<this>");
        return colorFilter.m6602a();
    }
}
