package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.savedstate.d */
/* loaded from: classes.dex */
public final class C1664d {
    /* renamed from: a */
    public static InterfaceC1663c m35783a(View view) {
        InterfaceC1663c interfaceC1663c = (InterfaceC1663c) view.getTag(C1661a.view_tree_saved_state_registry_owner);
        if (interfaceC1663c != null) {
            return interfaceC1663c;
        }
        ViewParent parent = view.getParent();
        while (interfaceC1663c == null && (parent instanceof View)) {
            View view2 = (View) parent;
            interfaceC1663c = (InterfaceC1663c) view2.getTag(C1661a.view_tree_saved_state_registry_owner);
            parent = view2.getParent();
        }
        return interfaceC1663c;
    }

    /* renamed from: b */
    public static void m35782b(View view, InterfaceC1663c interfaceC1663c) {
        view.setTag(C1661a.view_tree_saved_state_registry_owner, interfaceC1663c);
    }
}
