package p303q1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaticLayoutFactory.kt */
/* renamed from: q1.n */
/* loaded from: classes.dex */
public final class C9590n {

    /* renamed from: a */
    private final CharSequence f25225a;

    /* renamed from: b */
    private final int f25226b;

    /* renamed from: c */
    private final int f25227c;

    /* renamed from: d */
    private final TextPaint f25228d;

    /* renamed from: e */
    private final int f25229e;

    /* renamed from: f */
    private final TextDirectionHeuristic f25230f;

    /* renamed from: g */
    private final Layout.Alignment f25231g;

    /* renamed from: h */
    private final int f25232h;

    /* renamed from: i */
    private final TextUtils.TruncateAt f25233i;

    /* renamed from: j */
    private final int f25234j;

    /* renamed from: k */
    private final float f25235k;

    /* renamed from: l */
    private final float f25236l;

    /* renamed from: m */
    private final int f25237m;

    /* renamed from: n */
    private final boolean f25238n;

    /* renamed from: o */
    private final boolean f25239o;

    /* renamed from: p */
    private final int f25240p;

    /* renamed from: q */
    private final int f25241q;

    /* renamed from: r */
    private final int[] f25242r;

    /* renamed from: s */
    private final int[] f25243s;

    public C9590n(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int[] iArr, int[] iArr2) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(textPaint, "paint");
        Intrinsics.isThisObjectNull(textDirectionHeuristic, "textDir");
        Intrinsics.isThisObjectNull(alignment, "alignment");
        this.f25225a = charSequence;
        this.f25226b = i;
        this.f25227c = i2;
        this.f25228d = textPaint;
        this.f25229e = i3;
        this.f25230f = textDirectionHeuristic;
        this.f25231g = alignment;
        this.f25232h = i4;
        this.f25233i = truncateAt;
        this.f25234j = i5;
        this.f25235k = f;
        this.f25236l = f2;
        this.f25237m = i6;
        this.f25238n = z;
        this.f25239o = z2;
        this.f25240p = i7;
        this.f25241q = i8;
        this.f25242r = iArr;
        this.f25243s = iArr2;
        if (!(i >= 0 && i <= i2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i2 >= 0 && i2 <= charSequence.length())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(i5 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(f >= 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: a */
    public final Layout.Alignment m10540a() {
        return this.f25231g;
    }

    /* renamed from: b */
    public final int m10539b() {
        return this.f25240p;
    }

    /* renamed from: c */
    public final TextUtils.TruncateAt m10538c() {
        return this.f25233i;
    }

    /* renamed from: d */
    public final int m10537d() {
        return this.f25234j;
    }

    /* renamed from: e */
    public final int m10536e() {
        return this.f25227c;
    }

    /* renamed from: f */
    public final int m10535f() {
        return this.f25241q;
    }

    /* renamed from: g */
    public final boolean m10534g() {
        return this.f25238n;
    }

    /* renamed from: h */
    public final int m10533h() {
        return this.f25237m;
    }

    /* renamed from: i */
    public final int[] m10532i() {
        return this.f25242r;
    }

    /* renamed from: j */
    public final float m10531j() {
        return this.f25236l;
    }

    /* renamed from: k */
    public final float m10530k() {
        return this.f25235k;
    }

    /* renamed from: l */
    public final int m10529l() {
        return this.f25232h;
    }

    /* renamed from: m */
    public final TextPaint m10528m() {
        return this.f25228d;
    }

    /* renamed from: n */
    public final int[] m10527n() {
        return this.f25243s;
    }

    /* renamed from: o */
    public final int m10526o() {
        return this.f25226b;
    }

    /* renamed from: p */
    public final CharSequence m10525p() {
        return this.f25225a;
    }

    /* renamed from: q */
    public final TextDirectionHeuristic m10524q() {
        return this.f25230f;
    }

    /* renamed from: r */
    public final boolean m10523r() {
        return this.f25239o;
    }

    /* renamed from: s */
    public final int m10522s() {
        return this.f25229e;
    }
}
