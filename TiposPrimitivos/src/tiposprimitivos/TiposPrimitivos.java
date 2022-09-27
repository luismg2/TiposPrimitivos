/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/*
Enteros:
    -byte: 8 bits (-128 a 127) | Byte.MIN_VALUE - Byte.MAX_VALUE
    -short: 16 bits (-32768 a 32767) |  Short.MIN_VALUE - Short.MAX_VALUE
    -int:
    -long
        
Decimales:
    -float:
    -double
Caracter:
    -char:
    
*/
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Byte enteroByte=5;
        short enteroshort=7;
        int enteroint=8;
        long enterolong=10;
        System.out.println("\tENTEROS");
        System.out.println("\t=======\n");
        System.out.println("enteroByte = "+enteroByte);
        System.out.println("Valor minimo del tipo Byte: "+Byte.MIN_VALUE);
        System.out.println("Valor maximo del tipo Byte: "+Byte.MAX_VALUE+"\n");
        System.out.println("enteroshort = "+enteroshort);
        System.out.println("Valor minimo del tipo short: "+Short.MIN_VALUE);
        System.out.println("Valor maximo del tipo short: "+Short.MAX_VALUE+"\n");
        System.out.println("enteroint = "+enteroint);
        System.out.println("Valor minimo del tipo int: "+Integer.MIN_VALUE);
        System.out.println("Valor maximo del tipo int: "+Integer.MAX_VALUE+"\n");
        System.out.println("enterolong = "+enterolong);
        System.out.println("Valor minimo del tipo long: "+Long.MIN_VALUE);
        System.out.println("Valor maximo del tipo long: "+Long.MAX_VALUE+"\n");
        System.out.println("\tDECIMALES");
        System.out.println("\t=========\n");
        float decimalfloat=2;
        double decimaldouble=2.0;
        System.out.println("decimalfloat = "+decimalfloat);
        System.out.println("Valor minimo del tipo float: "+Float.MIN_VALUE);
        System.out.println("Valor maximo del tipo float: "+Float.MAX_VALUE+"\n");
        System.out.println("decimaldouble = "+decimaldouble);
        System.out.println("Valor minimo del tipo double: "+Double.MIN_VALUE);
        System.out.println("Valor maximo del tipo double: "+Double.MAX_VALUE+"\n");
        System.out.println("\tCARACTER");
        System.out.println("\t========\n");
        char caracterchar;
        caracterchar='h';
        System.out.println("caracterchar = "+caracterchar);
        System.out.println("Valor minimo del tipo char: "+Character.MIN_VALUE);
        System.out.println("Valor maximo del tipo char: "+Character.MAX_VALUE+"\n");
    }
    
}
