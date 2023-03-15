package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.d */
/* loaded from: classes2.dex */
abstract class AbstractC4465d<C extends Collection<T>, T> extends AbstractC4470f<C> {

    /* renamed from: b */
    public static final AbstractC4470f.InterfaceC4474d f12068b = new C4466a();

    /* renamed from: a */
    private final AbstractC4470f<T> f12069a;

    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$a */
    /* loaded from: classes2.dex */
    class C4466a implements AbstractC4470f.InterfaceC4474d {
        C4466a() {
        }

        @Override // com.squareup.moshi.AbstractC4470f.InterfaceC4474d
        @Nullable
        /* renamed from: a */
        public AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p) {
            Class<?> m27330g = C4516s.m27330g(type);
            if (set.isEmpty()) {
                if (m27330g != List.class && m27330g != Collection.class) {
                    if (m27330g == Set.class) {
                        return AbstractC4465d.m27481n(type, c4496p).m27474f();
                    }
                    return null;
                }
                return AbstractC4465d.m27482l(type, c4496p).m27474f();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$b */
    /* loaded from: classes2.dex */
    public class C4467b extends AbstractC4465d<Collection<T>, T> {
        C4467b(AbstractC4470f abstractC4470f) {
            super(abstractC4470f, null);
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return super.m27483k(abstractC4476h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo10143i(AbstractC4483m abstractC4483m, Object obj) throws IOException {
            super.m27480o(abstractC4483m, (Collection) obj);
        }

        @Override // com.squareup.moshi.AbstractC4465d
        /* renamed from: m */
        Collection<T> mo27479m() {
            return new ArrayList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionJsonAdapter.java */
    /* renamed from: com.squareup.moshi.d$c */
    /* loaded from: classes2.dex */
    public class C4468c extends AbstractC4465d<Set<T>, T> {
        C4468c(AbstractC4470f abstractC4470f) {
            super(abstractC4470f, null);
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: b */
        public /* bridge */ /* synthetic */ Object mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return super.m27483k(abstractC4476h);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public /* bridge */ /* synthetic */ void mo10143i(AbstractC4483m abstractC4483m, Object obj) throws IOException {
            super.m27480o(abstractC4483m, (Collection) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.squareup.moshi.AbstractC4465d
        /* renamed from: p */
        public Set<T> mo27479m() {
            return new LinkedHashSet();
        }
    }

    /* synthetic */ AbstractC4465d(AbstractC4470f abstractC4470f, C4466a c4466a) {
        this(abstractC4470f);
    }

    /* renamed from: l */
    static <T> AbstractC4470f<Collection<T>> m27482l(Type type, C4496p c4496p) {
        return new C4467b(c4496p.m27368d(C4516s.m27334c(type, Collection.class)));
    }

    /* renamed from: n */
    static <T> AbstractC4470f<Set<T>> m27481n(Type type, C4496p c4496p) {
        return new C4468c(c4496p.m27368d(C4516s.m27334c(type, Collection.class)));
    }

    /* renamed from: k */
    public C m27483k(AbstractC4476h abstractC4476h) throws IOException {
        C mo27479m = mo27479m();
        abstractC4476h.mo27439a();
        while (abstractC4476h.mo27427y()) {
            mo27479m.add(this.f12069a.mo10144b(abstractC4476h));
        }
        abstractC4476h.mo27435e();
        return mo27479m;
    }

    /* renamed from: m */
    abstract C mo27479m();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public void m27480o(AbstractC4483m abstractC4483m, C c) throws IOException {
        abstractC4483m.mo27409a();
        for (Object obj : c) {
            this.f12069a.mo10143i(abstractC4483m, obj);
        }
        abstractC4483m.mo27401h();
    }

    public String toString() {
        return this.f12069a + ".collection()";
    }

    private AbstractC4465d(AbstractC4470f<T> abstractC4470f) {
        this.f12069a = abstractC4470f;
    }
}
