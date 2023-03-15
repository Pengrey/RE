package p189k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p070e.C4897a;
import p070e.C4898b;
import p070e.C4900d;
import p070e.C4906j;

/* renamed from: k.a */
/* loaded from: classes.dex */
public class C6540a {

    /* renamed from: a */
    private Context f17711a;

    private C6540a(Context context) {
        this.f17711a = context;
    }

    /* renamed from: b */
    public static C6540a m20663b(Context context) {
        return new C6540a(context);
    }

    /* renamed from: a */
    public boolean m20664a() {
        return this.f17711a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m20662c() {
        return this.f17711a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m20661d() {
        Configuration configuration = this.f17711a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m20660e() {
        return this.f17711a.getResources().getDimensionPixelSize(C4900d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m20659f() {
        TypedArray obtainStyledAttributes = this.f17711a.obtainStyledAttributes(null, C4906j.f13491a, C4897a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C4906j.f13536j, 0);
        Resources resources = this.f17711a.getResources();
        if (!m20658g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C4900d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m20658g() {
        return this.f17711a.getResources().getBoolean(C4898b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m20657h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f17711a).hasPermanentMenuKey();
    }
}
