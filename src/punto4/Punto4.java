
package punto4;

import javax.swing.JOptionPane;


public class Punto4 {

    
    public static void main(String[] args) {
        Punto4 ob= new Punto4();
        ob.metodo();
    }
    public void metodo(){
         String pre;
        
        Reptiles lagarto = new Reptiles();
        Reptiles Tortugas = new Reptiles();
        Reptiles Camaleon = new Reptiles();
        
        Aves Aguila = new Aves();
        Aves Buho = new Aves();
        Aves Cigueña = new Aves();
        
        Mamiferos Tigre = new Mamiferos();
        Mamiferos Oso = new Mamiferos();
        Mamiferos Perro = new Mamiferos();
        
        lagarto.setReproduccion("ovipara");
        lagarto.setEscamas("No cuentan con glándulas dermales y dicha superficie es esencialmente seca");
        lagarto.setSistemacir("En la anatomía y fisiología de los lagartos el corazón está compuesto por tres cámaras (2 aurículas y 1 ventrículo");
        
        Tortugas.setReproduccion("Ovipara");
        Tortugas.setEscamas("No cuentan con glándulas dermales y dicha superficie es esencialmente seca");
        Tortugas.setSistemacir("Es doble, tiene un circuito mayor y uno menor.");
        
        Camaleon.setReproduccion("Oviparos  o ovoviviparas");
        Camaleon.setEscamas("No cuentan con glándulas dermales y dicha superficie es esencialmente seca<");
        Camaleon.setSistemacir("Es doble, tiene un circuito mayor y uno menor");
        
        Aguila.setReproduccion("Oviparos");
        Aguila.setAlas("Amplias alas que les facilitan el vuelo");
        Aguila.setEstomago("Estomago doble");
        
        Buho.setReproduccion("Oviparos");
        Buho.setAlas("Tienen cinco diferentes tipos de plumas que les permiten estar protegidos, sentir su entorno, y volar sin hacer ruido");
        Buho.setEstomago("Estomago doble");
        
        Cigueña.setReproduccion("Oviparos");
        Cigueña.setAlas("su plumaje es mayoritariamente blanco mezclado con negro (en las alas y las patas principalmente) ");
        Cigueña.setEstomago("Estomago doble");
        
        Tigre.setReproduccion("Placentarios");
        Tigre.setPelaje("tienen un pelaje naranja o leonado, un área intermedia y ventral blanquecina y las rayas varían en tono desde marrón oscuro hasta el negro");
        Tigre.setApareamiento("Poligamos");
        
        Oso.setReproduccion(" Placentarios");
        Oso.setPelaje("el pelo es hueco y transparente y lo utilizan para protegerse del frío");
        Oso.setApareamiento("Estos solo se aparean con los osos que tienen afecto");
        
        Perro.setReproduccion("Placentarios");
        Perro.setPelaje("está compuesto por queratina, una sustancia con estructura proteica que crece de los folículos situados en la capa profunda de la piel");
        Perro.setApareamiento("Poligamos");
        
        do{
        int opc= Integer.parseInt(JOptionPane.showInputDialog("1.lagarto \n 2. Tortuga  \n 3.Camaleon  \n 4.Aguila  \n 5.Buho  \n 6.Cigueña  \n 7.Tigre  \n 8.Oso  \n 9.Perro"));
        if(opc==1){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ lagarto.getReproduccion());
            JOptionPane.showMessageDialog(null, "ESCAMAS: "+ lagarto.getEscamas());
            JOptionPane.showMessageDialog(null, "SISTEMA CIRCULATORIO: "+ lagarto.getSistemacir());
        }
        if(opc==2){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Tortugas.getReproduccion());
            JOptionPane.showMessageDialog(null, "ESCAMAS: "+ Tortugas.getEscamas());
            JOptionPane.showMessageDialog(null, "SISTEMA CIRCULATORIO: "+ Tortugas.getSistemacir());
        }
        
        if(opc==3){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Camaleon.getReproduccion());
            JOptionPane.showMessageDialog(null, "ESCAMAS: "+ Camaleon.getEscamas());
            JOptionPane.showMessageDialog(null, "SISTEMA CIRCULATORIO: "+ Camaleon.getSistemacir());
        }
        
         if(opc==4){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Aguila.getReproduccion());
            JOptionPane.showMessageDialog(null, "ALAS: "+ Aguila.getAlas());
            JOptionPane.showMessageDialog(null, "ESTOMAGO: "+ Aguila.getEstomago());
        }
         
         if(opc==5){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Buho.getReproduccion());
            JOptionPane.showMessageDialog(null, "ALAS: "+ Buho.getAlas());
            JOptionPane.showMessageDialog(null, "ESTOMAGO: "+ Buho.getEstomago());
        }
         
         if(opc==6){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Cigueña.getReproduccion());
            JOptionPane.showMessageDialog(null, "ALAS: "+ Cigueña.getAlas());
            JOptionPane.showMessageDialog(null, "ESTOMAGO: "+ Cigueña.getEstomago());
        }
         
         if(opc==7){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Tigre.getReproduccion());
            JOptionPane.showMessageDialog(null, "PELAJE: "+ Tigre.getPelaje());
            JOptionPane.showMessageDialog(null, "APAREAMIENTO: "+ Tigre.getApareamiento());
        }
         
         if(opc==8){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Oso.getReproduccion());
            JOptionPane.showMessageDialog(null, "PELAJE: "+ Oso.getPelaje());
            JOptionPane.showMessageDialog(null, "APAREAMIENTO: "+ Oso.getApareamiento());
        }
         
         if(opc==9){
          
            
            JOptionPane.showMessageDialog(null, "REPRODUCCION: "+ Perro.getReproduccion());
            JOptionPane.showMessageDialog(null, "PELAJE: "+ Perro.getPelaje());
            JOptionPane.showMessageDialog(null, "APAREAMIENTO: "+ Perro.getApareamiento());
        }
         pre= JOptionPane.showInputDialog("otro");
        }while(pre.equals("si"));
    }
    
}
