package p303q1;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import p181jd.Intrinsics;
import p347s1.LetterSpacingSpanEm;
import p347s1.LetterSpacingSpanPx;
import p468yc.C13182l;

/* compiled from: LayoutIntrinsics.kt */
/* renamed from: q1.f */
/* loaded from: classes.dex */
public final class C9583f {
    /* renamed from: a */
    public static /* synthetic */ int m10558a(C13182l c13182l, C13182l c13182l2) {
        return m10555d(c13182l, c13182l2);
    }

    /* renamed from: b */
    public static final /* synthetic */ boolean m10557b(float f, CharSequence charSequence, TextPaint textPaint) {
        return m10554e(f, charSequence, textPaint);
    }

    /* renamed from: c */
    public static final float m10556c(CharSequence charSequence, TextPaint textPaint) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(textPaint, "paint");
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue<C13182l> priorityQueue = new PriorityQueue(10, C9582e.f25217w);
        int next = lineInstance.next();
        while (true) {
            int i2 = i;
            i = next;
            if (i == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C13182l(Integer.valueOf(i2), Integer.valueOf(i)));
            } else {
                C13182l c13182l = (C13182l) priorityQueue.peek();
                if (c13182l != null && ((Number) c13182l.m1459d()).intValue() - ((Number) c13182l.m1460c()).intValue() < i - i2) {
                    priorityQueue.poll();
                    priorityQueue.add(new C13182l(Integer.valueOf(i2), Integer.valueOf(i)));
                }
            }
            next = lineInstance.next();
        }
        float f = 0.0f;
        for (C13182l c13182l2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) c13182l2.m1462a()).intValue(), ((Number) c13182l2.m1461b()).intValue(), textPaint));
        }
        return f;
    }

    /* renamed from: d */
    private static final int m10555d(C13182l c13182l, C13182l c13182l2) {
        return (((Number) c13182l.m1459d()).intValue() - ((Number) c13182l.m1460c()).intValue()) - (((Number) c13182l2.m1459d()).intValue() - ((Number) c13182l2.m1460c()).intValue());
    }

    /* renamed from: e */
    private static final boolean m10554e(float f, CharSequence charSequence, TextPaint textPaint) {
        if (!(f == 0.0f) && (charSequence instanceof Spanned)) {
            if (!(textPaint.getLetterSpacing() == 0.0f)) {
                return true;
            }
            Spanned spanned = (Spanned) charSequence;
            if (SpannedExtensions.m10553a(spanned, LetterSpacingSpanPx.class) || SpannedExtensions.m10553a(spanned, LetterSpacingSpanEm.class)) {
                return true;
            }
        }
        return false;
    }
}
