package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p379u6.BinderC10847f;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* loaded from: classes.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    @RecentlyNullable
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        if (!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) && !"com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("RevocationService", valueOf.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(valueOf) : new String("Unknown action sent to RevocationBoundService: "));
            return null;
        }
        if (Log.isLoggable("RevocationService", 2)) {
            String valueOf2 = String.valueOf(intent.getAction());
            Log.v("RevocationService", valueOf2.length() != 0 ? "RevocationBoundService handling ".concat(valueOf2) : new String("RevocationBoundService handling "));
        }
        return new BinderC10847f(this);
    }
}
