package p426wg;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;

/* renamed from: wg.e */
/* loaded from: classes2.dex */
public abstract class AbstractC11736e extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialButton f30158A;

    /* renamed from: B */
    public final MaterialButton f30159B;

    /* renamed from: C */
    public final TextView f30160C;

    /* renamed from: D */
    public final AbstractC11728d8 f30161D;

    /* renamed from: E */
    public final AbstractC11762f8 f30162E;

    /* renamed from: F */
    protected BabyClubHomeViewModel f30163F;

    /* renamed from: x */
    public final RecyclerView f30164x;

    /* renamed from: y */
    public final ConstraintLayout f30165y;

    /* renamed from: z */
    public final AbstractC11917nf f30166z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11736e(Object obj, View view, int i, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout, AbstractC11917nf abstractC11917nf, MaterialButton materialButton, MaterialButton materialButton2, TextView textView2, AbstractC11728d8 abstractC11728d8, AbstractC11762f8 abstractC11762f8) {
        super(obj, view, i);
        this.f30164x = recyclerView;
        this.f30165y = constraintLayout;
        this.f30166z = abstractC11917nf;
        this.f30158A = materialButton;
        this.f30159B = materialButton2;
        this.f30160C = textView2;
        this.f30161D = abstractC11728d8;
        this.f30162E = abstractC11762f8;
    }
}
