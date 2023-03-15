package p393v0;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import p181jd.Intrinsics;
import p393v0.C11030i0;
import p411w0.AbstractC11509c;

/* compiled from: AndroidImageBitmap.android.kt */
/* renamed from: v0.f */
/* loaded from: classes.dex */
public final class C11014f {
    /* renamed from: a */
    public static final InterfaceC11025h0 m6534a(int i, int i2, int i3, boolean z, AbstractC11509c abstractC11509c) {
        Bitmap createBitmap;
        Intrinsics.isThisObjectNull(abstractC11509c, "colorSpace");
        Bitmap.Config m6531d = m6531d(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = C11044o.f28400a.m6410a(i, i2, i3, z, abstractC11509c);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m6531d);
            Intrinsics.checkIfNull(createBitmap, "createBitmap(\n          …   bitmapConfig\n        )");
            createBitmap.setHasAlpha(z);
        }
        return new C11009e(createBitmap);
    }

    /* renamed from: b */
    public static final Bitmap m6533b(InterfaceC11025h0 interfaceC11025h0) {
        Intrinsics.isThisObjectNull(interfaceC11025h0, "<this>");
        if (interfaceC11025h0 instanceof C11009e) {
            return ((C11009e) interfaceC11025h0).m6553d();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* renamed from: c */
    public static final InterfaceC11025h0 m6532c(Bitmap bitmap) {
        Intrinsics.isThisObjectNull(bitmap, "<this>");
        return new C11009e(bitmap);
    }

    /* renamed from: d */
    public static final Bitmap.Config m6531d(int i) {
        C11030i0.C11031a c11031a = C11030i0.f28383a;
        if (C11030i0.m6448g(i, c11031a.m6446b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C11030i0.m6448g(i, c11031a.m6447a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C11030i0.m6448g(i, c11031a.m6443e())) {
            return Bitmap.Config.RGB_565;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && C11030i0.m6448g(i, c11031a.m6445c())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 >= 26 && C11030i0.m6448g(i, c11031a.m6444d())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }
}
