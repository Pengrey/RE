package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC2397e;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes.dex */
public final class C2393b extends AbstractC2397e {

    /* renamed from: a */
    private final AbstractC2397e.EnumC2398a f6982a;

    /* renamed from: b */
    private final long f6983b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2393b(AbstractC2397e.EnumC2398a enumC2398a, long j) {
        Objects.requireNonNull(enumC2398a, "Null status");
        this.f6982a = enumC2398a;
        this.f6983b = j;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2397e
    /* renamed from: b */
    public long mo33689b() {
        return this.f6983b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2397e
    /* renamed from: c */
    public AbstractC2397e.EnumC2398a mo33688c() {
        return this.f6982a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2397e) {
            AbstractC2397e abstractC2397e = (AbstractC2397e) obj;
            return this.f6982a.equals(abstractC2397e.mo33688c()) && this.f6983b == abstractC2397e.mo33689b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f6983b;
        return ((this.f6982a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f6982a + ", nextRequestWaitMillis=" + this.f6983b + "}";
    }
}
