package p061da;

/* renamed from: da.d */
/* loaded from: classes.dex */
public @interface InterfaceC4759d {

    /* compiled from: Protobuf.java */
    /* renamed from: da.d$a */
    /* loaded from: classes.dex */
    public enum EnumC4760a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    EnumC4760a intEncoding() default EnumC4760a.DEFAULT;

    int tag();
}
