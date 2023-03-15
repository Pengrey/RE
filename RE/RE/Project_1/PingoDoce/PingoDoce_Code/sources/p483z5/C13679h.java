package p483z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z5.h */
/* loaded from: classes.dex */
public final class C13679h extends AbstractC13691n {

    /* renamed from: a */
    private final long f34806a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13679h(long j) {
        this.f34806a = j;
    }

    @Override // p483z5.AbstractC13691n
    /* renamed from: c */
    public long mo587c() {
        return this.f34806a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AbstractC13691n) && this.f34806a == ((AbstractC13691n) obj).mo587c();
    }

    public int hashCode() {
        long j = this.f34806a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f34806a + "}";
    }
}
