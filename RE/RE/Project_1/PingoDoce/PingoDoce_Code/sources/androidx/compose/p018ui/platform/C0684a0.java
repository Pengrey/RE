package androidx.compose.p018ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidFontResourceLoader.android.kt */
/* renamed from: androidx.compose.ui.platform.a0 */
/* loaded from: classes.dex */
public final class C0684a0 {

    /* renamed from: a */
    public static final C0684a0 f2158a = new C0684a0();

    private C0684a0() {
    }

    /* renamed from: a */
    public final Typeface m39833a(Context context, int i) {
        Intrinsics.isThisObjectNull(context, "context");
        Typeface font = context.getResources().getFont(i);
        Intrinsics.checkIfNull(font, "context.resources.getFont(resourceId)");
        return font;
    }
}
