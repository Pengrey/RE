package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.checkbox.MaterialCheckBox;
import pt.pingodoce.app.presentation.common.search.models.Brand;

/* renamed from: wg.jc */
/* loaded from: classes2.dex */
public abstract class AbstractC11838jc extends ViewDataBinding {

    /* renamed from: A */
    protected Brand f30692A;

    /* renamed from: x */
    public final MaterialCheckBox f30693x;

    /* renamed from: y */
    public final ImageView f30694y;

    /* renamed from: z */
    public final ConstraintLayout f30695z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11838jc(Object obj, View view, int i, MaterialCheckBox materialCheckBox, ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.f30693x = materialCheckBox;
        this.f30694y = imageView;
        this.f30695z = constraintLayout;
    }

    /* renamed from: Q */
    public static AbstractC11838jc m4139Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m4138R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11838jc m4138R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11838jc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_brands_filter_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo4077S(Brand brand);
}
