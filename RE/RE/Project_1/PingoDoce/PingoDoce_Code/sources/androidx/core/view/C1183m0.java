package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.C0970b;
import androidx.core.util.C1070c;
import androidx.core.util.C1076h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: androidx.core.view.m0 */
/* loaded from: classes.dex */
public class C1183m0 {

    /* renamed from: b */
    public static final C1183m0 f3536b;

    /* renamed from: a */
    private final C1195l f3537a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.m0$a */
    /* loaded from: classes.dex */
    public static class C1184a {

        /* renamed from: a */
        private static Field f3538a;

        /* renamed from: b */
        private static Field f3539b;

        /* renamed from: c */
        private static Field f3540c;

        /* renamed from: d */
        private static boolean f3541d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3538a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3539b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3540c = declaredField3;
                declaredField3.setAccessible(true);
                f3541d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C1183m0 m38091a(View view) {
            if (f3541d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3538a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3539b.get(obj);
                        Rect rect2 = (Rect) f3540c.get(obj);
                        if (rect != null && rect2 != null) {
                            C1183m0 m38090a = new C1185b().m38089b(C0970b.m38936c(rect)).m38088c(C0970b.m38936c(rect2)).m38090a();
                            m38090a.m38096r(m38090a);
                            m38090a.m38110d(view.getRootView());
                            return m38090a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$e */
    /* loaded from: classes.dex */
    private static class C1188e extends C1187d {
        C1188e() {
        }

        C1188e(C1183m0 c1183m0) {
            super(c1183m0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$f */
    /* loaded from: classes.dex */
    public static class C1189f {

        /* renamed from: a */
        private final C1183m0 f3550a;

        /* renamed from: b */
        C0970b[] f3551b;

        C1189f() {
            this(new C1183m0((C1183m0) null));
        }

        /* renamed from: a */
        protected final void m38086a() {
            C0970b[] c0970bArr = this.f3551b;
            if (c0970bArr != null) {
                C0970b c0970b = c0970bArr[C1196m.m38055a(1)];
                C0970b c0970b2 = this.f3551b[C1196m.m38055a(2)];
                if (c0970b2 == null) {
                    c0970b2 = this.f3550a.m38108f(2);
                }
                if (c0970b == null) {
                    c0970b = this.f3550a.m38108f(1);
                }
                mo38081f(C0970b.m38938a(c0970b, c0970b2));
                C0970b c0970b3 = this.f3551b[C1196m.m38055a(16)];
                if (c0970b3 != null) {
                    mo38082e(c0970b3);
                }
                C0970b c0970b4 = this.f3551b[C1196m.m38055a(32)];
                if (c0970b4 != null) {
                    mo38084c(c0970b4);
                }
                C0970b c0970b5 = this.f3551b[C1196m.m38055a(64)];
                if (c0970b5 != null) {
                    mo38080g(c0970b5);
                }
            }
        }

        /* renamed from: b */
        C1183m0 mo38085b() {
            m38086a();
            return this.f3550a;
        }

        /* renamed from: c */
        void mo38084c(C0970b c0970b) {
        }

        /* renamed from: d */
        void mo38083d(C0970b c0970b) {
        }

        /* renamed from: e */
        void mo38082e(C0970b c0970b) {
        }

        /* renamed from: f */
        void mo38081f(C0970b c0970b) {
        }

        /* renamed from: g */
        void mo38080g(C0970b c0970b) {
        }

        C1189f(C1183m0 c1183m0) {
            this.f3550a = c1183m0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$i */
    /* loaded from: classes.dex */
    private static class C1192i extends C1191h {
        C1192i(C1183m0 c1183m0, WindowInsets windowInsets) {
            super(c1183m0, windowInsets);
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: a */
        C1183m0 mo38074a() {
            return C1183m0.m38093u(this.f3557c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C1183m0.C1190g, androidx.core.view.C1183m0.C1195l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1192i) {
                C1192i c1192i = (C1192i) obj;
                return Objects.equals(this.f3557c, c1192i.f3557c) && Objects.equals(this.f3561g, c1192i.f3561g);
            }
            return false;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: f */
        C1146d mo38069f() {
            return C1146d.m38226e(this.f3557c.getDisplayCutout());
        }

        @Override // androidx.core.view.C1183m0.C1195l
        public int hashCode() {
            return this.f3557c.hashCode();
        }

        C1192i(C1183m0 c1183m0, C1192i c1192i) {
            super(c1183m0, c1192i);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$k */
    /* loaded from: classes.dex */
    private static class C1194k extends C1193j {

        /* renamed from: q */
        static final C1183m0 f3566q = C1183m0.m38093u(WindowInsets.CONSUMED);

        C1194k(C1183m0 c1183m0, WindowInsets windowInsets) {
            super(c1183m0, windowInsets);
        }

        @Override // androidx.core.view.C1183m0.C1190g, androidx.core.view.C1183m0.C1195l
        /* renamed from: d */
        final void mo38071d(View view) {
        }

        @Override // androidx.core.view.C1183m0.C1190g, androidx.core.view.C1183m0.C1195l
        /* renamed from: g */
        public C0970b mo38068g(int i) {
            return C0970b.m38935d(this.f3557c.getInsets(C1197n.m38052a(i)));
        }

        C1194k(C1183m0 c1183m0, C1194k c1194k) {
            super(c1183m0, c1194k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$l */
    /* loaded from: classes.dex */
    public static class C1195l {

        /* renamed from: b */
        static final C1183m0 f3567b = new C1185b().m38090a().m38113a().m38112b().m38111c();

        /* renamed from: a */
        final C1183m0 f3568a;

        C1195l(C1183m0 c1183m0) {
            this.f3568a = c1183m0;
        }

        /* renamed from: a */
        C1183m0 mo38074a() {
            return this.f3568a;
        }

        /* renamed from: b */
        C1183m0 mo38073b() {
            return this.f3568a;
        }

        /* renamed from: c */
        C1183m0 mo38072c() {
            return this.f3568a;
        }

        /* renamed from: d */
        void mo38071d(View view) {
        }

        /* renamed from: e */
        void mo38070e(C1183m0 c1183m0) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1195l) {
                C1195l c1195l = (C1195l) obj;
                return mo38060o() == c1195l.mo38060o() && mo38061n() == c1195l.mo38061n() && C1070c.m38634a(mo38064k(), c1195l.mo38064k()) && C1070c.m38634a(mo38066i(), c1195l.mo38066i()) && C1070c.m38634a(mo38069f(), c1195l.mo38069f());
            }
            return false;
        }

        /* renamed from: f */
        C1146d mo38069f() {
            return null;
        }

        /* renamed from: g */
        C0970b mo38068g(int i) {
            return C0970b.f3250e;
        }

        /* renamed from: h */
        C0970b mo38067h() {
            return mo38064k();
        }

        public int hashCode() {
            return C1070c.m38633b(Boolean.valueOf(mo38060o()), Boolean.valueOf(mo38061n()), mo38064k(), mo38066i(), mo38069f());
        }

        /* renamed from: i */
        C0970b mo38066i() {
            return C0970b.f3250e;
        }

        /* renamed from: j */
        C0970b mo38065j() {
            return mo38064k();
        }

        /* renamed from: k */
        C0970b mo38064k() {
            return C0970b.f3250e;
        }

        /* renamed from: l */
        C0970b mo38063l() {
            return mo38064k();
        }

        /* renamed from: m */
        C1183m0 mo38062m(int i, int i2, int i3, int i4) {
            return f3567b;
        }

        /* renamed from: n */
        boolean mo38061n() {
            return false;
        }

        /* renamed from: o */
        boolean mo38060o() {
            return false;
        }

        /* renamed from: p */
        public void mo38059p(C0970b[] c0970bArr) {
        }

        /* renamed from: q */
        void mo38058q(C0970b c0970b) {
        }

        /* renamed from: r */
        void mo38057r(C1183m0 c1183m0) {
        }

        /* renamed from: s */
        public void mo38056s(C0970b c0970b) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$m */
    /* loaded from: classes.dex */
    public static final class C1196m {
        /* renamed from: a */
        static int m38055a(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        /* renamed from: b */
        public static int m38054b() {
            return 32;
        }

        /* renamed from: c */
        public static int m38053c() {
            return 7;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$n */
    /* loaded from: classes.dex */
    private static final class C1197n {
        /* renamed from: a */
        static int m38052a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3536b = C1194k.f3566q;
        } else {
            f3536b = C1195l.f3567b;
        }
    }

    private C1183m0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3537a = new C1194k(this, windowInsets);
        } else if (i >= 29) {
            this.f3537a = new C1193j(this, windowInsets);
        } else if (i >= 28) {
            this.f3537a = new C1192i(this, windowInsets);
        } else if (i >= 21) {
            this.f3537a = new C1191h(this, windowInsets);
        } else if (i >= 20) {
            this.f3537a = new C1190g(this, windowInsets);
        } else {
            this.f3537a = new C1195l(this);
        }
    }

    /* renamed from: m */
    static C0970b m38101m(C0970b c0970b, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0970b.f3251a - i);
        int max2 = Math.max(0, c0970b.f3252b - i2);
        int max3 = Math.max(0, c0970b.f3253c - i3);
        int max4 = Math.max(0, c0970b.f3254d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c0970b : C0970b.m38937b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C1183m0 m38093u(WindowInsets windowInsets) {
        return m38092v(windowInsets, null);
    }

    /* renamed from: v */
    public static C1183m0 m38092v(WindowInsets windowInsets, View view) {
        C1183m0 c1183m0 = new C1183m0((WindowInsets) C1076h.m38619f(windowInsets));
        if (view != null && C1112b0.m38447V(view)) {
            c1183m0.m38096r(C1112b0.m38462L(view));
            c1183m0.m38110d(view.getRootView());
        }
        return c1183m0;
    }

    @Deprecated
    /* renamed from: a */
    public C1183m0 m38113a() {
        return this.f3537a.mo38074a();
    }

    @Deprecated
    /* renamed from: b */
    public C1183m0 m38112b() {
        return this.f3537a.mo38073b();
    }

    @Deprecated
    /* renamed from: c */
    public C1183m0 m38111c() {
        return this.f3537a.mo38072c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m38110d(View view) {
        this.f3537a.mo38071d(view);
    }

    /* renamed from: e */
    public C1146d m38109e() {
        return this.f3537a.mo38069f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1183m0) {
            return C1070c.m38634a(this.f3537a, ((C1183m0) obj).f3537a);
        }
        return false;
    }

    /* renamed from: f */
    public C0970b m38108f(int i) {
        return this.f3537a.mo38068g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C0970b m38107g() {
        return this.f3537a.mo38066i();
    }

    @Deprecated
    /* renamed from: h */
    public int m38106h() {
        return this.f3537a.mo38064k().f3254d;
    }

    public int hashCode() {
        C1195l c1195l = this.f3537a;
        if (c1195l == null) {
            return 0;
        }
        return c1195l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m38105i() {
        return this.f3537a.mo38064k().f3251a;
    }

    @Deprecated
    /* renamed from: j */
    public int m38104j() {
        return this.f3537a.mo38064k().f3253c;
    }

    @Deprecated
    /* renamed from: k */
    public int m38103k() {
        return this.f3537a.mo38064k().f3252b;
    }

    /* renamed from: l */
    public C1183m0 m38102l(int i, int i2, int i3, int i4) {
        return this.f3537a.mo38062m(i, i2, i3, i4);
    }

    /* renamed from: n */
    public boolean m38100n() {
        return this.f3537a.mo38061n();
    }

    @Deprecated
    /* renamed from: o */
    public C1183m0 m38099o(int i, int i2, int i3, int i4) {
        return new C1185b(this).m38088c(C0970b.m38937b(i, i2, i3, i4)).m38090a();
    }

    /* renamed from: p */
    void m38098p(C0970b[] c0970bArr) {
        this.f3537a.mo38059p(c0970bArr);
    }

    /* renamed from: q */
    void m38097q(C0970b c0970b) {
        this.f3537a.mo38058q(c0970b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m38096r(C1183m0 c1183m0) {
        this.f3537a.mo38057r(c1183m0);
    }

    /* renamed from: s */
    void m38095s(C0970b c0970b) {
        this.f3537a.mo38056s(c0970b);
    }

    /* renamed from: t */
    public WindowInsets m38094t() {
        C1195l c1195l = this.f3537a;
        if (c1195l instanceof C1190g) {
            return ((C1190g) c1195l).f3557c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$c */
    /* loaded from: classes.dex */
    private static class C1186c extends C1189f {

        /* renamed from: e */
        private static Field f3543e = null;

        /* renamed from: f */
        private static boolean f3544f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f3545g = null;

        /* renamed from: h */
        private static boolean f3546h = false;

        /* renamed from: c */
        private WindowInsets f3547c;

        /* renamed from: d */
        private C0970b f3548d;

        C1186c() {
            this.f3547c = m38087h();
        }

        /* renamed from: h */
        private static WindowInsets m38087h() {
            if (!f3544f) {
                try {
                    f3543e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f3544f = true;
            }
            Field field = f3543e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f3546h) {
                try {
                    f3545g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f3546h = true;
            }
            Constructor<WindowInsets> constructor = f3545g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: b */
        C1183m0 mo38085b() {
            m38086a();
            C1183m0 m38093u = C1183m0.m38093u(this.f3547c);
            m38093u.m38098p(this.f3551b);
            m38093u.m38095s(this.f3548d);
            return m38093u;
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: d */
        void mo38083d(C0970b c0970b) {
            this.f3548d = c0970b;
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: f */
        void mo38081f(C0970b c0970b) {
            WindowInsets windowInsets = this.f3547c;
            if (windowInsets != null) {
                this.f3547c = windowInsets.replaceSystemWindowInsets(c0970b.f3251a, c0970b.f3252b, c0970b.f3253c, c0970b.f3254d);
            }
        }

        C1186c(C1183m0 c1183m0) {
            super(c1183m0);
            this.f3547c = c1183m0.m38094t();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$d */
    /* loaded from: classes.dex */
    private static class C1187d extends C1189f {

        /* renamed from: c */
        final WindowInsets.Builder f3549c;

        C1187d() {
            this.f3549c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: b */
        C1183m0 mo38085b() {
            m38086a();
            C1183m0 m38093u = C1183m0.m38093u(this.f3549c.build());
            m38093u.m38098p(this.f3551b);
            return m38093u;
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: c */
        void mo38084c(C0970b c0970b) {
            this.f3549c.setMandatorySystemGestureInsets(c0970b.m38934e());
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: d */
        void mo38083d(C0970b c0970b) {
            this.f3549c.setStableInsets(c0970b.m38934e());
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: e */
        void mo38082e(C0970b c0970b) {
            this.f3549c.setSystemGestureInsets(c0970b.m38934e());
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: f */
        void mo38081f(C0970b c0970b) {
            this.f3549c.setSystemWindowInsets(c0970b.m38934e());
        }

        @Override // androidx.core.view.C1183m0.C1189f
        /* renamed from: g */
        void mo38080g(C0970b c0970b) {
            this.f3549c.setTappableElementInsets(c0970b.m38934e());
        }

        C1187d(C1183m0 c1183m0) {
            super(c1183m0);
            WindowInsets.Builder builder;
            WindowInsets m38094t = c1183m0.m38094t();
            if (m38094t != null) {
                builder = new WindowInsets.Builder(m38094t);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3549c = builder;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$h */
    /* loaded from: classes.dex */
    private static class C1191h extends C1190g {

        /* renamed from: m */
        private C0970b f3562m;

        C1191h(C1183m0 c1183m0, WindowInsets windowInsets) {
            super(c1183m0, windowInsets);
            this.f3562m = null;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: b */
        C1183m0 mo38073b() {
            return C1183m0.m38093u(this.f3557c.consumeStableInsets());
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: c */
        C1183m0 mo38072c() {
            return C1183m0.m38093u(this.f3557c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: i */
        final C0970b mo38066i() {
            if (this.f3562m == null) {
                this.f3562m = C0970b.m38937b(this.f3557c.getStableInsetLeft(), this.f3557c.getStableInsetTop(), this.f3557c.getStableInsetRight(), this.f3557c.getStableInsetBottom());
            }
            return this.f3562m;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: n */
        boolean mo38061n() {
            return this.f3557c.isConsumed();
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: s */
        public void mo38056s(C0970b c0970b) {
            this.f3562m = c0970b;
        }

        C1191h(C1183m0 c1183m0, C1191h c1191h) {
            super(c1183m0, c1191h);
            this.f3562m = null;
            this.f3562m = c1191h.f3562m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$g */
    /* loaded from: classes.dex */
    public static class C1190g extends C1195l {

        /* renamed from: h */
        private static boolean f3552h = false;

        /* renamed from: i */
        private static Method f3553i;

        /* renamed from: j */
        private static Class<?> f3554j;

        /* renamed from: k */
        private static Field f3555k;

        /* renamed from: l */
        private static Field f3556l;

        /* renamed from: c */
        final WindowInsets f3557c;

        /* renamed from: d */
        private C0970b[] f3558d;

        /* renamed from: e */
        private C0970b f3559e;

        /* renamed from: f */
        private C1183m0 f3560f;

        /* renamed from: g */
        C0970b f3561g;

        C1190g(C1183m0 c1183m0, WindowInsets windowInsets) {
            super(c1183m0);
            this.f3559e = null;
            this.f3557c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C0970b m38079t(int i, boolean z) {
            C0970b c0970b = C0970b.f3250e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c0970b = C0970b.m38938a(c0970b, m38078u(i2, z));
                }
            }
            return c0970b;
        }

        /* renamed from: v */
        private C0970b m38077v() {
            C1183m0 c1183m0 = this.f3560f;
            if (c1183m0 != null) {
                return c1183m0.m38107g();
            }
            return C0970b.f3250e;
        }

        /* renamed from: w */
        private C0970b m38076w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3552h) {
                    m38075x();
                }
                Method method = f3553i;
                if (method != null && f3554j != null && f3555k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3555k.get(f3556l.get(invoke));
                        if (rect != null) {
                            return C0970b.m38936c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m38075x() {
            try {
                f3553i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3554j = cls;
                f3555k = cls.getDeclaredField("mVisibleInsets");
                f3556l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3555k.setAccessible(true);
                f3556l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f3552h = true;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: d */
        void mo38071d(View view) {
            C0970b m38076w = m38076w(view);
            if (m38076w == null) {
                m38076w = C0970b.f3250e;
            }
            mo38058q(m38076w);
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: e */
        void mo38070e(C1183m0 c1183m0) {
            c1183m0.m38096r(this.f3560f);
            c1183m0.m38097q(this.f3561g);
        }

        @Override // androidx.core.view.C1183m0.C1195l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f3561g, ((C1190g) obj).f3561g);
            }
            return false;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: g */
        public C0970b mo38068g(int i) {
            return m38079t(i, false);
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: k */
        final C0970b mo38064k() {
            if (this.f3559e == null) {
                this.f3559e = C0970b.m38937b(this.f3557c.getSystemWindowInsetLeft(), this.f3557c.getSystemWindowInsetTop(), this.f3557c.getSystemWindowInsetRight(), this.f3557c.getSystemWindowInsetBottom());
            }
            return this.f3559e;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: m */
        C1183m0 mo38062m(int i, int i2, int i3, int i4) {
            C1185b c1185b = new C1185b(C1183m0.m38093u(this.f3557c));
            c1185b.m38088c(C1183m0.m38101m(mo38064k(), i, i2, i3, i4));
            c1185b.m38089b(C1183m0.m38101m(mo38066i(), i, i2, i3, i4));
            return c1185b.m38090a();
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: o */
        boolean mo38060o() {
            return this.f3557c.isRound();
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: p */
        public void mo38059p(C0970b[] c0970bArr) {
            this.f3558d = c0970bArr;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: q */
        void mo38058q(C0970b c0970b) {
            this.f3561g = c0970b;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: r */
        void mo38057r(C1183m0 c1183m0) {
            this.f3560f = c1183m0;
        }

        /* renamed from: u */
        protected C0970b m38078u(int i, boolean z) {
            C0970b m38107g;
            int i2;
            C1146d mo38069f;
            if (i == 1) {
                if (z) {
                    return C0970b.m38937b(0, Math.max(m38077v().f3252b, mo38064k().f3252b), 0, 0);
                }
                return C0970b.m38937b(0, mo38064k().f3252b, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    C0970b m38077v = m38077v();
                    C0970b mo38066i = mo38066i();
                    return C0970b.m38937b(Math.max(m38077v.f3251a, mo38066i.f3251a), 0, Math.max(m38077v.f3253c, mo38066i.f3253c), Math.max(m38077v.f3254d, mo38066i.f3254d));
                }
                C0970b mo38064k = mo38064k();
                C1183m0 c1183m0 = this.f3560f;
                m38107g = c1183m0 != null ? c1183m0.m38107g() : null;
                int i3 = mo38064k.f3254d;
                if (m38107g != null) {
                    i3 = Math.min(i3, m38107g.f3254d);
                }
                return C0970b.m38937b(mo38064k.f3251a, 0, mo38064k.f3253c, i3);
            } else if (i != 8) {
                if (i != 16) {
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                return C0970b.f3250e;
                            }
                            C1183m0 c1183m02 = this.f3560f;
                            if (c1183m02 != null) {
                                mo38069f = c1183m02.m38109e();
                            } else {
                                mo38069f = mo38069f();
                            }
                            if (mo38069f != null) {
                                return C0970b.m38937b(mo38069f.m38229b(), mo38069f.m38227d(), mo38069f.m38228c(), mo38069f.m38230a());
                            }
                            return C0970b.f3250e;
                        }
                        return mo38063l();
                    }
                    return mo38067h();
                }
                return mo38065j();
            } else {
                C0970b[] c0970bArr = this.f3558d;
                m38107g = c0970bArr != null ? c0970bArr[C1196m.m38055a(8)] : null;
                if (m38107g != null) {
                    return m38107g;
                }
                C0970b mo38064k2 = mo38064k();
                C0970b m38077v2 = m38077v();
                int i4 = mo38064k2.f3254d;
                if (i4 > m38077v2.f3254d) {
                    return C0970b.m38937b(0, 0, 0, i4);
                }
                C0970b c0970b = this.f3561g;
                if (c0970b != null && !c0970b.equals(C0970b.f3250e) && (i2 = this.f3561g.f3254d) > m38077v2.f3254d) {
                    return C0970b.m38937b(0, 0, 0, i2);
                }
                return C0970b.f3250e;
            }
        }

        C1190g(C1183m0 c1183m0, C1190g c1190g) {
            this(c1183m0, new WindowInsets(c1190g.f3557c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$j */
    /* loaded from: classes.dex */
    private static class C1193j extends C1192i {

        /* renamed from: n */
        private C0970b f3563n;

        /* renamed from: o */
        private C0970b f3564o;

        /* renamed from: p */
        private C0970b f3565p;

        C1193j(C1183m0 c1183m0, WindowInsets windowInsets) {
            super(c1183m0, windowInsets);
            this.f3563n = null;
            this.f3564o = null;
            this.f3565p = null;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: h */
        C0970b mo38067h() {
            if (this.f3564o == null) {
                this.f3564o = C0970b.m38935d(this.f3557c.getMandatorySystemGestureInsets());
            }
            return this.f3564o;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: j */
        C0970b mo38065j() {
            if (this.f3563n == null) {
                this.f3563n = C0970b.m38935d(this.f3557c.getSystemGestureInsets());
            }
            return this.f3563n;
        }

        @Override // androidx.core.view.C1183m0.C1195l
        /* renamed from: l */
        C0970b mo38063l() {
            if (this.f3565p == null) {
                this.f3565p = C0970b.m38935d(this.f3557c.getTappableElementInsets());
            }
            return this.f3565p;
        }

        @Override // androidx.core.view.C1183m0.C1190g, androidx.core.view.C1183m0.C1195l
        /* renamed from: m */
        C1183m0 mo38062m(int i, int i2, int i3, int i4) {
            return C1183m0.m38093u(this.f3557c.inset(i, i2, i3, i4));
        }

        @Override // androidx.core.view.C1183m0.C1191h, androidx.core.view.C1183m0.C1195l
        /* renamed from: s */
        public void mo38056s(C0970b c0970b) {
        }

        C1193j(C1183m0 c1183m0, C1193j c1193j) {
            super(c1183m0, c1193j);
            this.f3563n = null;
            this.f3564o = null;
            this.f3565p = null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* renamed from: androidx.core.view.m0$b */
    /* loaded from: classes.dex */
    public static final class C1185b {

        /* renamed from: a */
        private final C1189f f3542a;

        public C1185b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3542a = new C1188e();
            } else if (i >= 29) {
                this.f3542a = new C1187d();
            } else if (i >= 20) {
                this.f3542a = new C1186c();
            } else {
                this.f3542a = new C1189f();
            }
        }

        /* renamed from: a */
        public C1183m0 m38090a() {
            return this.f3542a.mo38085b();
        }

        @Deprecated
        /* renamed from: b */
        public C1185b m38089b(C0970b c0970b) {
            this.f3542a.mo38083d(c0970b);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1185b m38088c(C0970b c0970b) {
            this.f3542a.mo38081f(c0970b);
            return this;
        }

        public C1185b(C1183m0 c1183m0) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3542a = new C1188e(c1183m0);
            } else if (i >= 29) {
                this.f3542a = new C1187d(c1183m0);
            } else if (i >= 20) {
                this.f3542a = new C1186c(c1183m0);
            } else {
                this.f3542a = new C1189f(c1183m0);
            }
        }
    }

    public C1183m0(C1183m0 c1183m0) {
        if (c1183m0 != null) {
            C1195l c1195l = c1183m0.f3537a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c1195l instanceof C1194k)) {
                this.f3537a = new C1194k(this, (C1194k) c1195l);
            } else if (i >= 29 && (c1195l instanceof C1193j)) {
                this.f3537a = new C1193j(this, (C1193j) c1195l);
            } else if (i >= 28 && (c1195l instanceof C1192i)) {
                this.f3537a = new C1192i(this, (C1192i) c1195l);
            } else if (i >= 21 && (c1195l instanceof C1191h)) {
                this.f3537a = new C1191h(this, (C1191h) c1195l);
            } else if (i >= 20 && (c1195l instanceof C1190g)) {
                this.f3537a = new C1190g(this, (C1190g) c1195l);
            } else {
                this.f3537a = new C1195l(this);
            }
            c1195l.mo38070e(this);
            return;
        }
        this.f3537a = new C1195l(this);
    }
}
