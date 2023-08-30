package TDE.src;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        int input;

        do{

            System.out.println("----------------------------------------------------");
            System.out.println("Digite a opcao desejada:");
            System.out.println("1- atividade 1 (pilha)");
            System.out.println("2- atividade 2 (fila)");
            System.out.println("3- atividade 3.1 (merge com listas encadeadas)");
            System.out.println("4- atividade 3.2 (merge com arrays)");
            System.out.println("0- Sair");
            System.out.println("----------------------------------------------------");
            input = sc.nextInt();
            pilha pilha = new pilha();
            Fila fila = new Fila();
            switch (input){
                case 0:
                    System.out.println("Desenvolvido por Leonardo Klein e Eduardo Moura.");
                    break;
                        //---------------------------- PILHA --------------------------
                case 1:
                    int input1;
                    do {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Atividade de Pilha  -  Escolha uma opcao:");
                        System.out.println(" 1 - Adicionar elemento a pilha");
                        System.out.println(" 2 - Remover elemento");
                        System.out.println(" 3 - Voltar ao menu inicial");
                        System.out.println("----------------------------------------------------");
                        input1 = sc.nextInt();

                        switch (input1){
                            case 1:
                                System.out.println("Digite o valor a ser adicionado ao topo da pilha:");
                                int num = sc.nextInt();
                                pilha.add(num);
                                System.out.println("Pilha abaixo");
                                System.out.println("--------");
                                pilha.printList();
                                System.out.println("--------");
                                System.out.println(num + " foi adicionado a pilha e agora eh o topo");
                                break;
                            case 2:
                                pilha.remove();
                                pilha.printList();
                                break;
                        }
                    }while (input1 != 3);
                    break;
                            //---------------------------- FILA --------------------------
                case 2:
                    do {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Atividade de Fila  -  Escolha uma opcao:");
                        System.out.println(" 1 - Adicionar elemento a Fila");
                        System.out.println(" 2 - Remover elemento");
                        System.out.println(" 3 - Voltar ao menu inicial");
                        System.out.println("----------------------------------------------------");
                        input1 = sc.nextInt();


                        switch (input1){
                            case 1:
                                System.out.println("Digite o valor a ser adicionado ao final da lista:");
                                int num = sc.nextInt();
                                fila.add(num);
                                fila.printList();
                                System.out.println(num + " foi adicionado a lista");
                                break;
                            case 2:
                                fila.remove();
                                fila.printList();
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                                break;

                        }
                    }while (input1 != 3);
                    break;
                    // ---------------------------- merge com listas encadeadas (dinamico) ------------
                case 3:
                    do {
                        System.out.println("----------------------------------------------------");
                        System.out.println("Atividade 3.1 (Merge com lista encadeada):");
                        System.out.println(" 1 - Ver exemplo (filas do enunciado) ");
                        System.out.println(" 2 - Adicionar filas manualmente (sempre ordenadas)");
                        System.out.println(" 3 - Sair ");
                        System.out.println("----------------------------------------------------");
                        input1 = sc.nextInt();

                        Fila fila1 = new Fila();
                        Fila fila2 = new Fila();
                        Fila fila3 = new Fila();
                        switch (input1){
                            case 1:

                                // adicionando elementos a fila A
                                fila1.add(12);
                                fila1.add(35);
                                fila1.add(52);
                                fila1.add(64);

                                // adicionando elementos a fila B
                                fila2.add(05);
                                fila2.add(15);
                                fila2.add(23);
                                fila2.add(55);
                                fila2.add(75);

                                fila3 = Fila.merge(fila1,fila2);

                                System.out.print("Primeira fila:"); fila1.printList();
                                System.out.print("Segunda fila:"); fila2.printList();
                                System.out.print("Fila resultante:"); fila3.printList();
                                break;
                            case 2:
                                while (input1 != 4){
                                    System.out.print("Primeira fila:"); fila1.printList();
                                    System.out.print("Segunda fila:"); fila2.printList();
                                    System.out.println("O que deseja fazer?");
                                    System.out.println(" 1 - Adicionar elemento");
                                    System.out.println(" 2 - Remover elemento");
                                    System.out.println(" 3 - Realizar merge");
                                    System.out.println(" 4 - Voltar");
                                    input1 = sc.nextInt();
                                    switch (input1){
                                        case 1:
                                            System.out.println("Digite 1 para adicionar a fila 1:");
                                            System.out.println("Digite 2 para adicionar a fila 2:");
                                            int choose = sc.nextInt();
                                            if (choose == 1){
                                                System.out.println("Digite o valor que deseja adicionar a fila 1:");
                                                int num = sc.nextInt();
                                                fila1.add(num);
                                            } else if (choose == 2) {
                                                System.out.println("Digite o valor que deseja adicionar a fila 2:");
                                                int num = sc.nextInt();
                                                fila2.add(num);
                                            }else {
                                                System.out.println("Opcao invalida");
                                            }break;
                                        case 2:
                                            System.out.println("Digite 1 para remover da fila 1:");
                                            System.out.println("Digite 2 para remover da fila 2:");
                                            choose = sc.nextInt();
                                            if (choose == 1){
                                                System.out.println("Removendo da fila 1");
                                                fila2.remove();
                                            } else if (choose == 2) {
                                                System.out.println("Removendo da fila 2");
                                                fila2.remove();
                                            }else {
                                                System.out.println("Opcao invalida");
                                            }break;
                                        case 3:
                                            fila3 = Fila.merge(fila1,fila2);
                                            System.out.print("Primeira fila:"); fila1.printList();
                                            System.out.print("Segunda fila:"); fila2.printList();
                                            System.out.print("Fila resultante:"); fila3.printList();
                                            break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                                break;

                        }
                    }while (input1 != 3);
                    break;
                    // ---------------------------- merge com arrays (estatico) ------------
                case 4:
                    int[] vetorA = {12,35,52,64}, vetorB = {5,15,23,55,75};
                    int[] k = main.merge(vetorA, vetorB);
                    System.out.println("Vet");
                    do {
                        System.out.println();
                        System.out.println("----------------------------------------------------");
                        System.out.println("Atividade 3.2 - merge com arrays - Escolha uma opcao:");
                        System.out.println(" 1 -  Mostrar vetores (enunciado)");
                        System.out.println(" 2 -  Realizar merge");
                        System.out.println(" 3 -  Sair");
                        System.out.println("----------------------------------------------------");
                        input1 = sc.nextInt();

                        switch (input1){
                            case 1:
                                System.out.println("Vetor A: {12,35,52,64} ");
                                System.out.println("vetor B: {5,15,23,55,75}");
                                break;
                            case 2:
                                System.out.println("");
                                System.out.println("Vetor mesclado:");
                                System.out.print("{");
                                for (int i = 0; i < k.length; i++) {
                                    System.out.print(k[i] + " ");
                                }
                                System.out.print("}");
                                break;
                            default:
                                System.out.println("Opcao invalida.");
                                break;

                        }
                    }while (input1 != 3);
                    break;
            }
        }while(input != 0);


}






    public static int[] merge(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    int i = 0, j = 0, pos = 0;
        while(i < a.length || j < b.length) {

            if(i< a.length && j < b.length){

                if(a[i] < b[j]){
                    c[pos] = a[i];
                    i++;
                }else{
                   c[pos] = b[j];
                    j++;
                }
            }else if(i == a.length){
                c[pos] = b[j];
                j++;

            }else if(j == b.length){
                c[pos] = a[i];
                i++;
            }
            pos++;
        }

        return c;
    }




}
