package p092f0;

import android.os.Looper;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import id.InterfaceC6097a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p260o0.InterfaceC7981q;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* compiled from: ActualAndroid.android.kt */
/* renamed from: f0.b */
/* loaded from: classes.dex */
public final class C5152b {

    /* renamed from: a */
    private static final InterfaceC13178g f14235a;

    /* compiled from: ActualAndroid.android.kt */
    /* renamed from: f0.b$a */
    /* loaded from: classes.dex */
    static final class C5153a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C5153a f14236w = new C5153a();

        C5153a() {
            super(0);
        }

        /* renamed from: a */
        public final MonotonicFrameClock mo42214q() {
            return Looper.getMainLooper() != null ? C5246t.f14511w : C5155b1.f14240w;
        }
    }

    static {
        InterfaceC13178g m1464a;
        m1464a = LazyJVM.m1464a(C5153a.f14236w);
        f14235a = m1464a;
    }

    /* renamed from: a */
    public static final InterfaceC7981q m25531a(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        Intrinsics.isThisObjectNull(snapshotMutationPolicy, "policy");
        return new ParcelableSnapshotMutableState(obj, snapshotMutationPolicy);
    }
}
