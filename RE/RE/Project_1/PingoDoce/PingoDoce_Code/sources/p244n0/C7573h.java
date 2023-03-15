package p244n0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Map;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* compiled from: SaveableStateRegistry.kt */
/* renamed from: n0.h */
/* loaded from: classes.dex */
public final class C7573h {

    /* renamed from: a */
    private static final AbstractC5250t0 f20053a = CompositionLocal.m24951d(C7574a.f20054w);

    /* compiled from: SaveableStateRegistry.kt */
    /* renamed from: n0.h$a */
    /* loaded from: classes.dex */
    static final class C7574a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C7574a f20054w = new C7574a();

        C7574a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC7570f mo42214q() {
            return null;
        }
    }

    /* renamed from: a */
    public static final InterfaceC7570f m18116a(Map map, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "canBeSaved");
        return new SaveableStateRegistry(map, interfaceC6108l);
    }

    /* renamed from: b */
    public static final AbstractC5250t0 m18115b() {
        return f20053a;
    }
}
