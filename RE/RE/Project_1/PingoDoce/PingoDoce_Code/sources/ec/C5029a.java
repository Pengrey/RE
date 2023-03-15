package ec;

import com.google.zxing.C4394c;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.EnumC4410n;
import com.google.zxing.FormatException;
import com.google.zxing.InterfaceC4408l;
import com.google.zxing.NotFoundException;
import com.google.zxing.qrcode.decoder.C4427e;
import com.google.zxing.qrcode.decoder.C4431i;
import java.util.List;
import java.util.Map;
import p104fc.C5447c;
import p239mb.C7155b;
import p239mb.C7158e;
import p239mb.C7160g;

/* renamed from: ec.a */
/* loaded from: classes2.dex */
public class C5029a implements InterfaceC4408l {

    /* renamed from: b */
    private static final C4411o[] f13957b = new C4411o[0];

    /* renamed from: a */
    private final C4427e f13958a = new C4427e();

    /* renamed from: d */
    private static C7155b m25871d(C7155b c7155b) throws NotFoundException {
        int[] m19054k = c7155b.m19054k();
        int[] m19058f = c7155b.m19058f();
        if (m19054k != null && m19058f != null) {
            float m25870e = m25870e(m19054k, c7155b);
            int i = m19054k[1];
            int i2 = m19058f[1];
            int i3 = m19054k[0];
            int i4 = m19058f[0];
            if (i3 < i4 && i < i2) {
                int i5 = i2 - i;
                if (i5 != i4 - i3 && (i4 = i3 + i5) >= c7155b.m19053l()) {
                    throw NotFoundException.m27700a();
                }
                int round = Math.round(((i4 - i3) + 1) / m25870e);
                int round2 = Math.round((i5 + 1) / m25870e);
                if (round <= 0 || round2 <= 0) {
                    throw NotFoundException.m27700a();
                }
                if (round2 == round) {
                    int i6 = (int) (m25870e / 2.0f);
                    int i7 = i + i6;
                    int i8 = i3 + i6;
                    int i9 = (((int) ((round - 1) * m25870e)) + i8) - i4;
                    if (i9 > 0) {
                        if (i9 > i6) {
                            throw NotFoundException.m27700a();
                        }
                        i8 -= i9;
                    }
                    int i10 = (((int) ((round2 - 1) * m25870e)) + i7) - i2;
                    if (i10 > 0) {
                        if (i10 > i6) {
                            throw NotFoundException.m27700a();
                        }
                        i7 -= i10;
                    }
                    C7155b c7155b2 = new C7155b(round, round2);
                    for (int i11 = 0; i11 < round2; i11++) {
                        int i12 = ((int) (i11 * m25870e)) + i7;
                        for (int i13 = 0; i13 < round; i13++) {
                            if (c7155b.m19059e(((int) (i13 * m25870e)) + i8, i12)) {
                                c7155b2.m19051n(i13, i11);
                            }
                        }
                    }
                    return c7155b2;
                }
                throw NotFoundException.m27700a();
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: e */
    private static float m25870e(int[] iArr, C7155b c7155b) throws NotFoundException {
        int m19056i = c7155b.m19056i();
        int m19053l = c7155b.m19053l();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m19053l && i2 < m19056i) {
            if (z != c7155b.m19059e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m19053l && i2 != m19056i) {
            return (i - iArr[0]) / 7.0f;
        }
        throw NotFoundException.m27700a();
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public final C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C4411o[] m19029b;
        C7158e c7158e;
        if (map != null && map.containsKey(EnumC4399d.PURE_BARCODE)) {
            c7158e = this.f13958a.m27617c(m25871d(c4394c.m27696a()), map);
            m19029b = f13957b;
        } else {
            C7160g m24332e = new C5447c(c4394c.m27696a()).m24332e(map);
            C7158e m27617c = this.f13958a.m27617c(m24332e.m19030a(), map);
            m19029b = m24332e.m19029b();
            c7158e = m27617c;
        }
        if (c7158e.m19040d() instanceof C4431i) {
            ((C4431i) c7158e.m19040d()).m27611a(m19029b);
        }
        C4409m c4409m = new C4409m(c7158e.m19036h(), c7158e.m19039e(), m19029b, EnumC4392a.QR_CODE);
        List<byte[]> m19043a = c7158e.m19043a();
        if (m19043a != null) {
            c4409m.m27643h(EnumC4410n.BYTE_SEGMENTS, m19043a);
        }
        String m19042b = c7158e.m19042b();
        if (m19042b != null) {
            c4409m.m27643h(EnumC4410n.ERROR_CORRECTION_LEVEL, m19042b);
        }
        if (c7158e.m19035i()) {
            c4409m.m27643h(EnumC4410n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c7158e.m19037g()));
            c4409m.m27643h(EnumC4410n.STRUCTURED_APPEND_PARITY, Integer.valueOf(c7158e.m19038f()));
        }
        return c4409m;
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException, ChecksumException, FormatException {
        return mo516b(c4394c, null);
    }
}
