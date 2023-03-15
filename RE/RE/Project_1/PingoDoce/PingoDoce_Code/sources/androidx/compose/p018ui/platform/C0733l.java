package androidx.compose.p018ui.platform;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import p181jd.Intrinsics;

/* compiled from: AndroidClipboardManager.android.kt */
/* renamed from: androidx.compose.ui.platform.l */
/* loaded from: classes.dex */
public final class C0733l implements InterfaceC0726j0 {

    /* renamed from: a */
    private final ClipboardManager f2277a;

    public C0733l(ClipboardManager clipboardManager) {
        Intrinsics.isThisObjectNull(clipboardManager, "clipboardManager");
        this.f2277a = clipboardManager;
    }

    /* renamed from: a */
    public final boolean m39714a() {
        ClipDescription primaryClipDescription = this.f2277a.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        return primaryClipDescription.hasMimeType("text/plain");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0733l(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p181jd.Intrinsics.isThisObjectNull(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            java.util.Objects.requireNonNull(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p018ui.platform.C0733l.<init>(android.content.Context):void");
    }
}
