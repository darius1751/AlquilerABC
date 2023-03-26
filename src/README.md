# Bienvenidos a la documentacion de Alquiler ABC

## Packages

1. alquiler_abc.models
2. alquiler_abc.views
3. alquiler_abc_main

#

## alquiler_abc_main

Esta carpeta solo tiene el Main.java

```java
package alquiler_abc_main;


import alquiler_abc.models.Client;
import alquiler_abc.models.Rent;
import alquiler_abc.models.Vehicule;
import alquiler_abc.views.MainMenu;
import java.util.ArrayList;


public class Main {
    public static ArrayList<Vehicule> vehicules;
    public static ArrayList<Client> clients;
    public static ArrayList<Rent> rents;
    public static void main(String[] args){
        initialValues();
        new MainMenu().setVisible(true);
    }
    private static void initialValues(){
        vehicules = new ArrayList();
        clients = new ArrayList();
        rents = new ArrayList();
    }
}

```
> Se tiene la ```class``` **Main**, donde se tiene el metodo ```main```, para iniciar el proyecto, la clase **Main** crea 3 ArrayList (vehicules, clients, rents), para guardar la informacion y poder compartirla en las ```views```.

* ```initialValues()``` se encarga de inicializar los ArrayList

#

## alquiler_abc.models

> Esta carpeta tiene todas las clases *modelo* que se > necesitaran para abstraer los datos con **POO.**

 **Nota:**
>
> Los "comentarios" \<editor-fold> \</editor-fold>, sirven para poder organizar el codigo en *secciones retraibles*
>

* Client.java
  
    ***Atributos***
    ```java
        private String identification;
        private String names;
        private String lastNames;
        private String phone;
        private String address;
    ```   
    ***Constructores***
    ```java
        public Client(
            String identification,
            String names,
            String lastNames,
            String phone,
            String address
        ){
            this.identification = identification;
            this.names = names;
            this.lastNames = lastNames;
            this.phone = phone;
            this.address = address;
        }
    ```
    ***Getters&Setters***
    ```java
        public String getIdentification() {
            return identification;
        }

        public void setIdentification(
            String identification
        ) {
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
    ```            
    #

* Rent.java
    
    ***Atributos***
    ```java
        private String identification;
        private String plate;
        private String rentDate;
        private int rentalDays;
    ```   
    ***Constructores***
    ```java
        public Rent(
            String identification,
            String plate,
            String rentDate,
            int rentalDays
        ) {
            this.identification = identification;
            this.plate = plate;
            this.rentDate = rentDate;
            this.rentalDays = rentalDays;
        }
    ```
    ***Getters&Setters***
    ```java
        public String getIdentification() {
            return identification;
        }

        public void setIdentification(
            String identification
        ) {
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
    ```

    #

* Vehicule.java

    ***Atributos***
    ```java
        private String mark;
        private String line;
        private String plate;
        private String state;
    ```   
    ***Constructores***
    ```java
        public Vehicule(
            String mark,
            String line,
            String plate,
            String state
        ){
            this.mark = mark;
            this.line = line;
            this.plate = plate;
            this.state = state;
        }
    ```
    ***Getters&Setters***
    ```java
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
    ```

#

## alquiler_abc.views

```openMenu(MouseEvent evt)``` este evento se usa en los todas las vistas, ~~MainMenu~~ para volver al menu Principal

* ## MainMenu.java ##
    
    Esta clase es el formulario que se encarga de  preguntar al usuario que opcion desea selecciona.

    > ```handleAcceptActionPerformed(ActionEvent evt)``` 
    <br/>
    Este metodo se escucha el click del boton "Aceptar", llamar a ```handleAccept```.
    

    > ```handleAccept()```
    <br/>
    Este metodo se encarga de Validar la option seleccionada y enviarlo a la ventana correspondiente.

    > ```send(KeyEvent evt)```
    <br/>
    Este metodo se encarga de escuchar cuando se le de **Enter** en donde se escribe la opcion, para llamar a ```handleAccept```.

