package p009a8;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: a8.s */
/* loaded from: classes.dex */
public final class C0086s {
    /* renamed from: a */
    public static String m41972a(String str, String[] strArr, String[] strArr2) {
        C2597i.m33076j(strArr);
        C2597i.m33076j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m41971b(Context context, String str, String str2) {
        C2597i.m33076j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C0076i.m41978a(context);
        }
        return C0076i.m41977b("google_app_id", resources, str2);
    }
}
