package kotlinx.coroutines.internal;

import bd.CoroutineContext;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p468yc.C13195u;
import p468yc.Exceptions;
import td.C10515g0;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* renamed from: kotlinx.coroutines.internal.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6907z {

    /* compiled from: OnUndeliveredElement.kt */
    /* renamed from: kotlinx.coroutines.internal.z$a */
    /* loaded from: classes2.dex */
    static final class C6908a extends AbstractC6438m implements InterfaceC6108l<Throwable, C13195u> {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6108l<E, C13195u> f18375w;

        /* renamed from: x */
        final /* synthetic */ E f18376x;

        /* renamed from: y */
        final /* synthetic */ CoroutineContext f18377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6908a(InterfaceC6108l<? super E, C13195u> interfaceC6108l, E e, CoroutineContext coroutineContext) {
            super(1);
            this.f18375w = interfaceC6108l;
            this.f18376x = e;
            this.f18377y = coroutineContext;
        }

        @Override // id.InterfaceC6108l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ C13195u mo9587d(Throwable th2) {
            invoke2(th2);
            return C13195u.f34156a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C6907z.m19835b(this.f18375w, this.f18376x, this.f18377y);
        }
    }

    /* renamed from: a */
    public static final <E> InterfaceC6108l<Throwable, C13195u> m19836a(InterfaceC6108l<? super E, C13195u> interfaceC6108l, E e, CoroutineContext coroutineContext) {
        return new C6908a(interfaceC6108l, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m19835b(InterfaceC6108l<? super E, C13195u> interfaceC6108l, E e, CoroutineContext coroutineContext) {
        OnUndeliveredElement m19834c = m19834c(interfaceC6108l, e, null);
        if (m19834c != null) {
            C10515g0.m7790a(coroutineContext, m19834c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> OnUndeliveredElement m19834c(InterfaceC6108l<? super E, C13195u> interfaceC6108l, E e, OnUndeliveredElement onUndeliveredElement) {
        try {
            interfaceC6108l.mo9587d(e);
        } catch (Throwable th2) {
            if (onUndeliveredElement != null && onUndeliveredElement.getCause() != th2) {
                Exceptions.m1470a(onUndeliveredElement, th2);
            } else {
                return new OnUndeliveredElement("Exception in undelivered element handler for " + e, th2);
            }
        }
        return onUndeliveredElement;
    }

    /* renamed from: d */
    public static /* synthetic */ OnUndeliveredElement m19833d(InterfaceC6108l interfaceC6108l, Object obj, OnUndeliveredElement onUndeliveredElement, int i, Object obj2) {
        if ((i & 2) != 0) {
            onUndeliveredElement = null;
        }
        return m19834c(interfaceC6108l, obj, onUndeliveredElement);
    }
}
