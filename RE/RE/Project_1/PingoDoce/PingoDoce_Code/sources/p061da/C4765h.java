package p061da;

import ba.InterfaceC1870a;
import ba.InterfaceC1871b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import com.google.firebase.encoders.InterfaceC4249d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: da.h */
/* loaded from: classes.dex */
public class C4765h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC4247b<?>> f13062a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4249d<?>> f13063b;

    /* renamed from: c */
    private final InterfaceC4247b<Object> f13064c;

    /* compiled from: ProtobufEncoder.java */
    /* renamed from: da.h$a */
    /* loaded from: classes.dex */
    public static final class C4766a implements InterfaceC1871b<C4766a> {

        /* renamed from: d */
        private static final InterfaceC4247b<Object> f13065d = C4764g.f13061a;

        /* renamed from: a */
        private final Map<Class<?>, InterfaceC4247b<?>> f13066a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC4249d<?>> f13067b = new HashMap();

        /* renamed from: c */
        private InterfaceC4247b<Object> f13068c = f13065d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m26663e(Object obj, InterfaceC4248c interfaceC4248c) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C4765h m26665c() {
            return new C4765h(new HashMap(this.f13066a), new HashMap(this.f13067b), this.f13068c);
        }

        /* renamed from: d */
        public C4766a m26664d(InterfaceC1870a interfaceC1870a) {
            interfaceC1870a.mo667a(this);
            return this;
        }

        @Override // ba.InterfaceC1871b
        /* renamed from: f */
        public <U> C4766a mo10198a(Class<U> cls, InterfaceC4247b<? super U> interfaceC4247b) {
            this.f13066a.put(cls, interfaceC4247b);
            this.f13067b.remove(cls);
            return this;
        }
    }

    C4765h(Map<Class<?>, InterfaceC4247b<?>> map, Map<Class<?>, InterfaceC4249d<?>> map2, InterfaceC4247b<Object> interfaceC4247b) {
        this.f13062a = map;
        this.f13063b = map2;
        this.f13064c = interfaceC4247b;
    }

    /* renamed from: a */
    public static C4766a m26669a() {
        return new C4766a();
    }

    /* renamed from: b */
    public void m26668b(Object obj, OutputStream outputStream) throws IOException {
        new C4762f(outputStream, this.f13062a, this.f13063b, this.f13064c).m26675s(obj);
    }

    /* renamed from: c */
    public byte[] m26667c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m26668b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
