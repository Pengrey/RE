package p106fe;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import p181jd.Intrinsics;

/* renamed from: fe.b */
/* loaded from: classes2.dex */
public final class IntentUtils {
    static {
        new IntentUtils();
    }

    private IntentUtils() {
    }

    /* renamed from: a */
    public static final void m24293a(Activity activity, String str) {
        Intrinsics.isThisObjectNull(activity, "activity");
        Intrinsics.isThisObjectNull(str, "url");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }

    /* renamed from: b */
    public static final void m24292b(Activity activity, String str, String str2) {
        Intrinsics.isThisObjectNull(activity, "activity");
        Intrinsics.isThisObjectNull(str, "content");
        Intrinsics.isThisObjectNull(str2, "chooserMessage");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        activity.startActivity(Intent.createChooser(intent, str2));
    }
}
