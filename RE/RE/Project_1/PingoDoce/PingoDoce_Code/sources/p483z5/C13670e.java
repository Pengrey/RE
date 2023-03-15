package p483z5;

import p483z5.AbstractC13684k;

/* renamed from: z5.e */
/* loaded from: classes.dex */
final class C13670e extends AbstractC13684k {

    /* renamed from: a */
    private final AbstractC13684k.EnumC13686b f34774a;

    /* renamed from: b */
    private final AbstractC13657a f34775b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_ClientInfo.java */
    /* renamed from: z5.e$b */
    /* loaded from: classes.dex */
    public static final class C13672b extends AbstractC13684k.AbstractC13685a {

        /* renamed from: a */
        private AbstractC13684k.EnumC13686b f34776a;

        /* renamed from: b */
        private AbstractC13657a f34777b;

        @Override // p483z5.AbstractC13684k.AbstractC13685a
        /* renamed from: a */
        public AbstractC13684k mo628a() {
            return new C13670e(this.f34776a, this.f34777b);
        }

        @Override // p483z5.AbstractC13684k.AbstractC13685a
        /* renamed from: b */
        public AbstractC13684k.AbstractC13685a mo627b(AbstractC13657a abstractC13657a) {
            this.f34777b = abstractC13657a;
            return this;
        }

        @Override // p483z5.AbstractC13684k.AbstractC13685a
        /* renamed from: c */
        public AbstractC13684k.AbstractC13685a mo626c(AbstractC13684k.EnumC13686b enumC13686b) {
            this.f34776a = enumC13686b;
            return this;
        }
    }

    @Override // p483z5.AbstractC13684k
    /* renamed from: b */
    public AbstractC13657a mo630b() {
        return this.f34775b;
    }

    @Override // p483z5.AbstractC13684k
    /* renamed from: c */
    public AbstractC13684k.EnumC13686b mo629c() {
        return this.f34774a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13684k) {
            AbstractC13684k abstractC13684k = (AbstractC13684k) obj;
            AbstractC13684k.EnumC13686b enumC13686b = this.f34774a;
            if (enumC13686b != null ? enumC13686b.equals(abstractC13684k.mo629c()) : abstractC13684k.mo629c() == null) {
                AbstractC13657a abstractC13657a = this.f34775b;
                if (abstractC13657a == null) {
                    if (abstractC13684k.mo630b() == null) {
                        return true;
                    }
                } else if (abstractC13657a.equals(abstractC13684k.mo630b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC13684k.EnumC13686b enumC13686b = this.f34774a;
        int hashCode = ((enumC13686b == null ? 0 : enumC13686b.hashCode()) ^ 1000003) * 1000003;
        AbstractC13657a abstractC13657a = this.f34775b;
        return hashCode ^ (abstractC13657a != null ? abstractC13657a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f34774a + ", androidClientInfo=" + this.f34775b + "}";
    }

    private C13670e(AbstractC13684k.EnumC13686b enumC13686b, AbstractC13657a abstractC13657a) {
        this.f34774a = enumC13686b;
        this.f34775b = abstractC13657a;
    }
}
