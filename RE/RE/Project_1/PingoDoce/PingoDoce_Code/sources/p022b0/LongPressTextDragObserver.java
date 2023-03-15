package p022b0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p093f1.C5318u;
import p093f1.InterfaceC5276c0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p372u.DragGestureDetector;
import p373u0.C10774f;
import p468yc.C13195u;

/* renamed from: b0.c */
/* loaded from: classes.dex */
public final class LongPressTextDragObserver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* renamed from: b0.c$a */
    /* loaded from: classes.dex */
    public static final class C1769a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1787f f5429w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1769a(InterfaceC1787f interfaceC1787f) {
            super(1);
            this.f5429w = interfaceC1787f;
        }

        /* renamed from: a */
        public final void m35410a(long j) {
            this.f5429w.mo35368c(j);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m35410a(((C10774f) obj).m7137s());
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* renamed from: b0.c$b */
    /* loaded from: classes.dex */
    public static final class C1770b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1787f f5430w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1770b(InterfaceC1787f interfaceC1787f) {
            super(0);
            this.f5430w = interfaceC1787f;
        }

        /* renamed from: a */
        public final void m35409a() {
            this.f5430w.mo35369b();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m35409a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* renamed from: b0.c$c */
    /* loaded from: classes.dex */
    public static final class C1771c extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1787f f5431w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1771c(InterfaceC1787f interfaceC1787f) {
            super(0);
            this.f5431w = interfaceC1787f;
        }

        /* renamed from: a */
        public final void m35408a() {
            this.f5431w.mo35370a();
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m35408a();
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LongPressTextDragObserver.kt */
    /* renamed from: b0.c$d */
    /* loaded from: classes.dex */
    public static final class C1772d extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        final /* synthetic */ InterfaceC1787f f5432w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1772d(InterfaceC1787f interfaceC1787f) {
            super(2);
            this.f5432w = interfaceC1787f;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m35407a((C5318u) obj, ((C10774f) obj2).m7137s());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m35407a(C5318u c5318u, long j) {
            Intrinsics.isThisObjectNull(c5318u, "$noName_0");
            this.f5432w.mo35367d(j);
        }
    }

    /* renamed from: a */
    public static final Object m35411a(InterfaceC5276c0 interfaceC5276c0, InterfaceC1787f interfaceC1787f, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7279g = DragGestureDetector.m7279g(interfaceC5276c0, new C1769a(interfaceC1787f), new C1770b(interfaceC1787f), new C1771c(interfaceC1787f), new C1772d(interfaceC1787f), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7279g == m34636d ? m7279g : C13195u.f34156a;
    }
}
