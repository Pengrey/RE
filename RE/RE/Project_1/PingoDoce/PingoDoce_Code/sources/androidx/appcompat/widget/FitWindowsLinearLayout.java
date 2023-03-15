package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.InterfaceC0464d0;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0464d0 {

    /* renamed from: w */
    private InterfaceC0464d0.InterfaceC0465a f1320w;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0464d0.InterfaceC0465a interfaceC0465a = this.f1320w;
        if (interfaceC0465a != null) {
            interfaceC0465a.mo40650a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0464d0
    public void setOnFitSystemWindowsListener(InterfaceC0464d0.InterfaceC0465a interfaceC0465a) {
        this.f1320w = interfaceC0465a;
    }
}
