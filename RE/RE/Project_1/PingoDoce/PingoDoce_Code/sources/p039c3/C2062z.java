package p039c3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1112b0;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: c3.z */
/* loaded from: classes.dex */
public class C2062z implements InterfaceC1994b0 {

    /* renamed from: a */
    protected C2063a f5973a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewOverlayApi14.java */
    /* renamed from: c3.z$a */
    /* loaded from: classes.dex */
    public static class C2063a extends ViewGroup {

        /* renamed from: A */
        private boolean f5974A;

        /* renamed from: w */
        ViewGroup f5975w;

        /* renamed from: x */
        View f5976x;

        /* renamed from: y */
        ArrayList<Drawable> f5977y;

        /* renamed from: z */
        C2062z f5978z;

        static {
            try {
                Class cls = Integer.TYPE;
                ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C2063a(Context context, ViewGroup viewGroup, View view, C2062z c2062z) {
            super(context);
            this.f5977y = null;
            this.f5975w = viewGroup;
            this.f5976x = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f5978z = c2062z;
        }

        /* renamed from: c */
        private void m34798c() {
            if (this.f5974A) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        private void m34797d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f5977y;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f5974A = true;
                    this.f5975w.removeView(this);
                }
            }
        }

        /* renamed from: e */
        private void m34796e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f5975w.getLocationOnScreen(iArr2);
            this.f5976x.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: a */
        public void m34800a(Drawable drawable) {
            m34798c();
            if (this.f5977y == null) {
                this.f5977y = new ArrayList<>();
            }
            if (this.f5977y.contains(drawable)) {
                return;
            }
            this.f5977y.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: b */
        public void m34799b(View view) {
            m34798c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f5975w && viewGroup.getParent() != null && C1112b0.m38447V(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f5975w.getLocationOnScreen(iArr2);
                    C1112b0.m38437c0(view, iArr[0] - iArr2[0]);
                    C1112b0.m38435d0(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f5975w.getLocationOnScreen(iArr);
            this.f5976x.getLocationOnScreen(iArr2);
            canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
            canvas.clipRect(new Rect(0, 0, this.f5976x.getWidth(), this.f5976x.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f5977y;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5977y.get(i).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: f */
        public void m34795f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f5977y;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m34797d();
            }
        }

        /* renamed from: g */
        public void m34794g(View view) {
            super.removeView(view);
            m34797d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f5975w != null) {
                rect.offset(iArr[0], iArr[1]);
                if (this.f5975w instanceof ViewGroup) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    int[] iArr2 = new int[2];
                    m34796e(iArr2);
                    rect.offset(iArr2[0], iArr2[1]);
                    return super.invalidateChildInParent(iArr, rect);
                }
                invalidate(rect);
                return null;
            }
            return null;
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        @Override // android.view.View
        protected boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f5977y) != null && arrayList.contains(drawable));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2062z(Context context, ViewGroup viewGroup, View view) {
        this.f5973a = new C2063a(context, viewGroup, view, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C2062z m34802e(View view) {
        ViewGroup m34801f = m34801f(view);
        if (m34801f != null) {
            int childCount = m34801f.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = m34801f.getChildAt(i);
                if (childAt instanceof C2063a) {
                    return ((C2063a) childAt).f5978z;
                }
            }
            return new C2056u(m34801f.getContext(), m34801f, view);
        }
        return null;
    }

    /* renamed from: f */
    static ViewGroup m34801f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: b */
    public void mo34804b(Drawable drawable) {
        this.f5973a.m34800a(drawable);
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: d */
    public void mo34803d(Drawable drawable) {
        this.f5973a.m34795f(drawable);
    }
}
