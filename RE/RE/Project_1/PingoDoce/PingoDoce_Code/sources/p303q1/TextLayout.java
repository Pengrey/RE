package p303q1;

import android.graphics.Canvas;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p181jd.Intrinsics;
import p347s1.BaselineShiftSpan;

/* renamed from: q1.p */
/* loaded from: classes.dex */
public final class TextLayout {

    /* renamed from: a */
    private final LayoutIntrinsics f25247a;

    /* renamed from: b */
    private final boolean f25248b;

    /* renamed from: c */
    private final Layout f25249c;

    /* renamed from: d */
    private final int f25250d;

    public TextLayout(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        Layout m10549b;
        Intrinsics.isThisObjectNull(charSequence, "charSequence");
        Intrinsics.isThisObjectNull(textPaint, "textPaint");
        Intrinsics.isThisObjectNull(layoutIntrinsics, "layoutIntrinsics");
        this.f25247a = layoutIntrinsics;
        int length = charSequence.length();
        TextDirectionHeuristic m10500a = C9592q.m10500a(i2);
        Layout.Alignment m10521a = C9591o.f25244a.m10521a(i);
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        BoringLayout.Metrics m10564a = layoutIntrinsics.m10564a();
        double d = f;
        int ceil = (int) Math.ceil(d);
        if (m10564a != null && layoutIntrinsics.m10563b() <= f && !z2) {
            m10549b = BoringLayoutFactory.f25198a.m10568a(charSequence, textPaint, ceil, m10564a, m10521a, z, truncateAt, ceil);
        } else {
            m10549b = C9586k.m10549b(C9586k.f25220a, charSequence, 0, charSequence.length(), textPaint, ceil, m10500a, m10521a, i3, truncateAt, (int) Math.ceil(d), f2, f3, i6, z, false, i4, i5, iArr, iArr2, 16384, null);
        }
        this.f25249c = m10549b;
        int min = Math.min(m10549b.getLineCount(), i3);
        this.f25250d = min;
        this.f25248b = min >= i3 && (m10549b.getEllipsisCount(min + (-1)) > 0 || m10549b.getLineEnd(min + (-1)) != charSequence.length());
    }

    /* renamed from: a */
    public final boolean m10520a() {
        return this.f25248b;
    }

    /* renamed from: b */
    public final int m10519b() {
        if (this.f25248b) {
            return this.f25249c.getLineBottom(this.f25250d - 1);
        }
        return this.f25249c.getHeight();
    }

    /* renamed from: c */
    public final float m10518c(int i) {
        return this.f25249c.getLineBaseline(i);
    }

    /* renamed from: d */
    public final float m10517d(int i) {
        return this.f25249c.getLineBottom(i);
    }

    /* renamed from: e */
    public final int m10516e() {
        return this.f25250d;
    }

    /* renamed from: f */
    public final int m10515f(int i) {
        return this.f25249c.getEllipsisCount(i);
    }

    /* renamed from: g */
    public final int m10514g(int i) {
        return this.f25249c.getEllipsisStart(i);
    }

    /* renamed from: h */
    public final int m10513h(int i) {
        if (this.f25249c.getEllipsisStart(i) == 0) {
            return this.f25249c.getLineEnd(i);
        }
        return this.f25249c.getText().length();
    }

    /* renamed from: i */
    public final int m10512i(int i) {
        return this.f25249c.getLineForOffset(i);
    }

    /* renamed from: j */
    public final int m10511j(int i) {
        return this.f25249c.getLineForVertical(i);
    }

    /* renamed from: k */
    public final int m10510k(int i) {
        return this.f25249c.getLineStart(i);
    }

    /* renamed from: l */
    public final float m10509l(int i) {
        return this.f25249c.getLineTop(i);
    }

    /* renamed from: m */
    public final int m10508m(int i) {
        if (this.f25249c.getEllipsisStart(i) == 0) {
            return this.f25249c.getLineVisibleEnd(i);
        }
        return this.f25249c.getEllipsisStart(i) + this.f25249c.getLineStart(i);
    }

    /* renamed from: n */
    public final int m10507n(int i, float f) {
        return this.f25249c.getOffsetForHorizontal(i, f);
    }

    /* renamed from: o */
    public final int m10506o(int i) {
        return this.f25249c.getParagraphDirection(i);
    }

    /* renamed from: p */
    public final float m10505p(int i) {
        return this.f25249c.getPrimaryHorizontal(i);
    }

    /* renamed from: q */
    public final float m10504q(int i) {
        return this.f25249c.getSecondaryHorizontal(i);
    }

    /* renamed from: r */
    public final CharSequence m10503r() {
        CharSequence text = this.f25249c.getText();
        Intrinsics.checkIfNull(text, "layout.text");
        return text;
    }

    /* renamed from: s */
    public final boolean m10502s(int i) {
        return this.f25249c.isRtlCharAt(i);
    }

    /* renamed from: t */
    public final void m10501t(Canvas canvas) {
        Intrinsics.isThisObjectNull(canvas, "canvas");
        this.f25249c.draw(canvas);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r21, float r22, android.text.TextPaint r23, int r24, android.text.TextUtils.TruncateAt r25, int r26, float r27, float r28, boolean r29, int r30, int r31, int r32, int r33, int[] r34, int[] r35, p303q1.LayoutIntrinsics r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r5 = r2
            goto Lb
        L9:
            r5 = r22
        Lb:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L12
            r7 = r3
            goto L14
        L12:
            r7 = r24
        L14:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L1b
            r8 = r4
            goto L1d
        L1b:
            r8 = r25
        L1d:
            r1 = r0 & 32
            if (r1 == 0) goto L24
            r1 = 2
            r9 = r1
            goto L26
        L24:
            r9 = r26
        L26:
            r1 = r0 & 64
            if (r1 == 0) goto L2e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L30
        L2e:
            r10 = r27
        L30:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L36
            r11 = r2
            goto L38
        L36:
            r11 = r28
        L38:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3f
            r1 = 1
            r12 = r1
            goto L41
        L3f:
            r12 = r29
        L41:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4a
            r1 = 2147483647(0x7fffffff, float:NaN)
            r13 = r1
            goto L4c
        L4a:
            r13 = r30
        L4c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L52
            r14 = r3
            goto L54
        L52:
            r14 = r31
        L54:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5a
            r15 = r3
            goto L5c
        L5a:
            r15 = r32
        L5c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L63
            r16 = r3
            goto L65
        L63:
            r16 = r33
        L65:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L6c
            r17 = r4
            goto L6e
        L6c:
            r17 = r34
        L6e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L75
            r18 = r4
            goto L77
        L75:
            r18 = r35
        L77:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L89
            q1.d r0 = new q1.d
            r1 = r21
            r2 = r23
            r0.<init>(r1, r2, r9)
            r19 = r0
            goto L8f
        L89:
            r1 = r21
            r2 = r23
            r19 = r36
        L8f:
            r3 = r20
            r4 = r21
            r6 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p303q1.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, int, int, int, int, int[], int[], q1.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
