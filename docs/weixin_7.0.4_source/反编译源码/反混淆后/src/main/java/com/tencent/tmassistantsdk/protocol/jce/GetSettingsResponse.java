package com.tencent.tmassistantsdk.protocol.jce;

import com.p123qq.taf.jce.JceDisplayer;
import com.p123qq.taf.jce.JceInputStream;
import com.p123qq.taf.jce.JceOutputStream;
import com.p123qq.taf.jce.JceStruct;
import com.p123qq.taf.jce.JceUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.sdk.platformtools.C4990ab;
import java.util.ArrayList;

public final class GetSettingsResponse extends JceStruct implements Cloneable {
    static final /* synthetic */ boolean $assertionsDisabled = (!GetSettingsResponse.class.desiredAssertionStatus());
    private static final String TAG = "GetSettingsResponse";
    static ArrayList<SettingsCfg> cache_settings;
    public int ret = 0;
    public ArrayList<SettingsCfg> settings = null;

    static {
        AppMethodBeat.m2504i(76061);
        AppMethodBeat.m2505o(76061);
    }

    public final String className() {
        return "jce.GetSettingsResponse";
    }

    public final String fullClassName() {
        return TAG;
    }

    public final int getRet() {
        return this.ret;
    }

    public final void setRet(int i) {
        this.ret = i;
    }

    public final ArrayList<SettingsCfg> getSettings() {
        return this.settings;
    }

    public final void setSettings(ArrayList<SettingsCfg> arrayList) {
        this.settings = arrayList;
    }

    public GetSettingsResponse(int i, ArrayList<SettingsCfg> arrayList) {
        this.ret = i;
        this.settings = arrayList;
    }

    public final boolean equals(Object obj) {
        AppMethodBeat.m2504i(76054);
        if (obj == null) {
            AppMethodBeat.m2505o(76054);
            return false;
        }
        GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
        if (JceUtil.equals(this.ret, getSettingsResponse.ret) && JceUtil.equals(this.settings, getSettingsResponse.settings)) {
            AppMethodBeat.m2505o(76054);
            return true;
        }
        AppMethodBeat.m2505o(76054);
        return false;
    }

    public final int hashCode() {
        AppMethodBeat.m2504i(76055);
        Exception exception;
        try {
            exception = new Exception("Need define key first!");
            AppMethodBeat.m2505o(76055);
            throw exception;
        } catch (Exception exception2) {
            C4990ab.printErrStackTrace(TAG, exception2, "", new Object[0]);
            AppMethodBeat.m2505o(76055);
            return 0;
        }
    }

    public final Object clone() {
        AppMethodBeat.m2504i(76056);
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            if (!$assertionsDisabled) {
                AssertionError assertionError = new AssertionError();
                AppMethodBeat.m2505o(76056);
                throw assertionError;
            }
        }
        AppMethodBeat.m2505o(76056);
        return obj;
    }

    public final void writeTo(JceOutputStream jceOutputStream) {
        AppMethodBeat.m2504i(76057);
        jceOutputStream.write(this.ret, 0);
        if (this.settings != null) {
            jceOutputStream.write(this.settings, 1);
        }
        AppMethodBeat.m2505o(76057);
    }

    public final void readFrom(JceInputStream jceInputStream) {
        AppMethodBeat.m2504i(76058);
        this.ret = jceInputStream.read(this.ret, 0, true);
        if (cache_settings == null) {
            cache_settings = new ArrayList();
            cache_settings.add(new SettingsCfg());
        }
        this.settings = (ArrayList) jceInputStream.read(cache_settings, 1, false);
        AppMethodBeat.m2505o(76058);
    }

    public final void display(StringBuilder stringBuilder, int i) {
        AppMethodBeat.m2504i(76059);
        JceDisplayer jceDisplayer = new JceDisplayer(stringBuilder, i);
        jceDisplayer.display(this.ret, "ret");
        jceDisplayer.display(this.settings, "settings");
        AppMethodBeat.m2505o(76059);
    }

    public final void displaySimple(StringBuilder stringBuilder, int i) {
        AppMethodBeat.m2504i(76060);
        JceDisplayer jceDisplayer = new JceDisplayer(stringBuilder, i);
        jceDisplayer.displaySimple(this.ret, true);
        jceDisplayer.displaySimple(this.settings, false);
        AppMethodBeat.m2505o(76060);
    }
}
