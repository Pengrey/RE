package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1270b;
import androidx.databinding.InterfaceC1277h;
import androidx.databinding.InterfaceC1279i;
import androidx.databinding.InterfaceC1281j;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.InterfaceC1442g0;
import androidx.lifecycle.InterfaceC1489u;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p262o2.C8000a;

/* loaded from: classes.dex */
public abstract class ViewDataBinding extends C1269a {

    /* renamed from: r */
    static int f3666r = 0;

    /* renamed from: s */
    private static final int f3667s = 8;

    /* renamed from: t */
    private static final boolean f3668t;

    /* renamed from: u */
    private static final InterfaceC1272c f3669u;

    /* renamed from: v */
    private static final ReferenceQueue<ViewDataBinding> f3670v;

    /* renamed from: w */
    private static final View.OnAttachStateChangeListener f3671w;

    /* renamed from: b */
    private final Runnable f3672b;

    /* renamed from: c */
    private boolean f3673c;

    /* renamed from: d */
    private boolean f3674d;

    /* renamed from: e */
    private C1287n[] f3675e;

    /* renamed from: f */
    private final View f3676f;

    /* renamed from: g */
    private C1270b<AbstractC1284l, ViewDataBinding, Void> f3677g;

    /* renamed from: h */
    private boolean f3678h;

    /* renamed from: i */
    private Choreographer f3679i;

    /* renamed from: j */
    private final Choreographer.FrameCallback f3680j;

    /* renamed from: k */
    private Handler f3681k;

    /* renamed from: l */
    protected final InterfaceC1274e f3682l;

    /* renamed from: m */
    private ViewDataBinding f3683m;

    /* renamed from: n */
    private InterfaceC1491v f3684n;

    /* renamed from: o */
    private OnStartListener f3685o;

    /* renamed from: p */
    private boolean f3686p;

    /* renamed from: q */
    protected boolean f3687q;

    /* loaded from: classes.dex */
    static class OnStartListener implements InterfaceC1489u {

        /* renamed from: w */
        final WeakReference<ViewDataBinding> f3688w;

        /* synthetic */ OnStartListener(ViewDataBinding viewDataBinding, C1255a c1255a) {
            this(viewDataBinding);
        }

        @InterfaceC1442g0(AbstractC1469p.EnumC1471b.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f3688w.get();
            if (viewDataBinding != null) {
                viewDataBinding.m37807n();
            }
        }

