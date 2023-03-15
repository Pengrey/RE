package androidx.compose.foundation.lazy;

import id.InterfaceC6097a;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p244n0.RememberSaveable;

/* renamed from: androidx.compose.foundation.lazy.h */
/* loaded from: classes.dex */
public final class C0641h {

    /* compiled from: LazyListState.kt */
    /* renamed from: androidx.compose.foundation.lazy.h$a */
    /* loaded from: classes.dex */
    static final class C0642a extends AbstractC6438m implements InterfaceC6097a<LazyListState> {

        /* renamed from: w */
        final /* synthetic */ int f2000w;

        /* renamed from: x */
        final /* synthetic */ int f2001x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0642a(int i, int i2) {
            super(0);
            this.f2000w = i;
            this.f2001x = i2;
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final LazyListState mo42214q() {
            return new LazyListState(this.f2000w, this.f2001x);
        }
    }

    /* renamed from: a */
    public static final LazyListState m40005a(int i, int i2, InterfaceC5179i interfaceC5179i, int i3, int i4) {
        interfaceC5179i.mo25263g(690738462);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        LazyListState lazyListState = (LazyListState) RememberSaveable.m18151b(new Object[0], LazyListState.f1976p.m40008a(), null, new C0642a(i, i2), interfaceC5179i, 72, 4);
        interfaceC5179i.mo25282C();
        return lazyListState;
    }
}
