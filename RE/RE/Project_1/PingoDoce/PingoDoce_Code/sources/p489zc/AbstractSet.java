package p489zc;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: zc.h */
/* loaded from: classes2.dex */
public abstract class AbstractSet<E> extends AbstractCollection implements Set {

    /* renamed from: w */
    public static final C13763a f34882w = new C13763a(null);

    /* compiled from: AbstractSet.kt */
    /* renamed from: zc.h$a */
    /* loaded from: classes2.dex */
    public static final class C13763a {
        private C13763a() {
        }

        public /* synthetic */ C13763a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m403a(Set set, Set set2) {
            Intrinsics.isThisObjectNull(set, "c");
            Intrinsics.isThisObjectNull(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        /* renamed from: b */
        public final int m402b(Collection collection) {
            Intrinsics.isThisObjectNull(collection, "c");
            Iterator<E> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                E next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f34882w.m403a(this, (Set) obj);
        }
        return false;
    }

    public int hashCode() {
        return f34882w.m402b(this);
    }
}
