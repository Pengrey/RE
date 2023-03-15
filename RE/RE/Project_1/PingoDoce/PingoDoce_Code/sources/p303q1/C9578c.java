package p303q1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import p181jd.Intrinsics;

/* renamed from: q1.c */
/* loaded from: classes.dex */
public final class C9578c {

    /* renamed from: a */
    public static final C9578c f25203a = new C9578c();

    /* renamed from: b */
    private static final Layout.Alignment f25204b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c */
    private static final TextDirectionHeuristic f25205c;

    static {
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkIfNull(textDirectionHeuristic, "FIRSTSTRONG_LTR");
        f25205c = textDirectionHeuristic;
    }

    private C9578c() {
    }

    /* renamed from: a */
    public final Layout.Alignment m10566a() {
        return f25204b;
    }

    /* renamed from: b */
    public final TextDirectionHeuristic m10565b() {
        return f25205c;
    }
}
