package androidx.core.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: androidx.core.text.b */
/* loaded from: classes.dex */
public final class C1050b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HtmlCompat.java */
    /* renamed from: androidx.core.text.b$a */
    /* loaded from: classes.dex */
    public static class C1051a {
        /* renamed from: a */
        static Spanned m38665a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        static Spanned m38664b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        static String m38663c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    /* renamed from: a */
    public static Spanned m38666a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1051a.m38665a(str, i);
        }
        return Html.fromHtml(str);
    }
}
