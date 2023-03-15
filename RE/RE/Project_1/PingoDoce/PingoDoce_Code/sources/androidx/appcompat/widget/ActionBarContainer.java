package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C1112b0;
import com.google.crypto.tink.shaded.protobuf.Reader;
import p070e.C4902f;
import p070e.C4906j;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: A */
    Drawable f1166A;

    /* renamed from: B */
    Drawable f1167B;

    /* renamed from: C */
    Drawable f1168C;

    /* renamed from: D */
    boolean f1169D;

    /* renamed from: E */
    boolean f1170E;

    /* renamed from: F */
    private int f1171F;

    /* renamed from: w */
    private boolean f1172w;

    /* renamed from: x */
    private View f1173x;

    /* renamed from: y */
    private View f1174y;

    /* renamed from: z */
    private View f1175z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1112b0.m38399v0(this, new C0455b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13491a);
        this.f1166A = obtainStyledAttributes.getDrawable(C4906j.f13496b);
        this.f1167B = obtainStyledAttributes.getDrawable(C4906j.f13506d);
        this.f1171F = obtainStyledAttributes.getDimensionPixelSize(C4906j.f13536j, -1);
        boolean z = true;
        if (getId() == C4902f.split_action_bar) {
            this.f1169D = true;
            this.f1168C = obtainStyledAttributes.getDrawable(C4906j.f13501c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1169D ? this.f1166A != null || this.f1167B != null : this.f1168C != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m40930a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m40929b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1166A;
        if (drawable != null && drawable.isStateful()) {
            this.f1166A.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1167B;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1167B.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1168C;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1168C.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1173x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1166A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1167B;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1168C;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1174y = findViewById(C4902f.action_bar);
        this.f1175z = findViewById(C4902f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1172w || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f1173x;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1169D) {
            Drawable drawable2 = this.f1168C;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z2 = z3;
        } else {
            if (this.f1166A != null) {
                if (this.f1174y.getVisibility() == 0) {
                    this.f1166A.setBounds(this.f1174y.getLeft(), this.f1174y.getTop(), this.f1174y.getRight(), this.f1174y.getBottom());
                } else {
                    View view2 = this.f1175z;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1166A.setBounds(this.f1175z.getLeft(), this.f1175z.getTop(), this.f1175z.getRight(), this.f1175z.getBottom());
                    } else {
                        this.f1166A.setBounds(0, 0, 0, 0);
                    }
                }
                z3 = true;
            }
            this.f1170E = z4;
            if (z4 && (drawable = this.f1167B) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int m40930a;
        int i3;
        if (this.f1174y == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1171F) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f1174y == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f1173x;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!m40929b(this.f1174y)) {
            m40930a = m40930a(this.f1174y);
        } else {
            m40930a = !m40929b(this.f1175z) ? m40930a(this.f1175z) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m40930a + m40930a(this.f1173x), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Reader.READ_DONE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1166A;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1166A);
        }
        this.f1166A = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1174y;
            if (view != null) {
                this.f1166A.setBounds(view.getLeft(), this.f1174y.getTop(), this.f1174y.getRight(), this.f1174y.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1169D ? this.f1166A != null || this.f1167B != null : this.f1168C != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1168C;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1168C);
        }
        this.f1168C = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1169D && (drawable2 = this.f1168C) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1169D ? !(this.f1166A != null || this.f1167B != null) : this.f1168C == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1167B;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1167B);
        }
        this.f1167B = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1170E && (drawable2 = this.f1167B) != null) {
                drawable2.setBounds(this.f1173x.getLeft(), this.f1173x.getTop(), this.f1173x.getRight(), this.f1173x.getBottom());
            }
        }
        boolean z = true;
        if (!this.f1169D ? this.f1166A != null || this.f1167B != null : this.f1168C != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0499l0 c0499l0) {
        View view = this.f1173x;
        if (view != null) {
            removeView(view);
        }
        this.f1173x = c0499l0;
        if (c0499l0 != null) {
            addView(c0499l0);
            ViewGroup.LayoutParams layoutParams = c0499l0.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0499l0.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f1172w = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1166A;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f1167B;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f1168C;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1166A && !this.f1169D) || (drawable == this.f1167B && this.f1170E) || ((drawable == this.f1168C && this.f1169D) || super.verifyDrawable(drawable));
    }
}
