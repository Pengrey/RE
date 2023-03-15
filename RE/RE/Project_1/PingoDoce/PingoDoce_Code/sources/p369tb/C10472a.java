package p369tb;

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
import java.util.Map;
import p239mb.C7155b;
import p239mb.C7158e;
import p383ub.C10864c;

/* renamed from: tb.a */
/* loaded from: classes2.dex */
public final class C10472a implements InterfaceC4408l {

    /* renamed from: b */
    private static final C4411o[] f27177b = new C4411o[0];

    /* renamed from: a */
    private final C10864c f27178a = new C10864c();

    /* renamed from: d */
    private static C7155b m7934d(C7155b c7155b) throws NotFoundException {
        int[] m19057g = c7155b.m19057g();
        if (m19057g != null) {
            int i = m19057g[0];
            int i2 = m19057g[1];
            int i3 = m19057g[2];
            int i4 = m19057g[3];
            C7155b c7155b2 = new C7155b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (c7155b.m19059e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c7155b2.m19051n(i7, i5);
                    }
                }
            }
            return c7155b2;
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
        C7158e m6827b = this.f27178a.m6827b(m7934d(c4394c.m27696a()), map);
        C4409m c4409m = new C4409m(m6827b.m19036h(), m6827b.m19039e(), f27177b, EnumC4392a.MAXICODE);
        String m19042b = m6827b.m19042b();
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
