package p484z6;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.o */
/* loaded from: classes.dex */
final class C13718o extends AbstractDialogInterface$OnClickListenerC13720q {

    /* renamed from: w */
    final /* synthetic */ Intent f34830w;

    /* renamed from: x */
    final /* synthetic */ Activity f34831x;

    /* renamed from: y */
    final /* synthetic */ int f34832y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13718o(Intent intent, Activity activity, int i) {
        this.f34830w = intent;
        this.f34831x = activity;
        this.f34832y = i;
    }

    @Override // p484z6.AbstractDialogInterface$OnClickListenerC13720q
    /* renamed from: a */
    public final void mo556a() {
        Intent intent = this.f34830w;
        if (intent != null) {
            this.f34831x.startActivityForResult(intent, this.f34832y);
        }
    }
}
