package p244n0;

import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import p181jd.AbstractC6438m;
import p181jd.C6431d0;
import p181jd.Intrinsics;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public final class ListSaver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListSaver.kt */
    /* renamed from: n0.a$a */
    /* loaded from: classes.dex */
    public static final class C7554a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6112p f20013w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7554a(InterfaceC6112p interfaceC6112p) {
            super(2);
            this.f20013w = interfaceC6112p;
        }

        /* renamed from: a */
        public final Object mo39856d(InterfaceC7579k interfaceC7579k, Object obj) {
            Intrinsics.isThisObjectNull(interfaceC7579k, "$this$Saver");
            List list = (List) this.f20013w.mo39856d(interfaceC7579k, obj);
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                Object obj2 = list.get(i);
                if (obj2 != null && !interfaceC7579k.mo18106a(obj2)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                i = i2;
            }
            if (!list.isEmpty()) {
                return new ArrayList(list);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final InterfaceC7575i m18154a(InterfaceC6112p interfaceC6112p, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "save");
        Intrinsics.isThisObjectNull(interfaceC6108l, "restore");
        return Saver.m18111a(new C7554a(interfaceC6112p), (InterfaceC6108l) C6431d0.m20951d(interfaceC6108l, 1));
    }
}
