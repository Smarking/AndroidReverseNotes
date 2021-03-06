package org.xwalk.core.extension;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class BindingObject {
    private String TAG = "BindingObject";
    protected MessageHandler mHandler = new MessageHandler();
    protected ExtensionInstanceHelper mInstanceHelper;
    protected String mObjectId;

    public BindingObject() {
        AppMethodBeat.i(86069);
        AppMethodBeat.o(86069);
    }

    public Object handleMessage(MessageInfo messageInfo) {
        AppMethodBeat.i(86070);
        Object handleMessage = this.mHandler.handleMessage(messageInfo);
        AppMethodBeat.o(86070);
        return handleMessage;
    }

    public void initBindingInfo(String str, ExtensionInstanceHelper extensionInstanceHelper) {
        this.mObjectId = str;
        this.mInstanceHelper = extensionInstanceHelper;
    }

    public void onJsDestroyed() {
    }

    public void onJsBound() {
    }

    public void onStart() {
    }

    public void onResume() {
    }

    public void onPause() {
    }

    public void onStop() {
    }

    public void onDestroy() {
    }
}
