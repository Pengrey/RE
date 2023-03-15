package module.common;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.AbstractC1273d;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends AbstractC1273d {

    /* renamed from: a */
    private static final SparseIntArray f19920a = new SparseIntArray(0);

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
        if (f19920a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.AbstractC1273d
    /* renamed from: c */
    public ViewDataBinding mo14798c(InterfaceC1274e interfaceC1274e, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f19920a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
