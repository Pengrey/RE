package p372u;

import android.content.Context;
import androidx.compose.p018ui.platform.C0824y;
import id.InterfaceC6108l;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p346s0.C10026f;
import p373u0.C10774f;
import p433x0.DrawScope;
import p433x0.InterfaceC12238c;
import p468yc.C13195u;
import p479z1.C13624s;

/* compiled from: AndroidOverScroll.kt */
/* renamed from: u.b */
/* loaded from: classes.dex */
public final class C10645b {

    /* renamed from: a */
    private static final C10646a f27438a = new C10646a();

    /* compiled from: AndroidOverScroll.kt */
    /* renamed from: u.b$a */
    /* loaded from: classes.dex */
    public static final class C10646a implements InterfaceC10764v {
        C10646a() {
        }

        /* renamed from: a */
        public void mo7199a() {
        }

        /* renamed from: b */
        public void mo7198b(long j, long j2, C10774f c10774f, int i) {
        }

        /* renamed from: c */
        public void mo7197c(DrawScope drawScope) {
            Intrinsics.isThisObjectNull(drawScope, "<this>");
        }

        /* renamed from: d */
        public void mo7196d(long j) {
        }

        /* renamed from: e */
        public long mo7195e(long j) {
            return C13624s.f34622b.m773a();
        }

        /* renamed from: f */
        public void mo7194f(long j, boolean z) {
        }

        /* renamed from: g */
        public boolean mo7193g() {
            return false;
        }

        /* renamed from: h */
        public long mo7192h(long j, C10774f c10774f, int i) {
            return C10774f.f27866b.m7134c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidOverScroll.kt */
    /* renamed from: u.b$b */
    /* loaded from: classes.dex */
    public static final class C10647b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10764v f27439w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10647b(InterfaceC10764v interfaceC10764v) {
            super(1);
            this.f27439w = interfaceC10764v;
        }

        /* renamed from: a */
        public final void m7401a(InterfaceC12238c interfaceC12238c) {
            Intrinsics.isThisObjectNull(interfaceC12238c, "$this$drawWithContent");
            interfaceC12238c.mo3277g0();
            this.f27439w.mo7197c(interfaceC12238c);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m7401a((InterfaceC12238c) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC9570f m7403a(InterfaceC9570f interfaceC9570f, InterfaceC10764v interfaceC10764v) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(interfaceC10764v, "overScrollController");
        return C10026f.m9371b(interfaceC9570f, new C10647b(interfaceC10764v));
    }

    /* renamed from: b */
    public static final InterfaceC10764v m7402b(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-1658914945);
        Context context = (Context) interfaceC5179i.mo25256n(C0824y.m39471g());
        C10761t c10761t = (C10761t) interfaceC5179i.mo25256n(C10762u.m7201a());
        interfaceC5179i.mo25263g(-3686552);
        boolean mo25276I = interfaceC5179i.mo25276I(context) | interfaceC5179i.mo25276I(c10761t);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            if (c10761t != null) {
                mo25262h = new AndroidOverScroll(context, c10761t);
            } else {
                mo25262h = f27438a;
            }
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC10764v interfaceC10764v = (InterfaceC10764v) mo25262h;
        interfaceC5179i.mo25282C();
        return interfaceC10764v;
    }
}
