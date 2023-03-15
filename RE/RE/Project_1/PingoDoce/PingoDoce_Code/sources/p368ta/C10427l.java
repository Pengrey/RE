package p368ta;

import com.google.gson.AbstractC4376l;
import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4374j;
import com.google.gson.InterfaceC4375k;
import com.google.gson.InterfaceC4380p;
import com.google.gson.InterfaceC4381q;
import com.google.gson.InterfaceC4391t;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import java.io.IOException;
import p421wa.C11605a;
import sa.C10099a;
import sa.C10135l;

/* renamed from: ta.l */
/* loaded from: classes2.dex */
public final class C10427l<T> extends AbstractC4385s<T> {

    /* renamed from: a */
    private final InterfaceC4381q<T> f27092a;

    /* renamed from: b */
    private final InterfaceC4375k<T> f27093b;

    /* renamed from: c */
    final C4364f f27094c;

    /* renamed from: d */
    private final C11605a<T> f27095d;

    /* renamed from: e */
    private final InterfaceC4391t f27096e;

    /* renamed from: f */
    private final C10427l<T>.C10429b f27097f = new C10429b();

    /* renamed from: g */
    private AbstractC4385s<T> f27098g;

    /* compiled from: TreeTypeAdapter.java */
    /* renamed from: ta.l$b */
    /* loaded from: classes2.dex */
    private final class C10429b implements InterfaceC4380p, InterfaceC4374j {
        private C10429b(C10427l c10427l) {
        }
    }

    /* compiled from: TreeTypeAdapter.java */
    /* renamed from: ta.l$c */
    /* loaded from: classes2.dex */
    private static final class C10430c implements InterfaceC4391t {

        /* renamed from: A */
        private final InterfaceC4375k<?> f27099A;

        /* renamed from: w */
        private final C11605a<?> f27100w;

        /* renamed from: x */
        private final boolean f27101x;

        /* renamed from: y */
        private final Class<?> f27102y;

        /* renamed from: z */
        private final InterfaceC4381q<?> f27103z;

        C10430c(Object obj, C11605a<?> c11605a, boolean z, Class<?> cls) {
            InterfaceC4381q<?> interfaceC4381q = obj instanceof InterfaceC4381q ? (InterfaceC4381q) obj : null;
            this.f27103z = interfaceC4381q;
            InterfaceC4375k<?> interfaceC4375k = obj instanceof InterfaceC4375k ? (InterfaceC4375k) obj : null;
            this.f27099A = interfaceC4375k;
            C10099a.m9144a((interfaceC4381q == null && interfaceC4375k == null) ? false : true);
            this.f27100w = c11605a;
            this.f27101x = z;
            this.f27102y = cls;
        }

        @Override // com.google.gson.InterfaceC4391t
        /* renamed from: a */
        public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
            boolean isAssignableFrom;
            C11605a<?> c11605a2 = this.f27100w;
            if (c11605a2 != null) {
                isAssignableFrom = c11605a2.equals(c11605a) || (this.f27101x && this.f27100w.m4627e() == c11605a.m4629c());
            } else {
                isAssignableFrom = this.f27102y.isAssignableFrom(c11605a.m4629c());
            }
            if (isAssignableFrom) {
                return new C10427l(this.f27103z, this.f27099A, c4364f, c11605a, this);
            }
            return null;
        }
    }

    public C10427l(InterfaceC4381q<T> interfaceC4381q, InterfaceC4375k<T> interfaceC4375k, C4364f c4364f, C11605a<T> c11605a, InterfaceC4391t interfaceC4391t) {
        this.f27092a = interfaceC4381q;
        this.f27093b = interfaceC4375k;
        this.f27094c = c4364f;
        this.f27095d = c11605a;
        this.f27096e = interfaceC4391t;
    }

    /* renamed from: e */
    private AbstractC4385s<T> m8005e() {
        AbstractC4385s<T> abstractC4385s = this.f27098g;
        if (abstractC4385s != null) {
            return abstractC4385s;
        }
        AbstractC4385s<T> m27793m = this.f27094c.m27793m(this.f27096e, this.f27095d);
        this.f27098g = m27793m;
        return m27793m;
    }

    /* renamed from: f */
    public static InterfaceC4391t m8004f(C11605a<?> c11605a, Object obj) {
        return new C10430c(obj, c11605a, c11605a.m4627e() == c11605a.m4629c(), null);
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: b */
    public T mo27782e(C4387a c4387a) throws IOException {
        if (this.f27093b == null) {
            return m8005e().mo27782e(c4387a);
        }
        AbstractC4376l m9077a = C10135l.m9077a(c4387a);
        if (m9077a.m27760p()) {
            return null;
        }
        return this.f27093b.mo27765a(m9077a, this.f27095d.m4627e(), this.f27097f);
    }

    @Override // com.google.gson.AbstractC4385s
    /* renamed from: d */
    public void mo27781f(C4390c c4390c, T t) throws IOException {
        InterfaceC4381q<T> interfaceC4381q = this.f27092a;
        if (interfaceC4381q == null) {
            m8005e().mo27781f(c4390c, t);
        } else if (t == null) {
            c4390c.mo8031P();
        } else {
            C10135l.m9076b(interfaceC4381q.m27743a(t, this.f27095d.m4627e(), this.f27097f), c4390c);
        }
    }
}
