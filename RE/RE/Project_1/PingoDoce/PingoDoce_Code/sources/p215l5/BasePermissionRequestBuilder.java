package p215l5;

import p181jd.Intrinsics;
import p265o5.InterfaceC8020b;
import p307q5.InterfaceC9666h;

/* renamed from: l5.a */
/* loaded from: classes.dex */
public abstract class BasePermissionRequestBuilder implements InterfaceC6983c {

    /* renamed from: a */
    private String[] f18599a;

    /* renamed from: b */
    private InterfaceC9666h f18600b;

    /* renamed from: a */
    public InterfaceC6983c mo19655a(InterfaceC9666h interfaceC9666h) {
        Intrinsics.isThisObjectNull(interfaceC9666h, "runtimeHandlerProvider");
        this.f18600b = interfaceC9666h;
        return this;
    }

    /* renamed from: b */
    protected abstract InterfaceC8020b m19658b(String[] strArr, InterfaceC9666h interfaceC9666h);

    public InterfaceC8020b build() {
        String[] strArr = this.f18599a;
        if (strArr != null) {
            InterfaceC9666h interfaceC9666h = this.f18600b;
            if (interfaceC9666h != null) {
                return m19658b(strArr, interfaceC9666h);
            }
            throw new IllegalArgumentException("A runtime handler is necessary to request the permissions.");
        }
        throw new IllegalArgumentException("The permissions names are necessary.");
    }

    /* renamed from: c */
    public InterfaceC6983c m19657c(String str, String... strArr) {
        Intrinsics.isThisObjectNull(str, "firstPermission");
        Intrinsics.isThisObjectNull(strArr, "otherPermissions");
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        int i = 0;
        while (i < length) {
            strArr2[i] = i == 0 ? str : strArr[i - 1];
            i++;
        }
        this.f18599a = strArr2;
        return this;
    }
}
