package com.tencent.pb.common.b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;

public final class g {
    private WifiInfo Amk = null;
    private int Aml = 1;
    private NetworkInfo ebY = null;

    public final synchronized boolean Il() {
        boolean z;
        WifiInfo wifiInfo = null;
        synchronized (this) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) d.sZj.getSystemService("connectivity");
                if (connectivityManager == null) {
                    c.w("NetworkChangeMgr", "can't get ConnectivityManager");
                    this.Aml = 1;
                    this.Amk = null;
                    this.ebY = null;
                    z = true;
                } else {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null) {
                        this.Aml = 1;
                        this.Amk = null;
                        this.ebY = null;
                        z = true;
                    } else {
                        int i;
                        c.d("NetworkChangeMgr", "NetworkChangeMgr ", activeNetworkInfo);
                        if (!activeNetworkInfo.isConnected()) {
                            i = 1;
                        } else if (activeNetworkInfo.getType() == 1) {
                            i = 2;
                            wifiInfo = ((WifiManager) d.sZj.getSystemService("wifi")).getConnectionInfo();
                        } else {
                            i = 3;
                        }
                        if (i == this.Aml) {
                            if (i == 1) {
                                z = false;
                            } else if (i == 2) {
                                if (wifiInfo != null && this.Amk != null && this.Amk.getBSSID().equals(wifiInfo.getBSSID()) && this.Amk.getSSID().equals(wifiInfo.getSSID()) && this.Amk.getNetworkId() == wifiInfo.getNetworkId()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                            } else if (this.ebY != null && this.ebY.getExtraInfo() != null && activeNetworkInfo.getExtraInfo() != null && this.ebY.getExtraInfo().equals(activeNetworkInfo.getExtraInfo()) && this.ebY.getSubtype() == activeNetworkInfo.getSubtype() && this.ebY.getType() == activeNetworkInfo.getType()) {
                                z = false;
                            } else if (this.ebY != null && this.ebY.getExtraInfo() == null && activeNetworkInfo.getExtraInfo() == null && this.ebY.getSubtype() == activeNetworkInfo.getSubtype() && this.ebY.getType() == activeNetworkInfo.getType()) {
                                z = false;
                            }
                            this.Aml = i;
                            this.Amk = wifiInfo;
                            this.ebY = activeNetworkInfo;
                        }
                        z = true;
                        this.Aml = i;
                        this.Amk = wifiInfo;
                        this.ebY = activeNetworkInfo;
                    }
                }
            } catch (Exception e) {
                c.w("NetworkChangeMgr", e);
                this.Aml = 1;
                this.Amk = null;
                this.ebY = null;
                z = true;
            }
        }
        return z;
    }
}
