package com.google.android.play.core.internal;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.h */
/* loaded from: classes.dex */
public final class C3939h extends AbstractC3938g {

    /* renamed from: w */
    private final AbstractC3938g f11231w;

    /* renamed from: x */
    private final long f11232x;

    /* renamed from: y */
    private final long f11233y;

    public C3939h(AbstractC3938g abstractC3938g, long j, long j2) {
        this.f11231w = abstractC3938g;
        long m28560h = m28560h(j);
        this.f11232x = m28560h;
        this.f11233y = m28560h(m28560h + j2);
    }

    /* renamed from: h */
    private final long m28560h(long j) {
        if (j < 0) {
            return 0L;
        }
        return j > this.f11231w.mo28562a() ? this.f11231w.mo28562a() : j;
    }

    @Override // com.google.android.play.core.internal.AbstractC3938g
    /* renamed from: a */
    public final long mo28562a() {
        return this.f11233y - this.f11232x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.AbstractC3938g
    /* renamed from: c */
    public final InputStream mo28561c(long j, long j2) throws IOException {
        long m28560h = m28560h(this.f11232x);
        return this.f11231w.mo28561c(m28560h, m28560h(j2 + m28560h) - m28560h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
