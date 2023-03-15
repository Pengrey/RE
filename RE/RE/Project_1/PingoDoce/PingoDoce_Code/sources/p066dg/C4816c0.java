package p066dg;

import gg.C5682w;
import java.text.SimpleDateFormat;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;
import vg.UserService;

/* renamed from: dg.c0 */
/* loaded from: classes2.dex */
public final class C4816c0 implements InterfaceC11614c<UserProfileAgent> {

    /* renamed from: a */
    private final InterfaceC12341a<UserService> f13185a;

    /* renamed from: b */
    private final InterfaceC12341a<C5682w> f13186b;

    /* renamed from: c */
    private final InterfaceC12341a<SimpleDateFormat> f13187c;

    /* renamed from: d */
    private final InterfaceC12341a<SimpleDateFormat> f13188d;

    public C4816c0(InterfaceC12341a<UserService> interfaceC12341a, InterfaceC12341a<C5682w> interfaceC12341a2, InterfaceC12341a<SimpleDateFormat> interfaceC12341a3, InterfaceC12341a<SimpleDateFormat> interfaceC12341a4) {
        this.f13185a = interfaceC12341a;
        this.f13186b = interfaceC12341a2;
        this.f13187c = interfaceC12341a3;
        this.f13188d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C4816c0 m26544a(InterfaceC12341a<UserService> interfaceC12341a, InterfaceC12341a<C5682w> interfaceC12341a2, InterfaceC12341a<SimpleDateFormat> interfaceC12341a3, InterfaceC12341a<SimpleDateFormat> interfaceC12341a4) {
        return new C4816c0(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static UserProfileAgent m26542c(UserService userService, C5682w c5682w, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
        return new UserProfileAgent(userService, c5682w, simpleDateFormat, simpleDateFormat2);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public UserProfileAgent mo42226get() {
        return m26542c(this.f13185a.mo42226get(), this.f13186b.mo42226get(), this.f13187c.mo42226get(), this.f13188d.mo42226get());
    }
}
