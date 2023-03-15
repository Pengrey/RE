package p387uf;

import java.io.Serializable;
import org.threeten.p283bp.AbstractC8280n;
import org.threeten.p283bp.C8171c;

/* renamed from: uf.a */
/* loaded from: classes2.dex */
public abstract class AbstractC10876a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clock.java */
    /* renamed from: uf.a$a */
    /* loaded from: classes2.dex */
    public static final class C10877a extends AbstractC10876a implements Serializable {

        /* renamed from: w */
        private final AbstractC8280n f28092w;

        C10877a(AbstractC8280n abstractC8280n) {
            this.f28092w = abstractC8280n;
        }

        @Override // p387uf.AbstractC10876a
        /* renamed from: a */
        public AbstractC8280n mo6797a() {
            return this.f28092w;
        }

        @Override // p387uf.AbstractC10876a
        /* renamed from: b */
        public C8171c mo6796b() {
            return C8171c.m16387o(m6795d());
        }

        /* renamed from: d */
        public long m6795d() {
            return System.currentTimeMillis();
        }

        public boolean equals(Object obj) {
            if (obj instanceof C10877a) {
                return this.f28092w.equals(((C10877a) obj).f28092w);
            }
            return false;
        }

        public int hashCode() {
            return this.f28092w.hashCode() + 1;
        }

        public String toString() {
            return "SystemClock[" + this.f28092w + "]";
        }
    }

    protected AbstractC10876a() {
    }

    /* renamed from: c */
    public static AbstractC10876a m6798c() {
        return new C10877a(AbstractC8280n.m15930m());
    }

    /* renamed from: a */
    public abstract AbstractC8280n mo6797a();

    /* renamed from: b */
    public abstract C8171c mo6796b();
}
