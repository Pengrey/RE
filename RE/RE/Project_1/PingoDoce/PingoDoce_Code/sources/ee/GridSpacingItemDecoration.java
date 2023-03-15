package ee;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.UtilsExtensions;
import p181jd.Intrinsics;

/* renamed from: ee.b */
/* loaded from: classes2.dex */
public final class GridSpacingItemDecoration extends RecyclerView.AbstractC1545n {

    /* renamed from: a */
    private final int f13966a;

    /* renamed from: b */
    private final int f13967b;

    /* renamed from: c */
    private final boolean f13968c;

    /* renamed from: d */
    private final int f13969d;

    public GridSpacingItemDecoration(int i, int i2, boolean z, int i3) {
        this.f13966a = i;
        this.f13967b = i2;
        this.f13968c = z;
        this.f13969d = i3;
    }

    /* renamed from: g */
    public void mo35984g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        Intrinsics.isThisObjectNull(rect, "outRect");
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(recyclerView, "parent");
        Intrinsics.isThisObjectNull(c1564z, "state");
        int m36662f0 = recyclerView.m36662f0(view) - this.f13969d;
        int m35167e = UtilsExtensions.m35167e(this.f13967b);
        if (m36662f0 >= 0) {
            int i = this.f13966a;
            int i2 = m36662f0 % i;
            if (this.f13968c) {
                rect.left = m35167e - ((i2 * m35167e) / i);
                rect.right = ((i2 + 1) * m35167e) / i;
                if (m36662f0 < i) {
                    rect.top = m35167e;
                }
                rect.bottom = m35167e;
                return;
            }
            rect.left = (i2 * m35167e) / i;
            rect.right = m35167e - (((i2 + 1) * m35167e) / i);
            if (m36662f0 >= i) {
                rect.top = m35167e;
                return;
            }
            return;
        }
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
    }
}
