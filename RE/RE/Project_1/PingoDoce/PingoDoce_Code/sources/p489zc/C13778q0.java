package p489zc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
/* renamed from: zc.q0 */
/* loaded from: classes2.dex */
public class C13778q0 extends C13776p0 {
    /* renamed from: b */
    public static Set m208b() {
        return Sets.f34879w;
    }

    /* renamed from: c */
    public static HashSet m207c(Object... objArr) {
        int m339b;
        Intrinsics.isThisObjectNull(objArr, "elements");
        m339b = MapsJVM.m339b(objArr.length);
        return (HashSet) _Arrays.m277Q(objArr, new HashSet(m339b));
    }

    /* renamed from: d */
    public static Set m206d(Object... objArr) {
        int m339b;
        Intrinsics.isThisObjectNull(objArr, "elements");
        m339b = MapsJVM.m339b(objArr.length);
        return (Set) _Arrays.m277Q(objArr, new LinkedHashSet(m339b));
    }

    /* renamed from: e */
    public static final Set m205e(Set set) {
        Set m208b;
        Intrinsics.isThisObjectNull(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : C13776p0.m266a(set.iterator().next());
        }
        m208b = m208b();
        return m208b;
    }

    /* renamed from: f */
    public static Set m204f(Object... objArr) {
        Set m208b;
        Set m273U;
        Intrinsics.isThisObjectNull(objArr, "elements");
        if (objArr.length > 0) {
            m273U = _Arrays.m273U(objArr);
            return m273U;
        }
        m208b = m208b();
        return m208b;
    }
}
