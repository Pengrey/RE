package p080e9;

import android.content.Context;
import p031b9.InterfaceC1867x;

/* renamed from: e9.b */
/* loaded from: classes.dex */
public final class C5022b implements InterfaceC1867x<C5021a> {

    /* renamed from: a */
    private final InterfaceC1867x<Context> f13950a;

    public C5022b(InterfaceC1867x<Context> interfaceC1867x) {
        this.f13950a = interfaceC1867x;
    }

    /* renamed from: a */
    public static C5022b m25880a(InterfaceC1867x<Context> interfaceC1867x) {
        return new C5022b(interfaceC1867x);
    }

    @Override // p031b9.InterfaceC1867x
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5021a mo1547c() {
        return new C5021a(this.f13950a.mo1547c());
    }
}
