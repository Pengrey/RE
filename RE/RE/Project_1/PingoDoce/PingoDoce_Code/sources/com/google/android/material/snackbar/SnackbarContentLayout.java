package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import p100f8.C5419b;
import p100f8.C5423f;
import p198k8.C6608a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC3715a {

    /* renamed from: w */
    private TextView f10468w;

    /* renamed from: x */
    private Button f10469x;

    /* renamed from: y */
    private int f10470y;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private static void m29233d(View view, int i, int i2) {
        if (C1112b0.m38444Y(view)) {
            C1112b0.m38473F0(view, C1112b0.m38466J(view), i, C1112b0.m38468I(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: e */
    private boolean m29232e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f10468w.getPaddingTop() == i2 && this.f10468w.getPaddingBottom() == i3) {
            return z;
        }
        m29233d(this.f10468w, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC3715a
    /* renamed from: a */
    public void mo29231a(int i, int i2) {
        this.f10468w.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f10468w.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f10469x.getVisibility() == 0) {
            this.f10469x.setAlpha(0.0f);
            this.f10469x.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC3715a
    /* renamed from: b */
    public void mo29230b(int i, int i2) {
        this.f10468w.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f10468w.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f10469x.getVisibility() == 0) {
            this.f10469x.setAlpha(1.0f);
            this.f10469x.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m29234c(float f) {
        if (f != 1.0f) {
            this.f10469x.setTextColor(C6608a.m20500h(C6608a.m20504d(this, C5419b.colorSurface), this.f10469x.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.f10469x;
    }

    public TextView getMessageView() {
        return this.f10468w;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f10468w = (TextView) findViewById(C5423f.snackbar_text);
        this.f10469x = (Button) findViewById(C5423f.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (m29232e(1, r0, r0 - r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (m29232e(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = p100f8.C5421d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = p100f8.C5421d.design_snackbar_padding_vertical
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f10468w
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L48
            int r5 = r7.f10470y
            if (r5 <= 0) goto L48
            android.widget.Button r5 = r7.f10469x
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f10470y
            if (r5 <= r6) goto L48
            int r2 = r0 - r2
            boolean r0 = r7.m29232e(r1, r0, r2)
            if (r0 == 0) goto L53
            goto L54
        L48:
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            boolean r0 = r7.m29232e(r4, r0, r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            super.onMeasure(r8, r9)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f10470y = i;
    }
}
