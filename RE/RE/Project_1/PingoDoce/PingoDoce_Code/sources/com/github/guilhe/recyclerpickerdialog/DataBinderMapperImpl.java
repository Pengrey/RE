package com.github.guilhe.recyclerpickerdialog;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1273d;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import p351s5.C10071g;
import p363t5.C10382b;
import p363t5.C10384d;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC1273d {

    /* renamed from: a */
    private static final SparseIntArray f6856a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        f6856a = sparseIntArray;
        sparseIntArray.put(C10071g.fragment_recycler_picker_dialog, 1);
        sparseIntArray.put(C10071g.view_row_for_item, 2);
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: a */
    public List<AbstractC1273d> mo14800a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: b */
    public ViewDataBinding mo14799b(InterfaceC1274e interfaceC1274e, View view, int i) {
        int i2 = f6856a.get(i);
        if (i2 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                if (i2 == 1) {
                    if ("layout/fragment_recycler_picker_dialog_0".equals(tag)) {
                        return new C10382b(interfaceC1274e, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_recycler_picker_dialog is invalid. Received: " + tag);
                } else if (i2 != 2) {
                    return null;
                } else {
                    if ("layout/view_row_for_item_0".equals(tag)) {
                        return new C10384d(interfaceC1274e, view);
                    }
                    throw new IllegalArgumentException("The tag for view_row_for_item is invalid. Received: " + tag);
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: c */
    public ViewDataBinding mo14798c(InterfaceC1274e interfaceC1274e, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f6856a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
