package p133h7;

import android.os.IBinder;
import com.google.android.gms.common.internal.C2597i;
import java.lang.reflect.Field;
import p133h7.InterfaceC5867b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: h7.d */
/* loaded from: classes.dex */
public final class BinderC5870d<T> extends InterfaceC5867b.AbstractBinderC5868a {

    /* renamed from: a */
    private final T f16303a;

    private BinderC5870d(T t) {
        this.f16303a = t;
    }

    /* renamed from: H */
    public static <T> T m22836H(InterfaceC5867b interfaceC5867b) {
        if (interfaceC5867b instanceof BinderC5870d) {
            return ((BinderC5870d) interfaceC5867b).f16303a;
        }
        IBinder asBinder = interfaceC5867b.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            C2597i.m33076j(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        int length = declaredFields.length;
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("Unexpected number of IObjectWrapper declared fields: ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: S1 */
    public static <T> InterfaceC5867b m22835S1(T t) {
        return new BinderC5870d(t);
    }
}
