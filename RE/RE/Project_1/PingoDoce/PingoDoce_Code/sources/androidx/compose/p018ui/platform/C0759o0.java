package androidx.compose.p018ui.platform;

import id.InterfaceC6097a;
import java.util.Map;
import p181jd.Intrinsics;
import p244n0.InterfaceC7570f;

/* compiled from: DisposableSaveableStateRegistry.android.kt */
/* renamed from: androidx.compose.ui.platform.o0 */
/* loaded from: classes.dex */
public final class C0759o0 implements InterfaceC7570f {

    /* renamed from: a */
    private final InterfaceC6097a f2324a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC7570f f2325b;

    public C0759o0(InterfaceC7570f interfaceC7570f, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC7570f, "saveableStateRegistry");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onDispose");
        this.f2324a = interfaceC6097a;
        this.f2325b = interfaceC7570f;
    }

    /* renamed from: a */
    public boolean mo18127a(Object obj) {
        Intrinsics.isThisObjectNull(obj, "value");
        return this.f2325b.mo18127a(obj);
    }

    /* renamed from: b */
    public Map mo18126b() {
        return this.f2325b.mo18126b();
    }

    /* renamed from: c */
    public InterfaceC7570f.InterfaceC7571a mo18125c(String str, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(interfaceC6097a, "valueProvider");
        return this.f2325b.mo18125c(str, interfaceC6097a);
    }

    /* renamed from: d */
    public Object mo18124d(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        return this.f2325b.mo18124d(str);
    }

    /* renamed from: e */
    public final void m39648e() {
        this.f2324a.mo42214q();
    }
}
