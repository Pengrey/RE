package p133h7;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h7.h */
/* loaded from: classes.dex */
public final class View$OnClickListenerC5874h implements View.OnClickListener {

    /* renamed from: w */
    final /* synthetic */ Context f16307w;

    /* renamed from: x */
    final /* synthetic */ Intent f16308x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public View$OnClickListenerC5874h(Context context, Intent intent) {
        this.f16307w = context;
        this.f16308x = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        try {
            this.f16307w.startActivity(this.f16308x);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
