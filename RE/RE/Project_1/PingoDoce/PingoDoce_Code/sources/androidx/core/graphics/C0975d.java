package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.C0946e;
import androidx.core.content.res.C0955h;
import androidx.core.provider.C1038g;
import p301q.C9557f;

/* renamed from: androidx.core.graphics.d */
/* loaded from: classes.dex */
public class C0975d {

    /* renamed from: a */
    private static final C0995j f3259a;

    /* renamed from: b */
    private static final C9557f<String, Typeface> f3260b;

    /* compiled from: TypefaceCompat.java */
    /* renamed from: androidx.core.graphics.d$a */
    /* loaded from: classes.dex */
    public static class C0976a extends C1038g.C1041c {

        /* renamed from: a */
        private C0955h.AbstractC0961f f3261a;

        public C0976a(C0955h.AbstractC0961f abstractC0961f) {
            this.f3261a = abstractC0961f;
        }

        @Override // androidx.core.provider.C1038g.C1041c
        /* renamed from: a */
        public void mo38694a(int i) {
            C0955h.AbstractC0961f abstractC0961f = this.f3261a;
            if (abstractC0961f != null) {
                abstractC0961f.mo9203h(i);
            }
        }

        @Override // androidx.core.provider.C1038g.C1041c
        /* renamed from: b */
        public void mo38693b(Typeface typeface) {
            C0955h.AbstractC0961f abstractC0961f = this.f3261a;
            if (abstractC0961f != null) {
                abstractC0961f.mo9202i(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f3259a = new C0994i();
        } else if (i >= 28) {
            f3259a = new C0993h();
        } else if (i >= 26) {
            f3259a = new C0992g();
        } else if (i >= 24 && C0991f.m38827m()) {
            f3259a = new C0991f();
        } else if (i >= 21) {
            f3259a = new C0990e();
        } else {
            f3259a = new C0995j();
        }
        f3260b = new C9557f<>(16);
    }

    /* renamed from: a */
    public static Typeface m38917a(Context context, Typeface typeface, int i) {
        Typeface m38911g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m38911g = m38911g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : m38911g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m38916b(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        return f3259a.mo38807c(context, cancellationSignal, c1040bArr, i);
    }

    /* renamed from: c */
    public static Typeface m38915c(Context context, C0946e.InterfaceC0948b interfaceC0948b, Resources resources, int i, String str, int i2, int i3, C0955h.AbstractC0961f abstractC0961f, Handler handler, boolean z) {
        Typeface mo38808b;
        if (interfaceC0948b instanceof C0946e.C0951e) {
            C0946e.C0951e c0951e = (C0946e.C0951e) interfaceC0948b;
            Typeface m38910h = m38910h(c0951e.m39009c());
            if (m38910h != null) {
                if (abstractC0961f != null) {
                    abstractC0961f.m38978d(m38910h, handler);
                }
                return m38910h;
            }
            boolean z2 = !z ? abstractC0961f != null : c0951e.m39011a() != 0;
            int m39008d = z ? c0951e.m39008d() : -1;
            mo38808b = C1038g.m38704a(context, c0951e.m39010b(), i3, z2, m39008d, C0955h.AbstractC0961f.m38977e(handler), new C0976a(abstractC0961f));
        } else {
            mo38808b = f3259a.mo38808b(context, (C0946e.C0949c) interfaceC0948b, resources, i3);
            if (abstractC0961f != null) {
                if (mo38808b != null) {
                    abstractC0961f.m38978d(mo38808b, handler);
                } else {
                    abstractC0961f.m38979c(-3, handler);
                }
            }
        }
        if (mo38808b != null) {
            f3260b.m10629f(m38913e(resources, i, str, i2, i3), mo38808b);
        }
        return mo38808b;
    }

    /* renamed from: d */
    public static Typeface m38914d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface mo38805e = f3259a.mo38805e(context, resources, i, str, i3);
        if (mo38805e != null) {
            f3260b.m10629f(m38913e(resources, i, str, i2, i3), mo38805e);
        }
        return mo38805e;
    }

    /* renamed from: e */
    private static String m38913e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* renamed from: f */
    public static Typeface m38912f(Resources resources, int i, String str, int i2, int i3) {
        return f3260b.m10631d(m38913e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m38911g(Context context, Typeface typeface, int i) {
        C0995j c0995j = f3259a;
        C0946e.C0949c m38801i = c0995j.m38801i(typeface);
        if (m38801i == null) {
            return null;
        }
        return c0995j.mo38808b(context, m38801i, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m38910h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
