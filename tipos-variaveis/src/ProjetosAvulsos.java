import java.util.Scanner;

public class ProjetosAvulsos {   

public static void exibirAlimentos()
{
    Scanner sc = new Scanner(System.in);

    int alimentos, frutas, carnes, verduras;

    System.out.println("1 - Frutas \n 2 - Carnes \n 3 - Verduras ");
    alimentos = sc.nextInt();

    frutas = 0;
    carnes = 0;
    verduras = 0;
    
    while (alimentos != 4)
    {
        
        if(alimentos  == 1){
            while(frutas != 4){
                    System.out.println("1 - Maçã \n 2 - Pera \n 3 - limão");
                    frutas = sc.nextInt();
                }
            }

        else if(alimentos == 2)
        {
            System.out.println("1 - alcatra \n 2 - patinho \n 3 - linguica");
            carnes = sc.nextInt();
        }  
        
        else
        {
            System.out.println("1 - alface \n 2 - tomate \n 3 - rabanete");
            verduras = sc.nextInt();
        }
    } 
    
}

 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
    
    int quantidade;
    int somaQuantidade;
    String nomeProduto;
    int categoria;

    System.out.println(" -- // Qual categoria de Produto você deseja? -- //");
    System.out.println(" 1 - Alimentício \n 2 - Limpeza \n 3 - Higiene \n 4 - Finalizar");
    categoria = sc.nextInt();

    while (categoria != 4)
    {
        if(categoria == 1)
            {
                exibirAlimentos();
            }

         System.out.println(" 1 - Alimentício \n 2 - Limpeza \n 3 - Higiene \n 4 - Finalizar");
    }

}

}


