package p148i0;

import id.InterfaceC6108l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126h0.ImmutableList;
import p126h0.InterfaceC5737e;
import p181jd.Intrinsics;
import p210l0.C6956a;
import p210l0.C6959d;
import p489zc.C13768k;
import p489zc._Arrays;
import p489zc._ArraysJvm;

/* renamed from: i0.j */
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList implements ImmutableList {

    /* renamed from: y */
    public static final C5986a f16542y = new C5986a(null);

    /* renamed from: z */
    private static final SmallPersistentVector f16543z = new SmallPersistentVector(new Object[0]);

    /* renamed from: x */
    private final Object[] f16544x;

    /* compiled from: SmallPersistentVector.kt */
    /* renamed from: i0.j$a */
    /* loaded from: classes.dex */
    public static final class C5986a {
        private C5986a() {
        }

        public /* synthetic */ C5986a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SmallPersistentVector m22463a() {
            return SmallPersistentVector.m22468h();
        }
    }

    public SmallPersistentVector(Object[] objArr) {
        Intrinsics.isThisObjectNull(objArr, "buffer");
        this.f16544x = objArr;
        C6956a.m19707a(objArr.length <= 32);
    }

    /* renamed from: h */
    public static final /* synthetic */ SmallPersistentVector m22468h() {
        return f16543z;
    }

    /* renamed from: l */
    private final Object[] m22466l(int i) {
        return new Object[i];
    }

    public InterfaceC5737e add(Object obj) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.f16544x, size() + 1);
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = obj;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.f16544x, C5987l.m22456c(obj), size() + 1, 0);
    }

    public InterfaceC5737e addAll(Collection collection) {
        Intrinsics.isThisObjectNull(collection, "elements");
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f16544x, size() + collection.size());
            Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
            int size = size();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        InterfaceC5737e.InterfaceC5738a m23205i = m23205i();
        m23205i.addAll(collection);
        return m23205i.build();
    }

    /* renamed from: b */
    public int m22469b() {
        return this.f16544x.length;
    }

    public Object get(int i) {
        C6959d.m19703a(i, size());
        return this.f16544x[i];
    }

    /* renamed from: i */
    public InterfaceC5737e.InterfaceC5738a m22467i() {
        return new PersistentVectorBuilder(this, null, this.f16544x, 0);
    }

    public int indexOf(Object obj) {
        int m288F;
        m288F = _Arrays.m288F(this.f16544x, obj);
        return m288F;
    }

    public int lastIndexOf(Object obj) {
        int m284J;
        m284J = _Arrays.m284J(this.f16544x, obj);
        return m284J;
    }

    public ListIterator listIterator(int i) {
        C6959d.m19702b(i, size());
        return new BufferIterator(this.f16544x, i, size());
    }

    public InterfaceC5737e set(int i, Object obj) {
        C6959d.m19703a(i, size());
        Object[] objArr = this.f16544x;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
        copyOf[i] = obj;
        return new SmallPersistentVector(copyOf);
    }

    /* renamed from: w */
    public InterfaceC5737e m22465w(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        Object[] objArr = this.f16544x;
        int size = size();
        int size2 = size();
        int i = size;
        int i2 = 0;
        boolean z = false;
        while (i2 < size2) {
            int i3 = i2 + 1;
            Object obj = this.f16544x[i2];
            if (((Boolean) interfaceC6108l.mo9587d(obj)).booleanValue()) {
                if (z) {
                    i2 = i3;
                } else {
                    Object[] objArr2 = this.f16544x;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    Intrinsics.checkIfNull(objArr, "copyOf(this, size)");
                    z = true;
                    i = i2;
                    i2 = i3;
                }
            } else if (z) {
                i2 = i + 1;
                objArr[i] = obj;
                i = i2;
                i2 = i3;
            } else {
                i2 = i3;
            }
        }
        if (i == size()) {
            return this;
        }
        if (i == 0) {
            return f16543z;
        }
        return new SmallPersistentVector(C13768k.m347p(objArr, 0, i));
    }

    /* renamed from: z */
    public InterfaceC5737e m22464z(int i) {
        C6959d.m19703a(i, size());
        if (size() == 1) {
            return f16543z;
        }
        Object[] copyOf = Arrays.copyOf(this.f16544x, size() - 1);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
        C13768k.m353i(this.f16544x, copyOf, i, i + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    public InterfaceC5737e add(int i, Object obj) {
        C6959d.m19702b(i, size());
        if (i == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] m22466l = m22466l(size() + 1);
            _ArraysJvm.m311m(this.f16544x, m22466l, 0, 0, i, 6, null);
            C13768k.m353i(this.f16544x, m22466l, i + 1, i, size());
            m22466l[i] = obj;
            return new SmallPersistentVector(m22466l);
        }
        Object[] objArr = this.f16544x;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkIfNull(copyOf, "copyOf(this, size)");
        C13768k.m353i(this.f16544x, copyOf, i + 1, i, size() - 1);
        copyOf[i] = obj;
        return new PersistentVector(copyOf, C5987l.m22456c(this.f16544x[31]), size() + 1, 0);
    }
}
