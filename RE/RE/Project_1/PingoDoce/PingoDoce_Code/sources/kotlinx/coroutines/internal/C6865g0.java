package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.InterfaceC6758e;
import p181jd.Intrinsics;
import p468yc.C13182l;
import p468yc.C13183m;
import p468yc.C13186n;
import p468yc.C13191r;
import sd.StringsJVM;
import td.C10539l0;
import td.InterfaceC10490c0;

/* renamed from: kotlinx.coroutines.internal.g0 */
/* loaded from: classes2.dex */
public final class C6865g0 {

    /* renamed from: a */
    private static final String f18312a;

    /* renamed from: b */
    private static final String f18313b;

    static {
        Object m1458a;
        Object m1458a2;
        try {
            C13183m.C13184a c13184a = C13183m.f34143w;
            m1458a = C13183m.m1458a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th2) {
            C13183m.C13184a c13184a2 = C13183m.f34143w;
            m1458a = C13183m.m1458a(C13186n.m1454a(th2));
        }
        if (C13183m.m1457b(m1458a) != null) {
            m1458a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f18312a = (String) m1458a;
        try {
            C13183m.C13184a c13184a3 = C13183m.f34143w;
            m1458a2 = C13183m.m1458a(C6865g0.class.getCanonicalName());
        } catch (Throwable th3) {
            C13183m.C13184a c13184a4 = C13183m.f34143w;
            m1458a2 = C13183m.m1458a(C13186n.m1454a(th3));
        }
        if (C13183m.m1457b(m1458a2) != null) {
            m1458a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f18313b = (String) m1458a2;
    }

    /* renamed from: a */
    public static final /* synthetic */ Throwable m19979a(Throwable th2, InterfaceC6758e interfaceC6758e) {
        return m19970j(th2, interfaceC6758e);
    }

    /* renamed from: b */
    public static final StackTraceElement m19978b(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final C13182l m19977c(Throwable th2) {
        boolean z;
        Throwable cause = th2.getCause();
        if (cause != null && Intrinsics.equals(cause.getClass(), th2.getClass())) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (m19972h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return C13191r.m1447a(cause, stackTrace);
            }
            return C13191r.m1447a(th2, new StackTraceElement[0]);
        }
        return C13191r.m1447a(th2, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final Throwable m19976d(Throwable th2, Throwable th3, ArrayDeque arrayDeque) {
        arrayDeque.addFirst(m19978b("Coroutine boundary"));
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int m19973g = m19973g(stackTrace, f18312a);
        int i = 0;
        if (m19973g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            th3.setStackTrace((StackTraceElement[]) array);
            return th3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + m19973g];
        for (int i2 = 0; i2 < m19973g; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + m19973g] = (StackTraceElement) it.next();
            i++;
        }
        th3.setStackTrace(stackTraceElementArr);
        return th3;
    }

    /* renamed from: e */
    private static final ArrayDeque m19975e(InterfaceC6758e interfaceC6758e) {
        ArrayDeque arrayDeque = new ArrayDeque();
        StackTraceElement stackTraceElement = interfaceC6758e.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            interfaceC6758e = interfaceC6758e.getCallerFrame();
            if (interfaceC6758e == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = interfaceC6758e.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: f */
    private static final boolean m19974f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && Intrinsics.equals(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && Intrinsics.equals(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && Intrinsics.equals(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m19973g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (Intrinsics.equals(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m19972h(StackTraceElement stackTraceElement) {
        boolean m8948C;
        m8948C = StringsJVM.m8948C(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return m8948C;
    }

    /* renamed from: i */
    private static final void m19971i(StackTraceElement[] stackTraceElementArr, ArrayDeque arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m19972h(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 > length2) {
            return;
        }
        while (true) {
            if (m19974f(stackTraceElementArr[length2], (StackTraceElement) arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i2) {
                return;
            }
            length2--;
        }
    }

    /* renamed from: j */
    private static final Throwable m19970j(Throwable th2, InterfaceC6758e interfaceC6758e) {
        C13182l m19977c = m19977c(th2);
        Throwable th3 = (Throwable) m19977c.m1462a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m19977c.m1461b();
        Throwable m19967m = m19967m(th3);
        if (m19967m == null) {
            return th2;
        }
        ArrayDeque m19975e = m19975e(interfaceC6758e);
        if (m19975e.isEmpty()) {
            return th2;
        }
        if (th3 != th2) {
            m19971i(stackTraceElementArr, m19975e);
        }
        return m19976d(th3, m19967m, m19975e);
    }

    /* renamed from: k */
    public static final Throwable m19969k(Throwable th2) {
        Throwable m19967m;
        return (C10539l0.m7717d() && (m19967m = m19967m(th2)) != null) ? m19968l(m19967m) : th2;
    }

    /* renamed from: l */
    private static final Throwable m19968l(Throwable th2) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int m19973g = m19973g(stackTrace, f18313b);
        int i = m19973g + 1;
        int m19973g2 = m19973g(stackTrace, f18312a);
        int i2 = (length - m19973g) - (m19973g2 == -1 ? 0 : length - m19973g2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = m19978b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        th2.setStackTrace(stackTraceElementArr);
        return th2;
    }

    /* renamed from: m */
    private static final Throwable m19967m(Throwable th2) {
        Throwable m19930g = C6874l.m19930g(th2);
        if (m19930g == null) {
            return null;
        }
        if ((th2 instanceof InterfaceC10490c0) || Intrinsics.equals(m19930g.getMessage(), th2.getMessage())) {
            return m19930g;
        }
        return null;
    }

    /* renamed from: n */
    public static final Throwable m19966n(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause != null && Intrinsics.equals(cause.getClass(), th2.getClass())) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m19972h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return cause;
            }
        }
        return th2;
    }
}
