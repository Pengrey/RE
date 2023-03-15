package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C1479r0;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.m0 */
/* loaded from: classes.dex */
public final class C1463m0 extends C1479r0.AbstractC1482c {

    /* renamed from: f */
    private static final Class<?>[] f4336f = {Application.class, C1459l0.class};

    /* renamed from: g */
    private static final Class<?>[] f4337g = {C1459l0.class};

    /* renamed from: a */
    private final Application f4338a;

    /* renamed from: b */
    private final C1479r0.InterfaceC1481b f4339b;

    /* renamed from: c */
    private final Bundle f4340c;

    /* renamed from: d */
    private final AbstractC1469p f4341d;

    /* renamed from: e */
    private final SavedStateRegistry f4342e;

    @SuppressLint({"LambdaLast"})
    public C1463m0(Application application, InterfaceC1663c interfaceC1663c, Bundle bundle) {
        C1479r0.InterfaceC1481b m36977b;
        this.f4342e = interfaceC1663c.mo35784i();
        this.f4341d = interfaceC1663c.mo137b();
        this.f4340c = bundle;
        this.f4338a = application;
        if (application != null) {
            m36977b = C1479r0.C1480a.m36979c(application);
        } else {
            m36977b = C1479r0.C1483d.m36977b();
        }
        this.f4339b = m36977b;
    }

    /* renamed from: d */
    private static <T> Constructor<T> m36995d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            if (Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                return constructor2;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.C1479r0.AbstractC1482c, androidx.lifecycle.C1479r0.InterfaceC1481b
    /* renamed from: a */
    public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo36978c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1479r0.C1484e
    /* renamed from: b */
    void mo36976b(AbstractC1468o0 abstractC1468o0) {
        SavedStateHandleController.m37073b(abstractC1468o0, this.f4342e, this.f4341d);
    }

    @Override // androidx.lifecycle.C1479r0.AbstractC1482c
    /* renamed from: c */
    public <T extends AbstractC1468o0> T mo36978c(String str, Class<T> cls) {
        Constructor m36995d;
        T t;
        boolean isAssignableFrom = C1425b.class.isAssignableFrom(cls);
        if (isAssignableFrom && this.f4338a != null) {
            m36995d = m36995d(cls, f4336f);
        } else {
            m36995d = m36995d(cls, f4337g);
        }
        if (m36995d == null) {
            return (T) this.f4339b.mo36919a(cls);
        }
        SavedStateHandleController m37071i = SavedStateHandleController.m37071i(this.f4342e, this.f4341d, str, this.f4340c);
        if (isAssignableFrom) {
            try {
                Application application = this.f4338a;
                if (application != null) {
                    t = (T) m36995d.newInstance(application, m37071i.m37070j());
                    t.m36988f("androidx.lifecycle.savedstate.vm.tag", m37071i);
                    return t;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        }
        t = (T) m36995d.newInstance(m37071i.m37070j());
        t.m36988f("androidx.lifecycle.savedstate.vm.tag", m37071i);
        return t;
    }
}
