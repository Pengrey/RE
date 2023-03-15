package ca;

import ba.InterfaceC1870a;
import ba.InterfaceC1871b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC4246a;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import com.google.firebase.encoders.InterfaceC4249d;
import com.google.firebase.encoders.InterfaceC4250e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: ca.d */
/* loaded from: classes.dex */
public final class C2102d implements InterfaceC1871b<C2102d> {

    /* renamed from: e */
    private static final InterfaceC4247b<Object> f6089e = C2099a.f6086a;

    /* renamed from: f */
    private static final InterfaceC4249d<String> f6090f = C2101c.f6088a;

    /* renamed from: g */
    private static final InterfaceC4249d<Boolean> f6091g = C2100b.f6087a;

    /* renamed from: h */
    private static final C2104b f6092h = new C2104b(null);

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC4247b<?>> f6093a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4249d<?>> f6094b = new HashMap();

    /* renamed from: c */
    private InterfaceC4247b<Object> f6095c = f6089e;

    /* renamed from: d */
    private boolean f6096d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: ca.d$a */
    /* loaded from: classes.dex */
    public class C2103a implements InterfaceC4246a {
        C2103a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4246a
        /* renamed from: a */
        public String mo28186a(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo28185b(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }

        @Override // com.google.firebase.encoders.InterfaceC4246a
        /* renamed from: b */
        public void mo28185b(Object obj, Writer writer) throws IOException {
            C2105e c2105e = new C2105e(writer, C2102d.this.f6093a, C2102d.this.f6094b, C2102d.this.f6095c, C2102d.this.f6096d);
            c2105e.m34671i(obj, false);
            c2105e.m34662r();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: ca.d$b */
    /* loaded from: classes.dex */
    private static final class C2104b implements InterfaceC4249d<Date> {

        /* renamed from: a */
        private static final DateFormat f6098a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f6098a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private C2104b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC4249d
        /* renamed from: b */
        public void mo28184a(Date date, InterfaceC4250e interfaceC4250e) throws IOException {
            interfaceC4250e.mo10193d(f6098a.format(date));
        }

        /* synthetic */ C2104b(C2103a c2103a) {
            this();
        }
    }

    public C2102d() {
        m34675p(String.class, f6090f);
        m34675p(Boolean.class, f6091g);
        m34675p(Date.class, f6092h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m34679l(Object obj, InterfaceC4248c interfaceC4248c) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m34677n(Boolean bool, InterfaceC4250e interfaceC4250e) throws IOException {
        interfaceC4250e.mo10192e(bool.booleanValue());
    }

    /* renamed from: i */
    public InterfaceC4246a m34682i() {
        return new C2103a();
    }

    /* renamed from: j */
    public C2102d m34681j(InterfaceC1870a interfaceC1870a) {
        interfaceC1870a.mo667a(this);
        return this;
    }

    /* renamed from: k */
    public C2102d m34680k(boolean z) {
        this.f6096d = z;
        return this;
    }

    @Override // ba.InterfaceC1871b
    /* renamed from: o */
    public <T> C2102d mo10198a(Class<T> cls, InterfaceC4247b<? super T> interfaceC4247b) {
        this.f6093a.put(cls, interfaceC4247b);
        this.f6094b.remove(cls);
        return this;
    }

    /* renamed from: p */
    public <T> C2102d m34675p(Class<T> cls, InterfaceC4249d<? super T> interfaceC4249d) {
        this.f6094b.put(cls, interfaceC4249d);
        this.f6093a.remove(cls);
        return this;
    }
}
