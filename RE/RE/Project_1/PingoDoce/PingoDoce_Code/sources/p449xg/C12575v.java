package p449xg;

import android.content.Context;
import android.content.SharedPreferences;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.v */
/* loaded from: classes2.dex */
public final class C12575v implements InterfaceC11614c<SharedPreferences> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32569a;

    public C12575v(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32569a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12575v m2895a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12575v(interfaceC12341a);
    }

    /* renamed from: c */
    public static SharedPreferences m2893c(Context context) {
        return (SharedPreferences) C11617f.m4587d(AppProviders.f32545a.m2962t(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public SharedPreferences mo42226get() {
        return m2893c(this.f32569a.mo42226get());
    }
}
