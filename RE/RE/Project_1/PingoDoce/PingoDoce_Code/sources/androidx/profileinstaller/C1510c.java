package androidx.profileinstaller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
class C1510c {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m36886a(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static RuntimeException m36885b(String str) {
        return new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static byte[] m36884c(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw m36885b("Not enough bytes to read: " + i);
            }
            i2 += read;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw m36885b("Inflater did not finish");
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m36883d(java.io.InputStream r8, int r9, int r10) throws java.io.IOException {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L84
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L84
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L53
            if (r4 >= r9) goto L53
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L84
            if (r6 < 0) goto L38
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L84
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.util.zip.DataFormatException -> L2e java.lang.Throwable -> L84
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = m36885b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L38:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = m36885b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L53:
            if (r4 != r9) goto L66
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L5f
            r0.end()
            return r1
        L5f:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.RuntimeException r8 = m36885b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L66:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L84
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L84
            r8.append(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L84
            java.lang.RuntimeException r8 = m36885b(r8)     // Catch: java.lang.Throwable -> L84
            throw r8     // Catch: java.lang.Throwable -> L84
        L84:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.C1510c.m36883d(java.io.InputStream, int, int):byte[]");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m36882e(InputStream inputStream, int i) throws IOException {
        return new String(m36884c(inputStream, i), StandardCharsets.UTF_8);
    }

    /* renamed from: f */
    static long m36881f(InputStream inputStream, int i) throws IOException {
        byte[] m36884c = m36884c(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (m36884c[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m36880g(InputStream inputStream) throws IOException {
        return (int) m36881f(inputStream, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static long m36879h(InputStream inputStream) throws IOException {
        return m36881f(inputStream, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m36878i(InputStream inputStream) throws IOException {
        return (int) m36881f(inputStream, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m36877j(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static void m36876k(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static void m36875l(OutputStream outputStream, byte[] bArr) throws IOException {
        m36871p(outputStream, bArr.length);
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            m36871p(outputStream, byteArray.length);
            outputStream.write(byteArray);
        } finally {
            deflater.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static void m36874m(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: n */
    static void m36873n(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static void m36872o(OutputStream outputStream, int i) throws IOException {
        m36873n(outputStream, i, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static void m36871p(OutputStream outputStream, long j) throws IOException {
        m36873n(outputStream, j, 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static void m36870q(OutputStream outputStream, int i) throws IOException {
        m36873n(outputStream, i, 1);
    }
}
