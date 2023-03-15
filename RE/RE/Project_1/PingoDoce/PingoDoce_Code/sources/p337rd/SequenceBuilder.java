package p337rd;

import bd.InterfaceC1886d;
import cd.IntrinsicsJvm;
import id.InterfaceC6112p;
import java.util.Iterator;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rd.i */
/* loaded from: classes2.dex */
public class SequenceBuilder {

    /* compiled from: Sequences.kt */
    /* renamed from: rd.i$a */
    /* loaded from: classes2.dex */
    public static final class C9874a implements InterfaceC9870e {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6112p f25865a;

        public C9874a(InterfaceC6112p interfaceC6112p) {
            this.f25865a = interfaceC6112p;
        }

        public Iterator iterator() {
            return SequenceBuilder.m9763a(this.f25865a);
        }
    }

    /* renamed from: a */
    public static final Iterator m9763a(InterfaceC6112p interfaceC6112p) {
        InterfaceC1886d<C13195u> m34638b;
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        C9871f c9871f = new C9871f();
        m34638b = IntrinsicsJvm.m34638b(interfaceC6112p, c9871f, c9871f);
        c9871f.m9773d(m34638b);
        return c9871f;
    }

    /* renamed from: b */
    public static InterfaceC9870e m9762b(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "block");
        return new C9874a(interfaceC6112p);
    }
}
