package p230m1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Objects;
import p181jd.Intrinsics;
import p393v0.C11014f;
import p393v0.InterfaceC11025h0;

/* compiled from: ImageResources.android.kt */
/* renamed from: m1.a */
/* loaded from: classes.dex */
public final class C7093a {
    /* renamed from: a */
    public static final InterfaceC11025h0 m19317a(InterfaceC11025h0.C11026a c11026a, Resources resources, int i) {
        Intrinsics.isThisObjectNull(c11026a, "<this>");
        Intrinsics.isThisObjectNull(resources, "res");
        Drawable drawable = resources.getDrawable(i, null);
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Intrinsics.checkIfNull(bitmap, "res.getDrawable(id, null…as BitmapDrawable).bitmap");
        return C11014f.m6532c(bitmap);
    }
}
