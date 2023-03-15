package p068di;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.AbstractC1423a;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import jm.C6537a;
import ke.ViewModelFactoryByInjection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC12062v4;
import p494zh.BaseActivity;
import pe.C8618e;

/* renamed from: di.a */
/* loaded from: classes2.dex */
public abstract class WebViewActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f13281f0;

    /* compiled from: WebViewActivity.kt */
    /* renamed from: di.a$a */
    /* loaded from: classes2.dex */
    public static final class C4858a {
        private C4858a() {
        }

        public /* synthetic */ C4858a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: WebViewActivity.kt */
    /* renamed from: di.a$b */
    /* loaded from: classes2.dex */
    static final class C4859b extends AbstractC6438m implements InterfaceC6097a {
        C4859b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(WebViewActivity.this.m26447j1(), WebViewActivity.this, null, 2, null);
        }
    }

    /* compiled from: WebViewActivity.kt */
    /* renamed from: di.a$c */
    /* loaded from: classes2.dex */
    public static final class C4860c extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ WebViewModel f13283a;

        C4860c(WebViewModel webViewModel) {
            this.f13283a = webViewModel;
        }

        public void onProgressChanged(WebView webView, int i) {
            Intrinsics.isThisObjectNull(webView, "view");
            C6537a.m20675d("WebActivity onProgressChanged = %s", Integer.valueOf(i));
            this.f13283a.m26436L(i < 100);
        }
    }

    /* compiled from: WebViewActivity.kt */
    /* renamed from: di.a$d */
    /* loaded from: classes2.dex */
    public static final class C4861d extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ WebViewModel f13284a;

        /* renamed from: b */
        final /* synthetic */ WebViewActivity f13285b;

        C4861d(WebViewModel webViewModel, WebViewActivity webViewActivity) {
            this.f13284a = webViewModel;
            this.f13285b = webViewActivity;
        }

        public void onPageFinished(WebView webView, String str) {
            Intrinsics.isThisObjectNull(webView, "view");
            Intrinsics.isThisObjectNull(str, "url");
            super.onPageFinished(webView, str);
            C6537a.m20675d("WebActivity finished url = %s", str);
            WebViewActivity.m26448i1(this.f13285b);
            this.f13284a.m26436L(false);
            this.f13285b.m26441o1(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Intrinsics.isThisObjectNull(webView, "view");
            Intrinsics.isThisObjectNull(str, "url");
            super.onPageStarted(webView, str, bitmap);
            C6537a.m20675d("WebActivity started url = %s", str);
            this.f13284a.m26436L(true);
            this.f13285b.m26440p1(str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            Intrinsics.isThisObjectNull(webView, "view");
            Intrinsics.isThisObjectNull(webResourceRequest, "request");
            Intrinsics.isThisObjectNull(webResourceError, "error");
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.f13285b.m26442n1(webResourceError.getDescription().toString());
            WebViewActivity.m26448i1(this.f13285b);
            C6537a.m20675d("WebActivity error = %s", webResourceError.getDescription());
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Uri uri;
            String url;
            Intrinsics.isThisObjectNull(sslErrorHandler, "handler");
            if (sslError == null || (url = sslError.getUrl()) == null) {
                uri = null;
            } else {
                uri = Uri.parse(url);
                Intrinsics.checkIfNull(uri, "parse(this)");
            }
            this.f13285b.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
    }

    static {
        new C4858a(null);
    }

    /* renamed from: i1 */
    public static final /* synthetic */ void m26448i1(WebViewActivity webViewActivity) {
        webViewActivity.m26439q1();
    }

    /* renamed from: q1 */
    private final void m26439q1() {
        m22742r0(((AbstractC12062v4) m22738w0()).f31718x.canGoBack() ? C2336R.C2337drawable.ic_arrow_back : mo11827D0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo11827D0() {
        return C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m26452J0() {
        return C6450z.m20906b(WebViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m26451K0() {
        return new C4859b();
    }

    /* renamed from: M0 */
    protected boolean m26450M0() {
        return true;
    }

    /* renamed from: j1 */
    public final ViewModelFactoryByInjection m26447j1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f13281f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* renamed from: k1 */
    protected String m26446k1() {
        String stringExtra = getIntent().getStringExtra("EXTRA_FOR_TITLE");
        if (stringExtra == null) {
            stringExtra = m22737y0().getTitle().toString();
        }
        Intrinsics.checkIfNull(stringExtra, "intent.getStringExtra(EX…oolbar().title.toString()");
        return stringExtra;
    }

    /* renamed from: l1 */
    protected String m26445l1() {
        String stringExtra = getIntent().getStringExtra("EXTRA_FOR_URL");
        return stringExtra == null ? BuildConfig.VERSION_NAME : stringExtra;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: m1 */
    public void m26449P0(AbstractC12062v4 abstractC12062v4, WebViewModel webViewModel) {
        Intrinsics.isThisObjectNull(abstractC12062v4, "binding");
        Intrinsics.isThisObjectNull(webViewModel, "viewModel");
        m22740t0(m26446k1());
        abstractC12062v4.f31718x.getSettings().setJavaScriptEnabled(true);
        abstractC12062v4.f31718x.setWebChromeClient(new C4860c(webViewModel));
        abstractC12062v4.f31718x.setWebViewClient(new C4861d(webViewModel, this));
        if (m26445l1().length() > 0) {
            abstractC12062v4.f31718x.loadUrl(m26445l1());
        }
    }

    /* renamed from: n */
    public boolean m26443n() {
        return false;
    }

    /* renamed from: n1 */
    protected void m26442n1(String str) {
        Intrinsics.isThisObjectNull(str, "error");
    }

    /* renamed from: o1 */
    protected void m26441o1(String str) {
        Intrinsics.isThisObjectNull(str, "url");
    }

    public void onBackPressed() {
        if (((AbstractC12062v4) m22738w0()).f31718x.canGoBack()) {
            ((AbstractC12062v4) m22738w0()).f31718x.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: p1 */
    protected void m26440p1(String str) {
        Intrinsics.isThisObjectNull(str, "url");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v0 */
    public AbstractC9725a mo42216v0() {
        return new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_webview;
    }
}
