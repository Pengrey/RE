package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.C1295b;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* renamed from: androidx.exifinterface.media.a */
/* loaded from: classes.dex */
public class C1288a {

    /* renamed from: G */
    private static SimpleDateFormat f3713G;

    /* renamed from: H */
    private static SimpleDateFormat f3714H;

    /* renamed from: I */
    static final String[] f3715I;

    /* renamed from: J */
    static final int[] f3716J;

    /* renamed from: K */
    static final byte[] f3717K;

    /* renamed from: L */
    private static final C1292d[] f3718L;

    /* renamed from: M */
    private static final C1292d[] f3719M;

    /* renamed from: N */
    private static final C1292d[] f3720N;

    /* renamed from: O */
    private static final C1292d[] f3721O;

    /* renamed from: P */
    private static final C1292d[] f3722P;

    /* renamed from: Q */
    private static final C1292d f3723Q;

    /* renamed from: R */
    private static final C1292d[] f3724R;

    /* renamed from: S */
    private static final C1292d[] f3725S;

    /* renamed from: T */
    private static final C1292d[] f3726T;

    /* renamed from: U */
    private static final C1292d[] f3727U;

    /* renamed from: V */
    static final C1292d[][] f3728V;

    /* renamed from: W */
    private static final C1292d[] f3729W;

    /* renamed from: X */
    private static final HashMap<Integer, C1292d>[] f3730X;

    /* renamed from: Y */
    private static final HashMap<String, C1292d>[] f3731Y;

    /* renamed from: Z */
    private static final HashSet<String> f3732Z;

    /* renamed from: a0 */
    private static final HashMap<Integer, Integer> f3733a0;

    /* renamed from: b0 */
    static final Charset f3734b0;

    /* renamed from: c0 */
    static final byte[] f3735c0;

    /* renamed from: d0 */
    private static final byte[] f3736d0;

    /* renamed from: a */
    private String f3737a;

    /* renamed from: b */
    private FileDescriptor f3738b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f3739c;

    /* renamed from: d */
    private int f3740d;

    /* renamed from: e */
    private boolean f3741e;

    /* renamed from: f */
    private final HashMap<String, C1291c>[] f3742f;

    /* renamed from: g */
    private Set<Integer> f3743g;

    /* renamed from: h */
    private ByteOrder f3744h;

    /* renamed from: i */
    private boolean f3745i;

    /* renamed from: j */
    private int f3746j;

    /* renamed from: k */
    private int f3747k;

    /* renamed from: l */
    private int f3748l;

    /* renamed from: m */
    private int f3749m;

    /* renamed from: n */
    private int f3750n;

    /* renamed from: o */
    private static final boolean f3751o = Log.isLoggable("ExifInterface", 3);

    /* renamed from: p */
    private static final List<Integer> f3752p = Arrays.asList(1, 6, 3, 8);

    /* renamed from: q */
    private static final List<Integer> f3753q = Arrays.asList(2, 7, 4, 5);

    /* renamed from: r */
    public static final int[] f3754r = {8, 8, 8};

    /* renamed from: s */
    public static final int[] f3755s = {8};

    /* renamed from: t */
    static final byte[] f3756t = {-1, -40, -1};

    /* renamed from: u */
    private static final byte[] f3757u = {102, 116, 121, 112};

    /* renamed from: v */
    private static final byte[] f3758v = {109, 105, 102, 49};

    /* renamed from: w */
    private static final byte[] f3759w = {104, 101, 105, 99};

    /* renamed from: x */
    private static final byte[] f3760x = {79, 76, 89, 77, 80, 0};

    /* renamed from: y */
    private static final byte[] f3761y = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: z */
    private static final byte[] f3762z = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: A */
    private static final byte[] f3763A = {101, 88, 73, 102};

    /* renamed from: B */
    private static final byte[] f3764B = {73, 72, 68, 82};

    /* renamed from: C */
    private static final byte[] f3765C = {73, 69, 78, 68};

    /* renamed from: D */
    private static final byte[] f3766D = {82, 73, 70, 70};

    /* renamed from: E */
    private static final byte[] f3767E = {87, 69, 66, 80};

    /* renamed from: F */
    private static final byte[] f3768F = {69, 88, 73, 70};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$a */
    /* loaded from: classes.dex */
    public class C1289a extends MediaDataSource {

        /* renamed from: w */
        long f3769w;

        /* renamed from: x */
        final /* synthetic */ C1294f f3770x;

