package p050d;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0928a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p050d.ActivityResultContract;
import p181jd.Intrinsics;
import p297pd._Ranges;
import p468yc.C13182l;
import p468yc.C13191r;
import p489zc.C13769l0;
import p489zc.MapsJVM;
import p489zc._Arrays;
import p489zc._Collections;

/* renamed from: d.b */
/* loaded from: classes.dex */
public final class ActivityResultContracts extends ActivityResultContract {

    /* renamed from: a */
    public static final C4518a f12176a = new C4518a(null);

    /* compiled from: ActivityResultContracts.kt */
    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    public static final class C4518a {
        private C4518a() {
        }

        public /* synthetic */ C4518a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m27314a(String[] strArr) {
            Intrinsics.isThisObjectNull(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            Intrinsics.checkIfNull(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent mo37402d(Context context, String[] strArr) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(strArr, "input");
        return f12176a.m27314a(strArr);
    }

    /* renamed from: e */
    public ActivityResultContract.C4517a m27319b(Context context, String[] strArr) {
        int m339b;
        int m15005d;
        Map m334e;
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(strArr, "input");
        boolean z = true;
        if (strArr.length == 0) {
            m334e = C13769l0.m334e();
            return new ActivityResultContract.C4517a(m334e);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(C0928a.m39116a(context, strArr[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (z) {
            m339b = MapsJVM.m339b(strArr.length);
            m15005d = _Ranges.m15005d(m339b, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(m15005d);
            for (String str : strArr) {
                C13182l m1447a = C13191r.m1447a(str, Boolean.TRUE);
                linkedHashMap.put(m1447a.m1460c(), m1447a.m1459d());
            }
            return new ActivityResultContract.C4517a(linkedHashMap);
        }
        return null;
    }

    /* renamed from: f */
    public Map mo37401e(int i, Intent intent) {
        Map m334e;
        List m293A;
        List m449t0;
        Map m326m;
        Map m334e2;
        Map m334e3;
        if (i != -1) {
            m334e3 = C13769l0.m334e();
            return m334e3;
        } else if (intent == null) {
            m334e2 = C13769l0.m334e();
            return m334e2;
        } else {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                m293A = _Arrays.m293A(stringArrayExtra);
                m449t0 = _Collections.m449t0(m293A, arrayList);
                m326m = C13769l0.m326m(m449t0);
                return m326m;
            }
            m334e = C13769l0.m334e();
            return m334e;
        }
    }
}
