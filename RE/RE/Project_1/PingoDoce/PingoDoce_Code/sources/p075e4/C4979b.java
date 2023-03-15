package p075e4;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: e4.b */
/* loaded from: classes.dex */
public class C4979b implements InterfaceC4983f {
    @Override // p075e4.InterfaceC4983f
    /* renamed from: a */
    public InterfaceC4981d mo25979a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C4978a(httpURLConnection);
    }
}
