package p039c3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1112b0;
import java.util.Map;

/* renamed from: c3.c */
/* loaded from: classes.dex */
public class C1995c extends AbstractC2037m {

    /* renamed from: i0 */
    private static final String[] f5814i0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: j0 */
    private static final Property<Drawable, PointF> f5815j0 = new C1997b(PointF.class, "boundsOrigin");

    /* renamed from: k0 */
    private static final Property<C2006k, PointF> f5816k0 = new C1998c(PointF.class, "topLeft");

    /* renamed from: l0 */
    private static final Property<C2006k, PointF> f5817l0 = new C1999d(PointF.class, "bottomRight");

    /* renamed from: m0 */
    private static final Property<View, PointF> f5818m0 = new C2000e(PointF.class, "bottomRight");

    /* renamed from: n0 */
    private static final Property<View, PointF> f5819n0 = new C2001f(PointF.class, "topLeft");

    /* renamed from: o0 */
    private static final Property<View, PointF> f5820o0 = new C2002g(PointF.class, "position");

    /* renamed from: p0 */
    private static C2033k f5821p0 = new C2033k();

    /* renamed from: f0 */
    private int[] f5822f0 = new int[2];

    /* renamed from: g0 */
    private boolean f5823g0 = false;

    /* renamed from: h0 */
    private boolean f5824h0 = false;

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$a */
    /* loaded from: classes.dex */
    class C1996a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5825a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5826b;

        /* renamed from: c */
        final /* synthetic */ View f5827c;

        /* renamed from: d */
        final /* synthetic */ float f5828d;

