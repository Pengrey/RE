package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class C1235g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListViewCompat.java */
    /* renamed from: androidx.core.widget.g$a */
    /* loaded from: classes.dex */
    public static class C1236a {
        /* renamed from: a */
        static boolean m37898a(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        /* renamed from: b */
        static void m37897b(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    /* renamed from: a */
    public static boolean m37900a(ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C1236a.m37898a(listView, i);
        }
        int childCount = listView.getChildCount();
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            return firstVisiblePosition + childCount < listView.getCount() || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight() - listView.getListPaddingBottom();
        }
        return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < listView.getListPaddingTop();
    }

    /* renamed from: b */
    public static void m37899b(ListView listView, int i) {
        View childAt;
        if (Build.VERSION.SDK_INT >= 19) {
            C1236a.m37897b(listView, i);
            return;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition == -1 || (childAt = listView.getChildAt(0)) == null) {
            return;
        }
        listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
    }
}
