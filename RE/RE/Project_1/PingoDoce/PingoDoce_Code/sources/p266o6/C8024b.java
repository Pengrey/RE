package p266o6;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* renamed from: o6.b */
/* loaded from: classes.dex */
final class C8024b extends Thread {

    /* renamed from: w */
    final /* synthetic */ Map f20765w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8024b(C8022a c8022a, Map map) {
        this.f20765w = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Map map = this.f20765w;
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, (String) map.get(str));
        }
        C8026d.m17128a(buildUpon.build().toString());
    }
}
