package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
public final class C1756a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f5392b;

    /* renamed from: a */
    private LinearLayoutManager f5393a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a */
    /* loaded from: classes.dex */
    public class C1757a implements Comparator<int[]> {
        C1757a(C1756a c1756a) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f5392b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1756a(LinearLayoutManager linearLayoutManager) {
        this.f5393a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m35449a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i;
        int bottom;
        int i2;
        int m36483K = this.f5393a.m36483K();
        if (m36483K == 0) {
            return true;
        }
        boolean z = this.f5393a.m36754s2() == 0;
        int[][] iArr = (int[][]) Array.newInstance(int.class, m36483K, 2);
        for (int i3 = 0; i3 < m36483K; i3++) {
            View m36484J = this.f5393a.m36484J(i3);
            if (m36484J != null) {
                ViewGroup.LayoutParams layoutParams = m36484J.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = f5392b;
                }
                int[] iArr2 = iArr[i3];
                if (z) {
                    top = m36484J.getLeft();
                    i = marginLayoutParams.leftMargin;
                } else {
                    top = m36484J.getTop();
                    i = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i;
                int[] iArr3 = iArr[i3];
                if (z) {
                    bottom = m36484J.getRight();
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    bottom = m36484J.getBottom();
                    i2 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new C1757a(this));
        for (int i4 = 1; i4 < m36483K; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[m36483K - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    /* renamed from: b */
    private boolean m35448b() {
        int m36483K = this.f5393a.m36483K();
        for (int i = 0; i < m36483K; i++) {
            if (m35447c(this.f5393a.m36484J(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m35447c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m35447c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m35446d() {
        return (!m35449a() || this.f5393a.m36483K() <= 1) && m35448b();
    }
}
