package p421wa;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import sa.C10099a;
import sa.C10100b;

/* renamed from: wa.a */
/* loaded from: classes2.dex */
public class C11605a<T> {

    /* renamed from: a */
    final Class<? super T> f29675a;

    /* renamed from: b */
    final Type f29676b;

    /* renamed from: c */
    final int f29677c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C11605a() {
        Type m4628d = m4628d(getClass());
        this.f29676b = m4628d;
        this.f29675a = (Class<? super T>) C10100b.m9132k(m4628d);
        this.f29677c = m4628d.hashCode();
    }

    /* renamed from: a */
    public static <T> C11605a<T> m4631a(Class<T> cls) {
        return new C11605a<>(cls);
    }

    /* renamed from: b */
    public static C11605a<?> m4630b(Type type) {
        return new C11605a<>(type);
    }

    /* renamed from: d */
    static Type m4628d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C10100b.m9141b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: c */
    public final Class<? super T> m4629c() {
        return this.f29675a;
    }

    /* renamed from: e */
    public final Type m4627e() {
        return this.f29676b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11605a) && C10100b.m9137f(this.f29676b, ((C11605a) obj).f29676b);
    }

    public final int hashCode() {
        return this.f29677c;
    }

    public final String toString() {
        return C10100b.m9122u(this.f29676b);
    }

    C11605a(Type type) {
        Type m9141b = C10100b.m9141b((Type) C10099a.m9143b(type));
        this.f29676b = m9141b;
        this.f29675a = (Class<? super T>) C10100b.m9132k(m9141b);
        this.f29677c = m9141b.hashCode();
    }
}
