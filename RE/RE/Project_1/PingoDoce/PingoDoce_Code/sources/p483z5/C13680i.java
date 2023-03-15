package p483z5;

import p483z5.AbstractC13692o;

/* renamed from: z5.i */
/* loaded from: classes.dex */
final class C13680i extends AbstractC13692o {

    /* renamed from: a */
    private final AbstractC13692o.EnumC13695c f34807a;

    /* renamed from: b */
    private final AbstractC13692o.EnumC13694b f34808b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* renamed from: z5.i$b */
    /* loaded from: classes.dex */
    public static final class C13682b extends AbstractC13692o.AbstractC13693a {

        /* renamed from: a */
        private AbstractC13692o.EnumC13695c f34809a;

        /* renamed from: b */
        private AbstractC13692o.EnumC13694b f34810b;

        @Override // p483z5.AbstractC13692o.AbstractC13693a
        /* renamed from: a */
        public AbstractC13692o mo583a() {
            return new C13680i(this.f34809a, this.f34810b);
        }

        @Override // p483z5.AbstractC13692o.AbstractC13693a
        /* renamed from: b */
        public AbstractC13692o.AbstractC13693a mo582b(AbstractC13692o.EnumC13694b enumC13694b) {
            this.f34810b = enumC13694b;
            return this;
        }

        @Override // p483z5.AbstractC13692o.AbstractC13693a
        /* renamed from: c */
        public AbstractC13692o.AbstractC13693a mo581c(AbstractC13692o.EnumC13695c enumC13695c) {
            this.f34809a = enumC13695c;
            return this;
        }
    }

    @Override // p483z5.AbstractC13692o
    /* renamed from: b */
    public AbstractC13692o.EnumC13694b mo585b() {
        return this.f34808b;
    }

    @Override // p483z5.AbstractC13692o
    /* renamed from: c */
    public AbstractC13692o.EnumC13695c mo584c() {
        return this.f34807a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13692o) {
            AbstractC13692o abstractC13692o = (AbstractC13692o) obj;
            AbstractC13692o.EnumC13695c enumC13695c = this.f34807a;
            if (enumC13695c != null ? enumC13695c.equals(abstractC13692o.mo584c()) : abstractC13692o.mo584c() == null) {
                AbstractC13692o.EnumC13694b enumC13694b = this.f34808b;
                if (enumC13694b == null) {
                    if (abstractC13692o.mo585b() == null) {
                        return true;
                    }
                } else if (enumC13694b.equals(abstractC13692o.mo585b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC13692o.EnumC13695c enumC13695c = this.f34807a;
        int hashCode = ((enumC13695c == null ? 0 : enumC13695c.hashCode()) ^ 1000003) * 1000003;
        AbstractC13692o.EnumC13694b enumC13694b = this.f34808b;
        return hashCode ^ (enumC13694b != null ? enumC13694b.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f34807a + ", mobileSubtype=" + this.f34808b + "}";
    }

    private C13680i(AbstractC13692o.EnumC13695c enumC13695c, AbstractC13692o.EnumC13694b enumC13694b) {
        this.f34807a = enumC13695c;
        this.f34808b = enumC13694b;
    }
}
