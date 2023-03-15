package p393v0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p411w0.AbstractC11509c;
import p411w0.C11511e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidImageBitmap.android.kt */
/* renamed from: v0.o */
/* loaded from: classes.dex */
public final class C11044o {

    /* renamed from: a */
    public static final C11045a f28400a = new C11045a(null);

    /* compiled from: AndroidImageBitmap.android.kt */
    /* renamed from: v0.o$a */
    /* loaded from: classes.dex */
    public static final class C11045a {
        private C11045a() {
        }

        public /* synthetic */ C11045a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Bitmap m6410a(int i, int i2, int i3, boolean z, AbstractC11509c abstractC11509c) {
            Intrinsics.isThisObjectNull(abstractC11509c, "colorSpace");
            Bitmap createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, C11014f.m6531d(i3), z, m6409b(abstractC11509c));
            Intrinsics.checkIfNull(createBitmap, "createBitmap(\n          …olorSpace()\n            )");
            return createBitmap;
        }

        /* renamed from: b */
        public final ColorSpace m6409b(AbstractC11509c abstractC11509c) {
            ColorSpace.Named named;
            Intrinsics.isThisObjectNull(abstractC11509c, "<this>");
            C11511e c11511e = C11511e.f29459a;
            if (Intrinsics.equals(abstractC11509c, c11511e.m4882r())) {
                named = ColorSpace.Named.SRGB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4899a())) {
                named = ColorSpace.Named.ACES;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4898b())) {
                named = ColorSpace.Named.ACESCG;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4897c())) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4896d())) {
                named = ColorSpace.Named.BT2020;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4895e())) {
                named = ColorSpace.Named.BT709;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4894f())) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4893g())) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4891i())) {
                named = ColorSpace.Named.DCI_P3;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4890j())) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4889k())) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4888l())) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4887m())) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4886n())) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (Intrinsics.equals(abstractC11509c, c11511e.m4884p())) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else {
                named = Intrinsics.equals(abstractC11509c, c11511e.m4883q()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
            }
            ColorSpace colorSpace = ColorSpace.get(named);
            Intrinsics.checkIfNull(colorSpace, "get(frameworkNamedSpace)");
            return colorSpace;
        }
    }
}
