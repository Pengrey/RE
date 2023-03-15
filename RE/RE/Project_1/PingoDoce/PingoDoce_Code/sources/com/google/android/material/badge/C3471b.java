package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.b */
/* loaded from: classes.dex */
public class C3471b {

    /* renamed from: a */
    public static final boolean f9441a;

    static {
        f9441a = Build.VERSION.SDK_INT < 18;
    }

    /* renamed from: a */
    public static void m30507a(C3469a c3469a, View view, FrameLayout frameLayout) {
        m30503e(c3469a, view, frameLayout);
        if (c3469a.m30526h() != null) {
            c3469a.m30526h().setForeground(c3469a);
        } else if (!f9441a) {
            view.getOverlay().add(c3469a);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray<C3469a> m30506b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<C3469a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, C3469a.m30530d(context, state));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m30505c(SparseArray<C3469a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            C3469a valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.m30522l());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m30504d(C3469a c3469a, View view) {
        if (c3469a == null) {
            return;
        }
        if (!f9441a && c3469a.m30526h() == null) {
            view.getOverlay().remove(c3469a);
        } else {
            c3469a.m30526h().setForeground(null);
        }
    }

    /* renamed from: e */
    public static void m30503e(C3469a c3469a, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c3469a.setBounds(rect);
        c3469a.m30535D(view, frameLayout);
    }

    /* renamed from: f */
    public static void m30502f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
