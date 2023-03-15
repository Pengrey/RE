package p484z6;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC2505h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.p */
/* loaded from: classes.dex */
final class C13719p extends AbstractDialogInterface$OnClickListenerC13720q {

    /* renamed from: w */
    final /* synthetic */ Intent f34833w;

    /* renamed from: x */
    final /* synthetic */ InterfaceC2505h f34834x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13719p(Intent intent, InterfaceC2505h interfaceC2505h, int i) {
        this.f34833w = intent;
        this.f34834x = interfaceC2505h;
    }

    @Override // p484z6.AbstractDialogInterface$OnClickListenerC13720q
    /* renamed from: a */
    public final void mo556a() {
        Intent intent = this.f34833w;
        if (intent != null) {
            this.f34834x.startActivityForResult(intent, 2);
        }
    }
}
