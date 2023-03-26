
package alquiler_abc.models;

public class Rent {
    
    //<editor-fold desc="Attributes">
        private String identification;
        private String plate;
        private String rentDate;
        private int rentalDays;
    //</editor-fold>
        
    //<editor-fold desc="Constructor">
        public Rent(String identification, String plate, String rentDate, int rentalDays) {
            this.identification = identification;
            this.plate = plate;
            this.rentDate = rentDate;
            this.rentalDays = rentalDays;
        }
    //</editor-fold>    
    
    //<editor-fold desc="Getters&Setters">

        public String getIdentification() {
            return identification;
        }

        public void setIdentification(String identification) {
            this.identification = identification;
        }

        public String getPlate() {
            return plate;
        }

        public void setPlate(String plate) {
            this.plate = plate;
        }
        
        public String getRentDate() {
            return rentDate;
        }

        public void setRentDate(String rentDate) {
            this.rentDate = rentDate;
        }

        public int getRentalDays() {
            return rentalDays;
        }

        public void setRentalDays(int rentalDays) {
            this.rentalDays = rentalDays;
        }
    //</editor-fold>

    
    
}
