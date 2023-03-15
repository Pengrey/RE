package com.scottyab.rootbeer;

import p272oc.C8060a;

/* loaded from: classes2.dex */
public class RootBeerNative {

    /* renamed from: a */
    private static boolean f12047a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f12047a = true;
        } catch (UnsatisfiedLinkError e) {
            C8060a.m17020b(e);
        }
    }

    /* renamed from: a */
    public boolean m27491a() {
        return f12047a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
