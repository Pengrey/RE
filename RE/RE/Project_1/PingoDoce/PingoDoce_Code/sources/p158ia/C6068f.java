package p158ia;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: ia.f */
/* loaded from: classes.dex */
public class C6068f {

    /* renamed from: a */
    private static final byte f16712a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    private static final byte f16713b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    private static String m22288b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    private static byte[] m22287c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m22289a() {
        byte[] m22287c = m22287c(UUID.randomUUID(), new byte[17]);
        m22287c[16] = m22287c[0];
        m22287c[0] = (byte) ((f16713b & m22287c[0]) | f16712a);
        return m22288b(m22287c);
    }
}
