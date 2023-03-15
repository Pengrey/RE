package org.threeten.p283bp.zone;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.threeten.p283bp.C8171c;
import org.threeten.p283bp.C8216e;
import org.threeten.p283bp.C8282o;
import p405vf.C11251d;

/* renamed from: org.threeten.bp.zone.f */
/* loaded from: classes2.dex */
public abstract class AbstractC8326f {

    /* compiled from: ZoneRules.java */
    /* renamed from: org.threeten.bp.zone.f$a */
    /* loaded from: classes2.dex */
    static final class C8327a extends AbstractC8326f implements Serializable {

        /* renamed from: w */
        private final C8282o f21564w;

        C8327a(C8282o c8282o) {
            this.f21564w = c8282o;
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: a */
        public C8282o mo15784a(C8171c c8171c) {
            return this.f21564w;
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: b */
        public C8322d mo15783b(C8216e c8216e) {
            return null;
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: c */
        public List<C8282o> mo15782c(C8216e c8216e) {
            return Collections.singletonList(this.f21564w);
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: d */
        public boolean mo15781d(C8171c c8171c) {
            return false;
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: e */
        public boolean mo15780e() {
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C8327a) {
                return this.f21564w.equals(((C8327a) obj).f21564w);
            }
            if (obj instanceof C8319b) {
                C8319b c8319b = (C8319b) obj;
                return c8319b.mo15780e() && this.f21564w.equals(c8319b.mo15784a(C8171c.f21276y));
            }
            return false;
        }

        @Override // org.threeten.p283bp.zone.AbstractC8326f
        /* renamed from: f */
        public boolean mo15779f(C8216e c8216e, C8282o c8282o) {
            return this.f21564w.equals(c8282o);
        }

        public int hashCode() {
            return ((((this.f21564w.hashCode() + 31) ^ 1) ^ 1) ^ (this.f21564w.hashCode() + 31)) ^ 1;
        }

        public String toString() {
            return "FixedRules:" + this.f21564w;
        }
    }

    /* renamed from: g */
    public static AbstractC8326f m15785g(C8282o c8282o) {
        C11251d.m5623i(c8282o, "offset");
        return new C8327a(c8282o);
    }

    /* renamed from: a */
    public abstract C8282o mo15784a(C8171c c8171c);

    /* renamed from: b */
    public abstract C8322d mo15783b(C8216e c8216e);

    /* renamed from: c */
    public abstract List<C8282o> mo15782c(C8216e c8216e);

    /* renamed from: d */
    public abstract boolean mo15781d(C8171c c8171c);

    /* renamed from: e */
    public abstract boolean mo15780e();

    /* renamed from: f */
    public abstract boolean mo15779f(C8216e c8216e, C8282o c8282o);
}
