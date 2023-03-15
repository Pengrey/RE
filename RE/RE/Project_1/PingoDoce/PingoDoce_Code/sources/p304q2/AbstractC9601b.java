package p304q2;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.C1112b0;
import java.util.ArrayList;
import p304q2.AbstractC9601b;
import p304q2.C9593a;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public abstract class AbstractC9601b<T extends AbstractC9601b<T>> implements C9593a.InterfaceC9595b {

    /* renamed from: m */
    public static final AbstractC9619r f25267m;

    /* renamed from: n */
    public static final AbstractC9619r f25268n;

    /* renamed from: o */
    public static final AbstractC9619r f25269o;

    /* renamed from: p */
    public static final AbstractC9619r f25270p;

    /* renamed from: q */
    public static final AbstractC9619r f25271q;

    /* renamed from: r */
    public static final AbstractC9619r f25272r;

    /* renamed from: d */
    final Object f25276d;

    /* renamed from: e */
    final AbstractC9620c f25277e;

    /* renamed from: j */
    private float f25282j;

    /* renamed from: a */
    float f25273a = 0.0f;

    /* renamed from: b */
    float f25274b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f25275c = false;

    /* renamed from: f */
    boolean f25278f = false;

    /* renamed from: g */
    float f25279g = Float.MAX_VALUE;

    /* renamed from: h */
    float f25280h = -Float.MAX_VALUE;

    /* renamed from: i */
    private long f25281i = 0;

    /* renamed from: k */
    private final ArrayList<InterfaceC9617p> f25283k = new ArrayList<>();

    /* renamed from: l */
    private final ArrayList<InterfaceC9618q> f25284l = new ArrayList<>();

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$a */
    /* loaded from: classes.dex */
    static class C9602a extends AbstractC9619r {
        C9602a(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getY();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$b */
    /* loaded from: classes.dex */
    static class C9603b extends AbstractC9619r {
        C9603b(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return C1112b0.m38452Q(view);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            C1112b0.m38459M0(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$c */
    /* loaded from: classes.dex */
    static class C9604c extends AbstractC9619r {
        C9604c(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getAlpha();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$d */
    /* loaded from: classes.dex */
    static class C9605d extends AbstractC9619r {
        C9605d(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getScrollX();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$e */
    /* loaded from: classes.dex */
    static class C9606e extends AbstractC9619r {
        C9606e(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getScrollY();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$f */
    /* loaded from: classes.dex */
    static class C9607f extends AbstractC9619r {
        C9607f(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getTranslationX();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$g */
    /* loaded from: classes.dex */
    static class C9608g extends AbstractC9619r {
        C9608g(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getTranslationY();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$h */
    /* loaded from: classes.dex */
    static class C9609h extends AbstractC9619r {
        C9609h(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return C1112b0.m38456O(view);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            C1112b0.m38463K0(view, f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$i */
    /* loaded from: classes.dex */
    static class C9610i extends AbstractC9619r {
        C9610i(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getScaleX();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$j */
    /* loaded from: classes.dex */
    static class C9611j extends AbstractC9619r {
        C9611j(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getScaleY();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$k */
    /* loaded from: classes.dex */
    static class C9612k extends AbstractC9619r {
        C9612k(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getRotation();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$l */
    /* loaded from: classes.dex */
    static class C9613l extends AbstractC9619r {
        C9613l(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getRotationX();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$m */
    /* loaded from: classes.dex */
    static class C9614m extends AbstractC9619r {
        C9614m(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getRotationY();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$n */
    /* loaded from: classes.dex */
    static class C9615n extends AbstractC9619r {
        C9615n(String str) {
            super(str, null);
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: c */
        public float mo10451a(View view) {
            return view.getX();
        }

        @Override // p304q2.AbstractC9620c
        /* renamed from: d */
        public void mo10450b(View view, float f) {
            view.setX(f);
        }
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$o */
    /* loaded from: classes.dex */
    static class C9616o {

        /* renamed from: a */
        float f25285a;

        /* renamed from: b */
        float f25286b;
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$p */
    /* loaded from: classes.dex */
    public interface InterfaceC9617p {
        /* renamed from: a */
        void m10453a(AbstractC9601b abstractC9601b, boolean z, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$q */
    /* loaded from: classes.dex */
    public interface InterfaceC9618q {
        /* renamed from: a */
        void m10452a(AbstractC9601b abstractC9601b, float f, float f2);
    }

    /* compiled from: DynamicAnimation.java */
    /* renamed from: q2.b$r */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9619r extends AbstractC9620c<View> {
        /* synthetic */ AbstractC9619r(String str, C9607f c9607f) {
            this(str);
        }

        private AbstractC9619r(String str) {
            super(str);
        }
    }

    static {
        new C9607f("translationX");
        new C9608g("translationY");
        new C9609h("translationZ");
        f25267m = new C9610i("scaleX");
        f25268n = new C9611j("scaleY");
        f25269o = new C9612k("rotation");
        f25270p = new C9613l("rotationX");
        f25271q = new C9614m("rotationY");
        new C9615n("x");
        new C9602a("y");
        new C9603b("z");
        f25272r = new C9604c("alpha");
        new C9605d("scrollX");
        new C9606e("scrollY");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> AbstractC9601b(K k, AbstractC9620c<K> abstractC9620c) {
        this.f25276d = k;
        this.f25277e = abstractC9620c;
        if (abstractC9620c != f25269o && abstractC9620c != f25270p && abstractC9620c != f25271q) {
            if (abstractC9620c == f25272r) {
                this.f25282j = 0.00390625f;
                return;
            } else if (abstractC9620c != f25267m && abstractC9620c != f25268n) {
                this.f25282j = 1.0f;
                return;
            } else {
                this.f25282j = 0.00390625f;
                return;
            }
        }
        this.f25282j = 0.1f;
    }

    /* renamed from: b */
    private void m10489b(boolean z) {
        this.f25278f = false;
        C9593a.m10496d().m10493g(this);
        this.f25281i = 0L;
        this.f25275c = false;
        for (int i = 0; i < this.f25283k.size(); i++) {
            if (this.f25283k.get(i) != null) {
                this.f25283k.get(i).m10453a(this, z, this.f25274b, this.f25273a);
            }
        }
        m10485f(this.f25283k);
    }

    /* renamed from: c */
    private float m10488c() {
        return this.f25277e.mo10451a(this.f25276d);
    }

    /* renamed from: f */
    private static <T> void m10485f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: j */
    private void m10482j() {
        if (this.f25278f) {
            return;
        }
        this.f25278f = true;
        if (!this.f25275c) {
            this.f25274b = m10488c();
        }
        float f = this.f25274b;
        if (f <= this.f25279g && f >= this.f25280h) {
            C9593a.m10496d().m10499a(this, 0L);
            return;
        }
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    }

    @Override // p304q2.C9593a.InterfaceC9595b
    /* renamed from: a */
    public boolean mo10490a(long j) {
        long j2 = this.f25281i;
        if (j2 == 0) {
            this.f25281i = j;
            m10484g(this.f25274b);
            return false;
        }
        this.f25281i = j;
        boolean mo10448k = mo10448k(j - j2);
        float min = Math.min(this.f25274b, this.f25279g);
        this.f25274b = min;
        float max = Math.max(min, this.f25280h);
        this.f25274b = max;
        m10484g(max);
        if (mo10448k) {
            m10489b(false);
        }
        return mo10448k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m10487d() {
        return this.f25282j * 0.75f;
    }

    /* renamed from: e */
    public boolean m10486e() {
        return this.f25278f;
    }

    /* renamed from: g */
    void m10484g(float f) {
        this.f25277e.mo10450b(this.f25276d, f);
        for (int i = 0; i < this.f25284l.size(); i++) {
            if (this.f25284l.get(i) != null) {
                this.f25284l.get(i).m10452a(this, this.f25274b, this.f25273a);
            }
        }
        m10485f(this.f25284l);
    }

    /* renamed from: h */
    public T m10483h(float f) {
        this.f25274b = f;
        this.f25275c = true;
        return this;
    }

    /* renamed from: i */
    public void mo10449i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f25278f) {
                return;
            }
            m10482j();
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    /* renamed from: k */
    abstract boolean mo10448k(long j);
}
