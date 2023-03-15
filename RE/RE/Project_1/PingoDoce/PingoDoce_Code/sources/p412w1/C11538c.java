package p412w1;

import android.text.SpannableString;
import java.util.List;
import p181jd.Intrinsics;
import p286p1.TextStyle;
import p434x1.C12250c;
import p434x1.C12252e;
import p457y1.C13068g;
import p479z1.C13621q;
import p479z1.Density;

/* compiled from: AndroidParagraphHelper.android.kt */
/* renamed from: w1.c */
/* loaded from: classes.dex */
public final class C11538c {
    /* renamed from: a */
    public static final CharSequence m4775a(String str, float f, TextStyle textStyle, List list, List list2, Density density, C11545j c11545j) {
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(textStyle, "contextTextStyle");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(list2, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(c11545j, "typefaceAdapter");
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.equals(textStyle.m15506u(), C13068g.f33988c.m1696a()) && C13621q.m802d(textStyle.m15513n())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        C12252e.m3198l(spannableString, textStyle.m15513n(), f, density);
        C12252e.m3191s(spannableString, textStyle.m15506u(), f, density);
        C12252e.m3193q(spannableString, textStyle, list, density, c11545j);
        C12250c.m3213d(spannableString, list2, density);
        return spannableString;
    }
}
