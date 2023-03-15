package p393v0;

import android.graphics.Bitmap;
import p181jd.Intrinsics;

/* compiled from: AndroidImageBitmap.android.kt */
/* renamed from: v0.e */
/* loaded from: classes.dex */
public final class C11009e implements InterfaceC11025h0 {

    /* renamed from: b */
    private final Bitmap f28343b;

    public C11009e(Bitmap bitmap) {
        Intrinsics.isThisObjectNull(bitmap, "bitmap");
        this.f28343b = bitmap;
    }

    /* renamed from: a */
    public int mo6479a() {
        return this.f28343b.getHeight();
    }

    /* renamed from: b */
    public int mo6478b() {
        return this.f28343b.getWidth();
    }

    /* renamed from: c */
    public void mo6477c() {
        this.f28343b.prepareToDraw();
    }

    /* renamed from: d */
    public final Bitmap m6553d() {
        return this.f28343b;
    }
}