        C1996a(C1995c c1995c, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5825a = viewGroup;
            this.f5826b = bitmapDrawable;
            this.f5827c = view;
            this.f5828d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C2007c0.m34948b(this.f5825a).mo34803d(this.f5826b);
            C2007c0.m34943g(this.f5827c, this.f5828d);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$b */
    /* loaded from: classes.dex */
    static class C1997b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5829a;

        C1997b(Class cls, String str) {
            super(cls, str);
            this.f5829a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5829a);
            Rect rect = this.f5829a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5829a);
            this.f5829a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5829a);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$c */
    /* loaded from: classes.dex */
    static class C1998c extends Property<C2006k, PointF> {
        C1998c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C2006k c2006k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C2006k c2006k, PointF pointF) {
            c2006k.m34950c(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$d */
    /* loaded from: classes.dex */
    static class C1999d extends Property<C2006k, PointF> {
        C1999d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C2006k c2006k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C2006k c2006k, PointF pointF) {
            c2006k.m34952a(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$e */
    /* loaded from: classes.dex */
    static class C2000e extends Property<View, PointF> {
        C2000e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2007c0.m34944f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$f */
    /* loaded from: classes.dex */
    static class C2001f extends Property<View, PointF> {
        C2001f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C2007c0.m34944f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$g */
    /* loaded from: classes.dex */
    static class C2002g extends Property<View, PointF> {
        C2002g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C2007c0.m34944f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$h */
    /* loaded from: classes.dex */
    class C2003h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C2006k f5830a;
        private C2006k mViewBounds;

        C2003h(C1995c c1995c, C2006k c2006k) {
            this.f5830a = c2006k;
            this.mViewBounds = c2006k;
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$i */
    /* loaded from: classes.dex */
    class C2004i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5831a;

        /* renamed from: b */
        final /* synthetic */ View f5832b;

        /* renamed from: c */
        final /* synthetic */ Rect f5833c;

        /* renamed from: d */
        final /* synthetic */ int f5834d;

        /* renamed from: e */
        final /* synthetic */ int f5835e;

        /* renamed from: f */
        final /* synthetic */ int f5836f;

        /* renamed from: g */
        final /* synthetic */ int f5837g;

        C2004i(C1995c c1995c, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5832b = view;
            this.f5833c = rect;
            this.f5834d = i;
            this.f5835e = i2;
            this.f5836f = i3;
            this.f5837g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5831a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5831a) {
                return;
            }
            C1112b0.m38393y0(this.f5832b, this.f5833c);
            C2007c0.m34944f(this.f5832b, this.f5834d, this.f5835e, this.f5836f, this.f5837g);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$j */
    /* loaded from: classes.dex */
    class C2005j extends C2045n {

        /* renamed from: a */
        boolean f5838a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5839b;

        C2005j(C1995c c1995c, ViewGroup viewGroup) {
            this.f5839b = viewGroup;
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: a */
        public void mo34856a(AbstractC2037m abstractC2037m) {
            C2059x.m34807c(this.f5839b, false);
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: b */
        public void mo34855b(AbstractC2037m abstractC2037m) {
            C2059x.m34807c(this.f5839b, false);
            this.f5838a = true;
        }

        @Override // p039c3.C2045n, p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: d */
        public void mo34854d(AbstractC2037m abstractC2037m) {
            C2059x.m34807c(this.f5839b, true);
        }

        @Override // p039c3.AbstractC2037m.InterfaceC2043f
        /* renamed from: e */
        public void mo34816e(AbstractC2037m abstractC2037m) {
            if (!this.f5838a) {
                C2059x.m34807c(this.f5839b, false);
            }
            abstractC2037m.mo34846T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ChangeBounds.java */
    /* renamed from: c3.c$k */
    /* loaded from: classes.dex */
    public static class C2006k {

        /* renamed from: a */
        private int f5840a;

        /* renamed from: b */
        private int f5841b;

        /* renamed from: c */
        private int f5842c;

        /* renamed from: d */
        private int f5843d;

        /* renamed from: e */
        private View f5844e;

        /* renamed from: f */
        private int f5845f;

        /* renamed from: g */
        private int f5846g;

        C2006k(View view) {
            this.f5844e = view;
        }

        /* renamed from: b */
        private void m34951b() {
            C2007c0.m34944f(this.f5844e, this.f5840a, this.f5841b, this.f5842c, this.f5843d);
            this.f5845f = 0;
            this.f5846g = 0;
        }

        /* renamed from: a */
        void m34952a(PointF pointF) {
            this.f5842c = Math.round(pointF.x);
            this.f5843d = Math.round(pointF.y);
            int i = this.f5846g + 1;
            this.f5846g = i;
            if (this.f5845f == i) {
                m34951b();
            }
        }

        /* renamed from: c */
        void m34950c(PointF pointF) {
            this.f5840a = Math.round(pointF.x);
            this.f5841b = Math.round(pointF.y);
            int i = this.f5845f + 1;
            this.f5845f = i;
            if (i == this.f5846g) {
                m34951b();
            }
        }
    }

    /* renamed from: g0 */
    private void m34966g0(C2054s c2054s) {
        View view = c2054s.f5960b;
        if (!C1112b0.m38446W(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c2054s.f5959a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c2054s.f5959a.put("android:changeBounds:parent", c2054s.f5960b.getParent());
        if (this.f5824h0) {
            c2054s.f5960b.getLocationInWindow(this.f5822f0);
            c2054s.f5959a.put("android:changeBounds:windowX", Integer.valueOf(this.f5822f0[0]));
            c2054s.f5959a.put("android:changeBounds:windowY", Integer.valueOf(this.f5822f0[1]));
        }
        if (this.f5823g0) {
            c2054s.f5959a.put("android:changeBounds:clip", C1112b0.m38398w(view));
        }
    }

    /* renamed from: h0 */
    private boolean m34965h0(View view, View view2) {
        if (this.f5824h0) {
            C2054s m34861u = m34861u(view, true);
            if (m34861u == null) {
                if (view == view2) {
                    return true;
                }
            } else if (view2 == m34861u.f5960b) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: H */
    public String[] mo34884H() {
        return f5814i0;
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: f */
    public void mo29511f(C2054s c2054s) {
        m34966g0(c2054s);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: j */
    public void mo29509j(C2054s c2054s) {
        m34966g0(c2054s);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: n */
    public Animator mo29508n(ViewGroup viewGroup, C2054s c2054s, C2054s c2054s2) {
        int i;
        View view;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m34813c;
        if (c2054s == null || c2054s2 == null) {
            return null;
        }
        Map<String, Object> map = c2054s.f5959a;
        Map<String, Object> map2 = c2054s2.f5959a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = c2054s2.f5960b;
        if (m34965h0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) c2054s.f5959a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) c2054s2.f5959a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) c2054s.f5959a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) c2054s2.f5959a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (i7 != i8 || i9 != i10) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                if (!this.f5823g0) {
                    view = view2;
                    C2007c0.m34944f(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            m34813c = C2020f.m34916a(view, f5820o0, m34859x().mo34857a(i3, i5, i4, i6));
                        } else {
                            C2006k c2006k = new C2006k(view);
                            ObjectAnimator m34916a = C2020f.m34916a(c2006k, f5816k0, m34859x().mo34857a(i3, i5, i4, i6));
                            ObjectAnimator m34916a2 = C2020f.m34916a(c2006k, f5817l0, m34859x().mo34857a(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(m34916a, m34916a2);
                            animatorSet.addListener(new C2003h(this, c2006k));
                            m34813c = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        m34813c = C2020f.m34916a(view, f5818m0, m34859x().mo34857a(i7, i9, i8, i10));
                    } else {
                        m34813c = C2020f.m34916a(view, f5819n0, m34859x().mo34857a(i3, i5, i4, i6));
                    }
                } else {
                    view = view2;
                    C2007c0.m34944f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    ObjectAnimator m34916a3 = (i3 == i4 && i5 == i6) ? null : C2020f.m34916a(view, f5820o0, m34859x().mo34857a(i3, i5, i4, i6));
                    if (rect4 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect4;
                    }
                    Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                    if (rect.equals(rect6)) {
                        objectAnimator = null;
                    } else {
                        C1112b0.m38393y0(view, rect);
                        C2033k c2033k = f5821p0;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect6;
                        ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c2033k, objArr);
                        ofObject.addListener(new C2004i(this, view, rect5, i4, i6, i8, i10));
                        objectAnimator = ofObject;
                    }
                    m34813c = C2053r.m34813c(m34916a3, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C2059x.m34807c(viewGroup4, true);
                    mo34840a(new C2005j(this, viewGroup4));
                }
                return m34813c;
            }
            return null;
        }
        int intValue = ((Integer) c2054s.f5959a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) c2054s.f5959a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) c2054s2.f5959a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) c2054s2.f5959a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5822f0);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float m34947c = C2007c0.m34947c(view2);
        C2007c0.m34943g(view2, 0.0f);
        C2007c0.m34948b(viewGroup).mo34804b(bitmapDrawable);
        AbstractC2022g m34859x = m34859x();
        int[] iArr = this.f5822f0;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C2026i.m34913a(f5815j0, m34859x.mo34857a(intValue - iArr[0], intValue2 - iArr[1], intValue3 - iArr[0], intValue4 - iArr[1])));
        ofPropertyValuesHolder.addListener(new C1996a(this, viewGroup, bitmapDrawable, view2, m34947c));
        return ofPropertyValuesHolder;
    }
}
