package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4363e;
import com.google.gson.InterfaceC4391t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p334ra.InterfaceC9831b;
import p334ra.InterfaceC9832c;
import p421wa.C11605a;
import sa.C10100b;
import sa.C10104c;
import sa.C10119d;
import sa.C10134k;
import sa.InterfaceC10132i;
import va.AbstractC11172b;

/* renamed from: ta.i */
/* loaded from: classes2.dex */
public final class C10419i implements InterfaceC4391t {

    /* renamed from: A */
    private final AbstractC11172b f27072A = AbstractC11172b.m5829a();

    /* renamed from: w */
    private final C10104c f27073w;

    /* renamed from: x */
    private final InterfaceC4363e f27074x;

    /* renamed from: y */
    private final C10119d f27075y;

    /* renamed from: z */
    private final C10409d f27076z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: ta.i$a */
    /* loaded from: classes2.dex */
    public class C10420a extends AbstractC10422c {

        /* renamed from: d */
        final /* synthetic */ Field f27077d;

        /* renamed from: e */
        final /* synthetic */ boolean f27078e;

        /* renamed from: f */
        final /* synthetic */ AbstractC4385s f27079f;

        /* renamed from: g */
        final /* synthetic */ C4364f f27080g;

        /* renamed from: h */
        final /* synthetic */ C11605a f27081h;

        /* renamed from: i */
        final /* synthetic */ boolean f27082i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10420a(C10419i c10419i, String str, boolean z, boolean z2, Field field, boolean z3, AbstractC4385s abstractC4385s, C4364f c4364f, C11605a c11605a, boolean z4) {
            super(str, z, z2);
            this.f27077d = field;
            this.f27078e = z3;
            this.f27079f = abstractC4385s;
            this.f27080g = c4364f;
            this.f27081h = c11605a;
            this.f27082i = z4;
        }

        @Override // p368ta.C10419i.AbstractC10422c
        /* renamed from: a */
        void mo8012a(C4387a c4387a, Object obj) throws IOException, IllegalAccessException {
            Object mo27782e = this.f27079f.mo27782e(c4387a);
            if (mo27782e == null && this.f27082i) {
                return;
            }
            this.f27077d.set(obj, mo27782e);
        }

        @Override // p368ta.C10419i.AbstractC10422c
        /* renamed from: b */
        void mo8011b(C4390c c4390c, Object obj) throws IOException, IllegalAccessException {
            (this.f27078e ? this.f27079f : new C10431m(this.f27080g, this.f27079f, this.f27081h.m4627e())).mo27781f(c4390c, this.f27077d.get(obj));
        }

