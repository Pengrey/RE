package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

/* renamed from: com.google.android.play.core.assetpacks.u1 */
/* loaded from: classes.dex */
public final class C3906u1 extends InputStream {

    /* renamed from: w */
    private final Enumeration<File> f11180w;

    /* renamed from: x */
    private InputStream f11181x;

    public C3906u1(Enumeration<File> enumeration) throws IOException {
        this.f11180w = enumeration;
        m28625a();
    }

    /* renamed from: a */
    final void m28625a() throws IOException {
        InputStream inputStream = this.f11181x;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f11181x = this.f11180w.hasMoreElements() ? new FileInputStream(this.f11180w.nextElement()) : null;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f11181x;
        if (inputStream != null) {
            inputStream.close();
            this.f11181x = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f11181x;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            m28625a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f11181x == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 != 0) {
            do {
                int read = this.f11181x.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                m28625a();
            } while (this.f11181x != null);
            return -1;
        }
        return 0;
    }
}
