package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.C3425g;
import com.google.firebase.messaging.C4294g0;
import com.google.firebase.messaging.C4308m;
import java.util.concurrent.ExecutionException;
import p417w6.AbstractC11570a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC11570a {
    @Override // p417w6.AbstractC11570a
    /* renamed from: b */
    protected final int mo4689b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) C3425g.m30769a(new C4308m(context).m27932g(cloudMessage.m33559h()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // p417w6.AbstractC11570a
    /* renamed from: c */
    protected final void mo4688c(Context context, Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (C4294g0.m28014A(putExtras)) {
            C4294g0.m27994s(putExtras);
        }
    }
}
