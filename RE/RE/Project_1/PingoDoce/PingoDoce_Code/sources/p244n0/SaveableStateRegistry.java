package p244n0;

import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p181jd.Intrinsics;
import p244n0.InterfaceC7570f;
import p489zc.C13769l0;
import p489zc.C13780s;
import sd.StringsJVM;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n0.g */
/* loaded from: classes.dex */
public final class SaveableStateRegistry implements InterfaceC7570f {

    /* renamed from: a */
    private final InterfaceC6108l f20047a;

    /* renamed from: b */
    private final Map f20048b;

    /* renamed from: c */
    private final Map f20049c;

    /* compiled from: SaveableStateRegistry.kt */
    /* renamed from: n0.g$a */
    /* loaded from: classes.dex */
    public static final class C7572a implements InterfaceC7570f.InterfaceC7571a {

        /* renamed from: b */
        final /* synthetic */ String f20051b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC6097a f20052c;

        C7572a(String str, InterfaceC6097a interfaceC6097a) {
            this.f20051b = str;
            this.f20052c = interfaceC6097a;
        }

        /* renamed from: a */
        public void mo18123a() {
            List list = (List) SaveableStateRegistry.m18118e(SaveableStateRegistry.this).remove(this.f20051b);
            if (list != null) {
                list.remove(this.f20052c);
            }
            if (list == null || !(!list.isEmpty())) {
                return;
            }
            SaveableStateRegistry.m18118e(SaveableStateRegistry.this).put(this.f20051b, list);
        }
    }

    public SaveableStateRegistry(Map map, InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "canBeSaved");
        this.f20047a = interfaceC6108l;
        Map m322q = map == null ? null : C13769l0.m322q(map);
        this.f20048b = m322q == null ? new LinkedHashMap() : m322q;
        this.f20049c = new LinkedHashMap();
    }

    /* renamed from: e */
    public static final /* synthetic */ Map m18118e(SaveableStateRegistry saveableStateRegistry) {
        return saveableStateRegistry.f20049c;
    }

    /* renamed from: a */
    public boolean mo18127a(Object obj) {
        Intrinsics.isThisObjectNull(obj, "value");
        return ((Boolean) this.f20047a.mo9587d(obj)).booleanValue();
    }

    /* renamed from: b */
    public Map mo18126b() {
        Map m322q;
        ArrayList m201c;
        m322q = C13769l0.m322q(this.f20048b);
        for (Map.Entry entry : this.f20049c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object mo42214q = ((InterfaceC6097a) list.get(0)).mo42214q();
                if (mo42214q == null) {
                    continue;
                } else if (mo18127a(mo42214q)) {
                    m201c = C13780s.m201c(mo42214q);
                    m322q.put(str, m201c);
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    int i2 = i + 1;
                    Object mo42214q2 = ((InterfaceC6097a) list.get(i)).mo42214q();
                    if (mo42214q2 != null && !mo18127a(mo42214q2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(mo42214q2);
                    i = i2;
                }
                m322q.put(str, arrayList);
            }
        }
        return m322q;
    }

    /* renamed from: c */
    public InterfaceC7570f.InterfaceC7571a mo18125c(String str, InterfaceC6097a interfaceC6097a) {
        boolean m8942r;
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(interfaceC6097a, "valueProvider");
        m8942r = StringsJVM.m8942r(str);
        if (!m8942r) {
            Map map = this.f20049c;
            Object obj = map.get(str);
            if (obj == null) {
                obj = new ArrayList();
                map.put(str, obj);
            }
            ((List) obj).add(interfaceC6097a);
            return new C7572a(str, interfaceC6097a);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    /* renamed from: d */
    public Object mo18124d(String str) {
        Intrinsics.isThisObjectNull(str, "key");
        List list = (List) this.f20048b.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            this.f20048b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
