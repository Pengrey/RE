package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.o0 */
/* loaded from: classes.dex */
public abstract class AbstractC1468o0 {

    /* renamed from: a */
    private final Map<String, Object> f4345a = new HashMap();

    /* renamed from: b */
    private volatile boolean f4346b = false;

    /* renamed from: c */
    private static void m36990c(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m36991b() {
        this.f4346b = true;
        Map<String, Object> map = this.f4345a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f4345a.values()) {
                    m36990c(obj);
                }
            }
        }
        mo36928e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public <T> T m36989d(String str) {
        T t;
        Map<String, Object> map = this.f4345a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f4345a.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo36928e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public <T> T m36988f(String str, T t) {
        Object obj;
        synchronized (this.f4345a) {
            obj = this.f4345a.get(str);
            if (obj == null) {
                this.f4345a.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.f4346b) {
            m36990c(t);
        }
        return t;
    }
}
