package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* loaded from: classes.dex */
public final class C2709c1 {

    /* renamed from: a */
    final C2935q3 f7682a;

    /* renamed from: b */
    C2952r4 f7683b;

    /* renamed from: c */
    final C2707c f7684c;

    /* renamed from: d */
    private final C2978se f7685d;

    public C2709c1() {
        C2935q3 c2935q3 = new C2935q3();
        this.f7682a = c2935q3;
        this.f7683b = c2935q3.f7946b.m32163a();
        this.f7684c = new C2707c();
        this.f7685d = new C2978se();
        c2935q3.f7948d.m32004a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2709c1.this.m32821b();
            }
        });
        c2935q3.f7948d.m32004a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.b0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2972s8(C2709c1.this.f7684c);
            }
        });
    }

    /* renamed from: a */
    public final C2707c m32822a() {
        return this.f7684c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ AbstractC2819j m32821b() throws Exception {
        return new C2914oe(this.f7685d);
    }

    /* renamed from: c */
    public final void m32820c(C2777g5 c2777g5) throws zzd {
        AbstractC2819j abstractC2819j;
        try {
            this.f7683b = this.f7682a.f7946b.m32163a();
            if (!(this.f7682a.m32193a(this.f7683b, (C2857l5[]) c2777g5.m32625C().toArray(new C2857l5[0])) instanceof C2787h)) {
                for (C2745e5 c2745e5 : c2777g5.m32627A().m32810D()) {
                    List m32758C = c2745e5.m32758C();
                    String m32759B = c2745e5.m32759B();
                    Iterator it = m32758C.iterator();
                    while (it.hasNext()) {
                        InterfaceC2931q m32193a = this.f7682a.m32193a(this.f7683b, (C2857l5) it.next());
                        if (m32193a instanceof C2883n) {
                            C2952r4 c2952r4 = this.f7683b;
                            if (c2952r4.m32156h(m32759B)) {
                                InterfaceC2931q m32160d = c2952r4.m32160d(m32759B);
                                if (!(m32160d instanceof AbstractC2819j)) {
                                    String valueOf = String.valueOf(m32759B);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                abstractC2819j = (AbstractC2819j) m32160d;
                            } else {
                                abstractC2819j = null;
                            }
                            if (abstractC2819j == null) {
                                String valueOf2 = String.valueOf(m32759B);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            abstractC2819j.mo32094a(this.f7683b, Collections.singletonList(m32193a));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* renamed from: d */
    public final void m32819d(String str, Callable callable) {
        this.f7682a.f7948d.m32004a(str, callable);
    }

    /* renamed from: e */
    public final boolean m32818e(C2691b c2691b) throws zzd {
        try {
            this.f7684c.m32825d(c2691b);
            this.f7682a.f7947c.m32157g("runtime.counter", new C2803i(Double.valueOf(0.0d)));
            this.f7685d.m32092b(this.f7683b.m32163a(), this.f7684c);
            if (m32816g()) {
                return true;
            }
            return m32817f();
        } catch (Throwable th2) {
            throw new zzd(th2);
        }
    }

    /* renamed from: f */
    public final boolean m32817f() {
        return !this.f7684c.m32826c().isEmpty();
    }

    /* renamed from: g */
    public final boolean m32816g() {
        C2707c c2707c = this.f7684c;
        return !c2707c.m32827b().equals(c2707c.m32828a());
    }
}
