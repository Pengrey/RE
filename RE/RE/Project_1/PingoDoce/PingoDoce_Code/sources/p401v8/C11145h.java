package p401v8;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C3649p;

/* renamed from: v8.h */
/* loaded from: classes.dex */
public class C11145h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C11138d m5965a(int i) {
        if (i != 0) {
            if (i != 1) {
                return m5964b();
            }
            return new C11139e();
        }
        return new C11147j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C11138d m5964b() {
        return new C11147j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C11140f m5963c() {
        return new C11140f();
    }

    /* renamed from: d */
    public static void m5962d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C11141g) {
            ((C11141g) background).m6005Y(f);
        }
    }

    /* renamed from: e */
    public static void m5961e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C11141g) {
            m5960f(view, (C11141g) background);
        }
    }

    /* renamed from: f */
    public static void m5960f(View view, C11141g c11141g) {
        if (c11141g.m6013Q()) {
            c11141g.m5999c0(C3649p.m29489d(view));
        }
    }
}
