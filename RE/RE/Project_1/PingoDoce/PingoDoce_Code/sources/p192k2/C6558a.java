package p192k2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.C1076h;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: k2.a */
/* loaded from: classes.dex */
public final class C6558a {

    /* renamed from: a */
    private static final String[] f17794a = new String[0];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EditorInfoCompat.java */
    /* renamed from: k2.a$a */
    /* loaded from: classes.dex */
    public static class C6559a {
        /* renamed from: a */
        static void m20575a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m20583a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f17794a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f17794a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f17794a;
    }

    /* renamed from: b */
    private static boolean m20582b(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    private static boolean m20581c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m20580d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m20579e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        C1076h.m38619f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C6559a.m20575a(editorInfo, charSequence, i);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 - i : i2 - i;
        int i5 = i2 > i3 ? i2 - i : i3 - i;
        int length = charSequence.length();
        if (i >= 0 && i4 >= 0 && i5 <= length) {
            if (m20581c(editorInfo.inputType)) {
                m20577g(editorInfo, null, 0, 0);
                return;
            } else if (length <= 2048) {
                m20577g(editorInfo, charSequence, i4, i5);
                return;
            } else {
                m20576h(editorInfo, charSequence, i4, i5);
                return;
            }
        }
        m20577g(editorInfo, null, 0, 0);
    }

    /* renamed from: f */
    public static void m20578f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C6559a.m20575a(editorInfo, charSequence, 0);
        } else {
            m20579e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    private static void m20577g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    private static void m20576h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence subSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m20582b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m20582b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i4 + min;
        if (i4 != i3) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m20577g(editorInfo, subSequence, i8, i4 + i8);
    }
}
