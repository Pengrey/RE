package kotlinx.coroutines.internal;

import gd.C5640a;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import p181jd.Intrinsics;
import p468yc.Exceptions;
import p489zc.Iterables;
import p489zc.MutableCollections;
import p489zc._Collections;
import sd.C10171u;
import sd.StringsJVM;

/* renamed from: kotlinx.coroutines.internal.m */
/* loaded from: classes2.dex */
public final class C6885m {

    /* renamed from: a */
    public static final C6885m f18338a = new C6885m();

    private C6885m() {
    }

    /* renamed from: a */
    private final Object m19918a(String str, ClassLoader classLoader, Class cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    /* renamed from: b */
    private final List m19917b(Class cls, ClassLoader classLoader) {
        List m455n0;
        try {
            return m19915d(cls, classLoader);
        } catch (Throwable unused) {
            m455n0 = _Collections.m455n0(ServiceLoader.load(cls, classLoader));
            return m455n0;
        }
    }

    /* renamed from: e */
    private final List m19914e(URL url) {
        boolean m8948C;
        String m8932B0;
        String m8923G0;
        String m8932B02;
        String url2 = url.toString();
        m8948C = StringsJVM.m8948C(url2, "jar", false, 2, null);
        if (m8948C) {
            m8932B0 = C10171u.m8932B0(url2, "jar:file:", null, 2, null);
            m8923G0 = C10171u.m8923G0(m8932B0, '!', null, 2, null);
            m8932B02 = C10171u.m8932B0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(m8923G0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(m8932B02)), "UTF-8"));
                List m19913f = f18338a.m19913f(bufferedReader);
                C5640a.m23456a(bufferedReader, null);
                jarFile.close();
                return m19913f;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        Exceptions.m1470a(th2, th4);
                        throw th2;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List m19913f2 = f18338a.m19913f(bufferedReader2);
            C5640a.m23456a(bufferedReader2, null);
            return m19913f2;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                C5640a.m23456a(bufferedReader2, th5);
                throw th6;
            }
        }
    }

    /* renamed from: f */
    private final List m19913f(BufferedReader bufferedReader) {
        List m455n0;
        String m8921H0;
        CharSequence m8915K0;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                m455n0 = _Collections.m455n0(linkedHashSet);
                return m455n0;
            }
            m8921H0 = C10171u.m8921H0(readLine, "#", null, 2, null);
            m8915K0 = C10171u.m8915K0(m8921H0);
            String obj = m8915K0.toString();
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(("Illegal service provider class name: " + obj).toString());
            }
        }
    }

    /* renamed from: c */
    public final List m19916c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!C6887n.m19899a()) {
            return m19917b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 != null) {
                arrayList.add(mainDispatcherFactory2);
                return arrayList;
            }
            return arrayList;
        } catch (Throwable unused3) {
            return m19917b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    /* renamed from: d */
    public final List m19915d(Class cls, ClassLoader classLoader) {
        Set<String> m451r0;
        int m186r;
        ArrayList<URL> list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        Intrinsics.checkIfNull(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            MutableCollections.m181u(arrayList, f18338a.m19914e(url));
        }
        m451r0 = _Collections.m451r0(arrayList);
        if (!m451r0.isEmpty()) {
            m186r = Iterables.m186r(m451r0, 10);
            ArrayList arrayList2 = new ArrayList(m186r);
            for (String str : m451r0) {
                arrayList2.add(f18338a.m19918a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
