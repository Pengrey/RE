package com.google.gson;

import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p368ta.C10403a;
import p368ta.C10405b;
import p368ta.C10407c;
import p368ta.C10409d;
import p368ta.C10414g;
import p368ta.C10416h;
import p368ta.C10419i;
import p368ta.C10423j;
import p368ta.C10425k;
import p368ta.C10432n;
import p421wa.C11605a;
import sa.C10104c;
import sa.C10119d;
import sa.C10134k;
import sa.C10135l;

/* renamed from: com.google.gson.f */
/* loaded from: classes.dex */
public final class C4364f {

    /* renamed from: n */
    private static final C11605a<?> f11820n = C11605a.m4631a(Object.class);

    /* renamed from: a */
    private final ThreadLocal<Map<C11605a<?>, C4370f<?>>> f11821a;

    /* renamed from: b */
    private final Map<C11605a<?>, AbstractC4385s<?>> f11822b;

    /* renamed from: c */
    private final C10104c f11823c;

    /* renamed from: d */
    private final C10409d f11824d;

    /* renamed from: e */
    final List<InterfaceC4391t> f11825e;

    /* renamed from: f */
    final Map<Type, InterfaceC4372h<?>> f11826f;

    /* renamed from: g */
    final boolean f11827g;

    /* renamed from: h */
    final boolean f11828h;

    /* renamed from: i */
    final boolean f11829i;

    /* renamed from: j */
    final boolean f11830j;

    /* renamed from: k */
    final boolean f11831k;

    /* renamed from: l */
    final List<InterfaceC4391t> f11832l;

