package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C1070c;
import java.util.List;

/* renamed from: androidx.core.view.d */
/* loaded from: classes.dex */
public final class C1146d {

    /* renamed from: a */
    private final DisplayCutout f3489a;

    /* compiled from: DisplayCutoutCompat.java */
    /* renamed from: androidx.core.view.d$a */
    /* loaded from: classes.dex */
    static class C1147a {
        /* renamed from: a */
        static DisplayCutout m38225a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m38224b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m38223c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m38222d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m38221e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m38220f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C1146d(DisplayCutout displayCutout) {
        this.f3489a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1146d m38226e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1146d(displayCutout);
    }

    /* renamed from: a */
    public int m38230a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1147a.m38223c(this.f3489a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m38229b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1147a.m38222d(this.f3489a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m38228c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1147a.m38221e(this.f3489a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m38227d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1147a.m38220f(this.f3489a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1146d.class != obj.getClass()) {
            return false;
        }
        return C1070c.m38634a(this.f3489a, ((C1146d) obj).f3489a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3489a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3489a + "}";
    }
}
