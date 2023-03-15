package p075e4;

import p130h4.C5848d;

/* renamed from: e4.c */
/* loaded from: classes.dex */
public enum EnumC4980c {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    EnumC4980c(String str) {
        this.extension = str;
    }

    public static EnumC4980c forFile(String str) {
        EnumC4980c[] values;
        for (EnumC4980c enumC4980c : values()) {
            if (str.endsWith(enumC4980c.extension)) {
                return enumC4980c;
            }
        }
        C5848d.m22929c("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }
}
