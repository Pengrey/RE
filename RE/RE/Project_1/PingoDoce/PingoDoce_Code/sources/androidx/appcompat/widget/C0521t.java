package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p070e.C4897a;

/* renamed from: androidx.appcompat.widget.t */
/* loaded from: classes.dex */
public class C0521t extends SeekBar {

    /* renamed from: w */
    private final C0525u f1733w;

    public C0521t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1733w.m40414h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1733w.m40413i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1733w.m40415g(canvas);
    }

    public C0521t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0508n0.m40495a(this, getContext());
        C0525u c0525u = new C0525u(this);
        this.f1733w = c0525u;
        c0525u.mo40417c(attributeSet, i);
    }
}
