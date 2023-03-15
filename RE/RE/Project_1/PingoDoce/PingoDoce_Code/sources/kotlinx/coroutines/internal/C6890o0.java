package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import p181jd.Intrinsics;
import td.InterfaceC10553o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.o0 */
/* loaded from: classes2.dex */
public final class C6890o0 {

    /* renamed from: a */
    public final CoroutineContext f18341a;

    /* renamed from: b */
    private final Object[] f18342b;

    /* renamed from: c */
    private final InterfaceC10553o2[] f18343c;

    /* renamed from: d */
    private int f18344d;

    public C6890o0(CoroutineContext coroutineContext, int i) {
        this.f18341a = coroutineContext;
        this.f18342b = new Object[i];
        this.f18343c = new InterfaceC10553o2[i];
    }

    /* renamed from: a */
    public final void m19893a(InterfaceC10553o2 interfaceC10553o2, Object obj) {
        Object[] objArr = this.f18342b;
        int i = this.f18344d;
        objArr[i] = obj;
        InterfaceC10553o2[] interfaceC10553o2Arr = this.f18343c;
        this.f18344d = i + 1;
        interfaceC10553o2Arr[i] = interfaceC10553o2;
    }

    /* renamed from: b */
    public final void m19892b(CoroutineContext coroutineContext) {
        int length = this.f18343c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC10553o2 interfaceC10553o2 = this.f18343c[length];
            Intrinsics.ifNullDoSomething(interfaceC10553o2);
            interfaceC10553o2.mo7691v0(coroutineContext, this.f18342b[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
