package p363t5;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

/* renamed from: t5.a */
/* loaded from: classes.dex */
public abstract class AbstractC10381a extends ViewDataBinding {

    /* renamed from: A */
    public final TextInputLayout f26995A;

    /* renamed from: B */
    public final MaterialTextView f26996B;

    /* renamed from: x */
    public final MaterialButton f26997x;

    /* renamed from: y */
    public final RecyclerView f26998y;

    /* renamed from: z */
    public final TextInputEditText f26999z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10381a(Object obj, View view, int i, MaterialButton materialButton, RecyclerView recyclerView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.f26997x = materialButton;
        this.f26998y = recyclerView;
        this.f26999z = textInputEditText;
        this.f26995A = textInputLayout;
        this.f26996B = materialTextView;
    }
}
