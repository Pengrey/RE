package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.C0928a;
import androidx.core.graphics.drawable.C0981a;
import androidx.vectordrawable.graphics.drawable.C1694c;
import androidx.vectordrawable.graphics.drawable.C1704i;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p125h.C5716a;
import p147i.C5978c;
import p147i.C5979d;
import p301q.C9556e;
import p301q.C9557f;
import p301q.C9558g;
import p301q.C9559h;

/* renamed from: androidx.appcompat.widget.i0 */
/* loaded from: classes.dex */
public final class C0486i0 {

    /* renamed from: i */
    private static C0486i0 f1635i;

    /* renamed from: a */
    private WeakHashMap<Context, C9559h<ColorStateList>> f1637a;

    /* renamed from: b */
    private C9558g<String, InterfaceC0491e> f1638b;

    /* renamed from: c */
    private C9559h<String> f1639c;

    /* renamed from: d */
    private final WeakHashMap<Context, C9556e<WeakReference<Drawable.ConstantState>>> f1640d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1641e;

    /* renamed from: f */
    private boolean f1642f;

    /* renamed from: g */
    private InterfaceC0492f f1643g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1634h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C0489c f1636j = new C0489c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$a */
    /* loaded from: classes.dex */
    public static class C0487a implements InterfaceC0491e {
        C0487a() {
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0491e
        /* renamed from: a */
        public Drawable mo40542a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5716a.m23278m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$b */
    /* loaded from: classes.dex */
    public static class C0488b implements InterfaceC0491e {
        C0488b() {
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0491e
        /* renamed from: a */
        public Drawable mo40542a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1694c.m35688a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$c */
    /* loaded from: classes.dex */
    public static class C0489c extends C9557f<Integer, PorterDuffColorFilter> {
        public C0489c(int i) {
            super(i);
        }

        /* renamed from: m */
        private static int m40550m(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: n */
        PorterDuffColorFilter m40549n(int i, PorterDuff.Mode mode) {
            return m10631d(Integer.valueOf(m40550m(i, mode)));
        }

        /* renamed from: o */
        PorterDuffColorFilter m40548o(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m10629f(Integer.valueOf(m40550m(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$d */
    /* loaded from: classes.dex */
    public static class C0490d implements InterfaceC0491e {
        C0490d() {
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0491e
        /* renamed from: a */
        public Drawable mo40542a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0490d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        C5978c.m22537c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0491e {
        /* renamed from: a */
        Drawable mo40542a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0492f {
        /* renamed from: a */
        boolean mo40547a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo40546b(int i);

        /* renamed from: c */
        Drawable mo40545c(C0486i0 c0486i0, Context context, int i);

        /* renamed from: d */
        ColorStateList mo40544d(Context context, int i);

        /* renamed from: e */
        boolean mo40543e(Context context, int i, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* renamed from: androidx.appcompat.widget.i0$g */
    /* loaded from: classes.dex */
    public static class C0493g implements InterfaceC0491e {
        C0493g() {
        }

        @Override // androidx.appcompat.widget.C0486i0.InterfaceC0491e
        /* renamed from: a */
        public Drawable mo40542a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1704i.m35655c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m40574a(String str, InterfaceC0491e interfaceC0491e) {
        if (this.f1638b == null) {
            this.f1638b = new C9558g<>();
        }
        this.f1638b.put(str, interfaceC0491e);
    }

    /* renamed from: b */
    private synchronized boolean m40573b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C9556e<WeakReference<Drawable.ConstantState>> c9556e = this.f1640d.get(context);
            if (c9556e == null) {
                c9556e = new C9556e<>();
                this.f1640d.put(context, c9556e);
            }
            c9556e.m10639l(j, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m40572c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1637a == null) {
            this.f1637a = new WeakHashMap<>();
        }
        C9559h<ColorStateList> c9559h = this.f1637a.get(context);
        if (c9559h == null) {
            c9559h = new C9559h<>();
            this.f1637a.put(context, c9559h);
        }
        c9559h.m10609a(i, colorStateList);
    }

    /* renamed from: d */
    private void m40571d(Context context) {
        if (this.f1642f) {
            return;
        }
        this.f1642f = true;
        Drawable m40565j = m40565j(context, C5979d.abc_vector_test);
        if (m40565j == null || !m40558q(m40565j)) {
            this.f1642f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    /* renamed from: e */
    private static long m40570e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m40569f(Context context, int i) {
        if (this.f1641e == null) {
            this.f1641e = new TypedValue();
        }
        TypedValue typedValue = this.f1641e;
        context.getResources().getValue(i, typedValue, true);
        long m40570e = m40570e(typedValue);
        Drawable m40566i = m40566i(context, m40570e);
        if (m40566i != null) {
            return m40566i;
        }
        InterfaceC0492f interfaceC0492f = this.f1643g;
        Drawable mo40545c = interfaceC0492f == null ? null : interfaceC0492f.mo40545c(this, context, i);
        if (mo40545c != null) {
            mo40545c.setChangingConfigurations(typedValue.changingConfigurations);
            m40573b(context, m40570e, mo40545c);
        }
        return mo40545c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m40568g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m40563l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0486i0 m40567h() {
        C0486i0 c0486i0;
        synchronized (C0486i0.class) {
            if (f1635i == null) {
                C0486i0 c0486i02 = new C0486i0();
                f1635i = c0486i02;
                m40559p(c0486i02);
            }
            c0486i0 = f1635i;
        }
        return c0486i0;
    }

    /* renamed from: i */
    private synchronized Drawable m40566i(Context context, long j) {
        C9556e<WeakReference<Drawable.ConstantState>> c9556e = this.f1640d.get(context);
        if (c9556e == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m10644f = c9556e.m10644f(j);
        if (m10644f != null) {
            Drawable.ConstantState constantState = m10644f.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c9556e.m10638m(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m40563l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m40549n;
        synchronized (C0486i0.class) {
            C0489c c0489c = f1636j;
            m40549n = c0489c.m40549n(i, mode);
            if (m40549n == null) {
                m40549n = new PorterDuffColorFilter(i, mode);
                c0489c.m40548o(i, mode, m40549n);
            }
        }
        return m40549n;
    }

    /* renamed from: n */
    private ColorStateList m40561n(Context context, int i) {
        C9559h<ColorStateList> c9559h;
        WeakHashMap<Context, C9559h<ColorStateList>> weakHashMap = this.f1637a;
        if (weakHashMap == null || (c9559h = weakHashMap.get(context)) == null) {
            return null;
        }
        return c9559h.m10604f(i);
    }

    /* renamed from: p */
    private static void m40559p(C0486i0 c0486i0) {
        if (Build.VERSION.SDK_INT < 24) {
            c0486i0.m40574a("vector", new C0493g());
            c0486i0.m40574a("animated-vector", new C0488b());
            c0486i0.m40574a("animated-selector", new C0487a());
            c0486i0.m40574a("drawable", new C0490d());
        }
    }

    /* renamed from: q */
    private static boolean m40558q(Drawable drawable) {
        return (drawable instanceof C1704i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* renamed from: r */
    private Drawable m40557r(Context context, int i) {
        int next;
        C9558g<String, InterfaceC0491e> c9558g = this.f1638b;
        if (c9558g == null || c9558g.isEmpty()) {
            return null;
        }
        C9559h<String> c9559h = this.f1639c;
        if (c9559h != null) {
            String m10604f = c9559h.m10604f(i);
            if ("appcompat_skip_skip".equals(m10604f) || (m10604f != null && this.f1638b.get(m10604f) == null)) {
                return null;
            }
        } else {
            this.f1639c = new C9559h<>();
        }
        if (this.f1641e == null) {
            this.f1641e = new TypedValue();
        }
        TypedValue typedValue = this.f1641e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m40570e = m40570e(typedValue);
        Drawable m40566i = m40566i(context, m40570e);
        if (m40566i != null) {
            return m40566i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f1639c.m10609a(i, name);
                    InterfaceC0491e interfaceC0491e = this.f1638b.get(name);
                    if (interfaceC0491e != null) {
                        m40566i = interfaceC0491e.mo40542a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m40566i != null) {
                        m40566i.setChangingConfigurations(typedValue.changingConfigurations);
                        m40573b(context, m40570e, m40566i);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m40566i == null) {
            this.f1639c.m10609a(i, "appcompat_skip_skip");
        }
        return m40566i;
    }

    /* renamed from: v */
    private Drawable m40553v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m40562m = m40562m(context, i);
        if (m40562m != null) {
            if (C0456b0.m40682a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m38859r = C0981a.m38859r(drawable);
            C0981a.m38862o(m38859r, m40562m);
            PorterDuff.Mode m40560o = m40560o(i);
            if (m40560o != null) {
                C0981a.m38861p(m38859r, m40560o);
                return m38859r;
            }
            return m38859r;
        }
        InterfaceC0492f interfaceC0492f = this.f1643g;
        if ((interfaceC0492f == null || !interfaceC0492f.mo40543e(context, i, drawable)) && !m40551x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m40552w(Drawable drawable, C0514q0 c0514q0, int[] iArr) {
        if (C0456b0.m40682a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = c0514q0.f1726d;
        if (!z && !c0514q0.f1725c) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(m40568g(z ? c0514q0.f1723a : null, c0514q0.f1725c ? c0514q0.f1724b : f1634h, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m40565j(Context context, int i) {
        return m40564k(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m40564k(Context context, int i, boolean z) {
        Drawable m40557r;
        m40571d(context);
        m40557r = m40557r(context, i);
        if (m40557r == null) {
            m40557r = m40569f(context, i);
        }
        if (m40557r == null) {
            m40557r = C0928a.m39111f(context, i);
        }
        if (m40557r != null) {
            m40557r = m40553v(context, i, z, m40557r);
        }
        if (m40557r != null) {
            C0456b0.m40681b(m40557r);
        }
        return m40557r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m40562m(Context context, int i) {
        ColorStateList m40561n;
        m40561n = m40561n(context, i);
        if (m40561n == null) {
            InterfaceC0492f interfaceC0492f = this.f1643g;
            m40561n = interfaceC0492f == null ? null : interfaceC0492f.mo40544d(context, i);
            if (m40561n != null) {
                m40572c(context, i, m40561n);
            }
        }
        return m40561n;
    }

    /* renamed from: o */
    PorterDuff.Mode m40560o(int i) {
        InterfaceC0492f interfaceC0492f = this.f1643g;
        if (interfaceC0492f == null) {
            return null;
        }
        return interfaceC0492f.mo40546b(i);
    }

    /* renamed from: s */
    public synchronized void m40556s(Context context) {
        C9556e<WeakReference<Drawable.ConstantState>> c9556e = this.f1640d.get(context);
        if (c9556e != null) {
            c9556e.m10648b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m40555t(Context context, C0539x0 c0539x0, int i) {
        Drawable m40557r = m40557r(context, i);
        if (m40557r == null) {
            m40557r = c0539x0.m40541a(i);
        }
        if (m40557r != null) {
            return m40553v(context, i, false, m40557r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m40554u(InterfaceC0492f interfaceC0492f) {
        this.f1643g = interfaceC0492f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m40551x(Context context, int i, Drawable drawable) {
        InterfaceC0492f interfaceC0492f = this.f1643g;
        return interfaceC0492f != null && interfaceC0492f.mo40547a(context, i, drawable);
    }
}
