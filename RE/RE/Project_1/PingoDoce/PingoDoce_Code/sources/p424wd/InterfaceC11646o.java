package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.InterfaceC6785c;

/* renamed from: wd.o */
/* loaded from: classes2.dex */
public interface InterfaceC11646o<T> extends InterfaceC6785c<T> {

    /* compiled from: ChannelFlow.kt */
    /* renamed from: wd.o$a */
    /* loaded from: classes2.dex */
    public static final class C11647a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC6785c m4539a(InterfaceC11646o interfaceC11646o, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = C1894h.f5621w;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    enumC6771a = EnumC6771a.SUSPEND;
                }
                return interfaceC11646o.mo4540e(coroutineContext, i, enumC6771a);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: e */
    InterfaceC6785c<T> mo4540e(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a);
}
