package androidx.compose.p018ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.runtime.Recomposer;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p181jd.Intrinsics;
import p385ud.C10872d;
import p468yc.C13186n;
import p468yc.C13195u;
import td.C10540l1;
import td.InterfaceC10524i0;
import td.InterfaceC10574t1;

/* compiled from: WindowRecomposer.android.kt */
/* renamed from: androidx.compose.ui.platform.y1 */
/* loaded from: classes.dex */
public final class C0839y1 {

    /* renamed from: a */
    public static final C0839y1 f2471a = new C0839y1();

    /* renamed from: b */
    private static final AtomicReference f2472b = new AtomicReference(InterfaceC0821x1.f2439a.m39479a());

    /* compiled from: WindowRecomposer.android.kt */
    /* renamed from: androidx.compose.ui.platform.y1$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC0840a implements View.OnAttachStateChangeListener {

        /* renamed from: w */
        final /* synthetic */ InterfaceC10574t1 f2473w;

        View$OnAttachStateChangeListenerC0840a(InterfaceC10574t1 interfaceC10574t1) {
            this.f2473w = interfaceC10574t1;
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.isThisObjectNull(view, "v");
        }

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.isThisObjectNull(view, "v");
            view.removeOnAttachStateChangeListener(this);
            InterfaceC10574t1.C10575a.m7654a(this.f2473w, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowRecomposer.android.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", m20196f = "WindowRecomposer.android.kt", m20195l = {164}, m20194m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.y1$b */
    /* loaded from: classes.dex */
    public static final class C0841b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f2474x;

        /* renamed from: y */
        final /* synthetic */ Recomposer f2475y;

        /* renamed from: z */
        final /* synthetic */ View f2476z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0841b(Recomposer recomposer, View view, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f2475y = recomposer;
            this.f2476z = view;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C0841b(this.f2475y, this.f2476z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C0841b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            View view;
            m34636d = C2116d.m34636d();
            int i = this.f2474x;
            try {
                if (i == 0) {
                    C13186n.m1453b(obj);
                    Recomposer recomposer = this.f2475y;
                    this.f2474x = 1;
                    if (recomposer.m39968T(this) == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                if (WindowRecomposer_androidKt.m39860d(view) == this.f2475y) {
                    WindowRecomposer_androidKt.m39857g(this.f2476z, null);
                }
                return C13195u.f34156a;
            } finally {
                if (WindowRecomposer_androidKt.m39860d(this.f2476z) == this.f2475y) {
                    WindowRecomposer_androidKt.m39857g(this.f2476z, null);
                }
            }
        }
    }

    private C0839y1() {
    }

    /* renamed from: a */
    public final Recomposer m39454a(View view) {
        InterfaceC10574t1 m20158d;
        Intrinsics.isThisObjectNull(view, "rootView");
        Recomposer m39480a = ((InterfaceC0821x1) f2472b.get()).m39480a(view);
        WindowRecomposer_androidKt.m39857g(view, m39480a);
        C10540l1 c10540l1 = C10540l1.f27258w;
        Handler handler = view.getHandler();
        Intrinsics.checkIfNull(handler, "rootView.handler");
        m20158d = C6772d.m20158d(c10540l1, C10872d.m6810b(handler, "windowRecomposer cleanup").mo6813J0(), null, new C0841b(m39480a, view, null), 2, null);
        view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0840a(m20158d));
        return m39480a;
    }
}
