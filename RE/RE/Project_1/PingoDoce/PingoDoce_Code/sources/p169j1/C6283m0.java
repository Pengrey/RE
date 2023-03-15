package p169j1;

import java.util.Comparator;
import java.util.TreeSet;
import p181jd.Intrinsics;

/* compiled from: JvmTreeSet.jvm.kt */
/* renamed from: j1.m0 */
/* loaded from: classes.dex */
public final class C6283m0<E> extends TreeSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6283m0(Comparator comparator) {
        super(comparator);
        Intrinsics.isThisObjectNull(comparator, "comparator");
    }

    /* renamed from: b */
    public /* bridge */ int m21434b() {
        return super.size();
    }

    public final /* bridge */ int size() {
        return m21434b();
    }
}
