package p198k8;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0969a;
import p354s8.C10085b;

/* renamed from: k8.a */
/* loaded from: classes.dex */
public class C6608a {
    /* renamed from: a */
    public static int m20507a(int i, int i2) {
        return C0969a.m38939j(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m20506b(Context context, int i, int i2) {
        TypedValue m9234a = C10085b.m9234a(context, i);
        return m9234a != null ? m9234a.data : i2;
    }

    /* renamed from: c */
    public static int m20505c(Context context, int i, String str) {
        return C10085b.m9231d(context, i, str);
    }

    /* renamed from: d */
    public static int m20504d(View view, int i) {
        return C10085b.m9230e(view, i);
    }

    /* renamed from: e */
    public static int m20503e(View view, int i, int i2) {
        return m20506b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m20502f(int i) {
        return i != 0 && C0969a.m38946c(i) > 0.5d;
    }

    /* renamed from: g */
    public static int m20501g(int i, int i2) {
        return C0969a.m38943f(i2, i);
    }

    /* renamed from: h */
    public static int m20500h(int i, int i2, float f) {
        return m20501g(i, C0969a.m38939j(i2, Math.round(Color.alpha(i2) * f)));
    }

    /* renamed from: i */
    public static int m20499i(View view, int i, int i2, float f) {
        return m20500h(m20504d(view, i), m20504d(view, i2), f);
    }
}
