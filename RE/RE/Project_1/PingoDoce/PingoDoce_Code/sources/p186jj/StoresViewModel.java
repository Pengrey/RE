package p186jj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p181jd.Intrinsics;
import p468yc.C13182l;

/* renamed from: jj.d */
/* loaded from: classes2.dex */
public final class StoresViewModel {

    /* renamed from: a */
    public static final StoresViewModel f17642a = new StoresViewModel();

    /* renamed from: b */
    private static final C1436e0 f17643b;

    /* renamed from: c */
    private static final LiveData f17644c;

    static {
        C1436e0 c1436e0 = new C1436e0();
        f17643b = c1436e0;
        f17644c = c1436e0;
    }

    private StoresViewModel() {
    }

    /* renamed from: a */
    public final LiveData m20762a() {
        return f17644c;
    }

    /* renamed from: b */
    public final void m20761b(List list, LatLng latLng) {
        Intrinsics.isThisObjectNull(list, "list");
        f17643b.mo169m(new C13182l(list, latLng));
    }
}
