package okhttp3.internal.http2;

import androidx.constraintlayout.widget.C0868i;
import gf.Util;
import java.io.IOException;
import p070e.C4906j;
import p181jd.Intrinsics;
import p356sf.ByteString;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p489zc._ArraysJvm;

/* renamed from: okhttp3.internal.http2.g */
/* loaded from: classes2.dex */
public final class Huffman {

    /* renamed from: c */
    private static final byte[] f21177c;

    /* renamed from: a */
    public static final Huffman f21175a = new Huffman();

    /* renamed from: b */
    private static final int[] f21176b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, C0868i.f2743B0, C0868i.f2748C0, C0868i.f2753D0, C0868i.f2758E0, C0868i.f2763F0, 106, C0868i.f2768G0, C0868i.f2773H0, C0868i.f2778I0, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, C4906j.f13612y0, C4906j.f13617z0, 40, 41, 42, 7, 43, C4906j.f13380A0, 44, 8, 9, 45, C4906j.f13385B0, C4906j.f13390C0, C4906j.f13395D0, C4906j.f13400E0, C4906j.f13405F0, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: d */
    private static final C8142a f21178d = new C8142a();

    static {
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        f21177c = bArr;
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            f21175a.m16545a(i, f21176b[i], f21177c[i]);
        }
    }

    private Huffman() {
    }

    /* renamed from: a */
    private final void m16545a(int i, int i2, int i3) {
        C8142a c8142a = new C8142a(i, i3);
        C8142a c8142a2 = f21178d;
        while (i3 > 8) {
            i3 -= 8;
            int i4 = (i2 >>> i3) & 255;
            C8142a[] m16541a = c8142a2.m16541a();
            Intrinsics.ifNullDoSomething(m16541a);
            C8142a c8142a3 = m16541a[i4];
            if (c8142a3 == null) {
                c8142a3 = new C8142a();
                m16541a[i4] = c8142a3;
            }
            c8142a2 = c8142a3;
        }
        int i5 = 8 - i3;
        int i6 = (i2 << i5) & 255;
        C8142a[] m16541a2 = c8142a2.m16541a();
        Intrinsics.ifNullDoSomething(m16541a2);
        _ArraysJvm.m306r(m16541a2, c8142a, i6, (1 << i5) + i6);
    }

    /* renamed from: b */
    public final void m16544b(InterfaceC10187e interfaceC10187e, long j, InterfaceC10186d interfaceC10186d) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        C8142a c8142a = f21178d;
        int i = 0;
        long j2 = 0;
        int i2 = 0;
        while (j2 < j) {
            j2++;
            i = (i << 8) | Util.m23413d(interfaceC10187e.readByte(), 255);
            i2 += 8;
            while (i2 >= 8) {
                C8142a[] m16541a = c8142a.m16541a();
                Intrinsics.ifNullDoSomething(m16541a);
                c8142a = m16541a[(i >>> (i2 - 8)) & 255];
                Intrinsics.ifNullDoSomething(c8142a);
                if (c8142a.m16541a() == null) {
                    interfaceC10186d.mo8780S(c8142a.m16540b());
                    i2 -= c8142a.m16539c();
                    c8142a = f21178d;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            C8142a[] m16541a2 = c8142a.m16541a();
            Intrinsics.ifNullDoSomething(m16541a2);
            C8142a c8142a2 = m16541a2[(i << (8 - i2)) & 255];
            Intrinsics.ifNullDoSomething(c8142a2);
            if (c8142a2.m16541a() != null || c8142a2.m16539c() > i2) {
                return;
            }
            interfaceC10186d.mo8780S(c8142a2.m16540b());
            i2 -= c8142a2.m16539c();
            c8142a = f21178d;
        }
    }

    /* renamed from: c */
    public final void m16543c(ByteString byteString, InterfaceC10186d interfaceC10186d) throws IOException {
        Intrinsics.isThisObjectNull(byteString, "source");
        Intrinsics.isThisObjectNull(interfaceC10186d, "sink");
        int size = byteString.size();
        int i = 0;
        long j = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = i + 1;
            int m23413d = Util.m23413d(byteString.m8714h(i), 255);
            int i4 = f21176b[m23413d];
            byte b = f21177c[m23413d];
            j = (j << b) | i4;
            i2 += b;
            while (i2 >= 8) {
                i2 = (i2 == true ? 1 : 0) - 8;
                interfaceC10186d.mo8780S((int) (j >> i2));
            }
            i = i3;
        }
        if (i2 > 0) {
            interfaceC10186d.mo8780S((int) ((j << (8 - i2)) | (255 >>> i2)));
        }
    }

    /* renamed from: d */
    public final int m16542d(ByteString byteString) {
        Intrinsics.isThisObjectNull(byteString, "bytes");
        int size = byteString.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            j += f21177c[Util.m23413d(byteString.m8714h(i), 255)];
            i = i2;
        }
        return (int) ((j + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Huffman.kt */
    /* renamed from: okhttp3.internal.http2.g$a */
    /* loaded from: classes2.dex */
    public static final class C8142a {

        /* renamed from: a */
        private final C8142a[] f21179a;

        /* renamed from: b */
        private final int f21180b;

        /* renamed from: c */
        private final int f21181c;

        public C8142a() {
            this.f21179a = new C8142a[256];
            this.f21180b = 0;
            this.f21181c = 0;
        }

        /* renamed from: a */
        public final C8142a[] m16541a() {
            return this.f21179a;
        }

        /* renamed from: b */
        public final int m16540b() {
            return this.f21180b;
        }

        /* renamed from: c */
        public final int m16539c() {
            return this.f21181c;
        }

        public C8142a(int i, int i2) {
            this.f21179a = null;
            this.f21180b = i;
            int i3 = i2 & 7;
            this.f21181c = i3 == 0 ? 8 : i3;
        }
    }
}
