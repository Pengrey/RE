package p377u4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.util.Log;
import gd.C5640a;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p181jd.C6449y;
import p181jd.Intrinsics;
import p489zc._Collections;

/* renamed from: u4.g */
/* loaded from: classes.dex */
public final class HashUtils {

    /* renamed from: a */
    private static final String f28010a;

    /* renamed from: b */
    private static final String[] f28011b;

    /* renamed from: c */
    public static final HashUtils f28012c = new HashUtils();

    /* compiled from: HashUtils.kt */
    /* renamed from: u4.g$a */
    /* loaded from: classes.dex */
    public static final class C10837a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Object f28013a;

        /* renamed from: b */
        final /* synthetic */ C6449y f28014b;

        /* renamed from: c */
        final /* synthetic */ ReentrantLock f28015c;

        /* renamed from: d */
        final /* synthetic */ Condition f28016d;

        C10837a(Object obj, C6449y c6449y, ReentrantLock reentrantLock, Condition condition) {
            this.f28013a = obj;
            this.f28014b = c6449y;
            this.f28015c = reentrantLock;
            this.f28016d = condition;
        }

        /* JADX WARN: Type inference failed for: r8v12, types: [T, java.lang.String] */
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Intrinsics.isThisObjectNull(method, "method");
            Intrinsics.isThisObjectNull(objArr, "objects");
            try {
                if (Intrinsics.equals(method.getName(), "onChecksumsReady") && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        for (Object obj3 : (List) obj2) {
                            if (obj3 != null) {
                                Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                                Intrinsics.checkIfNull(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                                Intrinsics.checkIfNull(method3, "c.javaClass.getMethod(\"getType\")");
                                if (method2.invoke(obj3, new Object[0]) == null && Intrinsics.equals(method3.invoke(obj3, new Object[0]), this.f28013a)) {
                                    Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                    Intrinsics.checkIfNull(method4, "c.javaClass.getMethod(\"getValue\")");
                                    Object invoke = method4.invoke(obj3, new Object[0]);
                                    if (invoke != null) {
                                        this.f28014b.f17533w = new BigInteger(1, (byte[]) invoke).toString(16);
                                        this.f28015c.lock();
                                        this.f28016d.signalAll();
                                        this.f28015c.unlock();
                                        return null;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
            } catch (Throwable th2) {
                Log.d(HashUtils.m6926a(HashUtils.f28012c), "Can't fetch checksum.", th2);
            }
            return null;
        }
    }

    static {
        String simpleName = HashUtils.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "HashUtils::class.java.simpleName");
        f28010a = simpleName;
        f28011b = new String[]{"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"};
    }

    private HashUtils() {
    }

    /* renamed from: a */
    public static final /* synthetic */ String m6926a(HashUtils hashUtils) {
        return f28010a;
    }

    /* renamed from: b */
    public static final String m6925b(String str) throws Exception {
        return f28012c.m6923d(new File(str));
    }

    /* renamed from: c */
    public static final String m6924c(Context context, Long l) {
        List m453p0;
        List m453p02;
        Intrinsics.isThisObjectNull(context, "context");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = f28011b;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0))));
        }
        m453p0 = _Collections.m453p0(arrayList);
        C6449y c6449y = new C6449y();
        c6449y.f17533w = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Class<?> cls = Class.forName("android.content.pm.Checksum");
            Intrinsics.checkIfNull(cls, "Class.forName(\"android.content.pm.Checksum\")");
            Field field = cls.getField("TYPE_WHOLE_MD5");
            Intrinsics.checkIfNull(field, "checksumClass.getField(\"TYPE_WHOLE_MD5\")");
            Object obj = field.get(null);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            Intrinsics.checkIfNull(cls2, "Class.forName(\"android.c…nChecksumsReadyListener\")");
            Object newProxyInstance = Proxy.newProxyInstance(HashUtils.class.getClassLoader(), new Class[]{cls2}, new C10837a(obj, c6449y, reentrantLock, newCondition));
            Intrinsics.checkIfNull(newProxyInstance, "Proxy.newProxyInstance(\n…       }\n              })");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2);
            Intrinsics.checkIfNull(method, "PackageManager::class.ja…ecksumReadyListenerClass)");
            PackageManager packageManager = context.getPackageManager();
            m453p02 = _Collections.m453p0(m453p0);
            method.invoke(packageManager, context.getPackageName(), Boolean.FALSE, obj, m453p02, newProxyInstance);
            if (l == null) {
                newCondition.await();
            } else {
                newCondition.awaitNanos(l.longValue());
            }
            String str2 = (String) c6449y.f17533w;
            reentrantLock.unlock();
            return str2;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    /* renamed from: d */
    private final String m6923d(File file) throws Exception {
        int read;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    messageDigest.update(bArr, 0, read);
                }
            } while (read != -1);
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            Intrinsics.checkIfNull(bigInteger, "BigInteger(1, md.digest()).toString(16)");
            C5640a.m23456a(bufferedInputStream, null);
            return bigInteger;
        } finally {
        }
    }
}
