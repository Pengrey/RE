package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2683a7;
import com.google.android.gms.internal.measurement.AbstractC2699b7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b7 */
/* loaded from: classes.dex */
public abstract class AbstractC2699b7<MessageType extends AbstractC2699b7<MessageType, BuilderType>, BuilderType extends AbstractC2683a7<MessageType, BuilderType>> implements InterfaceC2973s9 {
    protected int zzb = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static void m32866i(Iterable iterable, List list) {
        C3048x8.m31825e(iterable);
        if (iterable instanceof InterfaceC2701b9) {
            List mo31894c = ((InterfaceC2701b9) iterable).mo31894c();
            InterfaceC2701b9 interfaceC2701b9 = (InterfaceC2701b9) list;
            int size = list.size();
            for (Object obj : mo31894c) {
                if (obj == null) {
                    int size2 = interfaceC2701b9.size();
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size2 - size);
                    sb2.append(" is null.");
                    String sb3 = sb2.toString();
                    int size3 = interfaceC2701b9.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        interfaceC2701b9.remove(size3);
                    }
                    throw new NullPointerException(sb3);
                } else if (obj instanceof AbstractC2955r7) {
                    interfaceC2701b9.mo31892j((AbstractC2955r7) obj);
                } else {
                    interfaceC2701b9.add((String) obj);
                }
            }
        } else if (!(iterable instanceof InterfaceC3079z9)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    int size5 = list.size();
                    StringBuilder sb4 = new StringBuilder(37);
                    sb4.append("Element at index ");
                    sb4.append(size5 - size4);
                    sb4.append(" is null.");
                    String sb5 = sb4.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb5);
                }
                list.add(obj2);
            }
        } else {
            list.addAll(iterable);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2973s9
    /* renamed from: d */
    public final AbstractC2955r7 mo32111d() {
        try {
            int mo32109f = mo32109f();
            AbstractC2955r7 abstractC2955r7 = AbstractC2955r7.f7969x;
            byte[] bArr = new byte[mo32109f];
            AbstractC3062y7 m31796c = AbstractC3062y7.m31796c(bArr);
            mo32110e(m31796c);
            m31796c.m31795d();
            return new C2923p7(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo32191g() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32190j(int i) {
        throw null;
    }

    /* renamed from: k */
    public final byte[] m32865k() {
        try {
            byte[] bArr = new byte[mo32109f()];
            AbstractC3062y7 m31796c = AbstractC3062y7.m31796c(bArr);
            mo32110e(m31796c);
            m31796c.m31795d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e);
        }
    }
}
