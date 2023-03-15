package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1112b0;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p100f8.C5418a;
import p120g8.C5623h;
import p120g8.C5625j;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f10871i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m28773g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f10871i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0876f) && (((CoordinatorLayout.C0876f) childAt.getLayoutParams()).m39298f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f10871i;
                        if (map != null && map.containsKey(childAt)) {
                            C1112b0.m38479C0(childAt, this.f10871i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f10871i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C1112b0.m38479C0(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.f10871i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo28775H(View view, View view2, boolean z, boolean z2) {
        m28773g0(view2, z);
        return super.mo28775H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C3817e mo28774e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C5418a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C5418a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C3817e c3817e = new FabTransformationBehavior.C3817e();
        c3817e.f10865a = C5623h.m23549d(context, i);
        c3817e.f10866b = new C5625j(17, 0.0f, 0.0f);
        return c3817e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
