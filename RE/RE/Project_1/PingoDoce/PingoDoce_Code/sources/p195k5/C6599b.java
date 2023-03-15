package p195k5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p181jd.Intrinsics;
import p195k5.PermissionStatus;

/* compiled from: PermissionStatus.kt */
/* renamed from: k5.b */
/* loaded from: classes.dex */
public final class C6599b {
    /* renamed from: a */
    public static final boolean m20515a(List list) {
        Intrinsics.isThisObjectNull(list, "$this$allGranted");
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!m20512d((PermissionStatus) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m20514b(List list) {
        boolean z;
        Intrinsics.isThisObjectNull(list, "$this$allPermanentlyDenied");
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PermissionStatus permissionStatus = (PermissionStatus) it.next();
                if (m20513c(permissionStatus) && m20511e(permissionStatus)) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m20513c(PermissionStatus permissionStatus) {
        Intrinsics.isThisObjectNull(permissionStatus, "$this$isDenied");
        return permissionStatus instanceof PermissionStatus.AbstractC6594a;
    }

    /* renamed from: d */
    public static final boolean m20512d(PermissionStatus permissionStatus) {
        Intrinsics.isThisObjectNull(permissionStatus, "$this$isGranted");
        return permissionStatus instanceof PermissionStatus.C6597b;
    }

    /* renamed from: e */
    public static final boolean m20511e(PermissionStatus permissionStatus) {
        Intrinsics.isThisObjectNull(permissionStatus, "$this$isPermanentlyDenied");
        return permissionStatus instanceof PermissionStatus.AbstractC6594a.C6595a;
    }
}
