package p038c2;

import android.view.View;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public class C1989a {
    /* renamed from: a */
    public static String m34971a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
