package p467yb;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* renamed from: yb.j */
/* loaded from: classes2.dex */
public abstract class AbstractC13162j {

    /* renamed from: a */
    private final C7154a f34113a;

    /* renamed from: b */
    private final C13172s f34114b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13162j(C7154a c7154a) {
        this.f34113a = c7154a;
        this.f34114b = new C13172s(c7154a);
    }

    /* renamed from: a */
    public static AbstractC13162j m1515a(C7154a c7154a) {
        if (c7154a.m19076g(1)) {
            return new C13159g(c7154a);
        }
        if (!c7154a.m19076g(2)) {
            return new C13163k(c7154a);
        }
        int m1482g = C13172s.m1482g(c7154a, 1, 4);
        if (m1482g != 4) {
            if (m1482g != 5) {
                int m1482g2 = C13172s.m1482g(c7154a, 1, 5);
                if (m1482g2 != 12) {
                    if (m1482g2 != 13) {
                        switch (C13172s.m1482g(c7154a, 1, 7)) {
                            case 56:
                                return new C13157e(c7154a, "310", "11");
                            case 57:
                                return new C13157e(c7154a, "320", "11");
                            case 58:
                                return new C13157e(c7154a, "310", "13");
                            case 59:
                                return new C13157e(c7154a, "320", "13");
                            case 60:
                                return new C13157e(c7154a, "310", "15");
                            case 61:
                                return new C13157e(c7154a, "320", "15");
                            case 62:
                                return new C13157e(c7154a, "310", "17");
                            case 63:
                                return new C13157e(c7154a, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c7154a)));
                        }
                    }
                    return new C13156d(c7154a);
                }
                return new C13155c(c7154a);
            }
            return new C13154b(c7154a);
        }
        return new C13153a(c7154a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final C13172s m1514b() {
        return this.f34114b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final C7154a m1513c() {
        return this.f34113a;
    }

    /* renamed from: d */
    public abstract String mo1512d() throws NotFoundException, FormatException;
}
