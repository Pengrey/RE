package ie;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* renamed from: ie.a */
/* loaded from: classes2.dex */
public abstract class BindableAdapter<T, ViewBinding extends ViewDataBinding> extends RecyclerView.AbstractC1535g {

    /* renamed from: c */
    private List f16800c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final Object m22155D(int i) {
        try {
            if (!this.f16800c.isEmpty()) {
                return this.f16800c.get(i);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final List m22154E() {
        return this.f16800c;
    }

    /* renamed from: F */
    public Object m22153F(List list) {
        Intrinsics.isThisObjectNull(list, "list");
        this.f16800c = new ArrayList(list);
        m36542k();
        return C13195u.f34156a;
    }

    /* renamed from: f */
    public int mo29834f() {
        return this.f16800c.size();
    }
}
