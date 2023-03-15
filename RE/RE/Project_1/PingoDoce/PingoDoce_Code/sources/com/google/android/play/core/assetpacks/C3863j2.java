package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;
import p031b9.C1844a;
import p031b9.C1863t;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
/* loaded from: classes.dex */
final class C3863j2 {

    /* renamed from: h */
    private static final C1844a f11004h = new C1844a("SliceMetadataManager");

    /* renamed from: b */
    private final C3924z f11006b;

    /* renamed from: c */
    private final String f11007c;

    /* renamed from: d */
    private final int f11008d;

    /* renamed from: e */
    private final long f11009e;

    /* renamed from: f */
    private final String f11010f;

    /* renamed from: a */
    private final byte[] f11005a = new byte[8192];

    /* renamed from: g */
    private int f11011g = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3863j2(C3924z c3924z, String str, int i, long j, String str2) {
        this.f11006b = c3924z;
        this.f11007c = str;
        this.f11008d = i;
        this.f11009e = j;
        this.f11010f = str2;
    }

    /* renamed from: n */
    private final File m28700n() {
        File m28577y = this.f11006b.m28577y(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
        if (!m28577y.exists()) {
            m28577y.mkdirs();
        }
        return m28577y;
    }

    /* renamed from: o */
    private final File m28699o() throws IOException {
        File m28588n = this.f11006b.m28588n(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
        m28588n.getParentFile().mkdirs();
        m28588n.createNewFile();
        return m28588n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3859i2 m28713a() throws IOException {
        File m28588n = this.f11006b.m28588n(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
        if (m28588n.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(m28588n);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C3893r0("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f11011g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C3859i2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C3893r0("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    C1863t.m35249a(th2, th3);
                }
                throw th2;
            }
        }
        throw new C3893r0("Slice checkpoint file does not exist.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m28712b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m28705i().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f11011g));
        FileOutputStream fileOutputStream = new FileOutputStream(m28699o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m28711c(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m28705i(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m28710d(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(m28705i(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f11005a);
                if (read > 0) {
                    randomAccessFile.write(this.f11005a, 0, read);
                }
            } while (read == this.f11005a.length);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m28709e(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f11011g));
        FileOutputStream fileOutputStream = new FileOutputStream(m28699o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m28708f(byte[] bArr) throws IOException {
        this.f11011g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m28700n(), String.format("%s-LFH.dat", Integer.valueOf(this.f11011g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new C3893r0("Could not write metadata file.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m28707g(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f11011g));
        FileOutputStream fileOutputStream = new FileOutputStream(m28699o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File m28583s = this.f11006b.m28583s(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
            if (m28583s.exists()) {
                m28583s.delete();
            }
            fileOutputStream = new FileOutputStream(m28583s);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    C1863t.m35249a(th, th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m28706h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f11011g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m28705i());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f11005a);
            while (read > 0) {
                fileOutputStream.write(this.f11005a, 0, read);
                read = inputStream.read(this.f11005a);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final File m28705i() {
        return new File(m28700n(), String.format("%s-NAM.dat", Integer.valueOf(this.f11011g)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m28704j(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f11011g));
        FileOutputStream fileOutputStream = new FileOutputStream(m28699o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m28703k(byte[] bArr, int i) throws IOException {
        this.f11011g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m28705i());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                C1863t.m35249a(th2, th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final int m28702l() throws IOException {
        File m28588n = this.f11006b.m28588n(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
        if (m28588n.exists()) {
            FileInputStream fileInputStream = new FileInputStream(m28588n);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new C3893r0("Slice checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    C1863t.m35249a(th2, th3);
                }
                throw th2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean m28701m() {
        File m28588n = this.f11006b.m28588n(this.f11007c, this.f11008d, this.f11009e, this.f11010f);
        if (m28588n.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(m28588n);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f11004h.m35278e("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e) {
                f11004h.m35278e("Could not read checkpoint while checking if extraction finished. %s", e);
                return false;
            }
        }
        return false;
    }
}
