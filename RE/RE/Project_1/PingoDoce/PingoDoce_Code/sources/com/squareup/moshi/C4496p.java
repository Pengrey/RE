package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p313qc.C9712b;

/* renamed from: com.squareup.moshi.p */
/* loaded from: classes2.dex */
public final class C4496p {

    /* renamed from: d */
    static final List<AbstractC4470f.InterfaceC4474d> f12139d;

    /* renamed from: a */
    private final List<AbstractC4470f.InterfaceC4474d> f12140a;

    /* renamed from: b */
    private final ThreadLocal<C4499c> f12141b = new ThreadLocal<>();

    /* renamed from: c */
    private final Map<Object, AbstractC4470f<?>> f12142c = new LinkedHashMap();

    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.p$a */
    /* loaded from: classes2.dex */
    public static final class C4497a {

        /* renamed from: a */
        final List<AbstractC4470f.InterfaceC4474d> f12143a = new ArrayList();

        /* renamed from: b */
        int f12144b = 0;

        @CheckReturnValue
        /* renamed from: a */
        public C4496p m27364a() {
            return new C4496p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.p$b */
    /* loaded from: classes2.dex */
    public static final class C4498b<T> extends AbstractC4470f<T> {

        /* renamed from: a */
        final Type f12145a;
        @Nullable

        /* renamed from: b */
        final String f12146b;

        /* renamed from: c */
        final Object f12147c;
        @Nullable

        /* renamed from: d */
        AbstractC4470f<T> f12148d;

        C4498b(Type type, @Nullable String str, Object obj) {
            this.f12145a = type;
            this.f12146b = str;
            this.f12147c = obj;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: b */
        public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            AbstractC4470f<T> abstractC4470f = this.f12148d;
            if (abstractC4470f != null) {
                return abstractC4470f.mo10144b(abstractC4476h);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public void mo10143i(AbstractC4483m abstractC4483m, T t) throws IOException {
            AbstractC4470f<T> abstractC4470f = this.f12148d;
            if (abstractC4470f != null) {
                abstractC4470f.mo10143i(abstractC4483m, t);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            AbstractC4470f<T> abstractC4470f = this.f12148d;
            return abstractC4470f != null ? abstractC4470f.toString() : super.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Moshi.java */
    /* renamed from: com.squareup.moshi.p$c */
    /* loaded from: classes2.dex */
    public final class C4499c {

        /* renamed from: a */
        final List<C4498b<?>> f12149a = new ArrayList();

        /* renamed from: b */
        final Deque<C4498b<?>> f12150b = new ArrayDeque();

        /* renamed from: c */
        boolean f12151c;

        C4499c() {
        }

        /* renamed from: a */
        <T> void m27363a(AbstractC4470f<T> abstractC4470f) {
            this.f12150b.getLast().f12148d = abstractC4470f;
        }

        /* renamed from: b */
        IllegalArgumentException m27362b(IllegalArgumentException illegalArgumentException) {
            if (this.f12151c) {
                return illegalArgumentException;
            }
            this.f12151c = true;
            if (this.f12150b.size() == 1 && this.f12150b.getFirst().f12146b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C4498b<?>> descendingIterator = this.f12150b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C4498b<?> next = descendingIterator.next();
                sb2.append("\nfor ");
                sb2.append(next.f12145a);
                if (next.f12146b != null) {
                    sb2.append(' ');
                    sb2.append(next.f12146b);
                }
            }
            return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }

        /* renamed from: c */
        void m27361c(boolean z) {
            this.f12150b.removeLast();
            if (this.f12150b.isEmpty()) {
                C4496p.this.f12141b.remove();
                if (z) {
                    synchronized (C4496p.this.f12142c) {
                        int size = this.f12149a.size();
                        for (int i = 0; i < size; i++) {
                            C4498b<?> c4498b = this.f12149a.get(i);
                            AbstractC4470f<T> abstractC4470f = (AbstractC4470f) C4496p.this.f12142c.put(c4498b.f12147c, c4498b.f12148d);
                            if (abstractC4470f != 0) {
                                c4498b.f12148d = abstractC4470f;
                                C4496p.this.f12142c.put(c4498b.f12147c, abstractC4470f);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: d */
        <T> AbstractC4470f<T> m27360d(Type type, @Nullable String str, Object obj) {
            int size = this.f12149a.size();
            for (int i = 0; i < size; i++) {
                C4498b<?> c4498b = this.f12149a.get(i);
                if (c4498b.f12147c.equals(obj)) {
                    this.f12150b.add(c4498b);
                    AbstractC4470f<T> abstractC4470f = (AbstractC4470f<T>) c4498b.f12148d;
                    return abstractC4470f != null ? abstractC4470f : c4498b;
                }
            }
            C4498b<?> c4498b2 = new C4498b<>(type, str, obj);
            this.f12149a.add(c4498b2);
            this.f12150b.add(c4498b2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f12139d = arrayList;
        arrayList.add(C4502r.f12154a);
        arrayList.add(AbstractC4465d.f12068b);
        arrayList.add(C4494o.f12136c);
        arrayList.add(C4455a.f12048c);
        arrayList.add(C4500q.f12153a);
        arrayList.add(C4462c.f12061d);
    }

    C4496p(C4497a c4497a) {
        int size = c4497a.f12143a.size();
        List<AbstractC4470f.InterfaceC4474d> list = f12139d;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(c4497a.f12143a);
        arrayList.addAll(list);
        this.f12140a = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private Object m27365g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(type, set);
    }

    @CheckReturnValue
    /* renamed from: c */
    public <T> AbstractC4470f<T> m27369c(Class<T> cls) {
        return m27367e(cls, C9712b.f25568a);
    }

    @CheckReturnValue
    /* renamed from: d */
    public <T> AbstractC4470f<T> m27368d(Type type) {
        return m27367e(type, C9712b.f25568a);
    }

    @CheckReturnValue
    /* renamed from: e */
    public <T> AbstractC4470f<T> m27367e(Type type, Set<? extends Annotation> set) {
        return m27366f(type, set, null);
    }

    @CheckReturnValue
    /* renamed from: f */
    public <T> AbstractC4470f<T> m27366f(Type type, Set<? extends Annotation> set, @Nullable String str) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(set, "annotations == null");
        Type m10128o = C9712b.m10128o(C9712b.m10142a(type));
        Object m27365g = m27365g(m10128o, set);
        synchronized (this.f12142c) {
            AbstractC4470f<T> abstractC4470f = (AbstractC4470f<T>) this.f12142c.get(m27365g);
            if (abstractC4470f != null) {
                return abstractC4470f;
            }
            C4499c c4499c = this.f12141b.get();
            if (c4499c == null) {
                c4499c = new C4499c();
                this.f12141b.set(c4499c);
            }
            AbstractC4470f<T> m27360d = c4499c.m27360d(m10128o, str, m27365g);
            try {
                if (m27360d != null) {
                    return m27360d;
                }
                try {
                    int size = this.f12140a.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC4470f<T> abstractC4470f2 = (AbstractC4470f<T>) this.f12140a.get(i).mo27356a(m10128o, set, this);
                        if (abstractC4470f2 != null) {
                            c4499c.m27363a(abstractC4470f2);
                            c4499c.m27361c(true);
                            return abstractC4470f2;
                        }
                    }
                    throw new IllegalArgumentException("No JsonAdapter for " + C9712b.m10123t(m10128o, set));
                } catch (IllegalArgumentException e) {
                    throw c4499c.m27362b(e);
                }
            } finally {
                c4499c.m27361c(false);
            }
        }
    }
}
