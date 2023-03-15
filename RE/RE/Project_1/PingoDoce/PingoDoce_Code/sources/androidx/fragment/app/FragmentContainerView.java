package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import p326r2.C9794c;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: w */
    private ArrayList<View> f3891w;

    /* renamed from: x */
    private ArrayList<View> f3892x;

    /* renamed from: y */
    private View.OnApplyWindowInsetsListener f3893y;

    /* renamed from: z */
    private boolean f3894z;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m37536a(View view) {
        ArrayList<View> arrayList = this.f3892x;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3891w == null) {
            this.f3891w = new ArrayList<>();
        }
        this.f3891w.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m37532B0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m37532B0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1183m0 m38433e0;
        C1183m0 m38093u = C1183m0.m38093u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3893y;
        if (onApplyWindowInsetsListener != null) {
            m38433e0 = C1183m0.m38093u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            m38433e0 = C1112b0.m38433e0(this, m38093u);
        }
        if (!m38433e0.m38100n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1112b0.m38426i(getChildAt(i), m38433e0);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f3894z && this.f3891w != null) {
            for (int i = 0; i < this.f3891w.size(); i++) {
                super.drawChild(canvas, this.f3891w.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f3894z || (arrayList = this.f3891w) == null || arrayList.size() <= 0 || !this.f3891w.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3892x;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3891w;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3894z = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m37536a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            m37536a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m37536a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m37536a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m37536a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m37536a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m37536a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3894z = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3893y = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3892x == null) {
                this.f3892x = new ArrayList<>();
            }
            this.f3892x.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.f3894z = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9794c.f25735e);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C9794c.f25736f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        String str;
        this.f3894z = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9794c.f25735e);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C9794c.f25736f) : classAttribute;
        String string = obtainStyledAttributes.getString(C9794c.f25737g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m37458i0 = fragmentManager.m37458i0(id2);
        if (classAttribute != null && m37458i0 == null) {
            if (id2 <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.VERSION_NAME;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo37281a = fragmentManager.m37428s0().mo37281a(context.getClassLoader(), classAttribute);
            mo37281a.m37631P0(context, attributeSet, null);
            fragmentManager.m37447m().m37173q(true).m37187c(this, mo37281a, string).mo37181i();
        }
        fragmentManager.m37492V0(this);
    }
}
