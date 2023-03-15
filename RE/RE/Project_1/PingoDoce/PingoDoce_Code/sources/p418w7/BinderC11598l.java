package p418w7;

import p133h7.BinderC5870d;
import p133h7.InterfaceC5867b;
import p353s7.InterfaceC10082i;
import p418w7.C11581c;
import p440x7.AbstractBinderC12292a0;
import p463y7.C13130c;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* renamed from: w7.l */
/* loaded from: classes.dex */
public final class BinderC11598l extends AbstractBinderC12292a0 {

    /* renamed from: a */
    final /* synthetic */ C11581c.InterfaceC11582a f29666a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC11598l(C11581c c11581c, C11581c.InterfaceC11582a interfaceC11582a) {
        this.f29666a = interfaceC11582a;
    }

    @Override // p440x7.InterfaceC12294b0
    /* renamed from: e */
    public final InterfaceC5867b mo3124e(InterfaceC10082i interfaceC10082i) {
        return BinderC5870d.m22835S1(this.f29666a.mo4660a(new C13130c(interfaceC10082i)));
    }

    @Override // p440x7.InterfaceC12294b0
    /* renamed from: v */
    public final InterfaceC5867b mo3123v(InterfaceC10082i interfaceC10082i) {
        return BinderC5870d.m22835S1(this.f29666a.mo4659g(new C13130c(interfaceC10082i)));
    }
}
