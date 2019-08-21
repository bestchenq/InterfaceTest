package com.ubt.myapplication.model;

import java.util.List;

/**
 * Created by chenqiang on 2019/8/21.
 */
public class AccountBean {

    /**
     * ds : [{"_id":{"$oid":"537be97ddd184af2cca40af2"},"phone":"0913868866","password":"12345","name":"Nguyễn Thành Nhân","sex":"male","dob":"19790203","address":"185/7/1/3C Ngô Chí Quốc, Phường Bình Chiểu, Quận Thủ Đức","image":"cruzr/Nhan.jpg","bank_account":"0012345678","uid":"123","balance":"5000000"}]
     * gh : 25
     * cn : true
     */

    private int gh;
    private boolean cn;
    private List<DsBean> ds;

    public int getGh() {
        return gh;
    }

    public void setGh(int gh) {
        this.gh = gh;
    }

    public boolean isCn() {
        return cn;
    }

    public void setCn(boolean cn) {
        this.cn = cn;
    }

    public List<DsBean> getDs() {
        return ds;
    }

    public void setDs(List<DsBean> ds) {
        this.ds = ds;
    }

    public static class DsBean {
        /**
         * _id : {"$oid":"537be97ddd184af2cca40af2"}
         * phone : 0913868866
         * password : 12345
         * name : Nguyễn Thành Nhân
         * sex : male
         * dob : 19790203
         * address : 185/7/1/3C Ngô Chí Quốc, Phường Bình Chiểu, Quận Thủ Đức
         * image : cruzr/Nhan.jpg
         * bank_account : 0012345678
         * uid : 123
         * balance : 5000000
         */

        private IdBean _id;
        private String phone;
        private String password;
        private String name;
        private String sex;
        private String dob;
        private String address;
        private String image;
        private String bank_account;
        private String uid;
        private String balance;

        public IdBean get_id() {
            return _id;
        }

        public void set_id(IdBean _id) {
            this._id = _id;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBank_account() {
            return bank_account;
        }

        public void setBank_account(String bank_account) {
            this.bank_account = bank_account;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public static class IdBean {
            /**
             * $oid : 537be97ddd184af2cca40af2
             */

            private String $oid;

            public String get$oid() {
                return $oid;
            }

            public void set$oid(String $oid) {
                this.$oid = $oid;
            }
        }
    }
}
