package com.google.android.play.core.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.internal.g */
/* loaded from: classes.dex */
public abstract class AbstractC3938g implements Closeable {
    /* renamed from: a */
    public abstract long mo28562a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public abstract InputStream mo28561c(long j, long j2) throws IOException;

    /* renamed from: e */
    public synchronized InputStream m28563e() throws IOException {
        return mo28561c(0L, mo28562a());
    }
}
