package com.squareup.moshi;

import com.squareup.moshi.AbstractC4476h;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import p313qc.C9711a;
import p356sf.Buffer;
import p356sf.InterfaceC10186d;

/* renamed from: com.squareup.moshi.f */
/* loaded from: classes2.dex */
public abstract class AbstractC4470f<T> {

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$a */
    /* loaded from: classes2.dex */
    class C4471a extends AbstractC4470f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4470f f12070a;

        C4471a(AbstractC4470f abstractC4470f, AbstractC4470f abstractC4470f2) {
            this.f12070a = abstractC4470f2;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        @Nullable
        /* renamed from: b */
        public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            return (T) this.f12070a.mo10144b(abstractC4476h);
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: d */
        boolean mo27470d() {
            return this.f12070a.mo27470d();
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public void mo10143i(AbstractC4483m abstractC4483m, @Nullable T t) throws IOException {
            boolean m27397y = abstractC4483m.m27397y();
            abstractC4483m.m27408a0(true);
            try {
                this.f12070a.mo10143i(abstractC4483m, t);
            } finally {
                abstractC4483m.m27408a0(m27397y);
            }
        }

        public String toString() {
            return this.f12070a + ".serializeNulls()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$b */
    /* loaded from: classes2.dex */
    class C4472b extends AbstractC4470f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4470f f12071a;

        C4472b(AbstractC4470f abstractC4470f, AbstractC4470f abstractC4470f2) {
            this.f12071a = abstractC4470f2;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        @Nullable
        /* renamed from: b */
        public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            boolean m27469E = abstractC4476h.m27469E();
            abstractC4476h.m27465j0(true);
            try {
                return (T) this.f12071a.mo10144b(abstractC4476h);
            } finally {
                abstractC4476h.m27465j0(m27469E);
            }
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: d */
        boolean mo27470d() {
            return true;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public void mo10143i(AbstractC4483m abstractC4483m, @Nullable T t) throws IOException {
            boolean m27418E = abstractC4483m.m27418E();
            abstractC4483m.m27410X(true);
            try {
                this.f12071a.mo10143i(abstractC4483m, t);
            } finally {
                abstractC4483m.m27410X(m27418E);
            }
        }

        public String toString() {
            return this.f12071a + ".lenient()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$c */
    /* loaded from: classes2.dex */
    class C4473c extends AbstractC4470f<T> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4470f f12072a;

        C4473c(AbstractC4470f abstractC4470f, AbstractC4470f abstractC4470f2) {
            this.f12072a = abstractC4470f2;
        }

        @Override // com.squareup.moshi.AbstractC4470f
        @Nullable
        /* renamed from: b */
        public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
            boolean m27463t = abstractC4476h.m27463t();
            abstractC4476h.m27466f0(true);
            try {
                return (T) this.f12072a.mo10144b(abstractC4476h);
            } finally {
                abstractC4476h.m27466f0(m27463t);
            }
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: d */
        boolean mo27470d() {
            return this.f12072a.mo27470d();
        }

        @Override // com.squareup.moshi.AbstractC4470f
        /* renamed from: i */
        public void mo10143i(AbstractC4483m abstractC4483m, @Nullable T t) throws IOException {
            this.f12072a.mo10143i(abstractC4483m, t);
        }

        public String toString() {
            return this.f12072a + ".failOnUnknown()";
        }
    }

    /* compiled from: JsonAdapter.java */
    /* renamed from: com.squareup.moshi.f$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4474d {
        @CheckReturnValue
        @Nullable
        /* renamed from: a */
        AbstractC4470f<?> mo27356a(Type type, Set<? extends Annotation> set, C4496p c4496p);
    }

    @CheckReturnValue
    /* renamed from: a */
    public final AbstractC4470f<T> m27477a() {
        return new C4473c(this, this);
    }

    @CheckReturnValue
    @Nullable
    /* renamed from: b */
    public abstract T mo10144b(AbstractC4476h abstractC4476h) throws IOException;

    @CheckReturnValue
    @Nullable
    /* renamed from: c */
    public final T m27476c(String str) throws IOException {
        AbstractC4476h m27468W = AbstractC4476h.m27468W(new Buffer().m8814I0(str));
        T mo10144b = mo10144b(m27468W);
        if (mo27470d() || m27468W.mo27440X() == AbstractC4476h.EnumC4478b.END_DOCUMENT) {
            return mo10144b;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    /* renamed from: d */
    boolean mo27470d() {
        return false;
    }

    @CheckReturnValue
    /* renamed from: e */
    public final AbstractC4470f<T> m27475e() {
        return new C4472b(this, this);
    }

    @CheckReturnValue
    /* renamed from: f */
    public final AbstractC4470f<T> m27474f() {
        return this instanceof C9711a ? this : new C9711a(this);
    }

    @CheckReturnValue
    /* renamed from: g */
    public final AbstractC4470f<T> m27473g() {
        return new C4471a(this, this);
    }

    @CheckReturnValue
    /* renamed from: h */
    public final String m27472h(@Nullable T t) {
        Buffer buffer = new Buffer();
        try {
            m27471j(buffer, t);
            return buffer.m8801d0();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: i */
    public abstract void mo10143i(AbstractC4483m abstractC4483m, @Nullable T t) throws IOException;

    /* renamed from: j */
    public final void m27471j(InterfaceC10186d interfaceC10186d, @Nullable T t) throws IOException {
        mo10143i(AbstractC4483m.m27415L(interfaceC10186d), t);
    }
}
