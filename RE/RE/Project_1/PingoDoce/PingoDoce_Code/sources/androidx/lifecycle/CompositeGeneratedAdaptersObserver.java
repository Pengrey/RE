package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements InterfaceC1485s {

    /* renamed from: w */
    private final InterfaceC1464n[] f4214w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(InterfaceC1464n[] interfaceC1464nArr) {
        this.f4214w = interfaceC1464nArr;
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        C1435d0 c1435d0 = new C1435d0();
        for (InterfaceC1464n interfaceC1464n : this.f4214w) {
            interfaceC1464n.m36994a(interfaceC1491v, enumC1471b, false, c1435d0);
        }
        for (InterfaceC1464n interfaceC1464n2 : this.f4214w) {
            interfaceC1464n2.m36994a(interfaceC1491v, enumC1471b, true, c1435d0);
        }
    }
}
