package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.dynamite.j */
/* loaded from: classes.dex */
final class C2649j implements DynamiteModule.InterfaceC2637a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.InterfaceC2637a
    /* renamed from: a */
    public final DynamiteModule.InterfaceC2637a.C2639b mo32972a(Context context, String str, DynamiteModule.InterfaceC2637a.InterfaceC2638a interfaceC2638a) throws DynamiteModule.LoadingException {
        int mo32970b;
        DynamiteModule.InterfaceC2637a.C2639b c2639b = new DynamiteModule.InterfaceC2637a.C2639b();
        int mo32971a = interfaceC2638a.mo32971a(context, str);
        c2639b.f7584a = mo32971a;
        int i = 0;
        if (mo32971a != 0) {
            mo32970b = interfaceC2638a.mo32970b(context, str, false);
            c2639b.f7585b = mo32970b;
        } else {
            mo32970b = interfaceC2638a.mo32970b(context, str, true);
            c2639b.f7585b = mo32970b;
        }
        int i2 = c2639b.f7584a;
        if (i2 != 0) {
            i = i2;
        } else if (mo32970b == 0) {
            c2639b.f7586c = 0;
            return c2639b;
        }
        if (mo32970b >= i) {
            c2639b.f7586c = 1;
        } else {
            c2639b.f7586c = -1;
        }
        return c2639b;
    }
}
