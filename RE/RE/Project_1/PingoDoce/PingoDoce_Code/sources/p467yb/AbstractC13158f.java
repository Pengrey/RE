package p467yb;

import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* renamed from: yb.f */
/* loaded from: classes2.dex */
abstract class AbstractC13158f extends AbstractC13161i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13158f(C7154a c7154a) {
        super(c7154a);
    }

    @Override // p467yb.AbstractC13162j
    /* renamed from: d */
    public String mo1512d() throws NotFoundException {
        if (m1513c().m19072l() == 60) {
            StringBuilder sb2 = new StringBuilder();
            m1520f(sb2, 5);
            m1516j(sb2, 45, 15);
            return sb2.toString();
        }
        throw NotFoundException.m27700a();
    }
}
