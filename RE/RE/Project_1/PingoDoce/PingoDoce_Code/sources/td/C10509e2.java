package td;

import bd.CoroutineContextImpl;
import bd.InterfaceC1886d;
import id.InterfaceC6108l;
import java.util.concurrent.CancellationException;
import p468yc.C13195u;

/* renamed from: td.e2 */
/* loaded from: classes2.dex */
public final class C10509e2 extends CoroutineContextImpl implements InterfaceC10574t1 {

    /* renamed from: x */
    public static final C10509e2 f27234x = new C10509e2();

    private C10509e2() {
        super(InterfaceC10574t1.f27288s);
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: A0 */
    public InterfaceC10595y0 mo7661A0(boolean z, boolean z2, InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        return C10513f2.f27237w;
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: X */
    public InterfaceC10595y0 mo7659X(InterfaceC6108l<? super Throwable, C13195u> interfaceC6108l) {
        return C10513f2.f27237w;
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: a */
    public boolean mo5659a() {
        return true;
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: e */
    public void mo5695e(CancellationException cancellationException) {
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: e0 */
    public CancellationException mo7658e0() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: j0 */
    public boolean mo7657j0() {
        return false;
    }

    @Override // td.InterfaceC10574t1
    public boolean start() {
        return false;
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: t */
    public InterfaceC10554p mo7656t(InterfaceC10564r interfaceC10564r) {
        return C10513f2.f27237w;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // td.InterfaceC10574t1
    /* renamed from: v */
    public Object mo7655v(InterfaceC1886d<? super C13195u> interfaceC1886d) {
        throw new UnsupportedOperationException("This job is always active");
    }
}
