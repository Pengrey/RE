package p094f2;

import p094f2.C5331f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f2.g */
/* loaded from: classes.dex */
public class C5333g extends C5331f {

    /* renamed from: m */
    public int f14729m;

    public C5333g(AbstractC5345p abstractC5345p) {
        super(abstractC5345p);
        if (abstractC5345p instanceof C5338l) {
            this.f14721e = C5331f.EnumC5332a.HORIZONTAL_DIMENSION;
        } else {
            this.f14721e = C5331f.EnumC5332a.VERTICAL_DIMENSION;
        }
    }

    @Override // p094f2.C5331f
    /* renamed from: d */
    public void mo24598d(int i) {
        if (this.f14726j) {
            return;
        }
        this.f14726j = true;
        this.f14723g = i;
        for (InterfaceC5329d interfaceC5329d : this.f14727k) {
            interfaceC5329d.mo24565a(interfaceC5329d);
        }
    }
}
