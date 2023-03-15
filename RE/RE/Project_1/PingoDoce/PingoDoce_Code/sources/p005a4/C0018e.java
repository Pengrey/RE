package p005a4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: a4.e */
/* loaded from: classes.dex */
public class C0018e {

    /* renamed from: c */
    public static final C0018e f75c = new C0018e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f76a;

    /* renamed from: b */
    private InterfaceC0019f f77b;

    public C0018e(String... strArr) {
        this.f76a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m42118b() {
        List<String> list = this.f76a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m42114f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C0018e m42119a(String str) {
        C0018e c0018e = new C0018e(this);
        c0018e.f76a.add(str);
        return c0018e;
    }

    /* renamed from: c */
    public boolean m42117c(String str, int i) {
        if (i >= this.f76a.size()) {
            return false;
        }
        boolean z = i == this.f76a.size() - 1;
        String str2 = this.f76a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.f76a.size() + (-2) && m42118b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f76a.get(i + 1).equals(str)) {
            return i == this.f76a.size() + (-2) || (i == this.f76a.size() + (-3) && m42118b());
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f76a.size() - 1) {
                return false;
            }
            return this.f76a.get(i2).equals(str);
        }
    }

    /* renamed from: d */
    public InterfaceC0019f m42116d() {
        return this.f77b;
    }

    /* renamed from: e */
    public int m42115e(String str, int i) {
        if (m42114f(str)) {
            return 0;
        }
        if (this.f76a.get(i).equals("**")) {
            return (i != this.f76a.size() - 1 && this.f76a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: g */
    public boolean m42113g(String str, int i) {
        if (m42114f(str)) {
            return true;
        }
        if (i >= this.f76a.size()) {
            return false;
        }
        return this.f76a.get(i).equals(str) || this.f76a.get(i).equals("**") || this.f76a.get(i).equals("*");
    }

    /* renamed from: h */
    public boolean m42112h(String str, int i) {
        return "__container".equals(str) || i < this.f76a.size() - 1 || this.f76a.get(i).equals("**");
    }

    /* renamed from: i */
    public C0018e m42111i(InterfaceC0019f interfaceC0019f) {
        C0018e c0018e = new C0018e(this);
        c0018e.f77b = interfaceC0019f;
        return c0018e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f76a);
        sb2.append(",resolved=");
        sb2.append(this.f77b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private C0018e(C0018e c0018e) {
        this.f76a = new ArrayList(c0018e.f76a);
        this.f77b = c0018e.f77b;
    }
}
