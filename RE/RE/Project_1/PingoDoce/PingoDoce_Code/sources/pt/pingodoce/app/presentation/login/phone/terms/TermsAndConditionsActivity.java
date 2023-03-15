package pt.pingodoce.app.presentation.login.phone.terms;

import android.os.Bundle;
import com.github.aachartmodel.aainfographics.C2336R;
import p068di.WebViewActivity;
import p315qe.AbstractC9725a;
import pe.C8617d;

/* compiled from: TermsAndConditionsActivity.kt */
/* loaded from: classes2.dex */
public final class TermsAndConditionsActivity extends WebViewActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p068di.WebViewActivity, p494zh.BaseActivity, p140he.CoreBaseActivity
    /* renamed from: D0 */
    public int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && !extras.getBoolean("EXTRA_FOR_TRANSITION")) {
            z = true;
        }
        return z ? C2336R.C2337drawable.ic_arrow_back : super.mo11827D0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p068di.WebViewActivity, p140he.CoreBaseActivity
    /* renamed from: v0 */
    public AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && !extras.getBoolean("EXTRA_FOR_TRANSITION")) {
            z = true;
        }
        return z ? new C8617d() : super.mo42216v0();
    }
}
