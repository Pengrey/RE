package kotlinx.coroutines.flow;

import bd.CoroutineContext;
import com.google.crypto.tink.shaded.protobuf.Reader;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.internal.C6867h0;
import p424wd.C11631h;

/* renamed from: kotlinx.coroutines.flow.v */
/* loaded from: classes2.dex */
public final class C6842v {

    /* renamed from: a */
    public static final C6867h0 f18281a = new C6867h0("NO_VALUE");

    /* renamed from: a */
    public static final <T> InterfaceC6834q<T> m20040a(int i, int i2, EnumC6771a enumC6771a) {
        boolean z = true;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 >= 0) {
            if (i <= 0 && i2 <= 0 && enumC6771a != EnumC6771a.SUSPEND) {
                z = false;
            }
            if (z) {
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Reader.READ_DONE;
                }
                return new C6838u(i, i3, enumC6771a);
            }
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC6771a).toString());
        }
        throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC6834q m20039b(int i, int i2, EnumC6771a enumC6771a, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC6771a = EnumC6771a.SUSPEND;
        }
        return m20040a(i, i2, enumC6771a);
    }

    /* renamed from: e */
    public static final <T> InterfaceC6785c<T> m20036e(InterfaceC6837t<? extends T> interfaceC6837t, CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return ((i == 0 || i == -3) && enumC6771a == EnumC6771a.SUSPEND) ? interfaceC6837t : new C11631h(interfaceC6837t, coroutineContext, i, enumC6771a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m20035f(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m20034g(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
