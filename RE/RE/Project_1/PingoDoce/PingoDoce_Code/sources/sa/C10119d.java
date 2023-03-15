package sa;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4355c;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4354b;
import com.google.gson.InterfaceC4391t;
import com.google.gson.stream.C4387a;
import com.google.gson.stream.C4390c;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p334ra.InterfaceC9830a;
import p334ra.InterfaceC9833d;
import p334ra.InterfaceC9834e;
import p421wa.C11605a;

/* renamed from: sa.d */
/* loaded from: classes2.dex */
public final class C10119d implements InterfaceC4391t, Cloneable {

    /* renamed from: C */
    public static final C10119d f26399C = new C10119d();

    /* renamed from: z */
    private boolean f26405z;

    /* renamed from: w */
    private double f26402w = -1.0d;

    /* renamed from: x */
    private int f26403x = 136;

    /* renamed from: y */
    private boolean f26404y = true;

    /* renamed from: A */
    private List<InterfaceC4354b> f26400A = Collections.emptyList();

    /* renamed from: B */
    private List<InterfaceC4354b> f26401B = Collections.emptyList();

    /* compiled from: Excluder.java */
    /* renamed from: sa.d$a */
    /* loaded from: classes2.dex */
    class C10120a extends AbstractC4385s<T> {

        /* renamed from: a */
        private AbstractC4385s<T> f26406a;

        /* renamed from: b */
        final /* synthetic */ boolean f26407b;

        /* renamed from: c */
        final /* synthetic */ boolean f26408c;

        /* renamed from: d */
        final /* synthetic */ C4364f f26409d;

        /* renamed from: e */
        final /* synthetic */ C11605a f26410e;

        C10120a(boolean z, boolean z2, C4364f c4364f, C11605a c11605a) {
            this.f26407b = z;
            this.f26408c = z2;
            this.f26409d = c4364f;
            this.f26410e = c11605a;
        }

        /* renamed from: e */
        private AbstractC4385s<T> m9106e() {
            AbstractC4385s<T> abstractC4385s = this.f26406a;
            if (abstractC4385s != 0) {
                return abstractC4385s;
            }
            AbstractC4385s<T> m27793m = this.f26409d.m27793m(C10119d.this, this.f26410e);
            this.f26406a = m27793m;
            return m27793m;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // com.google.gson.AbstractC4385s
        /* renamed from: b */
        public T mo27782e(C4387a c4387a) throws IOException {
            if (this.f26407b) {
                c4387a.mo8054H0();
                return null;
            }
            return m9106e().mo27782e(c4387a);
        }

        @Override // com.google.gson.AbstractC4385s
        /* renamed from: d */
        public void mo27781f(C4390c c4390c, T t) throws IOException {
            if (this.f26408c) {
                c4390c.mo8031P();
            } else {
                m9106e().mo27781f(c4390c, t);
            }
        }
    }

    /* renamed from: d */
    private boolean m9115d(Class<?> cls) {
        if (this.f26402w == -1.0d || m9107m((InterfaceC9833d) cls.getAnnotation(InterfaceC9833d.class), (InterfaceC9834e) cls.getAnnotation(InterfaceC9834e.class))) {
            return (!this.f26404y && m9111i(cls)) || m9112g(cls);
        }
        return true;
    }

    /* renamed from: e */
    private boolean m9114e(Class<?> cls, boolean z) {
        for (InterfaceC4354b interfaceC4354b : z ? this.f26400A : this.f26401B) {
            if (interfaceC4354b.m27807a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private boolean m9112g(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: i */
    private boolean m9111i(Class<?> cls) {
        return cls.isMemberClass() && !m9110j(cls);
    }

    /* renamed from: j */
    private boolean m9110j(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: k */
    private boolean m9109k(InterfaceC9833d interfaceC9833d) {
        return interfaceC9833d == null || interfaceC9833d.value() <= this.f26402w;
    }

    /* renamed from: l */
    private boolean m9108l(InterfaceC9834e interfaceC9834e) {
        return interfaceC9834e == null || interfaceC9834e.value() > this.f26402w;
    }

    /* renamed from: m */
    private boolean m9107m(InterfaceC9833d interfaceC9833d, InterfaceC9834e interfaceC9834e) {
        return m9109k(interfaceC9833d) && m9108l(interfaceC9834e);
    }

    @Override // com.google.gson.InterfaceC4391t
    /* renamed from: a */
    public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
        Class<? super T> m4629c = c11605a.m4629c();
        boolean m9115d = m9115d(m4629c);
        boolean z = m9115d || m9114e(m4629c, true);
        boolean z2 = m9115d || m9114e(m4629c, false);
        if (z || z2) {
            return new C10120a(z2, z, c4364f, c11605a);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public C10119d clone() {
        try {
            return (C10119d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public boolean m9116c(Class<?> cls, boolean z) {
        return m9115d(cls) || m9114e(cls, z);
    }

    /* renamed from: f */
    public boolean m9113f(Field field, boolean z) {
        InterfaceC9830a interfaceC9830a;
        if ((this.f26403x & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f26402w == -1.0d || m9107m((InterfaceC9833d) field.getAnnotation(InterfaceC9833d.class), (InterfaceC9834e) field.getAnnotation(InterfaceC9834e.class))) && !field.isSynthetic()) {
            if (!this.f26405z || ((interfaceC9830a = (InterfaceC9830a) field.getAnnotation(InterfaceC9830a.class)) != null && (!z ? !interfaceC9830a.deserialize() : !interfaceC9830a.serialize()))) {
                if ((this.f26404y || !m9111i(field.getType())) && !m9112g(field.getType())) {
                    List<InterfaceC4354b> list = z ? this.f26400A : this.f26401B;
                    if (list.isEmpty()) {
                        return false;
                    }
                    C4355c c4355c = new C4355c(field);
                    for (InterfaceC4354b interfaceC4354b : list) {
                        if (interfaceC4354b.m27806b(c4355c)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
