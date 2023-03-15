package p434x1;

import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;
import p181jd.Intrinsics;
import p286p1.AbstractC8338a0;
import p286p1.TtsAnnotation;

/* compiled from: TtsAnnotationExtensions.android.kt */
/* renamed from: x1.g */
/* loaded from: classes.dex */
public final class C12255g {
    /* renamed from: a */
    public static final TtsSpan m3185a(AbstractC8338a0 abstractC8338a0) {
        Intrinsics.isThisObjectNull(abstractC8338a0, "<this>");
        if (abstractC8338a0 instanceof TtsAnnotation) {
            return m3184b((TtsAnnotation) abstractC8338a0);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final TtsSpan m3184b(TtsAnnotation ttsAnnotation) {
        Intrinsics.isThisObjectNull(ttsAnnotation, "<this>");
        TtsSpan build = new TtsSpan.VerbatimBuilder(ttsAnnotation.m15752a()).build();
        Intrinsics.checkIfNull(build, "builder.build()");
        return build;
    }
}