        private OnStartListener(ViewDataBinding viewDataBinding) {
            this.f3688w = new WeakReference<>(viewDataBinding);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$a */
    /* loaded from: classes.dex */
    class C1255a implements InterfaceC1272c {
        C1255a() {
        }

        @Override // androidx.databinding.InterfaceC1272c
        /* renamed from: a */
        public C1287n mo37769a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1268n(viewDataBinding, i, referenceQueue).m37783g();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$b */
    /* loaded from: classes.dex */
    class C1256b implements InterfaceC1272c {
        C1256b() {
        }

        @Override // androidx.databinding.InterfaceC1272c
        /* renamed from: a */
        public C1287n mo37769a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1266l(viewDataBinding, i, referenceQueue).m37789e();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$c */
    /* loaded from: classes.dex */
    class C1257c implements InterfaceC1272c {
        C1257c() {
        }

        @Override // androidx.databinding.InterfaceC1272c
        /* renamed from: a */
        public C1287n mo37769a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1267m(viewDataBinding, i, referenceQueue).m37786e();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$d */
    /* loaded from: classes.dex */
    class C1258d implements InterfaceC1272c {
        C1258d() {
        }

        @Override // androidx.databinding.InterfaceC1272c
        /* renamed from: a */
        public C1287n mo37769a(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new C1264j(viewDataBinding, i, referenceQueue).m37792g();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$e */
    /* loaded from: classes.dex */
    class C1259e extends C1270b.AbstractC1271a<AbstractC1284l, ViewDataBinding, Void> {
        C1259e() {
        }

        @Override // androidx.databinding.C1270b.AbstractC1271a
        /* renamed from: b */
        public void mo37796b(AbstractC1284l abstractC1284l, ViewDataBinding viewDataBinding, int i, Void r4) {
            if (i == 1) {
                if (abstractC1284l.m37748c(viewDataBinding)) {
                    return;
                }
                viewDataBinding.f3674d = true;
            } else if (i == 2) {
                abstractC1284l.m37749b(viewDataBinding);
            } else if (i != 3) {
            } else {
                abstractC1284l.m37750a(viewDataBinding);
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$f */
    /* loaded from: classes.dex */
    class View$OnAttachStateChangeListenerC1260f implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC1260f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            ViewDataBinding.m37804q(view).f3672b.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$g */
    /* loaded from: classes.dex */
    class RunnableC1261g implements Runnable {
        RunnableC1261g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                ViewDataBinding.this.f3673c = false;
            }
            ViewDataBinding.m37828C();
            if (Build.VERSION.SDK_INT >= 19 && !ViewDataBinding.this.f3676f.isAttachedToWindow()) {
                ViewDataBinding.this.f3676f.removeOnAttachStateChangeListener(ViewDataBinding.f3671w);
                ViewDataBinding.this.f3676f.addOnAttachStateChangeListener(ViewDataBinding.f3671w);
                return;
            }
            ViewDataBinding.this.m37807n();
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$h */
    /* loaded from: classes.dex */
    class Choreographer$FrameCallbackC1262h implements Choreographer.FrameCallback {
        Choreographer$FrameCallbackC1262h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            ViewDataBinding.this.f3672b.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.databinding.ViewDataBinding$i */
    /* loaded from: classes.dex */
    public static class C1263i {

        /* renamed from: a */
        public final String[][] f3691a;

        /* renamed from: b */
        public final int[][] f3692b;

        /* renamed from: c */
        public final int[][] f3693c;

        public C1263i(int i) {
            this.f3691a = new String[i];
            this.f3692b = new int[i];
            this.f3693c = new int[i];
        }

        /* renamed from: a */
        public void m37795a(int i, String[] strArr, int[] iArr, int[] iArr2) {
            this.f3691a[i] = strArr;
            this.f3692b[i] = iArr;
            this.f3693c[i] = iArr2;
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$j */
    /* loaded from: classes.dex */
    private static class C1264j implements InterfaceC1440f0, InterfaceC1283k<LiveData<?>> {

        /* renamed from: a */
        final C1287n<LiveData<?>> f3694a;

        /* renamed from: b */
        WeakReference<InterfaceC1491v> f3695b = null;

        public C1264j(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f3694a = new C1287n<>(viewDataBinding, i, this, referenceQueue);
        }

        /* renamed from: f */
        private InterfaceC1491v m37793f() {
            WeakReference<InterfaceC1491v> weakReference = this.f3695b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        @Override // androidx.lifecycle.InterfaceC1440f0
        /* renamed from: c */
        public void mo37325a(Object obj) {
            ViewDataBinding m37745a = this.f3694a.m37745a();
            if (m37745a != null) {
                C1287n<LiveData<?>> c1287n = this.f3694a;
                m37745a.m37801t(c1287n.f3711b, c1287n.m37744b(), 0);
            }
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: d */
        public void mo37751d(InterfaceC1491v interfaceC1491v) {
            InterfaceC1491v m37793f = m37793f();
            LiveData<?> m37744b = this.f3694a.m37744b();
            if (m37744b != null) {
                if (m37793f != null) {
                    m37744b.mo168n(this);
                }
                if (interfaceC1491v != null) {
                    m37744b.mo171i(interfaceC1491v, this);
                }
            }
            if (interfaceC1491v != null) {
                this.f3695b = new WeakReference<>(interfaceC1491v);
            }
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: e */
        public void mo37794e(LiveData<?> liveData) {
            InterfaceC1491v m37793f = m37793f();
            if (m37793f != null) {
                liveData.mo171i(m37793f, this);
            }
        }

        /* renamed from: g */
        public C1287n<LiveData<?>> m37792g() {
            return this.f3694a;
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: h */
        public void mo37791h(LiveData<?> liveData) {
            liveData.mo168n(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$k */
    /* loaded from: classes.dex */
    protected static abstract class AbstractC1265k extends InterfaceC1277h.AbstractC1278a implements InterfaceC1276g {

        /* renamed from: a */
        final int f3696a;

        public AbstractC1265k(int i) {
            this.f3696a = i;
        }

        @Override // androidx.databinding.InterfaceC1277h.AbstractC1278a
        /* renamed from: e */
        public void mo37758e(InterfaceC1277h interfaceC1277h, int i) {
            if (i == this.f3696a || i == 0) {
                mo3578c();
            }
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$l */
    /* loaded from: classes.dex */
    private static class C1266l extends InterfaceC1279i.AbstractC1280a implements InterfaceC1283k<InterfaceC1279i> {

        /* renamed from: a */
        final C1287n<InterfaceC1279i> f3697a;

        public C1266l(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f3697a = new C1287n<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: c */
        public void mo37794e(InterfaceC1279i interfaceC1279i) {
            interfaceC1279i.m37756r(this);
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: d */
        public void mo37751d(InterfaceC1491v interfaceC1491v) {
        }

        /* renamed from: e */
        public C1287n<InterfaceC1279i> m37789e() {
            return this.f3697a;
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: f */
        public void mo37791h(InterfaceC1279i interfaceC1279i) {
            interfaceC1279i.m37757m(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$m */
    /* loaded from: classes.dex */
    private static class C1267m extends InterfaceC1281j.AbstractC1282a implements InterfaceC1283k<InterfaceC1281j> {

        /* renamed from: a */
        final C1287n<InterfaceC1281j> f3698a;

        public C1267m(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f3698a = new C1287n<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: c */
        public void mo37794e(InterfaceC1281j interfaceC1281j) {
            interfaceC1281j.m37755a(this);
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: d */
        public void mo37751d(InterfaceC1491v interfaceC1491v) {
        }

        /* renamed from: e */
        public C1287n<InterfaceC1281j> m37786e() {
            return this.f3698a;
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: f */
        public void mo37791h(InterfaceC1281j interfaceC1281j) {
            interfaceC1281j.m37754c(this);
        }
    }

    /* renamed from: androidx.databinding.ViewDataBinding$n */
    /* loaded from: classes.dex */
    private static class C1268n extends InterfaceC1277h.AbstractC1278a implements InterfaceC1283k<InterfaceC1277h> {

        /* renamed from: a */
        final C1287n<InterfaceC1277h> f3699a;

        public C1268n(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f3699a = new C1287n<>(viewDataBinding, i, this, referenceQueue);
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: d */
        public void mo37751d(InterfaceC1491v interfaceC1491v) {
        }

        @Override // androidx.databinding.InterfaceC1277h.AbstractC1278a
        /* renamed from: e */
        public void mo37758e(InterfaceC1277h interfaceC1277h, int i) {
            ViewDataBinding m37745a = this.f3699a.m37745a();
            if (m37745a != null && this.f3699a.m37744b() == interfaceC1277h) {
                m37745a.m37801t(this.f3699a.f3711b, interfaceC1277h, i);
            }
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: f */
        public void mo37794e(InterfaceC1277h interfaceC1277h) {
            interfaceC1277h.mo37760a(this);
        }

        /* renamed from: g */
        public C1287n<InterfaceC1277h> m37783g() {
            return this.f3699a;
        }

        @Override // androidx.databinding.InterfaceC1283k
        /* renamed from: h */
        public void mo37791h(InterfaceC1277h interfaceC1277h) {
            interfaceC1277h.mo37759b(this);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f3666r = i;
        f3668t = i >= 16;
        new C1255a();
        new C1256b();
        new C1257c();
        f3669u = new C1258d();
        new C1259e();
        f3670v = new ReferenceQueue<>();
        if (i < 19) {
            f3671w = null;
        } else {
            f3671w = new View$OnAttachStateChangeListenerC1260f();
        }
    }

    protected ViewDataBinding(InterfaceC1274e interfaceC1274e, View view, int i) {
        this.f3672b = new RunnableC1261g();
        this.f3673c = false;
        this.f3674d = false;
        this.f3682l = interfaceC1274e;
        this.f3675e = new C1287n[i];
        this.f3676f = view;
        if (Looper.myLooper() != null) {
            if (f3668t) {
                this.f3679i = Choreographer.getInstance();
                this.f3680j = new Choreographer$FrameCallbackC1262h();
                return;
            }
            this.f3680j = null;
            this.f3681k = new Handler(Looper.myLooper());
            return;
        }
        throw new IllegalStateException("DataBinding must be created in view's UI Thread");
    }

    /* renamed from: B */
    private static int m37829B(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            i2 = (i2 * 10) + (str.charAt(i) - '0');
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static void m37828C() {
        while (true) {
            Reference<? extends ViewDataBinding> poll = f3670v.poll();
            if (poll == null) {
                return;
            }
            if (poll instanceof C1287n) {
                ((C1287n) poll).m37741e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public static float m37825F(Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: G */
    public static int m37824G(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: H */
    public static boolean m37823H(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: I */
    public static void m37822I(ViewDataBinding viewDataBinding, InterfaceC1276g interfaceC1276g, AbstractC1265k abstractC1265k) {
        if (interfaceC1276g != abstractC1265k) {
            if (interfaceC1276g != null) {
                viewDataBinding.mo37759b((AbstractC1265k) interfaceC1276g);
            }
            if (abstractC1265k != null) {
                viewDataBinding.mo37760a(abstractC1265k);
            }
        }
    }

    /* renamed from: j */
    private static InterfaceC1274e m37810j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC1274e) {
            return (InterfaceC1274e) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* renamed from: l */
    private void m37809l() {
        if (this.f3678h) {
            m37826E();
        } else if (mo3580u()) {
            this.f3678h = true;
            this.f3674d = false;
            C1270b<AbstractC1284l, ViewDataBinding, Void> c1270b = this.f3677g;
            if (c1270b != null) {
                c1270b.m37777d(this, 1, null);
                if (this.f3674d) {
                    this.f3677g.m37777d(this, 2, null);
                }
            }
            if (!this.f3674d) {
                mo3581k();
                C1270b<AbstractC1284l, ViewDataBinding, Void> c1270b2 = this.f3677g;
                if (c1270b2 != null) {
                    c1270b2.m37777d(this, 3, null);
                }
            }
            this.f3678h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static void m37808m(ViewDataBinding viewDataBinding) {
        viewDataBinding.m37809l();
    }

    /* renamed from: o */
    private static int m37806o(String str, int i, C1263i c1263i, int i2) {
        CharSequence subSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = c1263i.f3691a[i2];
        int length = strArr.length;
        while (i < length) {
            if (TextUtils.equals(subSequence, strArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: p */
    private static int m37805p(ViewGroup viewGroup, int i) {
        String str = (String) viewGroup.getChildAt(i).getTag();
        String substring = str.substring(0, str.length() - 1);
        int length = substring.length();
        int childCount = viewGroup.getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            String str2 = childAt.getTag() instanceof String ? (String) childAt.getTag() : null;
            if (str2 != null && str2.startsWith(substring)) {
                if (str2.length() == str.length() && str2.charAt(str2.length() - 1) == '0') {
                    return i;
                }
                if (m37799x(str2, length)) {
                    i = i2;
                }
            }
        }
        return i;
    }

    /* renamed from: q */
    static ViewDataBinding m37804q(View view) {
        if (view != null) {
            return (ViewDataBinding) view.getTag(C8000a.dataBinding);
        }
        return null;
    }

    /* renamed from: r */
    public static int m37803r() {
        return f3666r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static <T extends ViewDataBinding> T m37800v(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, Object obj) {
        return (T) C1275f.m37763f(layoutInflater, i, viewGroup, z, m37810j(obj));
    }

    /* renamed from: x */
    private static boolean m37799x(String str, int i) {
        int length = str.length();
        if (length == i) {
            return false;
        }
        while (i < length) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010e A[SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m37798y(androidx.databinding.InterfaceC1274e r17, android.view.View r18, java.lang.Object[] r19, androidx.databinding.ViewDataBinding.C1263i r20, android.util.SparseIntArray r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.ViewDataBinding.m37798y(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.ViewDataBinding$i, android.util.SparseIntArray, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public static Object[] m37797z(InterfaceC1274e interfaceC1274e, View view, int i, C1263i c1263i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        m37798y(interfaceC1274e, view, objArr, c1263i, sparseIntArray, true);
        return objArr;
    }

    /* renamed from: A */
    protected abstract boolean mo3595A(int i, Object obj, int i2);

    /* renamed from: D */
    protected void m37827D(int i, Object obj, InterfaceC1272c interfaceC1272c) {
        if (obj == null) {
            return;
        }
        C1287n c1287n = this.f3675e[i];
        if (c1287n == null) {
            c1287n = interfaceC1272c.mo37769a(this, i, f3670v);
            this.f3675e[i] = c1287n;
            InterfaceC1491v interfaceC1491v = this.f3684n;
            if (interfaceC1491v != null) {
                c1287n.m37743c(interfaceC1491v);
            }
        }
        c1287n.m37742d(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public void m37826E() {
        ViewDataBinding viewDataBinding = this.f3683m;
        if (viewDataBinding != null) {
            viewDataBinding.m37826E();
            return;
        }
        InterfaceC1491v interfaceC1491v = this.f3684n;
        if (interfaceC1491v == null || interfaceC1491v.mo137b().mo10401b().isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
            synchronized (this) {
                if (this.f3673c) {
                    return;
                }
                this.f3673c = true;
                if (f3668t) {
                    this.f3679i.postFrameCallback(this.f3680j);
                } else {
                    this.f3681k.post(this.f3672b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: J */
    public void m37821J(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.f3683m = this;
        }
    }

    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        C1287n[] c1287nArr;
        if (interfaceC1491v instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        InterfaceC1491v interfaceC1491v2 = this.f3684n;
        if (interfaceC1491v2 == interfaceC1491v) {
            return;
        }
        if (interfaceC1491v2 != null) {
            interfaceC1491v2.mo137b().mo10400c(this.f3685o);
        }
        this.f3684n = interfaceC1491v;
        if (interfaceC1491v != null) {
            if (this.f3685o == null) {
                this.f3685o = new OnStartListener(this, null);
            }
            interfaceC1491v.mo137b().mo10402a(this.f3685o);
        }
        for (C1287n c1287n : this.f3675e) {
            if (c1287n != null) {
                c1287n.m37743c(interfaceC1491v);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m37820L(View view) {
        view.setTag(C8000a.dataBinding, this);
    }

    /* renamed from: M */
    public abstract boolean mo3593M(int i, Object obj);

    /* renamed from: N */
    protected boolean m37819N(int i) {
        C1287n c1287n = this.f3675e[i];
        if (c1287n != null) {
            return c1287n.m37741e();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: O */
    public boolean m37818O(int i, LiveData<?> liveData) {
        this.f3686p = true;
        try {
            return m37817P(i, liveData, f3669u);
        } finally {
            this.f3686p = false;
        }
    }

    /* renamed from: P */
    protected boolean m37817P(int i, Object obj, InterfaceC1272c interfaceC1272c) {
        if (obj == null) {
            return m37819N(i);
        }
        C1287n c1287n = this.f3675e[i];
        if (c1287n == null) {
            m37827D(i, obj, interfaceC1272c);
            return true;
        } else if (c1287n.m37744b() == obj) {
            return false;
        } else {
            m37819N(i);
            m37827D(i, obj, interfaceC1272c);
            return true;
        }
    }

    /* renamed from: k */
    protected abstract void mo3581k();

    /* renamed from: n */
    public void m37807n() {
        ViewDataBinding viewDataBinding = this.f3683m;
        if (viewDataBinding == null) {
            m37809l();
        } else {
            viewDataBinding.m37807n();
        }
    }

    /* renamed from: s */
    public View m37802s() {
        return this.f3676f;
    }

    /* renamed from: t */
    protected void m37801t(int i, Object obj, int i2) {
        if (this.f3686p || this.f3687q || !mo3595A(i, obj, i2)) {
            return;
        }
        m37826E();
    }

    /* renamed from: u */
    public abstract boolean mo3580u();

    /* renamed from: w */
    public abstract void mo3579w();

    /* JADX INFO: Access modifiers changed from: protected */
    public ViewDataBinding(Object obj, View view, int i) {
        this(m37810j(obj), view, i);
    }
}
