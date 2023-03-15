package p396v3;

import id.InterfaceC6108l;
import java.io.IOException;
import p107ff.InterfaceC5469e;
import p107ff.InterfaceC5474f;
import p107ff.Response;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10529j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v3.j */
/* loaded from: classes.dex */
public final class C11100j implements InterfaceC5474f, InterfaceC6108l<Throwable, C13195u> {

    /* renamed from: w */
    private final InterfaceC5469e f28491w;

    /* renamed from: x */
    private final InterfaceC10529j<Response> f28492x;

    /* JADX WARN: Multi-variable type inference failed */
    public C11100j(InterfaceC5469e interfaceC5469e, InterfaceC10529j<? super Response> interfaceC10529j) {
        this.f28491w = interfaceC5469e;
        this.f28492x = interfaceC10529j;
    }

    /* renamed from: a */
    public void m6129a(Throwable th2) {
        try {
            this.f28491w.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // id.InterfaceC6108l
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
        m6129a(th2);
        return C13195u.f34156a;
    }

    @Override // p107ff.InterfaceC5474f
    public void onFailure(InterfaceC5469e interfaceC5469e, IOException iOException) {
        if (interfaceC5469e.isCanceled()) {
            return;
        }
        InterfaceC10529j<Response> interfaceC10529j = this.f28492x;
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC10529j.resumeWith(C13183m.m1458a(C13186n.m1454a(iOException)));
    }

    @Override // p107ff.InterfaceC5474f
    public void onResponse(InterfaceC5469e interfaceC5469e, Response response) {
        InterfaceC10529j<Response> interfaceC10529j = this.f28492x;
        C13183m.C13184a c13184a = C13183m.f34143w;
        interfaceC10529j.resumeWith(C13183m.m1458a(response));
    }
}
