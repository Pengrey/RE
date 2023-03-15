package org.threeten.p283bp.chrono;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* renamed from: org.threeten.bp.chrono.u */
/* loaded from: classes2.dex */
final class C8207u implements Externalizable {

    /* renamed from: w */
    private byte f21354w;

    /* renamed from: x */
    private Object f21355x;

    public C8207u() {
    }

    /* renamed from: a */
    private static Object m16238a(byte b, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b) {
            case 1:
                return C8199p.m16273J(objectInput);
            case 2:
                return C8201q.m16261l(objectInput);
            case 3:
                return C8192k.m16301l0(objectInput);
            case 4:
                return EnumC8194l.readExternal(objectInput);
            case 5:
                return C8204s.m16245J(objectInput);
            case 6:
                return EnumC8206t.readExternal(objectInput);
            case 7:
                return C8210w.m16217J(objectInput);
            case 8:
                return EnumC8212x.readExternal(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return AbstractC8188h.m16345n(objectInput);
            case 12:
                return C8180d.m16366G(objectInput);
            case 13:
                return C8186g.m16356A(objectInput);
        }
    }

    /* renamed from: b */
    private static void m16237b(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((C8199p) obj).m16267P(objectOutput);
                return;
            case 2:
                ((C8201q) obj).m16258o(objectOutput);
                return;
            case 3:
                ((C8192k) obj).m16297p0(objectOutput);
                return;
            case 4:
                ((EnumC8194l) obj).writeExternal(objectOutput);
                return;
            case 5:
                ((C8204s) obj).m16241N(objectOutput);
                return;
            case 6:
                ((EnumC8206t) obj).writeExternal(objectOutput);
                return;
            case 7:
                ((C8210w) obj).m16213N(objectOutput);
                return;
            case 8:
                ((EnumC8212x) obj).writeExternal(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((AbstractC8188h) obj).m16343p(objectOutput);
                return;
            case 12:
                ((C8180d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((C8186g) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.f21355x;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.f21354w = readByte;
        this.f21355x = m16238a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m16237b(this.f21354w, this.f21355x, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8207u(byte b, Object obj) {
        this.f21354w = b;
        this.f21355x = obj;
    }
}
