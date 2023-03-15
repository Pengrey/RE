package p249n5;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C0883b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181jd.Intrinsics;
import p195k5.PermissionStatus;
import p489zc.Iterables;

/* renamed from: n5.a */
/* loaded from: classes.dex */
public final class CheckPermissionsStatus {
    /* renamed from: a */
    public static final List m17732a(Context context, List list) {
        int m186r;
        Object c6595a;
        Intrinsics.isThisObjectNull(context, "$this$checkManifestPermissionsStatus");
        Intrinsics.isThisObjectNull(list, "permissions");
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (IsPermissionGranted.m17730a(context, str)) {
                c6595a = new PermissionStatus.C6597b(str);
            } else {
                c6595a = new PermissionStatus.AbstractC6594a.C6595a(str);
            }
            arrayList.add(c6595a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m17731b(Activity activity, List list) {
        int m186r;
        Object c6598c;
        Intrinsics.isThisObjectNull(activity, "$this$checkRuntimePermissionsStatus");
        Intrinsics.isThisObjectNull(list, "permissions");
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (IsPermissionGranted.m17730a(activity, str)) {
                c6598c = new PermissionStatus.C6597b(str);
            } else if (C0883b.m39261s(activity, str)) {
                c6598c = new PermissionStatus.AbstractC6594a.C6596b(str);
            } else {
                c6598c = new PermissionStatus.C6598c(str);
            }
            arrayList.add(c6598c);
        }
        return arrayList;
    }
}
