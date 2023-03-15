package p478z0;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageVector.kt */
/* renamed from: z0.h */
/* loaded from: classes.dex */
public final class C13527h<T> {
    /* renamed from: a */
    public static ArrayList m1083a(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "backing");
        return arrayList;
    }

    /* renamed from: b */
    public static /* synthetic */ ArrayList m1082b(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m1083a(arrayList);
    }

    /* renamed from: c */
    public static final int m1081c(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "arg0");
        return arrayList.size();
    }

    /* renamed from: d */
    public static final Object m1080d(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "arg0");
        return arrayList.get(m1081c(arrayList) - 1);
    }

    /* renamed from: e */
    public static final Object m1079e(ArrayList arrayList) {
        Intrinsics.isThisObjectNull(arrayList, "arg0");
        return arrayList.remove(m1081c(arrayList) - 1);
    }

    /* renamed from: f */
    public static final boolean m1078f(ArrayList arrayList, Object obj) {
        Intrinsics.isThisObjectNull(arrayList, "arg0");
        return arrayList.add(obj);
    }
}
