package p264o4;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p076e5.CrashShieldHandler;
import p306q4.C9655f;

/* renamed from: o4.b */
/* loaded from: classes.dex */
final class C8016b {
    C8016b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List<String> m17167a(View view) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup m10267j = C9655f.m10267j(view);
            if (m10267j != null) {
                for (View view2 : C9655f.m10275b(m10267j)) {
                    if (view != view2) {
                        arrayList.addAll(m17165c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List<String> m17166b(View view) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C9655f.m10268i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return null;
        }
    }

    /* renamed from: c */
    static List<String> m17165c(View view) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View view2 : C9655f.m10275b(view)) {
                arrayList.addAll(m17165c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return null;
        }
    }

    /* renamed from: d */
    static boolean m17164d(String str, List<String> list) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return false;
        }
        try {
            for (String str2 : list) {
                if (str.contains(str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m17163e(List<String> list, List<String> list2) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return false;
        }
        try {
            for (String str : list) {
                if (m17164d(str, list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static boolean m17162f(String str, String str2) {
        if (CrashShieldHandler.m25963d(C8016b.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C8016b.class);
            return false;
        }
    }
}
