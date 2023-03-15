package androidx.compose.p018ui.platform;

import android.view.View;
import id.InterfaceC6097a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: ViewCompositionStrategy.android.kt */
/* renamed from: androidx.compose.ui.platform.o1 */
/* loaded from: classes.dex */
public interface InterfaceC0760o1 {

    /* compiled from: ViewCompositionStrategy.android.kt */
    /* renamed from: androidx.compose.ui.platform.o1$a */
    /* loaded from: classes.dex */
    public static final class C0761a implements InterfaceC0760o1 {

        /* renamed from: a */
        public static final C0761a f2326a = new C0761a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: androidx.compose.ui.platform.o1$a$a */
        /* loaded from: classes.dex */
        public static final class C0762a extends AbstractC6438m implements InterfaceC6097a {

            /* renamed from: w */
            final /* synthetic */ AbstractC0682a f2327w;

            /* renamed from: x */
            final /* synthetic */ View$OnAttachStateChangeListenerC0763b f2328x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0762a(AbstractC0682a abstractC0682a, View$OnAttachStateChangeListenerC0763b view$OnAttachStateChangeListenerC0763b) {
                super(0);
                this.f2327w = abstractC0682a;
                this.f2328x = view$OnAttachStateChangeListenerC0763b;
            }

            /* renamed from: a */
            public final void m39645a() {
                this.f2327w.removeOnAttachStateChangeListener(this.f2328x);
            }

            /* renamed from: q */
            public /* bridge */ /* synthetic */ Object mo42214q() {
                m39645a();
                return C13195u.f34156a;
            }
        }

        /* compiled from: ViewCompositionStrategy.android.kt */
        /* renamed from: androidx.compose.ui.platform.o1$a$b */
        /* loaded from: classes.dex */
        public static final class View$OnAttachStateChangeListenerC0763b implements View.OnAttachStateChangeListener {

            /* renamed from: w */
            final /* synthetic */ AbstractC0682a f2329w;

            View$OnAttachStateChangeListenerC0763b(AbstractC0682a abstractC0682a) {
                this.f2329w = abstractC0682a;
            }

            public void onViewAttachedToWindow(View view) {
                Intrinsics.isThisObjectNull(view, "v");
            }

            public void onViewDetachedFromWindow(View view) {
                this.f2329w.m39840e();
            }
        }

        private C0761a() {
        }

        /* renamed from: a */
        public InterfaceC6097a m39646a(AbstractC0682a abstractC0682a) {
            Intrinsics.isThisObjectNull(abstractC0682a, "view");
            View$OnAttachStateChangeListenerC0763b view$OnAttachStateChangeListenerC0763b = new View$OnAttachStateChangeListenerC0763b(abstractC0682a);
            abstractC0682a.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC0763b);
            return new C0762a(abstractC0682a, view$OnAttachStateChangeListenerC0763b);
        }
    }

    /* renamed from: a */
    InterfaceC6097a m39647a(AbstractC0682a abstractC0682a);
}
