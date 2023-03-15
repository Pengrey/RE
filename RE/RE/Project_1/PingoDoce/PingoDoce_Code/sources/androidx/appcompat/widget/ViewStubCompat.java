package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p070e.C4906j;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: A */
    private InterfaceC0451a f1503A;

    /* renamed from: w */
    private int f1504w;

    /* renamed from: x */
    private int f1505x;

    /* renamed from: y */
    private WeakReference<View> f1506y;

    /* renamed from: z */
    private LayoutInflater f1507z;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0451a {
        /* renamed from: a */
        void m40690a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m40691a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1504w != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1507z;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1504w, viewGroup, false);
                int i = this.f1505x;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1506y = new WeakReference<>(inflate);
                InterfaceC0451a interfaceC0451a = this.f1503A;
                if (interfaceC0451a != null) {
                    interfaceC0451a.m40690a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1505x;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1507z;
    }

    public int getLayoutResource() {
        return this.f1504w;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1505x = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1507z = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1504w = i;
    }

    public void setOnInflateListener(InterfaceC0451a interfaceC0451a) {
        this.f1503A = interfaceC0451a;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1506y;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m40691a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1504w = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4906j.f13403E3, i, 0);
        this.f1505x = obtainStyledAttributes.getResourceId(C4906j.f13418H3, -1);
        this.f1504w = obtainStyledAttributes.getResourceId(C4906j.f13413G3, 0);
        setId(obtainStyledAttributes.getResourceId(C4906j.f13408F3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
