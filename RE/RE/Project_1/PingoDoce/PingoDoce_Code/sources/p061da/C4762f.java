package p061da;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import com.google.firebase.encoders.InterfaceC4249d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p011aa.C0095a;
import p061da.InterfaceC4759d;

/* renamed from: da.f */
/* loaded from: classes.dex */
final class C4762f implements InterfaceC4248c {

    /* renamed from: f */
    private static final Charset f13051f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C0095a f13052g = C0095a.m41963a("key").m41958b(C4755a.m26692b().m26691c(1).m26693a()).m41959a();

    /* renamed from: h */
    private static final C0095a f13053h = C0095a.m41963a("value").m41958b(C4755a.m26692b().m26691c(2).m26693a()).m41959a();

    /* renamed from: i */
    private static final InterfaceC4247b<Map.Entry<Object, Object>> f13054i = C4761e.f13050a;

    /* renamed from: a */
    private OutputStream f13055a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4247b<?>> f13056b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC4249d<?>> f13057c;

    /* renamed from: d */
    private final InterfaceC4247b<Object> f13058d;

    /* renamed from: e */
    private final C4767i f13059e = new C4767i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProtobufDataEncoderContext.java */
    /* renamed from: da.f$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C4763a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13060a;

        static {
            int[] iArr = new int[InterfaceC4759d.EnumC4760a.values().length];
            f13060a = iArr;
            try {
                iArr[InterfaceC4759d.EnumC4760a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13060a[InterfaceC4759d.EnumC4760a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13060a[InterfaceC4759d.EnumC4760a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4762f(OutputStream outputStream, Map<Class<?>, InterfaceC4247b<?>> map, Map<Class<?>, InterfaceC4249d<?>> map2, InterfaceC4247b<Object> interfaceC4247b) {
        this.f13055a = outputStream;
        this.f13056b = map;
        this.f13057c = map2;
        this.f13058d = interfaceC4247b;
    }

    /* renamed from: o */
    private static ByteBuffer m26679o(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    private <T> long m26678p(InterfaceC4247b<T> interfaceC4247b, T t) throws IOException {
        C4757b c4757b = new C4757b();
        try {
            OutputStream outputStream = this.f13055a;
            this.f13055a = c4757b;
            interfaceC4247b.mo661a(t, this);
            this.f13055a = outputStream;
            long m26690a = c4757b.m26690a();
            c4757b.close();
            return m26690a;
        } catch (Throwable th2) {
            try {
                c4757b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: q */
    private <T> C4762f m26677q(InterfaceC4247b<T> interfaceC4247b, C0095a c0095a, T t, boolean z) throws IOException {
        long m26678p = m26678p(interfaceC4247b, t);
        if (z && m26678p == 0) {
            return this;
        }
        m26671w((m26673u(c0095a) << 3) | 2);
        m26670x(m26678p);
        interfaceC4247b.mo661a(t, this);
        return this;
    }

    /* renamed from: r */
    private <T> C4762f m26676r(InterfaceC4249d<T> interfaceC4249d, C0095a c0095a, T t, boolean z) throws IOException {
        this.f13059e.m26660b(c0095a, z);
        interfaceC4249d.mo28184a(t, this.f13059e);
        return this;
    }

    /* renamed from: t */
    private static InterfaceC4759d m26674t(C0095a c0095a) {
        InterfaceC4759d interfaceC4759d = (InterfaceC4759d) c0095a.m41961c(InterfaceC4759d.class);
        if (interfaceC4759d != null) {
            return interfaceC4759d;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: u */
    private static int m26673u(C0095a c0095a) {
        InterfaceC4759d interfaceC4759d = (InterfaceC4759d) c0095a.m41961c(InterfaceC4759d.class);
        if (interfaceC4759d != null) {
            return interfaceC4759d.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ void m26672v(Map.Entry entry, InterfaceC4248c interfaceC4248c) throws IOException {
        interfaceC4248c.mo10212f(f13052g, entry.getKey());
        interfaceC4248c.mo10212f(f13053h, entry.getValue());
    }

    /* renamed from: w */
    private void m26671w(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f13055a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f13055a.write(i & 127);
    }

    /* renamed from: x */
    private void m26670x(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f13055a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f13055a.write(((int) j) & 127);
    }

    /* renamed from: e */
    InterfaceC4248c m26688e(C0095a c0095a, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m26671w((m26673u(c0095a) << 3) | 1);
        this.f13055a.write(m26679o(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: f */
    public InterfaceC4248c mo10212f(C0095a c0095a, Object obj) throws IOException {
        return m26686h(c0095a, obj, true);
    }

    /* renamed from: g */
    InterfaceC4248c m26687g(C0095a c0095a, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m26671w((m26673u(c0095a) << 3) | 5);
        this.f13055a.write(m26679o(4).putFloat(f).array());
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public InterfaceC4248c m26686h(C0095a c0095a, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m26671w((m26673u(c0095a) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f13051f);
            m26671w(bytes.length);
            this.f13055a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m26686h(c0095a, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m26677q(f13054i, c0095a, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m26688e(c0095a, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m26687g(c0095a, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m26682l(c0095a, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m26680n(c0095a, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m26671w((m26673u(c0095a) << 3) | 2);
                m26671w(bArr.length);
                this.f13055a.write(bArr);
                return this;
            }
            InterfaceC4247b<?> interfaceC4247b = this.f13056b.get(obj.getClass());
            if (interfaceC4247b != null) {
                return m26677q(interfaceC4247b, c0095a, obj, z);
            }
            InterfaceC4249d<?> interfaceC4249d = this.f13057c.get(obj.getClass());
            if (interfaceC4249d != null) {
                return m26676r(interfaceC4249d, c0095a, obj, z);
            }
            if (obj instanceof InterfaceC4758c) {
                return mo10216b(c0095a, ((InterfaceC4758c) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return mo10216b(c0095a, ((Enum) obj).ordinal());
            }
            return m26677q(this.f13058d, c0095a, obj, z);
        }
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: i */
    public C4762f mo10216b(C0095a c0095a, int i) throws IOException {
        return m26684j(c0095a, i, true);
    }

    /* renamed from: j */
    C4762f m26684j(C0095a c0095a, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC4759d m26674t = m26674t(c0095a);
        int i2 = C4763a.f13060a[m26674t.intEncoding().ordinal()];
        if (i2 == 1) {
            m26671w(m26674t.tag() << 3);
            m26671w(i);
        } else if (i2 == 2) {
            m26671w(m26674t.tag() << 3);
            m26671w((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m26671w((m26674t.tag() << 3) | 5);
            this.f13055a.write(m26679o(4).putInt(i).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: k */
    public C4762f mo10215c(C0095a c0095a, long j) throws IOException {
        return m26682l(c0095a, j, true);
    }

    /* renamed from: l */
    C4762f m26682l(C0095a c0095a, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC4759d m26674t = m26674t(c0095a);
        int i = C4763a.f13060a[m26674t.intEncoding().ordinal()];
        if (i == 1) {
            m26671w(m26674t.tag() << 3);
            m26670x(j);
        } else if (i == 2) {
            m26671w(m26674t.tag() << 3);
            m26670x((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m26671w((m26674t.tag() << 3) | 1);
            this.f13055a.write(m26679o(8).putLong(j).array());
        }
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: m */
    public C4762f mo10217a(C0095a c0095a, boolean z) throws IOException {
        return m26680n(c0095a, z, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C4762f m26680n(C0095a c0095a, boolean z, boolean z2) throws IOException {
        return m26684j(c0095a, z ? 1 : 0, z2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C4762f m26675s(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC4247b<?> interfaceC4247b = this.f13056b.get(obj.getClass());
        if (interfaceC4247b != null) {
            interfaceC4247b.mo661a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }
}
