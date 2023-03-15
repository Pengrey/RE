package p393v0;

import android.graphics.Canvas;
import p181jd.Intrinsics;

/* compiled from: AndroidCanvas.android.kt */
/* renamed from: v0.c */
/* loaded from: classes.dex */
public final class C11002c {

    /* renamed from: a */
    private static final Canvas f28318a = new Canvas();

    /* renamed from: a */
    public static final InterfaceC11064u m6598a(InterfaceC11025h0 interfaceC11025h0) {
        Intrinsics.isThisObjectNull(interfaceC11025h0, "image");
        C10997b c10997b = new C10997b();
        c10997b.m6606t(new Canvas(C11014f.m6533b(interfaceC11025h0)));
        return c10997b;
    }

    /* renamed from: b */
    public static final /* synthetic */ Canvas m6597b() {
        return f28318a;
    }

    /* renamed from: c */
    public static final Canvas m6596c(InterfaceC11064u interfaceC11064u) {
        Intrinsics.isThisObjectNull(interfaceC11064u, "<this>");
        return ((C10997b) interfaceC11064u).m6608r();
    }
}
