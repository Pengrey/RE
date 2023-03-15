package coil.request;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1489u;
import androidx.lifecycle.InterfaceC1491v;
import coil.util.Lifecycles;
import java.util.concurrent.CancellationException;
import p095f3.InterfaceC5359e;
import p305q3.C9629g;
import p349s3.InterfaceC10042b;
import p396v3.C11098i;
import td.InterfaceC10574t1;

/* compiled from: RequestDelegate.kt */
/* loaded from: classes.dex */
public final class ViewTargetRequestDelegate extends RequestDelegate {

    /* renamed from: A */
    private final InterfaceC10574t1 f6307A;

    /* renamed from: w */
    private final InterfaceC5359e f6308w;

    /* renamed from: x */
    private final C9629g f6309x;

    /* renamed from: y */
    private final InterfaceC10042b<?> f6310y;

    /* renamed from: z */
    private final AbstractC1469p f6311z;

    public ViewTargetRequestDelegate(InterfaceC5359e interfaceC5359e, C9629g c9629g, InterfaceC10042b<?> interfaceC10042b, AbstractC1469p abstractC1469p, InterfaceC10574t1 interfaceC10574t1) {
        super(null);
        this.f6308w = interfaceC5359e;
        this.f6309x = c9629g;
        this.f6310y = interfaceC10042b;
        this.f6311z = abstractC1469p;
        this.f6307A = interfaceC10574t1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    /* renamed from: b */
    public void mo34477b() {
        if (this.f6310y.mo9340j().isAttachedToWindow()) {
            return;
        }
        C11098i.m6143m(this.f6310y.mo9340j()).m10294c(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    @Override // androidx.lifecycle.InterfaceC1443h, androidx.lifecycle.InterfaceC1462m
    /* renamed from: c */
    public void mo34476c(InterfaceC1491v interfaceC1491v) {
        C11098i.m6143m(this.f6310y.mo9340j()).m10296a();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    @Override // coil.request.RequestDelegate
    /* renamed from: i */
    public void mo34475i() {
        this.f6311z.mo10402a(this);
        InterfaceC10042b<?> interfaceC10042b = this.f6310y;
        if (interfaceC10042b instanceof InterfaceC1489u) {
            Lifecycles.m34465b(this.f6311z, (InterfaceC1489u) interfaceC10042b);
        }
        C11098i.m6143m(this.f6310y.mo9340j()).m10294c(this);
    }

    /* renamed from: j */
    public void m34474j() {
        InterfaceC10574t1.C10575a.m7654a(this.f6307A, null, 1, null);
        InterfaceC10042b<?> interfaceC10042b = this.f6310y;
        if (interfaceC10042b instanceof InterfaceC1489u) {
            this.f6311z.mo10400c((InterfaceC1489u) interfaceC10042b);
        }
        this.f6311z.mo10400c(this);
    }

    /* renamed from: k */
    public final void m34473k() {
        this.f6308w.mo24489b(this.f6309x);
    }
}
