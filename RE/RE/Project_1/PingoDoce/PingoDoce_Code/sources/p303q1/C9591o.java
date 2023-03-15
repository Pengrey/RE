package p303q1;

import android.text.Layout;
import p181jd.Intrinsics;

/* renamed from: q1.o */
/* loaded from: classes.dex */
public final class C9591o {

    /* renamed from: a */
    public static final C9591o f25244a = new C9591o();

    /* renamed from: b */
    private static final Layout.Alignment f25245b;

    /* renamed from: c */
    private static final Layout.Alignment f25246c;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int length = values.length;
        int i = 0;
        Layout.Alignment alignment2 = alignment;
        while (i < length) {
            Layout.Alignment alignment3 = values[i];
            i++;
            if (Intrinsics.equals(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.equals(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f25245b = alignment;
        f25246c = alignment2;
    }

    private C9591o() {
    }

    /* renamed from: a */
    public final Layout.Alignment m10521a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return Layout.Alignment.ALIGN_NORMAL;
                        }
                        return f25246c;
                    }
                    return f25245b;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }
}
