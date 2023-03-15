package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.C1076h;
import java.util.List;

/* renamed from: androidx.core.provider.e */
/* loaded from: classes.dex */
public final class C1031e {

    /* renamed from: a */
    private final String f3328a;

    /* renamed from: b */
    private final String f3329b;

    /* renamed from: c */
    private final String f3330c;

    /* renamed from: d */
    private final List<List<byte[]>> f3331d;

    /* renamed from: e */
    private final int f3332e = 0;

    /* renamed from: f */
    private final String f3333f;

    public C1031e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3328a = (String) C1076h.m38619f(str);
        this.f3329b = (String) C1076h.m38619f(str2);
        this.f3330c = (String) C1076h.m38619f(str3);
        this.f3331d = (List) C1076h.m38619f(list);
        this.f3333f = m38721a(str, str2, str3);
    }

    /* renamed from: a */
    private String m38721a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> m38720b() {
        return this.f3331d;
    }

    /* renamed from: c */
    public int m38719c() {
        return this.f3332e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public String m38718d() {
        return this.f3333f;
    }

    /* renamed from: e */
    public String m38717e() {
        return this.f3328a;
    }

    /* renamed from: f */
    public String m38716f() {
        return this.f3329b;
    }

    /* renamed from: g */
    public String m38715g() {
        return this.f3330c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3328a + ", mProviderPackage: " + this.f3329b + ", mQuery: " + this.f3330c + ", mCertificates:");
        for (int i = 0; i < this.f3331d.size(); i++) {
            sb2.append(" [");
            List<byte[]> list = this.f3331d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3332e);
        return sb2.toString();
    }
}
