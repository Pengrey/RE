package p174j6;

import java.util.Objects;
import p007a6.AbstractC0046i;
import p007a6.AbstractC0056o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j6.b */
/* loaded from: classes.dex */
public final class C6309b extends AbstractC6331k {

    /* renamed from: a */
    private final long f17324a;

    /* renamed from: b */
    private final AbstractC0056o f17325b;

    /* renamed from: c */
    private final AbstractC0046i f17326c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6309b(long j, AbstractC0056o abstractC0056o, AbstractC0046i abstractC0046i) {
        this.f17324a = j;
        Objects.requireNonNull(abstractC0056o, "Null transportContext");
        this.f17325b = abstractC0056o;
        Objects.requireNonNull(abstractC0046i, "Null event");
        this.f17326c = abstractC0046i;
    }

    @Override // p174j6.AbstractC6331k
    /* renamed from: b */
    public AbstractC0046i mo21241b() {
        return this.f17326c;
    }

    @Override // p174j6.AbstractC6331k
    /* renamed from: c */
    public long mo21240c() {
        return this.f17324a;
    }

    @Override // p174j6.AbstractC6331k
    /* renamed from: d */
    public AbstractC0056o mo21239d() {
        return this.f17325b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6331k) {
            AbstractC6331k abstractC6331k = (AbstractC6331k) obj;
            return this.f17324a == abstractC6331k.mo21240c() && this.f17325b.equals(abstractC6331k.mo21239d()) && this.f17326c.equals(abstractC6331k.mo21241b());
        }
        return false;
    }

    public int hashCode() {
        long j = this.f17324a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17325b.hashCode()) * 1000003) ^ this.f17326c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17324a + ", transportContext=" + this.f17325b + ", event=" + this.f17326c + "}";
    }
}
