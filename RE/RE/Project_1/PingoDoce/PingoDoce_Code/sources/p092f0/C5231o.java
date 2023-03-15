package p092f0;

import androidx.compose.runtime.CompositionContext;
import p112g0.IdentityArrayMap;
import p112g0.IdentityArraySet;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: Composition.kt */
/* renamed from: f0.o */
/* loaded from: classes.dex */
public final class C5231o {

    /* renamed from: a */
    private static final Object f14485a = new Object();

    /* renamed from: a */
    public static final InterfaceC5216l m24969a(Applier applier, CompositionContext compositionContext) {
        Intrinsics.isThisObjectNull(applier, "applier");
        Intrinsics.isThisObjectNull(compositionContext, "parent");
        return new Composition(compositionContext, applier, null, 4, null);
    }

    /* renamed from: b */
    public static final /* synthetic */ void m24968b(IdentityArrayMap identityArrayMap, Object obj, Object obj2) {
        m24966d(identityArrayMap, obj, obj2);
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m24967c() {
        return f14485a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m24966d(IdentityArrayMap identityArrayMap, Object obj, Object obj2) {
        if (identityArrayMap.m23691a(obj)) {
            IdentityArraySet identityArraySet = (IdentityArraySet) identityArrayMap.m23688d(obj);
            if (identityArraySet == null) {
                return;
            }
            identityArraySet.add(obj2);
            return;
        }
        IdentityArraySet identityArraySet2 = new IdentityArraySet();
        identityArraySet2.add(obj2);
        C13195u c13195u = C13195u.f34156a;
        identityArrayMap.m23682j(obj, identityArraySet2);
    }
}
