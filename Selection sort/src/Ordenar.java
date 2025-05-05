public class Ordenar {

    public void Ordenar(int[] vet){
        for(int i = 0; i < vet.length - 1; i++){
        int menor = i;
            for(int j = 1 + i; j < vet.length; j++){
                if(vet[j] < vet[menor]){
                    menor = j;
                }
            }
            int aux = vet[menor];
            vet[menor] = vet[i];
            vet[i] = aux;
        }
        printar(vet);
    }

    public void printar(int[] vet){
        for(int i : vet){
            System.out.println(i);
        }
    }



}
