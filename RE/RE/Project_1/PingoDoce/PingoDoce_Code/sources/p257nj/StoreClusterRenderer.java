package p257nj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.gms.maps.model.MarkerOptions;
import p012ab.C0099b;
import p103fb.C5443b;
import p103fb.C5444c;
import p181jd.Intrinsics;
import p418w7.C11581c;
import p463y7.C13128a;
import p463y7.C13129b;
import p466ya.C13144c;
import p466ya.InterfaceC13142a;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: nj.a */
/* loaded from: classes2.dex */
public final class StoreClusterRenderer extends C0099b {

    /* renamed from: x */
    private final C5443b f20539x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreClusterRenderer(Context context, C11581c c11581c, C13144c c13144c, int i, int i2, int i3) {
        super(context, c11581c, c13144c);
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(c11581c, "map");
        Intrinsics.isThisObjectNull(c13144c, "clusterManager");
        C5443b c5443b = new C5443b(context);
        c5443b.m24347g(m17600L(context));
        c5443b.m24345i(i);
        c5443b.m24349e(m17597T(i2, i3));
        this.f20539x = c5443b;
    }

    /* renamed from: L */
    private final C5444c m17600L(Context context) {
        C5444c c5444c = new C5444c(context);
        c5444c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c5444c.setId(C2336R.C2338id.amu_text);
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 12.0f);
        c5444c.setPadding(i, i, i, i);
        return c5444c;
    }

    /* renamed from: T */
    private final LayerDrawable m17597T(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable2.getPaint().setColor(i2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
        int i3 = (int) (Resources.getSystem().getDisplayMetrics().density * 3.0f);
        layerDrawable.setLayerInset(1, i3, i3, i3, i3);
        return layerDrawable;
    }

    /* renamed from: I */
    protected C13128a mo41949I(InterfaceC13142a interfaceC13142a) {
        Intrinsics.isThisObjectNull(interfaceC13142a, "cluster");
        C13128a m1564a = C13129b.m1564a(this.f20539x.m24350d(interfaceC13142a.mo524a() > 99 ? "99+" : String.valueOf(interfaceC13142a.mo524a())));
        Intrinsics.checkIfNull(m1564a, "fromBitmap(clusterIconGe…cluster.size.toString()))");
        return m1564a;
    }

    /* renamed from: S */
    protected boolean mo41939S(InterfaceC13142a interfaceC13142a) {
        Intrinsics.isThisObjectNull(interfaceC13142a, "cluster");
        return interfaceC13142a.mo524a() > 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public void mo41945M(Store store, MarkerOptions markerOptions) {
        Intrinsics.isThisObjectNull(store, "item");
        Intrinsics.isThisObjectNull(markerOptions, "markerOptions");
        markerOptions.m31544J(C13129b.m1563b(C2336R.C2337drawable.ic_marker_off));
        super.mo41945M(store, markerOptions);
    }
}
