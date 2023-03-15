package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p054d3.InterfaceC4723a;
import p301q.C9545a;

/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    protected final C9545a<String, Method> f5246a;

    /* renamed from: b */
    protected final C9545a<String, Method> f5247b;

    /* renamed from: c */
    protected final C9545a<String, Class> f5248c;

    /* loaded from: classes.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(C9545a<String, Method> c9545a, C9545a<String, Method> c9545a2, C9545a<String, Class> c9545a3) {
        this.f5246a = c9545a;
        this.f5247b = c9545a2;
        this.f5248c = c9545a3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    private void m35607N(InterfaceC4723a interfaceC4723a) {
        try {
            mo35587I(m35606c(interfaceC4723a.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(interfaceC4723a.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m35606c(Class<? extends InterfaceC4723a> cls) throws ClassNotFoundException {
        Class cls2 = this.f5248c.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f5248c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    private Method m35605d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5246a.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
            this.f5246a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    private Method m35604e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f5247b.get(cls.getName());
        if (method == null) {
            Class m35606c = m35606c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m35606c.getDeclaredMethod("write", cls, VersionedParcel.class);
            this.f5247b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: A */
    protected abstract void mo35591A(byte[] bArr);

    /* renamed from: B */
    public void m35615B(byte[] bArr, int i) {
        mo35577w(i);
        mo35591A(bArr);
    }

    /* renamed from: C */
    protected abstract void mo35590C(CharSequence charSequence);

    /* renamed from: D */
    public void m35614D(CharSequence charSequence, int i) {
        mo35577w(i);
        mo35590C(charSequence);
    }

    /* renamed from: E */
    protected abstract void mo35589E(int i);

    /* renamed from: F */
    public void m35613F(int i, int i2) {
        mo35577w(i2);
        mo35589E(i);
    }

    /* renamed from: G */
    protected abstract void mo35588G(Parcelable parcelable);

    /* renamed from: H */
    public void m35612H(Parcelable parcelable, int i) {
        mo35577w(i);
        mo35588G(parcelable);
    }

    /* renamed from: I */
    protected abstract void mo35587I(String str);

    /* renamed from: J */
    public void m35611J(String str, int i) {
        mo35577w(i);
        mo35587I(str);
    }

    /* renamed from: K */
    protected <T extends InterfaceC4723a> void m35610K(T t, VersionedParcel versionedParcel) {
        try {
            m35604e(t.getClass()).invoke(null, t, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public void m35609L(InterfaceC4723a interfaceC4723a) {
        if (interfaceC4723a == null) {
            mo35587I(null);
            return;
        }
        m35607N(interfaceC4723a);
        VersionedParcel mo35585b = mo35585b();
        m35610K(interfaceC4723a, mo35585b);
        mo35585b.mo35586a();
    }

    /* renamed from: M */
    public void m35608M(InterfaceC4723a interfaceC4723a, int i) {
        mo35577w(i);
        m35609L(interfaceC4723a);
    }

    /* renamed from: a */
    protected abstract void mo35586a();

    /* renamed from: b */
    protected abstract VersionedParcel mo35585b();

    /* renamed from: f */
    public boolean m35603f() {
        return false;
    }

    /* renamed from: g */
    protected abstract boolean mo35584g();

    /* renamed from: h */
    public boolean m35602h(boolean z, int i) {
        return !mo35581m(i) ? z : mo35584g();
    }

    /* renamed from: i */
    protected abstract byte[] mo35583i();

    /* renamed from: j */
    public byte[] m35601j(byte[] bArr, int i) {
        return !mo35581m(i) ? bArr : mo35583i();
    }

    /* renamed from: k */
    protected abstract CharSequence mo35582k();

    /* renamed from: l */
    public CharSequence m35600l(CharSequence charSequence, int i) {
        return !mo35581m(i) ? charSequence : mo35582k();
    }

    /* renamed from: m */
    protected abstract boolean mo35581m(int i);

    /* renamed from: n */
    protected <T extends InterfaceC4723a> T m35599n(String str, VersionedParcel versionedParcel) {
        try {
            return (T) m35605d(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: o */
    protected abstract int mo35580o();

    /* renamed from: p */
    public int m35598p(int i, int i2) {
        return !mo35581m(i2) ? i : mo35580o();
    }

    /* renamed from: q */
    protected abstract <T extends Parcelable> T mo35579q();

    /* renamed from: r */
    public <T extends Parcelable> T m35597r(T t, int i) {
        return !mo35581m(i) ? t : (T) mo35579q();
    }

    /* renamed from: s */
    protected abstract String mo35578s();

    /* renamed from: t */
    public String m35596t(String str, int i) {
        return !mo35581m(i) ? str : mo35578s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends InterfaceC4723a> T m35595u() {
        String mo35578s = mo35578s();
        if (mo35578s == null) {
            return null;
        }
        return (T) m35599n(mo35578s, mo35585b());
    }

    /* renamed from: v */
    public <T extends InterfaceC4723a> T m35594v(T t, int i) {
        return !mo35581m(i) ? t : (T) m35595u();
    }

    /* renamed from: w */
    protected abstract void mo35577w(int i);

    /* renamed from: x */
    public void m35593x(boolean z, boolean z2) {
    }

    /* renamed from: y */
    protected abstract void mo35576y(boolean z);

    /* renamed from: z */
    public void m35592z(boolean z, int i) {
        mo35577w(i);
        mo35576y(z);
    }
}
