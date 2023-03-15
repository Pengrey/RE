package p354s8;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import org.joda.time.DateTimeConstants;
import p170j2.C6298a;

/* renamed from: s8.g */
/* loaded from: classes.dex */
public class C10092g {
    /* renamed from: a */
    public static Typeface m9198a(Context context, Typeface typeface) {
        return m9197b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m9197b(Configuration configuration, Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i == 0) {
            return null;
        }
        return Typeface.create(typeface, C6298a.m21277b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, DateTimeConstants.MILLIS_PER_SECOND), typeface.isItalic());
    }
}
