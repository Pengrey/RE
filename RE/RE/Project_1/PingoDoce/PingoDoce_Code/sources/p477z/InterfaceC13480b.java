package p477z;

import bd.InterfaceC1886d;
import p373u0.Rect;
import p468yc.C13195u;

/* renamed from: z.b */
/* loaded from: classes.dex */
public interface InterfaceC13480b {

    /* compiled from: BringIntoViewRequester.kt */
    /* renamed from: z.b$a */
    /* loaded from: classes.dex */
    public static final class C13481a {
        /* renamed from: a */
        public static /* synthetic */ Object m1288a(InterfaceC13480b interfaceC13480b, Rect rect, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    rect = null;
                }
                return interfaceC13480b.mo1289a(rect, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
    }

    /* renamed from: a */
    Object mo1289a(Rect rect, InterfaceC1886d<? super C13195u> interfaceC1886d);
}
