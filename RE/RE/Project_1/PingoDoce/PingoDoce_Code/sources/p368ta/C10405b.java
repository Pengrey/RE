package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4391t;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import com.google.gson.stream.EnumC4389b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import p421wa.C11605a;
import sa.C10100b;
import sa.C10104c;
import sa.InterfaceC10132i;

/* renamed from: ta.b */
/* loaded from: classes2.dex */
public final class C10405b implements InterfaceC4391t {

    /* renamed from: w */
    private final C10104c f27047w;

    /* compiled from: CollectionTypeAdapterFactory.java */
    /* renamed from: ta.b$a */
    /* loaded from: classes2.dex */
    private static final class C10406a<E> extends AbstractC4385s<Collection<E>> {

        /* renamed from: a */
        private final AbstractC4385s<E> f27048a;

        /* renamed from: b */
        private final InterfaceC10132i<? extends Collection<E>> f27049b;

        public C10406a(C4364f c4364f, Type type, AbstractC4385s<E> abstractC4385s, InterfaceC10132i<? extends Collection<E>> interfaceC10132i) {
            this.f27048a = new C10431m(c4364f, abstractC4385s, type);
            this.f27049b = interfaceC10132i;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: e */
        public Collection<E> mo27782e(C4387a c4387a) throws IOException {
            if (c4387a.mo8038o0() == EnumC4389b.NULL) {
                c4387a.mo8040e0();
                return null;
            }
            Collection<E> mo9083a = this.f27049b.mo9083a();
            c4387a.mo8044a();
            while (c4387a.mo8055H()) {
                mo9083a.add(this.f27048a.mo27782e(c4387a));
            }
            c4387a.mo8037v();
            return mo9083a;
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: f */
        public void mo27781f(C4390c c4390c, Collection<E> collection) throws IOException {
            if (collection == null) {
                c4390c.mo8031P();
                return;
            }
            c4390c.mo8030e();
            for (E e : collection) {
                this.f27048a.mo27781f(c4390c, e);
            }
            c4390c.mo8024v();
        }
    }

    public C10405b(C10104c c10104c) {
        this.f27047w = c10104c;
    }

    @Override // com.google.gson.InterfaceC4391t
    /* renamed from: a */
    public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
        Type m4627e = c11605a.m4627e();
        Class<? super T> m4629c = c11605a.m4629c();
        if (Collection.class.isAssignableFrom(m4629c)) {
            Type m9135h = C10100b.m9135h(m4627e, m4629c);
            return new C10406a(c4364f, m9135h, c4364f.m27794l(C11605a.m4630b(m9135h)), this.f27047w.m9121a(c11605a));
        }
        return null;
    }
}
