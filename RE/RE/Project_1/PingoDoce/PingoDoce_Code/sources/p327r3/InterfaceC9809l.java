package p327r3;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import bd.InterfaceC1886d;
import cd.C2116d;
import cd.IntrinsicsJvm;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.DebugProbes;
import p181jd.AbstractC6438m;
import p327r3.AbstractC9797c;
import p468yc.C13183m;
import p468yc.C13195u;
import td.C10534k;
import td.InterfaceC10529j;

/* renamed from: r3.l */
/* loaded from: classes.dex */
public interface InterfaceC9809l<T extends View> extends InterfaceC9807j {

    /* compiled from: ViewSizeResolver.kt */
    /* renamed from: r3.l$a */
    /* loaded from: classes.dex */
    public static final class C9810a {

        /* compiled from: ViewSizeResolver.kt */
        /* renamed from: r3.l$a$a */
        /* loaded from: classes.dex */
        static final class C9811a extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

            /* renamed from: w */
            final /* synthetic */ InterfaceC9809l<T> f25747w;

            /* renamed from: x */
            final /* synthetic */ ViewTreeObserver f25748x;

            /* renamed from: y */
            final /* synthetic */ ViewTreeObserver$OnPreDrawListenerC9812b f25749y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9811a(InterfaceC9809l<T> interfaceC9809l, ViewTreeObserver viewTreeObserver, ViewTreeObserver$OnPreDrawListenerC9812b viewTreeObserver$OnPreDrawListenerC9812b) {
                super(1);
                this.f25747w = interfaceC9809l;
                this.f25748x = viewTreeObserver;
                this.f25749y = viewTreeObserver$OnPreDrawListenerC9812b;
            }

            @Override // id.InterfaceC6108l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
                invoke2(th2);
                return C13195u.f34156a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                C9810a.m9931g(this.f25747w, this.f25748x, this.f25749y);
            }
        }

        /* compiled from: ViewSizeResolver.kt */
        /* renamed from: r3.l$a$b */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC9812b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: w */
            private boolean f25750w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC9809l<T> f25751x;

            /* renamed from: y */
            final /* synthetic */ ViewTreeObserver f25752y;

            /* renamed from: z */
            final /* synthetic */ InterfaceC10529j<C9805i> f25753z;

            /* JADX WARN: Multi-variable type inference failed */
            ViewTreeObserver$OnPreDrawListenerC9812b(InterfaceC9809l<T> interfaceC9809l, ViewTreeObserver viewTreeObserver, InterfaceC10529j<? super C9805i> interfaceC10529j) {
                this.f25751x = interfaceC9809l;
                this.f25752y = viewTreeObserver;
                this.f25753z = interfaceC10529j;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C9805i m9933e = C9810a.m9933e(this.f25751x);
                if (m9933e != null) {
                    C9810a.m9931g(this.f25751x, this.f25752y, this);
                    if (!this.f25750w) {
                        this.f25750w = true;
                        InterfaceC10529j<C9805i> interfaceC10529j = this.f25753z;
                        C13183m.C13184a c13184a = C13183m.f34143w;
                        interfaceC10529j.resumeWith(C13183m.m1458a(m9933e));
                    }
                }
                return true;
            }
        }

        /* renamed from: c */
        private static <T extends View> AbstractC9797c m9935c(InterfaceC9809l<T> interfaceC9809l, int i, int i2, int i3) {
            if (i == -2) {
                return AbstractC9797c.C9799b.f25739a;
            }
            int i4 = i - i3;
            if (i4 > 0) {
                return C9795a.m9947a(i4);
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return C9795a.m9947a(i5);
            }
            return null;
        }

        /* renamed from: d */
        private static <T extends View> AbstractC9797c m9934d(InterfaceC9809l<T> interfaceC9809l) {
            ViewGroup.LayoutParams layoutParams = interfaceC9809l.mo9939j().getLayoutParams();
            return m9935c(interfaceC9809l, layoutParams != null ? layoutParams.height : -1, interfaceC9809l.mo9939j().getHeight(), interfaceC9809l.mo9938k() ? interfaceC9809l.mo9939j().getPaddingTop() + interfaceC9809l.mo9939j().getPaddingBottom() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static <T extends View> C9805i m9933e(InterfaceC9809l<T> interfaceC9809l) {
            AbstractC9797c m9934d;
            AbstractC9797c m9932f = m9932f(interfaceC9809l);
            if (m9932f == null || (m9934d = m9934d(interfaceC9809l)) == null) {
                return null;
            }
            return new C9805i(m9932f, m9934d);
        }

        /* renamed from: f */
        private static <T extends View> AbstractC9797c m9932f(InterfaceC9809l<T> interfaceC9809l) {
            ViewGroup.LayoutParams layoutParams = interfaceC9809l.mo9939j().getLayoutParams();
            return m9935c(interfaceC9809l, layoutParams != null ? layoutParams.width : -1, interfaceC9809l.mo9939j().getWidth(), interfaceC9809l.mo9938k() ? interfaceC9809l.mo9939j().getPaddingLeft() + interfaceC9809l.mo9939j().getPaddingRight() : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static <T extends View> void m9931g(InterfaceC9809l<T> interfaceC9809l, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                interfaceC9809l.mo9939j().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        /* renamed from: h */
        public static <T extends View> Object m9930h(InterfaceC9809l<T> interfaceC9809l, InterfaceC1886d<? super C9805i> interfaceC1886d) {
            InterfaceC1886d m34637c;
            Object m34636d;
            C9805i m9933e = m9933e(interfaceC9809l);
            if (m9933e != null) {
                return m9933e;
            }
            m34637c = IntrinsicsJvm.m34637c(interfaceC1886d);
            C10534k c10534k = new C10534k(m34637c, 1);
            c10534k.m7723y();
            ViewTreeObserver viewTreeObserver = interfaceC9809l.mo9939j().getViewTreeObserver();
            ViewTreeObserver$OnPreDrawListenerC9812b viewTreeObserver$OnPreDrawListenerC9812b = new ViewTreeObserver$OnPreDrawListenerC9812b(interfaceC9809l, viewTreeObserver, c10534k);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC9812b);
            c10534k.mo7778n(new C9811a(interfaceC9809l, viewTreeObserver, viewTreeObserver$OnPreDrawListenerC9812b));
            Object m7728t = c10534k.m7728t();
            m34636d = C2116d.m34636d();
            if (m7728t == m34636d) {
                DebugProbes.m20186c(interfaceC1886d);
            }
            return m7728t;
        }
    }

    /* renamed from: j */
    T mo9939j();

    /* renamed from: k */
    boolean mo9938k();
}
