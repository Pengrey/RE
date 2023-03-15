package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C3421e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.o */
/* loaded from: classes.dex */
public abstract class AbstractC2455o<T> {

    /* renamed from: a */
    final int f7124a;

    /* renamed from: b */
    final C3421e<T> f7125b = new C3421e<>();

    /* renamed from: c */
    final int f7126c;

    /* renamed from: d */
    final Bundle f7127d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2455o(int i, int i2, Bundle bundle) {
        this.f7124a = i;
        this.f7126c = i2;
        this.f7127d = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo33537a(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo33536b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m33539c(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzqVar);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append("Failing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f7125b.m30801b(zzqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m33538d(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 16 + valueOf2.length());
            sb2.append("Finishing ");
            sb2.append(valueOf);
            sb2.append(" with ");
            sb2.append(valueOf2);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.f7125b.m30800c(t);
    }

    public final String toString() {
        int i = this.f7126c;
        int i2 = this.f7124a;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i);
        sb2.append(" id=");
        sb2.append(i2);
        sb2.append(" oneWay=");
        sb2.append(mo33536b());
        sb2.append("}");
        return sb2.toString();
    }
}
