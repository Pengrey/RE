package okhttp3.internal.publicsuffix;

import com.github.aachartmodel.aainfographics.BuildConfig;
import gd.C5640a;
import gf.Util;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.platform.Platform;
import p181jd.Intrinsics;
import p337rd.InterfaceC9870e;
import p337rd._Sequences;
import p356sf.C10200t;
import p356sf.GzipSource;
import p356sf.InterfaceC10187e;
import p468yc.C13195u;
import p489zc.C13777q;
import p489zc.C13780s;
import p489zc.CollectionsJVM;
import p489zc._Collections;
import sd.C10171u;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final C8156a f21217e = new C8156a(null);

    /* renamed from: f */
    private static final byte[] f21218f = {42};

    /* renamed from: g */
    private static final List f21219g;

    /* renamed from: h */
    private static final PublicSuffixDatabase f21220h;

    /* renamed from: a */
    private final AtomicBoolean f21221a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f21222b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f21223c;

    /* renamed from: d */
    private byte[] f21224d;

    /* compiled from: PublicSuffixDatabase.kt */
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* loaded from: classes2.dex */
    public static final class C8156a {
        private C8156a() {
        }

        public /* synthetic */ C8156a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final /* synthetic */ String m16446a(C8156a c8156a, byte[] bArr, byte[][] bArr2, int i) {
            return c8156a.m16445b(bArr, bArr2, i);
        }

        /* renamed from: b */
        private final String m16445b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int m23413d;
            int m23413d2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        m23413d = 46;
                        z = false;
                    } else {
                        z = z2;
                        m23413d = Util.m23413d(bArr2[i8][i9], 255);
                    }
                    m23413d2 = m23413d - Util.m23413d(bArr[i5 + i10], 255);
                    if (m23413d2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else if (i8 == bArr2.length - 1) {
                        break;
                    } else {
                        i8++;
                        i9 = -1;
                        z2 = true;
                    }
                }
                if (m23413d2 >= 0) {
                    if (m23413d2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                Intrinsics.checkIfNull(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m16444c() {
            return PublicSuffixDatabase.m16452a();
        }
    }

    static {
        List m202b;
        m202b = CollectionsJVM.m202b("*");
        f21219g = m202b;
        f21220h = new PublicSuffixDatabase();
    }

    /* renamed from: a */
    public static final /* synthetic */ PublicSuffixDatabase m16452a() {
        return f21220h;
    }

    /* renamed from: b */
    private final List m16451b(List list) {
        String str;
        String str2;
        String str3;
        List m8884p0;
        if (!this.f21221a.get() && this.f21221a.compareAndSet(false, true)) {
            m16448e();
        } else {
            try {
                this.f21222b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f21223c != null) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                Charset charset = StandardCharsets.UTF_8;
                Intrinsics.checkIfNull(charset, "UTF_8");
                byte[] bytes = ((String) list.get(i)).getBytes(charset);
                Intrinsics.checkIfNull(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    str = null;
                    break;
                }
                int i3 = i2 + 1;
                C8156a c8156a = f21217e;
                byte[] bArr2 = this.f21223c;
                if (bArr2 == null) {
                    Intrinsics.throwUninitPropException("publicSuffixListBytes");
                    bArr2 = null;
                }
                String m16446a = C8156a.m16446a(c8156a, bArr2, bArr, i2);
                if (m16446a != null) {
                    str = m16446a;
                    break;
                }
                i2 = i3;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    bArr3[i4] = f21218f;
                    C8156a c8156a2 = f21217e;
                    byte[] bArr4 = this.f21223c;
                    if (bArr4 == null) {
                        Intrinsics.throwUninitPropException("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String m16446a2 = C8156a.m16446a(c8156a2, bArr4, bArr3, i4);
                    if (m16446a2 != null) {
                        str2 = m16446a2;
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i6 = size - 1;
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i7 + 1;
                    C8156a c8156a3 = f21217e;
                    byte[] bArr5 = this.f21224d;
                    if (bArr5 == null) {
                        Intrinsics.throwUninitPropException("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = C8156a.m16446a(c8156a3, bArr5, bArr, i7);
                    if (str3 != null) {
                        break;
                    }
                    i7 = i8;
                }
            }
            str3 = null;
            if (str3 != null) {
                m8884p0 = C10171u.m8884p0(Intrinsics.addStrAndObj("!", str3), new char[]{'.'}, false, 0, 6, null);
                return m8884p0;
            } else if (str == null && str2 == null) {
                return f21219g;
            } else {
                List m8884p02 = str == null ? null : C10171u.m8884p0(str, new char[]{'.'}, false, 0, 6, null);
                if (m8884p02 == null) {
                    m8884p02 = C13780s.m197g();
                }
                List m8884p03 = str2 != null ? C10171u.m8884p0(str2, new char[]{'.'}, false, 0, 6, null) : null;
                if (m8884p03 == null) {
                    m8884p03 = C13780s.m197g();
                }
                return m8884p02.size() > m8884p03.size() ? m8884p02 : m8884p03;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    /* renamed from: d */
    private final void m16449d() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        InterfaceC10187e m8565c = C10200t.m8565c(new GzipSource(C10200t.m8558j(resourceAsStream)));
        try {
            byte[] mo8760U = m8565c.mo8760U(m8565c.readInt());
            byte[] mo8760U2 = m8565c.mo8760U(m8565c.readInt());
            C13195u c13195u = C13195u.f34156a;
            C5640a.m23456a(m8565c, null);
            synchronized (this) {
                Intrinsics.ifNullDoSomething(mo8760U);
                this.f21223c = mo8760U;
                Intrinsics.ifNullDoSomething(mo8760U2);
                this.f21224d = mo8760U2;
            }
            this.f21222b.countDown();
        } finally {
        }
    }

    /* renamed from: e */
    private final void m16448e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m16449d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.f21214a.m16457g().m16469j("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    private final List m16447f(String str) {
        List m8884p0;
        List m487H;
        m8884p0 = C10171u.m8884p0(str, new char[]{'.'}, false, 0, 6, null);
        if (Intrinsics.equals(C13777q.m249W(m8884p0), BuildConfig.VERSION_NAME)) {
            m487H = _Collections.m487H(m8884p0, 1);
            return m487H;
        }
        return m8884p0;
    }

    /* renamed from: c */
    public final String m16450c(String str) {
        int size;
        int size2;
        InterfaceC9870e m491D;
        InterfaceC9870e m9757g;
        String m9754j;
        Intrinsics.isThisObjectNull(str, "domain");
        String unicode = IDN.toUnicode(str);
        Intrinsics.checkIfNull(unicode, "unicodeDomain");
        List m16447f = m16447f(unicode);
        List m16451b = m16451b(m16447f);
        if (m16447f.size() != m16451b.size() || ((String) m16451b.get(0)).charAt(0) == '!') {
            if (((String) m16451b.get(0)).charAt(0) == '!') {
                size = m16447f.size();
                size2 = m16451b.size();
            } else {
                size = m16447f.size();
                size2 = m16451b.size() + 1;
            }
            m491D = _Collections.m491D(m16447f(str));
            m9757g = _Sequences.m9757g(m491D, size - size2);
            m9754j = _Sequences.m9754j(m9757g, ".", null, null, 0, null, null, 62, null);
            return m9754j;
        }
        return null;
    }
}
