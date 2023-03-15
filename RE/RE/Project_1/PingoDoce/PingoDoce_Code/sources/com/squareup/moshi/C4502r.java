package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p313qc.C9712b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.moshi.r */
/* loaded from: classes2.dex */
public final class C4502r {

    /* renamed from: a */
    public static final AbstractC4470f.InterfaceC4474d f12154a = new C4505c();

    /* renamed from: b */
    static final AbstractC4470f<Boolean> f12155b = new C4506d();

    /* renamed from: c */
    static final AbstractC4470f<Byte> f12156c = new C4507e();

    /* renamed from: d */
    static final AbstractC4470f<Character> f12157d = new C4508f();

    /* renamed from: e */
    static final AbstractC4470f<Double> f12158e = new C4509g();

    /* renamed from: f */
    static final AbstractC4470f<Float> f12159f = new C4510h();

    /* renamed from: g */
    static final AbstractC4470f<Integer> f12160g = new C4511i();

    /* renamed from: h */
    static final AbstractC4470f<Long> f12161h = new C4512j();

    /* renamed from: i */
    static final AbstractC4470f<Short> f12162i = new C4513k();

    /* renamed from: j */
    static final AbstractC4470f<String> f12163j = new C4503a();

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$a */
    /* loaded from: classes2.dex */
    class C4503a extends AbstractC4470f<String> {
        C4503a() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public String mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return abstractC4476h.mo27441R();
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, String str) throws IOException {
            abstractC4483m.mo27402f0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$b */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C4504b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12164a;

        static {
            int[] iArr = new int[AbstractC4476h.EnumC4478b.values().length];
            f12164a = iArr;
            try {
                iArr[AbstractC4476h.EnumC4478b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12164a[AbstractC4476h.EnumC4478b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12164a[AbstractC4476h.EnumC4478b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12164a[AbstractC4476h.EnumC4478b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12164a[AbstractC4476h.EnumC4478b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12164a[AbstractC4476h.EnumC4478b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$c */
    /* loaded from: classes2.dex */
    class C4505c implements AbstractC4470f.InterfaceC4474d {
        C4505c() {
        }

        @Override // com.squareup.moshi.AbstractC4470f.InterfaceC4474d
        /* renamed from: a */
        public AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p) {
            if (set.isEmpty()) {
                if (type == Boolean.TYPE) {
                    return C4502r.f12155b;
                }
                if (type == Byte.TYPE) {
                    return C4502r.f12156c;
                }
                if (type == Character.TYPE) {
                    return C4502r.f12157d;
                }
                if (type == Double.TYPE) {
                    return C4502r.f12158e;
                }
                if (type == Float.TYPE) {
                    return C4502r.f12159f;
                }
                if (type == Integer.TYPE) {
                    return C4502r.f12160g;
                }
                if (type == Long.TYPE) {
                    return C4502r.f12161h;
                }
                if (type == Short.TYPE) {
                    return C4502r.f12162i;
                }
                if (type == Boolean.class) {
                    return C4502r.f12155b.m27474f();
                }
                if (type == Byte.class) {
                    return C4502r.f12156c.m27474f();
                }
                if (type == Character.class) {
                    return C4502r.f12157d.m27474f();
                }
                if (type == Double.class) {
                    return C4502r.f12158e.m27474f();
                }
                if (type == Float.class) {
                    return C4502r.f12159f.m27474f();
                }
                if (type == Integer.class) {
                    return C4502r.f12160g.m27474f();
                }
                if (type == Long.class) {
                    return C4502r.f12161h.m27474f();
                }
                if (type == Short.class) {
                    return C4502r.f12162i.m27474f();
                }
                if (type == String.class) {
                    return C4502r.f12163j.m27474f();
                }
                if (type == Object.class) {
                    return new C4515m(c4496p).m27474f();
                }
                Class<?> m27330g = C4516s.m27330g(type);
                AbstractC4470f<?> m10139d = C9712b.m10139d(c4496p, type, m27330g);
                if (m10139d != null) {
                    return m10139d;
                }
                if (m27330g.isEnum()) {
                    return new C4514l(m27330g).m27474f();
                }
                return null;
            }
            return null;
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$d */
    /* loaded from: classes2.dex */
    class C4506d extends AbstractC4470f<Boolean> {
        C4506d() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Boolean mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Boolean.valueOf(abstractC4476h.mo27456F());
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Boolean bool) throws IOException {
            abstractC4483m.mo27400j0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$e */
    /* loaded from: classes2.dex */
    class C4507e extends AbstractC4470f<Byte> {
        C4507e() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Byte mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Byte.valueOf((byte) C4502r.m27359a(abstractC4476h, "a byte", -128, 255));
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Byte b) throws IOException {
            abstractC4483m.mo27405d0(b.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$f */
    /* loaded from: classes2.dex */
    class C4508f extends AbstractC4470f<Character> {
        C4508f() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Character mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            String mo27441R = abstractC4476h.mo27441R();
            if (mo27441R.length() <= 1) {
                return Character.valueOf(mo27441R.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + mo27441R + '\"', abstractC4476h.m27462v()));
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Character ch2) throws IOException {
            abstractC4483m.mo27402f0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$g */
    /* loaded from: classes2.dex */
    class C4509g extends AbstractC4470f<Double> {
        C4509g() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Double mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Double.valueOf(abstractC4476h.mo27453H());
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Double d) throws IOException {
            abstractC4483m.mo27407b0(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$h */
    /* loaded from: classes2.dex */
    class C4510h extends AbstractC4470f<Float> {
        C4510h() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Float mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            float mo27453H = (float) abstractC4476h.mo27453H();
            if (!abstractC4476h.m27469E() && Float.isInfinite(mo27453H)) {
                throw new JsonDataException("JSON forbids NaN and infinities: " + mo27453H + " at path " + abstractC4476h.m27462v());
            }
            return Float.valueOf(mo27453H);
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Float f) throws IOException {
            Objects.requireNonNull(f);
            abstractC4483m.mo27403e0(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$i */
    /* loaded from: classes2.dex */
    class C4511i extends AbstractC4470f<Integer> {
        C4511i() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Integer mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Integer.valueOf(abstractC4476h.mo27448L());
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Integer num) throws IOException {
            abstractC4483m.mo27405d0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$j */
    /* loaded from: classes2.dex */
    class C4512j extends AbstractC4470f<Long> {
        C4512j() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Long mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Long.valueOf(abstractC4476h.mo27446M());
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Long l) throws IOException {
            abstractC4483m.mo27405d0(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$k */
    /* loaded from: classes2.dex */
    class C4513k extends AbstractC4470f<Short> {
        C4513k() {
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public Short mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return Short.valueOf((short) C4502r.m27359a(abstractC4476h, "a short", -32768, 32767));
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, Short sh2) throws IOException {
            abstractC4483m.mo27405d0(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$l */
    /* loaded from: classes2.dex */
    static final class C4514l<T extends Enum<T>> extends AbstractC4470f<T> {

        /* renamed from: a */
        private final Class<T> f12165a;

        /* renamed from: b */
        private final String[] f12166b;

        /* renamed from: c */
        private final T[] f12167c;

        /* renamed from: d */
        private final AbstractC4476h.C4477a f12168d;

        C4514l(Class<T> cls) {
            this.f12165a = cls;
            try {
                T[] enumConstants = cls.getEnumConstants();
                this.f12167c = enumConstants;
                this.f12166b = new String[enumConstants.length];
                int i = 0;
                while (true) {
                    T[] tArr = this.f12167c;
                    if (i < tArr.length) {
                        String name = tArr[i].name();
                        this.f12166b[i] = C9712b.m10130m(name, cls.getField(name));
                        i++;
                    } else {
                        this.f12168d = AbstractC4476h.C4477a.m27461a(this.f12166b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: k */
        public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            int mo27434e0 = abstractC4476h.mo27434e0(this.f12168d);
            if (mo27434e0 != -1) {
                return this.f12167c[mo27434e0];
            }
            String m27462v = abstractC4476h.m27462v();
            String mo27441R = abstractC4476h.mo27441R();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f12166b) + " but was " + mo27441R + " at path " + m27462v);
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: l */
        public void mo10143i(AbstractC4483m abstractC4483m, T t) throws IOException {
            abstractC4483m.mo27402f0(this.f12166b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f12165a.getName() + ")";
        }
    }

    /* compiled from: StandardJsonAdapters.java */
    /* renamed from: com.squareup.moshi.r$m */
    /* loaded from: classes2.dex */
    static final class C4515m extends AbstractC4470f<Object> {

        /* renamed from: a */
        private final C4496p f12169a;

        /* renamed from: b */
        private final AbstractC4470f<List> f12170b;

        /* renamed from: c */
        private final AbstractC4470f<Map> f12171c;

        /* renamed from: d */
        private final AbstractC4470f<String> f12172d;

        /* renamed from: e */
        private final AbstractC4470f<Double> f12173e;

        /* renamed from: f */
        private final AbstractC4470f<Boolean> f12174f;

        C4515m(C4496p c4496p) {
            this.f12169a = c4496p;
            this.f12170b = c4496p.m27369c(List.class);
            this.f12171c = c4496p.m27369c(Map.class);
            this.f12172d = c4496p.m27369c(String.class);
            this.f12173e = c4496p.m27369c(Double.class);
            this.f12174f = c4496p.m27369c(Boolean.class);
        }

        /* renamed from: k */
        private Class<?> m27337k(Class<?> cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: b */
        public Object mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            switch (C4504b.f12164a[abstractC4476h.mo27440X().ordinal()]) {
                case 1:
                    return this.f12170b.mo10144b(abstractC4476h);
                case 2:
                    return this.f12171c.mo10144b(abstractC4476h);
                case 3:
                    return this.f12172d.mo10144b(abstractC4476h);
                case 4:
                    return this.f12173e.mo10144b(abstractC4476h);
                case 5:
                    return this.f12174f.mo10144b(abstractC4476h);
                case 6:
                    return abstractC4476h.mo27442P();
                default:
                    throw new IllegalStateException("Expected a value but was " + abstractC4476h.mo27440X() + " at path " + abstractC4476h.m27462v());
            }
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public void mo10143i(AbstractC4483m abstractC4483m, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                abstractC4483m.mo27406c();
                abstractC4483m.mo27399t();
                return;
            }
            this.f12169a.m27367e(m27337k(cls), C9712b.f25568a).mo10143i(abstractC4483m, obj);
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m27359a(AbstractC4476h abstractC4476h, String str, int i, int i2) throws IOException {
        int mo27448L = abstractC4476h.mo27448L();
        if (mo27448L < i || mo27448L > i2) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(mo27448L), abstractC4476h.m27462v()));
        }
        return mo27448L;
    }
}
