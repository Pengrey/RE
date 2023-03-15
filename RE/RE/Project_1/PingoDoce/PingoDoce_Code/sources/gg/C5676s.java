package gg;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import pt.pingodoce.app.data.remote.models.request.parameters.SearchCatalogParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;

/* renamed from: gg.s */
/* loaded from: classes2.dex */
public final class C5676s extends HashMapLocalDataProvider<SearchCatalogParameters, CatalogResponse> {

    /* compiled from: SearchCatalogLocalDataProvider.kt */
    /* renamed from: gg.s$a */
    /* loaded from: classes2.dex */
    public static final class C5677a {
        private C5677a() {
        }

        public /* synthetic */ C5677a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5677a(null);
    }

    @Override // p142hg.HashMapLocalDataProvider
    /* renamed from: f */
    public String mo23360f() {
        return "KEY_FOR_CATALOG_RESPONSES";
    }

    @Override // p142hg.HashMapLocalDataProvider
    /* renamed from: l */
    protected Type mo23359l() {
        return CatalogResponse.class;
    }
}
