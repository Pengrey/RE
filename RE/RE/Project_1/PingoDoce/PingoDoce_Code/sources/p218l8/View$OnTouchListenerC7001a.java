package p218l8;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: l8.a */
/* loaded from: classes.dex */
public class View$OnTouchListenerC7001a implements View.OnTouchListener {

    /* renamed from: w */
    private final Dialog f18609w;

    /* renamed from: x */
    private final int f18610x;

    /* renamed from: y */
    private final int f18611y;

    /* renamed from: z */
    private final int f18612z;

    public View$OnTouchListenerC7001a(Dialog dialog, Rect rect) {
        this.f18609w = dialog;
        this.f18610x = rect.left;
        this.f18611y = rect.top;
        this.f18612z = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f18610x + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f18611y + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f18612z;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f18609w.onTouchEvent(obtain);
    }
}
