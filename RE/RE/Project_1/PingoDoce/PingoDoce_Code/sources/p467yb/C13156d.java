package p467yb;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yb.d */
/* loaded from: classes2.dex */
public final class C13156d extends AbstractC13160h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13156d(C7154a c7154a) {
        super(c7154a);
    }

    @Override // p467yb.AbstractC13162j
    /* renamed from: d */
    public String mo1512d() throws NotFoundException, FormatException {
        if (m1513c().m19072l() >= 48) {
            StringBuilder sb2 = new StringBuilder();
            m1520f(sb2, 8);
            int m1483f = m1514b().m1483f(48, 2);
            sb2.append("(393");
            sb2.append(m1483f);
            sb2.append(')');
            int m1483f2 = m1514b().m1483f(50, 10);
            if (m1483f2 / 100 == 0) {
                sb2.append('0');
            }
            if (m1483f2 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m1483f2);
            sb2.append(m1514b().m1486c(60, null).m1499b());
            return sb2.toString();
        }
        throw NotFoundException.m27700a();
    }
}
