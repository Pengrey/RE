package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.u9 */
/* loaded from: classes.dex */
public final class C3004u9 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m32002a(InterfaceC2973s9 interfaceC2973s9, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        m31999d(interfaceC2973s9, sb2, 0);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static final void m32001b(StringBuilder sb2, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                m32001b(sb2, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m32001b(sb2, i, str, entry);
            }
        } else {
            sb2.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(C2926pa.m32202a(AbstractC2955r7.m32144x((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2955r7) {
                sb2.append(": \"");
                sb2.append(C2926pa.m32202a((AbstractC2955r7) obj));
                sb2.append('\"');
            } else if (obj instanceof AbstractC2940q8) {
                sb2.append(" {");
                m31999d((AbstractC2940q8) obj, sb2, i + 2);
                sb2.append("\n");
                while (i2 < i) {
                    sb2.append(' ');
                    i2++;
                }
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                m32001b(sb2, i4, "key", entry2.getKey());
                m32001b(sb2, i4, "value", entry2.getValue());
                sb2.append("\n");
                while (i2 < i) {
                    sb2.append(' ');
                    i2++;
                }
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m32000c(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    private static void m31999d(InterfaceC2973s9 interfaceC2973s9, StringBuilder sb2, int i) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC2973s9.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m32001b(sb2, i, m32000c(concat), AbstractC2940q8.m32189l(method2, interfaceC2973s9, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m32001b(sb2, i, m32000c(concat2), AbstractC2940q8.m32189l(method3, interfaceC2973s9, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object m32189l = AbstractC2940q8.m32189l(method4, interfaceC2973s9, new Object[0]);
                    if (method5 == null) {
                        if (m32189l instanceof Boolean) {
                            if (((Boolean) m32189l).booleanValue()) {
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                        } else if (m32189l instanceof Integer) {
                            if (((Integer) m32189l).intValue() != 0) {
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                        } else if (m32189l instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) m32189l).floatValue()) != 0) {
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                        } else if (m32189l instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) m32189l).doubleValue()) != 0) {
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                        } else {
                            if (m32189l instanceof String) {
                                equals = m32189l.equals(BuildConfig.VERSION_NAME);
                            } else if (m32189l instanceof AbstractC2955r7) {
                                equals = m32189l.equals(AbstractC2955r7.f7969x);
                            } else if (m32189l instanceof InterfaceC2973s9) {
                                if (m32189l != ((InterfaceC2973s9) m32189l).mo32062c()) {
                                    m32001b(sb2, i, m32000c(concat3), m32189l);
                                }
                            } else {
                                if ((m32189l instanceof Enum) && ((Enum) m32189l).ordinal() == 0) {
                                }
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                            if (!equals) {
                                m32001b(sb2, i, m32000c(concat3), m32189l);
                            }
                        }
                    } else if (((Boolean) AbstractC2940q8.m32189l(method5, interfaceC2973s9, new Object[0])).booleanValue()) {
                        m32001b(sb2, i, m32000c(concat3), m32189l);
                    }
                }
            }
        }
        if (!(interfaceC2973s9 instanceof AbstractC2908o8)) {
            C2974sa c2974sa = ((AbstractC2940q8) interfaceC2973s9).zzc;
            if (c2974sa != null) {
                c2974sa.m32102g(sb2, i);
                return;
            }
            return;
        }
        AbstractC2908o8 abstractC2908o8 = (AbstractC2908o8) interfaceC2973s9;
        throw null;
    }
}
