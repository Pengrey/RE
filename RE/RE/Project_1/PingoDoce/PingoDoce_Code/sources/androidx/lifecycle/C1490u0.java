package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import p375u2.C10818a;

/* renamed from: androidx.lifecycle.u0 */
/* loaded from: classes.dex */
public class C1490u0 {
    /* renamed from: a */
    public static InterfaceC1491v m36969a(View view) {
        InterfaceC1491v interfaceC1491v = (InterfaceC1491v) view.getTag(C10818a.view_tree_lifecycle_owner);
        if (interfaceC1491v != null) {
            return interfaceC1491v;
        }
        ViewParent parent = view.getParent();
        while (interfaceC1491v == null && (parent instanceof View)) {
            View view2 = (View) parent;
            interfaceC1491v = (InterfaceC1491v) view2.getTag(C10818a.view_tree_lifecycle_owner);
            parent = view2.getParent();
        }
        return interfaceC1491v;
    }

    /* renamed from: b */
    public static void m36968b(View view, InterfaceC1491v interfaceC1491v) {
        view.setTag(C10818a.view_tree_lifecycle_owner, interfaceC1491v);
    }
}
