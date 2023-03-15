package p211l1;

import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.Rect;

/* compiled from: TextActionModeCallback.android.kt */
/* renamed from: l1.a */
/* loaded from: classes.dex */
public final class C6961a {

    /* renamed from: a */
    private InterfaceC6097a f18493a;

    /* renamed from: b */
    private InterfaceC6097a f18494b;

    /* renamed from: c */
    private InterfaceC6097a f18495c;

    /* renamed from: d */
    private InterfaceC6097a f18496d;

    public C6961a(Rect rect, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, InterfaceC6097a interfaceC6097a3, InterfaceC6097a interfaceC6097a4) {
        Intrinsics.isThisObjectNull(rect, "rect");
        this.f18493a = interfaceC6097a;
        this.f18494b = interfaceC6097a2;
        this.f18495c = interfaceC6097a3;
        this.f18496d = interfaceC6097a4;
    }

    public /* synthetic */ C6961a(Rect rect, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2, InterfaceC6097a interfaceC6097a3, InterfaceC6097a interfaceC6097a4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Rect.f27871e.m7115a() : rect, (i & 2) != 0 ? null : interfaceC6097a, (i & 4) != 0 ? null : interfaceC6097a2, (i & 8) != 0 ? null : interfaceC6097a3, (i & 16) == 0 ? interfaceC6097a4 : null);
    }
}
