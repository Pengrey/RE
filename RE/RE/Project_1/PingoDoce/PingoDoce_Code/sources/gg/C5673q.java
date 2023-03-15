package gg;

import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.HashMapLocalDataProvider;
import pt.pingodoce.app.data.remote.models.request.parameters.RecommendationsParameters;
import pt.pingodoce.app.data.remote.models.response.CatalogResponse;

/* renamed from: gg.q */
/* loaded from: classes2.dex */
public final class C5673q extends HashMapLocalDataProvider<RecommendationsParameters, CatalogResponse> {

    /* compiled from: RecommendationsCatalogLocalDataProvider.kt */
    /* renamed from: gg.q$a */
    /* loaded from: classes2.dex */
    public static final class C5674a {
        private C5674a() {
        }

        public /* synthetic */ C5674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5674a(null);
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