        C1289a(C1288a c1288a, C1294f c1294f) {
            this.f3770x = c1294f;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f3769w;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f3770x.available()) {
                        return -1;
                    }
                    this.f3770x.m37681t(j);
                    this.f3769w = j;
                }
                if (i2 > this.f3770x.available()) {
                    i2 = this.f3770x.available();
                }
                int read = this.f3770x.read(bArr, i, i2);
                if (read >= 0) {
                    this.f3769w += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3769w = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$b */
    /* loaded from: classes.dex */
    public static class C1290b extends InputStream implements DataInput {

        /* renamed from: A */
        private static final ByteOrder f3771A = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: B */
        private static final ByteOrder f3772B = ByteOrder.BIG_ENDIAN;

        /* renamed from: w */
        final DataInputStream f3773w;

        /* renamed from: x */
        private ByteOrder f3774x;

        /* renamed from: y */
        int f3775y;

        /* renamed from: z */
        private byte[] f3776z;

        C1290b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int m37698a() {
            return this.f3775y;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f3773w.available();
        }

        /* renamed from: c */
        public long m37697c() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: e */
        public void m37696e(ByteOrder byteOrder) {
            this.f3774x = byteOrder;
        }

        /* renamed from: h */
        public void m37695h(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f3773w.skip(i3);
                if (skip <= 0) {
                    if (this.f3776z == null) {
                        this.f3776z = new byte[8192];
                    }
                    skip = this.f3773w.read(this.f3776z, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f3775y += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f3775y++;
            return this.f3773w.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f3775y++;
            return this.f3773w.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f3775y++;
            int read = this.f3773w.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f3775y += 2;
            return this.f3773w.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f3775y += i2;
            this.f3773w.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f3775y += 4;
            int read = this.f3773w.read();
            int read2 = this.f3773w.read();
            int read3 = this.f3773w.read();
            int read4 = this.f3773w.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f3774x;
                if (byteOrder == f3771A) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3772B) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f3774x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f3775y += 8;
            int read = this.f3773w.read();
            int read2 = this.f3773w.read();
            int read3 = this.f3773w.read();
            int read4 = this.f3773w.read();
            int read5 = this.f3773w.read();
            int read6 = this.f3773w.read();
            int read7 = this.f3773w.read();
            int read8 = this.f3773w.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f3774x;
                if (byteOrder == f3771A) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3772B) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f3774x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f3775y += 2;
            int read = this.f3773w.read();
            int read2 = this.f3773w.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3774x;
                if (byteOrder == f3771A) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f3772B) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f3774x);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f3775y += 2;
            return this.f3773w.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f3775y++;
            return this.f3773w.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f3775y += 2;
            int read = this.f3773w.read();
            int read2 = this.f3773w.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3774x;
                if (byteOrder == f3771A) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f3772B) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f3774x);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        C1290b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        C1290b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f3774x = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3773w = dataInputStream;
            dataInputStream.mark(0);
            this.f3775y = 0;
            this.f3774x = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f3773w.read(bArr, i, i2);
            this.f3775y += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f3775y += bArr.length;
            this.f3773w.readFully(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$c */
    /* loaded from: classes.dex */
    public static class C1291c {

        /* renamed from: a */
        public final int f3777a;

        /* renamed from: b */
        public final int f3778b;

        /* renamed from: c */
        public final long f3779c;

        /* renamed from: d */
        public final byte[] f3780d;

        C1291c(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C1291c m37694a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C1288a.f3734b0);
            return new C1291c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C1291c m37693b(long j, ByteOrder byteOrder) {
            return m37692c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C1291c m37692c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1288a.f3716J[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C1291c(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C1291c m37691d(C1293e c1293e, ByteOrder byteOrder) {
            return m37690e(new C1293e[]{c1293e}, byteOrder);
        }

        /* renamed from: e */
        public static C1291c m37690e(C1293e[] c1293eArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1288a.f3716J[5] * c1293eArr.length]);
            wrap.order(byteOrder);
            for (C1293e c1293e : c1293eArr) {
                wrap.putInt((int) c1293e.f3785a);
                wrap.putInt((int) c1293e.f3786b);
            }
            return new C1291c(5, c1293eArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C1291c m37689f(int i, ByteOrder byteOrder) {
            return m37688g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C1291c m37688g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C1288a.f3716J[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C1291c(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double m37687h(ByteOrder byteOrder) {
            Object m37684k = m37684k(byteOrder);
            if (m37684k != null) {
                if (m37684k instanceof String) {
                    return Double.parseDouble((String) m37684k);
                }
                if (m37684k instanceof long[]) {
                    long[] jArr = (long[]) m37684k;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m37684k instanceof int[]) {
                    int[] iArr = (int[]) m37684k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m37684k instanceof double[]) {
                    double[] dArr = (double[]) m37684k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m37684k instanceof C1293e[]) {
                    C1293e[] c1293eArr = (C1293e[]) m37684k;
                    if (c1293eArr.length == 1) {
                        return c1293eArr[0].m37682a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: i */
        public int m37686i(ByteOrder byteOrder) {
            Object m37684k = m37684k(byteOrder);
            if (m37684k != null) {
                if (m37684k instanceof String) {
                    return Integer.parseInt((String) m37684k);
                }
                if (m37684k instanceof long[]) {
                    long[] jArr = (long[]) m37684k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m37684k instanceof int[]) {
                    int[] iArr = (int[]) m37684k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: j */
        public String m37685j(ByteOrder byteOrder) {
            Object m37684k = m37684k(byteOrder);
            if (m37684k == null) {
                return null;
            }
            if (m37684k instanceof String) {
                return (String) m37684k;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (m37684k instanceof long[]) {
                long[] jArr = (long[]) m37684k;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (m37684k instanceof int[]) {
                int[] iArr = (int[]) m37684k;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (m37684k instanceof double[]) {
                double[] dArr = (double[]) m37684k;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (m37684k instanceof C1293e[]) {
                C1293e[] c1293eArr = (C1293e[]) m37684k;
                while (i < c1293eArr.length) {
                    sb2.append(c1293eArr[i].f3785a);
                    sb2.append('/');
                    sb2.append(c1293eArr[i].f3786b);
                    i++;
                    if (i != c1293eArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:176:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m37684k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1288a.C1291c.m37684k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C1288a.f3715I[this.f3777a] + ", data length:" + this.f3780d.length + ")";
        }

        C1291c(int i, int i2, long j, byte[] bArr) {
            this.f3777a = i;
            this.f3778b = i2;
            this.f3779c = j;
            this.f3780d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$e */
    /* loaded from: classes.dex */
    public static class C1293e {

        /* renamed from: a */
        public final long f3785a;

        /* renamed from: b */
        public final long f3786b;

        C1293e(long j, long j2) {
            if (j2 == 0) {
                this.f3785a = 0L;
                this.f3786b = 1L;
                return;
            }
            this.f3785a = j;
            this.f3786b = j2;
        }

        /* renamed from: a */
        public double m37682a() {
            return this.f3785a / this.f3786b;
        }

        public String toString() {
            return this.f3785a + "/" + this.f3786b;
        }
    }

    static {
        C1292d[] c1292dArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f3715I = new String[]{BuildConfig.VERSION_NAME, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f3716J = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f3717K = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1292d[] c1292dArr2 = {new C1292d("NewSubfileType", 254, 4), new C1292d("SubfileType", 255, 4), new C1292d("ImageWidth", 256, 3, 4), new C1292d("ImageLength", 257, 3, 4), new C1292d("BitsPerSample", 258, 3), new C1292d("Compression", 259, 3), new C1292d("PhotometricInterpretation", 262, 3), new C1292d("ImageDescription", 270, 2), new C1292d("Make", 271, 2), new C1292d("Model", 272, 2), new C1292d("StripOffsets", 273, 3, 4), new C1292d("Orientation", 274, 3), new C1292d("SamplesPerPixel", 277, 3), new C1292d("RowsPerStrip", 278, 3, 4), new C1292d("StripByteCounts", 279, 3, 4), new C1292d("XResolution", 282, 5), new C1292d("YResolution", 283, 5), new C1292d("PlanarConfiguration", 284, 3), new C1292d("ResolutionUnit", 296, 3), new C1292d("TransferFunction", 301, 3), new C1292d("Software", 305, 2), new C1292d("DateTime", 306, 2), new C1292d("Artist", 315, 2), new C1292d("WhitePoint", 318, 5), new C1292d("PrimaryChromaticities", 319, 5), new C1292d("SubIFDPointer", 330, 4), new C1292d("JPEGInterchangeFormat", 513, 4), new C1292d("JPEGInterchangeFormatLength", 514, 4), new C1292d("YCbCrCoefficients", 529, 5), new C1292d("YCbCrSubSampling", 530, 3), new C1292d("YCbCrPositioning", 531, 3), new C1292d("ReferenceBlackWhite", 532, 5), new C1292d("Copyright", 33432, 2), new C1292d("ExifIFDPointer", 34665, 4), new C1292d("GPSInfoIFDPointer", 34853, 4), new C1292d("SensorTopBorder", 4, 4), new C1292d("SensorLeftBorder", 5, 4), new C1292d("SensorBottomBorder", 6, 4), new C1292d("SensorRightBorder", 7, 4), new C1292d("ISO", 23, 3), new C1292d("JpgFromRaw", 46, 7), new C1292d("Xmp", 700, 1)};
        f3718L = c1292dArr2;
        C1292d[] c1292dArr3 = {new C1292d("ExposureTime", 33434, 5), new C1292d("FNumber", 33437, 5), new C1292d("ExposureProgram", 34850, 3), new C1292d("SpectralSensitivity", 34852, 2), new C1292d("PhotographicSensitivity", 34855, 3), new C1292d("OECF", 34856, 7), new C1292d("SensitivityType", 34864, 3), new C1292d("StandardOutputSensitivity", 34865, 4), new C1292d("RecommendedExposureIndex", 34866, 4), new C1292d("ISOSpeed", 34867, 4), new C1292d("ISOSpeedLatitudeyyy", 34868, 4), new C1292d("ISOSpeedLatitudezzz", 34869, 4), new C1292d("ExifVersion", 36864, 2), new C1292d("DateTimeOriginal", 36867, 2), new C1292d("DateTimeDigitized", 36868, 2), new C1292d("OffsetTime", 36880, 2), new C1292d("OffsetTimeOriginal", 36881, 2), new C1292d("OffsetTimeDigitized", 36882, 2), new C1292d("ComponentsConfiguration", 37121, 7), new C1292d("CompressedBitsPerPixel", 37122, 5), new C1292d("ShutterSpeedValue", 37377, 10), new C1292d("ApertureValue", 37378, 5), new C1292d("BrightnessValue", 37379, 10), new C1292d("ExposureBiasValue", 37380, 10), new C1292d("MaxApertureValue", 37381, 5), new C1292d("SubjectDistance", 37382, 5), new C1292d("MeteringMode", 37383, 3), new C1292d("LightSource", 37384, 3), new C1292d("Flash", 37385, 3), new C1292d("FocalLength", 37386, 5), new C1292d("SubjectArea", 37396, 3), new C1292d("MakerNote", 37500, 7), new C1292d("UserComment", 37510, 7), new C1292d("SubSecTime", 37520, 2), new C1292d("SubSecTimeOriginal", 37521, 2), new C1292d("SubSecTimeDigitized", 37522, 2), new C1292d("FlashpixVersion", 40960, 7), new C1292d("ColorSpace", 40961, 3), new C1292d("PixelXDimension", 40962, 3, 4), new C1292d("PixelYDimension", 40963, 3, 4), new C1292d("RelatedSoundFile", 40964, 2), new C1292d("InteroperabilityIFDPointer", 40965, 4), new C1292d("FlashEnergy", 41483, 5), new C1292d("SpatialFrequencyResponse", 41484, 7), new C1292d("FocalPlaneXResolution", 41486, 5), new C1292d("FocalPlaneYResolution", 41487, 5), new C1292d("FocalPlaneResolutionUnit", 41488, 3), new C1292d("SubjectLocation", 41492, 3), new C1292d("ExposureIndex", 41493, 5), new C1292d("SensingMethod", 41495, 3), new C1292d("FileSource", 41728, 7), new C1292d("SceneType", 41729, 7), new C1292d("CFAPattern", 41730, 7), new C1292d("CustomRendered", 41985, 3), new C1292d("ExposureMode", 41986, 3), new C1292d("WhiteBalance", 41987, 3), new C1292d("DigitalZoomRatio", 41988, 5), new C1292d("FocalLengthIn35mmFilm", 41989, 3), new C1292d("SceneCaptureType", 41990, 3), new C1292d("GainControl", 41991, 3), new C1292d("Contrast", 41992, 3), new C1292d("Saturation", 41993, 3), new C1292d("Sharpness", 41994, 3), new C1292d("DeviceSettingDescription", 41995, 7), new C1292d("SubjectDistanceRange", 41996, 3), new C1292d("ImageUniqueID", 42016, 2), new C1292d("CameraOwnerName", 42032, 2), new C1292d("BodySerialNumber", 42033, 2), new C1292d("LensSpecification", 42034, 5), new C1292d("LensMake", 42035, 2), new C1292d("LensModel", 42036, 2), new C1292d("Gamma", 42240, 5), new C1292d("DNGVersion", 50706, 1), new C1292d("DefaultCropSize", 50720, 3, 4)};
        f3719M = c1292dArr3;
        C1292d[] c1292dArr4 = {new C1292d("GPSVersionID", 0, 1), new C1292d("GPSLatitudeRef", 1, 2), new C1292d("GPSLatitude", 2, 5, 10), new C1292d("GPSLongitudeRef", 3, 2), new C1292d("GPSLongitude", 4, 5, 10), new C1292d("GPSAltitudeRef", 5, 1), new C1292d("GPSAltitude", 6, 5), new C1292d("GPSTimeStamp", 7, 5), new C1292d("GPSSatellites", 8, 2), new C1292d("GPSStatus", 9, 2), new C1292d("GPSMeasureMode", 10, 2), new C1292d("GPSDOP", 11, 5), new C1292d("GPSSpeedRef", 12, 2), new C1292d("GPSSpeed", 13, 5), new C1292d("GPSTrackRef", 14, 2), new C1292d("GPSTrack", 15, 5), new C1292d("GPSImgDirectionRef", 16, 2), new C1292d("GPSImgDirection", 17, 5), new C1292d("GPSMapDatum", 18, 2), new C1292d("GPSDestLatitudeRef", 19, 2), new C1292d("GPSDestLatitude", 20, 5), new C1292d("GPSDestLongitudeRef", 21, 2), new C1292d("GPSDestLongitude", 22, 5), new C1292d("GPSDestBearingRef", 23, 2), new C1292d("GPSDestBearing", 24, 5), new C1292d("GPSDestDistanceRef", 25, 2), new C1292d("GPSDestDistance", 26, 5), new C1292d("GPSProcessingMethod", 27, 7), new C1292d("GPSAreaInformation", 28, 7), new C1292d("GPSDateStamp", 29, 2), new C1292d("GPSDifferential", 30, 3), new C1292d("GPSHPositioningError", 31, 5)};
        f3720N = c1292dArr4;
        C1292d[] c1292dArr5 = {new C1292d("InteroperabilityIndex", 1, 2)};
        f3721O = c1292dArr5;
        C1292d[] c1292dArr6 = {new C1292d("NewSubfileType", 254, 4), new C1292d("SubfileType", 255, 4), new C1292d("ThumbnailImageWidth", 256, 3, 4), new C1292d("ThumbnailImageLength", 257, 3, 4), new C1292d("BitsPerSample", 258, 3), new C1292d("Compression", 259, 3), new C1292d("PhotometricInterpretation", 262, 3), new C1292d("ImageDescription", 270, 2), new C1292d("Make", 271, 2), new C1292d("Model", 272, 2), new C1292d("StripOffsets", 273, 3, 4), new C1292d("ThumbnailOrientation", 274, 3), new C1292d("SamplesPerPixel", 277, 3), new C1292d("RowsPerStrip", 278, 3, 4), new C1292d("StripByteCounts", 279, 3, 4), new C1292d("XResolution", 282, 5), new C1292d("YResolution", 283, 5), new C1292d("PlanarConfiguration", 284, 3), new C1292d("ResolutionUnit", 296, 3), new C1292d("TransferFunction", 301, 3), new C1292d("Software", 305, 2), new C1292d("DateTime", 306, 2), new C1292d("Artist", 315, 2), new C1292d("WhitePoint", 318, 5), new C1292d("PrimaryChromaticities", 319, 5), new C1292d("SubIFDPointer", 330, 4), new C1292d("JPEGInterchangeFormat", 513, 4), new C1292d("JPEGInterchangeFormatLength", 514, 4), new C1292d("YCbCrCoefficients", 529, 5), new C1292d("YCbCrSubSampling", 530, 3), new C1292d("YCbCrPositioning", 531, 3), new C1292d("ReferenceBlackWhite", 532, 5), new C1292d("Xmp", 700, 1), new C1292d("Copyright", 33432, 2), new C1292d("ExifIFDPointer", 34665, 4), new C1292d("GPSInfoIFDPointer", 34853, 4), new C1292d("DNGVersion", 50706, 1), new C1292d("DefaultCropSize", 50720, 3, 4)};
        f3722P = c1292dArr6;
        f3723Q = new C1292d("StripOffsets", 273, 3);
        C1292d[] c1292dArr7 = {new C1292d("ThumbnailImage", 256, 7), new C1292d("CameraSettingsIFDPointer", 8224, 4), new C1292d("ImageProcessingIFDPointer", 8256, 4)};
        f3724R = c1292dArr7;
        C1292d[] c1292dArr8 = {new C1292d("PreviewImageStart", 257, 4), new C1292d("PreviewImageLength", 258, 4)};
        f3725S = c1292dArr8;
        C1292d[] c1292dArr9 = {new C1292d("AspectFrame", 4371, 3)};
        f3726T = c1292dArr9;
        C1292d[] c1292dArr10 = {new C1292d("ColorSpace", 55, 3)};
        f3727U = c1292dArr10;
        C1292d[][] c1292dArr11 = {c1292dArr2, c1292dArr3, c1292dArr4, c1292dArr5, c1292dArr6, c1292dArr2, c1292dArr7, c1292dArr8, c1292dArr9, c1292dArr10};
        f3728V = c1292dArr11;
        f3729W = new C1292d[]{new C1292d("SubIFDPointer", 330, 4), new C1292d("ExifIFDPointer", 34665, 4), new C1292d("GPSInfoIFDPointer", 34853, 4), new C1292d("InteroperabilityIFDPointer", 40965, 4), new C1292d("CameraSettingsIFDPointer", 8224, 1), new C1292d("ImageProcessingIFDPointer", 8256, 1)};
        f3730X = new HashMap[c1292dArr11.length];
        f3731Y = new HashMap[c1292dArr11.length];
        f3732Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f3733a0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f3734b0 = forName;
        f3735c0 = "Exif\u0000\u0000".getBytes(forName);
        f3736d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f3713G = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f3714H = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C1292d[][] c1292dArr12 = f3728V;
            if (i < c1292dArr12.length) {
                f3730X[i] = new HashMap<>();
                f3731Y[i] = new HashMap<>();
                for (C1292d c1292d : c1292dArr12[i]) {
                    f3730X[i].put(Integer.valueOf(c1292d.f3781a), c1292d);
                    f3731Y[i].put(c1292d.f3782b, c1292d);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f3733a0;
                C1292d[] c1292dArr13 = f3729W;
                hashMap.put(Integer.valueOf(c1292dArr13[0].f3781a), 5);
                hashMap.put(Integer.valueOf(c1292dArr13[1].f3781a), 1);
                hashMap.put(Integer.valueOf(c1292dArr13[2].f3781a), 2);
                hashMap.put(Integer.valueOf(c1292dArr13[3].f3781a), 3);
                hashMap.put(Integer.valueOf(c1292dArr13[4].f3781a), 7);
                hashMap.put(Integer.valueOf(c1292dArr13[5].f3781a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C1288a(InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* renamed from: A */
    private boolean m37740A(HashMap hashMap) throws IOException {
        C1291c c1291c;
        int m37686i;
        C1291c c1291c2 = (C1291c) hashMap.get("BitsPerSample");
        if (c1291c2 != null) {
            int[] iArr = (int[]) c1291c2.m37684k(this.f3744h);
            int[] iArr2 = f3754r;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3740d == 3 && (c1291c = (C1291c) hashMap.get("PhotometricInterpretation")) != null && (((m37686i = c1291c.m37686i(this.f3744h)) == 1 && Arrays.equals(iArr, f3755s)) || (m37686i == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (f3751o) {
            Log.d("ExifInterface", "Unsupported data type value");
            return false;
        }
        return false;
    }

    /* renamed from: B */
    private boolean m37739B(HashMap hashMap) throws IOException {
        C1291c c1291c = (C1291c) hashMap.get("ImageLength");
        C1291c c1291c2 = (C1291c) hashMap.get("ImageWidth");
        if (c1291c == null || c1291c2 == null) {
            return false;
        }
        return c1291c.m37686i(this.f3744h) <= 512 && c1291c2.m37686i(this.f3744h) <= 512;
    }

    /* renamed from: C */
    private boolean m37738C(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f3766D;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f3767E;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f3766D.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: D */
    private void m37737D(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i = 0; i < f3728V.length; i++) {
            try {
                try {
                    this.f3742f[i] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e) {
                    boolean z = f3751o;
                    if (z) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m37724a();
                    if (!z) {
                        return;
                    }
                }
            } finally {
                m37724a();
                if (f3751o) {
                    m37735F();
                }
            }
        }
        if (!this.f3741e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f3740d = m37718g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m37728M(this.f3740d)) {
            C1294f c1294f = new C1294f(inputStream);
            if (this.f3741e) {
                m37711n(c1294f);
            } else {
                int i2 = this.f3740d;
                if (i2 == 12) {
                    m37720e(c1294f);
                } else if (i2 == 7) {
                    m37717h(c1294f);
                } else if (i2 == 10) {
                    m37712m(c1294f);
                } else {
                    m37714k(c1294f);
                }
            }
            c1294f.m37681t(this.f3747k);
            m37729L(c1294f);
        } else {
            C1290b c1290b = new C1290b(inputStream);
            int i3 = this.f3740d;
            if (i3 == 4) {
                m37719f(c1290b, 0, 0);
            } else if (i3 == 13) {
                m37716i(c1290b);
            } else if (i3 == 9) {
                m37715j(c1290b);
            } else if (i3 == 14) {
                m37710o(c1290b);
            }
        }
    }

    /* renamed from: E */
    private void m37736E(C1290b c1290b) throws IOException {
        ByteOrder m37734G = m37734G(c1290b);
        this.f3744h = m37734G;
        c1290b.m37696e(m37734G);
        int readUnsignedShort = c1290b.readUnsignedShort();
        int i = this.f3740d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c1290b.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            c1290b.m37695h(i2);
        }
    }

    /* renamed from: F */
    private void m37735F() {
        for (int i = 0; i < this.f3742f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f3742f[i].size());
            for (Map.Entry<String, C1291c> entry : this.f3742f[i].entrySet()) {
                C1291c value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m37685j(this.f3744h) + "'");
            }
        }
    }

    /* renamed from: G */
    private ByteOrder m37734G(C1290b c1290b) throws IOException {
        short readShort = c1290b.readShort();
        if (readShort == 18761) {
            if (f3751o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f3751o) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: H */
    private void m37733H(byte[] bArr, int i) throws IOException {
        C1294f c1294f = new C1294f(bArr);
        m37736E(c1294f);
        m37732I(c1294f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m37732I(androidx.exifinterface.media.C1288a.C1294f r30, int r31) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1288a.m37732I(androidx.exifinterface.media.a$f, int):void");
    }

    /* renamed from: J */
    private void m37731J(int i, String str, String str2) {
        if (this.f3742f[i].isEmpty() || this.f3742f[i].get(str) == null) {
            return;
        }
        HashMap<String, C1291c>[] hashMapArr = this.f3742f;
        hashMapArr[i].put(str2, hashMapArr[i].get(str));
        this.f3742f[i].remove(str);
    }

    /* renamed from: K */
    private void m37730K(C1294f c1294f, int i) throws IOException {
        C1291c c1291c = this.f3742f[i].get("ImageLength");
        C1291c c1291c2 = this.f3742f[i].get("ImageWidth");
        if (c1291c == null || c1291c2 == null) {
            C1291c c1291c3 = this.f3742f[i].get("JPEGInterchangeFormat");
            C1291c c1291c4 = this.f3742f[i].get("JPEGInterchangeFormatLength");
            if (c1291c3 == null || c1291c4 == null) {
                return;
            }
            int m37686i = c1291c3.m37686i(this.f3744h);
            int m37686i2 = c1291c3.m37686i(this.f3744h);
            c1294f.m37681t(m37686i);
            byte[] bArr = new byte[m37686i2];
            c1294f.read(bArr);
            m37719f(new C1290b(bArr), m37686i, i);
        }
    }

    /* renamed from: L */
    private void m37729L(C1290b c1290b) throws IOException {
        HashMap<String, C1291c> hashMap = this.f3742f[4];
        C1291c c1291c = hashMap.get("Compression");
        if (c1291c != null) {
            int m37686i = c1291c.m37686i(this.f3744h);
            this.f3746j = m37686i;
            if (m37686i != 1) {
                if (m37686i == 6) {
                    m37709p(c1290b, hashMap);
                    return;
                } else if (m37686i != 7) {
                    return;
                }
            }
            if (m37740A(hashMap)) {
                m37708q(c1290b, hashMap);
                return;
            }
            return;
        }
        this.f3746j = 6;
        m37709p(c1290b, hashMap);
    }

    /* renamed from: M */
    private static boolean m37728M(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: N */
    private void m37727N(int i, int i2) throws IOException {
        if (!this.f3742f[i].isEmpty() && !this.f3742f[i2].isEmpty()) {
            C1291c c1291c = this.f3742f[i].get("ImageLength");
            C1291c c1291c2 = this.f3742f[i].get("ImageWidth");
            C1291c c1291c3 = this.f3742f[i2].get("ImageLength");
            C1291c c1291c4 = this.f3742f[i2].get("ImageWidth");
            if (c1291c == null || c1291c2 == null) {
                if (f3751o) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (c1291c3 != null && c1291c4 != null) {
                int m37686i = c1291c.m37686i(this.f3744h);
                int m37686i2 = c1291c2.m37686i(this.f3744h);
                int m37686i3 = c1291c3.m37686i(this.f3744h);
                int m37686i4 = c1291c4.m37686i(this.f3744h);
                if (m37686i >= m37686i3 || m37686i2 >= m37686i4) {
                    return;
                }
                HashMap<String, C1291c>[] hashMapArr = this.f3742f;
                HashMap<String, C1291c> hashMap = hashMapArr[i];
                hashMapArr[i] = hashMapArr[i2];
                hashMapArr[i2] = hashMap;
            } else if (f3751o) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f3751o) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: O */
    private void m37726O(C1294f c1294f, int i) throws IOException {
        C1291c m37689f;
        C1291c m37689f2;
        C1291c c1291c = this.f3742f[i].get("DefaultCropSize");
        C1291c c1291c2 = this.f3742f[i].get("SensorTopBorder");
        C1291c c1291c3 = this.f3742f[i].get("SensorLeftBorder");
        C1291c c1291c4 = this.f3742f[i].get("SensorBottomBorder");
        C1291c c1291c5 = this.f3742f[i].get("SensorRightBorder");
        if (c1291c == null) {
            if (c1291c2 != null && c1291c3 != null && c1291c4 != null && c1291c5 != null) {
                int m37686i = c1291c2.m37686i(this.f3744h);
                int m37686i2 = c1291c4.m37686i(this.f3744h);
                int m37686i3 = c1291c5.m37686i(this.f3744h);
                int m37686i4 = c1291c3.m37686i(this.f3744h);
                if (m37686i2 <= m37686i || m37686i3 <= m37686i4) {
                    return;
                }
                C1291c m37689f3 = C1291c.m37689f(m37686i2 - m37686i, this.f3744h);
                C1291c m37689f4 = C1291c.m37689f(m37686i3 - m37686i4, this.f3744h);
                this.f3742f[i].put("ImageLength", m37689f3);
                this.f3742f[i].put("ImageWidth", m37689f4);
                return;
            }
            m37730K(c1294f, i);
            return;
        }
        if (c1291c.f3777a == 5) {
            C1293e[] c1293eArr = (C1293e[]) c1291c.m37684k(this.f3744h);
            if (c1293eArr != null && c1293eArr.length == 2) {
                m37689f = C1291c.m37691d(c1293eArr[0], this.f3744h);
                m37689f2 = C1291c.m37691d(c1293eArr[1], this.f3744h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c1293eArr));
                return;
            }
        } else {
            int[] iArr = (int[]) c1291c.m37684k(this.f3744h);
            if (iArr != null && iArr.length == 2) {
                m37689f = C1291c.m37689f(iArr[0], this.f3744h);
                m37689f2 = C1291c.m37689f(iArr[1], this.f3744h);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f3742f[i].put("ImageWidth", m37689f);
        this.f3742f[i].put("ImageLength", m37689f2);
    }

    /* renamed from: P */
    private void m37725P() throws IOException {
        m37727N(0, 5);
        m37727N(0, 4);
        m37727N(5, 4);
        C1291c c1291c = this.f3742f[1].get("PixelXDimension");
        C1291c c1291c2 = this.f3742f[1].get("PixelYDimension");
        if (c1291c != null && c1291c2 != null) {
            this.f3742f[0].put("ImageWidth", c1291c);
            this.f3742f[0].put("ImageLength", c1291c2);
        }
        if (this.f3742f[4].isEmpty() && m37739B(this.f3742f[5])) {
            HashMap<String, C1291c>[] hashMapArr = this.f3742f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m37739B(this.f3742f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m37731J(0, "ThumbnailOrientation", "Orientation");
        m37731J(0, "ThumbnailImageLength", "ImageLength");
        m37731J(0, "ThumbnailImageWidth", "ImageWidth");
        m37731J(5, "ThumbnailOrientation", "Orientation");
        m37731J(5, "ThumbnailImageLength", "ImageLength");
        m37731J(5, "ThumbnailImageWidth", "ImageWidth");
        m37731J(4, "Orientation", "ThumbnailOrientation");
        m37731J(4, "ImageLength", "ThumbnailImageLength");
        m37731J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: a */
    private void m37724a() {
        String m37723b = m37723b("DateTimeOriginal");
        if (m37723b != null && m37723b("DateTime") == null) {
            this.f3742f[0].put("DateTime", C1291c.m37694a(m37723b));
        }
        if (m37723b("ImageWidth") == null) {
            this.f3742f[0].put("ImageWidth", C1291c.m37693b(0L, this.f3744h));
        }
        if (m37723b("ImageLength") == null) {
            this.f3742f[0].put("ImageLength", C1291c.m37693b(0L, this.f3744h));
        }
        if (m37723b("Orientation") == null) {
            this.f3742f[0].put("Orientation", C1291c.m37693b(0L, this.f3744h));
        }
        if (m37723b("LightSource") == null) {
            this.f3742f[1].put("LightSource", C1291c.m37693b(0L, this.f3744h));
        }
    }

    /* renamed from: d */
    private C1291c m37721d(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f3751o) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f3728V.length; i++) {
            C1291c c1291c = this.f3742f[i].get(str);
            if (c1291c != null) {
                return c1291c;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m37720e(C1294f c1294f) throws IOException {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    C1295b.C1297b.m37674a(mediaMetadataRetriever, new C1289a(this, c1294f));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    String str3 = null;
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str = mediaMetadataRetriever.extractMetadata(30);
                        str2 = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str = mediaMetadataRetriever.extractMetadata(19);
                        str2 = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str = null;
                        str2 = null;
                    }
                    if (str3 != null) {
                        this.f3742f[0].put("ImageWidth", C1291c.m37689f(Integer.parseInt(str3), this.f3744h));
                    }
                    if (str != null) {
                        this.f3742f[0].put("ImageLength", C1291c.m37689f(Integer.parseInt(str), this.f3744h));
                    }
                    if (str2 != null) {
                        int i = 1;
                        int parseInt = Integer.parseInt(str2);
                        if (parseInt == 90) {
                            i = 6;
                        } else if (parseInt == 180) {
                            i = 3;
                        } else if (parseInt == 270) {
                            i = 8;
                        }
                        this.f3742f[0].put("Orientation", C1291c.m37689f(i, this.f3744h));
                    }
                    if (extractMetadata != null && extractMetadata2 != null) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            c1294f.m37681t(parseInt2);
                            byte[] bArr = new byte[6];
                            if (c1294f.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f3735c0)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (c1294f.read(bArr2) == i3) {
                                        this.f3747k = i2;
                                        m37733H(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f3751o) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                    }
                    return;
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        }
        throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
        r21.m35207e(r20.f3762h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d A[LOOP:0: B:10:0x0038->B:63:0x017d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m37719f(androidx.exifinterface.media.C1288a.C1290b r21, int r22, int r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 534
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C1288a.m37719f(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* renamed from: g */
    private int m37718g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m37704u(bArr)) {
            return 4;
        }
        if (m37701x(bArr)) {
            return 9;
        }
        if (m37705t(bArr)) {
            return 12;
        }
        if (m37703v(bArr)) {
            return 7;
        }
        if (m37700y(bArr)) {
            return 10;
        }
        if (m37702w(bArr)) {
            return 13;
        }
        return m37738C(bArr) ? 14 : 0;
    }

    /* renamed from: h */
    private void m37717h(C1294f c1294f) throws IOException {
        m37714k(c1294f);
        C1291c c1291c = this.f3742f[1].get("MakerNote");
        if (c1291c != null) {
            C1294f c1294f2 = new C1294f(c1291c.f3780d);
            c1294f2.m37696e(this.f3744h);
            byte[] bArr = f3760x;
            byte[] bArr2 = new byte[bArr.length];
            c1294f2.readFully(bArr2);
            c1294f2.m37681t(0L);
            byte[] bArr3 = f3761y;
            byte[] bArr4 = new byte[bArr3.length];
            c1294f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c1294f2.m37681t(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c1294f2.m37681t(12L);
            }
            m37732I(c1294f2, 6);
            C1291c c1291c2 = this.f3742f[7].get("PreviewImageStart");
            C1291c c1291c3 = this.f3742f[7].get("PreviewImageLength");
            if (c1291c2 != null && c1291c3 != null) {
                this.f3742f[5].put("JPEGInterchangeFormat", c1291c2);
                this.f3742f[5].put("JPEGInterchangeFormatLength", c1291c3);
            }
            C1291c c1291c4 = this.f3742f[8].get("AspectFrame");
            if (c1291c4 != null) {
                int[] iArr = (int[]) c1291c4.m37684k(this.f3744h);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C1291c m37689f = C1291c.m37689f(i, this.f3744h);
                    C1291c m37689f2 = C1291c.m37689f(i2, this.f3744h);
                    this.f3742f[0].put("ImageWidth", m37689f);
                    this.f3742f[0].put("ImageLength", m37689f2);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: i */
    private void m37716i(C1290b c1290b) throws IOException {
        if (f3751o) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c1290b);
        }
        c1290b.m37696e(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f3762z;
        c1290b.m37695h(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = c1290b.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (c1290b.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f3764B)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (Arrays.equals(bArr2, f3765C)) {
                        return;
                    }
                    if (Arrays.equals(bArr2, f3763A)) {
                        byte[] bArr3 = new byte[readInt];
                        if (c1290b.read(bArr3) == readInt) {
                            int readInt2 = c1290b.readInt();
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr2);
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == readInt2) {
                                this.f3747k = i2;
                                m37733H(bArr3, 0);
                                m37725P();
                                m37729L(new C1290b(bArr3));
                                return;
                            }
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1295b.m37680a(bArr2));
                    }
                    int i3 = readInt + 4;
                    c1290b.m37695h(i3);
                    length = i2 + i3;
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: j */
    private void m37715j(C1290b c1290b) throws IOException {
        boolean z = f3751o;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c1290b);
        }
        c1290b.m37695h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c1290b.read(bArr);
        c1290b.read(bArr2);
        c1290b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c1290b.m37695h(i - c1290b.m37698a());
        c1290b.read(bArr4);
        m37719f(new C1290b(bArr4), i, 5);
        c1290b.m37695h(i3 - c1290b.m37698a());
        c1290b.m37696e(ByteOrder.BIG_ENDIAN);
        int readInt = c1290b.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c1290b.readUnsignedShort();
            int readUnsignedShort2 = c1290b.readUnsignedShort();
            if (readUnsignedShort == f3723Q.f3781a) {
                short readShort = c1290b.readShort();
                short readShort2 = c1290b.readShort();
                C1291c m37689f = C1291c.m37689f(readShort, this.f3744h);
                C1291c m37689f2 = C1291c.m37689f(readShort2, this.f3744h);
                this.f3742f[0].put("ImageLength", m37689f);
                this.f3742f[0].put("ImageWidth", m37689f2);
                if (f3751o) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c1290b.m37695h(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m37714k(C1294f c1294f) throws IOException {
        C1291c c1291c;
        m37736E(c1294f);
        m37732I(c1294f, 0);
        m37726O(c1294f, 0);
        m37726O(c1294f, 5);
        m37726O(c1294f, 4);
        m37725P();
        if (this.f3740d != 8 || (c1291c = this.f3742f[1].get("MakerNote")) == null) {
            return;
        }
        C1294f c1294f2 = new C1294f(c1291c.f3780d);
        c1294f2.m37696e(this.f3744h);
        c1294f2.m37695h(6);
        m37732I(c1294f2, 9);
        C1291c c1291c2 = this.f3742f[9].get("ColorSpace");
        if (c1291c2 != null) {
            this.f3742f[1].put("ColorSpace", c1291c2);
        }
    }

    /* renamed from: m */
    private void m37712m(C1294f c1294f) throws IOException {
        if (f3751o) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c1294f);
        }
        m37714k(c1294f);
        C1291c c1291c = this.f3742f[0].get("JpgFromRaw");
        if (c1291c != null) {
            m37719f(new C1290b(c1291c.f3780d), (int) c1291c.f3779c, 5);
        }
        C1291c c1291c2 = this.f3742f[0].get("ISO");
        C1291c c1291c3 = this.f3742f[1].get("PhotographicSensitivity");
        if (c1291c2 == null || c1291c3 != null) {
            return;
        }
        this.f3742f[1].put("PhotographicSensitivity", c1291c2);
    }

    /* renamed from: n */
    private void m37711n(C1294f c1294f) throws IOException {
        byte[] bArr = f3735c0;
        c1294f.m37695h(bArr.length);
        byte[] bArr2 = new byte[c1294f.available()];
        c1294f.readFully(bArr2);
        this.f3747k = bArr.length;
        m37733H(bArr2, 0);
    }

    /* renamed from: o */
    private void m37710o(C1290b c1290b) throws IOException {
        if (f3751o) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c1290b);
        }
        c1290b.m37696e(ByteOrder.LITTLE_ENDIAN);
        c1290b.m37695h(f3766D.length);
        int readInt = c1290b.readInt() + 8;
        byte[] bArr = f3767E;
        c1290b.m37695h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c1290b.read(bArr2) == 4) {
                    int readInt2 = c1290b.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f3768F, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (c1290b.read(bArr3) == readInt2) {
                            this.f3747k = i;
                            m37733H(bArr3, 0);
                            m37729L(new C1290b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C1295b.m37680a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length == readInt) {
                        return;
                    }
                    if (length <= readInt) {
                        c1290b.m37695h(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: p */
    private void m37709p(C1290b c1290b, HashMap hashMap) throws IOException {
        C1291c c1291c = (C1291c) hashMap.get("JPEGInterchangeFormat");
        C1291c c1291c2 = (C1291c) hashMap.get("JPEGInterchangeFormatLength");
        if (c1291c == null || c1291c2 == null) {
            return;
        }
        int m37686i = c1291c.m37686i(this.f3744h);
        int m37686i2 = c1291c2.m37686i(this.f3744h);
        if (this.f3740d == 7) {
            m37686i += this.f3748l;
        }
        if (m37686i > 0 && m37686i2 > 0 && this.f3737a == null && this.f3739c == null && this.f3738b == null) {
            c1290b.skip(m37686i);
            c1290b.read(new byte[m37686i2]);
        }
        if (f3751o) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m37686i + ", length: " + m37686i2);
        }
    }

    /* renamed from: q */
    private void m37708q(C1290b c1290b, HashMap hashMap) throws IOException {
        C1291c c1291c = (C1291c) hashMap.get("StripOffsets");
        C1291c c1291c2 = (C1291c) hashMap.get("StripByteCounts");
        if (c1291c == null || c1291c2 == null) {
            return;
        }
        long[] m37679b = C1295b.m37679b(c1291c.m37684k(this.f3744h));
        long[] m37679b2 = C1295b.m37679b(c1291c2.m37684k(this.f3744h));
        if (m37679b != null && m37679b.length != 0) {
            if (m37679b2 != null && m37679b2.length != 0) {
                if (m37679b.length != m37679b2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : m37679b2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f3745i = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < m37679b.length; i3++) {
                    int i4 = (int) m37679b[i3];
                    int i5 = (int) m37679b2[i3];
                    if (i3 < m37679b.length - 1 && i4 + i5 != m37679b[i3 + 1]) {
                        this.f3745i = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (c1290b.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (c1290b.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.f3745i) {
                    long j4 = m37679b[0];
                    return;
                }
                return;
            }
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
    }

    /* renamed from: r */
    private static boolean m37707r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f3735c0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f3735c0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: t */
    private boolean m37705t(byte[] bArr) throws IOException {
        C1290b c1290b;
        long readInt;
        byte[] bArr2;
        C1290b c1290b2 = null;
        try {
            try {
                c1290b = new C1290b(bArr);
                try {
                    readInt = c1290b.readInt();
                    bArr2 = new byte[4];
                    c1290b.read(bArr2);
                } catch (Exception e) {
                    e = e;
                    c1290b2 = c1290b;
                    if (f3751o) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (c1290b2 != null) {
                        c1290b2.close();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    c1290b2 = c1290b;
                    if (c1290b2 != null) {
                        c1290b2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (!Arrays.equals(bArr2, f3757u)) {
            c1290b.close();
            return false;
        }
        long j = 16;
        if (readInt == 1) {
            readInt = c1290b.readLong();
            if (readInt < 16) {
                c1290b.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            c1290b.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (c1290b.read(bArr3) != 4) {
                c1290b.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f3758v)) {
                    z = true;
                } else if (Arrays.equals(bArr3, f3759w)) {
                    z2 = true;
                }
                if (z && z2) {
                    c1290b.close();
                    return true;
                }
            }
        }
        c1290b.close();
        return false;
    }

    /* renamed from: u */
    private static boolean m37704u(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f3756t;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: v */
    private boolean m37703v(byte[] bArr) throws IOException {
        C1290b c1290b;
        boolean z = false;
        C1290b c1290b2 = null;
        try {
            c1290b = new C1290b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m37734G = m37734G(c1290b);
            this.f3744h = m37734G;
            c1290b.m37696e(m37734G);
            short readShort = c1290b.readShort();
            z = (readShort == 20306 || readShort == 21330) ? true : true;
            c1290b.close();
            return z;
        } catch (Exception unused2) {
            c1290b2 = c1290b;
            if (c1290b2 != null) {
                c1290b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c1290b2 = c1290b;
            if (c1290b2 != null) {
                c1290b2.close();
            }
            throw th;
        }
    }

    /* renamed from: w */
    private boolean m37702w(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f3762z;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: x */
    private boolean m37701x(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    private boolean m37700y(byte[] bArr) throws IOException {
        C1290b c1290b;
        C1290b c1290b2 = null;
        try {
            c1290b = new C1290b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ByteOrder m37734G = m37734G(c1290b);
            this.f3744h = m37734G;
            c1290b.m37696e(m37734G);
            boolean z = c1290b.readShort() == 85;
            c1290b.close();
            return z;
        } catch (Exception unused2) {
            c1290b2 = c1290b;
            if (c1290b2 != null) {
                c1290b2.close();
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            c1290b2 = c1290b;
            if (c1290b2 != null) {
                c1290b2.close();
            }
            throw th;
        }
    }

    /* renamed from: z */
    private static boolean m37699z(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C1295b.C1296a.m37675c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f3751o) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public String m37723b(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C1291c m37721d = m37721d(str);
        if (m37721d != null) {
            if (!f3732Z.contains(str)) {
                return m37721d.m37685j(this.f3744h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = m37721d.f3777a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m37721d.f3777a);
                    return null;
                }
                C1293e[] c1293eArr = (C1293e[]) m37721d.m37684k(this.f3744h);
                if (c1293eArr != null && c1293eArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c1293eArr[0].f3785a) / ((float) c1293eArr[0].f3786b))), Integer.valueOf((int) (((float) c1293eArr[1].f3785a) / ((float) c1293eArr[1].f3786b))), Integer.valueOf((int) (((float) c1293eArr[2].f3785a) / ((float) c1293eArr[2].f3786b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c1293eArr));
                return null;
            }
            try {
                return Double.toString(m37721d.m37687h(this.f3744h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public int m37722c(String str, int i) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        C1291c m37721d = m37721d(str);
        if (m37721d == null) {
            return i;
        }
        try {
            return m37721d.m37686i(this.f3744h);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: l */
    public int m37713l() {
        switch (m37722c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    /* renamed from: s */
    public boolean m37706s() {
        int m37722c = m37722c("Orientation", 1);
        return m37722c == 2 || m37722c == 7 || m37722c == 4 || m37722c == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$f */
    /* loaded from: classes.dex */
    public static class C1294f extends C1290b {
        C1294f(byte[] bArr) throws IOException {
            super(bArr);
            this.f3773w.mark(Reader.READ_DONE);
        }

        /* renamed from: t */
        public void m37681t(long j) throws IOException {
            int i = this.f3775y;
            if (i > j) {
                this.f3775y = 0;
                this.f3773w.reset();
            } else {
                j -= i;
            }
            m37695h((int) j);
        }

        C1294f(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f3773w.mark(Reader.READ_DONE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public C1288a(InputStream inputStream, int i) throws IOException {
        C1292d[][] c1292dArr = f3728V;
        this.f3742f = new HashMap[c1292dArr.length];
        this.f3743g = new HashSet(c1292dArr.length);
        this.f3744h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f3737a = null;
        if (i == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f3735c0.length);
            if (!m37707r(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f3741e = true;
            this.f3739c = null;
            this.f3738b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f3739c = (AssetManager.AssetInputStream) inputStream;
            this.f3738b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (m37699z(fileInputStream.getFD())) {
                    this.f3739c = null;
                    this.f3738b = fileInputStream.getFD();
                }
            }
            this.f3739c = null;
            this.f3738b = null;
        }
        m37737D(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: androidx.exifinterface.media.a$d */
    /* loaded from: classes.dex */
    public static class C1292d {

        /* renamed from: a */
        public final int f3781a;

        /* renamed from: b */
        public final String f3782b;

        /* renamed from: c */
        public final int f3783c;

        /* renamed from: d */
        public final int f3784d;

        C1292d(String str, int i, int i2) {
            this.f3782b = str;
            this.f3781a = i;
            this.f3783c = i2;
            this.f3784d = -1;
        }

        /* renamed from: a */
        boolean m37683a(int i) {
            int i2;
            int i3 = this.f3783c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f3784d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        C1292d(String str, int i, int i2, int i3) {
            this.f3782b = str;
            this.f3781a = i;
            this.f3783c = i2;
            this.f3784d = i3;
        }
    }
}
