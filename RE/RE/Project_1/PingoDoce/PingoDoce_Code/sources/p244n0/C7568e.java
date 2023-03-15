package p244n0;

import id.InterfaceC6097a;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;

/* renamed from: n0.e */
/* loaded from: classes.dex */
public final class C7568e {

    /* compiled from: SaveableStateHolder.kt */
    /* renamed from: n0.e$a */
    /* loaded from: classes.dex */
    static final class C7569a extends AbstractC6438m implements InterfaceC6097a<SaveableStateHolder> {

        /* renamed from: w */
        public static final C7569a f20046w = new C7569a();

        C7569a() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final SaveableStateHolder mo42214q() {
            return new SaveableStateHolder(null, 1, null);
        }
    }

    /* renamed from: a */
    public static final InterfaceC7559c m18129a(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-579869653);
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) RememberSaveable.m18151b(new Object[0], SaveableStateHolder.f20024d.m18136a(), null, C7569a.f20046w, interfaceC5179i, 8, 4);
        saveableStateHolder.m18139h((InterfaceC7570f) interfaceC5179i.mo25256n(C7573h.m18115b()));
        interfaceC5179i.mo25282C();
        return saveableStateHolder;
    }
}
