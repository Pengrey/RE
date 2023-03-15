package kotlinx.coroutines.flow;

import bd.CoroutineContext;
import bd.InterfaceC1886d;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.internal.C6867h0;
import p181jd.Intrinsics;
import p424wd.AbstractC11618a;
import p424wd.AbstractC11620c;
import p424wd.C11650r;
import p424wd.InterfaceC11646o;
import p468yc.C13195u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.flow.y */
/* loaded from: classes2.dex */
public final class C6845y<T> extends AbstractC11618a implements InterfaceC6835r, InterfaceC6785c, InterfaceC11646o {
    private volatile /* synthetic */ Object _state;

    /* renamed from: z */
    private int f18284z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.StateFlowImpl", m20196f = "StateFlow.kt", m20195l = {386, 398, 403}, m20194m = "collect")
    /* renamed from: kotlinx.coroutines.flow.y$a */
    /* loaded from: classes2.dex */
    public static final class C6846a extends AbstractC6757d {

        /* renamed from: A */
        Object f18285A;

        /* renamed from: B */
        /* synthetic */ Object f18286B;

        /* renamed from: D */
        int f18288D;

        /* renamed from: w */
        Object f18289w;

        /* renamed from: x */
        Object f18290x;

        /* renamed from: y */
        Object f18291y;

        /* renamed from: z */
        Object f18292z;

        C6846a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f18286B = obj;
            this.f18288D |= Integer.MIN_VALUE;
            return C6845y.this.mo20086d(null, this);
        }
    }

    public C6845y(Object obj) {
        this._state = obj;
    }

    /* renamed from: p */
    private final boolean m20024p(Object obj, Object obj2) {
        int i;
        AbstractC11620c[] m4579m;
        m4579m();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !Intrinsics.equals(obj3, obj)) {
                return false;
            }
            if (Intrinsics.equals(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i2 = this.f18284z;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f18284z = i3;
                AbstractC11620c[] m4579m2 = m4579m();
                C13195u c13195u = C13195u.f34156a;
                while (true) {
                    C6779a0[] c6779a0Arr = (C6779a0[]) m4579m2;
                    if (c6779a0Arr != null) {
                        for (C6779a0 c6779a0 : c6779a0Arr) {
                            if (c6779a0 != null) {
                                c6779a0.m20150f();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f18284z;
                        if (i == i3) {
                            this.f18284z = i3 + 1;
                            return true;
                        }
                        m4579m = m4579m();
                        C13195u c13195u2 = C13195u.f34156a;
                    }
                    m4579m2 = m4579m;
                    i3 = i;
                }
            } else {
                this.f18284z = i2 + 2;
                return true;
            }
        }
    }

    /* renamed from: a */
    public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
        setValue(obj);
        return C13195u.f34156a;
    }

    /* renamed from: b */
    public boolean mo20082b(Object obj, Object obj2) {
        if (obj == null) {
            obj = C11650r.f29782a;
        }
        if (obj2 == null) {
            obj2 = C11650r.f29782a;
        }
        return m20024p(obj, obj2);
    }

    /* renamed from: c */
    public boolean mo20083c(Object obj) {
        setValue(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
        if (p181jd.Intrinsics.equals(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00aa, B:38:0x00af, B:48:0x00d0, B:50:0x00d6, B:40:0x00b5, B:44:0x00bc, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [wd.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d4 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e6 -> B:34:0x00a6). Please submit an issue!!! */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo20086d(kotlinx.coroutines.flow.InterfaceC6787d r11, bd.InterfaceC1886d r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C6845y.mo20086d(kotlinx.coroutines.flow.d, bd.d):java.lang.Object");
    }

    /* renamed from: e */
    public InterfaceC6785c mo4540e(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        return C6847z.m20020d(this, coroutineContext, i, enumC6771a);
    }

    public Object getValue() {
        C6867h0 c6867h0 = C11650r.f29782a;
        Object obj = this._state;
        if (obj == c6867h0) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public C6779a0 m20028i() {
        return new C6779a0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public C6779a0[] m20027j(int i) {
        return new C6779a0[i];
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = C11650r.f29782a;
        }
        m20024p(null, obj);
    }
}
