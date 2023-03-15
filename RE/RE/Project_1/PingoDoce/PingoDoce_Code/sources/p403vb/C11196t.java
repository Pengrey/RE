package p403vb;

import com.google.zxing.C4394c;
import com.google.zxing.C4409m;
import com.google.zxing.ChecksumException;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4399d;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p239mb.C7154a;

/* renamed from: vb.t */
/* loaded from: classes2.dex */
public final class C11196t extends AbstractC11201y {

    /* renamed from: i */
    private final AbstractC11201y f28754i = new C11185i();

    /* renamed from: t */
    private static C4409m m5777t(C4409m c4409m) throws FormatException {
        String m27645f = c4409m.m27645f();
        if (m27645f.charAt(0) == '0') {
            C4409m c4409m2 = new C4409m(m27645f.substring(1), null, c4409m.m27646e(), EnumC4392a.UPC_A);
            if (c4409m.m27647d() != null) {
                c4409m2.m27644g(c4409m.m27647d());
            }
            return c4409m2;
        }
        throw FormatException.m27702a();
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: b */
    public C4409m mo516b(C4394c c4394c, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException {
        return m5777t(this.f28754i.mo516b(c4394c, map));
    }

    @Override // p403vb.AbstractC11194r, com.google.zxing.InterfaceC4408l
    /* renamed from: c */
    public C4409m mo515c(C4394c c4394c) throws NotFoundException, FormatException {
        return m5777t(this.f28754i.mo515c(c4394c));
    }

    @Override // p403vb.AbstractC11201y, p403vb.AbstractC11194r
    /* renamed from: d */
    public C4409m mo3036d(int i, C7154a c7154a, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m5777t(this.f28754i.mo3036d(i, c7154a, map));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p403vb.AbstractC11201y
    /* renamed from: m */
    public int mo5762m(C7154a c7154a, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f28754i.mo5762m(c7154a, iArr, sb2);
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: n */
    public C4409m mo5761n(int i, C7154a c7154a, int[] iArr, Map<EnumC4399d, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return m5777t(this.f28754i.mo5761n(i, c7154a, iArr, map));
    }

    @Override // p403vb.AbstractC11201y
    /* renamed from: r */
    EnumC4392a mo5757r() {
        return EnumC4392a.UPC_A;
    }
}
