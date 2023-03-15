package p477z;

import bd.InterfaceC1886d;
import id.InterfaceC6097a;
import p127h1.InterfaceC5776j;
import p149i1.C5992f;
import p149i1.ModifierLocal;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p373u0.C10778i;
import p373u0.Rect;
import p468yc.C13195u;

/* renamed from: z.e */
/* loaded from: classes.dex */
public interface BringIntoViewResponder {

    /* renamed from: v */
    public static final C13491a f34298v = C13491a.f34299a;

    /* compiled from: BringIntoViewResponder.kt */
    /* renamed from: z.e$a */
    /* loaded from: classes.dex */
    public static final class C13491a {

        /* renamed from: a */
        static final /* synthetic */ C13491a f34299a = new C13491a();

        /* renamed from: b */
        private static final C5992f f34300b = ModifierLocal.m22448a(C13492a.f34302w);

        /* renamed from: c */
        private static final BringIntoViewResponder f34301c = new C13493b();

        /* compiled from: BringIntoViewResponder.kt */
        /* renamed from: z.e$a$a */
        /* loaded from: classes.dex */
        static final class C13492a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            public static final C13492a f34302w = new C13492a();

            C13492a() {
                super(0);
            }

            /* renamed from: a */
            public final BringIntoViewResponder mo42214q() {
                return C13491a.f34299a.m1269b();
            }
        }

        /* compiled from: BringIntoViewResponder.kt */
        /* renamed from: z.e$a$b */
        /* loaded from: classes.dex */
        public static final class C13493b implements BringIntoViewResponder {
            C13493b() {
            }

            /* renamed from: a */
            public Object m1267a(Rect rect, InterfaceC1886d interfaceC1886d) {
                return C13195u.f34156a;
            }

            /* renamed from: b */
            public Rect m1266b(Rect rect, InterfaceC5776j interfaceC5776j) {
                Intrinsics.isThisObjectNull(rect, "rect");
                Intrinsics.isThisObjectNull(interfaceC5776j, "layoutCoordinates");
                return C10778i.m7114a(interfaceC5776j.mo23108V(rect.m7121j()), rect.m7123h());
            }
        }

        private C13491a() {
        }

        /* renamed from: a */
        public final C5992f m1270a() {
            return f34300b;
        }

        /* renamed from: b */
        public final BringIntoViewResponder m1269b() {
            return f34301c;
        }
    }

    /* renamed from: a */
    Object m1272a(Rect rect, InterfaceC1886d interfaceC1886d);

    /* renamed from: b */
    Rect m1271b(Rect rect, InterfaceC5776j interfaceC5776j);
}
