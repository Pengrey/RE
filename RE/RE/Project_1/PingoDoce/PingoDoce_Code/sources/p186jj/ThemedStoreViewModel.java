package p186jj;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import ki.NoConnectionViewModel;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: jj.h */
/* loaded from: classes2.dex */
public abstract class ThemedStoreViewModel extends NoConnectionViewModel {

    /* renamed from: p */
    private final C1436e0 f17650p;

    /* renamed from: q */
    private final C1436e0 f17651q;

    /* renamed from: r */
    private final LiveData f17652r;

    /* renamed from: s */
    private final LiveData f17653s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemedStoreViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        C1436e0 c1436e0 = new C1436e0();
        this.f17650p = c1436e0;
        String string = resourcesProvider.m6899a().getString(C2336R.string.btn_favorite_store);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        C1436e0 c1436e02 = new C1436e0(string);
        this.f17651q = c1436e02;
        this.f17652r = c1436e0;
        this.f17653s = c1436e02;
    }

    /* renamed from: R */
    public final LiveData m20749R() {
        return this.f17653s;
    }

    /* renamed from: S */
    public final int m20748S(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        return store.m13701v() ? 2131951669 : 2131951668;
    }

    /* renamed from: T */
    public final LiveData m20747T() {
        return this.f17652r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final C1436e0 m20746U() {
        return this.f17651q;
    }

    /* renamed from: V */
    public final void m20745V(Store store) {
        Intrinsics.isThisObjectNull(store, "store");
        this.f17650p.mo166p(Integer.valueOf(m20748S(store)));
    }
}
