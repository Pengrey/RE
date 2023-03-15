package p332r8;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;

/* renamed from: r8.a */
/* loaded from: classes.dex */
public class C9826a {

    /* renamed from: a */
    private static float f25771a = 1.0f;

    /* renamed from: a */
    public float m9912a(ContentResolver contentResolver) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        if (i == 16) {
            return Settings.System.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        }
        return f25771a;
    }
}
