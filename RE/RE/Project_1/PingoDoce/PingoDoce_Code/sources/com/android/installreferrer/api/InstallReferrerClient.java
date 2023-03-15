package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class InstallReferrerClient {

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$b */
    /* loaded from: classes.dex */
    public static final class C2253b {

        /* renamed from: a */
        private final Context f6553a;

        /* renamed from: a */
        public InstallReferrerClient m34279a() {
            Context context = this.f6553a;
            if (context != null) {
                return new C2254a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        private C2253b(Context context) {
            this.f6553a = context;
        }
    }

    /* renamed from: b */
    public static C2253b m34280b(Context context) {
        return new C2253b(context);
    }

    /* renamed from: a */
    public abstract ReferrerDetails mo34275a() throws RemoteException;

    /* renamed from: c */
    public abstract void mo34274c(InstallReferrerStateListener installReferrerStateListener);
}
