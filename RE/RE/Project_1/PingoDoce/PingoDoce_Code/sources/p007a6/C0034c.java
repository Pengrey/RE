package p007a6;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import p007a6.AbstractC0054n;
import p461y5.AbstractC13112c;
import p461y5.C13111b;
import p461y5.InterfaceC13114e;

/* renamed from: a6.c */
/* loaded from: classes.dex */
final class C0034c extends AbstractC0054n {

    /* renamed from: a */
    private final AbstractC0056o f123a;

    /* renamed from: b */
    private final String f124b;

    /* renamed from: c */
    private final AbstractC13112c<?> f125c;

    /* renamed from: d */
    private final InterfaceC13114e<?, byte[]> f126d;

    /* renamed from: e */
    private final C13111b f127e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: a6.c$b */
    /* loaded from: classes.dex */
    static final class C0036b extends AbstractC0054n.AbstractC0055a {

        /* renamed from: a */
        private AbstractC0056o f128a;

        /* renamed from: b */
        private String f129b;

        /* renamed from: c */
        private AbstractC13112c<?> f130c;

        /* renamed from: d */
        private InterfaceC13114e<?, byte[]> f131d;

        /* renamed from: e */
        private C13111b f132e;

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: a */
        public AbstractC0054n mo42051a() {
            AbstractC0056o abstractC0056o = this.f128a;
            String str = BuildConfig.VERSION_NAME;
            if (abstractC0056o == null) {
                str = BuildConfig.VERSION_NAME + " transportContext";
            }
            if (this.f129b == null) {
                str = str + " transportName";
            }
            if (this.f130c == null) {
                str = str + " event";
            }
            if (this.f131d == null) {
                str = str + " transformer";
            }
            if (this.f132e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C0034c(this.f128a, this.f129b, this.f130c, this.f131d, this.f132e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: b */
        AbstractC0054n.AbstractC0055a mo42050b(C13111b c13111b) {
            Objects.requireNonNull(c13111b, "Null encoding");
            this.f132e = c13111b;
            return this;
        }

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: c */
        AbstractC0054n.AbstractC0055a mo42049c(AbstractC13112c<?> abstractC13112c) {
            Objects.requireNonNull(abstractC13112c, "Null event");
            this.f130c = abstractC13112c;
            return this;
        }

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: d */
        AbstractC0054n.AbstractC0055a mo42048d(InterfaceC13114e<?, byte[]> interfaceC13114e) {
            Objects.requireNonNull(interfaceC13114e, "Null transformer");
            this.f131d = interfaceC13114e;
            return this;
        }

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: e */
        public AbstractC0054n.AbstractC0055a mo42047e(AbstractC0056o abstractC0056o) {
            Objects.requireNonNull(abstractC0056o, "Null transportContext");
            this.f128a = abstractC0056o;
            return this;
        }

        @Override // p007a6.AbstractC0054n.AbstractC0055a
        /* renamed from: f */
        public AbstractC0054n.AbstractC0055a mo42046f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f129b = str;
            return this;
        }
    }

    @Override // p007a6.AbstractC0054n
    /* renamed from: b */
    public C13111b mo42057b() {
        return this.f127e;
    }

    @Override // p007a6.AbstractC0054n
    /* renamed from: c */
    AbstractC13112c<?> mo42056c() {
        return this.f125c;
    }

    @Override // p007a6.AbstractC0054n
    /* renamed from: e */
    InterfaceC13114e<?, byte[]> mo42054e() {
        return this.f126d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0054n) {
            AbstractC0054n abstractC0054n = (AbstractC0054n) obj;
            return this.f123a.equals(abstractC0054n.mo42053f()) && this.f124b.equals(abstractC0054n.mo42052g()) && this.f125c.equals(abstractC0054n.mo42056c()) && this.f126d.equals(abstractC0054n.mo42054e()) && this.f127e.equals(abstractC0054n.mo42057b());
        }
        return false;
    }

    @Override // p007a6.AbstractC0054n
    /* renamed from: f */
    public AbstractC0056o mo42053f() {
        return this.f123a;
    }

    @Override // p007a6.AbstractC0054n
    /* renamed from: g */
    public String mo42052g() {
        return this.f124b;
    }

    public int hashCode() {
        return ((((((((this.f123a.hashCode() ^ 1000003) * 1000003) ^ this.f124b.hashCode()) * 1000003) ^ this.f125c.hashCode()) * 1000003) ^ this.f126d.hashCode()) * 1000003) ^ this.f127e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f123a + ", transportName=" + this.f124b + ", event=" + this.f125c + ", transformer=" + this.f126d + ", encoding=" + this.f127e + "}";
    }

    private C0034c(AbstractC0056o abstractC0056o, String str, AbstractC13112c<?> abstractC13112c, InterfaceC13114e<?, byte[]> interfaceC13114e, C13111b c13111b) {
        this.f123a = abstractC0056o;
        this.f124b = str;
        this.f125c = abstractC13112c;
        this.f126d = interfaceC13114e;
        this.f127e = c13111b;
    }
}
