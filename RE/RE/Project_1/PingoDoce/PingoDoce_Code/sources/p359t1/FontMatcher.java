package p359t1;

import java.util.ArrayList;
import java.util.Iterator;
import p181jd.Intrinsics;
import p359t1.FontWeight;
import p468yc.C13195u;
import p489zc.C13780s;

/* renamed from: t1.g */
/* loaded from: classes.dex */
public class FontMatcher {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* renamed from: a */
    public InterfaceC10362d m8140a(Iterable iterable, FontWeight fontWeight, int i) {
        int i2;
        Object obj;
        int m195i;
        InterfaceC10362d interfaceC10362d;
        Object obj2;
        int m195i2;
        int m195i3;
        Object obj3;
        int m195i4;
        int m195i5;
        Object obj4;
        int m195i6;
        int m195i7;
        Intrinsics.isThisObjectNull(iterable, "fontList");
        Intrinsics.isThisObjectNull(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = false;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10362d interfaceC10362d2 = (InterfaceC10362d) next;
            if (Intrinsics.equals(interfaceC10362d2.mo8153c(), fontWeight) && C10366h.m8133f(interfaceC10362d2.mo8154b(), i)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return (InterfaceC10362d) arrayList.get(0);
        }
        C13195u c13195u = C13195u.f34156a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : iterable) {
            if (C10366h.m8133f(((InterfaceC10362d) obj5).mo8154b(), i)) {
                arrayList2.add(obj5);
            }
        }
        if (!arrayList2.isEmpty()) {
            iterable = arrayList2;
        }
        FontWeight.C10370a c10370a = FontWeight.f26976x;
        InterfaceC10362d interfaceC10362d3 = null;
        if (fontWeight.m8107i(c10370a.m8101e()) < 0) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj6 : iterable) {
                if (((InterfaceC10362d) obj6).mo8153c().m8107i(fontWeight) <= 0) {
                    arrayList3.add(obj6);
                }
            }
            if (arrayList3.isEmpty()) {
                obj4 = null;
            } else {
                obj4 = arrayList3.get(0);
                FontWeight mo8153c = ((InterfaceC10362d) obj4).mo8153c();
                m195i6 = C13780s.m195i(arrayList3);
                if (1 <= m195i6) {
                    int i3 = 1;
                    while (true) {
                        int i4 = i3 + 1;
                        Object obj7 = arrayList3.get(i3);
                        FontWeight mo8153c2 = ((InterfaceC10362d) obj7).mo8153c();
                        if (mo8153c.compareTo(mo8153c2) < 0) {
                            obj4 = obj7;
                            mo8153c = mo8153c2;
                        }
                        if (i3 == m195i6) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            }
            interfaceC10362d = (InterfaceC10362d) obj4;
            if (interfaceC10362d == null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : iterable) {
                    if (((InterfaceC10362d) obj8).mo8153c().m8107i(fontWeight) > 0) {
                        arrayList4.add(obj8);
                    }
                }
                if (!arrayList4.isEmpty()) {
                    Object obj9 = arrayList4.get(0);
                    FontWeight mo8153c3 = ((InterfaceC10362d) obj9).mo8153c();
                    m195i7 = C13780s.m195i(arrayList4);
                    Object obj10 = obj9;
                    if (1 <= m195i7) {
                        while (true) {
                            int i5 = i2 + 1;
                            Object obj11 = arrayList4.get(i2);
                            FontWeight mo8153c4 = ((InterfaceC10362d) obj11).mo8153c();
                            obj9 = obj10;
                            if (mo8153c3.compareTo(mo8153c4) > 0) {
                                obj9 = obj11;
                                mo8153c3 = mo8153c4;
                            }
                            if (i2 == m195i7) {
                                break;
                            }
                            i2 = i5;
                            obj10 = obj9;
                        }
                    }
                    interfaceC10362d3 = obj9;
                }
                interfaceC10362d = interfaceC10362d3;
            }
        } else if (fontWeight.m8107i(c10370a.m8100f()) > 0) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj12 : iterable) {
                if (((InterfaceC10362d) obj12).mo8153c().m8107i(fontWeight) >= 0) {
                    arrayList5.add(obj12);
                }
            }
            if (arrayList5.isEmpty()) {
                obj3 = null;
            } else {
                obj3 = arrayList5.get(0);
                FontWeight mo8153c5 = ((InterfaceC10362d) obj3).mo8153c();
                m195i4 = C13780s.m195i(arrayList5);
                if (1 <= m195i4) {
                    int i6 = 1;
                    while (true) {
                        int i7 = i6 + 1;
                        Object obj13 = arrayList5.get(i6);
                        FontWeight mo8153c6 = ((InterfaceC10362d) obj13).mo8153c();
                        if (mo8153c5.compareTo(mo8153c6) > 0) {
                            obj3 = obj13;
                            mo8153c5 = mo8153c6;
                        }
                        if (i6 == m195i4) {
                            break;
                        }
                        i6 = i7;
                    }
                }
            }
            interfaceC10362d = (InterfaceC10362d) obj3;
            if (interfaceC10362d == null) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj14 : iterable) {
                    if (((InterfaceC10362d) obj14).mo8153c().m8107i(fontWeight) < 0) {
                        arrayList6.add(obj14);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    Object obj15 = arrayList6.get(0);
                    FontWeight mo8153c7 = ((InterfaceC10362d) obj15).mo8153c();
                    m195i5 = C13780s.m195i(arrayList6);
                    Object obj16 = obj15;
                    if (1 <= m195i5) {
                        while (true) {
                            int i8 = i2 + 1;
                            Object obj17 = arrayList6.get(i2);
                            FontWeight mo8153c8 = ((InterfaceC10362d) obj17).mo8153c();
                            obj15 = obj16;
                            if (mo8153c7.compareTo(mo8153c8) < 0) {
                                obj15 = obj17;
                                mo8153c7 = mo8153c8;
                            }
                            if (i2 == m195i5) {
                                break;
                            }
                            i2 = i8;
                            obj16 = obj15;
                        }
                    }
                    interfaceC10362d3 = obj15;
                }
                interfaceC10362d = interfaceC10362d3;
            }
        } else {
            ArrayList arrayList7 = new ArrayList();
            for (Object obj18 : iterable) {
                InterfaceC10362d interfaceC10362d4 = (InterfaceC10362d) obj18;
                if (interfaceC10362d4.mo8153c().m8107i(fontWeight) >= 0 && interfaceC10362d4.mo8153c().m8107i(FontWeight.f26976x.m8100f()) <= 0) {
                    arrayList7.add(obj18);
                }
            }
            if (arrayList7.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList7.get(0);
                FontWeight mo8153c9 = ((InterfaceC10362d) obj).mo8153c();
                m195i = C13780s.m195i(arrayList7);
                if (1 <= m195i) {
                    int i9 = 1;
                    while (true) {
                        int i10 = i9 + 1;
                        Object obj19 = arrayList7.get(i9);
                        FontWeight mo8153c10 = ((InterfaceC10362d) obj19).mo8153c();
                        if (mo8153c9.compareTo(mo8153c10) > 0) {
                            obj = obj19;
                            mo8153c9 = mo8153c10;
                        }
                        if (i9 == m195i) {
                            break;
                        }
                        i9 = i10;
                    }
                }
            }
            interfaceC10362d = (InterfaceC10362d) obj;
            if (interfaceC10362d == null) {
                ArrayList arrayList8 = new ArrayList();
                for (Object obj20 : iterable) {
                    if (((InterfaceC10362d) obj20).mo8153c().m8107i(fontWeight) < 0) {
                        arrayList8.add(obj20);
                    }
                }
                if (arrayList8.isEmpty()) {
                    obj2 = 0;
                } else {
                    obj2 = arrayList8.get(0);
                    FontWeight mo8153c11 = ((InterfaceC10362d) obj2).mo8153c();
                    m195i2 = C13780s.m195i(arrayList8);
                    if (1 <= m195i2) {
                        int i11 = 1;
                        Object obj21 = obj2;
                        while (true) {
                            int i12 = i11 + 1;
                            Object obj22 = arrayList8.get(i11);
                            FontWeight mo8153c12 = ((InterfaceC10362d) obj22).mo8153c();
                            obj2 = obj21;
                            if (mo8153c11.compareTo(mo8153c12) < 0) {
                                obj2 = obj22;
                                mo8153c11 = mo8153c12;
                            }
                            if (i11 == m195i2) {
                                break;
                            }
                            i11 = i12;
                            obj21 = obj2;
                        }
                    }
                }
                interfaceC10362d = obj2;
                if (interfaceC10362d == null) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj23 : iterable) {
                        if (((InterfaceC10362d) obj23).mo8153c().m8107i(FontWeight.f26976x.m8100f()) > 0) {
                            arrayList9.add(obj23);
                        }
                    }
                    if (!arrayList9.isEmpty()) {
                        Object obj24 = arrayList9.get(0);
                        FontWeight mo8153c13 = ((InterfaceC10362d) obj24).mo8153c();
                        m195i3 = C13780s.m195i(arrayList9);
                        Object obj25 = obj24;
                        if (1 <= m195i3) {
                            while (true) {
                                int i13 = i2 + 1;
                                Object obj26 = arrayList9.get(i2);
                                FontWeight mo8153c14 = ((InterfaceC10362d) obj26).mo8153c();
                                obj24 = obj25;
                                if (mo8153c13.compareTo(mo8153c14) > 0) {
                                    obj24 = obj26;
                                    mo8153c13 = mo8153c14;
                                }
                                if (i2 == m195i3) {
                                    break;
                                }
                                i2 = i13;
                                obj25 = obj24;
                            }
                        }
                        interfaceC10362d3 = obj24;
                    }
                    interfaceC10362d = interfaceC10362d3;
                }
            }
        }
        if (interfaceC10362d != null) {
            return interfaceC10362d;
        }
        throw new IllegalStateException("Cannot match any font");
    }

    /* renamed from: b */
    public InterfaceC10362d m8139b(FontFamily fontFamily, FontWeight fontWeight, int i) {
        Intrinsics.isThisObjectNull(fontFamily, "fontFamily");
        Intrinsics.isThisObjectNull(fontWeight, "fontWeight");
        return m8140a(fontFamily.m8145p(), fontWeight, i);
    }
}
