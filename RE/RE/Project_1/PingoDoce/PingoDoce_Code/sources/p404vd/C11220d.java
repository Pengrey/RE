package p404vd;

import id.InterfaceC6108l;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.internal.C6867h0;
import kotlinx.coroutines.internal.C6907z;
import kotlinx.coroutines.internal.OnUndeliveredElement;
import p181jd.Intrinsics;
import p468yc.C13195u;
import p489zc._ArraysJvm;
import td.C10538l;
import td.C10539l0;

/* renamed from: vd.d */
/* loaded from: classes2.dex */
public class C11220d<E> extends AbstractC11208a {

    /* renamed from: A */
    private final EnumC6771a f28798A;

    /* renamed from: B */
    private final ReentrantLock f28799B;

    /* renamed from: C */
    private Object[] f28800C;

    /* renamed from: D */
    private int f28801D;
    private volatile /* synthetic */ int size;

    /* renamed from: z */
    private final int f28802z;

    /* compiled from: ArrayChannel.kt */
    /* renamed from: vd.d$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C11221a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28803a;

        static {
            int[] iArr = new int[EnumC6771a.values().length];
            iArr[EnumC6771a.SUSPEND.ordinal()] = 1;
            iArr[EnumC6771a.DROP_LATEST.ordinal()] = 2;
            iArr[EnumC6771a.DROP_OLDEST.ordinal()] = 3;
            f28803a = iArr;
        }
    }

    public C11220d(int i, EnumC6771a enumC6771a, InterfaceC6108l interfaceC6108l) {
        super(interfaceC6108l);
        this.f28802z = i;
        this.f28798A = enumC6771a;
        if (i >= 1) {
            this.f28799B = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            _ArraysJvm.m304t(objArr, C11216b.f28787a, 0, 0, 6, null);
            this.f28800C = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i + " was specified").toString());
    }

    /* renamed from: S */
    private final void m5703S(int i, Object obj) {
        if (i < this.f28802z) {
            m5702T(i);
            Object[] objArr = this.f28800C;
            objArr[(this.f28801D + i) % objArr.length] = obj;
            return;
        }
        if (C10539l0.m7720a()) {
            if (!(this.f28798A == EnumC6771a.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f28800C;
        int i2 = this.f28801D;
        objArr2[i2 % objArr2.length] = null;
        objArr2[(i + i2) % objArr2.length] = obj;
        this.f28801D = (i2 + 1) % objArr2.length;
    }

    /* renamed from: T */
    private final void m5702T(int i) {
        Object[] objArr = this.f28800C;
        if (i >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f28802z);
            Object[] objArr2 = new Object[min];
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr3 = this.f28800C;
                objArr2[i2] = objArr3[(this.f28801D + i2) % objArr3.length];
            }
            _ArraysJvm.m306r(objArr2, C11216b.f28787a, i, min);
            this.f28800C = objArr2;
            this.f28801D = 0;
        }
    }

    /* renamed from: U */
    private final C6867h0 m5701U(int i) {
        if (i < this.f28802z) {
            this.size = i + 1;
            return null;
        }
        int i2 = C11221a.f28803a[this.f28798A.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            return C11216b.f28788b;
        }
        return C11216b.f28789c;
    }

    /* renamed from: H */
    protected boolean mo5742H(AbstractC11239r abstractC11239r) {
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            return super.mo5742H(abstractC11239r);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: I */
    protected final boolean mo5647I() {
        return false;
    }

    /* renamed from: J */
    protected final boolean mo5646J() {
        return this.size == 0;
    }

    /* renamed from: K */
    public boolean mo5741K() {
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            return super.mo5741K();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: L */
    protected void mo5740L(boolean z) {
        InterfaceC6108l interfaceC6108l = this.f28794w;
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            int i = this.size;
            OnUndeliveredElement onUndeliveredElement = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.f28800C[this.f28801D];
                if (interfaceC6108l != null && obj != C11216b.f28787a) {
                    onUndeliveredElement = C6907z.m19834c(interfaceC6108l, obj, onUndeliveredElement);
                }
                Object[] objArr = this.f28800C;
                int i3 = this.f28801D;
                objArr[i3] = C11216b.f28787a;
                this.f28801D = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            C13195u c13195u = C13195u.f34156a;
            reentrantLock.unlock();
            super.mo5740L(z);
            if (onUndeliveredElement != null) {
                throw onUndeliveredElement;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* renamed from: P */
    protected Object mo5737P() {
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object m5719n = m5719n();
                if (m5719n == null) {
                    m5719n = C11216b.f28790d;
                }
                return m5719n;
            }
            Object[] objArr = this.f28800C;
            int i2 = this.f28801D;
            Object obj = objArr[i2];
            AbstractC11243v abstractC11243v = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = C11216b.f28790d;
            if (i == this.f28802z) {
                AbstractC11243v abstractC11243v2 = null;
                while (true) {
                    AbstractC11243v m5726C = m5726C();
                    if (m5726C == null) {
                        abstractC11243v = abstractC11243v2;
                        break;
                    }
                    Intrinsics.ifNullDoSomething(m5726C);
                    C6867h0 mo5636E = m5726C.mo5636E(null);
                    if (mo5636E != null) {
                        if (C10539l0.m7720a()) {
                            if (!(mo5636E == C10538l.f27253a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m5726C.mo5674J();
                        r6 = true;
                        abstractC11243v = m5726C;
                    } else {
                        m5726C.mo5635G();
                        abstractC11243v2 = m5726C;
                    }
                }
            }
            if (obj2 != C11216b.f28790d && !(obj2 instanceof C11233l)) {
                this.size = i;
                Object[] objArr2 = this.f28800C;
                objArr2[(this.f28801D + i) % objArr2.length] = obj2;
            }
            this.f28801D = (this.f28801D + 1) % this.f28800C.length;
            C13195u c13195u = C13195u.f34156a;
            if (r6) {
                Intrinsics.ifNullDoSomething(abstractC11243v);
                abstractC11243v.mo5639A();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    protected Object m5700k(AbstractC11243v abstractC11243v) {
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            return super.m5722k(abstractC11243v);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: l */
    protected String m5699l() {
        return "(buffer:capacity=" + this.f28802z + ",size=" + this.size + ')';
    }

    /* renamed from: u */
    protected final boolean mo5645u() {
        return false;
    }

    /* renamed from: v */
    protected final boolean mo5644v() {
        return this.size == this.f28802z && this.f28798A == EnumC6771a.SUSPEND;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    protected Object mo5665x(Object obj) {
        InterfaceC11241t<E> mo5747B;
        C6867h0 mo5648f;
        ReentrantLock reentrantLock = this.f28799B;
        reentrantLock.lock();
        try {
            int i = this.size;
            C11233l m5719n = m5719n();
            if (m5719n != null) {
                return m5719n;
            }
            C6867h0 m5701U = m5701U(i);
            if (m5701U != null) {
                return m5701U;
            }
            if (i == 0) {
                do {
                    mo5747B = mo5747B();
                    if (mo5747B != null) {
                        if (mo5747B instanceof C11233l) {
                            this.size = i;
                            return mo5747B;
                        }
                        Intrinsics.ifNullDoSomething(mo5747B);
                        mo5648f = mo5747B.mo5648f(obj, null);
                    }
                } while (mo5648f == null);
                if (C10539l0.m7720a()) {
                    if (!(mo5648f == C10538l.f27253a)) {
                        throw new AssertionError();
                    }
                }
                this.size = i;
                C13195u c13195u = C13195u.f34156a;
                reentrantLock.unlock();
                mo5747B.mo5650c(obj);
                return mo5747B.mo42225d();
            }
            m5703S(i, obj);
            return C11216b.f28788b;
        } finally {
            reentrantLock.unlock();
        }
    }
}
