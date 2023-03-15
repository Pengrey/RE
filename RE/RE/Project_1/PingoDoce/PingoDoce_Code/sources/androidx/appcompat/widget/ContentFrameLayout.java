package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C1112b0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: A */
    private TypedValue f1311A;

    /* renamed from: B */
    private TypedValue f1312B;

    /* renamed from: C */
    private final Rect f1313C;

    /* renamed from: D */
    private InterfaceC0424a f1314D;

    /* renamed from: w */
    private TypedValue f1315w;

    /* renamed from: x */
    private TypedValue f1316x;

    /* renamed from: y */
    private TypedValue f1317y;

    /* renamed from: z */
    private TypedValue f1318z;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0424a {
        /* renamed from: a */
        void mo40826a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m40828a(Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: b */
    public void m40827b(int i, int i2, int i3, int i4) {
        this.f1313C.set(i, i2, i3, i4);
        if (C1112b0.m38446W(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1311A == null) {
            this.f1311A = new TypedValue();
        }
        return this.f1311A;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1312B == null) {
            this.f1312B = new TypedValue();
        }
        return this.f1312B;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1317y == null) {
            this.f1317y = new TypedValue();
        }
        return this.f1317y;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1318z == null) {
            this.f1318z = new TypedValue();
        }
        return this.f1318z;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1315w == null) {
            this.f1315w = new TypedValue();
        }
        return this.f1315w;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1316x == null) {
            this.f1316x = new TypedValue();
        }
        return this.f1316x;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0424a interfaceC0424a = this.f1314D;
        if (interfaceC0424a != null) {
            interfaceC0424a.mo40826a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0424a interfaceC0424a = this.f1314D;
        if (interfaceC0424a != null) {
            interfaceC0424a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0424a interfaceC0424a) {
        this.f1314D = interfaceC0424a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1313C = new Rect();
    }
}
