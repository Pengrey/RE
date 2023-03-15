package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0498l;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.customview.view.AbsSavedState;
import p070e.C4897a;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0498l implements Checkable {

    /* renamed from: B */
    private static final int[] f10085B = {16842912};

    /* renamed from: A */
    private boolean f10086A;

    /* renamed from: y */
    private boolean f10087y;

    /* renamed from: z */
    private boolean f10088z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3618a();

        /* renamed from: y */
        boolean f10089y;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        /* loaded from: classes.dex */
        class C3618a implements Parcelable.ClassLoaderCreator<SavedState> {
            C3618a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m29667b(Parcel parcel) {
            this.f10089y = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10089y ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m29667b(parcel);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes.dex */
    class C3619a extends C1078a {
        C3619a() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: f */
        public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo19281f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38565Y(CheckableImageButton.this.m29668a());
            c1085c.m38564Z(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4897a.imageButtonStyle);
    }

    /* renamed from: a */
    public boolean m29668a() {
        return this.f10088z;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f10087y;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f10087y) {
            int[] iArr = f10085B;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m37835a());
        setChecked(savedState.f10089y);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10089y = this.f10087y;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f10088z != z) {
            this.f10088z = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f10088z || this.f10087y == z) {
            return;
        }
        this.f10087y = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f10086A = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f10086A) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f10087y);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10088z = true;
        this.f10086A = true;
        C1112b0.m38405s0(this, new C3619a());
    }
}
