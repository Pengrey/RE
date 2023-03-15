package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.res.C0946e;
import androidx.core.provider.C1038g;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.j */
/* loaded from: classes.dex */
public class C0995j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0946e.C0949c> f3305a = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: androidx.core.graphics.j$a */
    /* loaded from: classes.dex */
    public class C0996a implements InterfaceC0998c<C1038g.C1040b> {
        C0996a(C0995j c0995j) {
        }

        @Override // androidx.core.graphics.C0995j.InterfaceC0998c
        /* renamed from: c */
        public int mo38795a(C1038g.C1040b c1040b) {
            return c1040b.m38696e();
        }

        @Override // androidx.core.graphics.C0995j.InterfaceC0998c
        /* renamed from: d */
        public boolean mo38794b(C1038g.C1040b c1040b) {
            return c1040b.m38695f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: androidx.core.graphics.j$b */
    /* loaded from: classes.dex */
    public class C0997b implements InterfaceC0998c<C0946e.C0950d> {
        C0997b(C0995j c0995j) {
        }

        @Override // androidx.core.graphics.C0995j.InterfaceC0998c
        /* renamed from: c */
        public int mo38795a(C0946e.C0950d c0950d) {
            return c0950d.m39013e();
        }

        @Override // androidx.core.graphics.C0995j.InterfaceC0998c
        /* renamed from: d */
        public boolean mo38794b(C0946e.C0950d c0950d) {
            return c0950d.m39012f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: androidx.core.graphics.j$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0998c<T> {
        /* renamed from: a */
        int mo38795a(T t);

        /* renamed from: b */
        boolean mo38794b(T t);
    }

    /* renamed from: a */
    private void m38809a(Typeface typeface, C0946e.C0949c c0949c) {
        long m38800j = m38800j(typeface);
        if (m38800j != 0) {
            this.f3305a.put(Long.valueOf(m38800j), c0949c);
        }
    }

    /* renamed from: f */
    private C0946e.C0950d m38804f(C0946e.C0949c c0949c, int i) {
        return (C0946e.C0950d) m38803g(c0949c.m39018a(), i, new C0997b(this));
    }

    /* renamed from: g */
    private static <T> T m38803g(T[] tArr, int i, InterfaceC0998c<T> interfaceC0998c) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Reader.READ_DONE;
        for (T t2 : tArr) {
            int abs = (Math.abs(interfaceC0998c.mo38795a(t2) - i2) * 2) + (interfaceC0998c.mo38794b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m38800j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* renamed from: b */
    public Typeface mo38808b(Context context, C0946e.C0949c c0949c, Resources resources, int i) {
        C0946e.C0950d m38804f = m38804f(c0949c, i);
        if (m38804f == null) {
            return null;
        }
        Typeface m38914d = C0975d.m38914d(context, resources, m38804f.m39016b(), m38804f.m39017a(), 0, i);
        m38809a(m38914d, c0949c);
        return m38914d;
    }

    /* renamed from: c */
    public Typeface mo38807c(Context context, CancellationSignal cancellationSignal, C1038g.C1040b[] c1040bArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c1040bArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo38802h(c1040bArr, i).m38697d());
            try {
                Typeface mo38806d = mo38806d(context, inputStream);
                C0999k.m38793a(inputStream);
                return mo38806d;
            } catch (IOException unused) {
                C0999k.m38793a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                C0999k.m38793a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo38806d(Context context, InputStream inputStream) {
        File m38789e = C0999k.m38789e(context);
        if (m38789e == null) {
            return null;
        }
        try {
            if (C0999k.m38790d(m38789e, inputStream)) {
                return Typeface.createFromFile(m38789e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m38789e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo38805e(Context context, Resources resources, int i, String str, int i2) {
        File m38789e = C0999k.m38789e(context);
        if (m38789e == null) {
            return null;
        }
        try {
            if (C0999k.m38791c(m38789e, resources, i)) {
                return Typeface.createFromFile(m38789e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m38789e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public C1038g.C1040b mo38802h(C1038g.C1040b[] c1040bArr, int i) {
        return (C1038g.C1040b) m38803g(c1040bArr, i, new C0996a(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C0946e.C0949c m38801i(Typeface typeface) {
        long m38800j = m38800j(typeface);
        if (m38800j == 0) {
            return null;
        }
        return this.f3305a.get(Long.valueOf(m38800j));
    }
}
