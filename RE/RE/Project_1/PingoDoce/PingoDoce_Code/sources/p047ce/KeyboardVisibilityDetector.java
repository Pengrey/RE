package p047ce;

import android.view.ViewTreeObserver;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: ce.e */
/* loaded from: classes2.dex */
public final class KeyboardVisibilityDetector {

    /* renamed from: a */
    public static final KeyboardVisibilityDetector f6146a = new KeyboardVisibilityDetector();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: KeyboardVisibilityDetector.kt */
    /* renamed from: ce.e$a */
    /* loaded from: classes2.dex */
    public static final class ViewTreeObserver$OnPreDrawListenerC2123a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: w */
        private final ActivityViewHolder f6147w;

        /* renamed from: x */
        private final InterfaceC6108l f6148x;

        /* renamed from: y */
        private int f6149y;

        public ViewTreeObserver$OnPreDrawListenerC2123a(ActivityViewHolder activityViewHolder, InterfaceC6108l interfaceC6108l) {
            Intrinsics.isThisObjectNull(activityViewHolder, "viewHolder");
            Intrinsics.isThisObjectNull(interfaceC6108l, "listener");
            this.f6147w = activityViewHolder;
            this.f6148x = interfaceC6108l;
            this.f6149y = -1;
        }

        /* renamed from: a */
        private final boolean m34616a() {
            int height = this.f6147w.m34633c().getHeight();
            int i = this.f6149y;
            if (height == i) {
                return false;
            }
            if (i != -1) {
                this.f6148x.mo9587d(new C2122d(height < this.f6147w.m34634b().getHeight() - this.f6147w.m34633c().getTop(), height, this.f6149y));
            }
            this.f6149y = height;
            return true;
        }

        public boolean onPreDraw() {
            return !m34616a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeyboardVisibilityDetector.kt */
    /* renamed from: ce.e$b */
    /* loaded from: classes2.dex */
    public static final class C2124b extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ ActivityViewHolder f6150w;

        /* renamed from: x */
        final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC2123a f6151x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2124b(ActivityViewHolder activityViewHolder, ViewTreeObserver$OnPreDrawListenerC2123a viewTreeObserver$OnPreDrawListenerC2123a) {
            super(0);
            this.f6150w = activityViewHolder;
            this.f6151x = viewTreeObserver$OnPreDrawListenerC2123a;
        }

        /* renamed from: a */
        public final void m34615a() {
            this.f6150w.m34634b().getViewTreeObserver().removeOnPreDrawListener(this.f6151x);
        }

        /* renamed from: q */
        public /* bridge */ /* synthetic */ Object mo42214q() {
            m34615a();
            return C13195u.f34156a;
        }
    }

    private KeyboardVisibilityDetector() {
    }

    /* renamed from: a */
    public final void m34617a(ActivityViewHolder activityViewHolder, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(activityViewHolder, "viewHolder");
        Intrinsics.isThisObjectNull(interfaceC6108l, "listener");
        ViewTreeObserver$OnPreDrawListenerC2123a viewTreeObserver$OnPreDrawListenerC2123a = new ViewTreeObserver$OnPreDrawListenerC2123a(activityViewHolder, interfaceC6108l);
        activityViewHolder.m34634b().getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC2123a);
        activityViewHolder.m34632d(new C2124b(activityViewHolder, viewTreeObserver$OnPreDrawListenerC2123a));
    }
}
