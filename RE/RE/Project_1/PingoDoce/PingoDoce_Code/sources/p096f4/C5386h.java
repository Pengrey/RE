package p096f4;

import java.io.IOException;
import p005a4.C0014b;
import p116g4.AbstractC5604c;

/* renamed from: f4.h */
/* loaded from: classes.dex */
public class C5386h implements InterfaceC5391j0<C0014b> {

    /* renamed from: a */
    public static final C5386h f14836a = new C5386h();

    /* renamed from: b */
    private static final AbstractC5604c.C5605a f14837b = AbstractC5604c.C5605a.m23609a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C5386h() {
    }

    @Override // p096f4.InterfaceC5391j0
    /* renamed from: b */
    public C0014b mo24395a(AbstractC5604c abstractC5604c, float f) throws IOException {
        C0014b.EnumC0015a enumC0015a = C0014b.EnumC0015a.CENTER;
        abstractC5604c.mo23591e();
        C0014b.EnumC0015a enumC0015a2 = enumC0015a;
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = true;
        while (abstractC5604c.mo23580y()) {
            switch (abstractC5604c.mo23595X(f14837b)) {
                case 0:
                    str = abstractC5604c.mo23597M();
                    break;
                case 1:
                    str2 = abstractC5604c.mo23597M();
                    break;
                case 2:
                    f2 = (float) abstractC5604c.mo23603F();
                    break;
                case 3:
                    int mo23600H = abstractC5604c.mo23600H();
                    enumC0015a2 = C0014b.EnumC0015a.CENTER;
                    if (mo23600H <= enumC0015a2.ordinal() && mo23600H >= 0) {
                        enumC0015a2 = C0014b.EnumC0015a.values()[mo23600H];
                        break;
                    }
                    break;
                case 4:
                    i = abstractC5604c.mo23600H();
                    break;
                case 5:
                    f3 = (float) abstractC5604c.mo23603F();
                    break;
                case 6:
                    f4 = (float) abstractC5604c.mo23603F();
                    break;
                case 7:
                    i2 = C5397p.m24421d(abstractC5604c);
                    break;
                case 8:
                    i3 = C5397p.m24421d(abstractC5604c);
                    break;
                case 9:
                    f5 = (float) abstractC5604c.mo23603F();
                    break;
                case 10:
                    z = abstractC5604c.mo23605E();
                    break;
                default:
                    abstractC5604c.mo23594a0();
                    abstractC5604c.mo23593b0();
                    break;
            }
        }
        abstractC5604c.mo23584t();
        return new C0014b(str, str2, f2, enumC0015a2, i, f3, f4, i2, i3, f5, z);
    }
}
