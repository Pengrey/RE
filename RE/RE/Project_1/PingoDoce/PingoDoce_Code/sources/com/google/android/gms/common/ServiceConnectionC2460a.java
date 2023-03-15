package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2597i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes.dex */
public class ServiceConnectionC2460a implements ServiceConnection {

    /* renamed from: a */
    boolean f7148a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f7149b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder m33516a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C2597i.m33077i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f7148a) {
            this.f7148a = true;
            IBinder poll = this.f7149b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f7149b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
