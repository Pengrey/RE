package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4391t;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p421wa.C11605a;
import sa.C10100b;

/* renamed from: ta.a */
/* loaded from: classes2.dex */
public final class C10403a<E> extends AbstractC4385s<Object> {

    /* renamed from: c */
    public static final InterfaceC4391t f27044c = new C10404a();

    /* renamed from: a */
    private final Class<E> f27045a;

    /* renamed from: b */
    private final AbstractC4385s<E> f27046b;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: ta.a$a */
    /* loaded from: classes2.dex */
    class C10404a implements InterfaceC4391t {
        C10404a() {
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            Type m4627e = c11605a.m4627e();
            if ((m4627e instanceof GenericArrayType) || ((m4627e instanceof Class) && ((Class) m4627e).isArray())) {
                Type m9136g = C10100b.m9136g(m4627e);
                return new C10403a(c4364f, c4364f.m27794l(C11605a.m4630b(m9136g)), C10100b.m9132k(m9136g));
            }
            return null;
        }
    }

    public C10403a(C4364f c4364f, AbstractC4385s<E> abstractC4385s, Class<E> cls) {
        this.f27046b = new C10431m(c4364f, abstractC4385s, cls);
        this.f27045a = cls;
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: b */
    public Object mo27782e(C4387a c4387a) throws IOException {
        if (c4387a.mo8038o0() == EnumC4389b.NULL) {
            c4387a.mo8040e0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c4387a.mo8044a();
        while (c4387a.mo8055H()) {
            arrayList.add(this.f27046b.mo27782e(c4387a));
        }
        c4387a.mo8037v();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f27045a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.AbstractC4385s
    /* renamed from: d */
    public void mo27781f(C4390c c4390c, Object obj) throws IOException {
        if (obj == null) {
            c4390c.mo8031P();
            return;
        }
        c4390c.mo8030e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f27046b.mo27781f(c4390c, Array.get(obj, i));
        }
        c4390c.mo8024v();
    }
}
