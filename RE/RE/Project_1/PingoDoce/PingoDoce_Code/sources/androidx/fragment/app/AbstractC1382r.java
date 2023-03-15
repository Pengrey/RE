package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1469p;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.r */
/* loaded from: classes.dex */
public abstract class AbstractC1382r {

    /* renamed from: b */
    int f4098b;

    /* renamed from: c */
    int f4099c;

    /* renamed from: d */
    int f4100d;

    /* renamed from: e */
    int f4101e;

    /* renamed from: f */
    int f4102f;

    /* renamed from: g */
    boolean f4103g;

    /* renamed from: h */
    String f4104h;

    /* renamed from: i */
    int f4105i;

    /* renamed from: j */
    CharSequence f4106j;

    /* renamed from: k */
    int f4107k;

    /* renamed from: l */
    CharSequence f4108l;

    /* renamed from: m */
    ArrayList<String> f4109m;

    /* renamed from: n */
    ArrayList<String> f4110n;

    /* renamed from: p */
    ArrayList<Runnable> f4111p;

    /* renamed from: a */
    ArrayList<C1383a> f4112a = new ArrayList<>();

    /* renamed from: o */
    boolean f4113o = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction.java */
    /* renamed from: androidx.fragment.app.r$a */
    /* loaded from: classes.dex */
    public static final class C1383a {

        /* renamed from: a */
        int f4114a;

        /* renamed from: b */
        Fragment f4115b;

        /* renamed from: c */
        int f4116c;

        /* renamed from: d */
        int f4117d;

        /* renamed from: e */
        int f4118e;

        /* renamed from: f */
        int f4119f;

        /* renamed from: g */
        AbstractC1469p.EnumC1472c f4120g;

        /* renamed from: h */
        AbstractC1469p.EnumC1472c f4121h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1383a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1383a(int i, Fragment fragment) {
            this.f4114a = i;
            this.f4115b = fragment;
            AbstractC1469p.EnumC1472c enumC1472c = AbstractC1469p.EnumC1472c.RESUMED;
            this.f4120g = enumC1472c;
            this.f4121h = enumC1472c;
        }

        C1383a(int i, Fragment fragment, AbstractC1469p.EnumC1472c enumC1472c) {
            this.f4114a = i;
            this.f4115b = fragment;
            this.f4120g = fragment.f3834m0;
            this.f4121h = enumC1472c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1382r(C1367h c1367h, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public AbstractC1382r m37188b(int i, Fragment fragment, String str) {
        mo37179k(i, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AbstractC1382r m37187c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3825c0 = viewGroup;
        return m37188b(viewGroup.getId(), fragment, str);
    }

    /* renamed from: d */
    public AbstractC1382r m37186d(Fragment fragment, String str) {
        mo37179k(0, fragment, str, 1);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37185e(C1383a c1383a) {
        this.f4112a.add(c1383a);
        c1383a.f4116c = this.f4098b;
        c1383a.f4117d = this.f4099c;
        c1383a.f4118e = this.f4100d;
        c1383a.f4119f = this.f4101e;
    }

    /* renamed from: f */
    public abstract int mo37184f();

    /* renamed from: g */
    public abstract int mo37183g();

    /* renamed from: h */
    public abstract void mo37182h();

    /* renamed from: i */
    public abstract void mo37181i();

    /* renamed from: j */
    public AbstractC1382r m37180j() {
        if (this.f4103g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo37179k(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.f3818U;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3818U + " now " + str);
                }
                fragment.f3818U = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.f3816S;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3816S + " now " + i);
                    }
                    fragment.f3816S = i;
                    fragment.f3817T = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m37185e(new C1383a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: l */
    public abstract boolean mo37178l();

    /* renamed from: m */
    public AbstractC1382r mo37177m(Fragment fragment) {
        m37185e(new C1383a(3, fragment));
        return this;
    }

    /* renamed from: n */
    public AbstractC1382r m37176n(int i, Fragment fragment) {
        return m37175o(i, fragment, null);
    }

    /* renamed from: o */
    public AbstractC1382r m37175o(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo37179k(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: p */
    public AbstractC1382r mo37174p(Fragment fragment, AbstractC1469p.EnumC1472c enumC1472c) {
        m37185e(new C1383a(10, fragment, enumC1472c));
        return this;
    }

    /* renamed from: q */
    public AbstractC1382r m37173q(boolean z) {
        this.f4113o = z;
        return this;
    }
}
