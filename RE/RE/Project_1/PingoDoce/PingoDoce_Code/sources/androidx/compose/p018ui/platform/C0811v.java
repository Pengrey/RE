package androidx.compose.p018ui.platform;

import android.view.PointerIcon;
import android.view.View;
import org.joda.time.DateTimeConstants;
import p093f1.C5270a;
import p093f1.C5272b;
import p093f1.InterfaceC5310p;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
/* renamed from: androidx.compose.ui.platform.v */
/* loaded from: classes.dex */
public final class C0811v {

    /* renamed from: a */
    public static final C0811v f2427a = new C0811v();

    private C0811v() {
    }

    /* renamed from: a */
    public final void m39498a(View view, InterfaceC5310p interfaceC5310p) {
        PointerIcon systemIcon;
        Intrinsics.isThisObjectNull(view, "view");
        if (interfaceC5310p instanceof C5270a) {
            systemIcon = ((C5270a) interfaceC5310p).m24842a();
        } else if (interfaceC5310p instanceof C5272b) {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), ((C5272b) interfaceC5310p).m24833a());
        } else {
            systemIcon = PointerIcon.getSystemIcon(view.getContext(), DateTimeConstants.MILLIS_PER_SECOND);
        }
        if (Intrinsics.equals(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
