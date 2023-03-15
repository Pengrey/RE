package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4398a = versionedParcel.m35598p(audioAttributesImplBase.f4398a, 1);
        audioAttributesImplBase.f4399b = versionedParcel.m35598p(audioAttributesImplBase.f4399b, 2);
        audioAttributesImplBase.f4400c = versionedParcel.m35598p(audioAttributesImplBase.f4400c, 3);
        audioAttributesImplBase.f4401d = versionedParcel.m35598p(audioAttributesImplBase.f4401d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m35593x(false, false);
        versionedParcel.m35613F(audioAttributesImplBase.f4398a, 1);
        versionedParcel.m35613F(audioAttributesImplBase.f4399b, 2);
        versionedParcel.m35613F(audioAttributesImplBase.f4400c, 3);
        versionedParcel.m35613F(audioAttributesImplBase.f4401d, 4);
    }
}
