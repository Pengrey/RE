package p488zb;

import ac.C0125j;
import cc.C2108a;
import cc.C2109b;
import com.google.crypto.tink.shaded.protobuf.Reader;
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
import java.util.ArrayList;
import java.util.Map;
import p239mb.C7158e;

/* renamed from: zb.b */
/* loaded from: classes2.dex */
public final class C13745b implements InterfaceC4408l {

    /* renamed from: a */
    private static final C4409m[] f34864a = new C4409m[0];

    /* renamed from: d */
    private static C4409m[] m514d(C4394c c4394c, Map<EnumC4399d, ?> map, boolean z) throws NotFoundException, FormatException, ChecksumException {
        ArrayList arrayList = new ArrayList();
        C2109b m34651b = C2108a.m34651b(c4394c, map, z);
        for (C4411o[] c4411oArr : m34651b.m34644b()) {
            C7158e m41812i = C0125j.m41812i(m34651b.m34645a(), c4411oArr[4], c4411oArr[5], c4411oArr[6], c4411oArr[7], m511g(c4411oArr), m513e(c4411oArr));
            C4409m c4409m = new C4409m(m41812i.m19036h(), m41812i.m19039e(), c4411oArr, EnumC4392a.PDF_417);
            c4409m.m27643h(EnumC4410n.ERROR_CORRECTION_LEVEL, m41812i.m19042b());
            C13746c c13746c = (C13746c) m41812i.m19040d();
            if (c13746c != null) {
                c4409m.m27643h(EnumC4410n.PDF417_EXTRA_METADATA, c13746c);
            }
            arrayList.add(c4409m);
        }
        return (C4409m[]) arrayList.toArray(f34864a);
    }

    /* renamed from: e */
    private static int m513e(C4411o[] c4411oArr) {
        return Math.max(Math.max(m512f(c4411oArr[0], c4411oArr[4]), (m512f(c4411oArr[6], c4411oArr[2]) * 17) / 18), Math.max(m512f(c4411oArr[1], c4411oArr[5]), (m512f(c4411oArr[7], c4411oArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m512f(C4411o c4411o, C4411o c4411o2) {
        if (c4411o == null || c4411o2 == null) {
            return 0;
        }
        return (int) Math.abs(c4411o.m27640c() - c4411o2.m27640c());
    }

    /* renamed from: g */
    private static int m511g(C4411o[] c4411oArr) {
        return Math.min(Math.min(m510h(c4411oArr[0], c4411oArr[4]), (m510h(c4411oArr[6], c4411oArr[2]) * 17) / 18), Math.min(m510h(c4411oArr[1], c4411oArr[5]), (m510h(c4411oArr[7], c4411oArr[3]) * 17) / 18));
    }

    /* renamed from: h */
    private static int m510h(C4411o c4411o, C4411o c4411o2) {
        return (c4411o == null || c4411o2 == null) ? Reader.READ_DONE : (int) Math.abs(c4411o.m27640c() - c4411o2.m27640c());
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: a */
    public void mo517a() {
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        C4409m[] m514d = m514d(c4394c, map, false);
        if (m514d.length != 0 && m514d[0] != null) {
            return m514d[0];
        }
        throw NotFoundException.m27700a();
    }

    @Override // com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException, FormatException, ChecksumException {
        return mo516b(c4394c, null);
    }
}
