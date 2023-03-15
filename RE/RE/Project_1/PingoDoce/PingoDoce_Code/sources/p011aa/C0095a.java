package p011aa;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aa.a */
/* loaded from: classes.dex */
public final class C0095a {

    /* renamed from: a */
    private final String f197a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f198b;

    /* compiled from: FieldDescriptor.java */
    /* renamed from: aa.a$b */
    /* loaded from: classes.dex */
    public static final class C0097b {

        /* renamed from: a */
        private final String f199a;

        /* renamed from: b */
        private Map<Class<?>, Object> f200b = null;

        C0097b(String str) {
            this.f199a = str;
        }

        /* renamed from: a */
        public C0095a m41959a() {
            Map unmodifiableMap;
            String str = this.f199a;
            if (this.f200b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f200b));
            }
            return new C0095a(str, unmodifiableMap);
        }

        /* renamed from: b */
        public <T extends Annotation> C0097b m41958b(T t) {
            if (this.f200b == null) {
                this.f200b = new HashMap();
            }
            this.f200b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C0097b m41963a(String str) {
        return new C0097b(str);
    }

    /* renamed from: d */
    public static C0095a m41960d(String str) {
        return new C0095a(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m41962b() {
        return this.f197a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m41961c(Class<T> cls) {
        return (T) this.f198b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0095a) {
            C0095a c0095a = (C0095a) obj;
            return this.f197a.equals(c0095a.f197a) && this.f198b.equals(c0095a.f198b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f197a.hashCode() * 31) + this.f198b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f197a + ", properties=" + this.f198b.values() + "}";
    }

    private C0095a(String str, Map<Class<?>, Object> map) {
        this.f197a = str;
        this.f198b = map;
    }
}
