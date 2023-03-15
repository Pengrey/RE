package p366t8;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0969a;

/* renamed from: t8.b */
/* loaded from: classes.dex */
public class C10399b {

    /* renamed from: a */
    public static final boolean f27024a;

    /* renamed from: b */
    private static final int[] f27025b;

    /* renamed from: c */
    private static final int[] f27026c;

    /* renamed from: d */
    private static final int[] f27027d;

    /* renamed from: e */
    private static final int[] f27028e;

    /* renamed from: f */
    private static final int[] f27029f;

    /* renamed from: g */
    private static final int[] f27030g;

    /* renamed from: h */
    private static final int[] f27031h;

    /* renamed from: i */
    private static final int[] f27032i;

    /* renamed from: j */
    private static final int[] f27033j;

    /* renamed from: k */
    private static final int[] f27034k;

    /* renamed from: l */
    static final String f27035l;

    static {
        f27024a = Build.VERSION.SDK_INT >= 21;
        f27025b = new int[]{16842919};
        f27026c = new int[]{16843623, 16842908};
        f27027d = new int[]{16842908};
        f27028e = new int[]{16843623};
        f27029f = new int[]{16842913, 16842919};
        f27030g = new int[]{16842913, 16843623, 16842908};
        f27031h = new int[]{16842913, 16842908};
        f27032i = new int[]{16842913, 16843623};
        f27033j = new int[]{16842913};
        f27034k = new int[]{16842910, 16842919};
        f27035l = C10399b.class.getSimpleName();
    }

    private C10399b() {
    }

    /* renamed from: a */
    public static ColorStateList m8074a(ColorStateList colorStateList) {
        if (f27024a) {
            return new ColorStateList(new int[][]{f27033j, StateSet.NOTHING}, new int[]{m8072c(colorStateList, f27029f), m8072c(colorStateList, f27025b)});
        }
        int[] iArr = f27029f;
        int[] iArr2 = f27030g;
        int[] iArr3 = f27031h;
        int[] iArr4 = f27032i;
        int[] iArr5 = f27025b;
        int[] iArr6 = f27026c;
        int[] iArr7 = f27027d;
        int[] iArr8 = f27028e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f27033j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m8072c(colorStateList, iArr), m8072c(colorStateList, iArr2), m8072c(colorStateList, iArr3), m8072c(colorStateList, iArr4), 0, m8072c(colorStateList, iArr5), m8072c(colorStateList, iArr6), m8072c(colorStateList, iArr7), m8072c(colorStateList, iArr8), 0});
    }

    @TargetApi(21)
    /* renamed from: b */
    private static int m8073b(int i) {
        return C0969a.m38939j(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: c */
    private static int m8072c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f27024a ? m8073b(colorForState) : colorForState;
    }

    /* renamed from: d */
    public static ColorStateList m8071d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f27034k, 0)) != 0) {
                Log.w(f27035l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: e */
    public static boolean m8070e(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
