package com.google.android.gms.common.util;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@Deprecated
/* renamed from: com.google.android.gms.common.util.b */
/* loaded from: classes.dex */
public final class C2631b {
    /* renamed from: a */
    public static void m32997a(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @Deprecated
    /* renamed from: b */
    public static long m32996b(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, i);
                if (read == -1) {
                    break;
                }
                j += read;
                outputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                if (z) {
                    m32997a(inputStream);
                    m32997a(outputStream);
                }
                throw th2;
            }
        }
        if (z) {
            m32997a(inputStream);
            m32997a(outputStream);
        }
        return j;
    }

    @Deprecated
    /* renamed from: c */
    public static byte[] m32995c(InputStream inputStream) throws IOException {
        return m32994d(inputStream, true);
    }

    @Deprecated
    /* renamed from: d */
    public static byte[] m32994d(InputStream inputStream, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m32996b(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
