package p310q8;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.C0972c;
import androidx.core.view.animation.C1107b;
import p354s8.C10085b;

/* renamed from: q8.a */
/* loaded from: classes.dex */
public class C9698a {
    /* renamed from: a */
    private static float m10191a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat < 0.0f || parseFloat > 1.0f) {
            throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
        }
        return parseFloat;
    }

    /* renamed from: b */
    private static String m10190b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static boolean m10189c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("(");
        return str.startsWith(sb2.toString()) && str.endsWith(")");
    }

    /* renamed from: d */
    public static int m10188d(Context context, int i, int i2) {
        return C10085b.m9232c(context, i, i2);
    }

    /* renamed from: e */
    public static TimeInterpolator m10187e(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (m10189c(valueOf, "cubic-bezier")) {
                    String[] split = m10190b(valueOf, "cubic-bezier").split(",");
                    if (split.length == 4) {
                        return C1107b.m38491a(m10191a(split, 0), m10191a(split, 1), m10191a(split, 2), m10191a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (m10189c(valueOf, "path")) {
                    return C1107b.m38490b(C0972c.m38928e(m10190b(valueOf, "path")));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
                }
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}
