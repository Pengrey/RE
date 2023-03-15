package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.C1038g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.core.graphics.k */
/* loaded from: classes.dex */
public class C0999k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TypefaceCompatUtil.java */
    /* renamed from: androidx.core.graphics.k$a */
    /* loaded from: classes.dex */
    public static class C1000a {
        /* renamed from: a */
        static ParcelFileDescriptor m38785a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m38793a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m38792b(Context context, Resources resources, int i) {
        File m38789e = m38789e(context);
        if (m38789e == null) {
            return null;
        }
        try {
            if (m38791c(m38789e, resources, i)) {
                return m38787g(m38789e);
            }
            return null;
        } finally {
            m38789e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m38791c(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean m38790d = m38790d(file, inputStream);
            m38793a(inputStream);
            return m38790d;
        } catch (Throwable th3) {
            th = th3;
            m38793a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m38790d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            m38793a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m38793a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    m38793a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* renamed from: e */
    public static File m38789e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m38788f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m38785a = C1000a.m38785a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m38785a == null) {
                if (m38785a != null) {
                    m38785a.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m38785a.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                m38785a.close();
                return map;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static ByteBuffer m38787g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m38786h(Context context, C1038g.C1040b[] c1040bArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C1038g.C1040b c1040b : c1040bArr) {
            if (c1040b.m38699b() == 0) {
                Uri m38697d = c1040b.m38697d();
                if (!hashMap.containsKey(m38697d)) {
                    hashMap.put(m38697d, m38788f(context, cancellationSignal, m38697d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
