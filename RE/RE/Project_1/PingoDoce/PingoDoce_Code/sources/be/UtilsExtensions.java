package be;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.C1436e0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p489zc._Collections;
import sd.C10171u;
import sd.CharJVM;
import sd.StringsJVM;

/* renamed from: be.b */
/* loaded from: classes2.dex */
public final class UtilsExtensions {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UtilsExtensions.kt */
    /* renamed from: be.b$a */
    /* loaded from: classes2.dex */
    public static final class C1900a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        public static final C1900a f5640w = new C1900a();

        C1900a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo9587d(String str) {
            String valueOf;
            Intrinsics.isThisObjectNull(str, "it");
            if (str.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = str.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkIfNull(locale, "getDefault()");
                    valueOf = CharJVM.m9041d(charAt, locale);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                sb2.append((Object) valueOf);
                String substring = str.substring(1);
                Intrinsics.checkIfNull(substring, "this as java.lang.String).substring(startIndex)");
                sb2.append(substring);
                return sb2.toString();
            }
            return str;
        }
    }

    /* renamed from: a */
    public static final void m35171a(View view) {
        Intrinsics.isThisObjectNull(view, "<this>");
        view.setFocusableInTouchMode(true);
        view.requestFocus();
    }

    /* renamed from: b */
    public static final String m35170b(String str) {
        List m8883q0;
        String m474U;
        Intrinsics.isThisObjectNull(str, "<this>");
        m8883q0 = C10171u.m8883q0(str, new String[]{" "}, false, 0, 6, null);
        m474U = _Collections.m474U(m8883q0, " ", null, null, 0, null, C1900a.f5640w, 30, null);
        return m474U;
    }

    /* renamed from: c */
    public static final void m35169c(TextView textView) {
        Intrinsics.isThisObjectNull(textView, "<this>");
        textView.setPaintFlags(64);
    }

    /* renamed from: d */
    public static final int m35168d(float f) {
        return (int) Math.ceil(f * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: e */
    public static final int m35167e(int i) {
        return (int) Math.ceil(i * Resources.getSystem().getDisplayMetrics().density);
    }

    /* renamed from: f */
    public static final void m35166f(C1436e0 c1436e0, List list) {
        Intrinsics.isThisObjectNull(c1436e0, "<this>");
        Intrinsics.isThisObjectNull(list, "values");
        List list2 = (List) c1436e0.mo172f();
        if (list2 == null) {
            list2 = new ArrayList();
        }
        list2.addAll(list);
        c1436e0.mo166p(list2);
    }

    /* renamed from: g */
    public static final String m35165g(String str) {
        String m8935y;
        Intrinsics.isThisObjectNull(str, "<this>");
        m8935y = StringsJVM.m8935y(str, " ", BuildConfig.VERSION_NAME, false, 4, null);
        return m8935y;
    }

    /* renamed from: h */
    public static final void m35164h(TextView textView) {
        Intrinsics.isThisObjectNull(textView, "<this>");
        textView.setPaintFlags(textView.getPaintFlags() | 16);
    }
}
