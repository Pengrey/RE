package p357t;

import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import p092f0.AbstractC5250t0;
import p092f0.CompositionLocal;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p392v.InterfaceC10985k;
import p468yc.C13195u;

/* compiled from: Indication.kt */
/* renamed from: t.m */
/* loaded from: classes.dex */
public final class C10309m {

    /* renamed from: a */
    private static final AbstractC5250t0 f26871a = CompositionLocal.m24951d(C10310a.f26872w);

    /* compiled from: Indication.kt */
    /* renamed from: t.m$a */
    /* loaded from: classes.dex */
    static final class C10310a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        public static final C10310a f26872w = new C10310a();

        C10310a() {
            super(0);
        }

        /* renamed from: a */
        public final InterfaceC10307k mo42214q() {
            return Indication.f26793a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.m$b */
    /* loaded from: classes.dex */
    public static final class C10311b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10307k f26873w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10985k f26874x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10311b(InterfaceC10307k interfaceC10307k, InterfaceC10985k interfaceC10985k) {
            super(1);
            this.f26873w = interfaceC10307k;
            this.f26874x = interfaceC10985k;
        }

        /* renamed from: a */
        public final void m8299a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("indication");
            c0816w0.m39492a().m39649b("indication", this.f26873w);
            c0816w0.m39492a().m39649b("interactionSource", this.f26874x);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8299a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Indication.kt */
    /* renamed from: t.m$c */
    /* loaded from: classes.dex */
    public static final class C10312c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10307k f26875w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10985k f26876x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10312c(InterfaceC10307k interfaceC10307k, InterfaceC10985k interfaceC10985k) {
            super(3);
            this.f26875w = interfaceC10307k;
            this.f26876x = interfaceC10985k;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8298a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8298a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-1051155076);
            InterfaceC10307k interfaceC10307k = this.f26875w;
            if (interfaceC10307k == null) {
                interfaceC10307k = C10317q.f26892a;
            }
            InterfaceC10308l mo8304a = interfaceC10307k.mo8304a(this.f26876x, interfaceC5179i, 0);
            interfaceC5179i.mo25263g(-3686930);
            boolean mo25276I = interfaceC5179i.mo25276I(mo8304a);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C10313n(mo8304a);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            C10313n c10313n = (C10313n) mo25262h;
            interfaceC5179i.mo25282C();
            return c10313n;
        }
    }

    /* renamed from: a */
    public static final AbstractC5250t0 m8302a() {
        return f26871a;
    }

    /* renamed from: b */
    public static final InterfaceC9570f m8301b(InterfaceC9570f interfaceC9570f, InterfaceC10985k interfaceC10985k, InterfaceC10307k interfaceC10307k) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10985k, "interactionSource");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10311b(interfaceC10307k, interfaceC10985k) : C0812v0.m39497a(), new C10312c(interfaceC10307k, interfaceC10985k));
    }
}
