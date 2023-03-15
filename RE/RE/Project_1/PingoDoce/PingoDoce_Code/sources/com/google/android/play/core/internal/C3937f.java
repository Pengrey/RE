package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.google.android.play.core.internal.f */
/* loaded from: classes.dex */
public final class C3937f {
    /* renamed from: a */
    public static void m28570a(PackageManager packageManager, ComponentName componentName, int i) {
        ComponentInfo componentInfo;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting != 1) {
            if (componentEnabledSetting != 2) {
                String packageName = componentName.getPackageName();
                String className = componentName.getClassName();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i | 512);
                    ComponentInfo[][] componentInfoArr = {packageInfo.activities, packageInfo.services, packageInfo.providers};
                    int i2 = 0;
                    loop0: while (true) {
                        if (i2 >= 3) {
                            componentInfo = null;
                            break;
                        }
                        ComponentInfo[] componentInfoArr2 = componentInfoArr[i2];
                        if (componentInfoArr2 != null) {
                            int length = componentInfoArr2.length;
                            for (int i3 = 0; i3 < length; i3++) {
                                componentInfo = componentInfoArr2[i3];
                                if (componentInfo.name.equals(className)) {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                        i2++;
                    }
                    if (componentInfo != null) {
                        if (componentInfo.isEnabled()) {
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: b */
    public static void m28569b(AbstractC3938g abstractC3938g, InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new C3933bz(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read != 4) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unexpected version=");
            sb2.append(read);
            throw new C3933bz(sb2.toString());
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int read2 = dataInputStream.read();
                if (read2 == -1) {
                    throw new IOException("Patch file overrun");
                }
                if (read2 == 0) {
                    return;
                }
                switch (read2) {
                    case 247:
                        read2 = dataInputStream.readUnsignedShort();
                        m28565f(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 248:
                        read2 = dataInputStream.readInt();
                        m28565f(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                    case 249:
                        long readUnsignedShort = dataInputStream.readUnsignedShort();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m28566e(bArr, abstractC3938g, outputStream, readUnsignedShort, read2, j3);
                        break;
                    case 250:
                        read2 = dataInputStream.readUnsignedShort();
                        m28566e(bArr, abstractC3938g, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 251:
                        read2 = dataInputStream.readInt();
                        m28566e(bArr, abstractC3938g, outputStream, dataInputStream.readUnsignedShort(), read2, j3);
                        break;
                    case 252:
                        long readInt2 = dataInputStream.readInt();
                        read2 = dataInputStream.read();
                        if (read2 == -1) {
                            throw new IOException("Unexpected end of patch");
                        }
                        m28566e(bArr, abstractC3938g, outputStream, readInt2, read2, j3);
                        break;
                    case 253:
                        read2 = dataInputStream.readUnsignedShort();
                        m28566e(bArr, abstractC3938g, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case 254:
                        read2 = dataInputStream.readInt();
                        m28566e(bArr, abstractC3938g, outputStream, dataInputStream.readInt(), read2, j3);
                        break;
                    case 255:
                        long readLong = dataInputStream.readLong();
                        read2 = dataInputStream.readInt();
                        m28566e(bArr, abstractC3938g, outputStream, readLong, read2, j3);
                        break;
                    default:
                        m28565f(bArr, dataInputStream, outputStream, read2, j3);
                        break;
                }
                j2 += read2;
            } finally {
                outputStream.flush();
            }
        }
    }

    /* renamed from: c */
    public static <T> void m28568c(T t) {
        Objects.requireNonNull(t);
    }

    /* renamed from: d */
    public static <T> void m28567d(T t, Class<T> cls) {
        if (t == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: e */
    private static void m28566e(byte[] bArr, AbstractC3938g abstractC3938g, OutputStream outputStream, long j, int i, long j2) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (j < 0) {
            throw new IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new IOException("Output length overrun");
        }
        try {
            InputStream m28563e = new C3939h(abstractC3938g, j, j3).m28563e();
            while (i > 0) {
                int min = Math.min(i, 16384);
                int i2 = 0;
                while (i2 < min) {
                    int read = m28563e.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw new IOException("truncated input stream");
                    }
                    i2 += read;
                }
                outputStream.write(bArr, 0, min);
                i -= min;
            }
            if (m28563e != null) {
                m28563e.close();
            }
        } catch (EOFException e) {
            throw new IOException("patch underrun", e);
        }
    }

    /* renamed from: f */
    private static void m28565f(byte[] bArr, DataInputStream dataInputStream, OutputStream outputStream, int i, long j) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i > j) {
            throw new IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int min = Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, min);
                outputStream.write(bArr, 0, min);
                i -= min;
            } catch (EOFException unused) {
                throw new IOException("patch underrun");
            }
        }
    }

    /* renamed from: g */
    public static <T> void m28564g(T t) {
        Objects.requireNonNull(t, "Cannot return null from a non-@Nullable @Provides method");
    }
}
