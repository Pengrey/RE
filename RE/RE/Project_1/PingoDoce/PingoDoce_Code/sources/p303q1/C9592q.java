package p303q1;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import p181jd.Intrinsics;

/* renamed from: q1.q */
/* loaded from: classes.dex */
public final class C9592q {
    /* renamed from: a */
    public static final TextDirectionHeuristic m10500a(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            Intrinsics.checkIfNull(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            Intrinsics.checkIfNull(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkIfNull(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            Intrinsics.checkIfNull(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            Intrinsics.checkIfNull(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            Intrinsics.checkIfNull(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            Intrinsics.checkIfNull(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }
}
