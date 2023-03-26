
package alquiler_abc.models;
public class Client {
 
    //<editor-fold desc="Attributes">
        private String identification;
        private String names;
        private String lastNames;
        private String phone;
        private String address;
    //</editor-fold>
    
    //<editor-fold desc="Constructor">
        public Client(String identification, String names, String lastNames, String phone, String address){
            this.identification = identification;
            this.names = names;
            this.lastNames = lastNames;
            this.phone = phone;
            this.address = address;
        }
    //</editor-fold>
    
    //<editor-fold desc="Getters&Setters">
   
        public String getIdentification() {
            return identification;
        }

        public void setIdentification(String identification) {
            this.identification = identification;
        }

        public String getNames() {
            return names;
        }

        public void setNames(String names) {
            this.names = names;
        }

        public String getLastNames() {
            return lastNames;
        }

        public void setLastNames(String lastNames) {
            this.lastNames = lastNames;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
       
    //</editor-fold>
}
