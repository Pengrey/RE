package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f638a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0293e> f639b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC1485s, InterfaceC0289a {

        /* renamed from: w */
        private final AbstractC1469p f640w;

        /* renamed from: x */
        private final AbstractC0293e f641x;

        /* renamed from: y */
        private InterfaceC0289a f642y;

        LifecycleOnBackPressedCancellable(AbstractC1469p abstractC1469p, AbstractC0293e abstractC0293e) {
            this.f640w = abstractC1469p;
            this.f641x = abstractC0293e;
            abstractC1469p.mo10402a(this);
        }

        @Override // androidx.activity.InterfaceC0289a
        public void cancel() {
            this.f640w.mo10400c(this);
            this.f641x.m41354e(this);
            InterfaceC0289a interfaceC0289a = this.f642y;
            if (interfaceC0289a != null) {
                interfaceC0289a.cancel();
                this.f642y = null;
            }
        }

        @Override // androidx.lifecycle.InterfaceC1485s
        /* renamed from: n */
        public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
            if (enumC1471b == AbstractC1469p.EnumC1471b.ON_START) {
                this.f642y = OnBackPressedDispatcher.this.m41359b(this.f641x);
            } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_STOP) {
                InterfaceC0289a interfaceC0289a = this.f642y;
                if (interfaceC0289a != null) {
                    interfaceC0289a.cancel();
                }
            } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public class C0288a implements InterfaceC0289a {

        /* renamed from: w */
        private final AbstractC0293e f644w;

        C0288a(AbstractC0293e abstractC0293e) {
            this.f644w = abstractC0293e;
        }

        @Override // androidx.activity.InterfaceC0289a
        public void cancel() {
            OnBackPressedDispatcher.this.f639b.remove(this.f644w);
            this.f644w.m41354e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f638a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void m41360a(InterfaceC1491v interfaceC1491v, AbstractC0293e abstractC0293e) {
        AbstractC1469p mo137b = interfaceC1491v.mo137b();
        if (mo137b.mo10401b() == AbstractC1469p.EnumC1472c.DESTROYED) {
            return;
        }
        abstractC0293e.m41357a(new LifecycleOnBackPressedCancellable(mo137b, abstractC0293e));
    }

    /* renamed from: b */
    InterfaceC0289a m41359b(AbstractC0293e abstractC0293e) {
        this.f639b.add(abstractC0293e);
        C0288a c0288a = new C0288a(abstractC0293e);
        abstractC0293e.m41357a(c0288a);
        return c0288a;
    }

    /* renamed from: c */
    public void m41358c() {
        Iterator<AbstractC0293e> descendingIterator = this.f639b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0293e next = descendingIterator.next();
            if (next.m41356c()) {
                next.mo37404b();
                return;
            }
        }
        Runnable runnable = this.f638a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
