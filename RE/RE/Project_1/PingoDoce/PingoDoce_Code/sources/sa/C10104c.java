package sa;

import com.google.gson.InterfaceC4372h;
import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p421wa.C11605a;
import va.AbstractC11172b;

/* renamed from: sa.c */
/* loaded from: classes2.dex */
public final class C10104c {

    /* renamed from: a */
    private final Map<Type, InterfaceC4372h<?>> f26388a;

    /* renamed from: b */
    private final AbstractC11172b f26389b = AbstractC11172b.m5829a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$a */
    /* loaded from: classes2.dex */
    public class C10105a implements InterfaceC10132i<T> {
        C10105a(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$b */
    /* loaded from: classes2.dex */
    public class C10106b implements InterfaceC10132i<T> {
        C10106b(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$c */
    /* loaded from: classes2.dex */
    public class C10107c implements InterfaceC10132i<T> {
        C10107c(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$d */
    /* loaded from: classes2.dex */
    public class C10108d implements InterfaceC10132i<T> {
        C10108d(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, sa.h] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new C10124h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$e */
    /* loaded from: classes2.dex */
    public class C10109e implements InterfaceC10132i<T> {

        /* renamed from: a */
        private final AbstractC10138m f26390a = AbstractC10138m.m9073b();

        /* renamed from: b */
        final /* synthetic */ Class f26391b;

        /* renamed from: c */
        final /* synthetic */ Type f26392c;

        C10109e(C10104c c10104c, Class cls, Type type) {
            this.f26391b = cls;
            this.f26392c = type;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            try {
                return this.f26390a.mo9072c(this.f26391b);
            } catch (Exception e) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f26392c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e);
            }
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$f */
    /* loaded from: classes2.dex */
    class C10110f implements InterfaceC10132i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4372h f26393a;

        /* renamed from: b */
        final /* synthetic */ Type f26394b;

        C10110f(C10104c c10104c, InterfaceC4372h interfaceC4372h, Type type) {
            this.f26393a = interfaceC4372h;
            this.f26394b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return this.f26393a.m27768a(this.f26394b);
        }
    }

    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$g */
    /* loaded from: classes2.dex */
    class C10111g implements InterfaceC10132i<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC4372h f26395a;

        /* renamed from: b */
        final /* synthetic */ Type f26396b;

        C10111g(C10104c c10104c, InterfaceC4372h interfaceC4372h, Type type) {
            this.f26395a = interfaceC4372h;
            this.f26396b = type;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return this.f26395a.m27768a(this.f26396b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$h */
    /* loaded from: classes2.dex */
    public class C10112h implements InterfaceC10132i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f26397a;

        C10112h(C10104c c10104c, Constructor constructor) {
            this.f26397a = constructor;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            try {
                return this.f26397a.newInstance(null);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke " + this.f26397a + " with no args", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to invoke " + this.f26397a + " with no args", e3.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$i */
    /* loaded from: classes2.dex */
    public class C10113i implements InterfaceC10132i<T> {
        C10113i(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$j */
    /* loaded from: classes2.dex */
    public class C10114j implements InterfaceC10132i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f26398a;

        C10114j(C10104c c10104c, Type type) {
            this.f26398a = type;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.util.EnumSet] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            Type type = this.f26398a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new JsonIOException("Invalid EnumSet type: " + this.f26398a.toString());
            }
            throw new JsonIOException("Invalid EnumSet type: " + this.f26398a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$k */
    /* loaded from: classes2.dex */
    public class C10115k implements InterfaceC10132i<T> {
        C10115k(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$l */
    /* loaded from: classes2.dex */
    public class C10116l implements InterfaceC10132i<T> {
        C10116l(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$m */
    /* loaded from: classes2.dex */
    public class C10117m implements InterfaceC10132i<T> {
        C10117m(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstructorConstructor.java */
    /* renamed from: sa.c$n */
    /* loaded from: classes2.dex */
    public class C10118n implements InterfaceC10132i<T> {
        C10118n(C10104c c10104c) {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
        @Override // sa.InterfaceC10132i
        /* renamed from: a */
        public T mo9083a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C10104c(Map<Type, InterfaceC4372h<?>> map) {
        this.f26388a = map;
    }

    /* renamed from: b */
    private <T> InterfaceC10132i<T> m9120b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f26389b.mo5828b(declaredConstructor);
            }
            return new C10112h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> InterfaceC10132i<T> m9119c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C10113i(this);
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C10114j(this, type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C10115k(this);
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C10116l(this);
            }
            return new C10117m(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C10118n(this);
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C10105a(this);
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C10106b(this);
            }
            if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(C11605a.m4630b(((ParameterizedType) type).getActualTypeArguments()[0]).m4629c())) {
                return new C10107c(this);
            }
            return new C10108d(this);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private <T> InterfaceC10132i<T> m9118d(Type type, Class<? super T> cls) {
        return new C10109e(this, cls, type);
    }

    /* renamed from: a */
    public <T> InterfaceC10132i<T> m9121a(C11605a<T> c11605a) {
        Type m4627e = c11605a.m4627e();
        Class<? super T> m4629c = c11605a.m4629c();
        InterfaceC4372h<?> interfaceC4372h = this.f26388a.get(m4627e);
        if (interfaceC4372h != null) {
            return new C10110f(this, interfaceC4372h, m4627e);
        }
        InterfaceC4372h<?> interfaceC4372h2 = this.f26388a.get(m4629c);
        if (interfaceC4372h2 != null) {
            return new C10111g(this, interfaceC4372h2, m4627e);
        }
        InterfaceC10132i<T> m9120b = m9120b(m4629c);
        if (m9120b != null) {
            return m9120b;
        }
        InterfaceC10132i<T> m9119c = m9119c(m4627e, m4629c);
        return m9119c != null ? m9119c : m9118d(m4627e, m4629c);
    }

    public String toString() {
        return this.f26388a.toString();
    }
}
