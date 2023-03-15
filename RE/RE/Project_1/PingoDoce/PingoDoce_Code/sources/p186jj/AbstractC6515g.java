package p186jj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.google.android.gms.maps.model.LatLng;
import java.util.Comparator;
import java.util.List;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p443xa.C12336f;
import p489zc._Collections;
import pt.pingodoce.app.data.remote.models.response.Store;

/* compiled from: StoresViewModel.kt */
/* renamed from: jj.g */
/* loaded from: classes2.dex */
public abstract class AbstractC6515g extends ThemedStoreViewModel {

    /* renamed from: t */
    private LatLng f17647t;

    /* renamed from: u */
    private final C1436e0 f17648u;

    /* renamed from: v */
    private final LiveData f17649v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6515g(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C1436e0 c1436e0 = new C1436e0();
        this.f17648u = c1436e0;
        this.f17649v = c1436e0;
    }

    /* renamed from: W */
    public static /* synthetic */ int m20758W(LatLng latLng, Store store, Store store2) {
        return m20750e0(latLng, store, store2);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m20754a0(AbstractC6515g abstractC6515g, LatLng latLng, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchStores");
        }
        if ((i & 1) != 0) {
            latLng = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        abstractC6515g.m20755Z(latLng, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final int m20750e0(LatLng latLng, Store store, Store store2) {
        Intrinsics.isThisObjectNull(latLng, "$position");
        return Double.compare(C12336f.m3055b(new LatLng(store.m13712e().m14317a(), store.m13712e().m14316b()), latLng), C12336f.m3055b(new LatLng(store2.m13712e().m14317a(), store2.m13712e().m14316b()), latLng));
    }

    /* renamed from: N */
    protected void m20759N() {
        m20755Z(this.f17647t, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public final LatLng m20757X() {
        return this.f17647t;
    }

    /* renamed from: Y */
    public final LiveData m20756Y() {
        return this.f17649v;
    }

    /* renamed from: Z */
    public abstract void m20755Z(LatLng latLng, boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b0 */
    public final void m20753b0(LatLng latLng) {
        this.f17647t = latLng;
    }

    /* renamed from: c0 */
    public final void m20752c0(boolean z) {
        this.f17648u.mo166p(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public final List m20751d0(List list, final LatLng latLng) {
        List m461h0;
        Intrinsics.isThisObjectNull(list, "list");
        Intrinsics.isThisObjectNull(latLng, "position");
        m461h0 = _Collections.m461h0(list, new Comparator() { // from class: jj.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m20750e0;
                m20750e0 = AbstractC6515g.m20750e0(LatLng.this, (Store) obj, (Store) obj2);
                return m20750e0;
            }
        });
        return m461h0;
    }
}
