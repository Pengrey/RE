package p424wd;

import bd.C1894h;
import bd.CoroutineContext;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.google.crypto.tink.shaded.protobuf.Reader;
import id.InterfaceC6112p;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.EnumC6775f;
import kotlinx.coroutines.channels.EnumC6771a;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p070e.C4906j;
import p181jd.Intrinsics;
import p404vd.C11236o;
import p404vd.InterfaceC11238q;
import p404vd.InterfaceC11240s;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Collections;
import td.C10531j0;
import td.C10539l0;
import td.C10543m0;
import td.InterfaceC10524i0;

/* renamed from: wd.d */
/* loaded from: classes2.dex */
public abstract class AbstractC11621d<T> implements InterfaceC11646o {

    /* renamed from: w */
    public final CoroutineContext f29709w;

    /* renamed from: x */
    public final int f29710x;

    /* renamed from: y */
    public final EnumC6771a f29711y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", m20196f = "ChannelFlow.kt", m20195l = {C4906j.f13405F0}, m20194m = "invokeSuspend")
    /* renamed from: wd.d$a */
    /* loaded from: classes2.dex */
    public static final class C11622a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ AbstractC11621d f29712A;

        /* renamed from: x */
        int f29713x;

        /* renamed from: y */
        private /* synthetic */ Object f29714y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC6787d f29715z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11622a(InterfaceC6787d interfaceC6787d, AbstractC11621d abstractC11621d, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f29715z = interfaceC6787d;
            this.f29712A = abstractC11621d;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C11622a c11622a = new C11622a(this.f29715z, this.f29712A, interfaceC1886d);
            c11622a.f29714y = obj;
            return c11622a;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C11622a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29713x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC6787d interfaceC6787d = this.f29715z;
                InterfaceC11240s mo4564l = this.f29712A.mo4564l((InterfaceC10524i0) this.f29714y);
                this.f29713x = 1;
                if (C6788e.m20139i(interfaceC6787d, mo4564l, this) == m34636d) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelFlow.kt */
    @InterfaceC6759f(m20197c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", m20196f = "ChannelFlow.kt", m20195l = {60}, m20194m = "invokeSuspend")
    /* renamed from: wd.d$b */
    /* loaded from: classes2.dex */
    public static final class C11623b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f29716x;

        /* renamed from: y */
        /* synthetic */ Object f29717y;

        C11623b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            C11623b c11623b = new C11623b(interfaceC1886d);
            c11623b.f29717y = obj;
            return c11623b;
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC11238q interfaceC11238q, InterfaceC1886d interfaceC1886d) {
            return ((C11623b) create(interfaceC11238q, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29716x;
            if (i == 0) {
                C13186n.m1453b(obj);
                AbstractC11621d abstractC11621d = AbstractC11621d.this;
                this.f29716x = 1;
                if (abstractC11621d.mo4565h((InterfaceC11238q) this.f29717y, this) == m34636d) {
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

    public AbstractC11621d(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        this.f29709w = coroutineContext;
        this.f29710x = i;
        this.f29711y = enumC6771a;
        if (C10539l0.m7720a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: g */
    static /* synthetic */ Object m4575g(AbstractC11621d abstractC11621d, InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m7768d = C10531j0.m7768d(new C11622a(interfaceC6787d, abstractC11621d, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m7768d == m34636d ? m7768d : C13195u.f34156a;
    }

    /* renamed from: d */
    public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
        return m4575g(this, interfaceC6787d, interfaceC1886d);
    }

    /* renamed from: e */
    public InterfaceC6785c mo4540e(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a) {
        if (C10539l0.m7720a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        CoroutineContext mo4545f0 = coroutineContext.mo4545f0(this.f29709w);
        if (enumC6771a == EnumC6771a.SUSPEND) {
            int i2 = this.f29710x;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            if (C10539l0.m7720a()) {
                                if (!(this.f29710x >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            if (C10539l0.m7720a()) {
                                if (!(i >= 0)) {
                                    throw new AssertionError();
                                }
                            }
                            i2 = this.f29710x + i;
                            if (i2 < 0) {
                                i = Reader.READ_DONE;
                            }
                        }
                    }
                }
                i = i2;
            }
            enumC6771a = this.f29711y;
        }
        return (Intrinsics.equals(mo4545f0, this.f29709w) && i == this.f29710x && enumC6771a == this.f29711y) ? this : mo4555i(mo4545f0, i, enumC6771a);
    }

    /* renamed from: f */
    protected String mo4566f() {
        return null;
    }

    /* renamed from: h */
    protected abstract Object mo4565h(InterfaceC11238q interfaceC11238q, InterfaceC1886d interfaceC1886d);

    /* renamed from: i */
    protected abstract AbstractC11621d mo4555i(CoroutineContext coroutineContext, int i, EnumC6771a enumC6771a);

    /* renamed from: j */
    public final InterfaceC6112p m4574j() {
        return new C11623b(null);
    }

    /* renamed from: k */
    public final int m4573k() {
        int i = this.f29710x;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* renamed from: l */
    public InterfaceC11240s mo4564l(InterfaceC10524i0 interfaceC10524i0) {
        return C11236o.m5662c(interfaceC10524i0, this.f29709w, m4573k(), this.f29711y, EnumC6775f.ATOMIC, null, m4574j(), 16, null);
    }

    public String toString() {
        String m474U;
        ArrayList arrayList = new ArrayList(4);
        String mo4566f = mo4566f();
        if (mo4566f != null) {
            arrayList.add(mo4566f);
        }
        if (this.f29709w != C1894h.f5621w) {
            arrayList.add("context=" + this.f29709w);
        }
        if (this.f29710x != -3) {
            arrayList.add("capacity=" + this.f29710x);
        }
        if (this.f29711y != EnumC6771a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f29711y);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C10543m0.m7712a(this));
        sb2.append('[');
        m474U = _Collections.m474U(arrayList, ", ", null, null, 0, null, null, 62, null);
        sb2.append(m474U);
        sb2.append(']');
        return sb2.toString();
    }
}
