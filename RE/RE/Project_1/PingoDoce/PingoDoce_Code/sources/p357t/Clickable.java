package p357t;

import android.view.KeyEvent;
import androidx.compose.p018ui.platform.C0812v0;
import androidx.compose.p018ui.platform.C0816w0;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p052d1.C4704f;
import p092f0.C5209j1;
import p092f0.C5232o1;
import p092f0.C5266y;
import p092f0.Effects;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p092f0.InterfaceC5264x;
import p093f1.C5293i0;
import p093f1.InterfaceC5276c0;
import p149i1.InterfaceC5991e;
import p149i1.ModifierLocalConsumer;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p245n1.C7591h;
import p245n1.C7600o;
import p245n1.C7617t;
import p245n1.InterfaceC7621v;
import p302q0.C9567e;
import p302q0.InterfaceC9570f;
import p372u.C10660e0;
import p372u.C10695i0;
import p372u.InterfaceC10767y;
import p373u0.C10774f;
import p392v.C10986l;
import p392v.C10988p;
import p392v.InterfaceC10987m;
import p392v.PressInteraction;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10531j0;
import td.C10565r0;
import td.InterfaceC10524i0;

/* renamed from: t.e */
/* loaded from: classes.dex */
public final class Clickable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$a */
    /* loaded from: classes.dex */
    public static final class C10259a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC5220m0 f26721w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC10987m f26722x;

        /* compiled from: Effects.kt */
        /* renamed from: t.e$a$a */
        /* loaded from: classes.dex */
        public static final class C10260a implements InterfaceC5264x {

            /* renamed from: a */
            final /* synthetic */ InterfaceC5220m0 f26723a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC10987m f26724b;

            public C10260a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
                this.f26723a = interfaceC5220m0;
                this.f26724b = interfaceC10987m;
            }

            /* renamed from: b */
            public void mo24852b() {
                C10988p c10988p = (C10988p) this.f26723a.getValue();
                if (c10988p == null) {
                    return;
                }
                this.f26724b.mo6671b(new PressInteraction(c10988p));
                this.f26723a.setValue(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10259a(InterfaceC5220m0 interfaceC5220m0, InterfaceC10987m interfaceC10987m) {
            super(1);
            this.f26721w = interfaceC5220m0;
            this.f26722x = interfaceC10987m;
        }

        /* renamed from: a */
        public final InterfaceC5264x mo9587d(C5266y c5266y) {
            Intrinsics.isThisObjectNull(c5266y, "$this$DisposableEffect");
            return new C10260a(this.f26721w, this.f26722x);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$b */
    /* loaded from: classes.dex */
    public static final class C10261b extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10987m f26725w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC5220m0 f26726x;

        /* renamed from: y */
        final /* synthetic */ int f26727y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10261b(InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, int i) {
            super(2);
            this.f26725w = interfaceC10987m;
            this.f26726x = interfaceC5220m0;
            this.f26727y = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m8367a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m8367a(InterfaceC5179i interfaceC5179i, int i) {
            Clickable.m8378a(this.f26725w, this.f26726x, interfaceC5179i, this.f26727y | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$c */
    /* loaded from: classes.dex */
    public static final class C10262c extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: w */
        final /* synthetic */ boolean f26728w;

        /* renamed from: x */
        final /* synthetic */ String f26729x;

        /* renamed from: y */
        final /* synthetic */ C7591h f26730y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6097a f26731z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10262c(boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a) {
            super(3);
            this.f26728w = z;
            this.f26729x = str;
            this.f26730y = c7591h;
            this.f26731z = interfaceC6097a;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8366a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8366a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(1841979210);
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            InterfaceC10307k interfaceC10307k = (InterfaceC10307k) interfaceC5179i.mo25256n(C10309m.m8302a());
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = C10986l.m6673a();
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f m8377b = Clickable.m8377b(c9571a, (InterfaceC10987m) mo25262h, interfaceC10307k, this.f26728w, this.f26729x, this.f26730y, this.f26731z);
            interfaceC5179i.mo25282C();
            return m8377b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$d */
    /* loaded from: classes.dex */
    public static final class C10263d extends AbstractC6438m implements InterfaceC6113q {

        /* renamed from: A */
        final /* synthetic */ String f26732A;

        /* renamed from: B */
        final /* synthetic */ C7591h f26733B;

        /* renamed from: w */
        final /* synthetic */ InterfaceC6097a f26734w;

        /* renamed from: x */
        final /* synthetic */ boolean f26735x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC10987m f26736y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC10307k f26737z;

        /* compiled from: Clickable.kt */
        /* renamed from: t.e$d$a */
        /* loaded from: classes.dex */
        public static final class C10264a implements ModifierLocalConsumer {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26738w;

            C10264a(InterfaceC5220m0 interfaceC5220m0) {
                this.f26738w = interfaceC5220m0;
            }

            /* renamed from: C */
            public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
                return ModifierLocalConsumer.C5989a.m22452a(this, interfaceC6108l);
            }

            /* renamed from: K */
            public void m8364K(InterfaceC5991e interfaceC5991e) {
                Intrinsics.isThisObjectNull(interfaceC5991e, "scope");
                this.f26738w.setValue(interfaceC5991e.mo22443t(C10660e0.m7374d()));
            }

            /* renamed from: V */
            public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
                return ModifierLocalConsumer.C5989a.m22450c(this, obj, interfaceC6112p);
            }

            /* renamed from: o */
            public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
                return ModifierLocalConsumer.C5989a.m22451b(this, obj, interfaceC6112p);
            }

            /* renamed from: u */
            public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
                return ModifierLocalConsumer.C5989a.m22449d(this, interfaceC9570f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Clickable.kt */
        /* renamed from: t.e$d$b */
        /* loaded from: classes.dex */
        public static final class C10265b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC5220m0 f26739w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC6097a f26740x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10265b(InterfaceC5220m0 interfaceC5220m0, InterfaceC6097a interfaceC6097a) {
                super(0);
                this.f26739w = interfaceC5220m0;
                this.f26740x = interfaceC6097a;
            }

            /* renamed from: a */
            public final Boolean mo42214q() {
                return Boolean.valueOf(((Boolean) this.f26739w.getValue()).booleanValue() || ((Boolean) this.f26740x.mo42214q()).booleanValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Clickable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1", m20196f = "Clickable.kt", m20195l = {142}, m20194m = "invokeSuspend")
        /* renamed from: t.e$d$c */
        /* loaded from: classes.dex */
        public static final class C10266c extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ InterfaceC10987m f26741A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC5220m0 f26742B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC5242r1 f26743C;

            /* renamed from: D */
            final /* synthetic */ InterfaceC5242r1 f26744D;

            /* renamed from: x */
            int f26745x;

            /* renamed from: y */
            private /* synthetic */ Object f26746y;

            /* renamed from: z */
            final /* synthetic */ boolean f26747z;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Clickable.kt */
            @InterfaceC6759f(m20197c = "androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1", m20196f = "Clickable.kt", m20195l = {145}, m20194m = "invokeSuspend")
            /* renamed from: t.e$d$c$a */
            /* loaded from: classes.dex */
            public static final class C10267a extends AbstractC6764l implements InterfaceC6113q {

                /* renamed from: A */
                final /* synthetic */ boolean f26748A;

                /* renamed from: B */
                final /* synthetic */ InterfaceC10987m f26749B;

                /* renamed from: C */
                final /* synthetic */ InterfaceC5220m0 f26750C;

                /* renamed from: D */
                final /* synthetic */ InterfaceC5242r1 f26751D;

                /* renamed from: x */
                int f26752x;

                /* renamed from: y */
                private /* synthetic */ Object f26753y;

                /* renamed from: z */
                /* synthetic */ long f26754z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10267a(boolean z, InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC5242r1 interfaceC5242r1, InterfaceC1886d interfaceC1886d) {
                    super(3, interfaceC1886d);
                    this.f26748A = z;
                    this.f26749B = interfaceC10987m;
                    this.f26750C = interfaceC5220m0;
                    this.f26751D = interfaceC5242r1;
                }

                /* renamed from: C */
                public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
                    return m8361d((InterfaceC10767y) obj, ((C10774f) obj2).m7137s(), (InterfaceC1886d) obj3);
                }

                /* renamed from: d */
                public final Object m8361d(InterfaceC10767y interfaceC10767y, long j, InterfaceC1886d interfaceC1886d) {
                    C10267a c10267a = new C10267a(this.f26748A, this.f26749B, this.f26750C, this.f26751D, interfaceC1886d);
                    c10267a.f26753y = interfaceC10767y;
                    c10267a.f26754z = j;
                    return c10267a.invokeSuspend(C13195u.f34156a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object m34636d;
                    m34636d = C2116d.m34636d();
                    int i = this.f26752x;
                    if (i == 0) {
                        C13186n.m1453b(obj);
                        InterfaceC10767y interfaceC10767y = (InterfaceC10767y) this.f26753y;
                        long j = this.f26754z;
                        if (this.f26748A) {
                            InterfaceC10987m interfaceC10987m = this.f26749B;
                            InterfaceC5220m0 interfaceC5220m0 = this.f26750C;
                            InterfaceC5242r1 interfaceC5242r1 = this.f26751D;
                            this.f26752x = 1;
                            if (Clickable.m8370i(interfaceC10767y, j, interfaceC10987m, interfaceC5220m0, interfaceC5242r1, this) == m34636d) {
                                return m34636d;
                            }
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        C13186n.m1453b(obj);
                    }
                    return C13195u.f34156a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Clickable.kt */
            /* renamed from: t.e$d$c$b */
            /* loaded from: classes.dex */
            public static final class C10268b extends AbstractC6438m implements InterfaceC6108l {

                /* renamed from: w */
                final /* synthetic */ boolean f26755w;

                /* renamed from: x */
                final /* synthetic */ InterfaceC5242r1 f26756x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10268b(boolean z, InterfaceC5242r1 interfaceC5242r1) {
                    super(1);
                    this.f26755w = z;
                    this.f26756x = interfaceC5242r1;
                }

                /* renamed from: a */
                public final void m8360a(long j) {
                    if (this.f26755w) {
                        ((InterfaceC6097a) this.f26756x.getValue()).mo42214q();
                    }
                }

                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
                    m8360a(((C10774f) obj).m7137s());
                    return C13195u.f34156a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10266c(boolean z, InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f26747z = z;
                this.f26741A = interfaceC10987m;
                this.f26742B = interfaceC5220m0;
                this.f26743C = interfaceC5242r1;
                this.f26744D = interfaceC5242r12;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                C10266c c10266c = new C10266c(this.f26747z, this.f26741A, this.f26742B, this.f26743C, this.f26744D, interfaceC1886d);
                c10266c.f26746y = obj;
                return c10266c;
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC5276c0 interfaceC5276c0, InterfaceC1886d interfaceC1886d) {
                return ((C10266c) create(interfaceC5276c0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f26745x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    C10267a c10267a = new C10267a(this.f26747z, this.f26741A, this.f26742B, this.f26743C, null);
                    C10268b c10268b = new C10268b(this.f26747z, this.f26744D);
                    this.f26745x = 1;
                    if (C10695i0.m7302i((InterfaceC5276c0) this.f26746y, c10267a, c10268b, this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10263d(InterfaceC6097a interfaceC6097a, boolean z, InterfaceC10987m interfaceC10987m, InterfaceC10307k interfaceC10307k, String str, C7591h c7591h) {
            super(3);
            this.f26734w = interfaceC6097a;
            this.f26735x = z;
            this.f26736y = interfaceC10987m;
            this.f26737z = interfaceC10307k;
            this.f26732A = str;
            this.f26733B = c7591h;
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ Object mo4533i(Object obj, Object obj2, Object obj3) {
            return m8365a((InterfaceC9570f) obj, (InterfaceC5179i) obj2, ((Number) obj3).intValue());
        }

        /* renamed from: a */
        public final InterfaceC9570f m8365a(InterfaceC9570f interfaceC9570f, InterfaceC5179i interfaceC5179i, int i) {
            Intrinsics.isThisObjectNull(interfaceC9570f, "$this$composed");
            interfaceC5179i.mo25263g(1841981045);
            InterfaceC5242r1 m25067k = C5209j1.m25067k(this.f26734w, interfaceC5179i, 0);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h = interfaceC5179i.mo25262h();
            InterfaceC5179i.C5180a c5180a = InterfaceC5179i.f14328a;
            if (mo25262h == c5180a.m25243a()) {
                mo25262h = C5232o1.m24962d(null, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
            interfaceC5179i.mo25263g(1841981204);
            if (this.f26735x) {
                Clickable.m8378a(this.f26736y, interfaceC5220m0, interfaceC5179i, 48);
            }
            interfaceC5179i.mo25282C();
            InterfaceC6097a m8348d = C10277f.m8348d(interfaceC5179i, 0);
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h2 = interfaceC5179i.mo25262h();
            if (mo25262h2 == c5180a.m25243a()) {
                mo25262h2 = C5232o1.m24962d(Boolean.TRUE, null, 2, null);
                interfaceC5179i.mo25247w(mo25262h2);
            }
            interfaceC5179i.mo25282C();
            InterfaceC5220m0 interfaceC5220m02 = (InterfaceC5220m0) mo25262h2;
            InterfaceC5242r1 m25067k2 = C5209j1.m25067k(new C10265b(interfaceC5220m02, m8348d), interfaceC5179i, 0);
            InterfaceC9570f.C9571a c9571a = InterfaceC9570f.f25164r;
            InterfaceC9570f m24738c = C5293i0.m24738c(c9571a, this.f26736y, Boolean.valueOf(this.f26735x), new C10266c(this.f26735x, this.f26736y, interfaceC5220m0, m25067k2, m25067k, null));
            interfaceC5179i.mo25263g(-3687241);
            Object mo25262h3 = interfaceC5179i.mo25262h();
            if (mo25262h3 == c5180a.m25243a()) {
                mo25262h3 = new C10264a(interfaceC5220m02);
                interfaceC5179i.mo25247w(mo25262h3);
            }
            interfaceC5179i.mo25282C();
            InterfaceC9570f m8373f = Clickable.m8373f(c9571a.mo7205u((InterfaceC9570f) mo25262h3), m24738c, this.f26736y, this.f26737z, this.f26735x, this.f26732A, this.f26733B, null, null, this.f26734w);
            interfaceC5179i.mo25282C();
            return m8373f;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.e$e */
    /* loaded from: classes.dex */
    public static final class C10269e extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ InterfaceC10307k f26757A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC10987m f26758B;

        /* renamed from: w */
        final /* synthetic */ boolean f26759w;

        /* renamed from: x */
        final /* synthetic */ String f26760x;

        /* renamed from: y */
        final /* synthetic */ C7591h f26761y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6097a f26762z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10269e(boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a, InterfaceC10307k interfaceC10307k, InterfaceC10987m interfaceC10987m) {
            super(1);
            this.f26759w = z;
            this.f26760x = str;
            this.f26761y = c7591h;
            this.f26762z = interfaceC6097a;
            this.f26757A = interfaceC10307k;
            this.f26758B = interfaceC10987m;
        }

        /* renamed from: a */
        public final void m8359a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("clickable");
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f26759w));
            c0816w0.m39492a().m39649b("onClickLabel", this.f26760x);
            c0816w0.m39492a().m39649b("role", this.f26761y);
            c0816w0.m39492a().m39649b("onClick", this.f26762z);
            c0816w0.m39492a().m39649b("indication", this.f26757A);
            c0816w0.m39492a().m39649b("interactionSource", this.f26758B);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8359a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* renamed from: t.e$f */
    /* loaded from: classes.dex */
    public static final class C10270f extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ boolean f26763w;

        /* renamed from: x */
        final /* synthetic */ String f26764x;

        /* renamed from: y */
        final /* synthetic */ C7591h f26765y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6097a f26766z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10270f(boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a) {
            super(1);
            this.f26763w = z;
            this.f26764x = str;
            this.f26765y = c7591h;
            this.f26766z = interfaceC6097a;
        }

        /* renamed from: a */
        public final void m8358a(C0816w0 c0816w0) {
            Intrinsics.isThisObjectNull(c0816w0, "$this$null");
            c0816w0.m39491b("clickable");
            c0816w0.m39492a().m39649b("enabled", Boolean.valueOf(this.f26763w));
            c0816w0.m39492a().m39649b("onClickLabel", this.f26764x);
            c0816w0.m39492a().m39649b("role", this.f26765y);
            c0816w0.m39492a().m39649b("onClick", this.f26766z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8358a((C0816w0) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$g */
    /* loaded from: classes.dex */
    public static final class C10271g extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ boolean f26767A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC6097a f26768B;

        /* renamed from: w */
        final /* synthetic */ C7591h f26769w;

        /* renamed from: x */
        final /* synthetic */ String f26770x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC6097a f26771y;

        /* renamed from: z */
        final /* synthetic */ String f26772z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Clickable.kt */
        /* renamed from: t.e$g$a */
        /* loaded from: classes.dex */
        public static final class C10272a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6097a f26773w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10272a(InterfaceC6097a interfaceC6097a) {
                super(0);
                this.f26773w = interfaceC6097a;
            }

            /* renamed from: a */
            public final Boolean mo42214q() {
                this.f26773w.mo42214q();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Clickable.kt */
        /* renamed from: t.e$g$b */
        /* loaded from: classes.dex */
        public static final class C10273b extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6097a f26774w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10273b(InterfaceC6097a interfaceC6097a) {
                super(0);
                this.f26774w = interfaceC6097a;
            }

            /* renamed from: a */
            public final Boolean mo42214q() {
                this.f26774w.mo42214q();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10271g(C7591h c7591h, String str, InterfaceC6097a interfaceC6097a, String str2, boolean z, InterfaceC6097a interfaceC6097a2) {
            super(1);
            this.f26769w = c7591h;
            this.f26770x = str;
            this.f26771y = interfaceC6097a;
            this.f26772z = str2;
            this.f26767A = z;
            this.f26768B = interfaceC6097a2;
        }

        /* renamed from: a */
        public final void m8357a(InterfaceC7621v interfaceC7621v) {
            Intrinsics.isThisObjectNull(interfaceC7621v, "$this$semantics");
            C7591h c7591h = this.f26769w;
            if (c7591h != null) {
                C7617t.m17917u(interfaceC7621v, c7591h.m18061m());
            }
            C7617t.m17930h(interfaceC7621v, this.f26770x, new C10272a(this.f26768B));
            InterfaceC6097a interfaceC6097a = this.f26771y;
            if (interfaceC6097a != null) {
                C7617t.m17928j(interfaceC7621v, this.f26772z, new C10273b(interfaceC6097a));
            }
            if (this.f26767A) {
                return;
            }
            C7617t.m17936b(interfaceC7621v);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m8357a((InterfaceC7621v) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    /* renamed from: t.e$h */
    /* loaded from: classes.dex */
    public static final class C10274h extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ boolean f26775w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC6097a f26776x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10274h(boolean z, InterfaceC6097a interfaceC6097a) {
            super(1);
            this.f26775w = z;
            this.f26776x = interfaceC6097a;
        }

        /* renamed from: a */
        public final Boolean m8354a(KeyEvent keyEvent) {
            boolean z;
            Intrinsics.isThisObjectNull(keyEvent, "it");
            if (this.f26775w && C10277f.m8349c(keyEvent)) {
                this.f26776x.mo42214q();
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            return m8354a(((p052d1.KeyEvent) obj).m26912f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", m20196f = "Clickable.kt", m20195l = {412, 414, 421, 422, 431}, m20194m = "invokeSuspend")
    /* renamed from: t.e$i */
    /* loaded from: classes.dex */
    public static final class C10275i extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC10767y f26777A;

        /* renamed from: B */
        final /* synthetic */ long f26778B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC10987m f26779C;

        /* renamed from: D */
        final /* synthetic */ InterfaceC5220m0 f26780D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC5242r1 f26781E;

        /* renamed from: x */
        boolean f26782x;

        /* renamed from: y */
        int f26783y;

        /* renamed from: z */
        private /* synthetic */ Object f26784z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Clickable.kt */
        @InterfaceC6759f(m20197c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", m20196f = "Clickable.kt", m20195l = {406, 409}, m20194m = "invokeSuspend")
        /* renamed from: t.e$i$a */
        /* loaded from: classes.dex */
        public static final class C10276a extends AbstractC6764l implements InterfaceC6112p {

            /* renamed from: A */
            final /* synthetic */ long f26785A;

            /* renamed from: B */
            final /* synthetic */ InterfaceC10987m f26786B;

            /* renamed from: C */
            final /* synthetic */ InterfaceC5220m0 f26787C;

            /* renamed from: x */
            Object f26788x;

            /* renamed from: y */
            int f26789y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC5242r1 f26790z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C10276a(InterfaceC5242r1 interfaceC5242r1, long j, InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
                super(2, interfaceC1886d);
                this.f26790z = interfaceC5242r1;
                this.f26785A = j;
                this.f26786B = interfaceC10987m;
                this.f26787C = interfaceC5220m0;
            }

            public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
                return new C10276a(this.f26790z, this.f26785A, this.f26786B, this.f26787C, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
                return ((C10276a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                C10988p c10988p;
                m34636d = C2116d.m34636d();
                int i = this.f26789y;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    if (((Boolean) ((InterfaceC6097a) this.f26790z.getValue()).mo42214q()).booleanValue()) {
                        long m8350b = C10277f.m8350b();
                        this.f26789y = 1;
                        if (C10565r0.m7677a(m8350b, this) == m34636d) {
                            return m34636d;
                        }
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10988p = (C10988p) this.f26788x;
                    C13186n.m1453b(obj);
                    this.f26787C.setValue(c10988p);
                    return C13195u.f34156a;
                } else {
                    C13186n.m1453b(obj);
                }
                C10988p c10988p2 = new C10988p(this.f26785A, null);
                InterfaceC10987m interfaceC10987m = this.f26786B;
                this.f26788x = c10988p2;
                this.f26789y = 2;
                if (interfaceC10987m.mo6672a(c10988p2, this) == m34636d) {
                    return m34636d;
                }
                c10988p = c10988p2;
                this.f26787C.setValue(c10988p);
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10275i(InterfaceC10767y interfaceC10767y, long j, InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC5242r1 interfaceC5242r1, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f26777A = interfaceC10767y;
            this.f26778B = j;
            this.f26779C = interfaceC10987m;
            this.f26780D = interfaceC5220m0;
            this.f26781E = interfaceC5242r1;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C10275i c10275i = new C10275i(this.f26777A, this.f26778B, this.f26779C, this.f26780D, this.f26781E, interfaceC1886d);
            c10275i.f26784z = obj;
            return c10275i;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10275i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p357t.Clickable.C10275i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m8378a(InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC5179i interfaceC5179i, int i) {
        int i2;
        Intrinsics.isThisObjectNull(interfaceC10987m, "interactionSource");
        Intrinsics.isThisObjectNull(interfaceC5220m0, "pressedInteraction");
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(1115975634);
        if ((i & 14) == 0) {
            i2 = (mo25249u.mo25276I(interfaceC10987m) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= mo25249u.mo25276I(interfaceC5220m0) ? 32 : 16;
        }
        if (((i2 & 91) ^ 18) == 0 && mo25249u.mo25245y()) {
            mo25249u.mo25264f();
        } else {
            mo25249u.mo25263g(-3686552);
            boolean mo25276I = mo25249u.mo25276I(interfaceC5220m0) | mo25249u.mo25276I(interfaceC10987m);
            Object mo25262h = mo25249u.mo25262h();
            if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
                mo25262h = new C10259a(interfaceC5220m0, interfaceC10987m);
                mo25249u.mo25247w(mo25262h);
            }
            mo25249u.mo25282C();
            Effects.m25541a(interfaceC10987m, (InterfaceC6108l) mo25262h, mo25249u, i2 & 14);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C10261b(interfaceC10987m, interfaceC5220m0, i));
    }

    /* renamed from: b */
    public static final InterfaceC9570f m8377b(InterfaceC9570f interfaceC9570f, InterfaceC10987m interfaceC10987m, InterfaceC10307k interfaceC10307k, boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$clickable");
        Intrinsics.isThisObjectNull(interfaceC10987m, "interactionSource");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onClick");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10269e(z, str, c7591h, interfaceC6097a, interfaceC10307k, interfaceC10987m) : C0812v0.m39497a(), new C10263d(interfaceC6097a, z, interfaceC10987m, interfaceC10307k, str, c7591h));
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC9570f m8376c(InterfaceC9570f interfaceC9570f, InterfaceC10987m interfaceC10987m, InterfaceC10307k interfaceC10307k, boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m8377b(interfaceC9570f, interfaceC10987m, interfaceC10307k, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : c7591h, interfaceC6097a);
    }

    /* renamed from: d */
    public static final InterfaceC9570f m8375d(InterfaceC9570f interfaceC9570f, boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$clickable");
        Intrinsics.isThisObjectNull(interfaceC6097a, "onClick");
        return C9567e.m10581a(interfaceC9570f, C0812v0.m39495c() ? new C10270f(z, str, c7591h, interfaceC6097a) : C0812v0.m39497a(), new C10262c(z, str, c7591h, interfaceC6097a));
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC9570f m8374e(InterfaceC9570f interfaceC9570f, boolean z, String str, C7591h c7591h, InterfaceC6097a interfaceC6097a, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            c7591h = null;
        }
        return m8375d(interfaceC9570f, z, str, c7591h, interfaceC6097a);
    }

    /* renamed from: f */
    public static final InterfaceC9570f m8373f(InterfaceC9570f interfaceC9570f, InterfaceC9570f interfaceC9570f2, InterfaceC10987m interfaceC10987m, InterfaceC10307k interfaceC10307k, boolean z, String str, C7591h c7591h, String str2, InterfaceC6097a interfaceC6097a, InterfaceC6097a interfaceC6097a2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "$this$genericClickableWithoutGesture");
        Intrinsics.isThisObjectNull(interfaceC9570f2, "gestureModifiers");
        Intrinsics.isThisObjectNull(interfaceC10987m, "interactionSource");
        Intrinsics.isThisObjectNull(interfaceC6097a2, "onClick");
        return Focusable.m8344b(Hoverable.m8325a(C10309m.m8301b(m8371h(m8372g(interfaceC9570f, c7591h, str, interfaceC6097a, str2, z, interfaceC6097a2), z, interfaceC6097a2), interfaceC10987m, interfaceC10307k), interfaceC10987m, z), z, interfaceC10987m).mo7205u(interfaceC9570f2);
    }

    /* renamed from: g */
    private static final InterfaceC9570f m8372g(InterfaceC9570f interfaceC9570f, C7591h c7591h, String str, InterfaceC6097a interfaceC6097a, String str2, boolean z, InterfaceC6097a interfaceC6097a2) {
        return C7600o.m18016a(interfaceC9570f, true, new C10271g(c7591h, str, interfaceC6097a, str2, z, interfaceC6097a2));
    }

    /* renamed from: h */
    private static final InterfaceC9570f m8371h(InterfaceC9570f interfaceC9570f, boolean z, InterfaceC6097a interfaceC6097a) {
        return C4704f.m26895a(interfaceC9570f, new C10274h(z, interfaceC6097a));
    }

    /* renamed from: i */
    public static final Object m8370i(InterfaceC10767y interfaceC10767y, long j, InterfaceC10987m interfaceC10987m, InterfaceC5220m0 interfaceC5220m0, InterfaceC5242r1 interfaceC5242r1, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C10275i(interfaceC10767y, j, interfaceC10987m, interfaceC5220m0, interfaceC5242r1, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }
}
