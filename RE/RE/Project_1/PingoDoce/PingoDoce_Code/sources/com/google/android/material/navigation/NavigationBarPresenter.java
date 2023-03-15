package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.view.menu.C0382g;
import androidx.appcompat.view.menu.InterfaceC0387j;
import androidx.appcompat.view.menu.SubMenuC0394m;
import com.google.android.material.badge.C3471b;
import com.google.android.material.internal.ParcelableSparseArray;

/* loaded from: classes.dex */
public class NavigationBarPresenter implements InterfaceC0387j {

    /* renamed from: w */
    private C0378e f10239w;

    /* renamed from: x */
    private AbstractC3668c f10240x;

    /* renamed from: y */
    private boolean f10241y = false;

    /* renamed from: z */
    private int f10242z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3656a();

        /* renamed from: w */
        int f10243w;

        /* renamed from: x */
        ParcelableSparseArray f10244x;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$a */
        /* loaded from: classes.dex */
        class C3656a implements Parcelable.Creator<SavedState> {
            C3656a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f10243w);
            parcel.writeParcelable(this.f10244x, 0);
        }

        SavedState(Parcel parcel) {
            this.f10243w = parcel.readInt();
            this.f10244x = (ParcelableSparseArray) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    /* renamed from: a */
    public void m29481a(int i) {
        this.f10242z = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: b */
    public void mo29480b(C0378e c0378e, boolean z) {
    }

    /* renamed from: c */
    public void m29479c(AbstractC3668c abstractC3668c) {
        this.f10240x = abstractC3668c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: d */
    public void mo29478d(Context context, C0378e c0378e) {
        this.f10239w = c0378e;
        this.f10240x.mo29426b(c0378e);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: e */
    public void mo29477e(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f10240x.m29414n(savedState.f10243w);
            this.f10240x.m29415m(C3471b.m30506b(this.f10240x.getContext(), savedState.f10244x));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: f */
    public boolean mo29476f(SubMenuC0394m subMenuC0394m) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: g */
    public void mo29475g(boolean z) {
        if (this.f10241y) {
            return;
        }
        if (z) {
            this.f10240x.m29424d();
        } else {
            this.f10240x.m29413o();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    public int getId() {
        return this.f10242z;
    }

    /* renamed from: h */
    public void m29474h(boolean z) {
        this.f10241y = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: i */
    public boolean mo29473i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: j */
    public Parcelable mo29472j() {
        SavedState savedState = new SavedState();
        savedState.f10243w = this.f10240x.getSelectedItemId();
        savedState.f10244x = C3471b.m30505c(this.f10240x.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: k */
    public boolean mo29471k(C0378e c0378e, C0382g c0382g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j
    /* renamed from: l */
    public boolean mo29470l(C0378e c0378e, C0382g c0382g) {
        return false;
    }
}
