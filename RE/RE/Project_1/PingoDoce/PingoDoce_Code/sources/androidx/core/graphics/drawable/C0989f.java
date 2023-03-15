package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.f */
/* loaded from: classes.dex */
public final class C0989f extends Drawable.ConstantState {

    /* renamed from: a */
    int f3285a;

    /* renamed from: b */
    Drawable.ConstantState f3286b;

    /* renamed from: c */
    ColorStateList f3287c;

    /* renamed from: d */
    PorterDuff.Mode f3288d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0989f(C0989f c0989f) {
        this.f3287c = null;
        this.f3288d = C0987d.f3277C;
        if (c0989f != null) {
            this.f3285a = c0989f.f3285a;
            this.f3286b = c0989f.f3286b;
            this.f3287c = c0989f.f3287c;
            this.f3288d = c0989f.f3288d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m38835a() {
        return this.f3286b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f3285a;
        Drawable.ConstantState constantState = this.f3286b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C0988e(this, resources);
        }
        return new C0987d(this, resources);
    }
}
