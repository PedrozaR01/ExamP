/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author Roberto Antonio Pedroza Fernández
 */
public class AluInf {
//En esta clase se tienen las variables, todas son privadas
    private String nombre;
    private String apellido;
    private String gender;
    private String direccion;
    private int NCasa;
    private String email;
    private int DiaNa;
    private int MesNa;
    private int AñoNa;
    private String Carrera;
    private String Semestre;
    private int NCont;
//En las siguentes líneas se encuentran pares de métodos get and set de cada variable
    //Los códigos se obtuvieron con la opción insert code de Source
    //Excepto por un método get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNCasa() {
        return NCasa;
    }

    public void setNCasa(int NCasa) {
        this.NCasa = NCasa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiaNa() {
        return DiaNa;
    }

    public void setDiaNa(int DiaNa) {
        this.DiaNa = DiaNa;
    }

    public String getMesNa() { //Este método utiliza el valor del set de la misma variable
        String Mes = null;     //Pero en base a esa valor y una estructura if else
        String Enero = ("Enero"); //se le asigna una variable String a otra variable string vacía
        String Febrero = ("Febrero"); //Hay 12 variables con un mes asignado
        String Marzo = ("Marzo"); //Y casa variable se le será asignada al string vacío
        String Abril = ("Abril");//En base al número del método set
        String Mayo = ("Mayo");//Una vez que se asigna un String al string vacío
        String Junio = ("Junio");//Se pone en Return el String con un nuevo
        String Julio = ("Julio");//Valor asignado para así regresar un mes en carácteres
        String Agosto = ("Agosto");//Dependiendo del número que se capturó
        String Septiembre = ("Septiembre");
        String Octubre = ("Octubre");
        String Noviembre = ("Noviembre");
        String Diciembre = ("Diciembre");
        if (MesNa == 1){
            Mes = Enero; }
            else { if(MesNa==2){
                Mes = Febrero;
            } else {
                if(MesNa==3){
                    Mes = Marzo;
                }
                else{
                    if(MesNa==4){
                        Mes = Abril;
                    }
                    else{
                        if(MesNa==5){
                            Mes = Mayo;
                        }
                        else{
                            if(MesNa==6){
                                Mes = Junio;
                            }
                            else{
                                if(MesNa==7){
                                    Mes = Julio;
                                }
                                else{
                                    if(MesNa==8){
                                        Mes = Agosto;
                                    }
                                    else{
                                        if(MesNa==9){
                                         Mes = Septiembre;   
                                        }
                                        else{
                                            if(MesNa==10){
                                                Mes = Octubre;
                                            }
                                            else{
                                                if(MesNa==11){
                                                    Mes = Noviembre;
                                                }
                                                else{
                                                    if(MesNa==12){
                                                        Mes = Diciembre;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
                    
                    } 
        
       return Mes;
        
    }

    public void setMesNa(int MesNa) {
        this.MesNa = MesNa;
    }

    public int getAñoNa() {
        return AñoNa;
    }

    public void setAñoNa(int AñoNa) {
        this.AñoNa = AñoNa;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public int getNCont() {
        return NCont;
    }

    public void setNCont(int NCont) {
        this.NCont = NCont;
    }
    
}
