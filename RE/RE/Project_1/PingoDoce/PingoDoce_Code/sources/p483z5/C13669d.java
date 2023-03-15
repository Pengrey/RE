package p483z5;

import java.util.List;
import java.util.Objects;

/* renamed from: z5.d */
/* loaded from: classes.dex */
final class C13669d extends AbstractC13683j {

    /* renamed from: a */
    private final List<AbstractC13689m> f34773a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13669d(List<AbstractC13689m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f34773a = list;
    }

    @Override // p483z5.AbstractC13683j
    /* renamed from: c */
    public List<AbstractC13689m> mo632c() {
        return this.f34773a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13683j) {
            return this.f34773a.equals(((AbstractC13683j) obj).mo632c());
        }
        return false;
    }

    public int hashCode() {
        return this.f34773a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f34773a + "}";
    }
}
