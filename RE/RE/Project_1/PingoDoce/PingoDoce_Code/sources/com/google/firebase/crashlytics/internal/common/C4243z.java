package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.firebase.crashlytics.internal.common.z */
/* loaded from: classes.dex */
class C4243z {
    /* renamed from: a */
    private static void m28189a(InputStream inputStream, File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream2.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream2.finish();
                        C4196g.m28372f(gZIPOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    C4196g.m28372f(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m28188b(File file, List<InterfaceC4242y> list) {
        for (InterfaceC4242y interfaceC4242y : list) {
            InputStream inputStream = null;
            try {
                inputStream = interfaceC4242y.mo28192a();
                if (inputStream != null) {
                    m28189a(inputStream, new File(file, interfaceC4242y.mo28191b()));
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                C4196g.m28372f(null);
                throw th2;
            }
            C4196g.m28372f(inputStream);
        }
    }
}
