package p337rd;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Iterator;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
/* renamed from: rd.k */
/* loaded from: classes2.dex */
public class C9876k extends C9875j {

    /* compiled from: Sequences.kt */
    /* renamed from: rd.k$a */
    /* loaded from: classes2.dex */
    public static final class C9877a implements InterfaceC9870e {

        /* renamed from: a */
        final /* synthetic */ Iterator f25866a;

        public C9877a(Iterator it) {
            this.f25866a = it;
        }

        public Iterator iterator() {
            return this.f25866a;
        }
    }

    /* renamed from: c */
    public static InterfaceC9870e m9761c(Iterator it) {
        Intrinsics.isThisObjectNull(it, "<this>");
        return m9760d(new C9877a(it));
    }

    /* renamed from: d */
    public static final InterfaceC9870e m9760d(InterfaceC9870e interfaceC9870e) {
        Intrinsics.isThisObjectNull(interfaceC9870e, "<this>");
        return interfaceC9870e instanceof SequencesJVM ? interfaceC9870e : new SequencesJVM(interfaceC9870e);
    }

    /* renamed from: e */
    public static InterfaceC9870e m9759e(InterfaceC6097a interfaceC6097a, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "seedFunction");
        Intrinsics.isThisObjectNull(interfaceC6108l, "nextFunction");
        return new C9868d(interfaceC6097a, interfaceC6108l);
    }
}
