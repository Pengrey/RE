package p393v0;

import p181jd.Intrinsics;
import p411w0.AbstractC11509c;
import p411w0.C11511e;

/* renamed from: v0.j0 */
/* loaded from: classes.dex */
public final class ImageBitmap {
    /* renamed from: a */
    public static final InterfaceC11025h0 m6439a(int i, int i2, int i3, boolean z, AbstractC11509c abstractC11509c) {
        Intrinsics.isThisObjectNull(abstractC11509c, "colorSpace");
        return C11014f.m6534a(i, i2, i3, z, abstractC11509c);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC11025h0 m6438b(int i, int i2, int i3, boolean z, AbstractC11509c abstractC11509c, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = C11030i0.f28383a.m6446b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            abstractC11509c = C11511e.f29459a.m4882r();
        }
        return m6439a(i, i2, i3, z, abstractC11509c);
    }
}
