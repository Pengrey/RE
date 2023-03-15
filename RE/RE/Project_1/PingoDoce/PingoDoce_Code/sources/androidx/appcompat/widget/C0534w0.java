package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p070e.C4900d;
import p070e.C4902f;
import p070e.C4903g;
import p070e.C4905i;

/* renamed from: androidx.appcompat.widget.w0 */
/* loaded from: classes.dex */
class C0534w0 {

    /* renamed from: a */
    private final Context f1797a;

    /* renamed from: b */
    private final View f1798b;

    /* renamed from: c */
    private final TextView f1799c;

    /* renamed from: d */
    private final WindowManager.LayoutParams f1800d;

    /* renamed from: e */
    private final Rect f1801e;

    /* renamed from: f */
    private final int[] f1802f;

    /* renamed from: g */
    private final int[] f1803g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0534w0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1800d = layoutParams;
        this.f1801e = new Rect();
        this.f1802f = new int[2];
        this.f1803g = new int[2];
        this.f1797a = context;
        View inflate = LayoutInflater.from(context).inflate(C4903g.abc_tooltip, (ViewGroup) null);
        this.f1798b = inflate;
        this.f1799c = (TextView) inflate.findViewById(C4902f.message);
        layoutParams.setTitle(C0534w0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C4905i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    private void m40371a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1797a.getResources().getDimensionPixelOffset(C4900d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1797a.getResources().getDimensionPixelOffset(C4900d.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1797a.getResources().getDimensionPixelOffset(z ? C4900d.tooltip_y_offset_touch : C4900d.tooltip_y_offset_non_touch);
        View m40370b = m40370b(view);
        if (m40370b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m40370b.getWindowVisibleDisplayFrame(this.f1801e);
        Rect rect = this.f1801e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1797a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1801e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m40370b.getLocationOnScreen(this.f1803g);
        view.getLocationOnScreen(this.f1802f);
        int[] iArr = this.f1802f;
        int i4 = iArr[0];
        int[] iArr2 = this.f1803g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m40370b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1798b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1798b.getMeasuredHeight();
        int[] iArr3 = this.f1802f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (z) {
            if (i5 >= 0) {
                layoutParams.y = i5;
            } else {
                layoutParams.y = i6;
            }
        } else if (measuredHeight + i6 <= this.f1801e.height()) {
            layoutParams.y = i6;
        } else {
            layoutParams.y = i5;
        }
    }

    /* renamed from: b */
    private static View m40370b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m40369c() {
        if (m40368d()) {
            ((WindowManager) this.f1797a.getSystemService("window")).removeView(this.f1798b);
        }
    }

    /* renamed from: d */
    boolean m40368d() {
        return this.f1798b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40367e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m40368d()) {
            m40369c();
        }
        this.f1799c.setText(charSequence);
        m40371a(view, i, i2, z, this.f1800d);
        ((WindowManager) this.f1797a.getSystemService("window")).addView(this.f1798b, this.f1800d);
    }
}
