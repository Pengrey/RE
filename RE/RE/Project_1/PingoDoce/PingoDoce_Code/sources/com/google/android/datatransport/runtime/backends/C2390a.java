package com.google.android.datatransport.runtime.backends;

import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.datatransport.runtime.backends.AbstractC2395d;
import java.util.Arrays;
import java.util.Objects;
import p007a6.AbstractC0046i;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes.dex */
final class C2390a extends AbstractC2395d {

    /* renamed from: a */
    private final Iterable<AbstractC0046i> f6978a;

    /* renamed from: b */
    private final byte[] f6979b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    /* loaded from: classes.dex */
    public static final class C2392b extends AbstractC2395d.AbstractC2396a {

        /* renamed from: a */
        private Iterable<AbstractC0046i> f6980a;

        /* renamed from: b */
        private byte[] f6981b;

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2395d.AbstractC2396a
        /* renamed from: a */
        public AbstractC2395d mo33693a() {
            Iterable<AbstractC0046i> iterable = this.f6980a;
            String str = BuildConfig.VERSION_NAME;
            if (iterable == null) {
                str = BuildConfig.VERSION_NAME + " events";
            }
            if (str.isEmpty()) {
                return new C2390a(this.f6980a, this.f6981b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2395d.AbstractC2396a
        /* renamed from: b */
        public AbstractC2395d.AbstractC2396a mo33692b(Iterable<AbstractC0046i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f6980a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2395d.AbstractC2396a
        /* renamed from: c */
        public AbstractC2395d.AbstractC2396a mo33691c(byte[] bArr) {
            this.f6981b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2395d
    /* renamed from: b */
    public Iterable<AbstractC0046i> mo33695b() {
        return this.f6978a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2395d
    /* renamed from: c */
    public byte[] mo33694c() {
        return this.f6979b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2395d) {
            AbstractC2395d abstractC2395d = (AbstractC2395d) obj;
            if (this.f6978a.equals(abstractC2395d.mo33695b())) {
                if (Arrays.equals(this.f6979b, abstractC2395d instanceof C2390a ? ((C2390a) abstractC2395d).f6979b : abstractC2395d.mo33694c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6978a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6979b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f6978a + ", extras=" + Arrays.toString(this.f6979b) + "}";
    }

    private C2390a(Iterable<AbstractC0046i> iterable, byte[] bArr) {
        this.f6978a = iterable;
        this.f6979b = bArr;
    }
}