*  ## AddVehicule.java ##
    
    Esta clase es el formulario que se encarga de agregar vehiculos.

    > ```handleAddActionPerformed(ActionEvent evt)``` 
    <br/>
    Este metodo se escucha el click del boton "Agregar", para luego validar: 
    >> Invoca a ```validateFieldsEmpty```
    >>
    >> Invoca a ```existPlate()```
    
    
    > ```validateFieldsEmpty()```
    <br/>
    Este metodo se encarga de Validar que lo campos no se encuentren vacios.
    >> Si algun campo se encuentra vacio, mostrara: "Error en ```nameAttribute```, por favor ingrese un valor."

    > ```existPlate(String plate)```
    <br/>
    Este metodo se encarga de validar si existe la placa.

* ## AddClient.java ##
    
    Esta clase es el formulario que se encarga de agregar clientes.

    > ```handleAddClient(ActionEvent evt)``` 
    <br/>
    Este metodo se escucha el click del boton "Registrar", para luego validar: 
    >> Invoca a ```validateFieldsEmpty```
    >>
    >> Invoca a ```validatePhone```
    >>
    >> Invoca a ```existIdentification```
    
    
    > ```validateFieldsEmpty()```
    <br/>
    Este metodo se encarga de Validar que lo campos no se encuentren vacios.
    >> Si algun campo se encuentra vacio, mostrara: "Error en ```nameAttribute```, por favor ingrese un valor."

    > ```existIdentification(String identification)```
    <br/>
    Este metodo se encarga de validar si existe el numero de identificacion.
    
    > ```validatePhone(String phone)```
    <br/>
    Este metodo se encarga de validar que el telefono tenga de 7 a 10 digitos.

* ## RegisterRent.java ##
    
    Esta clase es el formulario que se encarga de crear un alquiler.

    > ```addVehiculeActionPerformed(ActionEvent evt)``` 
    <br/>
    Este metodo escucha el click del boton "Registrar Automovil", el cual abre el formulario ```AddVehicule```
    
    > ```addClientActionPerformed(ActionEvent evt)``` 
    <br/>
    Este metodo escucha el click del boton "Registrar Cliente", el cual abre el formulario ```AddClient```
    
    > ```registerRentActionPerformed(ActionEvent evt)``` 
    <br/>
    Este metodo escucha el click del boton "Registrar Alquiler"
    >> Invoca a ```existClient```
    >>
    >> Invoca a ```isAvailableVehicule```
    >>
    >> Invoca a ```validateRentalDays```
    >> 
    >> Invoca a ```disableVehicule```

    > ```validateFieldsEmpty()```
    <br/>
    Este metodo se encarga de Validar que lo campos no se encuentren vacios.
    >> Si algun campo se encuentra vacio, mostrara: "Error en ```nameAttribute```, por favor ingrese un valor."

    > ```existClient(String identification)```
    <br/>
    Este metodo se encarga de validar si existe el numero de identificacion.
    
    > ```isAvailableVehicule(String plate)```
    <br/>
    Este metodo se encarga de validar si existe la placa y tambien de si esta Disponible para alquilar.

    > ```disableVehicule(String plate)```  
    <br/>
    Este metodo se encarga de cambiar el estado del automovil a "Alquilado"

    > ```validateRentalDays()```
    <br/>
    Este metodo se encarga de validar que los dias a rentar ```rentalDays```, sea un entero positivo.
    ---
* ## FindsViews ##
    
    Estas clase se encarga de mostrar todos los registrados del Modelo correspondiente.
    >```initializeTable(WindowEvent evt)```
    <br/>
    Escucha el evento de "windowsOpened", para cuando se este abriendo la ventana, solicite todos los registros del modelo correspondiente y llene la tabla.

* ## FindRent
    Esta clase se encarga de Buscar las rentas de un cliente en concreto.

    > ```findActionPerformed(ActionEvent evt)```
    <br/>
    Este metodo escucha el click al boton "Buscar", para luego invocar a ```handleFind```
    
    > ```handleFind()```
    <br/>
    Este metodo filtra por medio del Numero de identificacion, todas las rentas, borra los datos de la tabla y agrega las rentas del usuario con ese Numero de identificacion.

    > ```findActionPerformed()```
    <br/>
    Este metodo esta pendiente de que se presione **Enter**, para invocar a ```handleFind```