        @Override // p368ta.C10419i.AbstractC10422c
        /* renamed from: c */
        public boolean mo8010c(Object obj) throws IOException, IllegalAccessException {
            return this.f27086b && this.f27077d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: ta.i$b */
    /* loaded from: classes2.dex */
    public static final class C10421b<T> extends AbstractC4385s<T> {

        /* renamed from: a */
        private final InterfaceC10132i<T> f27083a;

        /* renamed from: b */
        private final Map<String, AbstractC10422c> f27084b;

        C10421b(InterfaceC10132i<T> interfaceC10132i, Map<String, AbstractC10422c> map) {
            this.f27083a = interfaceC10132i;
            this.f27084b = map;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: b */
        public T mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            T mo9083a = this.f27083a.mo9083a();
            try {
                c4387a.mo8041c();
                while (c4387a.mo8055H()) {
                    AbstractC10422c abstractC10422c = this.f27084b.get(c4387a.mo8042b0());
                    if (abstractC10422c != null && abstractC10422c.f27087c) {
                        abstractC10422c.mo8012a(c4387a, mo9083a);
                    }
                    c4387a.mo8054H0();
                }
                c4387a.mo8036y();
                return mo9083a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: d */
        public void mo27781f(C4390c c4390c, T t) throws IOException {
            if (t == null) {
                c4390c.mo8031P();
                return;
            }
            c4390c.mo8029h();
            try {
                for (AbstractC10422c abstractC10422c : this.f27084b.values()) {
                    if (abstractC10422c.mo8010c(t)) {
                        c4390c.mo8032L(abstractC10422c.f27085a);
                        abstractC10422c.mo8011b(c4390c, t);
                    }
                }
                c4390c.mo8022y();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: ta.i$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC10422c {

        /* renamed from: a */
        final String f27085a;

        /* renamed from: b */
        final boolean f27086b;

        /* renamed from: c */
        final boolean f27087c;

        protected AbstractC10422c(String str, boolean z, boolean z2) {
            this.f27085a = str;
            this.f27086b = z;
            this.f27087c = z2;
        }

        /* renamed from: a */
        abstract void mo8012a(C4387a c4387a, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        abstract void mo8011b(C4390c c4390c, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        abstract boolean mo8010c(Object obj) throws IOException, IllegalAccessException;
    }

    public C10419i(C10104c c10104c, InterfaceC4363e interfaceC4363e, C10119d c10119d, C10409d c10409d) {
        this.f27073w = c10104c;
        this.f27074x = interfaceC4363e;
        this.f27075y = c10119d;
        this.f27076z = c10409d;
    }

    /* renamed from: b */
    private AbstractC10422c m8017b(C4364f c4364f, Field field, String str, C11605a<?> c11605a, boolean z, boolean z2) {
        boolean m9079a = C10134k.m9079a(c11605a.m4629c());
        InterfaceC9831b interfaceC9831b = (InterfaceC9831b) field.getAnnotation(InterfaceC9831b.class);
        AbstractC4385s<?> m8057b = interfaceC9831b != null ? this.f27076z.m8057b(this.f27073w, c4364f, c11605a, interfaceC9831b) : null;
        boolean z3 = m8057b != null;
        if (m8057b == null) {
            m8057b = c4364f.m27794l(c11605a);
        }
        return new C10420a(this, str, z, z2, field, z3, m8057b, c4364f, c11605a, m9079a);
    }

    /* renamed from: d */
    static boolean m8015d(Field field, boolean z, C10119d c10119d) {
        return (c10119d.m9116c(field.getType(), z) || c10119d.m9113f(field, z)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* renamed from: e */
    private Map<String, AbstractC10422c> m8014e(C4364f c4364f, C11605a<?> c11605a, Class<?> cls) {
        AbstractC10422c abstractC10422c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type m4627e = c11605a.m4627e();
        C11605a<?> c11605a2 = c11605a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean m8016c = m8016c(field, true);
                boolean m8016c2 = m8016c(field, z);
                if (m8016c || m8016c2) {
                    this.f27072A.mo5828b(field);
                    Type m9127p = C10100b.m9127p(c11605a2.m4627e(), cls2, field.getGenericType());
                    List<String> m8013f = m8013f(field);
                    int size = m8013f.size();
                    AbstractC10422c abstractC10422c2 = null;
                    int i2 = z;
                    while (i2 < size) {
                        String str = m8013f.get(i2);
                        boolean z2 = i2 != 0 ? z : m8016c;
                        int i3 = i2;
                        AbstractC10422c abstractC10422c3 = abstractC10422c2;
                        int i4 = size;
                        List<String> list = m8013f;
                        Field field2 = field;
                        abstractC10422c2 = abstractC10422c3 == null ? (AbstractC10422c) linkedHashMap.put(str, m8017b(c4364f, field, str, C11605a.m4630b(m9127p), z2, m8016c2)) : abstractC10422c3;
                        m8016c = z2;
                        m8013f = list;
                        size = i4;
                        field = field2;
                        z = false;
                        i2 = i3 + 1;
                    }
                    if (abstractC10422c2 != null) {
                        throw new IllegalArgumentException(m4627e + " declares multiple JSON fields named " + abstractC10422c.f27085a);
                    }
                }
                i++;
                z = false;
            }
            c11605a2 = C11605a.m4630b(C10100b.m9127p(c11605a2.m4627e(), cls2, cls2.getGenericSuperclass()));
            cls2 = c11605a2.m4629c();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m8013f(Field field) {
        InterfaceC9832c interfaceC9832c = (InterfaceC9832c) field.getAnnotation(InterfaceC9832c.class);
        if (interfaceC9832c == null) {
            return Collections.singletonList(this.f27074x.translateName(field));
        }
        String value = interfaceC9832c.value();
        String[] alternate = interfaceC9832c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.InterfaceC4391t
    /* renamed from: a */
    public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
        Class<? super T> m4629c = c11605a.m4629c();
        if (Object.class.isAssignableFrom(m4629c)) {
            return new C10421b(this.f27073w.m9121a(c11605a), m8014e(c4364f, c11605a, m4629c));
        }
        return null;
    }

    /* renamed from: c */
    public boolean m8016c(Field field, boolean z) {
        return m8015d(field, z, this.f27075y);
    }
}
