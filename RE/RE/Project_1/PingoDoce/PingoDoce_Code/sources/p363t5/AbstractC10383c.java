package p363t5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.guilhe.recyclerpickerdialog.EnumC2361b;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.textview.MaterialTextView;
import p351s5.C10071g;
import p351s5.RecyclerPickerDialogFragment;

/* renamed from: t5.c */
/* loaded from: classes.dex */
public abstract class AbstractC10383c extends ViewDataBinding {

    /* renamed from: A */
    public final MaterialTextView f27004A;

    /* renamed from: B */
    protected RecyclerPickerDialogFragment f27005B;

    /* renamed from: C */
    protected EnumC2361b f27006C;

    /* renamed from: D */
    protected Float f27007D;

    /* renamed from: x */
    public final MaterialCheckBox f27008x;

    /* renamed from: y */
    public final MaterialRadioButton f27009y;

    /* renamed from: z */
    public final SwitchMaterial f27010z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10383c(Object obj, View view, int i, MaterialCheckBox materialCheckBox, MaterialRadioButton materialRadioButton, SwitchMaterial switchMaterial, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.f27008x = materialCheckBox;
        this.f27009y = materialRadioButton;
        this.f27010z = switchMaterial;
        this.f27004A = materialTextView;
    }

    /* renamed from: Q */
    public static AbstractC10383c m8084Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m8083R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC10383c m8083R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC10383c) ViewDataBinding.m37800v(layoutInflater, C10071g.view_row_for_item, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo8082S(Float f);

    /* renamed from: T */
    public abstract void mo8081T(RecyclerPickerDialogFragment recyclerPickerDialogFragment);

    /* renamed from: U */
    public abstract void mo8080U(EnumC2361b enumC2361b);
}
