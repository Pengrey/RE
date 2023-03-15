package p479z1;

import android.content.Context;
import p181jd.Intrinsics;

/* compiled from: AndroidDensity.android.kt */
/* renamed from: z1.a */
/* loaded from: classes.dex */
public final class C13598a {
    /* renamed from: a */
    public static final Density m930a(Context context) {
        Intrinsics.isThisObjectNull(context, "context");
        return C13604f.m882a(context.getResources().getDisplayMetrics().density, context.getResources().getConfiguration().fontScale);
    }
}
