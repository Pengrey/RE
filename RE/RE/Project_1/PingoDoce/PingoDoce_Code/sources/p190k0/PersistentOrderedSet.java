package p190k0;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126h0.InterfaceC5742g;
import p168j0.PersistentHashMap;
import p181jd.Intrinsics;
import p210l0.C6958c;
import p489zc.AbstractSet;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class PersistentOrderedSet<E> extends AbstractSet implements InterfaceC5742g {

    /* renamed from: A */
    public static final C6555a f17784A = new C6555a(null);

    /* renamed from: B */
    private static final PersistentOrderedSet f17785B;

    /* renamed from: x */
    private final Object f17786x;

    /* renamed from: y */
    private final Object f17787y;

    /* renamed from: z */
    private final PersistentHashMap f17788z;

    /* compiled from: PersistentOrderedSet.kt */
    /* renamed from: k0.b$a */
    /* loaded from: classes.dex */
    public static final class C6555a {
        private C6555a() {
        }

        public /* synthetic */ C6555a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC5742g m20594a() {
            return PersistentOrderedSet.m20595f();
        }
    }

    static {
        C6958c c6958c = C6958c.f18492a;
        f17785B = new PersistentOrderedSet(c6958c, c6958c, PersistentHashMap.f17027y.m21885a());
    }

    public PersistentOrderedSet(Object obj, Object obj2, PersistentHashMap persistentHashMap) {
        Intrinsics.isThisObjectNull(persistentHashMap, "hashMap");
        this.f17786x = obj;
        this.f17787y = obj2;
        this.f17788z = persistentHashMap;
    }

    /* renamed from: f */
    public static final /* synthetic */ PersistentOrderedSet m20595f() {
        return f17785B;
    }

    public InterfaceC5742g add(Object obj) {
        if (this.f17788z.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new PersistentOrderedSet(obj, obj, this.f17788z.m21887s(obj, new C6554a()));
        }
        Object obj2 = this.f17787y;
        Object obj3 = this.f17788z.get(obj2);
        Intrinsics.ifNullDoSomething(obj3);
        return new PersistentOrderedSet(this.f17786x, obj, this.f17788z.m21887s(obj2, ((C6554a) obj3).m20598e(obj)).m21887s(obj, new C6554a(obj2)));
    }

    /* renamed from: b */
    public int m20596b() {
        return this.f17788z.size();
    }

    public boolean contains(Object obj) {
        return this.f17788z.containsKey(obj);
    }

    public Iterator iterator() {
        return new PersistentOrderedSetIterator(this.f17786x, this.f17788z);
    }

    public InterfaceC5742g remove(Object obj) {
        C6554a c6554a = (C6554a) this.f17788z.get(obj);
        if (c6554a == null) {
            return this;
        }
        PersistentHashMap m21886t = this.f17788z.m21886t(obj);
        if (c6554a.m20601b()) {
            Object obj2 = m21886t.get(c6554a.m20599d());
            Intrinsics.ifNullDoSomething(obj2);
            m21886t = m21886t.m21887s(c6554a.m20599d(), ((C6554a) obj2).m20598e(c6554a.m20600c()));
        }
        if (c6554a.m20602a()) {
            Object obj3 = m21886t.get(c6554a.m20600c());
            Intrinsics.ifNullDoSomething(obj3);
            m21886t = m21886t.m21887s(c6554a.m20600c(), ((C6554a) obj3).m20597f(c6554a.m20599d()));
        }
        return new PersistentOrderedSet(!c6554a.m20601b() ? c6554a.m20600c() : this.f17786x, !c6554a.m20602a() ? c6554a.m20599d() : this.f17787y, m21886t);
    }
}
