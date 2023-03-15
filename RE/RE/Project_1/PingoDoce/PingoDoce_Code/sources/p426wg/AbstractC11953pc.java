package p426wg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import kg.FriendImage;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;

/* renamed from: wg.pc */
/* loaded from: classes2.dex */
public abstract class AbstractC11953pc extends ViewDataBinding {

    /* renamed from: A */
    public final TextView f31219A;

    /* renamed from: B */
    protected Friend f31220B;

    /* renamed from: C */
    protected FriendImage f31221C;

    /* renamed from: x */
    public final AbstractC11993rc f31222x;

    /* renamed from: y */
    public final TextView f31223y;

    /* renamed from: z */
    public final SwitchMaterial f31224z;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11953pc(Object obj, View view, int i, AbstractC11993rc abstractC11993rc, TextView textView, SwitchMaterial switchMaterial, TextView textView2) {
        super(obj, view, i);
        this.f31222x = abstractC11993rc;
        this.f31223y = textView;
        this.f31224z = switchMaterial;
        this.f31219A = textView2;
    }

    /* renamed from: Q */
    public static AbstractC11953pc m3898Q(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return m3897R(layoutInflater, viewGroup, z, C1275f.m37765d());
    }

    @Deprecated
    /* renamed from: R */
    public static AbstractC11953pc m3897R(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AbstractC11953pc) ViewDataBinding.m37800v(layoutInflater, C2336R.layout.view_row_for_friend, viewGroup, z, obj);
    }

    /* renamed from: S */
    public abstract void mo3841S(Friend friend);

    /* renamed from: T */
    public abstract void mo3840T(FriendImage friendImage);
}
