package vg;

import com.github.aachartmodel.aainfographics.C2336R;
import mg.AnalyticsManager;
import module.network.data.remote.models.response.ApiErrorResponse;
import module.network.data.remote.models.response.ErrorResponse;
import ng.AnalyticEvents;
import ng.InterfaceC7886d;
import p065df.CoreBaseService;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p425we.GenericApiException;
import ve.InvalidGrantException;
import ve.VersionControlException;

/* renamed from: vg.e */
/* loaded from: classes2.dex */
public class BaseService extends CoreBaseService {

    /* renamed from: c */
    protected AnalyticsManager f28894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseService(ResourcesProvider resourcesProvider) {
        super(resourcesProvider, null, 2, null);
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
    }

    /* renamed from: i */
    protected ApiBaseException m5558i(String str, String str2, int i, String str3) {
        Intrinsics.isThisObjectNull(str, "requestPath");
        Intrinsics.isThisObjectNull(str2, "responseMessage");
        Intrinsics.isThisObjectNull(str3, "errorBodyJson");
        try {
            InterfaceC7886d.C7887a.m17629a(m5557j(), new AnalyticEvents.C7708a(i, str2), null, null, null, 14, null);
            if (i == 401) {
                InterfaceC7886d.C7887a.m17629a(m5557j(), AnalyticEvents.AbstractC7743d.C7748e.f20374c, null, null, null, 14, null);
                return new InvalidGrantException(CoreBaseService.m26599f(this, null, 1, null));
            } else if (i != 410) {
                ApiErrorResponse apiErrorResponse = (ApiErrorResponse) m26598g().m27369c(ApiErrorResponse.class).m27476c(str3);
                Intrinsics.ifNullDoSomething(apiErrorResponse);
                ErrorResponse errorResponse = (ErrorResponse) apiErrorResponse.m18248a().get(0);
                String m18236a = errorResponse.m18236a();
                if (m18236a == null) {
                    m18236a = str2;
                }
                Integer m18234c = errorResponse.m18234c();
                return m5556k(m18236a, m18234c != null ? m18234c.intValue() : i);
            } else {
                return new VersionControlException(CoreBaseService.m26599f(this, null, 1, null));
            }
        } catch (Throwable unused) {
            return m5556k(str2, i);
        }
    }

    /* renamed from: j */
    protected final AnalyticsManager m5557j() {
        AnalyticsManager analyticsManager = this.f28894c;
        if (analyticsManager != null) {
            return analyticsManager;
        }
        Intrinsics.throwUninitPropException("analyticsManager");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public ApiBaseException m5556k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        return new GenericApiException(str.length() == 0 ? m26601d(C2336R.string.err_api_generic) : m26600e(str));
    }
}
