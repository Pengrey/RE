package me;

import ne.AbstractC7703b;
import p181jd.Intrinsics;

/* renamed from: me.d */
/* loaded from: classes2.dex */
public final class ToastEvent extends AbstractC7703b {

    /* renamed from: b */
    private final String f19013b;

    public ToastEvent(String str) {
        Intrinsics.isThisObjectNull(str, "message");
        this.f19013b = str;
    }

    /* renamed from: c */
    public String mo17670b() {
        return this.f19013b;
    }
}
