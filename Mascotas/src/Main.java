//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mascotas n1= new Mascotas("cactua",50,"ave",69,10);
        Mascotas n2 = new Mascotas("boa",10,"Reptil",125,2);
        Mascotas n3 = new Mascotas("Titi",15,"Mamifero",58,100);

        System.out.println(n1+"\n"+n2+"\n"+n3);
        double cantidad = n2.vender(50);
        if (cantidad == 0)
            System.out.println("No hay cantidad suficiente, actualmente contamos con "+n2.getStock());
        else
            System.out.println("Gracias por su compra, su valor a pagar es: "+cantidad);

        if (n1.comprar(2))
            System.out.println("Se ha incrementado al stock, ahora tiene "+n1.getStock()+" "+n1.getNombre());
        else
            System.out.println("El minimo a comprar es de 5 unidades");

        if (n1.getClase().equals("Reptil")&& n1.getVida() == 10 && n1.getPrecio() == 60) {
            System.out.println("El animal que busca es " + n1.getNombre());
        }else if(n2.getClase().equals("reptil") && n2.getVida() == 10 && n2.getPrecio() == 60)
            System.out.println("El animal que busca es " + n2.getNombre());
        else if(n3.getClase().equals("reptil") && n3.getVida() == 10 && n3.getPrecio() == 60)
            System.out.println("El animal que busca es " + n3.getNombre());
        else
            System.out.println("No tenemos ningun animal que coincida");
        if (n1.getVendidas() < n2.getVendidas() && n1.getVendidas() < n3.getVendidas())
            System.out.println("El animal mas vendido es "+n1.getNombre());
        else if (n2.getVendidas() < n1.getVendidas() && n2.getVendidas() < n3.getVendidas()) {
            System.out.println("El animal mas vendido es " + n2.getNombre());
        }else System.out.println("El animal mas vendido es " + n3.getNombre());
        }
    }

