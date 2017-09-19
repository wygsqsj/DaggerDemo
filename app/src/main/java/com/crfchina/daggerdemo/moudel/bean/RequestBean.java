package com.crfchina.daggerdemo.moudel.bean;

/**
 * Created by xwh on 2017/5/3.
 */
public class RequestBean {

    private String method;
    private BizBean biz;
    private MainBean main;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public BizBean getBiz() {
        return biz;
    }

    public void setBiz(BizBean biz) {
        this.biz = biz;
    }

    public MainBean getMain() {
        return main;
    }

    public void setMain(MainBean main) {
        this.main = main;
    }

    public static class BizBean {
        private String version;
        private String deviceType;
        private String deviceId;
        private String deviceName;
        private String deviceToken;
        private String deviceOs;
        private String ipType;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(String deviceType) {
            this.deviceType = deviceType;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getDeviceToken() {
            return deviceToken;
        }

        public void setDeviceToken(String deviceToken) {
            this.deviceToken = deviceToken;
        }

        public String getDeviceOs() {
            return deviceOs;
        }

        public void setDeviceOs(String deviceOs) {
            this.deviceOs = deviceOs;
        }

        public String getIpType() {
            return ipType;
        }

        public void setIpType(String ipType) {
            this.ipType = ipType;
        }
    }

    public static class MainBean {
    }
}
