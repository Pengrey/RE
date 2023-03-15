package androidx.compose.p018ui.platform;

import android.view.View;
import java.util.Map;
import p181jd.Intrinsics;

/* compiled from: Wrapper.android.kt */
/* renamed from: androidx.compose.ui.platform.a2 */
/* loaded from: classes.dex */
public final class C0685a2 {

    /* renamed from: a */
    public static final C0685a2 f2167a = new C0685a2();

    private C0685a2() {
    }

    /* renamed from: a */
    public final Map m39829a(View view) {
        Intrinsics.isThisObjectNull(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        Intrinsics.checkIfNull(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
