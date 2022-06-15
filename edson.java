import java.util.Scanner;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        int opcao;
        int x1,y1,r1,x2,y2,r2,x3,y3,r3;
        int h,bme,bma,r5;
        int raio, altura,ab,h2,ab2,h3,a2,re;
        double n=3.1,v1,v2,v3,v4,v5;
        double y4 = 3.1416,x4,r4;
        float a,b,c,delta,sqrtdelta,raiz1,raiz2;
        int af=1,bf=0,aux;
        int quant;
        int num, fat = 1;
        int cont = 1;
        String texto;
        String aux2 = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite entre as opçoes: ");
        System.out.println("1- Algoritmo para calcular a área de cinco sólidos geométricos; ");
        System.out.println("2- Algoritmo para calcular o volume de cinco sólidos geométricos;");
        System.out.println("3- Algoritmo para calcular as raízes de uma equação válida do segundo grau;");
        System.out.println("4- Algoritmo para calcular a seqüência de Fibonacci até um determinado número;");
        System.out.println("5- Algoritmo para calcular o fatorial de um número, o número é digitado pelo usuário;");
        System.out.println("6- Algoritmo que verifica se uma palavra é um palíndromo.");
        System.out.println("-------------------------------------------------------------------------------------------");

        opcao = teclado.nextInt();

        switch(opcao){

            case 1:
                System.out.println("Digite x para base e y para a altura do quadrado:");
                x1 = teclado.nextInt();
                y1 = teclado.nextInt();
                
                r1 = x1*y1;

                System.out.println("A area do quadrado é: "+r1);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite x para base e y para a altura do retangulo:");
                x2 = teclado.nextInt();
                y2 = teclado.nextInt();
                
                r2 = x2*y2;

                System.out.println("A area do retangulo é: "+r2);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite x para base e y para a altura do triangulo:");
                x3 = teclado.nextInt();
                y3 = teclado.nextInt();
                
                r3 = (x3*y3)/2;

                System.out.println("A area do triangulo é: "+r3);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite o valor do Pi e o raio do circulo:");
                x4 = teclado.nextDouble();
                y4 = teclado.nextDouble();
                
                r4 = y4*(x4*x4);

                System.out.println("O raio do circulo é: "+r4);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite a altura, a base menor e a base menor do trapezio: ");
                h = teclado.nextInt();
                bme = teclado.nextInt();
                bma = teclado.nextInt();

                r5 = (h*(bme+bma))/2;

                System.out.println("A area do trapezio é: "+r5);

            break;

            case 2:

                System.out.println("Digite o raio, e a altura do ciclindro");
                raio = teclado.nextInt();
                altura = teclado.nextInt();

                v1=n*(raio*raio)*altura;

                System.out.println("O volume do cilindro é: "+v1);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("A area da base, e a altura do cone");
                ab = teclado.nextInt();
                h2 = teclado.nextInt();

                v2=(ab*h2)/3;

                System.out.println("O volume do cone é: "+v2);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("A area da base, e a altura do prisma");
                ab2 = teclado.nextInt();
                h3 = teclado.nextInt();

                v3=ab2*h3;

                System.out.println("O volume do prisma é: "+v3);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite a area do cubo");
                a2 = teclado.nextInt();

                v4=a2*a2*a2;

                System.out.println("O volume do cubo é: "+v4);

                System.out.println("--------------------------------------------------------------------------");

                System.out.println("Digite o raio da esfera: ");
                re = teclado.nextInt();

                v5=(1.33*y4)*(re*re*re);

                System.out.println("O volume do cubo é: "+v5);

                System.out.println("--------------------------------------------------------------------------");

            break;

            case 3:

                System.out.println("Equação do 2o grau: ax² + bx + cx = 0");
                System.out.print("Entre com o valor de a: ");
                a = teclado.nextFloat();
                System.out.print("Entre com o valor de b: ");
                b = teclado.nextFloat();
                System.out.print("Entre com o valor de c: ");
                c = teclado.nextFloat();

                if(a != 0){
                        delta = (b*b) - (4*a*c);
                        sqrtdelta = (float)Math.sqrt(delta);
                    
                        if(delta >=0){
                            raiz1 = ((-1)*b + sqrtdelta)/(2*a);
                            raiz2 = ((-1)*b - sqrtdelta)/(2*a);
                            System.out.printf("Raízes: %.2f e %.2f", raiz1, raiz2);
                        }
                        else{
                            delta = -delta;
                            sqrtdelta = (float)Math.sqrt(delta);
                            System.out.printf("Raíz 1: %.2f + i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                            System.out.printf("Raíz 2: %.2f - i.%.2f\n", (-b)/(2*a), (sqrtdelta)/(2*a));
                            
                        }   
                    }
                        else{
                            System.out.println("Coeficiente 'a' inválido. Não é uma equação do 2o grau");
                        }

            break;

            case 4:

                    System.out.println("Quantos numeros da sequencia de Fibonacci deseja ser impresso? ");
                    quant = teclado.nextInt();

                    for(int i=0; i<quant; i++){
                    System.out.println(af);
                    aux=af;
                    af=af+bf;
                    bf=aux;

                    }
            break;

            case 5:

                do{
                    System.out.println("Digite um nº");
                    num = teclado.nextInt();
                    
                    for(int i = 1;i <= num; i++){
                        fat = fat * i;
                    }
                    
                    System.out.println("!" + num + " = " + fat);
                    cont++;
                    
                }while(cont < 2);

            break;

            case 6:
            
            
            System.out.println("Digite a palavra:");

            texto=teclado.next();

            System.out.print("A Palavra: " +texto);

            aux2 = new StringBuffer(texto).reverse().toString();

            if (texto.equals(aux2)) {

            System.out.println("  é palindrome");

            } else {

            System.out.println(" Não é Palindrome");
            
            }
                    
            break;
        }
    }
}
