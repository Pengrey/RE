package p412w1;

import android.graphics.Typeface;
import p181jd.Intrinsics;

/* compiled from: TypefaceAdapter.android.kt */
/* renamed from: w1.k */
/* loaded from: classes.dex */
public final class C11548k {

    /* renamed from: a */
    public static final C11548k f29569a = new C11548k();

    private C11548k() {
    }

    /* renamed from: a */
    public final Typeface m4749a(Typeface typeface, int i, boolean z) {
        Intrinsics.isThisObjectNull(typeface, "typeface");
        Typeface create = Typeface.create(typeface, i, z);
        Intrinsics.checkIfNull(create, "create(typeface, finalFontWeight, finalFontStyle)");
        return create;
    }
}
