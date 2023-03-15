package androidx.compose.p018ui.platform;

import android.graphics.Rect;
import p181jd.Intrinsics;
import p245n1.SemanticsNode;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* renamed from: androidx.compose.ui.platform.h1 */
/* loaded from: classes.dex */
public final class C0723h1 {

    /* renamed from: a */
    private final SemanticsNode f2269a;

    /* renamed from: b */
    private final Rect f2270b;

    public C0723h1(SemanticsNode semanticsNode, Rect rect) {
        Intrinsics.isThisObjectNull(semanticsNode, "semanticsNode");
        Intrinsics.isThisObjectNull(rect, "adjustedBounds");
        this.f2269a = semanticsNode;
        this.f2270b = rect;
    }

    /* renamed from: a */
    public final Rect m39728a() {
        return this.f2270b;
    }

    /* renamed from: b */
    public final SemanticsNode m39727b() {
        return this.f2269a;
    }
}
