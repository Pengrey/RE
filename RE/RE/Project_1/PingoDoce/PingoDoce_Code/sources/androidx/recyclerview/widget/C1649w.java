package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.w */
/* loaded from: classes.dex */
public class C1649w {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m35851a(RecyclerView.C1564z c1564z, AbstractC1642t abstractC1642t, View view, View view2, RecyclerView.AbstractC1546o abstractC1546o, boolean z) {
        if (abstractC1546o.m36483K() == 0 || c1564z.m36329b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(abstractC1546o.m36442i0(view) - abstractC1546o.m36442i0(view2)) + 1;
        }
        return Math.min(abstractC1642t.mo35871n(), abstractC1642t.mo35881d(view2) - abstractC1642t.mo35878g(view));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m35850b(RecyclerView.C1564z c1564z, AbstractC1642t abstractC1642t, View view, View view2, RecyclerView.AbstractC1546o abstractC1546o, boolean z, boolean z2) {
        int max;
        if (abstractC1546o.m36483K() == 0 || c1564z.m36329b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC1546o.m36442i0(view), abstractC1546o.m36442i0(view2));
        int max2 = Math.max(abstractC1546o.m36442i0(view), abstractC1546o.m36442i0(view2));
        if (z2) {
            max = Math.max(0, (c1564z.m36329b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (z) {
            return Math.round((max * (Math.abs(abstractC1642t.mo35881d(view2) - abstractC1642t.mo35878g(view)) / (Math.abs(abstractC1546o.m36442i0(view) - abstractC1546o.m36442i0(view2)) + 1))) + (abstractC1642t.mo35872m() - abstractC1642t.mo35878g(view)));
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static int m35849c(RecyclerView.C1564z c1564z, AbstractC1642t abstractC1642t, View view, View view2, RecyclerView.AbstractC1546o abstractC1546o, boolean z) {
        if (abstractC1546o.m36483K() == 0 || c1564z.m36329b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1564z.m36329b();
        }
        return (int) (((abstractC1642t.mo35881d(view2) - abstractC1642t.mo35878g(view)) / (Math.abs(abstractC1546o.m36442i0(view) - abstractC1546o.m36442i0(view2)) + 1)) * c1564z.m36329b());
    }
}
