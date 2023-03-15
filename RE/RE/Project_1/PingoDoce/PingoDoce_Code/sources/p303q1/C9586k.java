package p303q1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p181jd.Intrinsics;

/* compiled from: StaticLayoutFactory.kt */
/* renamed from: q1.k */
/* loaded from: classes.dex */
public final class C9586k {

    /* renamed from: a */
    public static final C9586k f25220a = new C9586k();

    /* renamed from: b */
    private static final InterfaceC9587l f25221b;

    static {
        InterfaceC9587l c9588m;
        if (Build.VERSION.SDK_INT >= 23) {
            c9588m = new StaticLayoutFactory();
        } else {
            c9588m = new C9588m();
        }
        f25221b = c9588m;
    }

    private C9586k() {
    }

    /* renamed from: b */
    public static /* synthetic */ StaticLayout m10549b(C9586k c9586k, CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2, int i9, Object obj) {
        return c9586k.m10550a(charSequence, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? charSequence.length() : i2, textPaint, i3, (i9 & 32) != 0 ? C9578c.f25203a.m10565b() : textDirectionHeuristic, (i9 & 64) != 0 ? C9578c.f25203a.m10566a() : alignment, (i9 & 128) != 0 ? Integer.MAX_VALUE : i4, (i9 & 256) != 0 ? null : truncateAt, (i9 & 512) != 0 ? i3 : i5, (i9 & 1024) != 0 ? 1.0f : f, (i9 & 2048) != 0 ? 0.0f : f2, (i9 & 4096) != 0 ? 0 : i6, (i9 & 8192) != 0 ? true : z, (i9 & 16384) != 0 ? true : z2, (32768 & i9) != 0 ? 0 : i7, (65536 & i9) != 0 ? 0 : i8, (131072 & i9) != 0 ? null : iArr, (i9 & 262144) != 0 ? null : iArr2);
    }

    /* renamed from: a */
    public final StaticLayout m10550a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(textPaint, "paint");
        Intrinsics.isThisObjectNull(textDirectionHeuristic, "textDir");
        Intrinsics.isThisObjectNull(alignment, "alignment");
        return f25221b.mo10548a(new C9590n(charSequence, i, i2, textPaint, i3, textDirectionHeuristic, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, iArr, iArr2));
    }
}
