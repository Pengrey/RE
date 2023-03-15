package p403vb;

import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4401f;
import com.google.zxing.InterfaceC4413q;
import com.google.zxing.WriterException;
import java.util.Map;
import p239mb.C7155b;

/* renamed from: vb.u */
/* loaded from: classes2.dex */
public final class C11197u implements InterfaceC4413q {

    /* renamed from: a */
    private final C11186j f28755a = new C11186j();

    @Override // com.google.zxing.InterfaceC4413q
    /* renamed from: a */
    public C7155b mo497a(String str, EnumC4392a enumC4392a, int i, int i2, Map<EnumC4401f, ?> map) throws WriterException {
        if (enumC4392a == EnumC4392a.UPC_A) {
            return this.f28755a.mo497a("0".concat(String.valueOf(str)), EnumC4392a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(enumC4392a)));
    }
}
