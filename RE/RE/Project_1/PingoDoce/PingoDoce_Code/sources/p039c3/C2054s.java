package p039c3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: c3.s */
/* loaded from: classes.dex */
public class C2054s {

    /* renamed from: b */
    public View f5960b;

    /* renamed from: a */
    public final Map<String, Object> f5959a = new HashMap();

    /* renamed from: c */
    final ArrayList<AbstractC2037m> f5961c = new ArrayList<>();

    @Deprecated
    public C2054s() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2054s) {
            C2054s c2054s = (C2054s) obj;
            return this.f5960b == c2054s.f5960b && this.f5959a.equals(c2054s.f5959a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f5960b.hashCode() * 31) + this.f5959a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5960b + "\n") + "    values:";
        for (String str2 : this.f5959a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5959a.get(str2) + "\n";
        }
        return str;
    }

    public C2054s(View view) {
        this.f5960b = view;
    }
}
