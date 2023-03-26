package alquiler_abc.models;

public class Vehicule {
    
    //<editor-fold desc="Attributes">
        private String mark;
        private String line;
        private String plate;
        private String state;    
    //</editor-fold>
    
    //<editor-fold desc="Constructor">
        public Vehicule(String mark, String line, String plate, String state){
            this.mark = mark;
            this.line = line;
            this.plate = plate;
            this.state = state;
        }
    //</editor-fold>
    
    //<editor-fold desc="Getters&Setters">
        public String getMark() {
            return mark;
        }

        public void setMark(String mark) {
            this.mark = mark;
        }

        public String getLine() {
            return line;
        }

        public void setLine(String line) {
            this.line = line;
        }

        public String getPlate() {
            return plate;
        }

        public void setPlate(String plate) {
            this.plate = plate;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    //</editor-fold>
           
}
