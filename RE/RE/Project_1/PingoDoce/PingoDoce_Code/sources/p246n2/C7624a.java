package p246n2;

import android.widget.CompoundButton;
import androidx.databinding.InterfaceC1276g;

/* renamed from: n2.a */
/* loaded from: classes.dex */
public class C7624a {

    /* compiled from: CompoundButtonBindingAdapter.java */
    /* renamed from: n2.a$a */
    /* loaded from: classes.dex */
    class C7625a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ CompoundButton.OnCheckedChangeListener f20187a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC1276g f20188b;

        C7625a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InterfaceC1276g interfaceC1276g) {
            this.f20187a = onCheckedChangeListener;
            this.f20188b = interfaceC1276g;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f20187a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
            this.f20188b.mo3578c();
        }
    }

    /* renamed from: a */
    public static void m17897a(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    /* renamed from: b */
    public static void m17896b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InterfaceC1276g interfaceC1276g) {
        if (interfaceC1276g == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new C7625a(onCheckedChangeListener, interfaceC1276g));
        }
    }
}
