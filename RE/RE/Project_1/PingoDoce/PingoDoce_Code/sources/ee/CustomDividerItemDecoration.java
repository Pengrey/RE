package ee;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: ee.a */
/* loaded from: classes2.dex */
public final class CustomDividerItemDecoration extends RecyclerView.AbstractC1545n {

    /* renamed from: f */
    private static final int[] f13960f;

    /* renamed from: a */
    private Drawable f13961a;

    /* renamed from: b */
    private int f13962b;

    /* renamed from: c */
    private int f13963c;

    /* renamed from: d */
    private int f13964d;

    /* renamed from: e */
    private int f13965e;

    /* compiled from: CustomDividerItemDecoration.kt */
    /* renamed from: ee.a$a */
    /* loaded from: classes2.dex */
    public static final class C5032a {
        private C5032a() {
        }

        public /* synthetic */ C5032a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5032a(null);
        f13960f = new int[]{16843284};
    }

    public CustomDividerItemDecoration(Context context, int i, int i2, int i3, int i4) {
        Intrinsics.isThisObjectNull(context, "context");
        this.f13962b = m25864l(i);
        this.f13963c = m25864l(i2);
        this.f13964d = m25864l(i3);
        this.f13965e = m25864l(i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f13960f);
        Intrinsics.checkIfNull(obtainStyledAttributes, "context.obtainStyledAttributes(ATTRS)");
        this.f13961a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: g */
    public void mo35984g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        Intrinsics.isThisObjectNull(rect, "outRect");
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(recyclerView, "parent");
        Intrinsics.isThisObjectNull(c1564z, "state");
        super.mo35984g(rect, view, recyclerView, c1564z);
        if (recyclerView.m36662f0(view) == 0) {
            return;
        }
        Drawable drawable = this.f13961a;
        rect.top = drawable != null ? drawable.getIntrinsicHeight() : 0;
    }

    /* renamed from: i */
    public void mo29915i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
        Intrinsics.isThisObjectNull(canvas, "c");
        Intrinsics.isThisObjectNull(recyclerView, "parent");
        Intrinsics.isThisObjectNull(c1564z, "state");
        int paddingLeft = recyclerView.getPaddingLeft() + this.f13962b;
        int width = recyclerView.getWidth() - (recyclerView.getPaddingRight() + this.f13963c);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            Intrinsics.checkIfNull(childAt, "parent.getChildAt(i)");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1551p) layoutParams)).bottomMargin + this.f13964d;
            Drawable drawable = this.f13961a;
            int intrinsicHeight = (drawable != null ? drawable.getIntrinsicHeight() : 0) + bottom + this.f13965e;
            Drawable drawable2 = this.f13961a;
            if (drawable2 != null) {
                drawable2.setBounds(paddingLeft, bottom, width, intrinsicHeight);
            }
            Drawable drawable3 = this.f13961a;
            if (drawable3 != null) {
                drawable3.draw(canvas);
            }
        }
    }

    /* renamed from: l */
    public final int m25864l(int i) {
        return (int) Math.ceil(i * Resources.getSystem().getDisplayMetrics().density);
    }

    public /* synthetic */ CustomDividerItemDecoration(Context context, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
