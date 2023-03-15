package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.annotation.Nullable;
import p313qc.C9712b;

/* renamed from: com.squareup.moshi.c */
/* loaded from: classes2.dex */
final class C4462c<T> extends AbstractC4470f<T> {

    /* renamed from: d */
    public static final AbstractC4470f.InterfaceC4474d f12061d = new C4463a();

    /* renamed from: a */
    private final AbstractC4457b<T> f12062a;

    /* renamed from: b */
    private final C4464b<?>[] f12063b;

    /* renamed from: c */
    private final AbstractC4476h.C4477a f12064c;

    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$a */
    /* loaded from: classes2.dex */
    class C4463a implements AbstractC4470f.InterfaceC4474d {
        C4463a() {
        }

        /* renamed from: b */
        private void m27488b(C4496p c4496p, Type type, Map<String, C4464b<?>> map) {
            Field[] declaredFields;
            InterfaceC4469e interfaceC4469e;
            C4464b<?> c4464b;
            C4464b<?> put;
            Class<?> m27330g = C4516s.m27330g(type);
            boolean m10134i = C9712b.m10134i(m27330g);
            for (Field field : m27330g.getDeclaredFields()) {
                if (m27487c(m10134i, field.getModifiers()) && ((interfaceC4469e = (InterfaceC4469e) field.getAnnotation(InterfaceC4469e.class)) == null || !interfaceC4469e.ignore())) {
                    Type m10127p = C9712b.m10127p(type, m27330g, field.getGenericType());
                    Set<? extends Annotation> m10133j = C9712b.m10133j(field);
                    String name = field.getName();
                    AbstractC4470f<T> m27366f = c4496p.m27366f(m10127p, m10133j, name);
                    field.setAccessible(true);
                    String m10131l = C9712b.m10131l(name, interfaceC4469e);
                    if (map.put(m10131l, new C4464b<>(m10131l, field, m27366f)) != null) {
                        throw new IllegalArgumentException("Conflicting fields:\n    " + put.f12066b + "\n    " + c4464b.f12066b);
                    }
                }
            }
        }

        /* renamed from: c */
        private boolean m27487c(boolean z, int i) {
            if (Modifier.isStatic(i) || Modifier.isTransient(i)) {
                return false;
            }
            return Modifier.isPublic(i) || Modifier.isProtected(i) || !z;
        }

        /* renamed from: d */
        private void m27486d(Type type, Class<?> cls) {
            Class<?> m27330g = C4516s.m27330g(type);
            if (cls.isAssignableFrom(m27330g)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + m27330g.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }

        @Override // com.squareup.moshi.AbstractC4470f.InterfaceC4474d
        @Nullable
        /* renamed from: a */
        public AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p) {
            if ((type instanceof Class) || (type instanceof ParameterizedType)) {
                Class<?> m27330g = C4516s.m27330g(type);
                if (m27330g.isInterface() || m27330g.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (C9712b.m10134i(m27330g)) {
                    m27486d(type, List.class);
                    m27486d(type, Set.class);
                    m27486d(type, Map.class);
                    m27486d(type, Collection.class);
                    String str = "Platform " + m27330g;
                    if (type instanceof ParameterizedType) {
                        str = str + " in " + type;
                    }
                    throw new IllegalArgumentException(str + " requires explicit JsonAdapter to be registered");
                } else if (!m27330g.isAnonymousClass()) {
                    if (!m27330g.isLocalClass()) {
                        if (m27330g.getEnclosingClass() != null && !Modifier.isStatic(m27330g.getModifiers())) {
                            throw new IllegalArgumentException("Cannot serialize non-static nested class " + m27330g.getName());
                        } else if (!Modifier.isAbstract(m27330g.getModifiers())) {
                            if (!C9712b.m10135h(m27330g)) {
                                AbstractC4457b m27490a = AbstractC4457b.m27490a(m27330g);
                                TreeMap treeMap = new TreeMap();
                                while (type != Object.class) {
                                    m27488b(c4496p, type, treeMap);
                                    type = C4516s.m27331f(type);
                                }
                                return (AbstractC4470f<T>) new C4462c(m27490a, treeMap).m27474f();
                            }
                            throw new IllegalArgumentException("Cannot serialize Kotlin type " + m27330g.getName() + ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        } else {
                            throw new IllegalArgumentException("Cannot serialize abstract class " + m27330g.getName());
                        }
                    }
                    throw new IllegalArgumentException("Cannot serialize local class " + m27330g.getName());
                } else {
                    throw new IllegalArgumentException("Cannot serialize anonymous class " + m27330g.getName());
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassJsonAdapter.java */
    /* renamed from: com.squareup.moshi.c$b */
    /* loaded from: classes2.dex */
    public static class C4464b<T> {

        /* renamed from: a */
        final String f12065a;

        /* renamed from: b */
        final Field f12066b;

        /* renamed from: c */
        final AbstractC4470f<T> f12067c;

        C4464b(String str, Field field, AbstractC4470f<T> abstractC4470f) {
            this.f12065a = str;
            this.f12066b = field;
            this.f12067c = abstractC4470f;
        }

        /* renamed from: a */
        void m27485a(AbstractC4476h abstractC4476h, Object obj) throws IOException, IllegalAccessException {
            this.f12066b.set(obj, this.f12067c.mo10144b(abstractC4476h));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        void m27484b(AbstractC4483m abstractC4483m, Object obj) throws IllegalAccessException, IOException {
            this.f12067c.mo10143i(abstractC4483m, this.f12066b.get(obj));
        }
    }

    C4462c(AbstractC4457b<T> abstractC4457b, Map<String, C4464b<?>> map) {
        this.f12062a = abstractC4457b;
        this.f12063b = (C4464b[]) map.values().toArray(new C4464b[map.size()]);
        this.f12064c = AbstractC4476h.C4477a.m27461a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: b */
    public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
        try {
            T mo27489b = this.f12062a.mo27489b();
            try {
                abstractC4476h.mo27437c();
                while (abstractC4476h.mo27427y()) {
                    int mo27436d0 = abstractC4476h.mo27436d0(this.f12064c);
                    if (mo27436d0 == -1) {
                        abstractC4476h.mo27432l0();
                        abstractC4476h.mo27431o0();
                    } else {
                        this.f12063b[mo27436d0].m27485a(abstractC4476h, mo27489b);
                    }
                }
                abstractC4476h.mo27433h();
                return mo27489b;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw C9712b.m10124s(e2);
        }
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: i */
    public void mo10143i(AbstractC4483m abstractC4483m, T t) throws IOException {
        C4464b<?>[] c4464bArr;
        try {
            abstractC4483m.mo27406c();
            for (C4464b<?> c4464b : this.f12063b) {
                abstractC4483m.mo27417F(c4464b.f12065a);
                c4464b.m27484b(abstractC4483m, t);
            }
            abstractC4483m.mo27399t();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "JsonAdapter(" + this.f12062a + ")";
    }
}
