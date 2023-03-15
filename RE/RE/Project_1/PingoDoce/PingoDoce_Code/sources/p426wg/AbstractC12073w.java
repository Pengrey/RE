package p426wg;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import sh.ElectronicInvoiceStatusViewModel;

/* renamed from: wg.w */
/* loaded from: classes2.dex */
public abstract class AbstractC12073w extends ViewDataBinding {

    /* renamed from: A */
    protected ElectronicInvoiceStatusViewModel f31743A;

    /* renamed from: x */
    public final MaterialButton f31744x;

    /* renamed from: y */
    public final AbstractC11917nf f31745y;

    /* renamed from: z */
    public final RecyclerView f31746z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC12073w(Object obj, View view, int i, MaterialButton materialButton, AbstractC11917nf abstractC11917nf, RecyclerView recyclerView) {
        super(obj, view, i);
        this.f31744x = materialButton;
        this.f31745y = abstractC11917nf;
        this.f31746z = recyclerView;
    }
}
