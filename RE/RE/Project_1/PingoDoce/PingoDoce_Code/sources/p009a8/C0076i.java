package p009a8;

import android.content.Context;
import android.content.res.Resources;
import p439x6.C12287b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: a8.i */
/* loaded from: classes.dex */
public final class C0076i {
    /* renamed from: a */
    public static String m41978a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C12287b.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* renamed from: b */
    public static final String m41977b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier != 0) {
            try {
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return resources.getString(identifier);
    }
}
