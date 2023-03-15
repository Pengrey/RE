package p403vb;

import com.google.zxing.C4394c;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4399d;
import com.google.zxing.EnumC4410n;
import com.google.zxing.FormatException;
import com.google.zxing.InterfaceC4408l;
import com.google.zxing.NotFoundException;
import java.util.Arrays;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.r */
/* loaded from: classes2.dex */
public abstract class AbstractC11194r implements InterfaceC4408l {
    /* JADX WARN: Removed duplicated region for block: B:41:0x007c A[Catch: ReaderException -> 0x00cc, TRY_LEAVE, TryCatch #5 {ReaderException -> 0x00cc, blocks: (B:39:0x0076, B:41:0x007c), top: B:76:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cb A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.google.zxing.C4409m m5786e(com.google.zxing.C4394c r22, java.util.Map<com.google.zxing.EnumC4399d, ?> r23) throws com.google.zxing.NotFoundException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p403vb.AbstractC11194r.m5786e(com.google.zxing.c, java.util.Map):com.google.zxing.m");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public static float m5785f(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public static void m5784g(C7154a c7154a, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m19072l = c7154a.m19072l();
        if (i < m19072l) {
            boolean z = !c7154a.m19076g(i);
            while (i < m19072l) {
                if (c7154a.m19076g(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != m19072l) {
                    throw NotFoundException.m27700a();
                }
                return;
            }
            return;
        }
        throw NotFoundException.m27700a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public static void m5783h(C7154a c7154a, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean m19076g = c7154a.m19076g(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c7154a.m19076g(i) != m19076g) {
                length--;
                m19076g = !m19076g;
            }
        }
        if (length < 0) {
            m5784g(c7154a, i + 1, iArr);
            return;
        }
        throw NotFoundException.m27700a();
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException {
        try {
            return m5786e(c4394c, map);
        } catch (NotFoundException e) {
            if ((map != null && map.containsKey(EnumC4399d.TRY_HARDER)) && c4394c.m27692e()) {
                C4394c m27691f = c4394c.m27691f();
                C4409m m5786e = m5786e(m27691f, map);
                Map<EnumC4410n, Object> m27647d = m5786e.m27647d();
                int i = 270;
                if (m27647d != null) {
                    EnumC4410n enumC4410n = EnumC4410n.ORIENTATION;
                    if (m27647d.containsKey(enumC4410n)) {
                        i = (((Integer) m27647d.get(enumC4410n)).intValue() + 270) % 360;
                    }
                }
                m5786e.m27643h(EnumC4410n.ORIENTATION, Integer.valueOf(i));
                C4411o[] m27646e = m5786e.m27646e();
                if (m27646e != null) {
                    int m27694c = m27691f.m27694c();
                    for (int i2 = 0; i2 < m27646e.length; i2++) {
                        m27646e[i2] = new C4411o((m27694c - m27646e[i2].m27639d()) - 1.0f, m27646e[i2].m27640c());
                    }
                }
                return m5786e;
            }
            throw e;
        }
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException, FormatException {
        return mo516b(c4394c, null);
    }

    /* renamed from: d */
    public abstract C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException;
}
