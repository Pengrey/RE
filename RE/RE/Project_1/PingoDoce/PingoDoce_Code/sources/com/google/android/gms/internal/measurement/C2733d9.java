package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.d9 */
/* loaded from: classes.dex */
final class C2733d9 extends AbstractC2765f9 {

    /* renamed from: c */
    private static final Class f7710c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2733d9(C2717c9 c2717c9) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2765f9
    /* renamed from: a */
    public final void mo32703a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) C2703bb.m32846k(obj, j);
        if (list instanceof InterfaceC2701b9) {
            unmodifiableList = ((InterfaceC2701b9) list).mo31893d();
        } else if (f7710c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC3079z9) && (list instanceof InterfaceC3033w8)) {
                InterfaceC3033w8 interfaceC3033w8 = (InterfaceC3033w8) list;
                if (interfaceC3033w8.mo31907a()) {
                    interfaceC3033w8.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        C2703bb.m32833x(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC2765f9
    /* renamed from: b */
    public final void mo32702b(Object obj, Object obj2, long j) {
        C2685a9 c2685a9;
        List list = (List) C2703bb.m32846k(obj2, j);
        int size = list.size();
        List list2 = (List) C2703bb.m32846k(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof InterfaceC2701b9) {
                list2 = new C2685a9(size);
            } else if ((list2 instanceof InterfaceC3079z9) && (list2 instanceof InterfaceC3033w8)) {
                list2 = ((InterfaceC3033w8) list2).mo31906k(size);
            } else {
                list2 = new ArrayList(size);
            }
            C2703bb.m32833x(obj, j, list2);
        } else {
            if (f7710c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                C2703bb.m32833x(obj, j, arrayList);
                c2685a9 = arrayList;
            } else if (list2 instanceof C3035wa) {
                C2685a9 c2685a92 = new C2685a9(list2.size() + size);
                c2685a92.addAll(c2685a92.size(), (C3035wa) list2);
                C2703bb.m32833x(obj, j, c2685a92);
                c2685a9 = c2685a92;
            } else if ((list2 instanceof InterfaceC3079z9) && (list2 instanceof InterfaceC3033w8)) {
                InterfaceC3033w8 interfaceC3033w8 = (InterfaceC3033w8) list2;
                if (!interfaceC3033w8.mo31907a()) {
                    list2 = interfaceC3033w8.mo31906k(list2.size() + size);
                    C2703bb.m32833x(obj, j, list2);
                }
            }
            list2 = c2685a9;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        C2703bb.m32833x(obj, j, list);
    }
}
