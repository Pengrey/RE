package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p058d7.C4747a;
import p484z6.C13698a0;
import p484z6.InterfaceC13703c0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.d0 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2587d0 implements ServiceConnection, InterfaceC13703c0 {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f7484a = new HashMap();

    /* renamed from: b */
    private int f7485b = 2;

    /* renamed from: c */
    private boolean f7486c;

    /* renamed from: d */
    private IBinder f7487d;

    /* renamed from: e */
    private final C13698a0 f7488e;

    /* renamed from: f */
    private ComponentName f7489f;

    /* renamed from: g */
    final /* synthetic */ C2592f0 f7490g;

    public ServiceConnectionC2587d0(C2592f0 c2592f0, C13698a0 c13698a0) {
        this.f7490g = c2592f0;
        this.f7488e = c13698a0;
    }

    /* renamed from: a */
    public final int m33111a() {
        return this.f7485b;
    }

    /* renamed from: b */
    public final ComponentName m33110b() {
        return this.f7489f;
    }

    /* renamed from: c */
    public final IBinder m33109c() {
        return this.f7487d;
    }

    /* renamed from: d */
    public final void m33108d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f7484a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m33107e(String str, Executor executor) {
        C4747a c4747a;
        Context context;
        Context context2;
        C4747a c4747a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        this.f7485b = 3;
        C2592f0 c2592f0 = this.f7490g;
        c4747a = c2592f0.f7501j;
        context = c2592f0.f7498g;
        C13698a0 c13698a0 = this.f7488e;
        context2 = c2592f0.f7498g;
        boolean m26709d = c4747a.m26709d(context, str, c13698a0.m577c(context2), this, this.f7488e.m579a(), executor);
        this.f7486c = m26709d;
        if (m26709d) {
            handler = this.f7490g.f7499h;
            Message obtainMessage = handler.obtainMessage(1, this.f7488e);
            handler2 = this.f7490g.f7499h;
            j = this.f7490g.f7503l;
            handler2.sendMessageDelayed(obtainMessage, j);
            return;
        }
        this.f7485b = 2;
        try {
            C2592f0 c2592f02 = this.f7490g;
            c4747a2 = c2592f02.f7501j;
            context3 = c2592f02.f7498g;
            c4747a2.m26710c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: f */
    public final void m33106f(ServiceConnection serviceConnection, String str) {
        this.f7484a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m33105g(String str) {
        Handler handler;
        C4747a c4747a;
        Context context;
        handler = this.f7490g.f7499h;
        handler.removeMessages(1, this.f7488e);
        C2592f0 c2592f0 = this.f7490g;
        c4747a = c2592f0.f7501j;
        context = c2592f0.f7498g;
        c4747a.m26710c(context, this);
        this.f7486c = false;
        this.f7485b = 2;
    }

    /* renamed from: h */
    public final boolean m33104h(ServiceConnection serviceConnection) {
        return this.f7484a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m33103i() {
        return this.f7484a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m33102j() {
        return this.f7486c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f7490g.f7497f;
        synchronized (hashMap) {
            handler = this.f7490g.f7499h;
            handler.removeMessages(1, this.f7488e);
            this.f7487d = iBinder;
            this.f7489f = componentName;
            for (ServiceConnection serviceConnection : this.f7484a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f7485b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f7490g.f7497f;
        synchronized (hashMap) {
            handler = this.f7490g.f7499h;
            handler.removeMessages(1, this.f7488e);
            this.f7487d = null;
            this.f7489f = componentName;
            for (ServiceConnection serviceConnection : this.f7484a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f7485b = 2;
        }
    }
}
