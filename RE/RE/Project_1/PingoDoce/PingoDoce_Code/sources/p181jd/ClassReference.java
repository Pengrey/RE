package p181jd;

import id.InterfaceC6097a;
import id.InterfaceC6098b;
import id.InterfaceC6099c;
import id.InterfaceC6100d;
import id.InterfaceC6101e;
import id.InterfaceC6102f;
import id.InterfaceC6103g;
import id.InterfaceC6104h;
import id.InterfaceC6105i;
import id.InterfaceC6106j;
import id.InterfaceC6107k;
import id.InterfaceC6108l;
import id.InterfaceC6109m;
import id.InterfaceC6110n;
import id.InterfaceC6111o;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import id.InterfaceC6114r;
import id.InterfaceC6115s;
import id.InterfaceC6116t;
import id.InterfaceC6117u;
import id.InterfaceC6118v;
import id.InterfaceC6119w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p139hd.JvmClassMapping;
import p314qd.InterfaceC9717b;
import p468yc.C13182l;
import p468yc.C13191r;
import p489zc.C13769l0;
import p489zc.C13780s;
import p489zc.Iterables;
import p489zc.MapsJVM;
import sd.C10171u;

/* renamed from: jd.d */
/* loaded from: classes2.dex */
public final class ClassReference implements InterfaceC9717b, InterfaceC6428c {

    /* renamed from: b */
    public static final C6430a f17516b = new C6430a(null);

    /* renamed from: c */
    private static final Map f17517c;

    /* renamed from: d */
    private static final HashMap f17518d;

    /* renamed from: e */
    private static final HashMap f17519e;

    /* renamed from: f */
    private static final HashMap f17520f;

    /* renamed from: g */
    private static final Map f17521g;

    /* renamed from: a */
    private final Class f17522a;

    /* compiled from: ClassReference.kt */
    /* renamed from: jd.d$a */
    /* loaded from: classes2.dex */
    public static final class C6430a {
        private C6430a() {
        }

        public /* synthetic */ C6430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m20955a(Class cls) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            String m8933A0;
            String m8932B0;
            String m8932B02;
            Intrinsics.isThisObjectNull(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        Intrinsics.checkIfNull(simpleName, "name");
                        m8932B02 = C10171u.m8932B0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (m8932B02 != null) {
                            return m8932B02;
                        }
                    }
                    if (cls.getEnclosingConstructor() == null) {
                        Intrinsics.checkIfNull(simpleName, "name");
                        m8933A0 = C10171u.m8933A0(simpleName, '$', null, 2, null);
                        return m8933A0;
                    }
                    Intrinsics.checkIfNull(simpleName, "name");
                    m8932B0 = C10171u.m8932B0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    return m8932B0;
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) ClassReference.m20956c().get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) ClassReference.m20956c().get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        List m194j;
        int m186r;
        Map m326m;
        int m339b;
        String m8929D0;
        String m8929D02;
        int i = 0;
        m194j = C13780s.m194j(InterfaceC6097a.class, InterfaceC6108l.class, InterfaceC6112p.class, InterfaceC6113q.class, InterfaceC6114r.class, InterfaceC6115s.class, InterfaceC6116t.class, InterfaceC6117u.class, InterfaceC6118v.class, InterfaceC6119w.class, InterfaceC6098b.class, InterfaceC6099c.class, InterfaceC6100d.class, InterfaceC6101e.class, InterfaceC6102f.class, InterfaceC6103g.class, InterfaceC6104h.class, InterfaceC6105i.class, InterfaceC6106j.class, InterfaceC6107k.class, InterfaceC6109m.class, InterfaceC6110n.class, InterfaceC6111o.class);
        m186r = Iterables.m186r(m194j, 10);
        ArrayList arrayList = new ArrayList(m186r);
        for (Object obj : m194j) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            arrayList.add(C13191r.m1447a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        m326m = C13769l0.m326m(arrayList);
        f17517c = m326m;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f17518d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f17519e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkIfNull(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            Intrinsics.checkIfNull(str, "kotlinName");
            m8929D02 = C10171u.m8929D0(str, '.', null, 2, null);
            sb2.append(m8929D02);
            sb2.append("CompanionObject");
            C13182l m1447a = C13191r.m1447a(sb2.toString(), str + ".Companion");
            hashMap3.put(m1447a.m1460c(), m1447a.m1459d());
        }
        for (Map.Entry entry : f17517c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + intValue);
        }
        f17520f = hashMap3;
        m339b = MapsJVM.m339b(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(m339b);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            m8929D0 = C10171u.m8929D0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, m8929D0);
        }
        f17521g = linkedHashMap;
    }

    public ClassReference(Class cls) {
        Intrinsics.isThisObjectNull(cls, "jClass");
        this.f17522a = cls;
    }

    /* renamed from: c */
    public static final /* synthetic */ Map m20956c() {
        return f17521g;
    }

    /* renamed from: a */
    public String mo10119a() {
        return f17516b.m20955a(mo20958b());
    }

    /* renamed from: b */
    public Class mo20958b() {
        return this.f17522a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ClassReference) && Intrinsics.equals(JvmClassMapping.m22766b(this), JvmClassMapping.m22766b((InterfaceC9717b) obj));
    }

    public int hashCode() {
        return JvmClassMapping.m22766b(this).hashCode();
    }

    public String toString() {
        return mo20958b().toString() + " (Kotlin reflection is not available)";
    }
}
