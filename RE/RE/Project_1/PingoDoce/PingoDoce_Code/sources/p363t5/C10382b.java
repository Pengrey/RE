package p363t5;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p351s5.C10070f;

/* renamed from: t5.b */
/* loaded from: classes.dex */
public class C10382b extends AbstractC10381a {

    /* renamed from: E */
    private static final ViewDataBinding.C1263i f27000E = null;

    /* renamed from: F */
    private static final SparseIntArray f27001F;

    /* renamed from: C */
    private final FrameLayout f27002C;

    /* renamed from: D */
    private long f27003D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27001F = sparseIntArray;
        sparseIntArray.put(C10070f.f26337e, 1);
        sparseIntArray.put(C10070f.searchLayout, 2);
        sparseIntArray.put(C10070f.search, 3);
        sparseIntArray.put(C10070f.recyclerView, 4);
        sparseIntArray.put(C10070f.btnOk, 5);
    }

    public C10382b(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f27000E, f27001F));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        synchronized (this) {
            this.f27003D = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f27003D != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f27003D = 1L;
        }
        m37826E();
    }

    private C10382b(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialButton) objArr[5], (RecyclerView) objArr[4], (TextInputEditText) objArr[3], (TextInputLayout) objArr[2], (MaterialTextView) objArr[1]);
        this.f27003D = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f27002C = frameLayout;
        frameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
