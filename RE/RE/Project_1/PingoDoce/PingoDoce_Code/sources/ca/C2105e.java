package ca;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import com.google.firebase.encoders.InterfaceC4249d;
import com.google.firebase.encoders.InterfaceC4250e;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import p011aa.C0095a;

/* renamed from: ca.e */
/* loaded from: classes.dex */
final class C2105e implements InterfaceC4248c, InterfaceC4250e {

    /* renamed from: a */
    private C2105e f6099a = null;

    /* renamed from: b */
    private boolean f6100b = true;

    /* renamed from: c */
    private final JsonWriter f6101c;

    /* renamed from: d */
    private final Map<Class<?>, InterfaceC4247b<?>> f6102d;

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC4249d<?>> f6103e;

    /* renamed from: f */
    private final InterfaceC4247b<Object> f6104f;

    /* renamed from: g */
    private final boolean f6105g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2105e(Writer writer, Map<Class<?>, InterfaceC4247b<?>> map, Map<Class<?>, InterfaceC4249d<?>> map2, InterfaceC4247b<Object> interfaceC4247b, boolean z) {
        this.f6101c = new JsonWriter(writer);
        this.f6102d = map;
        this.f6103e = map2;
        this.f6104f = interfaceC4247b;
        this.f6105g = z;
    }

    /* renamed from: q */
    private boolean m34663q(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    /* renamed from: t */
    private C2105e m34660t(String str, Object obj) throws IOException, EncodingException {
        m34658v();
        this.f6101c.name(str);
        if (obj == null) {
            this.f6101c.nullValue();
            return this;
        }
        return m34671i(obj, false);
    }

    /* renamed from: u */
    private C2105e m34659u(String str, Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m34658v();
        this.f6101c.name(str);
        return m34671i(obj, false);
    }

    /* renamed from: v */
    private void m34658v() throws IOException {
        if (this.f6100b) {
            C2105e c2105e = this.f6099a;
            if (c2105e != null) {
                c2105e.m34658v();
                this.f6099a.f6100b = false;
                this.f6099a = null;
                this.f6101c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: a */
    public InterfaceC4248c mo10217a(C0095a c0095a, boolean z) throws IOException {
        return m34666n(c0095a.m41962b(), z);
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: b */
    public InterfaceC4248c mo10216b(C0095a c0095a, int i) throws IOException {
        return m34669k(c0095a.m41962b(), i);
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: c */
    public InterfaceC4248c mo10215c(C0095a c0095a, long j) throws IOException {
        return m34668l(c0095a.m41962b(), j);
    }

    @Override // com.google.firebase.encoders.InterfaceC4248c
    /* renamed from: f */
    public InterfaceC4248c mo10212f(C0095a c0095a, Object obj) throws IOException {
        return m34667m(c0095a.m41962b(), obj);
    }

    /* renamed from: g */
    public C2105e m34673g(int i) throws IOException {
        m34658v();
        this.f6101c.value(i);
        return this;
    }

    /* renamed from: h */
    public C2105e m34672h(long j) throws IOException {
        m34658v();
        this.f6101c.value(j);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C2105e m34671i(Object obj, boolean z) throws IOException {
        int[] iArr;
        int i = 0;
        if (z && m34663q(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f6101c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f6101c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return m34664p((byte[]) obj);
            }
            this.f6101c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f6101c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    m34672h(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f6101c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f6101c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m34671i(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m34671i(obj2, false);
                }
            }
            this.f6101c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f6101c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m34671i(obj3, false);
            }
            this.f6101c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f6101c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    m34667m((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f6101c.endObject();
            return this;
        } else {
            InterfaceC4247b<?> interfaceC4247b = this.f6102d.get(obj.getClass());
            if (interfaceC4247b != null) {
                return m34661s(interfaceC4247b, obj, z);
            }
            InterfaceC4249d<?> interfaceC4249d = this.f6103e.get(obj.getClass());
            if (interfaceC4249d != null) {
                interfaceC4249d.mo28184a(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                mo10193d(((Enum) obj).name());
                return this;
            } else {
                return m34661s(this.f6104f, obj, z);
            }
        }
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: j */
    public C2105e mo10193d(String str) throws IOException {
        m34658v();
        this.f6101c.value(str);
        return this;
    }

    /* renamed from: k */
    public C2105e m34669k(String str, int i) throws IOException {
        m34658v();
        this.f6101c.name(str);
        return m34673g(i);
    }

    /* renamed from: l */
    public C2105e m34668l(String str, long j) throws IOException {
        m34658v();
        this.f6101c.name(str);
        return m34672h(j);
    }

    /* renamed from: m */
    public C2105e m34667m(String str, Object obj) throws IOException {
        if (this.f6105g) {
            return m34659u(str, obj);
        }
        return m34660t(str, obj);
    }

    /* renamed from: n */
    public C2105e m34666n(String str, boolean z) throws IOException {
        m34658v();
        this.f6101c.name(str);
        return mo10192e(z);
    }

    @Override // com.google.firebase.encoders.InterfaceC4250e
    /* renamed from: o */
    public C2105e mo10192e(boolean z) throws IOException {
        m34658v();
        this.f6101c.value(z);
        return this;
    }

    /* renamed from: p */
    public C2105e m34664p(byte[] bArr) throws IOException {
        m34658v();
        if (bArr == null) {
            this.f6101c.nullValue();
        } else {
            this.f6101c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m34662r() throws IOException {
        m34658v();
        this.f6101c.flush();
    }

    /* renamed from: s */
    C2105e m34661s(InterfaceC4247b<Object> interfaceC4247b, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f6101c.beginObject();
        }
        interfaceC4247b.mo661a(obj, this);
        if (!z) {
            this.f6101c.endObject();
        }
        return this;
    }
}
