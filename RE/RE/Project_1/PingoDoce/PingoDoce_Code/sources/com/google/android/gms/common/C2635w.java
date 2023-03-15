package com.google.android.gms.common;

import java.util.concurrent.Callable;
import p439x6.C12290e;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.w */
/* loaded from: classes.dex */
final class C2635w extends C2636x {

    /* renamed from: e */
    private final Callable<String> f7554e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2635w(Callable callable, C12290e c12290e) {
        super(false, null, null);
        this.f7554e = callable;
    }

    @Override // com.google.android.gms.common.C2636x
    /* renamed from: a */
    final String mo32991a() {
        try {
            return this.f7554e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
