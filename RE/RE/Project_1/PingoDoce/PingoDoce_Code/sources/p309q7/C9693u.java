package p309q7;

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

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.u */
/* loaded from: classes.dex */
public final class C9693u implements InterfaceC4248c {

    /* renamed from: f */
    private static final Charset f25534f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C0095a f25535g;

    /* renamed from: h */
    private static final C0095a f25536h;

    /* renamed from: i */
    private static final InterfaceC4247b<Map.Entry<Object, Object>> f25537i;

    /* renamed from: a */
    private OutputStream f25538a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4247b<?>> f25539b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC4249d<?>> f25540c;

    /* renamed from: d */
    private final InterfaceC4247b<Object> f25541d;

    /* renamed from: e */
    private final C9697y f25542e = new C9697y(this);

    static {
        C0095a.C0097b m41963a = C0095a.m41963a("key");
        C9687o c9687o = new C9687o();
        c9687o.m10220a(1);
        f25535g = m41963a.m41958b(c9687o.m10219b()).m41959a();
        C0095a.C0097b m41963a2 = C0095a.m41963a("value");
        C9687o c9687o2 = new C9687o();
        c9687o2.m10220a(2);
        f25536h = m41963a2.m41958b(c9687o2.m10219b()).m41959a();
        f25537i = C9692t.f25533a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9693u(OutputStream outputStream, Map<Class<?>, InterfaceC4247b<?>> map, Map<Class<?>, InterfaceC4249d<?>> map2, InterfaceC4247b<Object> interfaceC4247b) {
        this.f25538a = outputStream;
        this.f25539b = map;
        this.f25540c = map2;
        this.f25541d = interfaceC4247b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static /* synthetic */ void m10207k(Map.Entry entry, InterfaceC4248c interfaceC4248c) throws IOException {
        interfaceC4248c.mo10212f(f25535g, entry.getKey());
        interfaceC4248c.mo10212f(f25536h, entry.getValue());
    }

    /* renamed from: l */
    private static int m10206l(C0095a c0095a) {
        InterfaceC9691s interfaceC9691s = (InterfaceC9691s) c0095a.m41961c(InterfaceC9691s.class);
        if (interfaceC9691s != null) {
            return interfaceC9691s.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private final <T> long m10205m(InterfaceC4247b<T> interfaceC4247b, T t) throws IOException {
        C9688p c9688p = new C9688p();
        try {
            OutputStream outputStream = this.f25538a;
            this.f25538a = c9688p;
            interfaceC4247b.mo661a(t, this);
            this.f25538a = outputStream;
            long m10218a = c9688p.m10218a();
            c9688p.close();
            return m10218a;
        } catch (Throwable th2) {
            try {
                c9688p.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* renamed from: n */
    private static InterfaceC9691s m10204n(C0095a c0095a) {
        InterfaceC9691s interfaceC9691s = (InterfaceC9691s) c0095a.m41961c(InterfaceC9691s.class);
        if (interfaceC9691s != null) {
            return interfaceC9691s;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    private final <T> C9693u m10203o(InterfaceC4247b<T> interfaceC4247b, C0095a c0095a, T t, boolean z) throws IOException {
        long m10205m = m10205m(interfaceC4247b, t);
        if (z && m10205m == 0) {
            return this;
        }
        m10200r((m10206l(c0095a) << 3) | 2);
        m10199s(m10205m);
        interfaceC4247b.mo661a(t, this);
        return this;
    }

    /* renamed from: p */
    private final <T> C9693u m10202p(InterfaceC4249d<T> interfaceC4249d, C0095a c0095a, T t, boolean z) throws IOException {
        this.f25542e.m10195a(c0095a, z);
        interfaceC4249d.mo28184a(t, this.f25542e);
        return this;
    }

    /* renamed from: q */
    private static ByteBuffer m10201q(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: r */
    private final void m10200r(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f25538a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f25538a.write(i & 127);
    }

    /* renamed from: s */
    private final void m10199s(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f25538a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f25538a.write(((int) j) & 127);
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: a */
    public final /* synthetic */ InterfaceC4248c mo10217a(C0095a c0095a, boolean z) throws IOException {
        m10210h(c0095a, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: b */
    public final /* synthetic */ InterfaceC4248c mo10216b(C0095a c0095a, int i) throws IOException {
        m10210h(c0095a, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: c */
    public final /* synthetic */ InterfaceC4248c mo10215c(C0095a c0095a, long j) throws IOException {
        m10209i(c0095a, j, true);
        return this;
    }

    /* renamed from: d */
    final InterfaceC4248c m10214d(C0095a c0095a, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m10200r((m10206l(c0095a) << 3) | 1);
        this.f25538a.write(m10201q(8).putDouble(d).array());
        return this;
    }

    /* renamed from: e */
    final InterfaceC4248c m10213e(C0095a c0095a, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m10200r((m10206l(c0095a) << 3) | 5);
        this.f25538a.write(m10201q(4).putFloat(f).array());
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: f */
    public final InterfaceC4248c mo10212f(C0095a c0095a, Object obj) throws IOException {
        m10211g(c0095a, obj, true);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final InterfaceC4248c m10211g(C0095a c0095a, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m10200r((m10206l(c0095a) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f25534f);
            m10200r(bytes.length);
            this.f25538a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m10211g(c0095a, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m10203o(f25537i, c0095a, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m10214d(c0095a, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m10213e(c0095a, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m10209i(c0095a, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m10210h(c0095a, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m10200r((m10206l(c0095a) << 3) | 2);
            m10200r(bArr.length);
            this.f25538a.write(bArr);
            return this;
        } else {
            InterfaceC4247b<?> interfaceC4247b = this.f25539b.get(obj.getClass());
            if (interfaceC4247b != null) {
                m10203o(interfaceC4247b, c0095a, obj, z);
                return this;
            }
            InterfaceC4249d<?> interfaceC4249d = this.f25540c.get(obj.getClass());
            if (interfaceC4249d != null) {
                m10202p(interfaceC4249d, c0095a, obj, z);
                return this;
            } else if (obj instanceof InterfaceC9689q) {
                m10210h(c0095a, ((InterfaceC9689q) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                m10210h(c0095a, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m10203o(this.f25541d, c0095a, obj, z);
                return this;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final C9693u m10210h(C0095a c0095a, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        InterfaceC9691s m10204n = m10204n(c0095a);
        EnumC9690r enumC9690r = EnumC9690r.DEFAULT;
        int ordinal = m10204n.zzb().ordinal();
        if (ordinal == 0) {
            m10200r(m10204n.zza() << 3);
            m10200r(i);
        } else if (ordinal == 1) {
            m10200r(m10204n.zza() << 3);
            m10200r((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            m10200r((m10204n.zza() << 3) | 5);
            this.f25538a.write(m10201q(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: i */
    final C9693u m10209i(C0095a c0095a, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        InterfaceC9691s m10204n = m10204n(c0095a);
        EnumC9690r enumC9690r = EnumC9690r.DEFAULT;
        int ordinal = m10204n.zzb().ordinal();
        if (ordinal == 0) {
            m10200r(m10204n.zza() << 3);
            m10199s(j);
        } else if (ordinal == 1) {
            m10200r(m10204n.zza() << 3);
            m10199s((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            m10200r((m10204n.zza() << 3) | 1);
            this.f25538a.write(m10201q(8).putLong(j).array());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final C9693u m10208j(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        InterfaceC4247b<?> interfaceC4247b = this.f25539b.get(obj.getClass());
        if (interfaceC4247b != null) {
            interfaceC4247b.mo661a(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }
}
