package p271ob;

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
import java.util.List;
import java.util.Map;
import p239mb.C7155b;
import p239mb.C7158e;
import p239mb.C7160g;
import p295pb.C8598d;
import p312qb.C9710a;

/* renamed from: ob.a */
/* loaded from: classes2.dex */
public final class C8058a implements InterfaceC4408l {

    /* renamed from: b */
    private static final C4411o[] f20842b = new C4411o[0];

    /* renamed from: a */
    private final C8598d f20843a = new C8598d();

    /* renamed from: d */
    private static C7155b m17025d(C7155b c7155b) throws NotFoundException {
        int[] m19054k = c7155b.m19054k();
        int[] m19058f = c7155b.m19058f();
        if (m19054k != null && m19058f != null) {
            int m17024e = m17024e(m19054k, c7155b);
            int i = m19054k[1];
            int i2 = m19058f[1];
            int i3 = m19054k[0];
            int i4 = ((m19058f[0] - i3) + 1) / m17024e;
            int i5 = ((i2 - i) + 1) / m17024e;
            if (i4 > 0 && i5 > 0) {
                int i6 = m17024e / 2;
                int i7 = i + i6;
                int i8 = i3 + i6;
                C7155b c7155b2 = new C7155b(i4, i5);
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = (i9 * m17024e) + i7;
                    for (int i11 = 0; i11 < i4; i11++) {
                        if (c7155b.m19059e((i11 * m17024e) + i8, i10)) {
                            c7155b2.m19051n(i11, i9);
                        }
                    }
                }
                return c7155b2;
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    /* renamed from: e */
    private static int m17024e(int[] iArr, C7155b c7155b) throws NotFoundException {
        int m19053l = c7155b.m19053l();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m19053l && c7155b.m19059e(i, i2)) {
            i++;
        }
        if (i != m19053l) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.m27700a();
        }
        throw NotFoundException.m27700a();
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException, ChecksumException, FormatException {
        C4411o[] m19029b;
        C7158e c7158e;
        if (map != null && map.containsKey(EnumC4399d.PURE_BARCODE)) {
            c7158e = this.f20843a.m15053b(m17025d(c4394c.m27696a()));
            m19029b = f20842b;
        } else {
            C7160g m10153b = new C9710a(c4394c.m27696a()).m10153b();
            C7158e m15053b = this.f20843a.m15053b(m10153b.m19030a());
            m19029b = m10153b.m19029b();
            c7158e = m15053b;
        }
        C4409m c4409m = new C4409m(c7158e.m19036h(), c7158e.m19039e(), m19029b, EnumC4392a.DATA_MATRIX);
        List<byte[]> m19043a = c7158e.m19043a();
        if (m19043a != null) {
            c4409m.m27643h(EnumC4410n.BYTE_SEGMENTS, m19043a);
        }
        String m19042b = c7158e.m19042b();
        if (m19042b != null) {
            c4409m.m27643h(EnumC4410n.ERROR_CORRECTION_LEVEL, m19042b);
        }
        return c4409m;
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException, ChecksumException, FormatException {
        return mo516b(c4394c, null);
    }
}
