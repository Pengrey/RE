package p103fb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.maps.android.p049ui.RotationLayout;
import p443xa.C12333c;
import p443xa.C12334d;
import p443xa.C12335e;

/* renamed from: fb.b */
/* loaded from: classes2.dex */
public class C5443b {

    /* renamed from: a */
    private final Context f15329a;

    /* renamed from: b */
    private ViewGroup f15330b;

    /* renamed from: c */
    private RotationLayout f15331c;

    /* renamed from: d */
    private TextView f15332d;

    /* renamed from: e */
    private int f15333e;

    /* renamed from: f */
    private C5442a f15334f;

    public C5443b(Context context) {
        this.f15329a = context;
        this.f15334f = new C5442a(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C12334d.amu_text_bubble, (ViewGroup) null);
        this.f15330b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.f15331c = rotationLayout;
        this.f15332d = (TextView) rotationLayout.findViewById(C12333c.amu_text);
        m24346h(1);
    }

    /* renamed from: a */
    private static int m24353a(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return i != 7 ? -1 : -30720;
                    }
                    return -6736948;
                }
                return -10053376;
            }
            return -16737844;
        }
        return -3407872;
    }

    /* renamed from: b */
    private static int m24352b(int i) {
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 7) {
            return C12335e.amu_Bubble_TextAppearance_Dark;
        }
        return C12335e.amu_Bubble_TextAppearance_Light;
    }

    /* renamed from: c */
    public Bitmap m24351c() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f15330b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = this.f15330b.getMeasuredWidth();
        int measuredHeight = this.f15330b.getMeasuredHeight();
        this.f15330b.layout(0, 0, measuredWidth, measuredHeight);
        int i = this.f15333e;
        if (i == 1 || i == 3) {
            measuredHeight = this.f15330b.getMeasuredWidth();
            measuredWidth = this.f15330b.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        int i2 = this.f15333e;
        if (i2 == 1) {
            canvas.translate(measuredWidth, 0.0f);
            canvas.rotate(90.0f);
        } else if (i2 == 2) {
            canvas.rotate(180.0f, measuredWidth / 2, measuredHeight / 2);
        } else if (i2 == 3) {
            canvas.translate(0.0f, measuredHeight);
            canvas.rotate(270.0f);
        }
        this.f15330b.draw(canvas);
        return createBitmap;
    }

    /* renamed from: d */
    public Bitmap m24350d(CharSequence charSequence) {
        TextView textView = this.f15332d;
        if (textView != null) {
            textView.setText(charSequence);
        }
        return m24351c();
    }

    /* renamed from: e */
    public void m24349e(Drawable drawable) {
        this.f15330b.setBackgroundDrawable(drawable);
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            this.f15330b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            return;
        }
        this.f15330b.setPadding(0, 0, 0, 0);
    }

    /* renamed from: f */
    public void m24348f(int i) {
        this.f15334f.m24354a(i);
        m24349e(this.f15334f);
    }

    /* renamed from: g */
    public void m24347g(View view) {
        this.f15331c.removeAllViews();
        this.f15331c.addView(view);
        View findViewById = this.f15331c.findViewById(C12333c.amu_text);
        this.f15332d = findViewById instanceof TextView ? (TextView) findViewById : null;
    }

    /* renamed from: h */
    public void m24346h(int i) {
        m24348f(m24353a(i));
        m24344j(this.f15329a, m24352b(i));
    }

    /* renamed from: i */
    public void m24345i(int i) {
        m24344j(this.f15329a, i);
    }

    /* renamed from: j */
    public void m24344j(Context context, int i) {
        TextView textView = this.f15332d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }
}
