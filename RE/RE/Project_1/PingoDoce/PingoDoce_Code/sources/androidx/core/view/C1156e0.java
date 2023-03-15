package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import p128h2.C5816c;

/* renamed from: androidx.core.view.e0 */
/* loaded from: classes.dex */
public final class C1156e0 {

    /* compiled from: ViewGroupCompat.java */
    /* renamed from: androidx.core.view.e0$a */
    /* loaded from: classes.dex */
    static class C1157a {
        /* renamed from: a */
        static int m38201a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        static boolean m38200b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        static void m38199c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m38202a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C1157a.m38200b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(C5816c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1112b0.m38458N(viewGroup) == null) ? false : true;
    }
}
