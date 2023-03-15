package com.squareup.moshi;

import com.squareup.moshi.AbstractC4470f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.squareup.moshi.a */
/* loaded from: classes2.dex */
final class C4455a extends AbstractC4470f<Object> {

    /* renamed from: c */
    public static final AbstractC4470f.InterfaceC4474d f12048c = new C4456a();

    /* renamed from: a */
    private final Class<?> f12049a;

    /* renamed from: b */
    private final AbstractC4470f<Object> f12050b;

    /* compiled from: ArrayJsonAdapter.java */
    /* renamed from: com.squareup.moshi.a$a */
    /* loaded from: classes2.dex */
    class C4456a implements AbstractC4470f.InterfaceC4474d {
        C4456a() {
        }

        @Override // com.squareup.moshi.AbstractC4470f.InterfaceC4474d
        @Nullable
        /* renamed from: a */
        public AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p) {
            Type m27336a = C4516s.m27336a(type);
            if (m27336a != null && set.isEmpty()) {
                return new C4455a(C4516s.m27330g(m27336a), c4496p.m27368d(m27336a)).m27474f();
            }
            return null;
        }
    }

    C4455a(Class<?> cls, AbstractC4470f<Object> abstractC4470f) {
        this.f12049a = cls;
        this.f12050b = abstractC4470f;
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: b */
    public Object mo10144b(AbstractC4476h abstractC4476h) throws IOException {
        ArrayList arrayList = new ArrayList();
        abstractC4476h.mo27439a();
        while (abstractC4476h.mo27427y()) {
            arrayList.add(this.f12050b.mo10144b(abstractC4476h));
        }
        abstractC4476h.mo27435e();
        Object newInstance = Array.newInstance(this.f12049a, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: i */
    public void mo10143i(AbstractC4483m abstractC4483m, Object obj) throws IOException {
        abstractC4483m.mo27409a();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f12050b.mo10143i(abstractC4483m, Array.get(obj, i));
        }
        abstractC4483m.mo27401h();
    }

    public String toString() {
        return this.f12050b + ".array()";
    }
}
