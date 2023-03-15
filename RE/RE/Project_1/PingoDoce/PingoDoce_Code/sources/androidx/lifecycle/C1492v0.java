package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import p395v2.C11088a;

/* renamed from: androidx.lifecycle.v0 */
/* loaded from: classes.dex */
public class C1492v0 {
    /* renamed from: a */
    public static InterfaceC1488t0 m36967a(View view) {
        InterfaceC1488t0 interfaceC1488t0 = (InterfaceC1488t0) view.getTag(C11088a.view_tree_view_model_store_owner);
        if (interfaceC1488t0 != null) {
            return interfaceC1488t0;
        }
        ViewParent parent = view.getParent();
        while (interfaceC1488t0 == null && (parent instanceof View)) {
            View view2 = (View) parent;
            interfaceC1488t0 = (InterfaceC1488t0) view2.getTag(C11088a.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return interfaceC1488t0;
    }

    /* renamed from: b */
    public static void m36966b(View view, InterfaceC1488t0 interfaceC1488t0) {
        view.setTag(C11088a.view_tree_view_model_store_owner, interfaceC1488t0);
    }
}
