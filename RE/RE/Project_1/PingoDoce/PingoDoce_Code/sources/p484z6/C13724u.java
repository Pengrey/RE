package p484z6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C3421e;
import java.util.concurrent.TimeUnit;
import p462y6.AbstractC13119b;
import p484z6.C13704d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.u */
/* loaded from: classes.dex */
final class C13724u implements AbstractC13119b.InterfaceC13120a {

    /* renamed from: a */
    final /* synthetic */ AbstractC13119b f34837a;

    /* renamed from: b */
    final /* synthetic */ C3421e f34838b;

    /* renamed from: c */
    final /* synthetic */ C13704d.InterfaceC13705a f34839c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13724u(AbstractC13119b abstractC13119b, C3421e c3421e, C13704d.InterfaceC13705a interfaceC13705a, InterfaceC13726w interfaceC13726w) {
        this.f34837a = abstractC13119b;
        this.f34838b = c3421e;
        this.f34839c = interfaceC13705a;
    }

    @Override // p462y6.AbstractC13119b.InterfaceC13120a
    /* renamed from: a */
    public final void mo550a(Status status) {
        if (status.m33511D()) {
            this.f34838b.m30800c(this.f34839c.mo549a(this.f34837a.mo1571b(0L, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f34838b.m30801b(C13697a.m580a(status));
    }
}
