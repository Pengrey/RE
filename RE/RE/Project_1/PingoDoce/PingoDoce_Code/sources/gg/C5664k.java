package gg;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: gg.k */
/* loaded from: classes2.dex */
public final class C5664k extends ValueLocalDataProvider<Store> {

    /* renamed from: g */
    private final long f15918g = 1576800000;

    /* compiled from: DefaultStoreLocalDataProvider.kt */
    /* renamed from: gg.k$a */
    /* loaded from: classes2.dex */
    public static final class C5665a {
        private C5665a() {
        }

        public /* synthetic */ C5665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5665a(null);
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_STORE_DEFAULT";
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: u */
    protected long mo23351u() {
        return this.f15918g;
    }

    @Override // p142hg.ValueLocalDataProvider
    /* renamed from: w */
    protected Type mo23350w() {
        return Store.class;
    }
}
