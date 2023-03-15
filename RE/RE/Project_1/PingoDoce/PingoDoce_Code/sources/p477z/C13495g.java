package p477z;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import androidx.compose.p018ui.platform.C0824y;
import id.InterfaceC6108l;
import id.InterfaceC6113q;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5264x;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p468yc.C13195u;

/* compiled from: BringRectangleOnScreen.android.kt */
/* renamed from: z.g */
/* loaded from: classes.dex */
public final class C13495g {

    /* compiled from: InspectableValue.kt */
    /* renamed from: z.g$a */
    /* loaded from: classes.dex */
    public static final class C13496a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C13494f f34304w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13496a(C13494f c13494f) {
            super(1);
            this.f34304w = c13494f;
        }

        /* renamed from: a */
        public final void m1260a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("bringRectangleOnScreenRequester");
            c0816w0.m39492a().m39649b("bringRectangleOnScreenRequester", this.f34304w);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m1260a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BringRectangleOnScreen.android.kt */
    /* renamed from: z.g$b */
    /* loaded from: classes.dex */
    public static final class C13497b extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ C13494f f34305w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BringRectangleOnScreen.android.kt */
        /* renamed from: z.g$b$a */
        /* loaded from: classes.dex */
        public static final class C13498a extends AbstractC6438m implements InterfaceC6108l {

            /* renamed from: w */
            final /* synthetic */ C13494f f34306w;

            /* renamed from: x */
            final /* synthetic */ View f34307x;

            /* compiled from: Effects.kt */
            /* renamed from: z.g$b$a$a */
            /* loaded from: classes.dex */
            public static final class C13499a implements InterfaceC5264x {

                /* renamed from: a */
                final /* synthetic */ C13494f f34308a;

                public C13499a(C13494f c13494f) {
                    this.f34308a = c13494f;
                }

                /* renamed from: b */
                public void mo24852b() {
                    this.f34308a.m1264b(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13498a(C13494f c13494f, View view) {
                super(1);
                this.f34306w = c13494f;
                this.f34307x = view;
            }

            /* renamed from: a */
            public final InterfaceC5264x mo9587d(C5266y c5266y) {
                Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
                this.f34306w.m1264b(this.f34307x);
                return new C13499a(this.f34306w);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13497b(C13494f c13494f) {
            super(3);
            this.f34305w = c13494f;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m1258a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m1258a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(-711358161);
            View view = (View) interfaceC5179i.mo25256n(C0824y.m39469i());
            Effects.m25541a(view, new C13498a(this.f34305w, view), interfaceC5179i, 8);
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            interfaceC5179i.mo25282C();
            return c9571a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Rect m1263a(p373u0.Rect rect) {
        return m1261c(rect);
    }

    /* renamed from: b */
    public static final InterfaceC9570f m1262b(InterfaceC9570f interfaceC9570f, C13494f c13494f) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "<this>");
        Intrinsics.isThisObjectNull(c13494f, "bringRectangleOnScreenRequester");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C13496a(c13494f) : C0812v0.m39497a(), new C13497b(c13494f));
    }

    /* renamed from: c */
    private static final Rect m1261c(p373u0.Rect rect) {
        return new Rect((int) rect.m7125f(), (int) rect.m7122i(), (int) rect.m7124g(), (int) rect.m7128c());
    }
}
