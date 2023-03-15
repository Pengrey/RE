package p303q1;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import p181jd.Intrinsics;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public final class BoringLayoutFactory {

    /* renamed from: a */
    public static final BoringLayoutFactory f25198a = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    /* renamed from: a */
    public final BoringLayout m10568a(CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(textPaint, "paint");
        Intrinsics.isThisObjectNull(metrics, "metrics");
        Intrinsics.isThisObjectNull(alignment, "alignment");
        if (i >= 0) {
            if (i2 >= 0) {
                if (truncateAt == null) {
                    return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z);
                }
                return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: b */
    public final BoringLayout.Metrics m10567b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        Intrinsics.isThisObjectNull(charSequence, "text");
        Intrinsics.isThisObjectNull(textDirectionHeuristic, "textDir");
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }
}
