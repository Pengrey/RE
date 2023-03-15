package p449xg;

import android.content.Context;
import com.google.android.play.core.review.InterfaceC3954c;
import p423wc.C11617f;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: xg.p */
/* loaded from: classes2.dex */
public final class C12512p implements InterfaceC11614c<InterfaceC3954c> {

    /* renamed from: a */
    private final InterfaceC12341a<Context> f32562a;

    public C12512p(InterfaceC12341a<Context> interfaceC12341a) {
        this.f32562a = interfaceC12341a;
    }

    /* renamed from: a */
    public static C12512p m2916a(InterfaceC12341a<Context> interfaceC12341a) {
        return new C12512p(interfaceC12341a);
    }

    /* renamed from: c */
    public static InterfaceC3954c m2914c(Context context) {
        return (InterfaceC3954c) C11617f.m4587d(AppProviders.f32545a.m2968n(context));
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public InterfaceC3954c mo42226get() {
        return m2914c(this.f32562a.mo42226get());
    }
}
