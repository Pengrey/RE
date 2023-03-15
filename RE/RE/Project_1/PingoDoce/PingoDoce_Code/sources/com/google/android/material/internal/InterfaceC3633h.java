package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.InterfaceC3633h;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes.dex */
public interface InterfaceC3633h<T extends InterfaceC3633h<T>> extends Checkable {

    /* compiled from: MaterialCheckable.java */
    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3634a<C> {
        /* renamed from: a */
        void mo29538a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(InterfaceC3634a<T> interfaceC3634a);
}