    /* renamed from: m */
    final List<InterfaceC4391t> f11833m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$a */
    /* loaded from: classes.dex */
    public class C4365a extends AbstractC4385s<Number> {
        C4365a(C4364f c4364f) {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Double mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Double.valueOf(c4387a.mo8046W());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            if (number == null) {
                c4390c.mo8031P();
                return;
            }
            C4364f.m27802d(number.doubleValue());
            c4390c.mo8026q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$b */
    /* loaded from: classes.dex */
    public class C4366b extends AbstractC4385s<Number> {
        C4366b(C4364f c4364f) {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Float mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Float.valueOf((float) c4387a.mo8046W());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            if (number == null) {
                c4390c.mo8031P();
                return;
            }
            C4364f.m27802d(number.floatValue());
            c4390c.mo8026q0(number);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$c */
    /* loaded from: classes.dex */
    public class C4367c extends AbstractC4385s<Number> {
        C4367c() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Number mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            return Long.valueOf(c4387a.mo8043a0());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Number number) throws IOException {
            if (number == null) {
                c4390c.mo8031P();
            } else {
                c4390c.mo8025t0(number.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$d */
    /* loaded from: classes.dex */
    public class C4368d extends AbstractC4385s<AtomicLong> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4385s f11834a;

        C4368d(AbstractC4385s abstractC4385s) {
            this.f11834a = abstractC4385s;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AtomicLong mo27782e(C4387a c4387a) throws IOException {
            return new AtomicLong(((Number) this.f11834a.mo27782e(c4387a)).longValue());
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AtomicLong atomicLong) throws IOException {
            this.f11834a.mo27781f(c4390c, Long.valueOf(atomicLong.get()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$e */
    /* loaded from: classes.dex */
    public class C4369e extends AbstractC4385s<AtomicLongArray> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4385s f11835a;

        C4369e(AbstractC4385s abstractC4385s) {
            this.f11835a = abstractC4385s;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public AtomicLongArray mo27782e(C4387a c4387a) throws IOException {
            ArrayList arrayList = new ArrayList();
            c4387a.mo8044a();
            while (c4387a.mo8055H()) {
                arrayList.add(Long.valueOf(((Number) this.f11835a.mo27782e(c4387a)).longValue()));
            }
            c4387a.mo8037v();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, AtomicLongArray atomicLongArray) throws IOException {
            c4390c.mo8030e();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f11835a.mo27781f(c4390c, Long.valueOf(atomicLongArray.get(i)));
            }
            c4390c.mo8024v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Gson.java */
    /* renamed from: com.google.gson.f$f */
    /* loaded from: classes.dex */
    public static class C4370f<T> extends AbstractC4385s<T> {

        /* renamed from: a */
        private AbstractC4385s<T> f11836a;

        C4370f() {
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: b */
        public T mo27782e(C4387a c4387a) throws IOException {
            AbstractC4385s<T> abstractC4385s = this.f11836a;
            if (abstractC4385s != null) {
                return abstractC4385s.mo27782e(c4387a);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: d */
        public void mo27781f(C4390c c4390c, T t) throws IOException {
            AbstractC4385s<T> abstractC4385s = this.f11836a;
            if (abstractC4385s != null) {
                abstractC4385s.mo27781f(c4390c, t);
                return;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public void m27772e(AbstractC4385s<T> abstractC4385s) {
            if (this.f11836a == null) {
                this.f11836a = abstractC4385s;
                return;
            }
            throw new AssertionError();
        }
    }

    public C4364f() {
        this(C10119d.f26399C, EnumC4356d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, EnumC4382r.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    private static void m27805a(Object obj, C4387a c4387a) {
        if (obj != null) {
            try {
                if (c4387a.mo8038o0() == EnumC4389b.END_DOCUMENT) {
                    return;
                }
                throw new JsonIOException("JSON document was not fully consumed.");
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    /* renamed from: b */
    private static AbstractC4385s<AtomicLong> m27804b(AbstractC4385s<Number> abstractC4385s) {
        return new C4368d(abstractC4385s).m27742a();
    }

    /* renamed from: c */
    private static AbstractC4385s<AtomicLongArray> m27803c(AbstractC4385s<Number> abstractC4385s) {
        return new C4369e(abstractC4385s).m27742a();
    }

    /* renamed from: d */
    static void m27802d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: e */
    private AbstractC4385s<Number> m27801e(boolean z) {
        if (z) {
            return C10432n.f27154v;
        }
        return new C4365a(this);
    }

    /* renamed from: f */
    private AbstractC4385s<Number> m27800f(boolean z) {
        if (z) {
            return C10432n.f27153u;
        }
        return new C4366b(this);
    }

    /* renamed from: n */
    private static AbstractC4385s<Number> m27792n(EnumC4382r enumC4382r) {
        if (enumC4382r == EnumC4382r.DEFAULT) {
            return C10432n.f27152t;
        }
        return new C4367c();
    }

    /* renamed from: g */
    public <T> T m27799g(C4387a c4387a, Type type) throws JsonIOException, JsonSyntaxException {
        boolean m27733L = c4387a.m27733L();
        boolean z = true;
        c4387a.m27740A0(true);
        try {
            try {
                try {
                    c4387a.mo8038o0();
                    z = false;
                    T mo27782e = m27794l(C11605a.m4630b(type)).mo27782e(c4387a);
                    c4387a.m27740A0(m27733L);
                    return mo27782e;
                } catch (EOFException e) {
                    if (z) {
                        c4387a.m27740A0(m27733L);
                        return null;
                    }
                    throw new JsonSyntaxException(e);
                } catch (IOException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            } catch (IllegalStateException e4) {
                throw new JsonSyntaxException(e4);
            }
        } catch (Throwable th2) {
            c4387a.m27740A0(m27733L);
            throw th2;
        }
    }

    /* renamed from: h */
    public <T> T m27798h(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C4387a m27791o = m27791o(reader);
        T t = (T) m27799g(m27791o, type);
        m27805a(t, m27791o);
        return t;
    }

    /* renamed from: i */
    public <T> T m27797i(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) C10134k.m9078b(cls).cast(m27796j(str, cls));
    }

    /* renamed from: j */
    public <T> T m27796j(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) m27798h(new StringReader(str), type);
    }

    /* renamed from: k */
    public <T> AbstractC4385s<T> m27795k(Class<T> cls) {
        return m27794l(C11605a.m4631a(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public <T> AbstractC4385s<T> m27794l(C11605a<T> c11605a) {
        AbstractC4385s<T> abstractC4385s = (AbstractC4385s<T>) this.f11822b.get(c11605a == null ? f11820n : c11605a);
        if (abstractC4385s != null) {
            return abstractC4385s;
        }
        Map<C11605a<?>, C4370f<?>> map = this.f11821a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f11821a.set(map);
            z = true;
        }
        C4370f<?> c4370f = map.get(c11605a);
        if (c4370f != null) {
            return c4370f;
        }
        try {
            C4370f<?> c4370f2 = new C4370f<>();
            map.put(c11605a, c4370f2);
            for (InterfaceC4391t interfaceC4391t : this.f11825e) {
                AbstractC4385s abstractC4385s2 = (AbstractC4385s<T>) interfaceC4391t.mo7935a(this, c11605a);
                if (abstractC4385s2 != null) {
                    c4370f2.m27772e(abstractC4385s2);
                    this.f11822b.put(c11605a, abstractC4385s2);
                    return abstractC4385s2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c11605a);
        } finally {
            map.remove(c11605a);
            if (z) {
                this.f11821a.remove();
            }
        }
    }

    /* renamed from: m */
    public <T> AbstractC4385s<T> m27793m(InterfaceC4391t interfaceC4391t, C11605a<T> c11605a) {
        if (!this.f11825e.contains(interfaceC4391t)) {
            interfaceC4391t = this.f11824d;
        }
        boolean z = false;
        for (InterfaceC4391t interfaceC4391t2 : this.f11825e) {
            if (z) {
                AbstractC4385s<T> mo7935a = interfaceC4391t2.mo7935a(this, c11605a);
                if (mo7935a != null) {
                    return mo7935a;
                }
            } else if (interfaceC4391t2 == interfaceC4391t) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c11605a);
    }

    /* renamed from: o */
    public C4387a m27791o(Reader reader) {
        C4387a c4387a = new C4387a(reader);
        c4387a.m27740A0(this.f11831k);
        return c4387a;
    }

    /* renamed from: p */
    public C4390c m27790p(Writer writer) throws IOException {
        if (this.f11828h) {
            writer.write(")]}'\n");
        }
        C4390c c4390c = new C4390c(writer);
        if (this.f11830j) {
            c4390c.m27709d0("  ");
        }
        c4390c.m27707f0(this.f11827g);
        return c4390c;
    }

    /* renamed from: q */
    public String m27789q(AbstractC4376l abstractC4376l) {
        StringWriter stringWriter = new StringWriter();
        m27785u(abstractC4376l, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: r */
    public String m27788r(Object obj) {
        if (obj == null) {
            return m27789q(C4377m.f11854a);
        }
        return m27787s(obj, obj.getClass());
    }

    /* renamed from: s */
    public String m27787s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        m27783w(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: t */
    public void m27786t(AbstractC4376l abstractC4376l, C4390c c4390c) throws JsonIOException {
        boolean m27718H = c4390c.m27718H();
        c4390c.m27708e0(true);
        boolean m27719F = c4390c.m27719F();
        c4390c.m27711b0(this.f11829i);
        boolean m27720E = c4390c.m27720E();
        c4390c.m27707f0(this.f11827g);
        try {
            try {
                C10135l.m9076b(abstractC4376l, c4390c);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c4390c.m27708e0(m27718H);
            c4390c.m27711b0(m27719F);
            c4390c.m27707f0(m27720E);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f11827g + ",factories:" + this.f11825e + ",instanceCreators:" + this.f11823c + "}";
    }

    /* renamed from: u */
    public void m27785u(AbstractC4376l abstractC4376l, Appendable appendable) throws JsonIOException {
        try {
            m27786t(abstractC4376l, m27790p(C10135l.m9075c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* renamed from: v */
    public void m27784v(Object obj, Type type, C4390c c4390c) throws JsonIOException {
        AbstractC4385s m27794l = m27794l(C11605a.m4630b(type));
        boolean m27718H = c4390c.m27718H();
        c4390c.m27708e0(true);
        boolean m27719F = c4390c.m27719F();
        c4390c.m27711b0(this.f11829i);
        boolean m27720E = c4390c.m27720E();
        c4390c.m27707f0(this.f11827g);
        try {
            try {
                m27794l.mo27781f(c4390c, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            c4390c.m27708e0(m27718H);
            c4390c.m27711b0(m27719F);
            c4390c.m27707f0(m27720E);
        }
    }

    /* renamed from: w */
    public void m27783w(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            m27784v(obj, type, m27790p(C10135l.m9075c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4364f(C10119d c10119d, InterfaceC4363e interfaceC4363e, Map<Type, InterfaceC4372h<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC4382r enumC4382r, String str, int i, int i2, List<InterfaceC4391t> list, List<InterfaceC4391t> list2, List<InterfaceC4391t> list3) {
        this.f11821a = new ThreadLocal<>();
        this.f11822b = new ConcurrentHashMap();
        this.f11826f = map;
        C10104c c10104c = new C10104c(map);
        this.f11823c = c10104c;
        this.f11827g = z;
        this.f11828h = z3;
        this.f11829i = z4;
        this.f11830j = z5;
        this.f11831k = z6;
        this.f11832l = list;
        this.f11833m = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10432n.f27131Y);
        arrayList.add(C10416h.f27069b);
        arrayList.add(c10119d);
        arrayList.addAll(list3);
        arrayList.add(C10432n.f27110D);
        arrayList.add(C10432n.f27145m);
        arrayList.add(C10432n.f27139g);
        arrayList.add(C10432n.f27141i);
        arrayList.add(C10432n.f27143k);
        AbstractC4385s<Number> m27792n = m27792n(enumC4382r);
        arrayList.add(C10432n.m8001b(Long.TYPE, Long.class, m27792n));
        arrayList.add(C10432n.m8001b(Double.TYPE, Double.class, m27801e(z7)));
        arrayList.add(C10432n.m8001b(Float.TYPE, Float.class, m27800f(z7)));
        arrayList.add(C10432n.f27156x);
        arrayList.add(C10432n.f27147o);
        arrayList.add(C10432n.f27149q);
        arrayList.add(C10432n.m8002a(AtomicLong.class, m27804b(m27792n)));
        arrayList.add(C10432n.m8002a(AtomicLongArray.class, m27803c(m27792n)));
        arrayList.add(C10432n.f27151s);
        arrayList.add(C10432n.f27158z);
        arrayList.add(C10432n.f27112F);
        arrayList.add(C10432n.f27114H);
        arrayList.add(C10432n.m8002a(BigDecimal.class, C10432n.f27108B));
        arrayList.add(C10432n.m8002a(BigInteger.class, C10432n.f27109C));
        arrayList.add(C10432n.f27116J);
        arrayList.add(C10432n.f27118L);
        arrayList.add(C10432n.f27122P);
        arrayList.add(C10432n.f27124R);
        arrayList.add(C10432n.f27129W);
        arrayList.add(C10432n.f27120N);
        arrayList.add(C10432n.f27136d);
        arrayList.add(C10407c.f27050b);
        arrayList.add(C10432n.f27127U);
        arrayList.add(C10425k.f27090b);
        arrayList.add(C10423j.f27088b);
        arrayList.add(C10432n.f27125S);
        arrayList.add(C10403a.f27044c);
        arrayList.add(C10432n.f27134b);
        arrayList.add(new C10405b(c10104c));
        arrayList.add(new C10414g(c10104c, z2));
        C10409d c10409d = new C10409d(c10104c);
        this.f11824d = c10409d;
        arrayList.add(c10409d);
        arrayList.add(C10432n.f27132Z);
        arrayList.add(new C10419i(c10104c, interfaceC4363e, c10119d, c10409d));
        this.f11825e = Collections.unmodifiableList(arrayList);
    }
}
