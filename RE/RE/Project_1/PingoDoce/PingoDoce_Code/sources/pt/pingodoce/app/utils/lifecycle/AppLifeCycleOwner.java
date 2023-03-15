package pt.pingodoce.app.utils.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import be.OperatorExtensions;
import gm.C5715a;
import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: AppLifeCycleOwner.kt */
/* loaded from: classes2.dex */
public final class AppLifeCycleOwner implements InterfaceC1485s {

    /* renamed from: w */
    private final InterfaceC6108l f25090w = OperatorExtensions.m35179b(120000, null, C9544b.f25091w, 2, null);

    /* compiled from: AppLifeCycleOwner.kt */
    /* renamed from: pt.pingodoce.app.utils.lifecycle.AppLifeCycleOwner$a */
    /* loaded from: classes2.dex */
    public static final class C9543a {
        private C9543a() {
        }

        public /* synthetic */ C9543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppLifeCycleOwner.kt */
    /* renamed from: pt.pingodoce.app.utils.lifecycle.AppLifeCycleOwner$b */
    /* loaded from: classes2.dex */
    public static final class C9544b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C9544b f25091w = new C9544b();

        C9544b() {
            super(1);
        }

        /* renamed from: a */
        public final void m10672a(boolean z) {
            C5715a.f15980a.m23280b(z);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m10672a(((Boolean) obj).booleanValue());
            return C13195u.f34156a;
        }
    }

    static {
        new C9543a(null);
    }

    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.isThisObjectNull(interfaceC1491v, "source");
        Intrinsics.isThisObjectNull(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_START) {
            this.f25090w.mo9587d(Boolean.FALSE);
        } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_STOP) {
            this.f25090w.mo9587d(Boolean.TRUE);
        }
    }
}
