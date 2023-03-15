package p133h7;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h7.f */
/* loaded from: classes.dex */
public final class C5872f implements InterfaceC5871e {

    /* renamed from: a */
    final /* synthetic */ AbstractC5866a f16304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5872f(AbstractC5866a abstractC5866a) {
        this.f16304a = abstractC5866a;
    }

    @Override // p133h7.InterfaceC5871e
    /* renamed from: a */
    public final void mo22834a(InterfaceC5869c interfaceC5869c) {
        LinkedList linkedList;
        LinkedList linkedList2;
        InterfaceC5869c interfaceC5869c2;
        this.f16304a.f16299a = interfaceC5869c;
        linkedList = this.f16304a.f16301c;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            interfaceC5869c2 = this.f16304a.f16299a;
            ((InterfaceC5876j) it.next()).mo22833a(interfaceC5869c2);
        }
        linkedList2 = this.f16304a.f16301c;
        linkedList2.clear();
        this.f16304a.f16300b = null;
    }
}
